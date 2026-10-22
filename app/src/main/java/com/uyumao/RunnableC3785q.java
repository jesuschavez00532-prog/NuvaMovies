package com.uyumao;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3373dn;
import com.umeng.ccg.C3417a;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.uyumao.C3783o;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.uyumao.q */
/* loaded from: classes3.dex */
public final class RunnableC3785q implements Runnable {

    /* renamed from: com.uyumao.q$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f16986a;

        /* renamed from: b */
        public final /* synthetic */ int f16987b;

        /* renamed from: c */
        public final /* synthetic */ int f16988c;

        /* renamed from: d */
        public final /* synthetic */ String f16989d;

        /* renamed from: e */
        public final /* synthetic */ long f16990e;

        public a(RunnableC3785q runnableC3785q, Context context, int i10, int i11, String str, long j10) {
            this.f16986a = context;
            this.f16987b = i10;
            this.f16988c = i11;
            this.f16989d = str;
            this.f16990e = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                TreeSet treeSet = new TreeSet();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byte[] bArr = {18, -119, 31, 22, 8, 45, 8, 26, 5, 10, 98, 78, -51, 47, -125, 34, 17, 108, -112, -104, 95, 34, 120, 61, -52, -77, 8, 107, -4, 56, 82, -49, -119, -18, -111, -20, 110, -108, -32, -28, 88, -5, 69, -26, 120, -36, 5, -77, -46, 29, 24, -115, -118, -9, -108, -86, -17, 34, 115, -123, 93, 53, 118, 64, 48, -101, -83, -59, -99, 36, 69, -104, 51, -126, 8, -18, 79, -115, -16, 84, -49, 72, 66, 49, 93, -22, -127, -47, -59, -86, C3373dn.f14524l, -12, -100, -12, 53, 85, 37, -75, -30, 31, 44, -83, 99, -108, -92, -127, -32, 87, -61, -83, -90, 123, -98, -32, -60, 77, 113, -60, 101, 81, 57, -72, -86, 28, -74, 88, 35, -118, -22, -74, -29, -103, -86, -25, 19, -78, 62, 28, -100, -68, 1, 35, -68, 58, -100, 29, 5, -10, -95, 20, 98, 124, -40, 99, -100, 8, -126, -10, 79, -31, -42, -114, 12, 27, -102, 114, -107, -35, 82, 21, 97, -9, 39, -20, 123, -37, -68, -78, -89, C3373dn.f14523k, 3, 21, 21, 12, 40, C3373dn.f14524l, 29};
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, 179, 187);
                    byte[] copyOf = Arrays.copyOf(bArr, 179);
                    C3773e.m16014a(copyOf, copyOfRange);
                    C3773e.m16011a(copyOf, byteArrayOutputStream2);
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream2.toString());
                    Object m16053a = C3790t.m16053a(jSONObject.optString(C3325bt.f14194aL), jSONObject.optString(C3325bt.f14186aD), null, this.f16986a, null);
                    String str = "v";
                    try {
                        if (1 == this.f16987b) {
                            Object m16053a2 = C3790t.m16053a(jSONObject.optString("m"), jSONObject.optString("q"), new Class[]{C3790t.m16052a(jSONObject.optString(C3325bt.f14191aI)), Integer.TYPE}, m16053a, new Object[]{C3790t.m16054a(jSONObject.optString(C3325bt.f14191aI), (Class<?>[]) new Class[]{String.class}, new Object[]{jSONObject.optString("a")}), 0});
                            if (m16053a2 instanceof List) {
                                Field m16057a = C3790t.m16057a(jSONObject.optString("r"), jSONObject.optString(C3325bt.f14190aH));
                                Field m16057a2 = C3790t.m16057a(jSONObject.optString("t"), jSONObject.optString("n"));
                                Iterator it = ((List) m16053a2).iterator();
                                while (it.hasNext()) {
                                    Object m16055a = C3790t.m16055a(m16057a2, C3790t.m16055a(m16057a, it.next()));
                                    if (m16055a != null) {
                                        treeSet.add((String) m16055a);
                                    }
                                }
                            }
                        } else {
                            Object m16053a3 = C3790t.m16053a(jSONObject.optString("m"), jSONObject.optString(C3325bt.f14196aN), new Class[]{Integer.TYPE}, m16053a, new Object[]{0});
                            if (m16053a3 instanceof List) {
                                Field m16057a3 = C3790t.m16057a(jSONObject.optString("v"), jSONObject.optString("n"));
                                Iterator it2 = ((List) m16053a3).iterator();
                                while (it2.hasNext()) {
                                    Object m16055a2 = C3790t.m16055a(m16057a3, it2.next());
                                    if (m16055a2 != null) {
                                        treeSet.add((String) m16055a2);
                                    }
                                }
                            }
                        }
                        if (treeSet.isEmpty()) {
                            C3782n.m16035a(byteArrayOutputStream2);
                            return;
                        }
                        if (m16053a == null) {
                            C3782n.m16035a(byteArrayOutputStream2);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        JSONArray jSONArray = new JSONArray();
                        Iterator it3 = treeSet.iterator();
                        int i10 = 0;
                        while (it3.hasNext()) {
                            Object m16032a = C3782n.m16032a(m16053a, (String) it3.next(), 0);
                            if (m16032a != null) {
                                C3784p c3784p = new C3784p(m16053a, m16032a);
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("a", c3784p.f16981b);
                                jSONObject2.put(C3325bt.f14186aD, c3784p.f16980a);
                                jSONObject2.put(str, c3784p.f16982c);
                                jSONObject2.put("t", c3784p.f16985f);
                                String str2 = str;
                                jSONObject2.put(C3325bt.f14191aI, c3784p.f16983d);
                                jSONObject2.put(C3325bt.f14196aN, c3784p.f16984e);
                                jSONArray.put(jSONObject2);
                                i10++;
                                try {
                                    if (jSONArray.length() == this.f16988c) {
                                        arrayList.add(jSONArray);
                                        jSONArray = new JSONArray();
                                    }
                                    str = str2;
                                } catch (Throwable th) {
                                    th = th;
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    try {
                                        th.getMessage();
                                        return;
                                    } finally {
                                        C3782n.m16035a(byteArrayOutputStream);
                                    }
                                }
                            }
                        }
                        String str3 = str;
                        if (jSONArray.length() > 0) {
                            arrayList.add(jSONArray);
                        }
                        if (arrayList.isEmpty()) {
                            C3782n.m16035a(byteArrayOutputStream2);
                            return;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(C3325bt.f14220al, UMUtils.getZid(this.f16986a));
                        jSONObject3.put("appkey", this.f16989d);
                        jSONObject3.put(C3325bt.f14265g, UMUtils.getUMId(this.f16986a));
                        jSONObject3.put(str3, "2.0");
                        jSONObject3.put("sdk_v", "1.1.4");
                        jSONObject3.put("os_v", Build.VERSION.RELEASE);
                        jSONObject3.put(Constants.KEY_BRAND, C3782n.m16037b());
                        jSONObject3.put(Constants.KEY_MODEL, C3782n.m16039c());
                        jSONObject3.put("smart_id", this.f16990e);
                        jSONObject3.put("src", "risk");
                        jSONObject3.put(Constants.KEY_IMEI, DeviceConfig.getImeiNew(this.f16986a));
                        try {
                            jSONObject3.put("oaid", DeviceConfig.getOaid(this.f16986a));
                        } catch (Throwable unused) {
                        }
                        try {
                            jSONObject3.put("idfa", DeviceConfig.getIdfa(this.f16986a));
                        } catch (Throwable unused2) {
                        }
                        jSONObject3.put("android_id", DeviceConfig.getAndroidId(this.f16986a));
                        jSONObject3.put("pkg", this.f16986a.getPackageName());
                        jSONObject3.put("app_v", UMUtils.getAppVersionName(this.f16986a));
                        jSONObject3.put("board", C3782n.m16033a());
                        try {
                            Locale locale = UMUtils.getLocale(this.f16986a);
                            if (locale != null) {
                                jSONObject3.put("os_lang", locale.getLanguage());
                            }
                        } catch (Throwable unused3) {
                        }
                        jSONObject3.put("c_ts", System.currentTimeMillis());
                        jSONObject3.put("total", i10);
                        try {
                            jSONObject3.put("os_i", Build.VERSION.SDK_INT);
                            jSONObject3.put("os_t", this.f16986a.getApplicationInfo().targetSdkVersion);
                            jSONObject3.put("grant", C3782n.m16036a(this.f16986a) ? 1 : 0);
                        } catch (Throwable unused4) {
                        }
                        Iterator it4 = arrayList.iterator();
                        int i11 = 0;
                        while (it4.hasNext()) {
                            JSONArray jSONArray2 = (JSONArray) it4.next();
                            i11++;
                            jSONObject3.put(C3417a.f15000v, i11);
                            jSONObject3.put("data", jSONArray2);
                            try {
                                C3773e.m16010a(jSONObject3, "https://sss.umeng.com/api/v2/al", this.f16989d);
                            } catch (Exception e10) {
                                throw e10;
                            }
                        }
                        C3782n.m16035a(byteArrayOutputStream2);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        JSONObject jSONObject;
        Context context = C3773e.f16951a;
        if (C3783o.f16976a == null) {
            synchronized (C3783o.class) {
                if (C3783o.f16976a == null) {
                    C3783o.f16976a = new C3783o(context);
                }
            }
        }
        C3783o c3783o = C3783o.f16976a;
        if (C3782n.m16040c(c3783o.f16977b)) {
            c3783o.f16978c.m16046b("smart_lc", c3783o.m16041a() + 1);
        }
        String str = c3783o.f16978c.f16979a + "smart_lt";
        String valueOf = String.valueOf(0);
        try {
            if (C3782n.m16040c(C3773e.f16951a)) {
                valueOf = C3781m.m16031a().f16971b.getString(str, valueOf);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            i10 = Integer.parseInt(valueOf);
        } catch (Exception unused) {
            i10 = 0;
        }
        if (c3783o.m16041a() < i10 || !c3783o.m16043a("smart_")) {
            return;
        }
        try {
            Context context2 = C3773e.f16951a;
            String appkey = UMUtils.getAppkey(context2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C3325bt.f14220al, UMUtils.getZid(context2));
            try {
                jSONObject2.put(Constants.KEY_IMEI, DeviceConfig.getImeiNew(context2));
                jSONObject2.put("oaid", DeviceConfig.getOaid(context2));
            } catch (Throwable unused2) {
            }
            try {
                jSONObject2.put("idfa", DeviceConfig.getIdfa(context2));
            } catch (Throwable unused3) {
            }
            jSONObject2.put(C3325bt.f14265g, UMUtils.getUMId(context2));
            jSONObject2.put("android_id", DeviceConfig.getAndroidId(context2));
            jSONObject2.put("sdk_v", "1.1.4");
            jSONObject2.put("os_v", Build.VERSION.RELEASE);
            jSONObject2.put("lvl", Build.VERSION.SDK_INT);
            String[] networkAccessMode = UMUtils.getNetworkAccessMode(context2);
            if (TextUtils.isEmpty(networkAccessMode[0])) {
                networkAccessMode[0] = "Unknown";
            }
            jSONObject2.put("net", networkAccessMode[0]);
            jSONObject2.put(Constants.KEY_BRAND, C3782n.m16037b());
            long m16044a = c3783o.f16978c.m16044a("smart_ts", 0L);
            if (m16044a > 0) {
                jSONObject2.put("last", m16044a);
            }
            try {
                jSONObject = C3773e.m16007a(jSONObject2, "https://ccs.umeng.com/ra", appkey, false);
            } catch (Exception unused4) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                c3783o.m16042a(7200L);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                c3783o.m16042a(7200L);
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("aa");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            int optInt = optJSONObject2.optInt("launch", 5);
            C3783o.a aVar = c3783o.f16978c;
            aVar.m16045a(aVar.f16979a + "smart_lt", String.valueOf(optInt));
            if (c3783o.m16041a() < optInt) {
                return;
            }
            c3783o.m16042a(optJSONObject.optLong("ttl", 86400L));
            long optLong = optJSONObject.optLong("id", -1L);
            if (optLong <= 0) {
                return;
            }
            int max = Math.max(optJSONObject2.optInt(C3417a.f15000v, 300), 100);
            int optInt2 = optJSONObject2.optInt(C3417a.f15001w, 1);
            int optInt3 = optJSONObject2.optInt("delay");
            if (optInt2 != 1 && optInt2 != 2) {
                return;
            }
            C3787s.m16051a(new a(this, context2, optInt2, max, appkey, optLong), optInt3, TimeUnit.SECONDS);
        } catch (Throwable unused5) {
        }
    }
}
