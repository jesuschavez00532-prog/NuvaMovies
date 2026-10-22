package com.umeng.message.proguard;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3373dn;
import com.umeng.ccg.C3417a;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MsgConstant;
import com.umeng.message.common.UPLog;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.n */
/* loaded from: classes3.dex */
public final class RunnableC3694n implements Runnable {

    /* renamed from: a */
    final JSONObject f16545a;

    public RunnableC3694n(JSONObject jSONObject) {
        this.f16545a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!C3678f.f16509a || this.f16545a == null) {
            return;
        }
        try {
            final Application m15840a = C3706y.m15840a();
            final String appkey = UMUtils.getAppkey(m15840a);
            final int max = Math.max(this.f16545a.optInt(C3417a.f15000v, 300), 100);
            final int optInt = this.f16545a.optInt(C3417a.f15001w, 1);
            if (optInt != 1 && optInt != 2) {
                return;
            }
            C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.n.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    int i10;
                    ByteArrayOutputStream byteArrayOutputStream = null;
                    try {
                        TreeSet treeSet = new TreeSet();
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = {18, -119, 31, 22, 8, 45, 8, 26, 5, 10, 98, 78, -51, 47, -125, 34, 17, 108, -112, -104, 95, 34, 120, 61, -52, -77, 8, 107, -4, 56, 82, -49, -119, -18, -111, -20, 110, -108, -32, -28, 88, -5, 69, -26, 120, -36, 5, -77, -46, 29, 24, -115, -118, -9, -108, -86, -17, 34, 115, -123, 93, 53, 118, 64, 48, -101, -83, -59, -99, 36, 69, -104, 51, -126, 8, -18, 79, -115, -16, 84, -49, 72, 66, 49, 93, -22, -127, -47, -59, -86, C3373dn.f14524l, -12, -100, -12, 53, 85, 37, -75, -30, 31, 44, -83, 99, -108, -92, -127, -32, 87, -61, -83, -90, 123, -98, -32, -60, 77, 113, -60, 101, 81, 57, -72, -86, 28, -74, 88, 35, -118, -22, -74, -29, -103, -86, -25, 19, -78, 62, 28, -100, -68, 1, 35, -68, 58, -100, 29, 5, -10, -95, 20, 98, 124, -40, 99, -100, 8, -126, -10, 79, -31, -42, -114, 12, 27, -102, 114, -107, -35, 82, 21, 97, -9, 39, -20, 123, -37, -68, -78, -89, C3373dn.f14523k, 3, 21, 21, 12, 40, C3373dn.f14524l, 29};
                            byte[] copyOfRange = Arrays.copyOfRange(bArr, 179, 187);
                            byte[] copyOf = Arrays.copyOf(bArr, 179);
                            C3594bl.m15429a(copyOf, copyOfRange);
                            C3599bq.m15445b(copyOf, byteArrayOutputStream2);
                            JSONObject jSONObject = new JSONObject(byteArrayOutputStream2.toString());
                            Object m15433a = C3596bn.m15433a(jSONObject.optString(C3325bt.f14194aL), jSONObject.optString(C3325bt.f14186aD), null, m15840a, null);
                            try {
                                if (1 == optInt) {
                                    str = "2G/3G";
                                    Object m15433a2 = C3596bn.m15433a(jSONObject.optString("m"), jSONObject.optString("q"), new Class[]{C3596bn.m15432a(jSONObject.optString(C3325bt.f14191aI)), Integer.TYPE}, m15433a, new Object[]{C3596bn.m15434a(jSONObject.optString(C3325bt.f14191aI), (Class<?>[]) new Class[]{String.class}, new Object[]{jSONObject.optString("a")}), 0});
                                    if (m15433a2 instanceof List) {
                                        Field m15437a = C3596bn.m15437a(jSONObject.optString("r"), jSONObject.optString(C3325bt.f14190aH));
                                        Field m15437a2 = C3596bn.m15437a(jSONObject.optString("t"), jSONObject.optString("n"));
                                        Iterator it = ((List) m15433a2).iterator();
                                        while (it.hasNext()) {
                                            Object m15435a = C3596bn.m15435a(m15437a2, C3596bn.m15435a(m15437a, it.next()));
                                            if (m15435a != null) {
                                                treeSet.add((String) m15435a);
                                            }
                                        }
                                    }
                                } else {
                                    str = "2G/3G";
                                    Object m15433a3 = C3596bn.m15433a(jSONObject.optString("m"), jSONObject.optString(C3325bt.f14196aN), new Class[]{Integer.TYPE}, m15433a, new Object[]{0});
                                    if (m15433a3 instanceof List) {
                                        Field m15437a3 = C3596bn.m15437a(jSONObject.optString("v"), jSONObject.optString("n"));
                                        Iterator it2 = ((List) m15433a3).iterator();
                                        while (it2.hasNext()) {
                                            Object m15435a2 = C3596bn.m15435a(m15437a3, it2.next());
                                            if (m15435a2 != null) {
                                                treeSet.add((String) m15435a2);
                                            }
                                        }
                                    }
                                }
                                if (treeSet.isEmpty()) {
                                    C3678f.m15748a(byteArrayOutputStream2);
                                    return;
                                }
                                if (m15433a == null) {
                                    C3678f.m15748a(byteArrayOutputStream2);
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                JSONArray jSONArray = new JSONArray();
                                Iterator it3 = treeSet.iterator();
                                int i11 = 0;
                                while (it3.hasNext()) {
                                    Object m15742a = C3678f.m15742a(m15433a, (String) it3.next());
                                    if (m15742a != null) {
                                        C3690l c3690l = new C3690l(m15433a, m15742a);
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("a", c3690l.f16535b);
                                        jSONObject2.put(C3325bt.f14186aD, c3690l.f16534a);
                                        jSONObject2.put("v", c3690l.f16536c);
                                        jSONObject2.put("t", c3690l.f16538e);
                                        jSONObject2.put(C3325bt.f14196aN, c3690l.f16537d);
                                        jSONArray.put(jSONObject2);
                                        i11++;
                                        try {
                                            if (jSONArray.length() == max) {
                                                arrayList.add(jSONArray);
                                                jSONArray = new JSONArray();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            byteArrayOutputStream = byteArrayOutputStream2;
                                            try {
                                                UPLog.m15197e("App2", th.getMessage());
                                                return;
                                            } finally {
                                                C3678f.m15748a(byteArrayOutputStream);
                                            }
                                        }
                                    }
                                }
                                if (jSONArray.length() > 0) {
                                    arrayList.add(jSONArray);
                                }
                                if (arrayList.isEmpty()) {
                                    C3678f.m15748a(byteArrayOutputStream2);
                                    return;
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put(C3325bt.f14220al, UMUtils.getZid(m15840a));
                                jSONObject3.put("appkey", appkey);
                                jSONObject3.put(C3325bt.f14265g, UMUtils.getUMId(m15840a));
                                jSONObject3.put("v", "3.1");
                                jSONObject3.put("sdk_v", MsgConstant.SDK_VERSION);
                                jSONObject3.put("os_v", Build.VERSION.RELEASE);
                                jSONObject3.put(Constants.KEY_BRAND, C3637d.m15607f());
                                jSONObject3.put(Constants.KEY_MODEL, C3637d.m15603d());
                                String uuid = UUID.randomUUID().toString();
                                jSONObject3.put("uuid", uuid);
                                jSONObject3.put("smart_id", uuid);
                                jSONObject3.put("src", "push");
                                jSONObject3.put(Constants.KEY_IMEI, DeviceConfig.getImeiNew(m15840a));
                                try {
                                    jSONObject3.put("oaid", DeviceConfig.getOaid(m15840a));
                                } catch (Throwable unused) {
                                }
                                try {
                                    jSONObject3.put("idfa", DeviceConfig.getIdfa(m15840a));
                                } catch (Throwable unused2) {
                                }
                                jSONObject3.put("android_id", DeviceConfig.getAndroidId(m15840a));
                                jSONObject3.put("pkg", m15840a.getPackageName());
                                jSONObject3.put("app_v", UMUtils.getAppVersionName(m15840a));
                                jSONObject3.put("board", C3637d.m15605e());
                                try {
                                    Locale locale = UMUtils.getLocale(m15840a);
                                    if (locale != null) {
                                        jSONObject3.put("os_lang", locale.getLanguage());
                                    }
                                } catch (Throwable unused3) {
                                }
                                jSONObject3.put("c_ts", System.currentTimeMillis());
                                jSONObject3.put("total", i11);
                                try {
                                    jSONObject3.put("os_i", Build.VERSION.SDK_INT);
                                    jSONObject3.put("os_t", m15840a.getApplicationInfo().targetSdkVersion);
                                    if (C3678f.m15758f(m15840a)) {
                                        i10 = 1;
                                    } else {
                                        i10 = 0;
                                    }
                                    jSONObject3.put("grant", i10);
                                } catch (Throwable unused4) {
                                }
                                try {
                                    jSONObject3.put("os", "Android");
                                    String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(m15840a);
                                    if ("Wi-Fi".equals(networkAccessMode[0])) {
                                        jSONObject3.put(C3325bt.f14172Q, "wifi");
                                    } else {
                                        String str2 = str;
                                        if (str2.equals(networkAccessMode[0])) {
                                            jSONObject3.put(C3325bt.f14172Q, str2);
                                        } else {
                                            jSONObject3.put(C3325bt.f14172Q, "unknown");
                                        }
                                    }
                                    if (!"".equals(networkAccessMode[1])) {
                                        jSONObject3.put("sub_access", networkAccessMode[1]);
                                    }
                                    jSONObject3.put(C3325bt.f14277s, DeviceConfig.getAppName(m15840a));
                                } catch (Throwable unused5) {
                                }
                                try {
                                    String[] split = RunnableC3694n.this.f16545a.optString(C3417a.f14999u).split(",");
                                    JSONArray jSONArray2 = new JSONArray();
                                    for (String str3 : split) {
                                        jSONArray2.put(str3);
                                    }
                                    jSONObject3.put(C3417a.f14999u, jSONArray2);
                                    jSONObject3.put(C3417a.f14996r, RunnableC3694n.this.f16545a.optString(C3417a.f14996r));
                                    jSONObject3.put(C3417a.f14997s, RunnableC3694n.this.f16545a.optString(C3417a.f14997s));
                                    String optString = RunnableC3694n.this.f16545a.optString("actionName");
                                    String optString2 = RunnableC3694n.this.f16545a.optString(C3417a.f14998t);
                                    if (!TextUtils.isEmpty(optString2)) {
                                        JSONArray jSONArray3 = new JSONArray(optString2);
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put(optString, jSONArray3);
                                        jSONObject3.put(C3417a.f14998t, jSONObject4);
                                    }
                                } catch (Throwable unused6) {
                                }
                                Iterator it4 = arrayList.iterator();
                                int i12 = 0;
                                while (it4.hasNext()) {
                                    JSONArray jSONArray4 = (JSONArray) it4.next();
                                    i12++;
                                    jSONObject3.put(C3417a.f15000v, i12);
                                    jSONObject3.put("apl", jSONArray4);
                                    try {
                                        C3680g.m15765b(jSONObject3, "https://yumao.puata.info/cc_info", appkey);
                                    } catch (Exception e10) {
                                        throw e10;
                                    }
                                }
                                C3678f.m15748a(byteArrayOutputStream2);
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
            });
        } catch (Throwable unused) {
        }
    }
}
