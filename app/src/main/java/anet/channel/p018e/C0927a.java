package anet.channel.p018e;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.agoo.common.AgooConstants;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: anet.channel.e.a */
/* loaded from: classes.dex */
public class C0927a {

    /* renamed from: a */
    private static b f3857a;

    /* renamed from: b */
    private static String f3858b;

    /* renamed from: f */
    private static SharedPreferences f3862f;

    /* renamed from: c */
    private static AtomicBoolean f3859c = new AtomicBoolean(false);

    /* renamed from: d */
    private static AtomicBoolean f3860d = new AtomicBoolean(false);

    /* renamed from: e */
    private static long f3861e = 21600000;

    /* renamed from: g */
    private static IStrategyFilter f3863g = new C0928b();

    /* renamed from: h */
    private static AtomicInteger f3864h = new AtomicInteger(1);

    /* renamed from: i */
    private static IStrategyListener f3865i = new C0929c();

    /* renamed from: j */
    private static NetworkStatusHelper.INetworkStatusChangeListener f3866j = new C0930d();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anet.channel.e.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        long f3867a;

        /* renamed from: b */
        boolean f3868b;

        private a() {
        }

        /* synthetic */ a(C0928b c0928b) {
            this();
        }
    }

    /* renamed from: b */
    public static boolean m4561b() {
        b bVar = f3857a;
        if (bVar != null) {
            return bVar.m4571b(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()));
        }
        return false;
    }

    /* renamed from: a */
    public static void m4558a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (!AwcnConfig.isHttp3Enable()) {
            ALog.m4788i("awcn.Http3ConnDetector", "startDetect", null, "http3 global config close.");
            return;
        }
        if (f3860d.get()) {
            ALog.m4787e("awcn.Http3ConnDetector", "tnet exception.", null, new Object[0]);
            return;
        }
        if (NetworkStatusHelper.isConnected()) {
            if (TextUtils.isEmpty(f3858b)) {
                ALog.m4787e("awcn.Http3ConnDetector", "startDetect", null, "host is null");
                return;
            }
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(f3858b, f3863g);
            if (connStrategyListByHost.isEmpty()) {
                ALog.m4787e("awcn.Http3ConnDetector", "startDetect", null, "http3 strategy is null.");
                return;
            }
            if (f3859c.compareAndSet(false, true)) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).InitializeSecurityStuff();
                    ALog.m4787e("awcn.Http3ConnDetector", "tnet init http3.", null, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable th) {
                    ALog.m4786e("awcn.Http3ConnDetector", "tnet init http3 error.", null, th, new Object[0]);
                    f3860d.set(true);
                    return;
                }
            }
            if (f3857a == null) {
                f3857a = new b();
            }
            if (f3857a.m4570a(NetworkStatusHelper.getUniqueId(networkStatus))) {
                ThreadPoolExecutorFactory.submitDetectTask(new RunnableC0931e(connStrategyListByHost, networkStatus));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static IConnStrategy m4560b(IConnStrategy iConnStrategy) {
        return new C0933g(iConnStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anet.channel.e.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private Map<String, a> f3869a = new ConcurrentHashMap();

        b() {
            m4567a();
        }

        /* renamed from: a */
        private void m4567a() {
            C0928b c0928b = null;
            String string = C0927a.f3862f.getString("networksdk_http3_history_records", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
                    a aVar = new a(c0928b);
                    String string2 = jSONObject.getString("networkUniqueId");
                    aVar.f3867a = jSONObject.getLong(AgooConstants.MESSAGE_TIME);
                    aVar.f3868b = jSONObject.getBoolean("enable");
                    if (m4568a(aVar.f3867a)) {
                        synchronized (this.f3869a) {
                            this.f3869a.put(string2, aVar);
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        /* renamed from: b */
        boolean m4571b(String str) {
            synchronized (this.f3869a) {
                a aVar = this.f3869a.get(str);
                if (aVar != null) {
                    return aVar.f3868b;
                }
                return false;
            }
        }

        /* renamed from: a */
        boolean m4570a(String str) {
            synchronized (this.f3869a) {
                a aVar = this.f3869a.get(str);
                boolean z10 = true;
                if (aVar == null) {
                    return true;
                }
                if (m4568a(aVar.f3867a)) {
                    z10 = false;
                }
                return z10;
            }
        }

        /* renamed from: a */
        private boolean m4568a(long j10) {
            return System.currentTimeMillis() - j10 < C0927a.f3861e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m4569a(String str, boolean z10) {
            a aVar = new a(null);
            aVar.f3868b = z10;
            aVar.f3867a = System.currentTimeMillis();
            JSONArray jSONArray = new JSONArray();
            synchronized (this.f3869a) {
                this.f3869a.put(str, aVar);
                for (Map.Entry<String, a> entry : this.f3869a.entrySet()) {
                    String key = entry.getKey();
                    a value = entry.getValue();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("networkUniqueId", key);
                        jSONObject.put(AgooConstants.MESSAGE_TIME, value.f3867a);
                        jSONObject.put("enable", value.f3868b);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            C0927a.f3862f.edit().putString("networksdk_http3_history_records", jSONArray.toString()).apply();
        }
    }

    /* renamed from: a */
    public static void m4556a() {
        try {
            ALog.m4787e("awcn.Http3ConnDetector", "registerListener", null, "http3Enable", Boolean.valueOf(AwcnConfig.isHttp3Enable()));
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
            f3862f = defaultSharedPreferences;
            f3858b = defaultSharedPreferences.getString("http3_detector_host", "");
            m4558a(NetworkStatusHelper.getStatus());
            NetworkStatusHelper.addStatusChangeListener(f3866j);
            StrategyCenter.getInstance().registerListener(f3865i);
        } catch (Exception e10) {
            ALog.m4786e("awcn.Http3ConnDetector", "[registerListener]error", null, e10, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m4557a(long j10) {
        if (j10 < 0) {
            return;
        }
        f3861e = j10;
    }

    /* renamed from: a */
    public static void m4559a(boolean z10) {
        b bVar = f3857a;
        if (bVar != null) {
            bVar.m4569a(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()), z10);
        }
    }
}
