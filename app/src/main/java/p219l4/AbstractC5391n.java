package p219l4;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import p281p4.AbstractC6213q;

/* renamed from: l4.n */
/* loaded from: classes.dex */
public abstract class AbstractC5391n {
    /* renamed from: a */
    public static void m21775a(boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m21776b(boolean z10, Object obj) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m21777c(Handler handler) {
        String str = null;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + str + ".");
        }
    }

    /* renamed from: d */
    public static void m21778d(String str) {
        if (AbstractC6213q.m24784a()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: e */
    public static String m21779e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: f */
    public static String m21780f(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: g */
    public static void m21781g() {
        m21782h("Must not be called on the main application thread");
    }

    /* renamed from: h */
    public static void m21782h(String str) {
        if (!AbstractC6213q.m24784a()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: i */
    public static Object m21783i(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: j */
    public static Object m21784j(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: k */
    public static int m21785k(int i10) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: l */
    public static void m21786l(boolean z10) {
        if (z10) {
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: m */
    public static void m21787m(boolean z10, Object obj) {
        if (z10) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
