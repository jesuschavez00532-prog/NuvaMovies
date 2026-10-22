package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3390l;
import com.umeng.common.C3422b;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public class AnalyticsConfig {
    public static boolean CATCH_EXCEPTION = false;
    public static boolean CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    public static boolean CLEAR_EKV_BL = false;
    public static boolean CLEAR_EKV_WL = false;
    public static final String DEBUG_KEY = "debugkey";
    public static final String DEBUG_MODE_PERIOD = "sendaging";
    public static String GPU_RENDERER = "";
    public static String GPU_VENDER = "";
    public static final String RTD_PERIOD = "period";
    public static final String RTD_START_TIME = "startTime";

    /* renamed from: a */
    static double[] f13864a = null;

    /* renamed from: b */
    private static String f13865b = null;

    /* renamed from: c */
    private static String f13866c = null;

    /* renamed from: d */
    private static String f13867d = null;

    /* renamed from: e */
    private static int f13868e = 0;
    public static boolean enable = true;
    public static long kContinueSessionMillis = 30000;
    public static String mWrapperType;
    public static String mWrapperVersion;
    public static final String RTD_SP_FILE = C3309bd.m13860b().m13863b(C3309bd.f14089A);

    /* renamed from: f */
    private static Object f13869f = new Object();

    /* renamed from: g */
    private static boolean f13870g = false;

    /* renamed from: h */
    private static String f13871h = "";

    /* renamed from: a */
    static void m13624a(String str) {
        f13866c = str;
    }

    public static String getAppkey(Context context) {
        return UMUtils.getAppkey(context);
    }

    public static String getChannel(Context context) {
        return UMUtils.getChannel(context);
    }

    public static String getGameSdkVersion(Context context) {
        try {
            Class<?> cls = Class.forName("com.umeng.analytics.game.GameSdkVersion");
            return (String) cls.getDeclaredField("SDK_VERSION").get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static double[] getLocation() {
        return f13864a;
    }

    public static String getRealTimeDebugKey() {
        String str;
        synchronized (f13869f) {
            str = f13871h;
        }
        return str;
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f13867d)) {
            f13867d = C3422b.m14516a(context).m14526c();
        }
        return f13867d;
    }

    public static int getVerticalType(Context context) {
        if (f13868e == 0) {
            f13868e = C3422b.m14516a(context).m14527d();
        }
        return f13868e;
    }

    public static boolean isRealTimeDebugMode() {
        boolean z10;
        synchronized (f13869f) {
            z10 = f13870g;
        }
        return z10;
    }

    public static void turnOffRealTimeDebug() {
        synchronized (f13869f) {
            f13870g = false;
            f13871h = "";
        }
    }

    public static void turnOnRealTimeDebug(Map<String, String> map) {
        synchronized (f13869f) {
            f13870g = true;
            if (map != null && map.containsKey("debugkey")) {
                f13871h = map.get("debugkey");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13623a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f13867d = str;
            C3422b.m14516a(context).m14522a(f13867d);
        } else {
            UMLog.m14562aq(C3390l.f14727A, 0, "\\|");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13622a(Context context, int i10) {
        f13868e = i10;
        C3422b.m14516a(context).m14521a(f13868e);
    }
}
