package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
/* loaded from: classes.dex */
public final class C1989k0 extends AbstractC2183x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1989k0() {
        this.f8243a.add(EnumC2034n0.ADD);
        this.f8243a.add(EnumC2034n0.DIVIDE);
        this.f8243a.add(EnumC2034n0.MODULUS);
        this.f8243a.add(EnumC2034n0.MULTIPLY);
        this.f8243a.add(EnumC2034n0.NEGATE);
        this.f8243a.add(EnumC2034n0.POST_DECREMENT);
        this.f8243a.add(EnumC2034n0.POST_INCREMENT);
        this.f8243a.add(EnumC2034n0.PRE_DECREMENT);
        this.f8243a.add(EnumC2034n0.PRE_INCREMENT);
        this.f8243a.add(EnumC2034n0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2183x
    /* renamed from: a */
    public final InterfaceC2078q mo8080a(String str, C2158v4 c2158v4, List list) {
        EnumC2034n0 enumC2034n0 = EnumC2034n0.ADD;
        int ordinal = AbstractC2174w5.m9075e(str).ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                if (ordinal != 59) {
                    if (ordinal != 52 && ordinal != 53) {
                        if (ordinal != 55 && ordinal != 56) {
                            switch (ordinal) {
                                case 44:
                                    AbstractC2174w5.m9078h(EnumC2034n0.MODULUS.name(), 2, list);
                                    return new C1958i(Double.valueOf(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue() % c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue()));
                                case 45:
                                    AbstractC2174w5.m9078h(EnumC2034n0.MULTIPLY.name(), 2, list);
                                    return new C1958i(Double.valueOf(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue() * c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue()));
                                case 46:
                                    AbstractC2174w5.m9078h(EnumC2034n0.NEGATE.name(), 1, list);
                                    return new C1958i(Double.valueOf(-c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue()));
                                default:
                                    return super.m9087b(str);
                            }
                        }
                        AbstractC2174w5.m9078h(str, 1, list);
                        return c2158v4.m9027b((InterfaceC2078q) list.get(0));
                    }
                    AbstractC2174w5.m9078h(str, 2, list);
                    InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                    c2158v4.m9027b((InterfaceC2078q) list.get(1));
                    return m9027b;
                }
                AbstractC2174w5.m9078h(EnumC2034n0.SUBTRACT.name(), 2, list);
                return new C1958i(Double.valueOf(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue() + new C1958i(Double.valueOf(-c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue())).mo8350h().doubleValue()));
            }
            AbstractC2174w5.m9078h(EnumC2034n0.DIVIDE.name(), 2, list);
            return new C1958i(Double.valueOf(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue() / c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue()));
        }
        AbstractC2174w5.m9078h(EnumC2034n0.ADD.name(), 2, list);
        InterfaceC2078q m9027b2 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
        InterfaceC2078q m9027b3 = c2158v4.m9027b((InterfaceC2078q) list.get(1));
        if (!(m9027b2 instanceof InterfaceC2018m) && !(m9027b2 instanceof C2138u) && !(m9027b3 instanceof InterfaceC2018m) && !(m9027b3 instanceof C2138u)) {
            return new C1958i(Double.valueOf(m9027b2.mo8350h().doubleValue() + m9027b3.mo8350h().doubleValue()));
        }
        return new C2138u(String.valueOf(m9027b2.mo8351i()).concat(String.valueOf(m9027b3.mo8351i())));
    }
}
