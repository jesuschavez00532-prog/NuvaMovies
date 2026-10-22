package p200k1;

import android.net.Uri;

/* renamed from: k1.b */
/* loaded from: classes.dex */
public abstract class AbstractC5080b {
    /* renamed from: a */
    public static boolean m20574a(Uri uri) {
        if (m20576c(uri) && uri.getPathSegments().contains("picker")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m20575b(Uri uri) {
        if (m20576c(uri) && !m20579f(uri)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m20576c(Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m20577d(Uri uri) {
        if (m20576c(uri) && m20579f(uri)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m20578e(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    /* renamed from: f */
    private static boolean m20579f(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
