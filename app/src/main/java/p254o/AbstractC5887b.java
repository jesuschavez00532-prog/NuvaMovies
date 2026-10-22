package p254o;

import android.graphics.Color;
import p276p.AbstractC6128a;

/* renamed from: o.b */
/* loaded from: classes.dex */
abstract class AbstractC5887b {

    /* renamed from: a */
    static final float[][] f23429a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    static final float[][] f23430b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    static final float[] f23431c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    static final float[][] f23432d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m23738a(float f10) {
        boolean z10;
        float f11;
        boolean z11;
        float f12;
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        if (f10 > 8.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f11 = f13 * f13 * f13;
        } else {
            f11 = f10 / 903.2963f;
        }
        float f14 = f13 * f13 * f13;
        if (f14 > 0.008856452f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f12 = f14;
        } else {
            f12 = ((f13 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z11) {
            f14 = ((f13 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f23431c;
        return AbstractC6128a.m24422a(f12 * fArr[0], f11 * fArr[1], f14 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m23739b(int i10) {
        return m23740c(m23744g(i10));
    }

    /* renamed from: c */
    static float m23740c(float f10) {
        float f11 = f10 / 100.0f;
        if (f11 <= 0.008856452f) {
            return f11 * 903.2963f;
        }
        return (((float) Math.cbrt(f11)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static float m23741d(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    /* renamed from: e */
    static float m23742e(int i10) {
        float pow;
        float f10 = i10 / 255.0f;
        if (f10 <= 0.04045f) {
            pow = f10 / 12.92f;
        } else {
            pow = (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static float[] m23743f(int i10) {
        float m23742e = m23742e(Color.red(i10));
        float m23742e2 = m23742e(Color.green(i10));
        float m23742e3 = m23742e(Color.blue(i10));
        float[][] fArr = f23432d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[0] * m23742e) + (fArr2[1] * m23742e2) + (fArr2[2] * m23742e3);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[0] * m23742e) + (fArr3[1] * m23742e2) + (fArr3[2] * m23742e3);
        float[] fArr4 = fArr[2];
        return new float[]{f10, f11, (m23742e * fArr4[0]) + (m23742e2 * fArr4[1]) + (m23742e3 * fArr4[2])};
    }

    /* renamed from: g */
    static float m23744g(int i10) {
        float m23742e = m23742e(Color.red(i10));
        float m23742e2 = m23742e(Color.green(i10));
        float m23742e3 = m23742e(Color.blue(i10));
        float[] fArr = f23432d[1];
        return (m23742e * fArr[0]) + (m23742e2 * fArr[1]) + (m23742e3 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static float m23745h(float f10) {
        float f11;
        if (f10 > 8.0f) {
            double d10 = f10;
            Double.isNaN(d10);
            f11 = (float) Math.pow((d10 + 16.0d) / 116.0d, 3.0d);
        } else {
            f11 = f10 / 903.2963f;
        }
        return f11 * 100.0f;
    }
}
