package p393x3;

import android.os.Build;
import android.util.Log;

/* renamed from: x3.a */
/* loaded from: classes.dex */
public abstract class AbstractC7492a {
    /* renamed from: a */
    private static String m28687a(String str, String str2) {
        String str3 = str + str2;
        if (str3.length() > 23) {
            return str3.substring(0, 23);
        }
        return str3;
    }

    /* renamed from: b */
    public static void m28688b(String str, String str2, Object obj) {
        String m28691e = m28691e(str);
        if (Log.isLoggable(m28691e, 3)) {
            Log.d(m28691e, String.format(str2, obj));
        }
    }

    /* renamed from: c */
    public static void m28689c(String str, String str2, Object... objArr) {
        String m28691e = m28691e(str);
        if (Log.isLoggable(m28691e, 3)) {
            Log.d(m28691e, String.format(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m28690d(String str, String str2, Throwable th) {
        String m28691e = m28691e(str);
        if (Log.isLoggable(m28691e, 6)) {
            Log.e(m28691e, str2, th);
        }
    }

    /* renamed from: e */
    private static String m28691e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m28687a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m28692f(String str, String str2, Object obj) {
        String m28691e = m28691e(str);
        if (Log.isLoggable(m28691e, 4)) {
            Log.i(m28691e, String.format(str2, obj));
        }
    }

    /* renamed from: g */
    public static void m28693g(String str, String str2, Object obj) {
        String m28691e = m28691e(str);
        if (Log.isLoggable(m28691e, 5)) {
            Log.w(m28691e, String.format(str2, obj));
        }
    }
}
