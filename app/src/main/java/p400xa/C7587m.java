package p400xa;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.TimeoutException;

/* renamed from: xa.m */
/* loaded from: classes.dex */
public class C7587m implements Thread.UncaughtExceptionHandler {

    /* renamed from: e */
    private static C7587m f27880e;

    /* renamed from: a */
    private String f27881a = "CrashHandler";

    /* renamed from: b */
    private String f27882b = "";

    /* renamed from: c */
    private Context f27883c;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f27884d;

    private C7587m() {
    }

    /* renamed from: a */
    public static C7587m m29116a() {
        if (f27880e == null) {
            f27880e = new C7587m();
        }
        return f27880e;
    }

    /* renamed from: b */
    public void m29117b(Context context) {
        this.f27883c = context;
        this.f27884d = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        if ((!thread.getName().equals("FinalizerWatchdogDaemon") || !(th instanceof TimeoutException)) && (uncaughtExceptionHandler = this.f27884d) != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
