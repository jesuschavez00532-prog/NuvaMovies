package p228m;

import p228m.C5562e;
import p228m.C5566i;

/* renamed from: m.b */
/* loaded from: classes.dex */
public class C5559b implements C5562e.a {

    /* renamed from: d */
    public final C5558a f22530d;

    /* renamed from: a */
    C5566i f22527a = null;

    /* renamed from: b */
    float f22528b = 0.0f;

    /* renamed from: c */
    boolean f22529c = false;

    /* renamed from: e */
    boolean f22531e = false;

    public C5559b(C5560c c5560c) {
        this.f22530d = new C5558a(this, c5560c);
    }

    @Override // p228m.C5562e.a
    /* renamed from: a */
    public C5566i mo22538a(C5562e c5562e, boolean[] zArr) {
        return this.f22530d.m22530g(zArr, null);
    }

    @Override // p228m.C5562e.a
    /* renamed from: b */
    public void mo22539b(C5566i c5566i) {
        int i10 = c5566i.f22559d;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f22530d.m22534l(c5566i, f10);
    }

    @Override // p228m.C5562e.a
    /* renamed from: c */
    public void mo22540c(C5562e.a aVar) {
        if (aVar instanceof C5559b) {
            C5559b c5559b = (C5559b) aVar;
            this.f22527a = null;
            this.f22530d.m22526c();
            int i10 = 0;
            while (true) {
                C5558a c5558a = c5559b.f22530d;
                if (i10 < c5558a.f22516a) {
                    this.f22530d.m22524a(c5558a.m22531h(i10), c5559b.f22530d.m22532i(i10), true);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // p228m.C5562e.a
    public void clear() {
        this.f22530d.m22526c();
        this.f22527a = null;
        this.f22528b = 0.0f;
    }

    /* renamed from: d */
    public C5559b m22541d(C5562e c5562e, int i10) {
        this.f22530d.m22534l(c5562e.m22587p(i10, "ep"), 1.0f);
        this.f22530d.m22534l(c5562e.m22587p(i10, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C5559b m22542e(C5566i c5566i, int i10) {
        this.f22530d.m22534l(c5566i, i10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m22543f(C5562e c5562e) {
        boolean z10 = false;
        C5566i m22525b = this.f22530d.m22525b(c5562e);
        if (m22525b == null) {
            z10 = true;
        } else {
            m22559v(m22525b);
            z10 = false;
        }
        if (this.f22530d.f22516a == 0) {
            this.f22531e = true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C5559b m22544g(C5566i c5566i, C5566i c5566i2, int i10, float f10, C5566i c5566i3, C5566i c5566i4, int i11) {
        if (c5566i2 == c5566i3) {
            this.f22530d.m22534l(c5566i, 1.0f);
            this.f22530d.m22534l(c5566i4, 1.0f);
            this.f22530d.m22534l(c5566i2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f22530d.m22534l(c5566i, 1.0f);
            this.f22530d.m22534l(c5566i2, -1.0f);
            this.f22530d.m22534l(c5566i3, -1.0f);
            this.f22530d.m22534l(c5566i4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f22528b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            this.f22530d.m22534l(c5566i, -1.0f);
            this.f22530d.m22534l(c5566i2, 1.0f);
            this.f22528b = i10;
        } else if (f10 >= 1.0f) {
            this.f22530d.m22534l(c5566i3, -1.0f);
            this.f22530d.m22534l(c5566i4, 1.0f);
            this.f22528b = i11;
        } else {
            float f11 = 1.0f - f10;
            this.f22530d.m22534l(c5566i, f11 * 1.0f);
            this.f22530d.m22534l(c5566i2, f11 * (-1.0f));
            this.f22530d.m22534l(c5566i3, (-1.0f) * f10);
            this.f22530d.m22534l(c5566i4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f22528b = ((-i10) * f11) + (i11 * f10);
            }
        }
        return this;
    }

    @Override // p228m.C5562e.a
    public C5566i getKey() {
        return this.f22527a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C5559b m22545h(C5566i c5566i, int i10) {
        this.f22527a = c5566i;
        float f10 = i10;
        c5566i.f22560e = f10;
        this.f22528b = f10;
        this.f22531e = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C5559b m22546i(C5566i c5566i, C5566i c5566i2, C5566i c5566i3, float f10) {
        this.f22530d.m22534l(c5566i, -1.0f);
        this.f22530d.m22534l(c5566i2, 1.0f - f10);
        this.f22530d.m22534l(c5566i3, f10);
        return this;
    }

    /* renamed from: j */
    public C5559b m22547j(C5566i c5566i, C5566i c5566i2, C5566i c5566i3, C5566i c5566i4, float f10) {
        this.f22530d.m22534l(c5566i, -1.0f);
        this.f22530d.m22534l(c5566i2, 1.0f);
        this.f22530d.m22534l(c5566i3, f10);
        this.f22530d.m22534l(c5566i4, -f10);
        return this;
    }

    /* renamed from: k */
    public C5559b m22548k(float f10, float f11, float f12, C5566i c5566i, C5566i c5566i2, C5566i c5566i3, C5566i c5566i4) {
        this.f22528b = 0.0f;
        if (f11 != 0.0f && f10 != f12) {
            if (f10 == 0.0f) {
                this.f22530d.m22534l(c5566i, 1.0f);
                this.f22530d.m22534l(c5566i2, -1.0f);
            } else if (f12 == 0.0f) {
                this.f22530d.m22534l(c5566i3, 1.0f);
                this.f22530d.m22534l(c5566i4, -1.0f);
            } else {
                float f13 = (f10 / f11) / (f12 / f11);
                this.f22530d.m22534l(c5566i, 1.0f);
                this.f22530d.m22534l(c5566i2, -1.0f);
                this.f22530d.m22534l(c5566i4, f13);
                this.f22530d.m22534l(c5566i3, -f13);
            }
        } else {
            this.f22530d.m22534l(c5566i, 1.0f);
            this.f22530d.m22534l(c5566i2, -1.0f);
            this.f22530d.m22534l(c5566i4, 1.0f);
            this.f22530d.m22534l(c5566i3, -1.0f);
        }
        return this;
    }

    /* renamed from: l */
    public C5559b m22549l(C5566i c5566i, int i10) {
        if (i10 < 0) {
            this.f22528b = i10 * (-1);
            this.f22530d.m22534l(c5566i, 1.0f);
        } else {
            this.f22528b = i10;
            this.f22530d.m22534l(c5566i, -1.0f);
        }
        return this;
    }

    /* renamed from: m */
    public C5559b m22550m(C5566i c5566i, C5566i c5566i2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f22528b = i10;
        }
        if (!z10) {
            this.f22530d.m22534l(c5566i, -1.0f);
            this.f22530d.m22534l(c5566i2, 1.0f);
        } else {
            this.f22530d.m22534l(c5566i, 1.0f);
            this.f22530d.m22534l(c5566i2, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C5559b m22551n(C5566i c5566i, C5566i c5566i2, C5566i c5566i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f22528b = i10;
        }
        if (!z10) {
            this.f22530d.m22534l(c5566i, -1.0f);
            this.f22530d.m22534l(c5566i2, 1.0f);
            this.f22530d.m22534l(c5566i3, 1.0f);
        } else {
            this.f22530d.m22534l(c5566i, 1.0f);
            this.f22530d.m22534l(c5566i2, -1.0f);
            this.f22530d.m22534l(c5566i3, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C5559b m22552o(C5566i c5566i, C5566i c5566i2, C5566i c5566i3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f22528b = i10;
        }
        if (!z10) {
            this.f22530d.m22534l(c5566i, -1.0f);
            this.f22530d.m22534l(c5566i2, 1.0f);
            this.f22530d.m22534l(c5566i3, -1.0f);
        } else {
            this.f22530d.m22534l(c5566i, 1.0f);
            this.f22530d.m22534l(c5566i2, -1.0f);
            this.f22530d.m22534l(c5566i3, 1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C5559b m22553p(C5566i c5566i, C5566i c5566i2, C5566i c5566i3, C5566i c5566i4, float f10) {
        this.f22530d.m22534l(c5566i3, 0.5f);
        this.f22530d.m22534l(c5566i4, 0.5f);
        this.f22530d.m22534l(c5566i, -0.5f);
        this.f22530d.m22534l(c5566i2, -0.5f);
        this.f22528b = -f10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m22554q() {
        float f10 = this.f22528b;
        if (f10 < 0.0f) {
            this.f22528b = f10 * (-1.0f);
            this.f22530d.m22533j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m22555r() {
        C5566i c5566i = this.f22527a;
        if (c5566i != null && (c5566i.f22562g == C5566i.a.UNRESTRICTED || this.f22528b >= 0.0f)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m22556s(C5566i c5566i) {
        return this.f22530d.m22527d(c5566i);
    }

    /* renamed from: t */
    public boolean m22557t() {
        if (this.f22527a == null && this.f22528b == 0.0f && this.f22530d.f22516a == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return m22561x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public C5566i m22558u(C5566i c5566i) {
        return this.f22530d.m22530g(null, c5566i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m22559v(C5566i c5566i) {
        C5566i c5566i2 = this.f22527a;
        if (c5566i2 != null) {
            this.f22530d.m22534l(c5566i2, -1.0f);
            this.f22527a = null;
        }
        float m22535m = this.f22530d.m22535m(c5566i, true) * (-1.0f);
        this.f22527a = c5566i;
        if (m22535m == 1.0f) {
            return;
        }
        this.f22528b /= m22535m;
        this.f22530d.m22528e(m22535m);
    }

    /* renamed from: w */
    public void m22560w() {
        this.f22527a = null;
        this.f22530d.m22526c();
        this.f22528b = 0.0f;
        this.f22531e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String m22561x() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p228m.C5559b.m22561x():java.lang.String");
    }
}
