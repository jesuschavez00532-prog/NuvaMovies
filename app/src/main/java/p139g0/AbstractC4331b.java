package p139g0;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: g0.b */
/* loaded from: classes.dex */
public abstract class AbstractC4331b {

    /* renamed from: a */
    private static long f18840a;

    /* renamed from: b */
    private static Method f18841b;

    /* renamed from: a */
    public static void m18143a(String str) {
        AbstractC4332c.m18148a(str);
    }

    /* renamed from: b */
    public static void m18144b() {
        AbstractC4332c.m18149b();
    }

    /* renamed from: c */
    private static void m18145c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* renamed from: d */
    public static boolean m18146d() {
        boolean isEnabled;
        try {
            if (f18841b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m18147e();
    }

    /* renamed from: e */
    private static boolean m18147e() {
        try {
            if (f18841b == null) {
                f18840a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f18841b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f18841b.invoke(null, Long.valueOf(f18840a))).booleanValue();
        } catch (Exception e10) {
            m18145c("isTagEnabled", e10);
            return false;
        }
    }
}
