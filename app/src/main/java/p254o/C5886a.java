package p254o;

import p276p.AbstractC6128a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.a */
/* loaded from: classes.dex */
public class C5886a {

    /* renamed from: a */
    private final float f23420a;

    /* renamed from: b */
    private final float f23421b;

    /* renamed from: c */
    private final float f23422c;

    /* renamed from: d */
    private final float f23423d;

    /* renamed from: e */
    private final float f23424e;

    /* renamed from: f */
    private final float f23425f;

    /* renamed from: g */
    private final float f23426g;

    /* renamed from: h */
    private final float f23427h;

    /* renamed from: i */
    private final float f23428i;

    C5886a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f23420a = f10;
        this.f23421b = f11;
        this.f23422c = f12;
        this.f23423d = f13;
        this.f23424e = f14;
        this.f23425f = f15;
        this.f23426g = f16;
        this.f23427h = f17;
        this.f23428i = f18;
    }

    /* renamed from: b */
    private static C5886a m23722b(float f10, float f11, float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        C5886a c5886a = null;
        float f15 = 1000.0f;
        float f16 = 0.0f;
        while (Math.abs(f16 - f13) > 0.01f) {
            float f17 = ((f13 - f16) / 2.0f) + f16;
            int m23737p = m23725e(f17, f11, f10).m23737p();
            float m23739b = AbstractC5887b.m23739b(m23737p);
            float abs = Math.abs(f12 - m23739b);
            if (abs < 0.2f) {
                C5886a m23723c = m23723c(m23737p);
                float m23729a = m23723c.m23729a(m23725e(m23723c.m23734k(), m23723c.m23732i(), f10));
                if (m23729a <= 1.0f) {
                    c5886a = m23723c;
                    f14 = abs;
                    f15 = m23729a;
                }
            }
            if (f14 == 0.0f && f15 == 0.0f) {
                break;
            }
            if (m23739b < f12) {
                f16 = f17;
            } else {
                f13 = f17;
            }
        }
        return c5886a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C5886a m23723c(int i10) {
        return m23724d(i10, C5897l.f23464k);
    }

    /* renamed from: d */
    static C5886a m23724d(int i10, C5897l c5897l) {
        float f10;
        float[] m23743f = AbstractC5887b.m23743f(i10);
        float[][] fArr = AbstractC5887b.f23429a;
        float f11 = m23743f[0];
        float[] fArr2 = fArr[0];
        float f12 = fArr2[0] * f11;
        float f13 = m23743f[1];
        float f14 = f12 + (fArr2[1] * f13);
        float f15 = m23743f[2];
        float f16 = f14 + (fArr2[2] * f15);
        float[] fArr3 = fArr[1];
        float f17 = (fArr3[0] * f11) + (fArr3[1] * f13) + (fArr3[2] * f15);
        float[] fArr4 = fArr[2];
        float f18 = (f11 * fArr4[0]) + (f13 * fArr4[1]) + (f15 * fArr4[2]);
        float f19 = c5897l.m23834i()[0] * f16;
        float f20 = c5897l.m23834i()[1] * f17;
        float f21 = c5897l.m23834i()[2] * f18;
        double m23828c = c5897l.m23828c() * Math.abs(f19);
        Double.isNaN(m23828c);
        float pow = (float) Math.pow(m23828c / 100.0d, 0.42d);
        double m23828c2 = c5897l.m23828c() * Math.abs(f20);
        Double.isNaN(m23828c2);
        float pow2 = (float) Math.pow(m23828c2 / 100.0d, 0.42d);
        double m23828c3 = c5897l.m23828c() * Math.abs(f21);
        Double.isNaN(m23828c3);
        float pow3 = (float) Math.pow(m23828c3 / 100.0d, 0.42d);
        float signum = ((Math.signum(f19) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f20) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f21) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum;
        Double.isNaN(d10);
        double d11 = signum2;
        Double.isNaN(d11);
        double d12 = signum3;
        Double.isNaN(d12);
        float f22 = ((float) (((d10 * 11.0d) + (d11 * (-12.0d))) + d12)) / 11.0f;
        double d13 = signum + signum2;
        Double.isNaN(d12);
        Double.isNaN(d13);
        float f23 = ((float) (d13 - (d12 * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = (((signum * 20.0f) + f24) + (21.0f * signum3)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = atan2;
        float f28 = (3.1415927f * f27) / 180.0f;
        float pow4 = ((float) Math.pow((f26 * c5897l.m23831f()) / c5897l.m23826a(), c5897l.m23827b() * c5897l.m23835j())) * 100.0f;
        float m23829d = c5897l.m23829d() * (4.0f / c5897l.m23827b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (c5897l.m23826a() + 4.0f);
        if (f27 < 20.14d) {
            f10 = 360.0f + f27;
        } else {
            f10 = f27;
        }
        Double.isNaN(f10);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c5897l.m23830e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((r9 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c5897l.m23832g()) * c5897l.m23833h()) * ((float) Math.sqrt((f22 * f22) + (f23 * f23)))) / (f25 + 0.305f), 0.9d));
        double d14 = pow4;
        Double.isNaN(d14);
        float sqrt = pow5 * ((float) Math.sqrt(d14 / 100.0d));
        float m23829d2 = sqrt * c5897l.m23829d();
        float sqrt2 = ((float) Math.sqrt((pow5 * c5897l.m23827b()) / (c5897l.m23826a() + 4.0f))) * 50.0f;
        float f29 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * m23829d2) + 1.0f)) * 43.85965f;
        double d15 = f28;
        return new C5886a(f27, sqrt, pow4, m23829d, m23829d2, sqrt2, f29, log * ((float) Math.cos(d15)), log * ((float) Math.sin(d15)));
    }

    /* renamed from: e */
    private static C5886a m23725e(float f10, float f11, float f12) {
        return m23726f(f10, f11, f12, C5897l.f23464k);
    }

    /* renamed from: f */
    private static C5886a m23726f(float f10, float f11, float f12, C5897l c5897l) {
        float m23827b = 4.0f / c5897l.m23827b();
        double d10 = f10;
        Double.isNaN(d10);
        float sqrt = m23827b * ((float) Math.sqrt(d10 / 100.0d)) * (c5897l.m23826a() + 4.0f) * c5897l.m23829d();
        float m23829d = f11 * c5897l.m23829d();
        float sqrt2 = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(r4))) * c5897l.m23827b()) / (c5897l.m23826a() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        double d11 = m23829d;
        Double.isNaN(d11);
        float log = ((float) Math.log((d11 * 0.0228d) + 1.0d)) * 43.85965f;
        double d12 = (3.1415927f * f12) / 180.0f;
        return new C5886a(f12, f11, f10, sqrt, m23829d, sqrt2, f13, log * ((float) Math.cos(d12)), log * ((float) Math.sin(d12)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m23727m(float f10, float f11, float f12) {
        return m23728n(f10, f11, f12, C5897l.f23464k);
    }

    /* renamed from: n */
    static int m23728n(float f10, float f11, float f12, C5897l c5897l) {
        float min;
        if (f11 >= 1.0d && Math.round(f12) > 0.0d && Math.round(f12) < 100.0d) {
            if (f10 < 0.0f) {
                min = 0.0f;
            } else {
                min = Math.min(360.0f, f10);
            }
            float f13 = f11;
            C5886a c5886a = null;
            float f14 = 0.0f;
            boolean z10 = true;
            while (Math.abs(f14 - f11) >= 0.4f) {
                C5886a m23722b = m23722b(min, f13, f12);
                if (z10) {
                    if (m23722b != null) {
                        return m23722b.m23736o(c5897l);
                    }
                    f13 = ((f11 - f14) / 2.0f) + f14;
                    z10 = false;
                } else {
                    if (m23722b == null) {
                        f11 = f13;
                    } else {
                        f14 = f13;
                        c5886a = m23722b;
                    }
                    f13 = ((f11 - f14) / 2.0f) + f14;
                }
            }
            if (c5886a == null) {
                return AbstractC5887b.m23738a(f12);
            }
            return c5886a.m23736o(c5897l);
        }
        return AbstractC5887b.m23738a(f12);
    }

    /* renamed from: a */
    float m23729a(C5886a c5886a) {
        float m23735l = m23735l() - c5886a.m23735l();
        float m23730g = m23730g() - c5886a.m23730g();
        float m23731h = m23731h() - c5886a.m23731h();
        return (float) (Math.pow(Math.sqrt((m23735l * m23735l) + (m23730g * m23730g) + (m23731h * m23731h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    float m23730g() {
        return this.f23427h;
    }

    /* renamed from: h */
    float m23731h() {
        return this.f23428i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m23732i() {
        return this.f23421b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m23733j() {
        return this.f23420a;
    }

    /* renamed from: k */
    float m23734k() {
        return this.f23422c;
    }

    /* renamed from: l */
    float m23735l() {
        return this.f23426g;
    }

    /* renamed from: o */
    int m23736o(C5897l c5897l) {
        float f10;
        if (m23732i() != 0.0d && m23734k() != 0.0d) {
            float m23732i = m23732i();
            double m23734k = m23734k();
            Double.isNaN(m23734k);
            f10 = m23732i / ((float) Math.sqrt(m23734k / 100.0d));
        } else {
            f10 = 0.0f;
        }
        double d10 = f10;
        double pow = Math.pow(1.64d - Math.pow(0.29d, c5897l.m23830e()), 0.73d);
        Double.isNaN(d10);
        float pow2 = (float) Math.pow(d10 / pow, 1.1111111111111112d);
        double m23733j = (m23733j() * 3.1415927f) / 180.0f;
        Double.isNaN(m23733j);
        float cos = ((float) (Math.cos(2.0d + m23733j) + 3.8d)) * 0.25f;
        float m23826a = c5897l.m23826a();
        double m23734k2 = m23734k();
        Double.isNaN(m23734k2);
        double m23827b = c5897l.m23827b();
        Double.isNaN(m23827b);
        double d11 = 1.0d / m23827b;
        double m23835j = c5897l.m23835j();
        Double.isNaN(m23835j);
        float pow3 = m23826a * ((float) Math.pow(m23734k2 / 100.0d, d11 / m23835j));
        float m23832g = cos * 3846.1538f * c5897l.m23832g() * c5897l.m23833h();
        float m23831f = pow3 / c5897l.m23831f();
        float sin = (float) Math.sin(m23733j);
        float cos2 = (float) Math.cos(m23733j);
        float f11 = (((0.305f + m23831f) * 23.0f) * pow2) / (((m23832g * 23.0f) + ((11.0f * pow2) * cos2)) + ((pow2 * 108.0f) * sin));
        float f12 = cos2 * f11;
        float f13 = f11 * sin;
        float f14 = m23831f * 460.0f;
        float f15 = (((451.0f * f12) + f14) + (288.0f * f13)) / 1403.0f;
        float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
        float f17 = ((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f;
        Double.isNaN(Math.abs(f15));
        Double.isNaN(Math.abs(f15));
        float signum = Math.signum(f15) * (100.0f / c5897l.m23828c()) * ((float) Math.pow((float) Math.max(0.0d, (r6 * 27.13d) / (400.0d - r11)), 2.380952380952381d));
        Double.isNaN(Math.abs(f16));
        Double.isNaN(Math.abs(f16));
        float signum2 = Math.signum(f16) * (100.0f / c5897l.m23828c()) * ((float) Math.pow((float) Math.max(0.0d, (r11 * 27.13d) / (400.0d - r9)), 2.380952380952381d));
        Double.isNaN(Math.abs(f17));
        Double.isNaN(Math.abs(f17));
        float signum3 = Math.signum(f17) * (100.0f / c5897l.m23828c()) * ((float) Math.pow((float) Math.max(0.0d, (r9 * 27.13d) / (400.0d - r11)), 2.380952380952381d));
        float f18 = signum / c5897l.m23834i()[0];
        float f19 = signum2 / c5897l.m23834i()[1];
        float f20 = signum3 / c5897l.m23834i()[2];
        float[][] fArr = AbstractC5887b.f23430b;
        float[] fArr2 = fArr[0];
        float f21 = (fArr2[0] * f18) + (fArr2[1] * f19) + (fArr2[2] * f20);
        float[] fArr3 = fArr[1];
        float f22 = (fArr3[0] * f18) + (fArr3[1] * f19) + (fArr3[2] * f20);
        float[] fArr4 = fArr[2];
        return AbstractC6128a.m24422a(f21, f22, (f18 * fArr4[0]) + (f19 * fArr4[1]) + (f20 * fArr4[2]));
    }

    /* renamed from: p */
    int m23737p() {
        return m23736o(C5897l.f23464k);
    }
}
