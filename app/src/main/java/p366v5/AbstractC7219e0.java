package p366v5;

/* renamed from: v5.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC7219e0 {
    /* renamed from: a */
    public static void m27946a(boolean z10, String str) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static Object m27947b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m27948c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m27949d(boolean z10, String str) {
        if (z10) {
        } else {
            throw new IllegalStateException(str);
        }
    }
}
