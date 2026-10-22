package anet.channel.monitor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.monitor.e */
/* loaded from: classes.dex */
public class C0952e {

    /* renamed from: b */
    private double f3942b;

    /* renamed from: c */
    private double f3943c;

    /* renamed from: d */
    private double f3944d;

    /* renamed from: e */
    private double f3945e;

    /* renamed from: f */
    private double f3946f;

    /* renamed from: g */
    private double f3947g;

    /* renamed from: h */
    private double f3948h;

    /* renamed from: a */
    private long f3941a = 0;

    /* renamed from: i */
    private double f3949i = 0.0d;

    /* renamed from: j */
    private double f3950j = 0.0d;

    /* renamed from: k */
    private double f3951k = 0.0d;

    /* renamed from: a */
    public double m4600a(double d10, double d11) {
        char c10;
        double d12 = d10 / d11;
        if (d12 < 8.0d) {
            if (this.f3941a != 0) {
                return this.f3951k;
            }
            this.f3951k = d12;
            return d12;
        }
        long j10 = this.f3941a;
        if (j10 == 0) {
            this.f3949i = d12;
            this.f3948h = d12;
            this.f3944d = d12 * 0.1d;
            this.f3943c = 0.02d * d12;
            this.f3945e = 0.1d * d12 * d12;
        } else if (j10 == 1) {
            this.f3950j = d12;
            this.f3948h = d12;
        } else {
            double d13 = this.f3950j;
            double d14 = d12 - d13;
            this.f3949i = d13;
            this.f3950j = d12;
            double d15 = d12 / 0.95d;
            this.f3942b = d15;
            this.f3947g = d15 - (this.f3948h * 0.95d);
            double sqrt = Math.sqrt(this.f3944d);
            double d16 = this.f3947g;
            if (d16 >= 4.0d * sqrt) {
                this.f3947g = (d16 * 0.75d) + (sqrt * 2.0d);
                c10 = 1;
            } else if (d16 <= (-4.0d) * sqrt) {
                this.f3947g = (sqrt * (-1.0d)) + (d16 * 0.75d);
                c10 = 2;
            } else {
                c10 = 0;
            }
            double d17 = this.f3944d * 1.05d;
            double d18 = this.f3947g;
            double min = Math.min(Math.max(Math.abs(d17 - ((0.0025d * d18) * d18)), this.f3944d * 0.8d), this.f3944d * 1.25d);
            this.f3944d = min;
            double d19 = this.f3945e;
            double d20 = d19 / ((0.9025d * d19) + min);
            this.f3946f = d20;
            double d21 = this.f3948h + (1.0526315789473684d * d14) + (d20 * this.f3947g);
            this.f3948h = d21;
            if (c10 == 1) {
                this.f3948h = Math.min(d21, this.f3942b);
            } else if (c10 == 2) {
                this.f3948h = Math.max(d21, this.f3942b);
            }
            this.f3945e = (1.0d - (0.95d * this.f3946f)) * (this.f3945e + this.f3943c);
        }
        double d22 = this.f3948h;
        if (d22 < 0.0d) {
            double d23 = this.f3950j * 0.7d;
            this.f3951k = d23;
            this.f3948h = d23;
        } else {
            this.f3951k = d22;
        }
        return this.f3951k;
    }

    /* renamed from: a */
    public void m4601a() {
        this.f3941a = 0L;
        this.f3951k = 0.0d;
    }
}
