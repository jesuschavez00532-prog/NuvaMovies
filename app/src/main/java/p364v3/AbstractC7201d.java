package p364v3;

/* renamed from: v3.d */
/* loaded from: classes.dex */
public abstract class AbstractC7201d {
    /* renamed from: a */
    public static void m27893a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m27894b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m27895c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
