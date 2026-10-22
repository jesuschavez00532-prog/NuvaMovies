package com.uyumao;

import android.content.Context;
import android.os.Build;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3373dn;
import com.umeng.ccg.C3417a;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.uyumao.r */
/* loaded from: classes3.dex */
public final class RunnableC3786r implements Runnable {

    /* renamed from: a */
    public final JSONObject f16991a;

    /* renamed from: com.uyumao.r$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f16992a;

        /* renamed from: b */
        public final /* synthetic */ int f16993b;

        /* renamed from: c */
        public final /* synthetic */ int f16994c;

        /* renamed from: d */
        public final /* synthetic */ String f16995d;

        public a(Context context, int i10, int i11, String str) {
            this.f16992a = context;
            this.f16993b = i10;
            this.f16994c = i11;
            this.f16995d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = C3325bt.f14186aD;
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
                    Object m16053a = C3790t.m16053a(jSONObject.optString(C3325bt.f14194aL), jSONObject.optString(C3325bt.f14186aD), null, this.f16992a, null);
                    try {
                        if (1 == this.f16993b) {
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
                                jSONObject2.put(str, c3784p.f16980a);
                                jSONObject2.put("v", c3784p.f16982c);
                                jSONObject2.put("t", c3784p.f16985f);
                                String str2 = str;
                                Object obj = m16053a;
                                jSONObject2.put(C3325bt.f14191aI, c3784p.f16983d);
                                jSONObject2.put(C3325bt.f14196aN, c3784p.f16984e);
                                jSONArray.put(jSONObject2);
                                i10++;
                                try {
                                    if (jSONArray.length() == this.f16994c) {
                                        arrayList.add(jSONArray);
                                        jSONArray = new JSONArray();
                                    }
                                    str = str2;
                                    m16053a = obj;
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
                        if (jSONArray.length() > 0) {
                            arrayList.add(jSONArray);
                        }
                        if (arrayList.isEmpty()) {
                            C3782n.m16035a(byteArrayOutputStream2);
                            return;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(C3325bt.f14220al, UMUtils.getZid(this.f16992a));
                        jSONObject3.put("appkey", this.f16995d);
                        jSONObject3.put(C3325bt.f14265g, UMUtils.getUMId(this.f16992a));
                        jSONObject3.put("v", "3.0");
                        jSONObject3.put("sdk_v", "1.1.4");
                        jSONObject3.put("os_v", Build.VERSION.RELEASE);
                        jSONObject3.put(Constants.KEY_BRAND, C3782n.m16037b());
                        jSONObject3.put(Constants.KEY_MODEL, C3782n.m16039c());
                        Object uuid = UUID.randomUUID().toString();
                        jSONObject3.put("uuid", uuid);
                        jSONObject3.put("smart_id", uuid);
                        jSONObject3.put("src", "risk");
                        jSONObject3.put(Constants.KEY_IMEI, DeviceConfig.getImeiNew(this.f16992a));
                        try {
                            jSONObject3.put("oaid", DeviceConfig.getOaid(this.f16992a));
                        } catch (Throwable unused) {
                        }
                        try {
                            jSONObject3.put("idfa", DeviceConfig.getIdfa(this.f16992a));
                        } catch (Throwable unused2) {
                        }
                        jSONObject3.put("android_id", DeviceConfig.getAndroidId(this.f16992a));
                        jSONObject3.put("pkg", this.f16992a.getPackageName());
                        jSONObject3.put("app_v", UMUtils.getAppVersionName(this.f16992a));
                        jSONObject3.put("board", C3782n.m16033a());
                        try {
                            Locale locale = UMUtils.getLocale(this.f16992a);
                            if (locale != null) {
                                jSONObject3.put("os_lang", locale.getLanguage());
                            }
                        } catch (Throwable unused3) {
                        }
                        jSONObject3.put("c_ts", System.currentTimeMillis());
                        jSONObject3.put("total", i10);
                        try {
                            jSONObject3.put("os_i", Build.VERSION.SDK_INT);
                            jSONObject3.put("os_t", this.f16992a.getApplicationInfo().targetSdkVersion);
                            jSONObject3.put("grant", C3782n.m16036a(this.f16992a) ? 1 : 0);
                        } catch (Throwable unused4) {
                        }
                        try {
                            jSONObject3.put("os", "Android");
                            Object[] networkAccessMode = DeviceConfig.getNetworkAccessMode(this.f16992a);
                            if ("Wi-Fi".equals(networkAccessMode[0])) {
                                jSONObject3.put(C3325bt.f14172Q, "wifi");
                            } else {
                                try {
                                    if ("2G/3G".equals(networkAccessMode[0])) {
                                        jSONObject3.put(C3325bt.f14172Q, "2G/3G");
                                    } else {
                                        jSONObject3.put(C3325bt.f14172Q, "unknown");
                                    }
                                } catch (Throwable unused5) {
                                }
                            }
                            if (!"".equals(networkAccessMode[1])) {
                                jSONObject3.put("sub_access", networkAccessMode[1]);
                            }
                            jSONObject3.put(C3325bt.f14277s, DeviceConfig.getAppName(this.f16992a));
                        } catch (Throwable unused6) {
                        }
                        try {
                            String[] split = RunnableC3786r.this.f16991a.optString(C3417a.f14999u).split(",");
                            JSONArray jSONArray2 = new JSONArray();
                            for (String str3 : split) {
                                jSONArray2.put(str3);
                            }
                            jSONObject3.put(C3417a.f14999u, jSONArray2);
                            jSONObject3.put(C3417a.f14996r, RunnableC3786r.this.f16991a.optString(C3417a.f14996r));
                            jSONObject3.put(C3417a.f14997s, RunnableC3786r.this.f16991a.optString(C3417a.f14997s));
                            String optString = RunnableC3786r.this.f16991a.optString("actionName");
                            JSONArray jSONArray3 = new JSONArray(RunnableC3786r.this.f16991a.optString(C3417a.f14998t));
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put(optString, jSONArray3);
                            jSONObject3.put(C3417a.f14998t, jSONObject4);
                        } catch (Throwable unused7) {
                        }
                        int size = arrayList.size();
                        Iterator it4 = arrayList.iterator();
                        int i11 = 0;
                        while (it4.hasNext()) {
                            JSONArray jSONArray4 = (JSONArray) it4.next();
                            i11++;
                            jSONObject3.put(C3417a.f15000v, i11);
                            jSONObject3.put("batch_num", size);
                            jSONObject3.put("batch_pkg_num", jSONArray4.length());
                            jSONObject3.put("apl", jSONArray4);
                            try {
                                C3773e.m16010a(jSONObject3, "https://yumao.puata.info/cc_info", this.f16995d);
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

    public RunnableC3786r(JSONObject jSONObject) {
        this.f16991a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f16991a == null) {
            return;
        }
        try {
            Context context = C3773e.f16951a;
            String appkey = UMUtils.getAppkey(context);
            int max = Math.max(this.f16991a.optInt(C3417a.f15000v, 300), 100);
            int optInt = this.f16991a.optInt(C3417a.f15001w, 1);
            if (optInt != 1 && optInt != 2) {
                return;
            }
            C3787s.m16051a(new a(context, optInt, max, appkey), 0L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
    }
}
