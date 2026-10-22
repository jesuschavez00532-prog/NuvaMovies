package com.efs.sdk.base.core.util;

import com.efs.sdk.base.core.controller.ControllerCenter;

/* loaded from: classes.dex */
public class Log {
    /* renamed from: d */
    public static void m7721d(String str) {
        m7723d("efs.base", str, null);
    }

    /* renamed from: e */
    public static void m7725e(String str) {
        m7727e("efs.base", str, null);
    }

    /* renamed from: i */
    public static void m7729i(String str) {
        m7731i("efs.base", str, null);
    }

    /* renamed from: v */
    public static void m7733v(String str) {
        m7735v("efs.base", str, null);
    }

    /* renamed from: w */
    public static void m7737w(String str) {
        m7739w("efs.base", str, null);
    }

    /* renamed from: d */
    public static void m7722d(String str, String str2) {
        m7723d(str, str2, null);
    }

    /* renamed from: e */
    public static void m7726e(String str, String str2) {
        m7727e(str, str2, null);
    }

    /* renamed from: i */
    public static void m7730i(String str, String str2) {
        m7731i(str, str2, null);
    }

    /* renamed from: v */
    public static void m7734v(String str, String str2) {
        m7735v(str, str2, null);
    }

    /* renamed from: w */
    public static void m7738w(String str, String str2) {
        m7739w(str, str2, null);
    }

    /* renamed from: d */
    public static void m7724d(String str, Throwable th) {
        m7723d("efs.base", str, th);
    }

    /* renamed from: e */
    public static void m7728e(String str, Throwable th) {
        m7727e("efs.base", str, th);
    }

    /* renamed from: i */
    public static void m7732i(String str, Throwable th) {
        m7731i("efs.base", str, th);
    }

    /* renamed from: v */
    public static void m7736v(String str, Throwable th) {
        m7735v("efs.base", str, th);
    }

    /* renamed from: w */
    public static void m7740w(String str, Throwable th) {
        m7739w("efs.base", str, th);
    }

    /* renamed from: d */
    public static void m7723d(String str, String str2, Throwable th) {
        if (ControllerCenter.getGlobalEnvStruct().isDebug()) {
            if (th == null) {
                android.util.Log.d(str, str2);
            } else {
                android.util.Log.d(str, str2, th);
            }
        }
    }

    /* renamed from: e */
    public static void m7727e(String str, String str2, Throwable th) {
        if (ControllerCenter.getGlobalEnvStruct().isDebug()) {
            if (th == null) {
                android.util.Log.e(str, str2);
            } else {
                android.util.Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: i */
    public static void m7731i(String str, String str2, Throwable th) {
        if (ControllerCenter.getGlobalEnvStruct().isDebug()) {
            if (th == null) {
                android.util.Log.i(str, str2);
            } else {
                android.util.Log.i(str, str2, th);
            }
        }
    }

    /* renamed from: v */
    public static void m7735v(String str, String str2, Throwable th) {
        if (ControllerCenter.getGlobalEnvStruct().isDebug()) {
            if (th == null) {
                android.util.Log.v(str, str2);
            } else {
                android.util.Log.v(str, str2, th);
            }
        }
    }

    /* renamed from: w */
    public static void m7739w(String str, String str2, Throwable th) {
        if (ControllerCenter.getGlobalEnvStruct().isDebug()) {
            if (th == null) {
                android.util.Log.w(str, str2);
            } else {
                android.util.Log.w(str, str2, th);
            }
        }
    }
}
