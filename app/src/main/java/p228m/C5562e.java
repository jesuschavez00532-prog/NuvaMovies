package p228m;

import java.util.Arrays;
import java.util.HashMap;
import p228m.C5566i;
import p241n.C5701e;
import p241n.C5702f;

/* renamed from: m.e */
/* loaded from: classes.dex */
public class C5562e {

    /* renamed from: q */
    private static int f22535q = 1000;

    /* renamed from: r */
    public static final /* synthetic */ int f22536r = 0;

    /* renamed from: c */
    private a f22539c;

    /* renamed from: f */
    C5559b[] f22542f;

    /* renamed from: l */
    final C5560c f22548l;

    /* renamed from: p */
    private final a f22552p;

    /* renamed from: a */
    int f22537a = 0;

    /* renamed from: b */
    private HashMap f22538b = null;

    /* renamed from: d */
    private int f22540d = 32;

    /* renamed from: e */
    private int f22541e = 32;

    /* renamed from: g */
    public boolean f22543g = false;

    /* renamed from: h */
    private boolean[] f22544h = new boolean[32];

    /* renamed from: i */
    int f22545i = 1;

    /* renamed from: j */
    int f22546j = 0;

    /* renamed from: k */
    private int f22547k = 32;

    /* renamed from: m */
    private C5566i[] f22549m = new C5566i[f22535q];

    /* renamed from: n */
    private int f22550n = 0;

    /* renamed from: o */
    private C5559b[] f22551o = new C5559b[32];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m.e$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        C5566i mo22538a(C5562e c5562e, boolean[] zArr);

        /* renamed from: b */
        void mo22539b(C5566i c5566i);

        /* renamed from: c */
        void mo22540c(a aVar);

        void clear();

        C5566i getKey();
    }

    public C5562e() {
        this.f22542f = null;
        this.f22542f = new C5559b[32];
        m22564E();
        C5560c c5560c = new C5560c();
        this.f22548l = c5560c;
        this.f22539c = new C5561d(c5560c);
        this.f22552p = new C5559b(c5560c);
    }

    /* renamed from: A */
    private void m22562A() {
        int i10 = this.f22540d * 2;
        this.f22540d = i10;
        this.f22542f = (C5559b[]) Arrays.copyOf(this.f22542f, i10);
        C5560c c5560c = this.f22548l;
        c5560c.f22534c = (C5566i[]) Arrays.copyOf(c5560c.f22534c, this.f22540d);
        int i11 = this.f22540d;
        this.f22544h = new boolean[i11];
        this.f22541e = i11;
        this.f22547k = i11;
    }

    /* renamed from: D */
    private final int m22563D(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f22545i; i10++) {
            this.f22544h[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f22545i * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f22544h[aVar.getKey().f22557b] = true;
            }
            C5566i mo22538a = aVar.mo22538a(this, this.f22544h);
            if (mo22538a != null) {
                boolean[] zArr = this.f22544h;
                int i12 = mo22538a.f22557b;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (mo22538a != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f22546j; i14++) {
                    C5559b c5559b = this.f22542f[i14];
                    if (c5559b.f22527a.f22562g != C5566i.a.UNRESTRICTED && !c5559b.f22531e && c5559b.m22556s(mo22538a)) {
                        float m22529f = c5559b.f22530d.m22529f(mo22538a);
                        if (m22529f < 0.0f) {
                            float f11 = (-c5559b.f22528b) / m22529f;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    C5559b c5559b2 = this.f22542f[i13];
                    c5559b2.f22527a.f22558c = -1;
                    c5559b2.m22559v(mo22538a);
                    C5566i c5566i = c5559b2.f22527a;
                    c5566i.f22558c = i13;
                    c5566i.m22603f(c5559b2);
                }
            }
            z11 = true;
        }
        return i11;
    }

    /* renamed from: E */
    private void m22564E() {
        int i10 = 0;
        while (true) {
            C5559b[] c5559bArr = this.f22542f;
            if (i10 < c5559bArr.length) {
                C5559b c5559b = c5559bArr[i10];
                if (c5559b != null) {
                    this.f22548l.f22532a.mo22595a(c5559b);
                }
                this.f22542f[i10] = null;
                i10++;
            } else {
                return;
            }
        }
    }

    /* renamed from: G */
    private final void m22565G(C5559b c5559b) {
        if (this.f22546j > 0) {
            c5559b.f22530d.m22537o(c5559b, this.f22542f);
            if (c5559b.f22530d.f22516a == 0) {
                c5559b.f22531e = true;
            }
        }
    }

    /* renamed from: a */
    private C5566i m22566a(C5566i.a aVar, String str) {
        C5566i c5566i = (C5566i) this.f22548l.f22533b.mo22596b();
        if (c5566i == null) {
            c5566i = new C5566i(aVar, str);
            c5566i.m22602e(aVar, str);
        } else {
            c5566i.m22601d();
            c5566i.m22602e(aVar, str);
        }
        int i10 = this.f22550n;
        int i11 = f22535q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f22535q = i12;
            this.f22549m = (C5566i[]) Arrays.copyOf(this.f22549m, i12);
        }
        C5566i[] c5566iArr = this.f22549m;
        int i13 = this.f22550n;
        this.f22550n = i13 + 1;
        c5566iArr[i13] = c5566i;
        return c5566i;
    }

    /* renamed from: g */
    private void m22567g(C5559b c5559b) {
        c5559b.m22541d(this, 0);
    }

    /* renamed from: m */
    private final void m22568m(C5559b c5559b) {
        C5559b c5559b2 = this.f22542f[this.f22546j];
        if (c5559b2 != null) {
            this.f22548l.f22532a.mo22595a(c5559b2);
        }
        C5559b[] c5559bArr = this.f22542f;
        int i10 = this.f22546j;
        c5559bArr[i10] = c5559b;
        C5566i c5566i = c5559b.f22527a;
        c5566i.f22558c = i10;
        this.f22546j = i10 + 1;
        c5566i.m22603f(c5559b);
    }

    /* renamed from: o */
    private void m22569o() {
        for (int i10 = 0; i10 < this.f22546j; i10++) {
            C5559b c5559b = this.f22542f[i10];
            c5559b.f22527a.f22560e = c5559b.f22528b;
        }
    }

    /* renamed from: t */
    public static C5559b m22570t(C5562e c5562e, C5566i c5566i, C5566i c5566i2, C5566i c5566i3, float f10, boolean z10) {
        C5559b m22590s = c5562e.m22590s();
        if (z10) {
            c5562e.m22567g(m22590s);
        }
        return m22590s.m22546i(c5566i, c5566i2, c5566i3, f10);
    }

    /* renamed from: v */
    private int m22571v(a aVar) {
        float f10;
        boolean z10;
        int i10 = 0;
        while (true) {
            f10 = 0.0f;
            if (i10 < this.f22546j) {
                C5559b c5559b = this.f22542f[i10];
                if (c5559b.f22527a.f22562g != C5566i.a.UNRESTRICTED && c5559b.f22528b < 0.0f) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                i11++;
                float f11 = Float.MAX_VALUE;
                int i12 = 0;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                while (i12 < this.f22546j) {
                    C5559b c5559b2 = this.f22542f[i12];
                    if (c5559b2.f22527a.f22562g != C5566i.a.UNRESTRICTED && !c5559b2.f22531e && c5559b2.f22528b < f10) {
                        int i16 = 1;
                        while (i16 < this.f22545i) {
                            C5566i c5566i = this.f22548l.f22534c[i16];
                            float m22529f = c5559b2.f22530d.m22529f(c5566i);
                            if (m22529f > f10) {
                                for (int i17 = 0; i17 < 7; i17++) {
                                    float f12 = c5566i.f22561f[i17] / m22529f;
                                    if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                        i15 = i17;
                                        f11 = f12;
                                        i13 = i12;
                                        i14 = i16;
                                    }
                                }
                            }
                            i16++;
                            f10 = 0.0f;
                        }
                    }
                    i12++;
                    f10 = 0.0f;
                }
                if (i13 != -1) {
                    C5559b c5559b3 = this.f22542f[i13];
                    c5559b3.f22527a.f22558c = -1;
                    c5559b3.m22559v(this.f22548l.f22534c[i14]);
                    C5566i c5566i2 = c5559b3.f22527a;
                    c5566i2.f22558c = i13;
                    c5566i2.m22603f(c5559b3);
                } else {
                    z11 = true;
                }
                if (i11 > this.f22545i / 2) {
                    z11 = true;
                }
                f10 = 0.0f;
            }
            return i11;
        }
        return 0;
    }

    /* renamed from: y */
    public static AbstractC5563f m22572y() {
        return null;
    }

    /* renamed from: B */
    public void m22573B() {
        if (this.f22543g) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 < this.f22546j) {
                    if (!this.f22542f[i10].f22531e) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                m22574C(this.f22539c);
                return;
            } else {
                m22569o();
                return;
            }
        }
        m22574C(this.f22539c);
    }

    /* renamed from: C */
    void m22574C(a aVar) {
        m22565G((C5559b) aVar);
        m22571v(aVar);
        m22563D(aVar, false);
        m22569o();
    }

    /* renamed from: F */
    public void m22575F() {
        C5560c c5560c;
        int i10 = 0;
        while (true) {
            c5560c = this.f22548l;
            C5566i[] c5566iArr = c5560c.f22534c;
            if (i10 >= c5566iArr.length) {
                break;
            }
            C5566i c5566i = c5566iArr[i10];
            if (c5566i != null) {
                c5566i.m22601d();
            }
            i10++;
        }
        c5560c.f22533b.mo22597c(this.f22549m, this.f22550n);
        this.f22550n = 0;
        Arrays.fill(this.f22548l.f22534c, (Object) null);
        HashMap hashMap = this.f22538b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f22537a = 0;
        this.f22539c.clear();
        this.f22545i = 1;
        for (int i11 = 0; i11 < this.f22546j; i11++) {
            this.f22542f[i11].f22529c = false;
        }
        m22564E();
        this.f22546j = 0;
    }

    /* renamed from: b */
    public void m22576b(C5702f c5702f, C5702f c5702f2, float f10, int i10) {
        C5701e.d dVar = C5701e.d.LEFT;
        C5566i m22589r = m22589r(c5702f.mo22983h(dVar));
        C5701e.d dVar2 = C5701e.d.TOP;
        C5566i m22589r2 = m22589r(c5702f.mo22983h(dVar2));
        C5701e.d dVar3 = C5701e.d.RIGHT;
        C5566i m22589r3 = m22589r(c5702f.mo22983h(dVar3));
        C5701e.d dVar4 = C5701e.d.BOTTOM;
        C5566i m22589r4 = m22589r(c5702f.mo22983h(dVar4));
        C5566i m22589r5 = m22589r(c5702f2.mo22983h(dVar));
        C5566i m22589r6 = m22589r(c5702f2.mo22983h(dVar2));
        C5566i m22589r7 = m22589r(c5702f2.mo22983h(dVar3));
        C5566i m22589r8 = m22589r(c5702f2.mo22983h(dVar4));
        C5559b m22590s = m22590s();
        double d10 = f10;
        double sin = Math.sin(d10);
        double d11 = i10;
        Double.isNaN(d11);
        m22590s.m22553p(m22589r2, m22589r4, m22589r6, m22589r8, (float) (sin * d11));
        m22578d(m22590s);
        C5559b m22590s2 = m22590s();
        double cos = Math.cos(d10);
        Double.isNaN(d11);
        m22590s2.m22553p(m22589r, m22589r3, m22589r5, m22589r7, (float) (cos * d11));
        m22578d(m22590s2);
    }

    /* renamed from: c */
    public void m22577c(C5566i c5566i, C5566i c5566i2, int i10, float f10, C5566i c5566i3, C5566i c5566i4, int i11, int i12) {
        C5559b m22590s = m22590s();
        m22590s.m22544g(c5566i, c5566i2, i10, f10, c5566i3, c5566i4, i11);
        if (i12 != 6) {
            m22590s.m22541d(this, i12);
        }
        m22578d(m22590s);
    }

    /* renamed from: d */
    public void m22578d(C5559b c5559b) {
        C5566i m22558u;
        if (c5559b == null) {
            return;
        }
        boolean z10 = true;
        if (this.f22546j + 1 >= this.f22547k || this.f22545i + 1 >= this.f22541e) {
            m22562A();
        }
        boolean z11 = false;
        if (!c5559b.f22531e) {
            m22565G(c5559b);
            if (c5559b.m22557t()) {
                return;
            }
            c5559b.m22554q();
            if (c5559b.m22543f(this)) {
                C5566i m22588q = m22588q();
                c5559b.f22527a = m22588q;
                m22568m(c5559b);
                this.f22552p.mo22540c(c5559b);
                m22563D(this.f22552p, true);
                if (m22588q.f22558c == -1) {
                    if (c5559b.f22527a == m22588q && (m22558u = c5559b.m22558u(m22588q)) != null) {
                        c5559b.m22559v(m22558u);
                    }
                    if (!c5559b.f22531e) {
                        c5559b.f22527a.m22603f(c5559b);
                    }
                    this.f22546j--;
                }
            } else {
                z10 = false;
            }
            if (!c5559b.m22555r()) {
                return;
            } else {
                z11 = z10;
            }
        }
        if (!z11) {
            m22568m(c5559b);
        }
    }

    /* renamed from: e */
    public C5559b m22579e(C5566i c5566i, C5566i c5566i2, int i10, int i11) {
        C5559b m22590s = m22590s();
        m22590s.m22550m(c5566i, c5566i2, i10);
        if (i11 != 6) {
            m22590s.m22541d(this, i11);
        }
        m22578d(m22590s);
        return m22590s;
    }

    /* renamed from: f */
    public void m22580f(C5566i c5566i, int i10) {
        int i11 = c5566i.f22558c;
        if (i11 != -1) {
            C5559b c5559b = this.f22542f[i11];
            if (c5559b.f22531e) {
                c5559b.f22528b = i10;
                return;
            }
            if (c5559b.f22530d.f22516a == 0) {
                c5559b.f22531e = true;
                c5559b.f22528b = i10;
                return;
            } else {
                C5559b m22590s = m22590s();
                m22590s.m22549l(c5566i, i10);
                m22578d(m22590s);
                return;
            }
        }
        C5559b m22590s2 = m22590s();
        m22590s2.m22545h(c5566i, i10);
        m22578d(m22590s2);
    }

    /* renamed from: h */
    public void m22581h(C5566i c5566i, C5566i c5566i2, boolean z10) {
        C5559b m22590s = m22590s();
        C5566i m22591u = m22591u();
        m22591u.f22559d = 0;
        m22590s.m22551n(c5566i, c5566i2, m22591u, 0);
        if (z10) {
            m22586n(m22590s, (int) (m22590s.f22530d.m22529f(m22591u) * (-1.0f)), 1);
        }
        m22578d(m22590s);
    }

    /* renamed from: i */
    public void m22582i(C5566i c5566i, C5566i c5566i2, int i10, int i11) {
        C5559b m22590s = m22590s();
        C5566i m22591u = m22591u();
        m22591u.f22559d = 0;
        m22590s.m22551n(c5566i, c5566i2, m22591u, i10);
        if (i11 != 6) {
            m22586n(m22590s, (int) (m22590s.f22530d.m22529f(m22591u) * (-1.0f)), i11);
        }
        m22578d(m22590s);
    }

    /* renamed from: j */
    public void m22583j(C5566i c5566i, C5566i c5566i2, boolean z10) {
        C5559b m22590s = m22590s();
        C5566i m22591u = m22591u();
        m22591u.f22559d = 0;
        m22590s.m22552o(c5566i, c5566i2, m22591u, 0);
        if (z10) {
            m22586n(m22590s, (int) (m22590s.f22530d.m22529f(m22591u) * (-1.0f)), 1);
        }
        m22578d(m22590s);
    }

    /* renamed from: k */
    public void m22584k(C5566i c5566i, C5566i c5566i2, int i10, int i11) {
        C5559b m22590s = m22590s();
        C5566i m22591u = m22591u();
        m22591u.f22559d = 0;
        m22590s.m22552o(c5566i, c5566i2, m22591u, i10);
        if (i11 != 6) {
            m22586n(m22590s, (int) (m22590s.f22530d.m22529f(m22591u) * (-1.0f)), i11);
        }
        m22578d(m22590s);
    }

    /* renamed from: l */
    public void m22585l(C5566i c5566i, C5566i c5566i2, C5566i c5566i3, C5566i c5566i4, float f10, int i10) {
        C5559b m22590s = m22590s();
        m22590s.m22547j(c5566i, c5566i2, c5566i3, c5566i4, f10);
        if (i10 != 6) {
            m22590s.m22541d(this, i10);
        }
        m22578d(m22590s);
    }

    /* renamed from: n */
    void m22586n(C5559b c5559b, int i10, int i11) {
        c5559b.m22542e(m22587p(i11, null), i10);
    }

    /* renamed from: p */
    public C5566i m22587p(int i10, String str) {
        if (this.f22545i + 1 >= this.f22541e) {
            m22562A();
        }
        C5566i m22566a = m22566a(C5566i.a.ERROR, str);
        int i11 = this.f22537a + 1;
        this.f22537a = i11;
        this.f22545i++;
        m22566a.f22557b = i11;
        m22566a.f22559d = i10;
        this.f22548l.f22534c[i11] = m22566a;
        this.f22539c.mo22539b(m22566a);
        return m22566a;
    }

    /* renamed from: q */
    public C5566i m22588q() {
        if (this.f22545i + 1 >= this.f22541e) {
            m22562A();
        }
        C5566i m22566a = m22566a(C5566i.a.SLACK, null);
        int i10 = this.f22537a + 1;
        this.f22537a = i10;
        this.f22545i++;
        m22566a.f22557b = i10;
        this.f22548l.f22534c[i10] = m22566a;
        return m22566a;
    }

    /* renamed from: r */
    public C5566i m22589r(Object obj) {
        C5566i c5566i = null;
        if (obj == null) {
            return null;
        }
        if (this.f22545i + 1 >= this.f22541e) {
            m22562A();
        }
        if (obj instanceof C5701e) {
            C5701e c5701e = (C5701e) obj;
            c5566i = c5701e.m22932g();
            if (c5566i == null) {
                c5701e.m22939n(this.f22548l);
                c5566i = c5701e.m22932g();
            }
            int i10 = c5566i.f22557b;
            if (i10 == -1 || i10 > this.f22537a || this.f22548l.f22534c[i10] == null) {
                if (i10 != -1) {
                    c5566i.m22601d();
                }
                int i11 = this.f22537a + 1;
                this.f22537a = i11;
                this.f22545i++;
                c5566i.f22557b = i11;
                c5566i.f22562g = C5566i.a.UNRESTRICTED;
                this.f22548l.f22534c[i11] = c5566i;
            }
        }
        return c5566i;
    }

    /* renamed from: s */
    public C5559b m22590s() {
        C5559b c5559b = (C5559b) this.f22548l.f22532a.mo22596b();
        if (c5559b == null) {
            c5559b = new C5559b(this.f22548l);
        } else {
            c5559b.m22560w();
        }
        C5566i.m22598b();
        return c5559b;
    }

    /* renamed from: u */
    public C5566i m22591u() {
        if (this.f22545i + 1 >= this.f22541e) {
            m22562A();
        }
        C5566i m22566a = m22566a(C5566i.a.SLACK, null);
        int i10 = this.f22537a + 1;
        this.f22537a = i10;
        this.f22545i++;
        m22566a.f22557b = i10;
        this.f22548l.f22534c[i10] = m22566a;
        return m22566a;
    }

    /* renamed from: w */
    public void m22592w(AbstractC5563f abstractC5563f) {
    }

    /* renamed from: x */
    public C5560c m22593x() {
        return this.f22548l;
    }

    /* renamed from: z */
    public int m22594z(Object obj) {
        C5566i m22932g = ((C5701e) obj).m22932g();
        if (m22932g != null) {
            return (int) (m22932g.f22560e + 0.5f);
        }
        return 0;
    }
}
