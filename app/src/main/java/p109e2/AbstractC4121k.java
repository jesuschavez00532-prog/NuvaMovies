package p109e2;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: e2.k */
/* loaded from: classes.dex */
public abstract class AbstractC4121k {
    /* renamed from: a */
    public static void m17223a(boolean z10, String str) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m17224b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: c */
    public static Collection m17225c(Collection collection) {
        if (!collection.isEmpty()) {
            return collection;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: d */
    public static Object m17226d(Object obj) {
        return m17227e(obj, "Argument must not be null");
    }

    /* renamed from: e */
    public static Object m17227e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
