package com.efs.sdk.launch;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.launch.b */
/* loaded from: classes.dex */
public final class C1739b {

    /* renamed from: a */
    private static long f7256a;

    /* renamed from: b */
    private static long f7257b;

    /* renamed from: c */
    private static long f7258c;

    /* renamed from: d */
    private static long f7259d;

    /* renamed from: e */
    private static long f7260e;

    /* renamed from: f */
    private static boolean f7261f;

    /* renamed from: g */
    private static boolean f7262g;

    /* renamed from: h */
    private static boolean f7263h;

    /* renamed from: i */
    private static long f7264i;

    /* renamed from: j */
    private static long f7265j;

    /* renamed from: k */
    private static int f7266k;

    /* renamed from: l */
    private static List<EfsJSONLog> f7267l = new ArrayList();

    /* renamed from: m */
    private static Map<String, Long[]> f7268m = new HashMap();

    /* renamed from: a */
    public static void m7795a(Activity activity, String str, boolean z10) {
        long currentTimeMillis;
        Context applicationContext;
        String name;
        int i10;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_CREATE)) {
            if (z10) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onCreate");
                }
                f7259d = System.currentTimeMillis();
                return;
            }
            return;
        }
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_RE_START)) {
            if (z10 && f7266k == 0) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onRestart");
                }
                f7260e = System.currentTimeMillis();
                f7262g = true;
                return;
            }
            return;
        }
        if (TextUtils.equals(str, LaunchManager.PAGE_ON_START)) {
            if (z10) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onStart");
                }
                f7266k++;
                f7263h = true;
                return;
            }
            return;
        }
        if (!TextUtils.equals(str, LaunchManager.PAGE_ON_RESUME)) {
            if (TextUtils.equals(str, LaunchManager.PAGE_ON_STOP) && z10) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "onStop");
                }
                f7266k--;
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        if (LaunchManager.isDebug) {
            Log.i("LaunchTrace", "onResume");
        }
        if (f7261f) {
            f7261f = false;
            long currentTimeMillis2 = System.currentTimeMillis();
            long j19 = currentTimeMillis2 - f7258c;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "loadTime is ".concat(String.valueOf(j19)));
            }
            long j20 = currentTimeMillis2 - f7256a;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "======>>>>>> coldTime is ".concat(String.valueOf(j20)));
            }
            int i11 = !C1740c.m7806d(activity.getApplicationContext()) ? 1 : 0;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "type is ".concat(String.valueOf(i11)));
            }
            m7796a(activity.getApplicationContext(), i11, activity.getClass().getName(), j20, f7256a, f7257b, f7264i, f7258c, f7265j, currentTimeMillis2, j19, 0L, 0L, f7268m);
        } else if (f7266k == 1) {
            if (f7262g) {
                f7262g = false;
                j18 = System.currentTimeMillis() - f7260e;
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "======>>>>>> hotTime is ".concat(String.valueOf(j18)));
                }
                applicationContext = activity.getApplicationContext();
                name = activity.getClass().getName();
                i10 = 2;
                j10 = 0;
                j11 = 0;
                j12 = 0;
                j13 = 0;
                j14 = 0;
                j15 = 0;
                j16 = 0;
                j17 = 0;
                currentTimeMillis = 0;
            } else if (f7263h) {
                currentTimeMillis = System.currentTimeMillis() - f7259d;
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "======>>>>>> warmTime is ".concat(String.valueOf(currentTimeMillis)));
                }
                applicationContext = activity.getApplicationContext();
                name = activity.getClass().getName();
                i10 = 3;
                j10 = 0;
                j11 = 0;
                j12 = 0;
                j13 = 0;
                j14 = 0;
                j15 = 0;
                j16 = 0;
                j17 = 0;
                j18 = 0;
            }
            m7796a(applicationContext, i10, name, j10, j11, j12, j13, j14, j15, j16, j17, j18, currentTimeMillis, f7268m);
        }
        f7263h = false;
    }

    /* renamed from: b */
    public static void m7801b(String str, long j10) {
        Map<String, Long[]> map = f7268m;
        if (map == null || !map.containsKey(str)) {
            if (LaunchManager.isDebug) {
                Log.e("LaunchTrace", "--->>> method name non-existent or over quantity !");
            }
        } else {
            Long[] lArr = f7268m.get(str);
            lArr[1] = Long.valueOf(j10);
            f7268m.put(str, lArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m7796a(android.content.Context r24, int r25, java.lang.String r26, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, long r45, java.util.Map<java.lang.String, java.lang.Long[]> r47) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.launch.C1739b.m7796a(android.content.Context, int, java.lang.String, long, long, long, long, long, long, long, long, long, long, java.util.Map):void");
    }

    /* renamed from: a */
    public static void m7797a(Context context, String str) {
        if (LaunchManager.isDebug) {
            Log.i("LaunchTrace", "begin sendLaunchCache");
        }
        if (str == null || TextUtils.isEmpty(str)) {
            str = C1740c.m7802a(context);
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(UMCrash.KEY_HEADER_UMID, str);
        if (LaunchManager.getReporter() != null) {
            LaunchManager.getReporter().addPublicParams(hashMap);
        }
        String m7804b = C1740c.m7804b(context);
        if (m7804b != null && !TextUtils.isEmpty(m7804b)) {
            try {
                JSONObject jSONObject = new JSONObject(m7804b);
                jSONObject.put(UMCrash.KEY_HEADER_UMID, str);
                if (m7800a(jSONObject)) {
                    C1740c.m7805c(context);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        List<EfsJSONLog> list = f7267l;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (EfsJSONLog efsJSONLog : f7267l) {
            if (efsJSONLog != null) {
                if (LaunchManager.isDebug) {
                    Log.i("LaunchTrace", "send cache launch report --->>> " + efsJSONLog.generateString());
                }
                EfsReporter reporter = LaunchManager.getReporter();
                if (reporter != null) {
                    reporter.send(efsJSONLog);
                }
            }
        }
        f7267l.clear();
        f7267l = null;
    }

    /* renamed from: a */
    public static void m7798a(String str, long j10) {
        Map<String, Long[]> map = f7268m;
        if (map == null || map.containsKey(str) || f7268m.size() >= 10) {
            if (LaunchManager.isDebug) {
                Log.e("LaunchTrace", "--->>> method name already exists or over quantity !");
            }
        } else {
            Long[] lArr = new Long[2];
            lArr[0] = Long.valueOf(j10);
            f7268m.put(str, lArr);
        }
    }

    /* renamed from: a */
    public static void m7799a(String str, boolean z10) {
        if (TextUtils.equals(str, LaunchManager.APP_CONSTRUCT)) {
            return;
        }
        if (!TextUtils.equals(str, LaunchManager.APP_ATTACH_BASE_CONTEXT)) {
            if (!TextUtils.equals(str, LaunchManager.APP_ON_CREATE) || z10) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            f7258c = currentTimeMillis;
            f7265j = currentTimeMillis - f7257b;
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "buildTime is " + f7265j);
                return;
            }
            return;
        }
        if (z10) {
            f7256a = System.currentTimeMillis();
            f7261f = true;
            return;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        f7257b = currentTimeMillis2;
        f7264i = currentTimeMillis2 - f7256a;
        if (LaunchManager.isDebug) {
            Log.i("LaunchTrace", "initTime is " + f7264i);
        }
    }

    /* renamed from: a */
    private static boolean m7800a(JSONObject jSONObject) {
        try {
            EfsJSONLog efsJSONLog = new EfsJSONLog(Constants.LOG_TYPE_STARTPERF);
            efsJSONLog.put("w_type", jSONObject.opt("w_type"));
            efsJSONLog.put("w_url", jSONObject.opt("w_url"));
            efsJSONLog.put("l_version", jSONObject.opt("l_version"));
            efsJSONLog.put("wl_avgv", jSONObject.opt("wl_avgv"));
            efsJSONLog.put("wd_init", jSONObject.opt("wd_init"));
            efsJSONLog.put("wd_inittm", jSONObject.opt("wd_inittm"));
            efsJSONLog.put("wl_init", jSONObject.opt("wl_init"));
            efsJSONLog.put("wd_build", jSONObject.opt("wd_build"));
            efsJSONLog.put("wd_buildtm", jSONObject.opt("wd_buildtm"));
            efsJSONLog.put("wl_build", jSONObject.opt("wl_build"));
            efsJSONLog.put("wd_page", jSONObject.opt("wd_page"));
            efsJSONLog.put("wd_pagetm", jSONObject.opt("wd_pagetm"));
            efsJSONLog.put("wl_page", jSONObject.opt("wl_page"));
            efsJSONLog.put("userExtra", jSONObject.opt("userExtra"));
            if (LaunchManager.isDebug) {
                Log.i("LaunchTrace", "send cache cold launch report --->>> " + efsJSONLog.generateString());
            }
            EfsReporter reporter = LaunchManager.getReporter();
            if (reporter == null) {
                return false;
            }
            reporter.send(efsJSONLog);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
