package com.p077uc.crashsdk;

import android.os.Looper;
import android.os.Process;
import com.p077uc.crashsdk.export.LogType;
import com.p077uc.crashsdk.p078a.C3251a;
import com.p077uc.crashsdk.p078a.C3256f;
import com.p077uc.crashsdk.p078a.C3257g;
import com.p077uc.crashsdk.p078a.RunnableC3255e;
import java.io.File;
import java.util.Locale;
import org.android.agoo.message.MessageService;

/* loaded from: classes3.dex */
public class JNIBridge {
    private static int addCachedInfo(String str, String str2) {
        return C3250a.m13147b(str, str2);
    }

    private static int addDumpFile(String str, String str2, boolean z10, boolean z11, int i10, boolean z12) {
        return C3250a.m13134a(str, str2, z10, z11, i10, z12);
    }

    private static void addHeaderInfo(String str, String str2) {
        C3250a.m13143a(str, str2);
    }

    public static long cmd(int i10) {
        return nativeCmd(i10, 0L, null, null);
    }

    private static int createCachedInfo(String str, int i10, int i11) {
        return C3250a.m13132a(str, i10, i11);
    }

    private static boolean generateCustomLog(String str, String str2, long j10, String str3, String str4, String str5, String str6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return C3262e.m13435a(stringBuffer, str2, j10, C3250a.m13153c(str3), C3250a.m13153c(str4), C3250a.m13153c(str5), str6);
    }

    protected static String getCallbackInfo(String str, boolean z10) {
        return C3250a.m13137a(str, z10);
    }

    private static String getDatasForClientJavaLog(int i10, String str) {
        boolean equals = "$all$".equals(str);
        if (i10 == 1) {
            if (equals) {
                return C3250a.m13158h();
            }
            return C3250a.m13136a(str);
        }
        if (i10 == 2) {
            if (equals) {
                return C3250a.m13160j();
            }
            return C3250a.m13137a(str, true);
        }
        if (i10 == 3) {
            if (equals) {
                return C3250a.m13162l();
            }
            return C3250a.m13149b(str);
        }
        if (i10 == 4) {
            if (C3262e.m13464d(str)) {
                return "1";
            }
            return MessageService.MSG_DB_READY_REPORT;
        }
        return null;
    }

    private static String getJavaStackTrace(Thread thread, int i10) {
        if (i10 != 0 && i10 == Process.myPid()) {
            thread = Looper.getMainLooper().getThread();
        }
        if (thread != null) {
            return C3262e.m13416a(thread.getStackTrace(), "getJavaStackTrace").toString();
        }
        return null;
    }

    public static native boolean nativeAddCachedInfo(String str, String str2);

    public static native int nativeAddCallbackInfo(String str, int i10, long j10, int i11);

    public static native int nativeAddDumpFile(String str, String str2, boolean z10, boolean z11, int i10, boolean z12);

    public static native void nativeAddHeaderInfo(String str, String str2);

    public static native boolean nativeChangeState(String str, String str2, boolean z10);

    public static native void nativeClientCloseConnection(long j10);

    public static native long nativeClientCreateConnection(String str, String str2, String str3, int i10);

    public static native int nativeClientWriteData(long j10, String str);

    public static native void nativeCloseFile(int i10);

    public static native long nativeCmd(int i10, long j10, String str, Object[] objArr);

    public static native void nativeCrash(int i10, int i11);

    public static native int nativeCreateCachedInfo(String str, int i10, int i11);

    public static native String nativeDumpThreads(String str, long j10);

    public static native int nativeGenerateUnexpLog(long j10, int i10);

    public static native String nativeGet(int i10, long j10, String str);

    public static native String nativeGetCallbackInfo(String str, long j10, int i10, boolean z10);

    public static native boolean nativeIsCrashing();

    public static native boolean nativeLockFile(int i10, boolean z10);

    public static native int nativeLog(int i10, String str, String str2);

    public static native int nativeOpenFile(String str);

    public static native long nativeSet(int i10, long j10, String str, Object[] objArr);

    public static native void nativeSetForeground(boolean z10);

    private static void onCrashLogGenerated(String str, String str2, String str3, boolean z10) {
        boolean equals = C3262e.m13481h().equals(str2);
        boolean equals2 = LogType.NATIVE_TYPE.equals(str3);
        if (!C3262e.m13386F()) {
            if (equals && equals2) {
                try {
                    C3263f.m13547c(true);
                } catch (Throwable th) {
                    C3257g.m13220a(th);
                }
            }
            str = C3262e.m13412a(str);
        }
        C3261d.m13375a(str, str2, str3);
        if (C3262e.m13386F()) {
            return;
        }
        if (!z10 && (equals || !C3264g.m13615t())) {
            if (equals) {
                C3262e.m13450b(equals2);
                return;
            }
            return;
        }
        C3262e.m13436a(false, false);
    }

    private static void onCrashRestarting() {
        C3261d.m13376a(false);
        C3259b.m13309N();
    }

    private static void onKillProcess(String str, int i10, int i11) {
        String str2 = "onKillProcess. SIG: " + i11;
        if (C3262e.m13429a()) {
            C3251a.m13171b("crashsdk", str2);
        } else {
            C3251a.m13168a("crashsdk", str2);
        }
        StringBuilder m13473f = C3262e.m13473f("onKillProcess");
        Locale locale = Locale.US;
        m13473f.insert(0, String.format(locale, "State in disk: '%s'\n", C3259b.m13358p()));
        m13473f.insert(0, String.format(locale, "SIG: %d, fg: %s, exiting: %s, main process: %s, time: %s\n", Integer.valueOf(i11), Boolean.valueOf(C3259b.m13297B()), Boolean.valueOf(C3259b.m13363u()), Boolean.valueOf(C3259b.m13301F()), C3262e.m13493n()));
        m13473f.insert(0, String.format(locale, "Kill PID: %d (%s) by pid: %d (%s) tid: %d (%s)\n", Integer.valueOf(i10), C3262e.m13410a(i10), Integer.valueOf(Process.myPid()), C3262e.m13410a(Process.myPid()), Integer.valueOf(Process.myTid()), Thread.currentThread().getName()));
        String sb2 = m13473f.toString();
        if (C3262e.m13429a()) {
            C3251a.m13171b("crashsdk", sb2);
        } else {
            C3251a.m13168a("crashsdk", sb2);
        }
        if (!C3259b.m13307L()) {
            C3257g.m13224a(new File(str), sb2.getBytes());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String onNativeEvent(int i10, long j10, Object[] objArr) {
        switch (i10) {
            case 1:
                return String.valueOf(Runtime.getRuntime().maxMemory());
            case 2:
                return C3262e.m13460d();
            case 3:
                if (objArr != null && objArr.length == 2) {
                    Object obj = objArr[0];
                    if (obj instanceof String) {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof String) {
                            return C3262e.m13413a((String) obj, (String) obj2);
                        }
                    }
                }
                return null;
            case 4:
                return C3262e.m13476g();
            case 5:
                C3250a.m13146a(true);
                return null;
            case 6:
                return C3257g.m13234d();
            case 7:
                C3256f.m13207a(2, new RunnableC3255e(102), 8000L);
                C3262e.m13501r();
                return null;
            default:
                return null;
        }
    }

    private static int onPreClientCustomLog(String str, String str2, boolean z10) {
        C3264g.m13584a();
        C3262e.m13428a(false);
        if (C3262e.m13434a(str, str2, z10)) {
            return 0;
        }
        C3262e.m13449b(str, str2, z10);
        return 1;
    }

    private static int registerCurrentThread(String str, int i10) {
        return C3250a.m13131a(i10, str);
    }

    private static int registerInfoCallback(String str, int i10, long j10, int i11) {
        return C3250a.m13133a(str, i10, null, j10, i11);
    }

    public static long set(int i10, boolean z10) {
        return nativeSet(i10, z10 ? 1L : 0L, null, null);
    }

    public static long cmd(int i10, String str) {
        return nativeCmd(i10, 0L, str, null);
    }

    public static long set(int i10, long j10) {
        return nativeSet(i10, j10, null, null);
    }

    public static long set(int i10, String str) {
        return nativeSet(i10, 0L, str, null);
    }
}
