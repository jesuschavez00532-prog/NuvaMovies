package p331t;

import android.os.Build;

/* renamed from: t.a */
/* loaded from: classes.dex */
public abstract class AbstractC6870a {
    /* renamed from: a */
    protected static boolean m26775a(String str, String str2) {
        if ("REL".equals(str2) || str2.compareTo(str) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m26776b() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m26777c() {
        if (Build.VERSION.SDK_INT < 31 && !m26775a("S", Build.VERSION.CODENAME)) {
            return false;
        }
        return true;
    }
}
