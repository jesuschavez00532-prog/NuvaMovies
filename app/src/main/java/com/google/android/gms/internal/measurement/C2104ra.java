package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ra */
/* loaded from: classes.dex */
public final class C2104ra extends AbstractC1973j {

    /* renamed from: c */
    final /* synthetic */ InterfaceC1941gc f8043c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2104ra(C1955hb c1955hb, String str, InterfaceC1941gc interfaceC1941gc) {
        super("getValue");
        this.f8043c = interfaceC1941gc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1973j
    /* renamed from: a */
    public final InterfaceC2078q mo8107a(C2158v4 c2158v4, List list) {
        AbstractC2174w5.m9078h("getValue", 2, list);
        InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) list.get(0));
        InterfaceC2078q m9027b2 = c2158v4.m9027b((InterfaceC2078q) list.get(1));
        String mo8471n = this.f8043c.mo8471n(m9027b.mo8351i());
        if (mo8471n != null) {
            return new C2138u(mo8471n);
        }
        return m9027b2;
    }
}
