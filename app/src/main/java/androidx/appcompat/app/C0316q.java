package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.q */
/* loaded from: classes.dex */
class C0316q {

    /* renamed from: d */
    private static C0316q f1168d;

    /* renamed from: a */
    public long f1169a;

    /* renamed from: b */
    public long f1170b;

    /* renamed from: c */
    public int f1171c;

    C0316q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C0316q m1211b() {
        if (f1168d == null) {
            f1168d = new C0316q();
        }
        return f1168d;
    }

    /* renamed from: a */
    public void m1212a(long j10, double d10, double d11) {
        float f10 = ((float) (j10 - 946728000000L)) / 8.64E7f;
        double d12 = (0.01720197f * f10) + 6.24006f;
        double sin = Math.sin(d12) * 0.03341960161924362d;
        Double.isNaN(d12);
        double sin2 = sin + d12 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d13 = (-d11) / 360.0d;
        double d14 = f10 - 9.0E-4f;
        Double.isNaN(d14);
        double round = ((float) Math.round(d14 - d13)) + 9.0E-4f;
        Double.isNaN(round);
        double sin3 = round + d13 + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * sin2) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d15 = 0.01745329238474369d * d10;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d15) * Math.sin(asin))) / (Math.cos(d15) * Math.cos(asin));
        if (sin4 >= 1.0d) {
            this.f1171c = 1;
            this.f1169a = -1L;
            this.f1170b = -1L;
            return;
        }
        if (sin4 <= -1.0d) {
            this.f1171c = 0;
            this.f1169a = -1L;
            this.f1170b = -1L;
            return;
        }
        double acos = (float) (Math.acos(sin4) / 6.283185307179586d);
        Double.isNaN(acos);
        this.f1169a = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
        Double.isNaN(acos);
        long round2 = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
        this.f1170b = round2;
        if (round2 < j10 && this.f1169a > j10) {
            this.f1171c = 0;
        } else {
            this.f1171c = 1;
        }
    }
}
