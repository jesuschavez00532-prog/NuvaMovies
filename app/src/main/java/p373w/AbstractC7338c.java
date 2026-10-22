package p373w;

import java.util.Objects;

/* renamed from: w.c */
/* loaded from: classes.dex */
public abstract class AbstractC7338c {
    /* renamed from: a */
    public static boolean m28317a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* renamed from: b */
    public static int m28318b(Object... objArr) {
        return Objects.hash(objArr);
    }

    /* renamed from: c */
    public static Object m28319c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
