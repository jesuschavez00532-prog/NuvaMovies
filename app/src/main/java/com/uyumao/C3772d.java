package com.uyumao;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import com.umeng.ccg.C3417a;
import com.umeng.ccg.C3419c;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.uyumao.C3775g;
import com.uyumao.sdk.UYMManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.uyumao.d */
/* loaded from: classes3.dex */
public class C3772d implements C3775g.a {

    /* renamed from: a */
    public static volatile boolean f16933a = true;

    /* renamed from: b */
    public static volatile boolean f16934b = true;

    /* renamed from: c */
    public static volatile boolean f16935c = true;

    /* renamed from: d */
    public static volatile boolean f16936d = true;

    /* renamed from: e */
    public static volatile boolean f16937e = true;

    /* renamed from: f */
    public static volatile boolean f16938f = true;

    /* renamed from: g */
    public static Context f16939g;

    /* renamed from: h */
    public static JSONObject f16940h;

    /* renamed from: i */
    public static JSONObject f16941i;

    /* renamed from: j */
    public static JSONObject f16942j;

    /* renamed from: k */
    public static JSONObject f16943k;

    /* renamed from: l */
    public static volatile boolean f16944l;

    /* renamed from: m */
    public static Map<String, Integer> f16945m;

    /* renamed from: n */
    public static LocationListener f16946n;

    /* renamed from: com.uyumao.d$a */
    /* loaded from: classes3.dex */
    public static class a implements LocationListener {
        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            double d10;
            boolean unused = C3772d.f16944l = true;
            try {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                long time = location.getTime();
                double d11 = 0.0d;
                if (location.hasAltitude()) {
                    d10 = location.getAltitude();
                } else {
                    d10 = 0.0d;
                }
                if (location.hasSpeed()) {
                    d11 = location.getSpeed();
                }
                JSONObject jSONObject = new JSONObject();
                C3772d.f16942j = jSONObject;
                jSONObject.put("lat", latitude);
                C3772d.f16942j.put("lng", longitude);
                C3772d.f16942j.put("alt", d10);
                C3772d.f16942j.put("acc", d11);
                C3772d.f16942j.put("lts", time);
                C3775g.m16025a(C3772d.f16939g, C3419c.f15025n, e.f16950a, C3772d.f16943k);
            } catch (Throwable unused2) {
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i10, Bundle bundle) {
        }
    }

    /* renamed from: com.uyumao.d$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f16947a;

        public b(C3772d c3772d, String str) {
            this.f16947a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3779k.m16027a(C3772d.f16939g, "https://yumao.puata.info/cc_info", this.f16947a);
        }
    }

    /* renamed from: com.uyumao.d$c */
    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f16948a;

        public c(C3772d c3772d, String str) {
            this.f16948a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3779k.m16027a(C3772d.f16939g, "https://yumao.puata.info/cc_info", this.f16948a);
        }
    }

    /* renamed from: com.uyumao.d$d */
    /* loaded from: classes3.dex */
    public class d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f16949a;

        public d(C3772d c3772d, String str) {
            this.f16949a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3779k.m16027a(C3772d.f16939g, "https://yumao.puata.info/cc_info", this.f16949a);
        }
    }

    /* renamed from: com.uyumao.d$e */
    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a */
        public static final C3772d f16950a = new C3772d();
    }

    static {
        HashMap hashMap = new HashMap();
        f16945m = hashMap;
        hashMap.put(C3417a.f14980b, 101);
        f16945m.put(C3417a.f14981c, 102);
        f16945m.put(C3417a.f14982d, 103);
        f16945m.put(C3417a.f14983e, 104);
        f16946n = new a();
    }

    /* renamed from: a */
    public static void m15999a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                Object optString = jSONObject2.optString(C3417a.f14996r);
                String optString2 = jSONObject2.optString(C3417a.f14999u);
                jSONObject.put(C3417a.f14996r, optString);
                String[] split = optString2.split(",");
                JSONArray jSONArray = new JSONArray();
                for (String str : split) {
                    jSONArray.put(str);
                }
                jSONObject.put(C3417a.f14999u, jSONArray);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m15998a(Context context) {
        JSONObject jSONObject = f16940h;
        if (jSONObject != null && jSONObject.length() > 0) {
            return f16940h;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("os", "Android");
            jSONObject2.put("dm", Build.MODEL);
            jSONObject2.put("av", DeviceConfig.getAppVersionName(context));
            jSONObject2.put(C3325bt.f14265g, UMUtils.getUMId(context));
            jSONObject2.put("ov", Build.VERSION.RELEASE);
            jSONObject2.put("chn", UMUtils.getChannel(context));
            if (UMUtils.getActiveUser(context) != null && UMUtils.getActiveUser(context).length == 2) {
                jSONObject2.put(C3384f.f14553N, UMUtils.getActiveUser(context)[1]);
            } else {
                jSONObject2.put(C3384f.f14553N, "");
            }
            jSONObject2.put(C3325bt.f14220al, UMUtils.getZid(context));
            jSONObject2.put("sv", UYMManager.getSdkVersion());
            jSONObject2.put("ak", UMUtils.getAppkey(context));
            jSONObject2.put("idfa", DeviceConfig.getIdfa(context));
            jSONObject2.put("db", Build.BRAND);
            jSONObject2.put("aid", DeviceConfig.getAndroidId(context));
            jSONObject2.put("oaid", DeviceConfig.getOaid(context));
            jSONObject2.put(Constants.KEY_IMEI, DeviceConfig.getImeiNew(context));
            jSONObject2.put("boa", Build.BOARD);
            jSONObject2.put("mant", Build.TIME);
            String[] localeInfo = DeviceConfig.getLocaleInfo(context);
            jSONObject2.put("ct", localeInfo[0]);
            jSONObject2.put("lang", localeInfo[1]);
            jSONObject2.put("tz", DeviceConfig.getTimeZone(context));
            jSONObject2.put("pkg", DeviceConfig.getPackageName(context));
            jSONObject2.put("disn", DeviceConfig.getAppName(context));
            String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
            if ("Wi-Fi".equals(networkAccessMode[0])) {
                jSONObject2.put("ac", "wifi");
            } else if ("2G/3G".equals(networkAccessMode[0])) {
                jSONObject2.put("ac", "2G/3G");
            } else {
                jSONObject2.put("ac", "unknown");
            }
            if (!"".equals(networkAccessMode[1])) {
                jSONObject2.put("ast", networkAccessMode[1]);
            }
            jSONObject2.put("nt", DeviceConfig.getNetworkType(context));
            String deviceToken = UMUtils.getDeviceToken(context);
            if (!TextUtils.isEmpty(deviceToken)) {
                jSONObject2.put("device_token", deviceToken);
            }
            f16940h = jSONObject2;
        } catch (Throwable unused) {
        }
        return f16940h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
    
        if (r5.contains("network") != false) goto L53;
     */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0095: INVOKE (r5 I:boolean) = (r1v24 Object I:android.content.Context), (r7 I:java.lang.String) STATIC call: com.uyumao.e.a(android.content.Context, java.lang.String):boolean A[Catch: all -> 0x00ba, MD:(android.content.Context, java.lang.String):boolean (m)] (LINE:71), block:B:46:0x0095 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x01db: INVOKE (r3 I:boolean) = (r1v2 Object I:android.content.Context), (r7 I:java.lang.String) STATIC call: com.uyumao.e.a(android.content.Context, java.lang.String):boolean A[Catch: all -> 0x01ed, MD:(android.content.Context, java.lang.String):boolean (m)] (LINE:123), block:B:166:0x01db */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x008f: INVOKE (r5 I:boolean) = (r1v24 Object I:android.content.Context), (r8 I:java.lang.String) STATIC call: com.uyumao.e.a(android.content.Context, java.lang.String):boolean A[Catch: all -> 0x00ba, MD:(android.content.Context, java.lang.String):boolean (m), TRY_ENTER] (LINE:70), block:B:44:0x008f */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x01d5: INVOKE (r3 I:boolean) = (r1v2 Object I:android.content.Context), (r8 I:java.lang.String) STATIC call: com.uyumao.e.a(android.content.Context, java.lang.String):boolean A[Catch: all -> 0x01ed, MD:(android.content.Context, java.lang.String):boolean (m), TRY_ENTER] (LINE:122), block:B:164:0x01d5 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    @Override // com.uyumao.C3775g.a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo16001a(java.lang.Object r19, int r20) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uyumao.C3772d.mo16001a(java.lang.Object, int):void");
    }
}
