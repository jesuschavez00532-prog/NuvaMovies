package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z */
/* loaded from: classes.dex */
public final class C2213z extends AbstractC2183x {
    public C2213z() {
        this.f8243a.add(EnumC2034n0.EQUALS);
        this.f8243a.add(EnumC2034n0.GREATER_THAN);
        this.f8243a.add(EnumC2034n0.GREATER_THAN_EQUALS);
        this.f8243a.add(EnumC2034n0.IDENTITY_EQUALS);
        this.f8243a.add(EnumC2034n0.IDENTITY_NOT_EQUALS);
        this.f8243a.add(EnumC2034n0.LESS_THAN);
        this.f8243a.add(EnumC2034n0.LESS_THAN_EQUALS);
        this.f8243a.add(EnumC2034n0.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m9372c(InterfaceC2078q interfaceC2078q, InterfaceC2078q interfaceC2078q2) {
        if (interfaceC2078q.getClass().equals(interfaceC2078q2.getClass())) {
            if ((interfaceC2078q instanceof C2153v) || (interfaceC2078q instanceof C2048o)) {
                return true;
            }
            if (interfaceC2078q instanceof C1958i) {
                if (Double.isNaN(interfaceC2078q.mo8350h().doubleValue()) || Double.isNaN(interfaceC2078q2.mo8350h().doubleValue()) || interfaceC2078q.mo8350h().doubleValue() != interfaceC2078q2.mo8350h().doubleValue()) {
                    return false;
                }
                return true;
            }
            if (interfaceC2078q instanceof C2138u) {
                return interfaceC2078q.mo8351i().equals(interfaceC2078q2.mo8351i());
            }
            if (interfaceC2078q instanceof C1928g) {
                return interfaceC2078q.mo8352j().equals(interfaceC2078q2.mo8352j());
            }
            if (interfaceC2078q != interfaceC2078q2) {
                return false;
            }
            return true;
        }
        if (((interfaceC2078q instanceof C2153v) || (interfaceC2078q instanceof C2048o)) && ((interfaceC2078q2 instanceof C2153v) || (interfaceC2078q2 instanceof C2048o))) {
            return true;
        }
        boolean z10 = interfaceC2078q instanceof C1958i;
        if (z10 && (interfaceC2078q2 instanceof C2138u)) {
            return m9372c(interfaceC2078q, new C1958i(interfaceC2078q2.mo8350h()));
        }
        boolean z11 = interfaceC2078q instanceof C2138u;
        if (z11 && (interfaceC2078q2 instanceof C1958i)) {
            return m9372c(new C1958i(interfaceC2078q.mo8350h()), interfaceC2078q2);
        }
        if (interfaceC2078q instanceof C1928g) {
            return m9372c(new C1958i(interfaceC2078q.mo8350h()), interfaceC2078q2);
        }
        if (interfaceC2078q2 instanceof C1928g) {
            return m9372c(interfaceC2078q, new C1958i(interfaceC2078q2.mo8350h()));
        }
        if ((!z11 && !z10) || !(interfaceC2078q2 instanceof InterfaceC2018m)) {
            if (!(interfaceC2078q instanceof InterfaceC2018m) || (!(interfaceC2078q2 instanceof C2138u) && !(interfaceC2078q2 instanceof C1958i))) {
                return false;
            }
            return m9372c(new C2138u(interfaceC2078q.mo8351i()), interfaceC2078q2);
        }
        return m9372c(interfaceC2078q, new C2138u(interfaceC2078q2.mo8351i()));
    }

    /* renamed from: d */
    private static boolean m9373d(InterfaceC2078q interfaceC2078q, InterfaceC2078q interfaceC2078q2) {
        if (interfaceC2078q instanceof InterfaceC2018m) {
            interfaceC2078q = new C2138u(interfaceC2078q.mo8351i());
        }
        if (interfaceC2078q2 instanceof InterfaceC2018m) {
            interfaceC2078q2 = new C2138u(interfaceC2078q2.mo8351i());
        }
        if ((interfaceC2078q instanceof C2138u) && (interfaceC2078q2 instanceof C2138u)) {
            if (interfaceC2078q.mo8351i().compareTo(interfaceC2078q2.mo8351i()) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = interfaceC2078q.mo8350h().doubleValue();
        double doubleValue2 = interfaceC2078q2.mo8350h().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m9374e(InterfaceC2078q interfaceC2078q, InterfaceC2078q interfaceC2078q2) {
        if (interfaceC2078q instanceof InterfaceC2018m) {
            interfaceC2078q = new C2138u(interfaceC2078q.mo8351i());
        }
        if (interfaceC2078q2 instanceof InterfaceC2018m) {
            interfaceC2078q2 = new C2138u(interfaceC2078q2.mo8351i());
        }
        if (((!(interfaceC2078q instanceof C2138u) || !(interfaceC2078q2 instanceof C2138u)) && (Double.isNaN(interfaceC2078q.mo8350h().doubleValue()) || Double.isNaN(interfaceC2078q2.mo8350h().doubleValue()))) || m9373d(interfaceC2078q2, interfaceC2078q)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x003a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.AbstractC2183x
    /* renamed from: a */
    public final InterfaceC2078q mo8080a(String str, C2158v4 c2158v4, List list) {
        boolean m9372c;
        boolean m9372c2;
        AbstractC2174w5.m9078h(AbstractC2174w5.m9075e(str).name(), 2, list);
        InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) list.get(0));
        InterfaceC2078q m9027b2 = c2158v4.m9027b((InterfaceC2078q) list.get(1));
        int ordinal = AbstractC2174w5.m9075e(str).ordinal();
        if (ordinal != 23) {
            if (ordinal != 48) {
                if (ordinal != 42) {
                    if (ordinal != 43) {
                        switch (ordinal) {
                            case 37:
                                m9372c = m9373d(m9027b2, m9027b);
                                break;
                            case 38:
                                m9372c = m9374e(m9027b2, m9027b);
                                break;
                            case 39:
                                m9372c = AbstractC2174w5.m9082l(m9027b, m9027b2);
                                break;
                            case 40:
                                m9372c2 = AbstractC2174w5.m9082l(m9027b, m9027b2);
                                break;
                            default:
                                return super.m9087b(str);
                        }
                    } else {
                        m9372c = m9374e(m9027b, m9027b2);
                    }
                } else {
                    m9372c = m9373d(m9027b, m9027b2);
                }
            } else {
                m9372c2 = m9372c(m9027b, m9027b2);
            }
            m9372c = !m9372c2;
        } else {
            m9372c = m9372c(m9027b, m9027b2);
        }
        if (m9372c) {
            return InterfaceC2078q.f8007a0;
        }
        return InterfaceC2078q.f8008b0;
    }
}
