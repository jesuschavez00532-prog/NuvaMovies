package com.lzy.okgo.utils;

import android.util.Log;

/* loaded from: classes2.dex */
public class OkLogger {
    private static boolean isLogEnable = true;
    private static String tag = "OkGo";

    /* renamed from: d */
    public static void m11758d(String str) {
        m11759d(tag, str);
    }

    public static void debug(boolean z10) {
        debug(tag, z10);
    }

    /* renamed from: e */
    public static void m11760e(String str) {
        m11761e(tag, str);
    }

    /* renamed from: i */
    public static void m11762i(String str) {
        m11763i(tag, str);
    }

    public static void printStackTrace(Throwable th) {
        if (isLogEnable && th != null) {
            th.printStackTrace();
        }
    }

    /* renamed from: v */
    public static void m11764v(String str) {
        m11765v(tag, str);
    }

    /* renamed from: w */
    public static void m11766w(String str) {
        m11767w(tag, str);
    }

    /* renamed from: d */
    public static void m11759d(String str, String str2) {
        if (isLogEnable) {
            Log.d(str, str2);
        }
    }

    public static void debug(String str, boolean z10) {
        tag = str;
        isLogEnable = z10;
    }

    /* renamed from: e */
    public static void m11761e(String str, String str2) {
        if (isLogEnable) {
            Log.e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m11763i(String str, String str2) {
        if (isLogEnable) {
            Log.i(str, str2);
        }
    }

    /* renamed from: v */
    public static void m11765v(String str, String str2) {
        if (isLogEnable) {
            Log.v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m11767w(String str, String str2) {
        if (isLogEnable) {
            Log.w(str, str2);
        }
    }
}
