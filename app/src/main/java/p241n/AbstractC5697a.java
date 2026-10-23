package p241n;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p241n.C5702f;

/* renamed from: n.a */
/* loaded from: classes.dex */
public abstract class AbstractC5697a {
    /* renamed from: a */
    public static void m22902a(C5703g c5703g) {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        if ((c5703g.m23028S0() & 32) != 32) {
            m22911j(c5703g);
            return;
        }
        c5703g.f22878O0 = true;
        c5703g.f22872I0 = false;
        c5703g.f22873J0 = false;
        c5703g.f22874K0 = false;
        ArrayList<C5702f> arrayList = c5703g.f22936v0;
        List<C5704h> list = c5703g.f22871H0;
        C5702f.b m23005s = c5703g.m23005s();
        C5702f.b bVar = C5702f.b.WRAP_CONTENT;
        if (m23005s == bVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c5703g.m22945B() == bVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        list.clear();
        for (C5702f c5702f : arrayList) {
            c5702f.f22845r = null;
            c5702f.f22832k0 = false;
            c5702f.mo22916S();
        }
        for (C5702f c5702f2 : arrayList) {
            if (c5702f2.f22845r == null && !m22903b(c5702f2, list, z12)) {
                m22911j(c5703g);
                c5703g.f22878O0 = false;
                return;
            }
        }
        int i10 = 0;
        int i11 = 0;
        for (C5704h c5704h : list) {
            i10 = Math.max(i10, m22904c(c5704h, 0));
            i11 = Math.max(i11, m22904c(c5704h, 1));
        }
        if (z10) {
            c5703g.m22982g0(C5702f.b.FIXED);
            c5703g.m23018y0(i10);
            c5703g.f22872I0 = true;
            c5703g.f22873J0 = true;
            c5703g.f22875L0 = i10;
        }
        if (z11) {
            c5703g.m23010u0(C5702f.b.FIXED);
            c5703g.m22975b0(i11);
            c5703g.f22872I0 = true;
            c5703g.f22874K0 = true;
            c5703g.f22876M0 = i11;
        }
        m22910i(list, 0, c5703g.m22949D());
        m22910i(list, 1, c5703g.m23003r());
    }

    /* renamed from: b */
    private static boolean m22903b(C5702f c5702f, List list, boolean z10) {
        C5704h c5704h = new C5704h(new ArrayList(), true);
        list.add(c5704h);
        return m22912k(c5702f, c5704h, list, z10);
    }

    /* renamed from: c */
    private static int m22904c(C5704h c5704h, int i10) {
        boolean z10 = false;
        int i11 = i10 * 2;
        List m23045b = c5704h.m23045b(i10);
        int size = m23045b.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            C5702f c5702f = (C5702f) m23045b.get(i13);
            C5701e[] c5701eArr = c5702f.f22787C;
            C5701e c5701e = c5701eArr[i11 + 1].f22759d;
            if (c5701e != null && (c5701eArr[i11].f22759d == null || c5701e == null)) {
                z10 = false;
            } else {
                z10 = true;
            }
            i12 = Math.max(i12, m22905d(c5702f, i10, z10, 0));
        }
        c5704h.f22890e[i10] = i12;
        return i12;
    }

    /* renamed from: d */
    private static int m22905d(C5702f c5702f, int i10, boolean z10, int i11) {
        boolean z11 = false;
        int m23003r;
        int m22987j;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int m23003r2;
        int m23003r3;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        if (!c5702f.f22828i0) {
            return 0;
        }
        if (c5702f.f22855y.f22759d != null && i10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            m23003r = c5702f.m22987j();
            m22987j = c5702f.m23003r() - c5702f.m22987j();
            i13 = i10 * 2;
            i12 = i13 + 1;
        } else {
            m23003r = c5702f.m23003r() - c5702f.m22987j();
            m22987j = c5702f.m22987j();
            i12 = i10 * 2;
            i13 = i12 + 1;
        }
        C5701e[] c5701eArr = c5702f.f22787C;
        if (c5701eArr[i12].f22759d != null && c5701eArr[i13].f22759d == null) {
            i14 = -1;
            int i21 = i12;
            i12 = i13;
            i13 = i21;
        } else {
            i14 = 1;
        }
        if (z11) {
            i15 = i11 - m23003r;
        } else {
            i15 = i11;
        }
        int m22929d = (c5701eArr[i13].m22929d() * i14) + m22906e(c5702f, i10);
        int i22 = i15 + m22929d;
        if (i10 == 0) {
            m23003r2 = c5702f.m22949D();
        } else {
            m23003r2 = c5702f.m23003r();
        }
        int i23 = m23003r2 * i14;
        Iterator it = c5702f.f22787C[i13].m22931f().f22924a.iterator();
        while (it.hasNext()) {
            i20 = Math.max(i20, m22905d(((C5709m) ((AbstractC5711o) it.next())).f22910c.f22757b, i10, z10, i22));
        }
        int i24 = 0;
        for (Iterator it2 = c5702f.f22787C[i12].m22931f().f22924a.iterator(); it2.hasNext(); it2 = it2) {
            i24 = Math.max(i24, m22905d(((C5709m) ((AbstractC5711o) it2.next())).f22910c.f22757b, i10, z10, i23 + i22));
        }
        if (z11) {
            i20 -= m23003r;
            i16 = i24 + m22987j;
        } else {
            if (i10 == 0) {
                m23003r3 = c5702f.m22949D();
            } else {
                m23003r3 = c5702f.m23003r();
            }
            i16 = i24 + (m23003r3 * i14);
        }
        int i25 = 1;
        if (i10 == 1) {
            Iterator it3 = c5702f.f22855y.m22931f().f22924a.iterator();
            int i26 = 0;
            while (it3.hasNext()) {
                Iterator it4 = it3;
                C5709m c5709m = (C5709m) ((AbstractC5711o) it3.next());
                if (i14 == i25) {
                    i26 = Math.max(i26, m22905d(c5709m.f22910c.f22757b, i10, z10, m23003r + i22));
                    i19 = i12;
                } else {
                    i19 = i12;
                    i26 = Math.max(i26, m22905d(c5709m.f22910c.f22757b, i10, z10, (m22987j * i14) + i22));
                }
                it3 = it4;
                i12 = i19;
                i25 = 1;
            }
            i17 = i12;
            int i27 = i26;
            if (c5702f.f22855y.m22931f().f22924a.size() > 0 && !z11) {
                if (i14 == 1) {
                    i18 = i27 + m23003r;
                } else {
                    i18 = i27 - m22987j;
                }
            } else {
                i18 = i27;
            }
        } else {
            i17 = i12;
            i18 = 0;
        }
        int max = m22929d + Math.max(i20, Math.max(i16, i18));
        int i28 = i23 + i22;
        if (i14 == -1) {
            i28 = i22;
            i22 = i28;
        }
        if (z10) {
            AbstractC5707k.m23060e(c5702f, i10, i22);
            c5702f.m22973Z(i22, i28, i10);
        } else {
            c5702f.f22845r.m23044a(c5702f, i10);
            c5702f.m23002q0(i22, i10);
        }
        if (c5702f.m22997o(i10) == C5702f.b.MATCH_CONSTRAINT && c5702f.f22793I != 0.0f) {
            c5702f.f22845r.m23044a(c5702f, i10);
        }
        C5701e[] c5701eArr2 = c5702f.f22787C;
        if (c5701eArr2[i13].f22759d != null && c5701eArr2[i17].f22759d != null) {
            C5702f m23009u = c5702f.m23009u();
            C5701e[] c5701eArr3 = c5702f.f22787C;
            if (c5701eArr3[i13].f22759d.f22757b == m23009u && c5701eArr3[i17].f22759d.f22757b == m23009u) {
                c5702f.f22845r.m23044a(c5702f, i10);
            }
        }
        return max;
    }

    /* renamed from: e */
    private static int m22906e(C5702f c5702f, int i10) {
        C5701e c5701e;
        float f10 = 0.0f;
        int i11 = i10 * 2;
        C5701e[] c5701eArr = c5702f.f22787C;
        C5701e c5701e2 = c5701eArr[i11];
        C5701e c5701e3 = c5701eArr[i11 + 1];
        C5701e c5701e4 = c5701e2.f22759d;
        if (c5701e4 != null) {
            C5702f c5702f2 = c5701e4.f22757b;
            C5702f c5702f3 = c5702f.f22790F;
            if (c5702f2 == c5702f3 && (c5701e = c5701e3.f22759d) != null && c5701e.f22757b == c5702f3) {
                int m23007t = c5702f3.m23007t(i10);
                if (i10 == 0) {
                    f10 = c5702f.f22810Z;
                } else {
                    f10 = c5702f.f22812a0;
                }
                return (int) ((((m23007t - c5701e2.m22929d()) - c5701e3.m22929d()) - c5702f.m23007t(i10)) * f10);
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: f */
    private static void m22907f(C5703g c5703g, C5702f c5702f, C5704h c5704h) {
        c5704h.f22889d = false;
        c5703g.f22878O0 = false;
        c5702f.f22828i0 = false;
    }

    /* renamed from: g */
    private static int m22908g(C5702f c5702f) {
        float m22949D;
        float m23003r;
        C5702f.b m23005s = c5702f.m23005s();
        C5702f.b bVar = C5702f.b.MATCH_CONSTRAINT;
        if (m23005s == bVar) {
            if (c5702f.f22794J == 0) {
                m23003r = c5702f.m23003r() * c5702f.f22793I;
            } else {
                m23003r = c5702f.m23003r() / c5702f.f22793I;
            }
            int i10 = (int) m23003r;
            c5702f.m23018y0(i10);
            return i10;
        }
        if (c5702f.m22945B() == bVar) {
            if (c5702f.f22794J == 1) {
                m22949D = c5702f.m22949D() * c5702f.f22793I;
            } else {
                m22949D = c5702f.m22949D() / c5702f.f22793I;
            }
            int i11 = (int) m22949D;
            c5702f.m22975b0(i11);
            return i11;
        }
        return -1;
    }

    /* renamed from: h */
    private static void m22909h(C5701e c5701e) {
        C5709m m22931f = c5701e.m22931f();
        C5701e c5701e2 = c5701e.f22759d;
        if (c5701e2 != null && c5701e2.f22759d != c5701e) {
            c5701e2.m22931f().m23076a(m22931f);
        }
    }

    /* renamed from: i */
    public static void m22910i(List list, int i10, int i11) {
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            for (C5702f c5702f : ((C5704h) list.get(i12)).m23046c(i10)) {
                if (c5702f.f22828i0) {
                    m22913l(c5702f, i10, i11);
                }
            }
        }
    }

    /* renamed from: j */
    private static void m22911j(C5703g c5703g) {
        c5703g.f22871H0.clear();
        c5703g.f22871H0.add(0, new C5704h(c5703g.f22936v0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0159, code lost:
    
        if (r4.f22757b == r5) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0110, code lost:
    
        if (r4.f22757b == r5) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019a  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m22912k(p241n.C5702f r8, p241n.C5704h r9, java.util.List r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p241n.AbstractC5697a.m22912k(n.f, n.h, java.util.List, boolean):boolean");
    }

    /* renamed from: l */
    private static void m22913l(C5702f c5702f, int i10, int i11) {
        boolean z10 = false;
        int i12 = i10 * 2;
        C5701e[] c5701eArr = c5702f.f22787C;
        C5701e c5701e = c5701eArr[i12];
        C5701e c5701e2 = c5701eArr[i12 + 1];
        if (c5701e.f22759d != null && c5701e2.f22759d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            AbstractC5707k.m23060e(c5702f, i10, m22906e(c5702f, i10) + c5701e.m22929d());
            return;
        }
        if (c5702f.f22793I != 0.0f && c5702f.m22997o(i10) == C5702f.b.MATCH_CONSTRAINT) {
            int m22908g = m22908g(c5702f);
            int i13 = (int) c5702f.f22787C[i12].m22931f().f22915h;
            c5701e2.m22931f().f22914g = c5701e.m22931f();
            c5701e2.m22931f().f22915h = m22908g;
            c5701e2.m22931f().f22925b = 1;
            c5702f.m22973Z(i13, i13 + m22908g, i10);
            return;
        }
        int m23011v = i11 - c5702f.m23011v(i10);
        int m23007t = m23011v - c5702f.m23007t(i10);
        c5702f.m22973Z(m23007t, m23011v, i10);
        AbstractC5707k.m23060e(c5702f, i10, m23007t);
    }
}
