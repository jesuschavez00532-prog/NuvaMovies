package p373w;

import java.util.Locale;

/* renamed from: w.g */
/* loaded from: classes.dex */
public abstract class AbstractC7342g {
    /* renamed from: a */
    public static void m28321a(boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m28322b(boolean z10, Object obj) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m28323c(int i10, int i11, int i12, String str) {
        if (i10 >= i11) {
            if (i10 <= i12) {
                return i10;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* renamed from: d */
    public static int m28324d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public static int m28325e(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: f */
    public static int m28326f(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(i11) + " are allowed");
    }

    /* renamed from: g */
    public static Object m28327g(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: h */
    public static Object m28328h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }
}
