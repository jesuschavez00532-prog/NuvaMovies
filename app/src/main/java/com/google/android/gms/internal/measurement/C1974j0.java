package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j0 */
/* loaded from: classes.dex */
public final class C1974j0 extends AbstractC2183x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1974j0() {
        this.f8243a.add(EnumC2034n0.FOR_IN);
        this.f8243a.add(EnumC2034n0.FOR_IN_CONST);
        this.f8243a.add(EnumC2034n0.FOR_IN_LET);
        this.f8243a.add(EnumC2034n0.FOR_LET);
        this.f8243a.add(EnumC2034n0.FOR_OF);
        this.f8243a.add(EnumC2034n0.FOR_OF_CONST);
        this.f8243a.add(EnumC2034n0.FOR_OF_LET);
        this.f8243a.add(EnumC2034n0.WHILE);
    }

    /* renamed from: c */
    private static InterfaceC2078q m8539c(InterfaceC1944h0 interfaceC1944h0, Iterator it, InterfaceC2078q interfaceC2078q) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC2078q m9028c = interfaceC1944h0.mo8365a((InterfaceC2078q) it.next()).m9028c((C1912f) interfaceC2078q);
                if (m9028c instanceof C1943h) {
                    C1943h c1943h = (C1943h) m9028c;
                    if ("break".equals(c1943h.m8477b())) {
                        return InterfaceC2078q.f8002Q;
                    }
                    if ("return".equals(c1943h.m8477b())) {
                        return c1943h;
                    }
                }
            }
        }
        return InterfaceC2078q.f8002Q;
    }

    /* renamed from: d */
    private static InterfaceC2078q m8540d(InterfaceC1944h0 interfaceC1944h0, InterfaceC2078q interfaceC2078q, InterfaceC2078q interfaceC2078q2) {
        return m8539c(interfaceC1944h0, interfaceC2078q.mo8353k(), interfaceC2078q2);
    }

    /* renamed from: e */
    private static InterfaceC2078q m8541e(InterfaceC1944h0 interfaceC1944h0, InterfaceC2078q interfaceC2078q, InterfaceC2078q interfaceC2078q2) {
        if (interfaceC2078q instanceof Iterable) {
            return m8539c(interfaceC1944h0, ((Iterable) interfaceC2078q).iterator(), interfaceC2078q2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2183x
    /* renamed from: a */
    public final InterfaceC2078q mo8080a(String str, C2158v4 c2158v4, List list) {
        EnumC2034n0 enumC2034n0 = EnumC2034n0.ADD;
        int ordinal = AbstractC2174w5.m9075e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    AbstractC2174w5.m9078h(EnumC2034n0.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C2138u) {
                        String mo8351i = ((InterfaceC2078q) list.get(0)).mo8351i();
                        return m8540d(new C1959i0(c2158v4, mo8351i), c2158v4.m9027b((InterfaceC2078q) list.get(1)), c2158v4.m9027b((InterfaceC2078q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    AbstractC2174w5.m9078h(EnumC2034n0.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C2138u) {
                        String mo8351i2 = ((InterfaceC2078q) list.get(0)).mo8351i();
                        return m8540d(new C1913f0(c2158v4, mo8351i2), c2158v4.m9027b((InterfaceC2078q) list.get(1)), c2158v4.m9027b((InterfaceC2078q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    AbstractC2174w5.m9078h(EnumC2034n0.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C2138u) {
                        String mo8351i3 = ((InterfaceC2078q) list.get(0)).mo8351i();
                        return m8540d(new C1929g0(c2158v4, mo8351i3), c2158v4.m9027b((InterfaceC2078q) list.get(1)), c2158v4.m9027b((InterfaceC2078q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    AbstractC2174w5.m9078h(EnumC2034n0.FOR_LET.name(), 4, list);
                    InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                    if (m9027b instanceof C1912f) {
                        C1912f c1912f = (C1912f) m9027b;
                        InterfaceC2078q interfaceC2078q = (InterfaceC2078q) list.get(1);
                        InterfaceC2078q interfaceC2078q2 = (InterfaceC2078q) list.get(2);
                        InterfaceC2078q m9027b2 = c2158v4.m9027b((InterfaceC2078q) list.get(3));
                        C2158v4 m9026a = c2158v4.m9026a();
                        for (int i10 = 0; i10 < c1912f.m8358t(); i10++) {
                            String mo8351i4 = c1912f.m8359u(i10).mo8351i();
                            m9026a.m9032g(mo8351i4, c2158v4.m9029d(mo8351i4));
                        }
                        while (c2158v4.m9027b(interfaceC2078q).mo8352j().booleanValue()) {
                            InterfaceC2078q m9028c = c2158v4.m9028c((C1912f) m9027b2);
                            if (m9028c instanceof C1943h) {
                                C1943h c1943h = (C1943h) m9028c;
                                if ("break".equals(c1943h.m8477b())) {
                                    return InterfaceC2078q.f8002Q;
                                }
                                if ("return".equals(c1943h.m8477b())) {
                                    return c1943h;
                                }
                            }
                            C2158v4 m9026a2 = c2158v4.m9026a();
                            for (int i11 = 0; i11 < c1912f.m8358t(); i11++) {
                                String mo8351i5 = c1912f.m8359u(i11).mo8351i();
                                m9026a2.m9032g(mo8351i5, m9026a.m9029d(mo8351i5));
                            }
                            m9026a2.m9027b(interfaceC2078q2);
                            m9026a = m9026a2;
                        }
                        return InterfaceC2078q.f8002Q;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    AbstractC2174w5.m9078h(EnumC2034n0.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C2138u) {
                        String mo8351i6 = ((InterfaceC2078q) list.get(0)).mo8351i();
                        return m8541e(new C1959i0(c2158v4, mo8351i6), c2158v4.m9027b((InterfaceC2078q) list.get(1)), c2158v4.m9027b((InterfaceC2078q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    AbstractC2174w5.m9078h(EnumC2034n0.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C2138u) {
                        String mo8351i7 = ((InterfaceC2078q) list.get(0)).mo8351i();
                        return m8541e(new C1913f0(c2158v4, mo8351i7), c2158v4.m9027b((InterfaceC2078q) list.get(1)), c2158v4.m9027b((InterfaceC2078q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    AbstractC2174w5.m9078h(EnumC2034n0.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C2138u) {
                        String mo8351i8 = ((InterfaceC2078q) list.get(0)).mo8351i();
                        return m8541e(new C1929g0(c2158v4, mo8351i8), c2158v4.m9027b((InterfaceC2078q) list.get(1)), c2158v4.m9027b((InterfaceC2078q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.m9087b(str);
            }
        }
        AbstractC2174w5.m9078h(EnumC2034n0.WHILE.name(), 4, list);
        InterfaceC2078q interfaceC2078q3 = (InterfaceC2078q) list.get(0);
        InterfaceC2078q interfaceC2078q4 = (InterfaceC2078q) list.get(1);
        InterfaceC2078q interfaceC2078q5 = (InterfaceC2078q) list.get(2);
        InterfaceC2078q m9027b3 = c2158v4.m9027b((InterfaceC2078q) list.get(3));
        if (c2158v4.m9027b(interfaceC2078q5).mo8352j().booleanValue()) {
            InterfaceC2078q m9028c2 = c2158v4.m9028c((C1912f) m9027b3);
            if (m9028c2 instanceof C1943h) {
                C1943h c1943h2 = (C1943h) m9028c2;
                if ("break".equals(c1943h2.m8477b())) {
                    return InterfaceC2078q.f8002Q;
                }
                if ("return".equals(c1943h2.m8477b())) {
                    return c1943h2;
                }
            }
        }
        while (c2158v4.m9027b(interfaceC2078q3).mo8352j().booleanValue()) {
            InterfaceC2078q m9028c3 = c2158v4.m9028c((C1912f) m9027b3);
            if (m9028c3 instanceof C1943h) {
                C1943h c1943h3 = (C1943h) m9028c3;
                if ("break".equals(c1943h3.m8477b())) {
                    return InterfaceC2078q.f8002Q;
                }
                if ("return".equals(c1943h3.m8477b())) {
                    return c1943h3;
                }
            }
            c2158v4.m9027b(interfaceC2078q4);
        }
        return InterfaceC2078q.f8002Q;
    }
}
