package ne;

import be.InterfaceC1307c;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import me.InterfaceC5665q;
import p269oe.InterfaceC5974a;
import p269oe.InterfaceC5975b;

/* renamed from: ne.y */
/* loaded from: classes3.dex */
public abstract class AbstractC5882y {
    /* renamed from: a */
    public static Collection m23701a(Object obj) {
        if ((obj instanceof InterfaceC5974a) && !(obj instanceof InterfaceC5975b)) {
            m23713m(obj, "kotlin.collections.MutableCollection");
        }
        return m23705e(obj);
    }

    /* renamed from: b */
    public static List m23702b(Object obj) {
        if (obj instanceof InterfaceC5974a) {
            m23713m(obj, "kotlin.collections.MutableList");
        }
        return m23706f(obj);
    }

    /* renamed from: c */
    public static Map m23703c(Object obj) {
        if (obj instanceof InterfaceC5974a) {
            m23713m(obj, "kotlin.collections.MutableMap");
        }
        return m23707g(obj);
    }

    /* renamed from: d */
    public static Object m23704d(Object obj, int i10) {
        if (obj != null && !m23709i(obj, i10)) {
            m23713m(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    /* renamed from: e */
    public static Collection m23705e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw m23712l(e10);
        }
    }

    /* renamed from: f */
    public static List m23706f(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw m23712l(e10);
        }
    }

    /* renamed from: g */
    public static Map m23707g(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw m23712l(e10);
        }
    }

    /* renamed from: h */
    public static int m23708h(Object obj) {
        if (obj instanceof InterfaceC5865h) {
            return ((InterfaceC5865h) obj).getArity();
        }
        if (obj instanceof InterfaceC5642a) {
            return 0;
        }
        if (obj instanceof InterfaceC5660l) {
            return 1;
        }
        if (obj instanceof InterfaceC5664p) {
            return 2;
        }
        if (obj instanceof InterfaceC5665q) {
            return 3;
        }
        return -1;
    }

    /* renamed from: i */
    public static boolean m23709i(Object obj, int i10) {
        if ((obj instanceof InterfaceC1307c) && m23708h(obj) == i10) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m23710j(Object obj) {
        if ((obj instanceof List) && !(obj instanceof InterfaceC5974a)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static Throwable m23711k(Throwable th) {
        return AbstractC5868k.m23679k(th, AbstractC5882y.class.getName());
    }

    /* renamed from: l */
    public static ClassCastException m23712l(ClassCastException classCastException) {
        throw ((ClassCastException) m23711k(classCastException));
    }

    /* renamed from: m */
    public static void m23713m(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        m23714n(name + " cannot be cast to " + str);
    }

    /* renamed from: n */
    public static void m23714n(String str) {
        throw m23712l(new ClassCastException(str));
    }
}
