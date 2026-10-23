package p241n;

import p228m.C5562e;
import p228m.C5566i;
import p241n.C5701e;

/* renamed from: n.m */
/* loaded from: classes.dex */
public class C5709m extends AbstractC5711o {

    /* renamed from: c */
    C5701e f22910c;

    /* renamed from: d */
    float f22911d;

    /* renamed from: e */
    C5709m f22912e;

    /* renamed from: f */
    float f22913f;

    /* renamed from: g */
    C5709m f22914g;

    /* renamed from: h */
    float f22915h;

    /* renamed from: j */
    private C5709m f22917j;

    /* renamed from: k */
    private float f22918k;

    /* renamed from: i */
    int f22916i = 0;

    /* renamed from: l */
    private C5710n f22919l = null;

    /* renamed from: m */
    private int f22920m = 1;

    /* renamed from: n */
    private C5710n f22921n = null;

    /* renamed from: o */
    private int f22922o = 1;

    public C5709m(C5701e c5701e) {
        this.f22910c = c5701e;
    }

    @Override // p241n.AbstractC5711o
    /* renamed from: e */
    public void mo23061e() {
        super.mo23061e();
        this.f22912e = null;
        this.f22913f = 0.0f;
        this.f22919l = null;
        this.f22920m = 1;
        this.f22921n = null;
        this.f22922o = 1;
        this.f22914g = null;
        this.f22915h = 0.0f;
        this.f22911d = 0.0f;
        this.f22917j = null;
        this.f22918k = 0.0f;
        this.f22916i = 0;
    }

    @Override // p241n.AbstractC5711o
    /* renamed from: f */
    public void mo23062f() {
        int i10 = 0;
        C5709m c5709m;
        C5709m c5709m2;
        C5709m c5709m3;
        C5709m c5709m4;
        C5709m c5709m5;
        C5709m c5709m6;
        float f10 = 0.0f;
        float m22949D;
        float f11 = 0.0f;
        C5709m c5709m7;
        boolean z10 = true;
        if (this.f22925b == 1 || (i10 = this.f22916i) == 4) {
            return;
        }
        C5710n c5710n = this.f22919l;
        if (c5710n != null) {
            if (c5710n.f22925b != 1) {
                return;
            } else {
                this.f22913f = this.f22920m * c5710n.f22923c;
            }
        }
        C5710n c5710n2 = this.f22921n;
        if (c5710n2 != null) {
            if (c5710n2.f22925b != 1) {
                return;
            } else {
                this.f22918k = this.f22922o * c5710n2.f22923c;
            }
        }
        if (i10 == 1 && ((c5709m7 = this.f22912e) == null || c5709m7.f22925b == 1)) {
            if (c5709m7 == null) {
                this.f22914g = this;
                this.f22915h = this.f22913f;
            } else {
                this.f22914g = c5709m7.f22914g;
                this.f22915h = c5709m7.f22915h + this.f22913f;
            }
            m23077b();
            return;
        }
        if (i10 == 2 && (c5709m4 = this.f22912e) != null && c5709m4.f22925b == 1 && (c5709m5 = this.f22917j) != null && (c5709m6 = c5709m5.f22912e) != null && c5709m6.f22925b == 1) {
            C5562e.m22572y();
            C5709m c5709m8 = this.f22912e;
            this.f22914g = c5709m8.f22914g;
            C5709m c5709m9 = this.f22917j;
            C5709m c5709m10 = c5709m9.f22912e;
            c5709m9.f22914g = c5709m10.f22914g;
            C5701e.d dVar = this.f22910c.f22758c;
            C5701e.d dVar2 = C5701e.d.RIGHT;
            int i11 = 0;
            if (dVar != dVar2 && dVar != C5701e.d.BOTTOM) {
                z10 = false;
            }
            if (z10) {
                f10 = c5709m8.f22915h - c5709m10.f22915h;
            } else {
                f10 = c5709m10.f22915h - c5709m8.f22915h;
            }
            if (dVar != C5701e.d.LEFT && dVar != dVar2) {
                m22949D = f10 - r2.f22757b.m23003r();
                f11 = this.f22910c.f22757b.f22812a0;
            } else {
                m22949D = f10 - r2.f22757b.m22949D();
                f11 = this.f22910c.f22757b.f22810Z;
            }
            int m22929d = this.f22910c.m22929d();
            int m22929d2 = this.f22917j.f22910c.m22929d();
            if (this.f22910c.m22934i() == this.f22917j.f22910c.m22934i()) {
                f11 = 0.5f;
                m22929d2 = 0;
            } else {
                i11 = m22929d;
            }
            float f12 = i11;
            float f13 = m22929d2;
            float f14 = (m22949D - f12) - f13;
            if (z10) {
                C5709m c5709m11 = this.f22917j;
                c5709m11.f22915h = c5709m11.f22912e.f22915h + f13 + (f14 * f11);
                this.f22915h = (this.f22912e.f22915h - f12) - (f14 * (1.0f - f11));
            } else {
                this.f22915h = this.f22912e.f22915h + f12 + (f14 * f11);
                C5709m c5709m12 = this.f22917j;
                c5709m12.f22915h = (c5709m12.f22912e.f22915h - f13) - (f14 * (1.0f - f11));
            }
            m23077b();
            this.f22917j.m23077b();
            return;
        }
        if (i10 == 3 && (c5709m = this.f22912e) != null && c5709m.f22925b == 1 && (c5709m2 = this.f22917j) != null && (c5709m3 = c5709m2.f22912e) != null && c5709m3.f22925b == 1) {
            C5562e.m22572y();
            C5709m c5709m13 = this.f22912e;
            this.f22914g = c5709m13.f22914g;
            C5709m c5709m14 = this.f22917j;
            C5709m c5709m15 = c5709m14.f22912e;
            c5709m14.f22914g = c5709m15.f22914g;
            this.f22915h = c5709m13.f22915h + this.f22913f;
            c5709m14.f22915h = c5709m15.f22915h + c5709m14.f22913f;
            m23077b();
            this.f22917j.m23077b();
            return;
        }
        if (i10 == 5) {
            this.f22910c.f22757b.mo22917U();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m23063g(C5562e c5562e) {
        C5566i m22932g = this.f22910c.m22932g();
        C5709m c5709m = this.f22914g;
        if (c5709m == null) {
            c5562e.m22580f(m22932g, (int) (this.f22915h + 0.5f));
        } else {
            c5562e.m22579e(m22932g, c5562e.m22589r(c5709m.f22910c), (int) (this.f22915h + 0.5f), 6);
        }
    }

    /* renamed from: h */
    public void m23064h(int i10, C5709m c5709m, int i11) {
        this.f22916i = i10;
        this.f22912e = c5709m;
        this.f22913f = i11;
        c5709m.m23076a(this);
    }

    /* renamed from: i */
    public void m23065i(C5709m c5709m, int i10) {
        this.f22912e = c5709m;
        this.f22913f = i10;
        c5709m.m23076a(this);
    }

    /* renamed from: j */
    public void m23066j(C5709m c5709m, int i10, C5710n c5710n) {
        this.f22912e = c5709m;
        c5709m.m23076a(this);
        this.f22919l = c5710n;
        this.f22920m = i10;
        c5710n.m23076a(this);
    }

    /* renamed from: k */
    public float m23067k() {
        return this.f22915h;
    }

    /* renamed from: l */
    public void m23068l(C5709m c5709m, float f10) {
        int i10 = this.f22925b;
        if (i10 == 0 || (this.f22914g != c5709m && this.f22915h != f10)) {
            this.f22914g = c5709m;
            this.f22915h = f10;
            if (i10 == 1) {
                m23078c();
            }
            m23077b();
        }
    }

    /* renamed from: m */
    String m23069m(int i10) {
        return i10 == 1 ? "DIRECT" : i10 == 2 ? "CENTER" : i10 == 3 ? "MATCH" : i10 == 4 ? "CHAIN" : i10 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: n */
    public void m23070n(C5709m c5709m, float f10) {
        this.f22917j = c5709m;
        this.f22918k = f10;
    }

    /* renamed from: o */
    public void m23071o(C5709m c5709m, int i10, C5710n c5710n) {
        this.f22917j = c5709m;
        this.f22921n = c5710n;
        this.f22922o = i10;
    }

    /* renamed from: p */
    public void m23072p(int i10) {
        this.f22916i = i10;
    }

    /* renamed from: q */
    public void m23073q() {
        C5701e m22934i = this.f22910c.m22934i();
        if (m22934i == null) {
            return;
        }
        if (m22934i.m22934i() == this.f22910c) {
            this.f22916i = 4;
            m22934i.m22931f().f22916i = 4;
        }
        int m22929d = this.f22910c.m22929d();
        C5701e.d dVar = this.f22910c.f22758c;
        if (dVar == C5701e.d.RIGHT || dVar == C5701e.d.BOTTOM) {
            m22929d = -m22929d;
        }
        m23065i(m22934i.m22931f(), m22929d);
    }

    public String toString() {
        if (this.f22925b == 1) {
            if (this.f22914g == this) {
                return "[" + this.f22910c + ", RESOLVED: " + this.f22915h + "]  type: " + m23069m(this.f22916i);
            }
            return "[" + this.f22910c + ", RESOLVED: " + this.f22914g + ":" + this.f22915h + "] type: " + m23069m(this.f22916i);
        }
        return "{ " + this.f22910c + " UNRESOLVED} type: " + m23069m(this.f22916i);
    }
}
