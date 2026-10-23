package p241n;

import java.util.ArrayList;
import p228m.C5562e;
import p228m.C5566i;
import p241n.C5701e;
import p241n.C5702f;

/* renamed from: n.i */
/* loaded from: classes.dex */
public class C5705i extends C5702f {

    /* renamed from: v0 */
    protected float f22901v0 = -1.0f;

    /* renamed from: w0 */
    protected int f22902w0 = -1;

    /* renamed from: x0 */
    protected int f22903x0 = -1;

    /* renamed from: y0 */
    private C5701e f22904y0 = this.f22852v;

    /* renamed from: z0 */
    private int f22905z0 = 0;

    /* renamed from: A0 */
    private boolean f22897A0 = false;

    /* renamed from: B0 */
    private int f22898B0 = 0;

    /* renamed from: C0 */
    private C5708l f22899C0 = new C5708l();

    /* renamed from: D0 */
    private int f22900D0 = 8;

    /* renamed from: n.i$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22906a;

        static {
            int[] iArr = new int[C5701e.d.values().length];
            f22906a = iArr;
            try {
                iArr[C5701e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22906a[C5701e.d.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22906a[C5701e.d.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22906a[C5701e.d.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22906a[C5701e.d.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22906a[C5701e.d.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22906a[C5701e.d.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22906a[C5701e.d.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22906a[C5701e.d.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C5705i() {
        this.f22788D.clear();
        this.f22788D.add(this.f22904y0);
        int length = this.f22787C.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f22787C[i10] = this.f22904y0;
        }
    }

    @Override // p241n.C5702f
    /* renamed from: G0 */
    public void mo22956G0(C5562e c5562e) {
        if (m23009u() == null) {
            return;
        }
        int m22594z = c5562e.m22594z(this.f22904y0);
        if (this.f22905z0 == 1) {
            m22948C0(m22594z);
            m22950D0(0);
            m22975b0(m23009u().m23003r());
            m23018y0(0);
            return;
        }
        m22948C0(0);
        m22950D0(m22594z);
        m23018y0(m23009u().m22949D());
        m22975b0(0);
    }

    /* renamed from: I0 */
    public int m23049I0() {
        return this.f22905z0;
    }

    /* renamed from: J0 */
    public void m23050J0(int i10) {
        if (i10 > -1) {
            this.f22901v0 = -1.0f;
            this.f22902w0 = i10;
            this.f22903x0 = -1;
        }
    }

    /* renamed from: K0 */
    public void m23051K0(int i10) {
        if (i10 > -1) {
            this.f22901v0 = -1.0f;
            this.f22902w0 = -1;
            this.f22903x0 = i10;
        }
    }

    /* renamed from: L0 */
    public void m23052L0(float f10) {
        if (f10 > -1.0f) {
            this.f22901v0 = f10;
            this.f22902w0 = -1;
            this.f22903x0 = -1;
        }
    }

    /* renamed from: M0 */
    public void m23053M0(int i10) {
        if (this.f22905z0 == i10) {
            return;
        }
        this.f22905z0 = i10;
        this.f22788D.clear();
        if (this.f22905z0 == 1) {
            this.f22904y0 = this.f22851u;
        } else {
            this.f22904y0 = this.f22852v;
        }
        this.f22788D.add(this.f22904y0);
        int length = this.f22787C.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f22787C[i11] = this.f22904y0;
        }
    }

    @Override // p241n.C5702f
    /* renamed from: b */
    public void mo22918b(C5562e c5562e) {
        boolean z10 = false;
        C5703g c5703g = (C5703g) m23009u();
        if (c5703g == null) {
            return;
        }
        C5701e mo22983h = c5703g.mo22983h(C5701e.d.LEFT);
        C5701e mo22983h2 = c5703g.mo22983h(C5701e.d.RIGHT);
        C5702f c5702f = this.f22790F;
        boolean z11 = true;
        if (c5702f != null && c5702f.f22789E[0] == C5702f.b.WRAP_CONTENT) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f22905z0 == 0) {
            mo22983h = c5703g.mo22983h(C5701e.d.TOP);
            mo22983h2 = c5703g.mo22983h(C5701e.d.BOTTOM);
            C5702f c5702f2 = this.f22790F;
            if (c5702f2 == null || c5702f2.f22789E[1] != C5702f.b.WRAP_CONTENT) {
                z11 = false;
            }
            z10 = z11;
        }
        if (this.f22902w0 != -1) {
            C5566i m22589r = c5562e.m22589r(this.f22904y0);
            c5562e.m22579e(m22589r, c5562e.m22589r(mo22983h), this.f22902w0, 6);
            if (z10) {
                c5562e.m22582i(c5562e.m22589r(mo22983h2), m22589r, 0, 5);
                return;
            }
            return;
        }
        if (this.f22903x0 != -1) {
            C5566i m22589r2 = c5562e.m22589r(this.f22904y0);
            C5566i m22589r3 = c5562e.m22589r(mo22983h2);
            c5562e.m22579e(m22589r2, m22589r3, -this.f22903x0, 6);
            if (z10) {
                c5562e.m22582i(m22589r2, c5562e.m22589r(mo22983h), 0, 5);
                c5562e.m22582i(m22589r3, m22589r2, 0, 5);
                return;
            }
            return;
        }
        if (this.f22901v0 != -1.0f) {
            c5562e.m22578d(C5562e.m22570t(c5562e, c5562e.m22589r(this.f22904y0), c5562e.m22589r(mo22983h), c5562e.m22589r(mo22983h2), this.f22901v0, this.f22897A0));
        }
    }

    @Override // p241n.C5702f
    /* renamed from: c */
    public boolean mo22919c() {
        return true;
    }

    @Override // p241n.C5702f
    /* renamed from: d */
    public void mo22920d(int i10) {
        C5702f m23009u = m23009u();
        if (m23009u == null) {
            return;
        }
        if (m23049I0() == 1) {
            this.f22852v.m22931f().m23064h(1, m23009u.f22852v.m22931f(), 0);
            this.f22854x.m22931f().m23064h(1, m23009u.f22852v.m22931f(), 0);
            if (this.f22902w0 != -1) {
                this.f22851u.m22931f().m23064h(1, m23009u.f22851u.m22931f(), this.f22902w0);
                this.f22853w.m22931f().m23064h(1, m23009u.f22851u.m22931f(), this.f22902w0);
                return;
            } else if (this.f22903x0 != -1) {
                this.f22851u.m22931f().m23064h(1, m23009u.f22853w.m22931f(), -this.f22903x0);
                this.f22853w.m22931f().m23064h(1, m23009u.f22853w.m22931f(), -this.f22903x0);
                return;
            } else {
                if (this.f22901v0 != -1.0f && m23009u.m23005s() == C5702f.b.FIXED) {
                    int i11 = (int) (m23009u.f22791G * this.f22901v0);
                    this.f22851u.m22931f().m23064h(1, m23009u.f22851u.m22931f(), i11);
                    this.f22853w.m22931f().m23064h(1, m23009u.f22851u.m22931f(), i11);
                    return;
                }
                return;
            }
        }
        this.f22851u.m22931f().m23064h(1, m23009u.f22851u.m22931f(), 0);
        this.f22853w.m22931f().m23064h(1, m23009u.f22851u.m22931f(), 0);
        if (this.f22902w0 != -1) {
            this.f22852v.m22931f().m23064h(1, m23009u.f22852v.m22931f(), this.f22902w0);
            this.f22854x.m22931f().m23064h(1, m23009u.f22852v.m22931f(), this.f22902w0);
        } else if (this.f22903x0 != -1) {
            this.f22852v.m22931f().m23064h(1, m23009u.f22854x.m22931f(), -this.f22903x0);
            this.f22854x.m22931f().m23064h(1, m23009u.f22854x.m22931f(), -this.f22903x0);
        } else if (this.f22901v0 != -1.0f && m23009u.m22945B() == C5702f.b.FIXED) {
            int i12 = (int) (m23009u.f22792H * this.f22901v0);
            this.f22852v.m22931f().m23064h(1, m23009u.f22852v.m22931f(), i12);
            this.f22854x.m22931f().m23064h(1, m23009u.f22852v.m22931f(), i12);
        }
    }

    @Override // p241n.C5702f
    /* renamed from: h */
    public C5701e mo22983h(C5701e.d dVar) {
        switch (a.f22906a[dVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f22905z0 == 1) {
                    return this.f22904y0;
                }
                break;
            case 3:
            case 4:
                if (this.f22905z0 == 0) {
                    return this.f22904y0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(dVar.name());
    }

    @Override // p241n.C5702f
    /* renamed from: i */
    public ArrayList mo22985i() {
        return this.f22788D;
    }
}
