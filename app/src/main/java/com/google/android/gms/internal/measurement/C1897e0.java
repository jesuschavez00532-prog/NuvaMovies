package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* loaded from: classes.dex */
public final class C1897e0 extends AbstractC2183x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C1897e0() {
        this.f8243a.add(EnumC2034n0.AND);
        this.f8243a.add(EnumC2034n0.NOT);
        this.f8243a.add(EnumC2034n0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2183x
    /* renamed from: a */
    public final InterfaceC2078q mo8080a(String str, C2158v4 c2158v4, List list) {
        EnumC2034n0 enumC2034n0 = EnumC2034n0.ADD;
        int ordinal = AbstractC2174w5.m9075e(str).ordinal();
        if (ordinal != 1) {
            if (ordinal != 47) {
                if (ordinal != 50) {
                    return super.m9087b(str);
                }
                AbstractC2174w5.m9078h(EnumC2034n0.OR.name(), 2, list);
                InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                if (m9027b.mo8352j().booleanValue()) {
                    return m9027b;
                }
                return c2158v4.m9027b((InterfaceC2078q) list.get(1));
            }
            AbstractC2174w5.m9078h(EnumC2034n0.NOT.name(), 1, list);
            return new C1928g(Boolean.valueOf(!c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8352j().booleanValue()));
        }
        AbstractC2174w5.m9078h(EnumC2034n0.AND.name(), 2, list);
        InterfaceC2078q m9027b2 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
        if (!m9027b2.mo8352j().booleanValue()) {
            return m9027b2;
        }
        return c2158v4.m9027b((InterfaceC2078q) list.get(1));
    }
}
