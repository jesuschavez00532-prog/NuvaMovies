package p241n;

import p228m.C5560c;
import p228m.C5566i;

/* renamed from: n.e */
/* loaded from: classes.dex */
public class C5701e {

    /* renamed from: b */
    final C5702f f22757b;

    /* renamed from: c */
    final d f22758c;

    /* renamed from: d */
    C5701e f22759d;

    /* renamed from: j */
    C5566i f22765j;

    /* renamed from: a */
    private C5709m f22756a = new C5709m(this);

    /* renamed from: e */
    public int f22760e = 0;

    /* renamed from: f */
    int f22761f = -1;

    /* renamed from: g */
    private c f22762g = c.NONE;

    /* renamed from: h */
    private b f22763h = b.RELAXED;

    /* renamed from: i */
    private int f22764i = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n.e$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22766a;

        static {
            int[] iArr = new int[d.values().length];
            f22766a = iArr;
            try {
                iArr[d.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22766a[d.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22766a[d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22766a[d.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22766a[d.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22766a[d.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22766a[d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22766a[d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22766a[d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: n.e$b */
    /* loaded from: classes.dex */
    public enum b {
        RELAXED,
        STRICT
    }

    /* renamed from: n.e$c */
    /* loaded from: classes.dex */
    public enum c {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: n.e$d */
    /* loaded from: classes.dex */
    public enum d {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C5701e(C5702f c5702f, d dVar) {
        this.f22757b = c5702f;
        this.f22758c = dVar;
    }

    /* renamed from: a */
    public boolean m22926a(C5701e c5701e, int i10, int i11, c cVar, int i12, boolean z10) {
        if (c5701e == null) {
            this.f22759d = null;
            this.f22760e = 0;
            this.f22761f = -1;
            this.f22762g = c.NONE;
            this.f22764i = 2;
            return true;
        }
        if (!z10 && !m22937l(c5701e)) {
            return false;
        }
        this.f22759d = c5701e;
        if (i10 > 0) {
            this.f22760e = i10;
        } else {
            this.f22760e = 0;
        }
        this.f22761f = i11;
        this.f22762g = cVar;
        this.f22764i = i12;
        return true;
    }

    /* renamed from: b */
    public boolean m22927b(C5701e c5701e, int i10, c cVar, int i11) {
        return m22926a(c5701e, i10, -1, cVar, i11, false);
    }

    /* renamed from: c */
    public int m22928c() {
        return this.f22764i;
    }

    /* renamed from: d */
    public int m22929d() {
        C5701e c5701e;
        if (this.f22757b.m22947C() == 8) {
            return 0;
        }
        if (this.f22761f > -1 && (c5701e = this.f22759d) != null && c5701e.f22757b.m22947C() == 8) {
            return this.f22761f;
        }
        return this.f22760e;
    }

    /* renamed from: e */
    public C5702f m22930e() {
        return this.f22757b;
    }

    /* renamed from: f */
    public C5709m m22931f() {
        return this.f22756a;
    }

    /* renamed from: g */
    public C5566i m22932g() {
        return this.f22765j;
    }

    /* renamed from: h */
    public c m22933h() {
        return this.f22762g;
    }

    /* renamed from: i */
    public C5701e m22934i() {
        return this.f22759d;
    }

    /* renamed from: j */
    public d m22935j() {
        return this.f22758c;
    }

    /* renamed from: k */
    public boolean m22936k() {
        if (this.f22759d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m22937l(C5701e c5701e) {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        if (c5701e == null) {
            return false;
        }
        d m22935j = c5701e.m22935j();
        d dVar = this.f22758c;
        if (m22935j == dVar) {
            if (dVar == d.BASELINE && (!c5701e.m22930e().m22959I() || !m22930e().m22959I())) {
                return false;
            }
            return true;
        }
        switch (a.f22766a[dVar.ordinal()]) {
            case 1:
                if (m22935j == d.BASELINE || m22935j == d.CENTER_X || m22935j == d.CENTER_Y) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (m22935j != d.LEFT && m22935j != d.RIGHT) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (c5701e.m22930e() instanceof C5705i) {
                    if (z10 || m22935j == d.CENTER_X) {
                        z12 = true;
                    }
                    return z12;
                }
                return z10;
            case 4:
            case 5:
                if (m22935j != d.TOP && m22935j != d.BOTTOM) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (c5701e.m22930e() instanceof C5705i) {
                    if (z11 || m22935j == d.CENTER_Y) {
                        z12 = true;
                    }
                    return z12;
                }
                return z11;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f22758c.name());
        }
    }

    /* renamed from: m */
    public void m22938m() {
        this.f22759d = null;
        this.f22760e = 0;
        this.f22761f = -1;
        this.f22762g = c.STRONG;
        this.f22764i = 0;
        this.f22763h = b.RELAXED;
        this.f22756a.mo23061e();
    }

    /* renamed from: n */
    public void m22939n(C5560c c5560c) {
        C5566i c5566i = this.f22765j;
        if (c5566i == null) {
            this.f22765j = new C5566i(C5566i.a.UNRESTRICTED, null);
        } else {
            c5566i.m22601d();
        }
    }

    public String toString() {
        return this.f22757b.m22995n() + ":" + this.f22758c.toString();
    }
}
