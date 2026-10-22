package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.lzy.okgo.model.Progress;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import org.android.netutil.NetUtils;
import org.android.netutil.PingEntry;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ExceptionDetector {

    /* renamed from: a */
    long f3813a;

    /* renamed from: b */
    String f3814b;

    /* renamed from: c */
    String f3815c;

    /* renamed from: d */
    String f3816d;

    /* renamed from: e */
    LimitedQueue<Pair<String, Integer>> f3817e = new LimitedQueue<>(10);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LimitedQueue<E> extends LinkedList<E> {

        /* renamed from: b */
        private int f3819b;

        public LimitedQueue(int i10) {
            this.f3819b = i10;
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(E e10) {
            boolean add = super.add(e10);
            while (add && size() > this.f3819b) {
                super.remove();
            }
            return add;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anet.channel.detect.ExceptionDetector$a */
    /* loaded from: classes.dex */
    public class C0911a {

        /* renamed from: a */
        String f3820a;

        /* renamed from: b */
        String f3821b;

        /* renamed from: c */
        String f3822c;

        /* renamed from: d */
        Future<PingResponse> f3823d;

        /* renamed from: e */
        Future<PingResponse> f3824e;

        /* renamed from: f */
        Future<PingResponse> f3825f;

        private C0911a() {
        }

        /* synthetic */ C0911a(ExceptionDetector exceptionDetector, C0912a c0912a) {
            this();
        }
    }

    /* renamed from: a */
    public void m4530a() {
        NetworkStatusHelper.addStatusChangeListener(new C0912a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4532b() {
        String preferNextHop;
        Future<PingResponse> future;
        ALog.m4787e("anet.ExceptionDetector", "network detect start.", null, new Object[0]);
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        jSONObject2.put(Progress.STATUS, status.getType());
        jSONObject2.put("subType", NetworkStatusHelper.getNetworkSubType());
        if (status != NetworkStatusHelper.NetworkStatus.NO) {
            if (status.isMobile()) {
                jSONObject2.put("apn", NetworkStatusHelper.getApn());
                jSONObject2.put("carrier", NetworkStatusHelper.getCarrier());
            } else {
                jSONObject2.put(DispatchConstants.BSSID, NetworkStatusHelper.getWifiBSSID());
                jSONObject2.put("ssid", NetworkStatusHelper.getWifiSSID());
            }
            jSONObject2.put("proxy", NetworkStatusHelper.getProxyType());
        }
        jSONObject.put("NetworkInfo", jSONObject2);
        if (status.isWifi()) {
            preferNextHop = NetUtils.getDefaultGateway("114.114.114.114");
        } else {
            preferNextHop = NetUtils.getPreferNextHop("114.114.114.114", 2);
        }
        if (!TextUtils.isEmpty(preferNextHop)) {
            future = new PingTask(preferNextHop, 1000, 3, 0, 0).launch();
        } else {
            future = null;
        }
        C0911a m4526a = m4526a("guide-acs.m.taobao.com", this.f3814b);
        C0911a m4526a2 = m4526a("gw.alicdn.com", this.f3816d);
        C0911a m4526a3 = m4526a("msgacs.m.taobao.com", this.f3815c);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("nextHop", preferNextHop);
        jSONObject3.put("ping", m4529a(future));
        jSONObject.put("LocalDetect", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(m4528a(m4526a));
        jSONArray.put(m4528a(m4526a2));
        jSONArray.put(m4528a(m4526a3));
        jSONObject.put("InternetDetect", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        Iterator<Pair<String, Integer>> it = this.f3817e.iterator();
        while (it.hasNext()) {
            Pair<String, Integer> next = it.next();
            jSONObject4.put((String) next.first, next.second);
        }
        jSONObject.put("BizDetect", jSONObject4);
        this.f3817e.clear();
        ALog.m4787e("anet.ExceptionDetector", "network detect result: " + jSONObject.toString(), null, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m4533c() {
        boolean z10 = false;
        if (this.f3817e.size() != 10) {
            return false;
        }
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.NO) {
            ALog.m4787e("anet.ExceptionDetector", "no network", null, new Object[0]);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.f3813a) {
            return false;
        }
        Iterator<Pair<String, Integer>> it = this.f3817e.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next().second).intValue();
            if (intValue == -202 || intValue == -400 || intValue == -401 || intValue == -405 || intValue == -406) {
                i10++;
            }
        }
        if (i10 * 2 > 10) {
            z10 = true;
        }
        if (z10) {
            this.f3813a = currentTimeMillis + 1800000;
        }
        return z10;
    }

    /* renamed from: a */
    public void m4531a(RequestStatistic requestStatistic) {
        if (!AwcnConfig.isNetworkDetectEnable()) {
            ALog.m4788i("anet.ExceptionDetector", "network detect closed.", null, new Object[0]);
        } else {
            ThreadPoolExecutorFactory.submitDetectTask(new RunnableC0914c(this, requestStatistic));
        }
    }

    /* renamed from: a */
    private ArrayList<String> m4527a(String str, int i10) {
        PingResponse pingResponse;
        ArrayList<String> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i11 = 0;
        while (i11 < i10) {
            i11++;
            try {
                pingResponse = (PingResponse) new PingTask(str, 0, 1, 0, i11).launch().get();
            } catch (Exception unused) {
                pingResponse = null;
            }
            StringBuilder sb2 = new StringBuilder();
            if (pingResponse != null) {
                String lastHopIPStr = pingResponse.getLastHopIPStr();
                double d10 = pingResponse.getResults()[0].rtt;
                int errcode = pingResponse.getErrcode();
                if (TextUtils.isEmpty(lastHopIPStr)) {
                    lastHopIPStr = Operator.Operation.MULTIPLY;
                }
                sb2.append("hop=");
                sb2.append(lastHopIPStr);
                sb2.append(",rtt=");
                sb2.append(d10);
                sb2.append(",errCode=");
                sb2.append(errcode);
            }
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    private C0911a m4526a(String str, String str2) {
        C0911a c0911a = new C0911a(this, null);
        c0911a.f3820a = str;
        try {
            c0911a.f3821b = InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
        }
        if (!TextUtils.isEmpty(str2)) {
            c0911a.f3822c = str2;
        } else {
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
            if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
                c0911a.f3822c = connStrategyListByHost.get(0).getIp();
            }
        }
        String str3 = !TextUtils.isEmpty(c0911a.f3822c) ? c0911a.f3822c : c0911a.f3821b;
        if (!TextUtils.isEmpty(str3)) {
            String str4 = str3;
            c0911a.f3823d = new PingTask(str4, 1000, 3, 0, 0).launch();
            c0911a.f3824e = new PingTask(str4, 1000, 3, 1172, 0).launch();
            c0911a.f3825f = new PingTask(str4, 1000, 3, 1432, 0).launch();
        }
        return c0911a;
    }

    /* renamed from: a */
    private JSONObject m4528a(C0911a c0911a) {
        JSONObject jSONObject = new JSONObject();
        if (c0911a != null && c0911a.f3823d != null) {
            jSONObject.put("host", c0911a.f3820a);
            jSONObject.put("currentIp", c0911a.f3822c);
            jSONObject.put("localIp", c0911a.f3821b);
            jSONObject.put("ping", m4529a(c0911a.f3823d));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("1200", m4529a(c0911a.f3824e));
            jSONObject2.put("1460", m4529a(c0911a.f3825f));
            jSONObject.put("MTU", jSONObject2);
            if ("guide-acs.m.taobao.com".equals(c0911a.f3820a)) {
                ArrayList<String> m4527a = m4527a(!TextUtils.isEmpty(c0911a.f3822c) ? c0911a.f3822c : c0911a.f3821b, 5);
                JSONObject jSONObject3 = new JSONObject();
                int i10 = 0;
                while (i10 < m4527a.size()) {
                    int i11 = i10 + 1;
                    jSONObject3.put(String.valueOf(i11), m4527a.get(i10));
                    i10 = i11;
                }
                jSONObject.put("traceRoute", jSONObject3);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m4529a(Future<PingResponse> future) {
        PingResponse pingResponse;
        JSONObject jSONObject = new JSONObject();
        if (future == null) {
            return jSONObject;
        }
        try {
            pingResponse = future.get();
        } catch (Exception unused) {
            pingResponse = null;
        }
        if (pingResponse == null) {
            return jSONObject;
        }
        jSONObject.put("errCode", pingResponse.getErrcode());
        JSONArray jSONArray = new JSONArray();
        for (PingEntry pingEntry : pingResponse.getResults()) {
            jSONArray.put("seq=" + pingEntry.seq + ",hop=" + pingEntry.hop + ",rtt=" + pingEntry.rtt);
        }
        jSONObject.put("response", jSONArray);
        return jSONObject;
    }
}
