package p254o;

/* renamed from: o.l */
/* loaded from: classes.dex */
final class C5897l {

    /* renamed from: k */
    static final C5897l f23464k;

    /* renamed from: a */
    private final float f23465a;

    /* renamed from: b */
    private final float f23466b;

    /* renamed from: c */
    private final float f23467c;

    /* renamed from: d */
    private final float f23468d;

    /* renamed from: e */
    private final float f23469e;

    /* renamed from: f */
    private final float f23470f;

    /* renamed from: g */
    private final float[] f23471g;

    /* renamed from: h */
    private final float f23472h;

    /* renamed from: i */
    private final float f23473i;

    /* renamed from: j */
    private final float f23474j;

    static {
        float[] fArr = AbstractC5887b.f23431c;
        double m23745h = AbstractC5887b.m23745h(50.0f);
        Double.isNaN(m23745h);
        f23464k = m23825k(fArr, (float) ((m23745h * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    private C5897l(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f23470f = f10;
        this.f23465a = f11;
        this.f23466b = f12;
        this.f23467c = f13;
        this.f23468d = f14;
        this.f23469e = f15;
        this.f23471g = fArr;
        this.f23472h = f16;
        this.f23473i = f17;
        this.f23474j = f18;
    }

    /* renamed from: k */
    static C5897l m23825k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float m23741d;
        float exp;
        float[][] fArr2 = AbstractC5887b.f23429a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = f14 + (fArr3[1] * f15);
        float f17 = fArr[2];
        float f18 = f16 + (fArr3[2] * f17);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[0] * f13) + (fArr4[1] * f15) + (fArr4[2] * f17);
        float[] fArr5 = fArr2[2];
        float f20 = (f13 * fArr5[0]) + (f15 * fArr5[1]) + (f17 * fArr5[2]);
        float f21 = (f12 / 10.0f) + 0.8f;
        if (f21 >= 0.9d) {
            m23741d = AbstractC5887b.m23741d(0.59f, 0.69f, (f21 - 0.9f) * 10.0f);
        } else {
            m23741d = AbstractC5887b.m23741d(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
        }
        float f22 = m23741d;
        if (z10) {
            exp = 1.0f;
        } else {
            exp = (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f21;
        }
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * exp) + 1.0f) - exp, (((100.0f / f19) * exp) + 1.0f) - exp, (((100.0f / f20) * exp) + 1.0f) - exp};
        float f23 = 1.0f / ((5.0f * f10) + 1.0f);
        float f24 = f23 * f23 * f23 * f23;
        float f25 = 1.0f - f24;
        double d11 = f10;
        Double.isNaN(d11);
        float cbrt = (f24 * f10) + (0.1f * f25 * f25 * ((float) Math.cbrt(d11 * 5.0d)));
        float m23745h = AbstractC5887b.m23745h(f11) / fArr[1];
        double d12 = m23745h;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        double d13 = fArr6[0] * cbrt * f18;
        Double.isNaN(d13);
        double d14 = fArr6[1] * cbrt * f19;
        Double.isNaN(d14);
        double d15 = fArr6[2] * cbrt * f20;
        Double.isNaN(d15);
        float pow2 = (float) Math.pow(d15 / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(d13 / 100.0d, 0.42d), (float) Math.pow(d14 / 100.0d, 0.42d), pow2};
        float f26 = fArr7[0];
        float f27 = fArr7[1];
        return new C5897l(m23745h, ((((f26 * 400.0f) / (f26 + 27.13f)) * 2.0f) + ((f27 * 400.0f) / (f27 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f22, f21, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float m23826a() {
        return this.f23465a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m23827b() {
        return this.f23468d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m23828c() {
        return this.f23472h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m23829d() {
        return this.f23473i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m23830e() {
        return this.f23470f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m23831f() {
        return this.f23466b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m23832g() {
        return this.f23469e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m23833h() {
        return this.f23467c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float[] m23834i() {
        return this.f23471g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m23835j() {
        return this.f23474j;
    }
}
