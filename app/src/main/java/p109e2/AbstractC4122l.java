package p109e2;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import p003a2.AbstractC0005a;

/* renamed from: e2.l */
/* loaded from: classes.dex */
public abstract class AbstractC4122l {

    /* renamed from: a */
    private static final char[] f18089a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f18090b = new char[64];

    /* renamed from: c */
    private static volatile Handler f18091c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e2.l$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18092a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            f18092a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18092a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18092a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = f18092a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18092a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static void m17228a() {
        if (m17246s()) {
        } else {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: b */
    public static void m17229b() {
        if (m17247t()) {
        } else {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: c */
    public static boolean m17230c(AbstractC0005a abstractC0005a, AbstractC0005a abstractC0005a2) {
        if (abstractC0005a == null) {
            if (abstractC0005a2 == null) {
                return true;
            }
            return false;
        }
        return abstractC0005a.m31J(abstractC0005a2);
    }

    /* renamed from: d */
    public static boolean m17231d(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: e */
    public static boolean m17232e(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: f */
    private static String m17233f(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f18089a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: g */
    public static Queue m17234g(int i10) {
        return new ArrayDeque(i10);
    }

    /* renamed from: h */
    public static int m17235h(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * m17237j(config);
    }

    /* renamed from: i */
    public static int m17236i(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: j */
    public static int m17237j(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f18092a[config.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            return 4;
        }
        return 8;
    }

    /* renamed from: k */
    public static List m17238k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    private static Handler m17239l() {
        if (f18091c == null) {
            synchronized (AbstractC4122l.class) {
                if (f18091c == null) {
                    f18091c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f18091c;
    }

    /* renamed from: m */
    public static int m17240m(float f10) {
        return m17241n(f10, 17);
    }

    /* renamed from: n */
    public static int m17241n(float f10, int i10) {
        return m17243p(Float.floatToIntBits(f10), i10);
    }

    /* renamed from: o */
    public static int m17242o(int i10) {
        return m17243p(i10, 17);
    }

    /* renamed from: p */
    public static int m17243p(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    /* renamed from: q */
    public static int m17244q(Object obj, int i10) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return m17243p(hashCode, i10);
    }

    /* renamed from: r */
    public static int m17245r(boolean z10, int i10) {
        return m17243p(z10 ? 1 : 0, i10);
    }

    /* renamed from: s */
    public static boolean m17246s() {
        return !m17247t();
    }

    /* renamed from: t */
    public static boolean m17247t() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m17248u(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    /* renamed from: v */
    public static boolean m17249v(int i10, int i11) {
        if (m17248u(i10) && m17248u(i11)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static void m17250w(Runnable runnable) {
        m17239l().post(runnable);
    }

    /* renamed from: x */
    public static void m17251x(Runnable runnable) {
        m17239l().removeCallbacks(runnable);
    }

    /* renamed from: y */
    public static String m17252y(byte[] bArr) {
        String m17233f;
        char[] cArr = f18090b;
        synchronized (cArr) {
            m17233f = m17233f(bArr, cArr);
        }
        return m17233f;
    }
}
