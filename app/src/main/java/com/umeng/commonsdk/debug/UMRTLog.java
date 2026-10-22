package com.umeng.commonsdk.debug;

import android.util.Log;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.commonsdk.UMConfigure;

/* loaded from: classes3.dex */
public class UMRTLog {
    private static final String RTLOG_ENABLE = "1";
    private static final String RTLOG_PROP = "debug.umeng.rtlog";
    public static final String RTLOG_TAG = "MobclickRT";

    private UMRTLog() {
    }

    /* renamed from: d */
    public static void m14567d(String str, String str2) {
        if (UMConfigure.shouldOutput()) {
            Log.d(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: e */
    public static void m14568e(String str, String str2) {
        if (UMConfigure.shouldOutput()) {
            Log.e(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: i */
    public static void m14569i(String str, String str2) {
        if (UMConfigure.shouldOutput()) {
            Log.i(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: sd */
    public static void m14570sd(String str, String str2) {
        if (UMConfigure.shouldOutput()) {
            Log.d(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: se */
    public static void m14571se(String str, String str2) {
        if (UMConfigure.shouldOutput()) {
            Log.e(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: si */
    public static void m14572si(String str, String str2) {
        if (UMConfigure.shouldOutput()) {
            Log.i(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: sv */
    public static void m14573sv(String str, String str2) {
        if (UMConfigure.shouldOutput()) {
            Log.v(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: sw */
    public static void m14574sw(String str, String str2) {
        if (UMConfigure.shouldOutput()) {
            Log.w(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: v */
    public static void m14575v(String str, String str2) {
        if (UMConfigure.shouldOutput()) {
            Log.v(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: w */
    public static void m14576w(String str, String str2) {
        if (UMConfigure.shouldOutput()) {
            Log.w(str, warpperMsg(str2, false));
        }
    }

    private static String warpperMsg(String str, boolean z10) {
        StringBuffer stringBuffer;
        if (!z10) {
            return str;
        }
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length >= 3) {
                String fileName = stackTrace[2].getFileName();
                String methodName = stackTrace[2].getMethodName();
                int lineNumber = stackTrace[2].getLineNumber();
                stringBuffer = new StringBuffer();
                stringBuffer.append(Operator.Operation.LESS_THAN);
                stringBuffer.append(fileName);
                stringBuffer.append(":");
                stringBuffer.append(methodName);
                stringBuffer.append(":");
                stringBuffer.append(lineNumber);
                stringBuffer.append("> ");
                stringBuffer.append(str);
            } else {
                stringBuffer = null;
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
