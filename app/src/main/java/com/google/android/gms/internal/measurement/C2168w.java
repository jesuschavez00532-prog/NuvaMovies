package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w */
/* loaded from: classes.dex */
public final class C2168w extends AbstractC2183x {
    public C2168w() {
        this.f8243a.add(EnumC2034n0.BITWISE_AND);
        this.f8243a.add(EnumC2034n0.BITWISE_LEFT_SHIFT);
        this.f8243a.add(EnumC2034n0.BITWISE_NOT);
        this.f8243a.add(EnumC2034n0.BITWISE_OR);
        this.f8243a.add(EnumC2034n0.BITWISE_RIGHT_SHIFT);
        this.f8243a.add(EnumC2034n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f8243a.add(EnumC2034n0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2183x
    /* renamed from: a */
    public final InterfaceC2078q mo8080a(String str, C2158v4 c2158v4, List list) {
        EnumC2034n0 enumC2034n0 = EnumC2034n0.ADD;
        switch (AbstractC2174w5.m9075e(str).ordinal()) {
            case 4:
                AbstractC2174w5.m9078h(EnumC2034n0.BITWISE_AND.name(), 2, list);
                return new C1958i(Double.valueOf(AbstractC2174w5.m9072b(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue()) & AbstractC2174w5.m9072b(c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue())));
            case 5:
                AbstractC2174w5.m9078h(EnumC2034n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C1958i(Double.valueOf(AbstractC2174w5.m9072b(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue()) << ((int) (AbstractC2174w5.m9074d(c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue()) & 31))));
            case 6:
                AbstractC2174w5.m9078h(EnumC2034n0.BITWISE_NOT.name(), 1, list);
                return new C1958i(Double.valueOf(AbstractC2174w5.m9072b(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue()) ^ (-1)));
            case 7:
                AbstractC2174w5.m9078h(EnumC2034n0.BITWISE_OR.name(), 2, list);
                return new C1958i(Double.valueOf(AbstractC2174w5.m9072b(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue()) | AbstractC2174w5.m9072b(c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue())));
            case 8:
                AbstractC2174w5.m9078h(EnumC2034n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C1958i(Double.valueOf(AbstractC2174w5.m9072b(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue()) >> ((int) (AbstractC2174w5.m9074d(c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue()) & 31))));
            case 9:
                AbstractC2174w5.m9078h(EnumC2034n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C1958i(Double.valueOf(AbstractC2174w5.m9074d(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue()) >>> ((int) (AbstractC2174w5.m9074d(c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue()) & 31))));
            case 10:
                AbstractC2174w5.m9078h(EnumC2034n0.BITWISE_XOR.name(), 2, list);
                return new C1958i(Double.valueOf(AbstractC2174w5.m9072b(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue()) ^ AbstractC2174w5.m9072b(c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue())));
            default:
                return super.m9087b(str);
        }
    }
}
