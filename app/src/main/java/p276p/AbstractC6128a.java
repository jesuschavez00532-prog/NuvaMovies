package p276p;

import android.graphics.Color;

/* renamed from: p.a */
/* loaded from: classes.dex */
public abstract class AbstractC6128a {

    /* renamed from: a */
    private static final ThreadLocal f24116a = new ThreadLocal();

    /* renamed from: a */
    public static int m24422a(double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        double d16 = (((3.2406d * d10) + ((-1.5372d) * d11)) + ((-0.4986d) * d12)) / 100.0d;
        double d17 = ((((-0.9689d) * d10) + (1.8758d * d11)) + (0.0415d * d12)) / 100.0d;
        double d18 = (((0.0557d * d10) + ((-0.204d) * d11)) + (1.057d * d12)) / 100.0d;
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        if (d17 > 0.0031308d) {
            d14 = (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d14 = d17 * 12.92d;
        }
        if (d18 > 0.0031308d) {
            d15 = (Math.pow(d18, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d15 = d18 * 12.92d;
        }
        return Color.rgb(m24426e((int) Math.round(d13 * 255.0d), 0, 255), m24426e((int) Math.round(d14 * 255.0d), 0, 255), m24426e((int) Math.round(d15 * 255.0d), 0, 255));
    }

    /* renamed from: b */
    private static int m24423b(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / 255);
    }

    /* renamed from: c */
    public static int m24424c(int i10, int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int m24423b = m24423b(alpha2, alpha);
        return Color.argb(m24423b, m24425d(Color.red(i10), alpha2, Color.red(i11), alpha, m24423b), m24425d(Color.green(i10), alpha2, Color.green(i11), alpha, m24423b), m24425d(Color.blue(i10), alpha2, Color.blue(i11), alpha, m24423b));
    }

    /* renamed from: d */
    private static int m24425d(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * 255) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * 255);
    }

    /* renamed from: e */
    private static int m24426e(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    /* renamed from: f */
    public static int m24427f(int i10, int i11) {
        if (i11 >= 0 && i11 <= 255) {
            return (i10 & 16777215) | (i11 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
