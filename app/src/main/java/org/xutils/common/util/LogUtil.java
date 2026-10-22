package org.xutils.common.util;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import org.xutils.C6127x;

/* loaded from: classes3.dex */
public class LogUtil {
    public static String customTagPrefix = "x_log";

    private LogUtil() {
    }

    /* renamed from: d */
    public static void m24373d(String str) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.d(generateTag(), str);
    }

    /* renamed from: e */
    public static void m24375e(String str) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.e(generateTag(), str);
    }

    private static String generateTag() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        String className = stackTraceElement.getClassName();
        String format = String.format(Locale.getDefault(), "%s.%s(L:%d)", className.substring(className.lastIndexOf(".") + 1), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
        if (!TextUtils.isEmpty(customTagPrefix)) {
            return customTagPrefix + ":" + format;
        }
        return format;
    }

    /* renamed from: i */
    public static void m24377i(String str) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i(generateTag(), str);
    }

    /* renamed from: v */
    public static void m24379v(String str) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.v(generateTag(), str);
    }

    /* renamed from: w */
    public static void m24381w(String str) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w(generateTag(), str);
    }

    public static void wtf(String str) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.wtf(generateTag(), str);
    }

    /* renamed from: d */
    public static void m24374d(String str, Throwable th) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.d(generateTag(), str, th);
    }

    /* renamed from: e */
    public static void m24376e(String str, Throwable th) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.e(generateTag(), str, th);
    }

    /* renamed from: i */
    public static void m24378i(String str, Throwable th) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i(generateTag(), str, th);
    }

    /* renamed from: v */
    public static void m24380v(String str, Throwable th) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.v(generateTag(), str, th);
    }

    /* renamed from: w */
    public static void m24382w(String str, Throwable th) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.w(generateTag(), str, th);
    }

    public static void wtf(String str, Throwable th) {
        if (!C6127x.isDebug() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.wtf(generateTag(), str, th);
    }

    /* renamed from: w */
    public static void m24383w(Throwable th) {
        if (C6127x.isDebug()) {
            Log.w(generateTag(), th);
        }
    }

    public static void wtf(Throwable th) {
        if (C6127x.isDebug()) {
            Log.wtf(generateTag(), th);
        }
    }
}
