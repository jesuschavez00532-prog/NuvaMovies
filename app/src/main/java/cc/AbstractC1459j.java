package cc;

import android.text.TextUtils;
import p134fc.AbstractC4305b;

/* renamed from: cc.j */
/* loaded from: classes.dex */
public abstract class AbstractC1459j {

    /* renamed from: a */
    private static boolean f5604a = true;

    /* renamed from: a */
    public static String m6796a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!f5604a) {
            return str;
        }
        try {
            return AbstractC4305b.m18076a(str, AbstractC4305b.f18742a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m6797b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!f5604a) {
            return str;
        }
        try {
            return AbstractC4305b.m18076a(str, str2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m6798c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!f5604a) {
            return str;
        }
        try {
            return AbstractC4305b.m18077b(str, AbstractC4305b.f18742a);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    public static String m6799d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!f5604a) {
            return str;
        }
        try {
            return AbstractC4305b.m18077b(str, str2);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static boolean m6800e() {
        return f5604a;
    }
}
