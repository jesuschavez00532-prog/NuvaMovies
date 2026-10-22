package ne;

import be.C1309e;
import be.C1327w;
import java.util.Arrays;

/* renamed from: ne.k */
/* loaded from: classes.dex */
public abstract class AbstractC5868k {
    /* renamed from: a */
    public static boolean m23669a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m23670b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m23678j(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: c */
    public static void m23671c(Object obj) {
        if (obj == null) {
            m23680l();
        }
    }

    /* renamed from: d */
    public static void m23672d(Object obj, String str) {
        if (obj == null) {
            m23681m(str);
        }
    }

    /* renamed from: e */
    public static void m23673e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m23678j(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: f */
    public static void m23674f(Object obj, String str) {
        if (obj == null) {
            m23684p(str);
        }
    }

    /* renamed from: g */
    public static void m23675g(Object obj, String str) {
        if (obj == null) {
            m23683o(str);
        }
    }

    /* renamed from: h */
    public static int m23676h(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    /* renamed from: i */
    private static String m23677i(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: j */
    private static Throwable m23678j(Throwable th) {
        return m23679k(th, AbstractC5868k.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Throwable m23679k(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th;
    }

    /* renamed from: l */
    public static void m23680l() {
        throw ((NullPointerException) m23678j(new NullPointerException()));
    }

    /* renamed from: m */
    public static void m23681m(String str) {
        throw ((NullPointerException) m23678j(new NullPointerException(str)));
    }

    /* renamed from: n */
    public static void m23682n() {
        throw ((C1309e) m23678j(new C1309e()));
    }

    /* renamed from: o */
    private static void m23683o(String str) {
        throw ((IllegalArgumentException) m23678j(new IllegalArgumentException(m23677i(str))));
    }

    /* renamed from: p */
    private static void m23684p(String str) {
        throw ((NullPointerException) m23678j(new NullPointerException(m23677i(str))));
    }

    /* renamed from: q */
    public static void m23685q(String str) {
        throw ((C1327w) m23678j(new C1327w(str)));
    }

    /* renamed from: r */
    public static void m23686r(String str) {
        m23685q("lateinit property " + str + " has not been initialized");
    }
}
