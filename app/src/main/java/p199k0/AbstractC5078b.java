package p199k0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C1009d;
import anet.channel.util.ALog;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p183j0.AbstractC4968b;
import p229m0.AbstractC5567a;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public abstract class AbstractC5078b {

    /* renamed from: a */
    private static volatile boolean f20907a = true;

    /* renamed from: b */
    private static volatile boolean f20908b = true;

    /* renamed from: c */
    private static volatile boolean f20909c = true;

    /* renamed from: d */
    private static volatile long f20910d;

    /* renamed from: e */
    private static volatile boolean f20911e;

    /* renamed from: f */
    private static volatile ConcurrentHashMap f20912f;

    /* renamed from: g */
    private static volatile CopyOnWriteArrayList f20913g;

    /* renamed from: h */
    private static final List f20914h = new ArrayList();

    /* renamed from: i */
    private static volatile int f20915i = 10000;

    /* renamed from: j */
    private static volatile boolean f20916j = true;

    /* renamed from: k */
    private static volatile boolean f20917k = false;

    /* renamed from: l */
    private static volatile int f20918l = 60000;

    /* renamed from: m */
    private static volatile CopyOnWriteArrayList f20919m = null;

    /* renamed from: n */
    private static volatile ConcurrentHashMap f20920n = null;

    /* renamed from: o */
    private static volatile boolean f20921o = true;

    /* renamed from: p */
    private static volatile boolean f20922p = false;

    /* renamed from: q */
    private static volatile boolean f20923q = false;

    /* renamed from: r */
    private static volatile boolean f20924r = true;

    /* renamed from: s */
    private static volatile boolean f20925s = true;

    /* renamed from: t */
    private static volatile InterfaceC5077a f20926t;

    /* renamed from: a */
    public static int m20551a() {
        return f20915i;
    }

    /* renamed from: b */
    public static boolean m20552b() {
        return f20923q;
    }

    /* renamed from: c */
    public static void m20553c(boolean z10) {
        f20924r = z10;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(AbstractC5567a.m22604a()).edit();
        edit.putBoolean("ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED", f20924r);
        edit.apply();
    }

    /* renamed from: d */
    public static void m20554d(String str) {
        if (!GlobalAppRuntimeInfo.isTargetProcess()) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getString(i10);
                if (C1009d.m4781c(string)) {
                    arrayList.add(string);
                }
            }
            HttpDispatcher.getInstance().addHosts(arrayList);
        } catch (JSONException e10) {
            ALog.m4786e("anet.NetworkConfigCenter", "parse hosts failed", null, e10, new Object[0]);
        }
    }

    /* renamed from: e */
    public static void m20555e(int i10) {
        f20918l = i10;
    }

    /* renamed from: f */
    public static void m20556f(boolean z10) {
        f20911e = z10;
    }

    /* renamed from: g */
    public static void m20557g(boolean z10) {
        f20922p = z10;
    }

    /* renamed from: h */
    public static void m20558h(long j10) {
        if (j10 != f20910d) {
            ALog.m4788i("anet.NetworkConfigCenter", "set cache flag", null, "old", Long.valueOf(f20910d), "new", Long.valueOf(j10));
            f20910d = j10;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(AbstractC5567a.m22604a()).edit();
            edit.putLong("Cache.Flag", f20910d);
            edit.apply();
            AbstractC4968b.m20310b();
        }
    }

    /* renamed from: i */
    public static void m20559i(boolean z10) {
        f20923q = z10;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(AbstractC5567a.m22604a()).edit();
        edit.putBoolean("CHANNEL_LOCAL_INSTANCE_ENABLE", f20923q);
        edit.apply();
    }

    /* renamed from: j */
    public static void m20560j(String str) {
        if (ALog.isPrintLog(2)) {
            ALog.m4788i("anet.NetworkConfigCenter", "setDegradeRequestList", null, "Degrade List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f20920n = null;
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                try {
                    if (Operator.Operation.MULTIPLY.equals(obj)) {
                        concurrentHashMap.put(next, f20914h);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i10 = 0; i10 < length; i10++) {
                            Object obj2 = jSONArray.get(i10);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e10) {
            ALog.m4786e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e10, new Object[0]);
        }
        f20920n = concurrentHashMap;
    }

    /* renamed from: k */
    public static void m20561k(boolean z10) {
        f20909c = z10;
    }

    /* renamed from: l */
    public static void m20562l(String str) {
        if (TextUtils.isEmpty(str)) {
            f20919m = null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("host");
            int length = jSONArray.length();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getString(i10);
                if (C1009d.m4781c(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f20919m = copyOnWriteArrayList;
        } catch (JSONException e10) {
            ALog.m4786e("anet.NetworkConfigCenter", "parse hosts failed", null, e10, new Object[0]);
        }
    }

    /* renamed from: m */
    public static void m20563m(InterfaceC5077a interfaceC5077a) {
        if (f20926t != null) {
            f20926t.unRegister();
        }
        if (interfaceC5077a != null) {
            interfaceC5077a.register();
        }
        f20926t = interfaceC5077a;
    }

    /* renamed from: n */
    public static void m20564n(boolean z10) {
        f20908b = z10;
    }

    /* renamed from: o */
    public static void m20565o(boolean z10) {
        f20921o = z10;
    }

    /* renamed from: p */
    public static void m20566p(int i10) {
        f20915i = i10;
    }

    /* renamed from: q */
    public static void m20567q(boolean z10) {
        f20916j = z10;
    }

    /* renamed from: r */
    public static void m20568r(boolean z10) {
        ALog.m4788i("anet.NetworkConfigCenter", "[setSpdyEnabled]", null, "enable", Boolean.valueOf(z10));
        f20907a = z10;
    }

    /* renamed from: s */
    public static void m20569s(String str) {
        if (ALog.isPrintLog(2)) {
            ALog.m4788i("anet.NetworkConfigCenter", "updateRequestWhiteList", null, "White List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f20913g = null;
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getString(i10);
                if (!string.isEmpty()) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f20913g = copyOnWriteArrayList;
        } catch (JSONException e10) {
            ALog.m4786e("anet.NetworkConfigCenter", "parse bizId failed", null, e10, new Object[0]);
        }
    }

    /* renamed from: t */
    public static void m20570t(String str) {
        if (ALog.isPrintLog(2)) {
            ALog.m4788i("anet.NetworkConfigCenter", "updateWhiteUrlList", null, "White List", str);
        }
        if (TextUtils.isEmpty(str)) {
            f20912f = null;
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                try {
                    if (Operator.Operation.MULTIPLY.equals(obj)) {
                        concurrentHashMap.put(next, f20914h);
                    } else if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList(length);
                        for (int i10 = 0; i10 < length; i10++) {
                            Object obj2 = jSONArray.get(i10);
                            if (obj2 instanceof String) {
                                arrayList.add((String) obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            concurrentHashMap.put(next, arrayList);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException e10) {
            ALog.m4786e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e10, new Object[0]);
        }
        f20912f = concurrentHashMap;
    }
}
