package p331t;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: t.k */
/* loaded from: classes.dex */
public abstract class AbstractC6880k {

    /* renamed from: a */
    private static long f26175a;

    /* renamed from: b */
    private static Method f26176b;

    /* renamed from: c */
    private static Method f26177c;

    /* renamed from: d */
    private static Method f26178d;

    /* renamed from: e */
    private static Method f26179e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f26175a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f26176b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f26177c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f26178d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f26179e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    /* renamed from: a */
    public static void m26792a(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: b */
    public static void m26793b() {
        Trace.endSection();
    }
}
