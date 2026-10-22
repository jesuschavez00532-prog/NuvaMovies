package p241n;

import p228m.C5562e;
import p241n.C5702f;

/* renamed from: n.k */
/* loaded from: classes.dex */
public abstract class AbstractC5707k {

    /* renamed from: a */
    static boolean[] f22909a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23056a(int i10, C5702f c5702f) {
        boolean z10;
        boolean z11;
        boolean z12;
        c5702f.m22958H0();
        C5709m m22931f = c5702f.f22851u.m22931f();
        C5709m m22931f2 = c5702f.f22852v.m22931f();
        C5709m m22931f3 = c5702f.f22853w.m22931f();
        C5709m m22931f4 = c5702f.f22854x.m22931f();
        if ((i10 & 8) == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        C5702f.b bVar = c5702f.f22789E[0];
        C5702f.b bVar2 = C5702f.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && m23059d(c5702f, 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m22931f.f22916i != 4 && m22931f3.f22916i != 4) {
            if (c5702f.f22789E[0] != C5702f.b.FIXED && (!z11 || c5702f.m22947C() != 8)) {
                if (z11) {
                    int m22949D = c5702f.m22949D();
                    m22931f.m23072p(1);
                    m22931f3.m23072p(1);
                    C5701e c5701e = c5702f.f22851u.f22759d;
                    if (c5701e == null && c5702f.f22853w.f22759d == null) {
                        if (z10) {
                            m22931f3.m23066j(m22931f, 1, c5702f.m23015x());
                        } else {
                            m22931f3.m23065i(m22931f, m22949D);
                        }
                    } else if (c5701e != null && c5702f.f22853w.f22759d == null) {
                        if (z10) {
                            m22931f3.m23066j(m22931f, 1, c5702f.m23015x());
                        } else {
                            m22931f3.m23065i(m22931f, m22949D);
                        }
                    } else if (c5701e == null && c5702f.f22853w.f22759d != null) {
                        if (z10) {
                            m22931f.m23066j(m22931f3, -1, c5702f.m23015x());
                        } else {
                            m22931f.m23065i(m22931f3, -m22949D);
                        }
                    } else if (c5701e != null && c5702f.f22853w.f22759d != null) {
                        if (z10) {
                            c5702f.m23015x().m23076a(m22931f);
                            c5702f.m23015x().m23076a(m22931f3);
                        }
                        if (c5702f.f22793I == 0.0f) {
                            m22931f.m23072p(3);
                            m22931f3.m23072p(3);
                            m22931f.m23070n(m22931f3, 0.0f);
                            m22931f3.m23070n(m22931f, 0.0f);
                        } else {
                            m22931f.m23072p(2);
                            m22931f3.m23072p(2);
                            m22931f.m23070n(m22931f3, -m22949D);
                            m22931f3.m23070n(m22931f, m22949D);
                            c5702f.m23018y0(m22949D);
                        }
                    }
                }
            } else {
                C5701e c5701e2 = c5702f.f22851u.f22759d;
                if (c5701e2 == null && c5702f.f22853w.f22759d == null) {
                    m22931f.m23072p(1);
                    m22931f3.m23072p(1);
                    if (z10) {
                        m22931f3.m23066j(m22931f, 1, c5702f.m23015x());
                    } else {
                        m22931f3.m23065i(m22931f, c5702f.m22949D());
                    }
                } else if (c5701e2 != null && c5702f.f22853w.f22759d == null) {
                    m22931f.m23072p(1);
                    m22931f3.m23072p(1);
                    if (z10) {
                        m22931f3.m23066j(m22931f, 1, c5702f.m23015x());
                    } else {
                        m22931f3.m23065i(m22931f, c5702f.m22949D());
                    }
                } else if (c5701e2 == null && c5702f.f22853w.f22759d != null) {
                    m22931f.m23072p(1);
                    m22931f3.m23072p(1);
                    m22931f.m23065i(m22931f3, -c5702f.m22949D());
                    if (z10) {
                        m22931f.m23066j(m22931f3, -1, c5702f.m23015x());
                    } else {
                        m22931f.m23065i(m22931f3, -c5702f.m22949D());
                    }
                } else if (c5701e2 != null && c5702f.f22853w.f22759d != null) {
                    m22931f.m23072p(2);
                    m22931f3.m23072p(2);
                    if (z10) {
                        c5702f.m23015x().m23076a(m22931f);
                        c5702f.m23015x().m23076a(m22931f3);
                        m22931f.m23071o(m22931f3, -1, c5702f.m23015x());
                        m22931f3.m23071o(m22931f, 1, c5702f.m23015x());
                    } else {
                        m22931f.m23070n(m22931f3, -c5702f.m22949D());
                        m22931f3.m23070n(m22931f, c5702f.m22949D());
                    }
                }
            }
        }
        if (c5702f.f22789E[1] == bVar2 && m23059d(c5702f, 1)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m22931f2.f22916i != 4 && m22931f4.f22916i != 4) {
            if (c5702f.f22789E[1] != C5702f.b.FIXED && (!z12 || c5702f.m22947C() != 8)) {
                if (z12) {
                    int m23003r = c5702f.m23003r();
                    m22931f2.m23072p(1);
                    m22931f4.m23072p(1);
                    C5701e c5701e3 = c5702f.f22852v.f22759d;
                    if (c5701e3 == null && c5702f.f22854x.f22759d == null) {
                        if (z10) {
                            m22931f4.m23066j(m22931f2, 1, c5702f.m23013w());
                            return;
                        } else {
                            m22931f4.m23065i(m22931f2, m23003r);
                            return;
                        }
                    }
                    if (c5701e3 != null && c5702f.f22854x.f22759d == null) {
                        if (z10) {
                            m22931f4.m23066j(m22931f2, 1, c5702f.m23013w());
                            return;
                        } else {
                            m22931f4.m23065i(m22931f2, m23003r);
                            return;
                        }
                    }
                    if (c5701e3 == null && c5702f.f22854x.f22759d != null) {
                        if (z10) {
                            m22931f2.m23066j(m22931f4, -1, c5702f.m23013w());
                            return;
                        } else {
                            m22931f2.m23065i(m22931f4, -m23003r);
                            return;
                        }
                    }
                    if (c5701e3 != null && c5702f.f22854x.f22759d != null) {
                        if (z10) {
                            c5702f.m23013w().m23076a(m22931f2);
                            c5702f.m23015x().m23076a(m22931f4);
                        }
                        if (c5702f.f22793I == 0.0f) {
                            m22931f2.m23072p(3);
                            m22931f4.m23072p(3);
                            m22931f2.m23070n(m22931f4, 0.0f);
                            m22931f4.m23070n(m22931f2, 0.0f);
                            return;
                        }
                        m22931f2.m23072p(2);
                        m22931f4.m23072p(2);
                        m22931f2.m23070n(m22931f4, -m23003r);
                        m22931f4.m23070n(m22931f2, m23003r);
                        c5702f.m22975b0(m23003r);
                        if (c5702f.f22805U > 0) {
                            c5702f.f22855y.m22931f().m23064h(1, m22931f2, c5702f.f22805U);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C5701e c5701e4 = c5702f.f22852v.f22759d;
            if (c5701e4 == null && c5702f.f22854x.f22759d == null) {
                m22931f2.m23072p(1);
                m22931f4.m23072p(1);
                if (z10) {
                    m22931f4.m23066j(m22931f2, 1, c5702f.m23013w());
                } else {
                    m22931f4.m23065i(m22931f2, c5702f.m23003r());
                }
                C5701e c5701e5 = c5702f.f22855y;
                if (c5701e5.f22759d != null) {
                    c5701e5.m22931f().m23072p(1);
                    m22931f2.m23064h(1, c5702f.f22855y.m22931f(), -c5702f.f22805U);
                    return;
                }
                return;
            }
            if (c5701e4 != null && c5702f.f22854x.f22759d == null) {
                m22931f2.m23072p(1);
                m22931f4.m23072p(1);
                if (z10) {
                    m22931f4.m23066j(m22931f2, 1, c5702f.m23013w());
                } else {
                    m22931f4.m23065i(m22931f2, c5702f.m23003r());
                }
                if (c5702f.f22805U > 0) {
                    c5702f.f22855y.m22931f().m23064h(1, m22931f2, c5702f.f22805U);
                    return;
                }
                return;
            }
            if (c5701e4 == null && c5702f.f22854x.f22759d != null) {
                m22931f2.m23072p(1);
                m22931f4.m23072p(1);
                if (z10) {
                    m22931f2.m23066j(m22931f4, -1, c5702f.m23013w());
                } else {
                    m22931f2.m23065i(m22931f4, -c5702f.m23003r());
                }
                if (c5702f.f22805U > 0) {
                    c5702f.f22855y.m22931f().m23064h(1, m22931f2, c5702f.f22805U);
                    return;
                }
                return;
            }
            if (c5701e4 != null && c5702f.f22854x.f22759d != null) {
                m22931f2.m23072p(2);
                m22931f4.m23072p(2);
                if (z10) {
                    m22931f2.m23071o(m22931f4, -1, c5702f.m23013w());
                    m22931f4.m23071o(m22931f2, 1, c5702f.m23013w());
                    c5702f.m23013w().m23076a(m22931f2);
                    c5702f.m23015x().m23076a(m22931f4);
                } else {
                    m22931f2.m23070n(m22931f4, -c5702f.m23003r());
                    m22931f4.m23070n(m22931f2, c5702f.m23003r());
                }
                if (c5702f.f22805U > 0) {
                    c5702f.f22855y.m22931f().m23064h(1, m22931f2, c5702f.f22805U);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x002e, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x003c, code lost:
    
        if (r7 == 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r7 == 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m23057b(p241n.C5703g r21, p228m.C5562e r22, int r23, int r24, p241n.C5700d r25) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p241n.AbstractC5707k.m23057b(n.g, m.e, int, int, n.d):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m23058c(C5703g c5703g, C5562e c5562e, C5702f c5702f) {
        C5702f.b bVar = c5703g.f22789E[0];
        C5702f.b bVar2 = C5702f.b.WRAP_CONTENT;
        if (bVar != bVar2 && c5702f.f22789E[0] == C5702f.b.MATCH_PARENT) {
            int i10 = c5702f.f22851u.f22760e;
            int m22949D = c5703g.m22949D() - c5702f.f22853w.f22760e;
            C5701e c5701e = c5702f.f22851u;
            c5701e.f22765j = c5562e.m22589r(c5701e);
            C5701e c5701e2 = c5702f.f22853w;
            c5701e2.f22765j = c5562e.m22589r(c5701e2);
            c5562e.m22580f(c5702f.f22851u.f22765j, i10);
            c5562e.m22580f(c5702f.f22853w.f22765j, m22949D);
            c5702f.f22811a = 2;
            c5702f.m22980f0(i10, m22949D);
        }
        if (c5703g.f22789E[1] != bVar2 && c5702f.f22789E[1] == C5702f.b.MATCH_PARENT) {
            int i11 = c5702f.f22852v.f22760e;
            int m23003r = c5703g.m23003r() - c5702f.f22854x.f22760e;
            C5701e c5701e3 = c5702f.f22852v;
            c5701e3.f22765j = c5562e.m22589r(c5701e3);
            C5701e c5701e4 = c5702f.f22854x;
            c5701e4.f22765j = c5562e.m22589r(c5701e4);
            c5562e.m22580f(c5702f.f22852v.f22765j, i11);
            c5562e.m22580f(c5702f.f22854x.f22765j, m23003r);
            if (c5702f.f22805U > 0 || c5702f.m22947C() == 8) {
                C5701e c5701e5 = c5702f.f22855y;
                c5701e5.f22765j = c5562e.m22589r(c5701e5);
                c5562e.m22580f(c5702f.f22855y.f22765j, c5702f.f22805U + i11);
            }
            c5702f.f22813b = 2;
            c5702f.m23008t0(i11, m23003r);
        }
    }

    /* renamed from: d */
    private static boolean m23059d(C5702f c5702f, int i10) {
        C5702f.b[] bVarArr = c5702f.f22789E;
        if (bVarArr[i10] != C5702f.b.MATCH_CONSTRAINT) {
            return false;
        }
        char c10 = 1;
        if (c5702f.f22793I != 0.0f) {
            if (i10 != 0) {
                c10 = 0;
            }
            C5702f.b bVar = bVarArr[c10];
            return false;
        }
        if (i10 == 0) {
            if (c5702f.f22819e != 0 || c5702f.f22825h != 0 || c5702f.f22827i != 0) {
                return false;
            }
        } else if (c5702f.f22821f != 0 || c5702f.f22831k != 0 || c5702f.f22833l != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m23060e(C5702f c5702f, int i10, int i11) {
        int i12 = i10 * 2;
        int i13 = i12 + 1;
        c5702f.f22787C[i12].m22931f().f22914g = c5702f.m23009u().f22851u.m22931f();
        c5702f.f22787C[i12].m22931f().f22915h = i11;
        c5702f.f22787C[i12].m22931f().f22925b = 1;
        c5702f.f22787C[i13].m22931f().f22914g = c5702f.f22787C[i12].m22931f();
        c5702f.f22787C[i13].m22931f().f22915h = c5702f.m23007t(i10);
        c5702f.f22787C[i13].m22931f().f22925b = 1;
    }
}
