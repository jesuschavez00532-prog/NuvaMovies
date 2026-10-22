package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.client.AccsConfig;
import com.taobao.accs.common.Constants;

/* renamed from: com.taobao.accs.utl.v */
/* loaded from: classes.dex */
public class C3209v {
    public static final String SP_AGOO_BIND_FILE_NAME = "AGOO_BIND";

    /* renamed from: a */
    static int f13223a = -1;

    /* renamed from: b */
    private static final byte[] f13224b = new byte[0];

    /* renamed from: c */
    private static int f13225c = -1;

    /* renamed from: a */
    public static boolean m13044a(Context context) {
        if (context == null) {
            return false;
        }
        if (f13225c == -1) {
            f13225c = context.getApplicationInfo().targetSdkVersion;
        }
        return f13225c >= 26 && Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: b */
    public static int m13046b(Context context) {
        int i10;
        int i11 = f13223a;
        if (i11 != -1) {
            return i11;
        }
        try {
        } catch (Throwable th) {
            th = th;
            context = null;
        }
        try {
            synchronized (f13224b) {
                try {
                    i10 = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getInt(Constants.SP_KEY_DEBUG_MODE, 0);
                    return i10;
                } catch (Throwable th2) {
                    th = th2;
                    context = null;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        ALog.m12939e("Utils", "getMode", th, new Object[0]);
                        i10 = context;
                        return i10;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: c */
    public static void m13047c(Context context) {
        try {
            synchronized (f13224b) {
                SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                edit.clear();
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.m12939e("Utils", "clearAllSharePreferences", th, new Object[0]);
        }
    }

    /* renamed from: d */
    public static void m13048d(Context context) {
        try {
            UtilityImpl.killService(context);
        } catch (Throwable th) {
            ALog.m12939e("Utils", "killService", th, new Object[0]);
        }
    }

    /* renamed from: e */
    public static boolean m13049e(Context context) {
        boolean z10;
        try {
            z10 = UtilityImpl.isMainProcess(context);
        } catch (Throwable th) {
            ALog.m12939e("Utils", "killservice", th, new Object[0]);
            th.printStackTrace();
            z10 = true;
        }
        ALog.m12941i("Utils", "isMainProcess", "result", Boolean.valueOf(z10));
        return z10;
    }

    /* renamed from: f */
    public static void m13050f(Context context) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("AGOO_BIND", 0).edit();
            edit.clear();
            edit.apply();
        } catch (Exception e10) {
            ALog.m12939e("Utils", "clearAgooBindCache", e10, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m13043a(Context context, int i10) {
        try {
            synchronized (f13224b) {
                f13223a = i10;
                SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                edit.putInt(Constants.SP_KEY_DEBUG_MODE, i10);
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.m12939e("Utils", "setMode", th, new Object[0]);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m13042a() {
        try {
            AccsConfig.build();
        } catch (Throwable th) {
            ALog.m12939e("Utils", "initConfig", th, new Object[0]);
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static String m13041a(Context context, String str, String str2) {
        String str3 = null;
        try {
            synchronized (f13224b) {
                str3 = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString(str, null);
            }
            ALog.m12941i("Utils", "getSpValue", "value", str3);
            if (TextUtils.isEmpty(str3)) {
                ALog.m12940e("Utils", "getSpValue use default!", new Object[0]);
                return str2;
            }
        } catch (Throwable th) {
            ALog.m12939e("Utils", "getSpValue fail", th, new Object[0]);
        }
        return str3;
    }

    /* renamed from: a */
    public static boolean m13045a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
