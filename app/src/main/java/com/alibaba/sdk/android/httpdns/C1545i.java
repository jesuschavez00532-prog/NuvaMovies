package com.alibaba.sdk.android.httpdns;

import android.util.Log;

/* renamed from: com.alibaba.sdk.android.httpdns.i */
/* loaded from: classes.dex */
public class C1545i {

    /* renamed from: a */
    private static ILogger f5958a = null;

    /* renamed from: c */
    private static int f5959c = -1;

    /* renamed from: c */
    private static boolean f5960c;

    /* renamed from: a */
    public static void m7163a(Throwable th) {
        if (!f5960c || th == null) {
            return;
        }
        th.printStackTrace();
    }

    /* renamed from: c */
    private static String m7164c() {
        try {
            if (f5959c == -1) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int length = stackTrace.length;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (stackTrace[i10].getMethodName().equals("getTraceInfo")) {
                        f5959c = i11 + 1;
                        break;
                    }
                    i11++;
                    i10++;
                }
            }
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[f5959c + 1];
            return stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + " - [" + stackTraceElement.getMethodName() + "]";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static void m7165d(String str) {
        if (f5960c && str != null) {
            Log.d("HttpDnsSDK", Thread.currentThread().getId() + " - " + m7164c() + " - " + str);
        }
        ILogger iLogger = f5958a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    /* renamed from: e */
    public static void m7166e(String str) {
        if (f5960c && str != null) {
            Log.i("HttpDnsSDK", Thread.currentThread().getId() + " - " + m7164c() + " - " + str);
        }
        ILogger iLogger = f5958a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    /* renamed from: f */
    public static void m7167f(String str) {
        if (f5960c && str != null) {
            Log.e("HttpDnsSDK", Thread.currentThread().getId() + " - " + m7164c() + " - " + str);
        }
        ILogger iLogger = f5958a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void setLogEnabled(boolean z10) {
        synchronized (C1545i.class) {
            f5960c = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setLogger(ILogger iLogger) {
        f5958a = iLogger;
    }
}
