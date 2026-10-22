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
import com.umeng.message.MessageSharedPrefs;
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
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.m */
/* loaded from: classes3.dex */
final class RunnableC3692m implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        if (!C3678f.f16509a || C3678f.f16511c) {
            return;
        }
        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(C3706y.m15840a());
        if (messageSharedPrefs.f15771c == null) {
            try {
                if (C3678f.m15753b(messageSharedPrefs.f15769a)) {
                    messageSharedPrefs.f15770b.m15395a("smart_lc", messageSharedPrefs.m15181n() + 1);
                }
            } finally {
                messageSharedPrefs.f15771c = Boolean.TRUE;
            }
        }
        if (messageSharedPrefs.m15181n() < messageSharedPrefs.f15770b.m15399b("smart_lt", 0) || !messageSharedPrefs.m15164a("smart_")) {
            return;
        }
        try {
            final Application m15840a = C3706y.m15840a();
            final String appkey = UMUtils.getAppkey(m15840a);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C3325bt.f14220al, UMUtils.getZid(m15840a));
            try {
                jSONObject2.put(Constants.KEY_IMEI, DeviceConfig.getImeiNew(m15840a));
                jSONObject2.put("oaid", DeviceConfig.getOaid(m15840a));
            } catch (Throwable unused) {
            }
            try {
                jSONObject2.put("idfa", DeviceConfig.getIdfa(m15840a));
            } catch (Throwable unused2) {
            }
            jSONObject2.put(C3325bt.f14265g, C3637d.m15618k(m15840a));
            jSONObject2.put("android_id", C3637d.m15606e(m15840a));
            jSONObject2.put("sdk_v", MsgConstant.SDK_VERSION);
            jSONObject2.put("os_v", Build.VERSION.RELEASE);
            jSONObject2.put("lvl", Build.VERSION.SDK_INT);
            String[] networkAccessMode = UMUtils.getNetworkAccessMode(m15840a);
            if (TextUtils.isEmpty(networkAccessMode[0])) {
                networkAccessMode[0] = "Unknown";
            }
            jSONObject2.put("net", networkAccessMode[0]);
            jSONObject2.put(Constants.KEY_BRAND, C3637d.m15607f());
            long m15400b = messageSharedPrefs.f15770b.m15400b("smart_ts", 0L);
            if (m15400b > 0) {
                jSONObject2.put("last", m15400b);
            }
            try {
                jSONObject = C3680g.m15764a(jSONObject2, "https://ccs.umeng.com/aa", appkey, false);
            } catch (Exception unused3) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                messageSharedPrefs.m15158a(7200L);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                messageSharedPrefs.m15158a(7200L);
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("aa");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            int optInt = optJSONObject2.optInt("launch", 5);
            messageSharedPrefs.f15770b.m15394a("smart_lt", optInt);
            if (messageSharedPrefs.m15181n() < optInt) {
                return;
            }
            messageSharedPrefs.m15158a(optJSONObject.optLong("ttl", 86400L));
            final long optLong = optJSONObject.optLong("id", -1L);
            if (optLong <= 0) {
                return;
            }
            final int max = Math.max(optJSONObject2.optInt(C3417a.f15000v, 300), 100);
            final int optInt2 = optJSONObject2.optInt(C3417a.f15001w, 1);
            int optInt3 = optJSONObject2.optInt("delay");
            if (optInt2 != 1 && optInt2 != 2) {
                return;
            }
            C3581b.m15376b(new Runnable() { // from class: com.umeng.message.proguard.m.1
                @Override // java.lang.Runnable
                public final void run() {
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
                            JSONObject jSONObject3 = new JSONObject(byteArrayOutputStream2.toString());
                            Object m15433a = C3596bn.m15433a(jSONObject3.optString(C3325bt.f14194aL), jSONObject3.optString(C3325bt.f14186aD), null, m15840a, null);
                            try {
                                if (1 == optInt2) {
                                    Object m15433a2 = C3596bn.m15433a(jSONObject3.optString("m"), jSONObject3.optString("q"), new Class[]{C3596bn.m15432a(jSONObject3.optString(C3325bt.f14191aI)), Integer.TYPE}, m15433a, new Object[]{C3596bn.m15434a(jSONObject3.optString(C3325bt.f14191aI), (Class<?>[]) new Class[]{String.class}, new Object[]{jSONObject3.optString("a")}), 0});
                                    if (m15433a2 instanceof List) {
                                        Field m15437a = C3596bn.m15437a(jSONObject3.optString("r"), jSONObject3.optString(C3325bt.f14190aH));
                                        Field m15437a2 = C3596bn.m15437a(jSONObject3.optString("t"), jSONObject3.optString("n"));
                                        Iterator it = ((List) m15433a2).iterator();
                                        while (it.hasNext()) {
                                            Object m15435a = C3596bn.m15435a(m15437a2, C3596bn.m15435a(m15437a, it.next()));
                                            if (m15435a != null) {
                                                treeSet.add((String) m15435a);
                                            }
                                        }
                                    }
                                } else {
                                    Object m15433a3 = C3596bn.m15433a(jSONObject3.optString("m"), jSONObject3.optString(C3325bt.f14196aN), new Class[]{Integer.TYPE}, m15433a, new Object[]{0});
                                    if (m15433a3 instanceof List) {
                                        Field m15437a3 = C3596bn.m15437a(jSONObject3.optString("v"), jSONObject3.optString("n"));
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
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put("a", c3690l.f16535b);
                                        jSONObject4.put(C3325bt.f14186aD, c3690l.f16534a);
                                        jSONObject4.put("v", c3690l.f16536c);
                                        jSONObject4.put("t", c3690l.f16538e);
                                        jSONObject4.put(C3325bt.f14196aN, c3690l.f16537d);
                                        jSONArray.put(jSONObject4);
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
                                                UPLog.m15197e("App", th.getMessage());
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
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put(C3325bt.f14220al, UMUtils.getZid(m15840a));
                                jSONObject5.put("appkey", appkey);
                                jSONObject5.put(C3325bt.f14265g, C3637d.m15618k(m15840a));
                                jSONObject5.put("v", "2.1");
                                jSONObject5.put("sdk_v", MsgConstant.SDK_VERSION);
                                jSONObject5.put("os_v", Build.VERSION.RELEASE);
                                jSONObject5.put(Constants.KEY_BRAND, C3637d.m15607f());
                                jSONObject5.put(Constants.KEY_MODEL, C3637d.m15603d());
                                jSONObject5.put("smart_id", optLong);
                                jSONObject5.put("src", "push");
                                jSONObject5.put(Constants.KEY_IMEI, DeviceConfig.getImeiNew(m15840a));
                                try {
                                    jSONObject5.put("oaid", DeviceConfig.getOaid(m15840a));
                                } catch (Throwable unused4) {
                                }
                                try {
                                    jSONObject5.put("idfa", DeviceConfig.getIdfa(m15840a));
                                } catch (Throwable unused5) {
                                }
                                jSONObject5.put("android_id", C3637d.m15606e(m15840a));
                                jSONObject5.put("pkg", m15840a.getPackageName());
                                jSONObject5.put("app_v", UMUtils.getAppVersionName(m15840a));
                                jSONObject5.put("board", C3637d.m15605e());
                                try {
                                    Locale locale = UMUtils.getLocale(m15840a);
                                    if (locale != null) {
                                        jSONObject5.put("os_lang", locale.getLanguage());
                                    }
                                } catch (Throwable unused6) {
                                }
                                jSONObject5.put("c_ts", System.currentTimeMillis());
                                jSONObject5.put("total", i11);
                                try {
                                    jSONObject5.put("os_i", Build.VERSION.SDK_INT);
                                    jSONObject5.put("os_t", m15840a.getApplicationInfo().targetSdkVersion);
                                    if (C3678f.m15758f(m15840a)) {
                                        i10 = 1;
                                    } else {
                                        i10 = 0;
                                    }
                                    jSONObject5.put("grant", i10);
                                } catch (Throwable unused7) {
                                }
                                Iterator it4 = arrayList.iterator();
                                int i12 = 0;
                                while (it4.hasNext()) {
                                    JSONArray jSONArray2 = (JSONArray) it4.next();
                                    i12++;
                                    jSONObject5.put(C3417a.f15000v, i12);
                                    jSONObject5.put("data", jSONArray2);
                                    try {
                                        C3680g.m15765b(jSONObject5, "https://sss.umeng.com/api/v2/al", appkey);
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
            }, optInt3, TimeUnit.SECONDS);
        } catch (Throwable unused4) {
        }
    }
}
