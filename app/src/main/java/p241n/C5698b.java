package p241n;

import java.util.ArrayList;
import p228m.C5562e;
import p228m.C5566i;
import p241n.C5702f;

/* renamed from: n.b */
/* loaded from: classes.dex */
public class C5698b extends AbstractC5706j {

    /* renamed from: x0 */
    private int f22736x0 = 0;

    /* renamed from: y0 */
    private ArrayList f22737y0 = new ArrayList(4);

    /* renamed from: z0 */
    private boolean f22738z0 = true;

    /* renamed from: K0 */
    public void m22914K0(boolean z10) {
        this.f22738z0 = z10;
    }

    /* renamed from: L0 */
    public void m22915L0(int i10) {
        this.f22736x0 = i10;
    }

    @Override // p241n.C5702f
    /* renamed from: S */
    public void mo22916S() {
        super.mo22916S();
        this.f22737y0.clear();
    }

    @Override // p241n.C5702f
    /* renamed from: U */
    public void mo22917U() {
        C5709m m22931f;
        float f10 = 0.0f;
        C5709m c5709m;
        int i10 = this.f22736x0;
        float f11 = Float.MAX_VALUE;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return;
                    } else {
                        m22931f = this.f22854x.m22931f();
                    }
                } else {
                    m22931f = this.f22852v.m22931f();
                }
            } else {
                m22931f = this.f22853w.m22931f();
            }
            f11 = 0.0f;
        } else {
            m22931f = this.f22851u.m22931f();
        }
        int size = this.f22737y0.size();
        C5709m c5709m2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            C5709m c5709m3 = (C5709m) this.f22737y0.get(i11);
            if (c5709m3.f22925b != 1) {
                return;
            }
            int i12 = this.f22736x0;
            if (i12 != 0 && i12 != 2) {
                f10 = c5709m3.f22915h;
                if (f10 > f11) {
                    c5709m = c5709m3.f22914g;
                    c5709m2 = c5709m;
                    f11 = f10;
                }
            } else {
                f10 = c5709m3.f22915h;
                if (f10 < f11) {
                    c5709m = c5709m3.f22914g;
                    c5709m2 = c5709m;
                    f11 = f10;
                }
            }
        }
        C5562e.m22572y();
        m22931f.f22914g = c5709m2;
        m22931f.f22915h = f11;
        m22931f.m23077b();
        int i13 = this.f22736x0;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        return;
                    }
                    this.f22852v.m22931f().m23068l(c5709m2, f11);
                    return;
                }
                this.f22854x.m22931f().m23068l(c5709m2, f11);
                return;
            }
            this.f22851u.m22931f().m23068l(c5709m2, f11);
            return;
        }
        this.f22853w.m22931f().m23068l(c5709m2, f11);
    }

    @Override // p241n.C5702f
    /* renamed from: b */
    public void mo22918b(C5562e c5562e) {
        C5701e[] c5701eArr;
        boolean z10;
        int i10 = 0;
        int i11 = 0;
        C5701e[] c5701eArr2 = this.f22787C;
        c5701eArr2[0] = this.f22851u;
        c5701eArr2[2] = this.f22852v;
        c5701eArr2[1] = this.f22853w;
        c5701eArr2[3] = this.f22854x;
        int i12 = 0;
        while (true) {
            c5701eArr = this.f22787C;
            if (i12 >= c5701eArr.length) {
                break;
            }
            C5701e c5701e = c5701eArr[i12];
            c5701e.f22765j = c5562e.m22589r(c5701e);
            i12++;
        }
        int i13 = this.f22736x0;
        if (i13 >= 0 && i13 < 4) {
            C5701e c5701e2 = c5701eArr[i13];
            for (int i14 = 0; i14 < this.f22908w0; i14++) {
                C5702f c5702f = this.f22907v0[i14];
                if ((this.f22738z0 || c5702f.mo22919c()) && ((((i10 = this.f22736x0) == 0 || i10 == 1) && c5702f.m23005s() == C5702f.b.MATCH_CONSTRAINT) || (((i11 = this.f22736x0) == 2 || i11 == 3) && c5702f.m22945B() == C5702f.b.MATCH_CONSTRAINT))) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            int i15 = this.f22736x0;
            if (i15 == 0 || i15 == 1 ? m23009u().m23005s() == C5702f.b.WRAP_CONTENT : m23009u().m22945B() == C5702f.b.WRAP_CONTENT) {
                z10 = false;
            }
            for (int i16 = 0; i16 < this.f22908w0; i16++) {
                C5702f c5702f2 = this.f22907v0[i16];
                if (this.f22738z0 || c5702f2.mo22919c()) {
                    C5566i m22589r = c5562e.m22589r(c5702f2.f22787C[this.f22736x0]);
                    C5701e[] c5701eArr3 = c5702f2.f22787C;
                    int i17 = this.f22736x0;
                    c5701eArr3[i17].f22765j = m22589r;
                    if (i17 != 0 && i17 != 2) {
                        c5562e.m22581h(c5701e2.f22765j, m22589r, z10);
                    } else {
                        c5562e.m22583j(c5701e2.f22765j, m22589r, z10);
                    }
                }
            }
            int i18 = this.f22736x0;
            if (i18 == 0) {
                c5562e.m22579e(this.f22853w.f22765j, this.f22851u.f22765j, 0, 6);
                if (!z10) {
                    c5562e.m22579e(this.f22851u.f22765j, this.f22790F.f22853w.f22765j, 0, 5);
                    return;
                }
                return;
            }
            if (i18 == 1) {
                c5562e.m22579e(this.f22851u.f22765j, this.f22853w.f22765j, 0, 6);
                if (!z10) {
                    c5562e.m22579e(this.f22851u.f22765j, this.f22790F.f22851u.f22765j, 0, 5);
                    return;
                }
                return;
            }
            if (i18 == 2) {
                c5562e.m22579e(this.f22854x.f22765j, this.f22852v.f22765j, 0, 6);
                if (!z10) {
                    c5562e.m22579e(this.f22852v.f22765j, this.f22790F.f22854x.f22765j, 0, 5);
                    return;
                }
                return;
            }
            if (i18 == 3) {
                c5562e.m22579e(this.f22852v.f22765j, this.f22854x.f22765j, 0, 6);
                if (!z10) {
                    c5562e.m22579e(this.f22852v.f22765j, this.f22790F.f22852v.f22765j, 0, 5);
                }
            }
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
        C5709m m22931f;
        C5709m m22931f2;
        C5702f c5702f = this.f22790F;
        if (c5702f == null || !((C5703g) c5702f).m23034Y0(2)) {
            return;
        }
        int i11 = this.f22736x0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return;
                    } else {
                        m22931f = this.f22854x.m22931f();
                    }
                } else {
                    m22931f = this.f22852v.m22931f();
                }
            } else {
                m22931f = this.f22853w.m22931f();
            }
        } else {
            m22931f = this.f22851u.m22931f();
        }
        m22931f.m23072p(5);
        int i12 = this.f22736x0;
        if (i12 != 0 && i12 != 1) {
            this.f22851u.m22931f().m23068l(null, 0.0f);
            this.f22853w.m22931f().m23068l(null, 0.0f);
        } else {
            this.f22852v.m22931f().m23068l(null, 0.0f);
            this.f22854x.m22931f().m23068l(null, 0.0f);
        }
        this.f22737y0.clear();
        for (int i13 = 0; i13 < this.f22908w0; i13++) {
            C5702f c5702f2 = this.f22907v0[i13];
            if (this.f22738z0 || c5702f2.mo22919c()) {
                int i14 = this.f22736x0;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                m22931f2 = null;
                            } else {
                                m22931f2 = c5702f2.f22854x.m22931f();
                            }
                        } else {
                            m22931f2 = c5702f2.f22852v.m22931f();
                        }
                    } else {
                        m22931f2 = c5702f2.f22853w.m22931f();
                    }
                } else {
                    m22931f2 = c5702f2.f22851u.m22931f();
                }
                if (m22931f2 != null) {
                    this.f22737y0.add(m22931f2);
                    m22931f2.m23076a(m22931f);
                }
            }
        }
    }
}
