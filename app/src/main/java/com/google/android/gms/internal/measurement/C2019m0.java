package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
/* loaded from: classes.dex */
public final class C2019m0 extends AbstractC2183x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C2019m0() {
        this.f8243a.add(EnumC2034n0.ASSIGN);
        this.f8243a.add(EnumC2034n0.CONST);
        this.f8243a.add(EnumC2034n0.CREATE_ARRAY);
        this.f8243a.add(EnumC2034n0.CREATE_OBJECT);
        this.f8243a.add(EnumC2034n0.EXPRESSION_LIST);
        this.f8243a.add(EnumC2034n0.GET);
        this.f8243a.add(EnumC2034n0.GET_INDEX);
        this.f8243a.add(EnumC2034n0.GET_PROPERTY);
        this.f8243a.add(EnumC2034n0.NULL);
        this.f8243a.add(EnumC2034n0.SET_PROPERTY);
        this.f8243a.add(EnumC2034n0.TYPEOF);
        this.f8243a.add(EnumC2034n0.UNDEFINED);
        this.f8243a.add(EnumC2034n0.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2183x
    /* renamed from: a */
    public final InterfaceC2078q mo8080a(String str, C2158v4 c2158v4, List list) {
        String str2;
        EnumC2034n0 enumC2034n0 = EnumC2034n0.ADD;
        int ordinal = AbstractC2174w5.m9075e(str).ordinal();
        int i10 = 0;
        if (ordinal != 3) {
            if (ordinal != 14) {
                if (ordinal != 24) {
                    if (ordinal != 33) {
                        if (ordinal != 49) {
                            if (ordinal != 58) {
                                if (ordinal != 17) {
                                    if (ordinal != 18) {
                                        if (ordinal != 35 && ordinal != 36) {
                                            switch (ordinal) {
                                                case 62:
                                                    AbstractC2174w5.m9078h(EnumC2034n0.TYPEOF.name(), 1, list);
                                                    InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                                                    if (m9027b instanceof C2153v) {
                                                        str2 = "undefined";
                                                    } else if (m9027b instanceof C1928g) {
                                                        str2 = "boolean";
                                                    } else if (m9027b instanceof C1958i) {
                                                        str2 = "number";
                                                    } else if (m9027b instanceof C2138u) {
                                                        str2 = "string";
                                                    } else if (m9027b instanceof C2063p) {
                                                        str2 = "function";
                                                    } else if (!(m9027b instanceof C2093r) && !(m9027b instanceof C1943h)) {
                                                        str2 = "object";
                                                    } else {
                                                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", m9027b));
                                                    }
                                                    return new C2138u(str2);
                                                case 63:
                                                    AbstractC2174w5.m9078h(EnumC2034n0.UNDEFINED.name(), 0, list);
                                                    return InterfaceC2078q.f8002Q;
                                                case 64:
                                                    AbstractC2174w5.m9079i(EnumC2034n0.VAR.name(), 1, list);
                                                    Iterator it = list.iterator();
                                                    while (it.hasNext()) {
                                                        InterfaceC2078q m9027b2 = c2158v4.m9027b((InterfaceC2078q) it.next());
                                                        if (m9027b2 instanceof C2138u) {
                                                            c2158v4.m9030e(m9027b2.mo8351i(), InterfaceC2078q.f8002Q);
                                                        } else {
                                                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", m9027b2.getClass().getCanonicalName()));
                                                        }
                                                    }
                                                    return InterfaceC2078q.f8002Q;
                                                default:
                                                    return super.m9087b(str);
                                            }
                                        }
                                        AbstractC2174w5.m9078h(EnumC2034n0.GET_PROPERTY.name(), 2, list);
                                        InterfaceC2078q m9027b3 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                                        InterfaceC2078q m9027b4 = c2158v4.m9027b((InterfaceC2078q) list.get(1));
                                        if ((m9027b3 instanceof C1912f) && AbstractC2174w5.m9081k(m9027b4)) {
                                            return ((C1912f) m9027b3).m8359u(m9027b4.mo8350h().intValue());
                                        }
                                        if (m9027b3 instanceof InterfaceC2018m) {
                                            return ((InterfaceC2018m) m9027b3).mo8356p(m9027b4.mo8351i());
                                        }
                                        if (m9027b3 instanceof C2138u) {
                                            if ("length".equals(m9027b4.mo8351i())) {
                                                return new C1958i(Double.valueOf(m9027b3.mo8351i().length()));
                                            }
                                            if (AbstractC2174w5.m9081k(m9027b4) && m9027b4.mo8350h().doubleValue() < m9027b3.mo8351i().length()) {
                                                return new C2138u(String.valueOf(m9027b3.mo8351i().charAt(m9027b4.mo8350h().intValue())));
                                            }
                                        }
                                        return InterfaceC2078q.f8002Q;
                                    }
                                    if (list.isEmpty()) {
                                        return new C2033n();
                                    }
                                    if (list.size() % 2 == 0) {
                                        C2033n c2033n = new C2033n();
                                        while (i10 < list.size() - 1) {
                                            InterfaceC2078q m9027b5 = c2158v4.m9027b((InterfaceC2078q) list.get(i10));
                                            InterfaceC2078q m9027b6 = c2158v4.m9027b((InterfaceC2078q) list.get(i10 + 1));
                                            if (!(m9027b5 instanceof C1943h) && !(m9027b6 instanceof C1943h)) {
                                                c2033n.mo8354n(m9027b5.mo8351i(), m9027b6);
                                                i10 += 2;
                                            } else {
                                                throw new IllegalStateException("Failed to evaluate map entry");
                                            }
                                        }
                                        return c2033n;
                                    }
                                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
                                }
                                if (list.isEmpty()) {
                                    return new C1912f();
                                }
                                C1912f c1912f = new C1912f();
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    InterfaceC2078q m9027b7 = c2158v4.m9027b((InterfaceC2078q) it2.next());
                                    if (!(m9027b7 instanceof C1943h)) {
                                        c1912f.m8346B(i10, m9027b7);
                                        i10++;
                                    } else {
                                        throw new IllegalStateException("Failed to evaluate array element");
                                    }
                                }
                                return c1912f;
                            }
                            AbstractC2174w5.m9078h(EnumC2034n0.SET_PROPERTY.name(), 3, list);
                            InterfaceC2078q m9027b8 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                            InterfaceC2078q m9027b9 = c2158v4.m9027b((InterfaceC2078q) list.get(1));
                            InterfaceC2078q m9027b10 = c2158v4.m9027b((InterfaceC2078q) list.get(2));
                            if (m9027b8 != InterfaceC2078q.f8002Q && m9027b8 != InterfaceC2078q.f8003R) {
                                if ((m9027b8 instanceof C1912f) && (m9027b9 instanceof C1958i)) {
                                    ((C1912f) m9027b8).m8346B(m9027b9.mo8350h().intValue(), m9027b10);
                                } else if (m9027b8 instanceof InterfaceC2018m) {
                                    ((InterfaceC2018m) m9027b8).mo8354n(m9027b9.mo8351i(), m9027b10);
                                }
                                return m9027b10;
                            }
                            throw new IllegalStateException(String.format("Can't set property %s of %s", m9027b9.mo8351i(), m9027b8.mo8351i()));
                        }
                        AbstractC2174w5.m9078h(EnumC2034n0.NULL.name(), 0, list);
                        return InterfaceC2078q.f8003R;
                    }
                    AbstractC2174w5.m9078h(EnumC2034n0.GET.name(), 1, list);
                    InterfaceC2078q m9027b11 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                    if (m9027b11 instanceof C2138u) {
                        return c2158v4.m9029d(m9027b11.mo8351i());
                    }
                    throw new IllegalArgumentException(String.format("Expected string for get var. got %s", m9027b11.getClass().getCanonicalName()));
                }
                AbstractC2174w5.m9079i(EnumC2034n0.EXPRESSION_LIST.name(), 1, list);
                InterfaceC2078q interfaceC2078q = InterfaceC2078q.f8002Q;
                while (i10 < list.size()) {
                    interfaceC2078q = c2158v4.m9027b((InterfaceC2078q) list.get(i10));
                    if (!(interfaceC2078q instanceof C1943h)) {
                        i10++;
                    } else {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                }
                return interfaceC2078q;
            }
            AbstractC2174w5.m9079i(EnumC2034n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i11 = 0; i11 < list.size() - 1; i11 += 2) {
                    InterfaceC2078q m9027b12 = c2158v4.m9027b((InterfaceC2078q) list.get(i11));
                    if (m9027b12 instanceof C2138u) {
                        c2158v4.m9031f(m9027b12.mo8351i(), c2158v4.m9027b((InterfaceC2078q) list.get(i11 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", m9027b12.getClass().getCanonicalName()));
                    }
                }
                return InterfaceC2078q.f8002Q;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        }
        AbstractC2174w5.m9078h(EnumC2034n0.ASSIGN.name(), 2, list);
        InterfaceC2078q m9027b13 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
        if (m9027b13 instanceof C2138u) {
            if (c2158v4.m9033h(m9027b13.mo8351i())) {
                InterfaceC2078q m9027b14 = c2158v4.m9027b((InterfaceC2078q) list.get(1));
                c2158v4.m9032g(m9027b13.mo8351i(), m9027b14);
                return m9027b14;
            }
            throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", m9027b13.mo8351i()));
        }
        throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", m9027b13.getClass().getCanonicalName()));
    }
}
