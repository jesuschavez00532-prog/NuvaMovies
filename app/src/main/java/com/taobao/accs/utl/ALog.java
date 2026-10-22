package com.taobao.accs.utl;

import android.util.Log;

/* loaded from: classes.dex */
public class ALog {
    public static volatile boolean isPrintLog = true;
    private static final String preTag = "NAccs.";
    private static volatile ILog sLog;

    /* loaded from: classes.dex */
    public interface ILog {
        /* renamed from: d */
        void m12945d(String str, String str2);

        /* renamed from: e */
        void m12946e(String str, String str2);

        /* renamed from: e */
        void m12947e(String str, String str2, Throwable th);

        /* renamed from: i */
        void m12948i(String str, String str2);

        boolean isPrintLog(int i10);

        boolean isValid();

        void setLogLevel(int i10);

        /* renamed from: w */
        void m12949w(String str, String str2);

        /* renamed from: w */
        void m12950w(String str, String str2, Throwable th);
    }

    /* loaded from: classes.dex */
    public enum Level {
        V,
        D,
        I,
        W,
        E,
        L
    }

    private static String buildLogMsg(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(str);
        }
        if (objArr != null) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= objArr.length) {
                    break;
                }
                sb2.append(" ");
                sb2.append(formatKv(objArr[i10], objArr[i11]));
                i10 = i11 + 1;
            }
            if (i10 == objArr.length - 1) {
                sb2.append(" ");
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    private static String buildLogTag(String str) {
        return preTag + str;
    }

    /* renamed from: d */
    public static void m12938d(String str, String str2, Object... objArr) {
        if (isPrintLog()) {
            String buildLogTag = buildLogTag(str);
            String buildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.m12945d(buildLogTag, buildLogMsg);
            } else {
                Log.d(buildLogTag, buildLogMsg);
            }
        }
    }

    /* renamed from: e */
    public static void m12940e(String str, String str2, Object... objArr) {
        if (isPrintLog()) {
            String buildLogTag = buildLogTag(str);
            String buildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.m12946e(buildLogTag, buildLogMsg);
            } else {
                Log.e(buildLogTag, buildLogMsg);
            }
        }
    }

    private static String formatKv(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb2.append(obj);
        sb2.append(":");
        if (obj2 == null) {
            obj2 = "";
        }
        sb2.append(obj2);
        return sb2.toString();
    }

    /* renamed from: i */
    public static void m12941i(String str, String str2, Object... objArr) {
        if (isPrintLog()) {
            String buildLogTag = buildLogTag(str);
            String buildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.m12948i(buildLogTag, buildLogMsg);
            } else {
                Log.i(buildLogTag, buildLogMsg);
            }
        }
    }

    public static boolean isPrintLog() {
        ILog iLog = sLog;
        if (iLog != null) {
            return iLog.isPrintLog(4);
        }
        return isPrintLog;
    }

    public static void setLog(ILog iLog) {
        if (iLog != null && iLog.isValid()) {
            sLog = iLog;
        }
    }

    public static void setPrintLog(boolean z10) {
        isPrintLog = z10;
    }

    /* renamed from: v */
    public static void m12942v(String str, String str2, Object... objArr) {
        if (isPrintLog()) {
            Log.v(buildLogTag(str), buildLogMsg(str2, objArr));
        }
    }

    /* renamed from: w */
    public static void m12944w(String str, String str2, Object... objArr) {
        if (isPrintLog()) {
            String buildLogTag = buildLogTag(str);
            String buildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.m12949w(buildLogTag, buildLogMsg);
            } else {
                Log.w(buildLogTag, buildLogMsg);
            }
        }
    }

    public static boolean isPrintLog(Level level) {
        ILog iLog = sLog;
        if (iLog != null) {
            return iLog.isPrintLog(4);
        }
        return isPrintLog;
    }

    /* renamed from: e */
    public static void m12939e(String str, String str2, Throwable th, Object... objArr) {
        if (isPrintLog()) {
            String buildLogTag = buildLogTag(str);
            String buildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.m12947e(buildLogTag, buildLogMsg, th);
            } else {
                Log.e(buildLogTag, buildLogMsg, th);
            }
        }
    }

    /* renamed from: w */
    public static void m12943w(String str, String str2, Throwable th, Object... objArr) {
        if (isPrintLog()) {
            String buildLogTag = buildLogTag(str);
            String buildLogMsg = buildLogMsg(str2, objArr);
            ILog iLog = sLog;
            if (iLog != null) {
                iLog.m12950w(buildLogTag, buildLogMsg, th);
            } else {
                Log.w(buildLogTag, buildLogMsg, th);
            }
        }
    }
}
