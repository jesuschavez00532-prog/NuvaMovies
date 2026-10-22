package com.umeng.commonsdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.C3463a;
import com.umeng.commonsdk.internal.utils.C3466d;
import com.umeng.commonsdk.internal.utils.C3472j;
import com.umeng.commonsdk.internal.utils.C3473k;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C3520d;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.d */
/* loaded from: classes3.dex */
public class C3456d {
    /* renamed from: a */
    public static void m14627a(Context context) {
        try {
            ULog.m14804i("walle", "[internal] workEvent send envelope");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3325bt.f14202aT, C3452a.f15265e);
            JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, m14634d(context), UMServerURL.PATH_ANALYTICS, C3325bt.f14191aI, C3452a.f15265e);
            if (buildEnvelopeWithExtHeader == null || buildEnvelopeWithExtHeader.has("exception")) {
                return;
            }
            ULog.m14804i("walle", "[internal] workEvent send envelope back, result is ok");
        } catch (Exception e10) {
            UMCrashManager.reportCrash(context, e10);
        }
    }

    /* renamed from: b */
    public static void m14631b(Context context) {
        ULog.m14804i("walle", "[internal] begin by stateful--->>>");
        if (context != null) {
            m14639i(context);
        }
    }

    /* renamed from: c */
    public static void m14633c(Context context) {
        ULog.m14804i("walle", "[internal] begin by stateful--->>>");
        if (context == null || !UMEnvelopeBuild.getTransmissionSendFlag()) {
            return;
        }
        m14639i(context);
    }

    /* renamed from: d */
    public static JSONObject m14634d(Context context) {
        JSONObject m14630b;
        JSONArray m14637g;
        JSONObject m14626a;
        JSONArray m14641k;
        JSONArray m14640j;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                if (FieldManager.allow(C3520d.f15641L) && (m14640j = m14640j(applicationContext)) != null && m14640j.length() > 0) {
                    jSONObject2.put("rs", m14640j);
                }
            } catch (Exception e10) {
                UMCrashManager.reportCrash(applicationContext, e10);
            }
            try {
                if (FieldManager.allow(C3520d.f15673aq) && (m14641k = m14641k(applicationContext)) != null && m14641k.length() > 0) {
                    jSONObject2.put("by", m14641k);
                }
            } catch (Exception e11) {
                UMCrashManager.reportCrash(applicationContext, e11);
            }
            try {
                m14628a(applicationContext, jSONObject2);
            } catch (Exception e12) {
                UMCrashManager.reportCrash(applicationContext, e12);
            }
            try {
                m14632b(applicationContext, jSONObject2);
            } catch (Exception e13) {
                UMCrashManager.reportCrash(applicationContext, e13);
            }
            try {
                if (FieldManager.allow(C3520d.f15674ar) && (m14626a = m14626a()) != null && m14626a.length() > 0) {
                    jSONObject2.put("build", m14626a);
                }
            } catch (Exception e14) {
                UMCrashManager.reportCrash(applicationContext, e14);
            }
            try {
                JSONObject m14635e = m14635e(applicationContext);
                if (m14635e != null && m14635e.length() > 0) {
                    jSONObject2.put("scr", m14635e);
                }
            } catch (Exception e15) {
                UMCrashManager.reportCrash(applicationContext, e15);
            }
            try {
                JSONObject m14636f = m14636f(applicationContext);
                if (m14636f != null && m14636f.length() > 0) {
                    jSONObject2.put("sinfo", m14636f);
                }
            } catch (Exception e16) {
                UMCrashManager.reportCrash(applicationContext, e16);
            }
            try {
                if (UMConfigure.shouldCollectApl()) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "shouldCollectApl switch is on.");
                    if (FieldManager.allow(C3520d.f15665ai) && (m14637g = m14637g(applicationContext)) != null && m14637g.length() > 0) {
                        jSONObject2.put("appls", m14637g);
                    }
                } else {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "shouldCollectApl switch is off.");
                }
            } catch (Exception e17) {
                UMCrashManager.reportCrash(applicationContext, e17);
            }
            try {
                JSONObject m14638h = m14638h(applicationContext);
                if (m14638h != null && m14638h.length() > 0) {
                    jSONObject2.put("mem", m14638h);
                }
            } catch (Exception e18) {
                UMCrashManager.reportCrash(applicationContext, e18);
            }
            try {
                if (FieldManager.allow(C3520d.f15675as) && (m14630b = m14630b()) != null && m14630b.length() > 0) {
                    jSONObject2.put(C3325bt.f14281w, m14630b);
                }
            } catch (Exception unused) {
            }
            try {
                jSONObject.put(C3325bt.f14183aA, jSONObject2);
            } catch (JSONException e19) {
                UMCrashManager.reportCrash(applicationContext, e19);
            }
        }
        return jSONObject;
    }

    /* renamed from: e */
    public static JSONObject m14635e(Context context) {
        DisplayMetrics displayMetrics;
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                jSONObject.put("a_st_h", C3463a.m14654c(context));
                jSONObject.put("a_nav_h", C3463a.m14657d(context));
                if (context.getResources() != null && (displayMetrics = context.getResources().getDisplayMetrics()) != null) {
                    jSONObject.put("a_den", displayMetrics.density);
                    jSONObject.put("a_dpi", displayMetrics.densityDpi);
                }
            } catch (Exception e10) {
                UMCrashManager.reportCrash(context, e10);
            }
        }
        return jSONObject;
    }

    /* renamed from: f */
    public static JSONObject m14636f(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            String packageName = applicationContext.getPackageName();
            try {
                jSONObject.put("a_fit", C3463a.m14649a(applicationContext, packageName));
                jSONObject.put("a_alut", C3463a.m14651b(applicationContext, packageName));
                jSONObject.put("a_c", C3463a.m14656c(applicationContext, packageName));
                jSONObject.put("a_uid", C3463a.m14658d(applicationContext, packageName));
                if (C3463a.m14650a()) {
                    jSONObject.put("a_root", 1);
                } else {
                    jSONObject.put("a_root", 0);
                }
                jSONObject.put("tf", C3463a.m14652b());
                jSONObject.put("s_fs", C3463a.m14648a(applicationContext));
                jSONObject.put("a_meid", DeviceConfig.getMeid(applicationContext));
                jSONObject.put("a_imsi", DeviceConfig.getImsi(applicationContext));
                jSONObject.put("st", C3463a.m14655c());
                String simICCID = DeviceConfig.getSimICCID(applicationContext);
                if (!TextUtils.isEmpty(simICCID)) {
                    try {
                        jSONObject.put("a_iccid", simICCID);
                    } catch (Exception unused) {
                    }
                }
                String secondSimIMEi = DeviceConfig.getSecondSimIMEi(applicationContext);
                if (!TextUtils.isEmpty(secondSimIMEi)) {
                    try {
                        jSONObject.put("a_simei", secondSimIMEi);
                    } catch (Exception unused2) {
                    }
                }
                jSONObject.put("hn", C3463a.m14659d());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e10) {
                UMCrashManager.reportCrash(applicationContext, e10);
            }
        }
        return jSONObject;
    }

    /* renamed from: g */
    public static JSONArray m14637g(Context context) {
        Context applicationContext;
        List<C3463a.a> m14662f;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (m14662f = C3463a.m14662f((applicationContext = context.getApplicationContext()))) != null && !m14662f.isEmpty()) {
            for (C3463a.a aVar : m14662f) {
                if (aVar != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a_pn", aVar.f15311a);
                        jSONObject.put("a_la", aVar.f15312b);
                        jSONObject.put("ts", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Exception e10) {
                        UMCrashManager.reportCrash(applicationContext, e10);
                    }
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: h */
    public static JSONObject m14638h(Context context) {
        Context applicationContext;
        ActivityManager.MemoryInfo m14663g;
        JSONObject jSONObject = new JSONObject();
        if (context != null && (m14663g = C3463a.m14663g((applicationContext = context.getApplicationContext()))) != null) {
            try {
                jSONObject.put("t", m14663g.totalMem);
                jSONObject.put("f", m14663g.availMem);
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e10) {
                UMCrashManager.reportCrash(applicationContext, e10);
            }
        }
        return jSONObject;
    }

    /* renamed from: i */
    private static void m14639i(Context context) {
        try {
            if (UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                UMWorkDispatch.sendEvent(context, C3452a.f15266f, C3453b.m14605a(context).m14606a(), null, 5000L);
            }
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> 冷启动：5秒后触发2号数据仓遗留信封检查动作。");
            UMWorkDispatch.sendEvent(context, C3452a.f15282v, C3453b.m14605a(context).m14606a(), null, 5000L);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: j */
    private static JSONArray m14640j(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        JSONArray jSONArray = null;
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
            if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null || runningServices.isEmpty()) {
                return null;
            }
            for (int i10 = 0; i10 < runningServices.size(); i10++) {
                if (runningServices.get(i10) != null && runningServices.get(i10).service != null && runningServices.get(i10).service.getClassName() != null && runningServices.get(i10).service.getPackageName() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sn", runningServices.get(i10).service.getClassName().toString());
                        jSONObject.put("pn", runningServices.get(i10).service.getPackageName().toString());
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
            }
            if (jSONArray != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ts", System.currentTimeMillis());
                    jSONObject2.put("ls", jSONArray);
                } catch (JSONException unused2) {
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("sers", jSONObject2);
                } catch (JSONException unused3) {
                }
                JSONArray jSONArray2 = new JSONArray();
                try {
                    jSONArray2.put(jSONObject3);
                    return jSONArray2;
                } catch (Throwable th) {
                    th = th;
                    jSONArray = jSONArray2;
                    UMCrashManager.reportCrash(context, th);
                    return jSONArray;
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: k */
    private static JSONArray m14641k(Context context) {
        JSONArray jSONArray = new JSONArray();
        String m14684a = C3472j.m14684a(context);
        if (!TextUtils.isEmpty(m14684a)) {
            try {
                jSONArray.put(new JSONObject(m14684a));
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    private static JSONObject m14630b() {
        try {
            C3466d.a m14672a = C3466d.m14672a();
            if (m14672a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pro", m14672a.f15325a);
                jSONObject.put("pla", m14672a.f15326b);
                jSONObject.put("cpus", m14672a.f15327c);
                jSONObject.put("fea", m14672a.f15328d);
                jSONObject.put(C3309bd.f14096c, m14672a.f15329e);
                jSONObject.put("arc", m14672a.f15330f);
                jSONObject.put("var", m14672a.f15331g);
                jSONObject.put("par", m14672a.f15332h);
                jSONObject.put("rev", m14672a.f15333i);
                jSONObject.put("har", m14672a.f15334j);
                jSONObject.put("rev", m14672a.f15335k);
                jSONObject.put("ser", m14672a.f15336l);
                jSONObject.put("cur_cpu", C3466d.m14675d());
                jSONObject.put("max_cpu", C3466d.m14673b());
                jSONObject.put("min_cpu", C3466d.m14674c());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception unused) {
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m14628a(Context context, JSONObject jSONObject) {
        PackageManager packageManager;
        if (context == null || (packageManager = context.getApplicationContext().getPackageManager()) == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        m14629a(jSONObject, "gp", packageManager.hasSystemFeature("android.hardware.location.gps"));
        m14629a(jSONObject, "to", packageManager.hasSystemFeature("android.hardware.touchscreen"));
        m14629a(jSONObject, "mo", packageManager.hasSystemFeature("android.hardware.telephony"));
        m14629a(jSONObject, "ca", packageManager.hasSystemFeature("android.hardware.camera"));
        m14629a(jSONObject, "fl", packageManager.hasSystemFeature("android.hardware.camera.flash"));
    }

    /* renamed from: a */
    private static void m14629a(JSONObject jSONObject, String str, boolean z10) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (z10) {
                jSONObject.put(str, 1);
            } else {
                jSONObject.put(str, 0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x006b */
    /* JADX WARN: Incorrect condition in loop: B:27:0x0092 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0043 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject m14626a() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.C3456d.m14626a():org.json.JSONObject");
    }

    /* renamed from: b */
    private static void m14632b(Context context, JSONObject jSONObject) {
        if (context != null) {
            String m14688a = C3473k.m14688a(context);
            if (TextUtils.isEmpty(m14688a)) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(m14688a);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (jSONObject2.has(C3473k.f15348d)) {
                    jSONObject.put(C3473k.f15348d, jSONObject2.opt(C3473k.f15348d));
                }
                if (jSONObject2.has(C3473k.f15347c)) {
                    jSONObject.put(C3473k.f15347c, jSONObject2.opt(C3473k.f15347c));
                }
                if (jSONObject2.has(C3473k.f15346b)) {
                    jSONObject.put(C3473k.f15346b, jSONObject2.opt(C3473k.f15346b));
                }
            } catch (Exception unused) {
            }
        }
    }
}
