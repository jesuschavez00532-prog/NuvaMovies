package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.yd */
/* loaded from: classes.dex */
public final class C2212yd extends AbstractC1973j {

    /* renamed from: c */
    final boolean f8289c;

    /* renamed from: d */
    final boolean f8290d;

    /* renamed from: e */
    final /* synthetic */ C2227zd f8291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2212yd(C2227zd c2227zd, boolean z10, boolean z11) {
        super("log");
        this.f8291e = c2227zd;
        this.f8289c = z10;
        this.f8290d = z11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1973j
    /* renamed from: a */
    public final InterfaceC2078q mo8107a(C2158v4 c2158v4, List list) {
        int i10;
        InterfaceC2197xd interfaceC2197xd;
        InterfaceC2197xd interfaceC2197xd2;
        InterfaceC2197xd interfaceC2197xd3;
        AbstractC2174w5.m9079i("log", 1, list);
        if (list.size() == 1) {
            interfaceC2197xd3 = this.f8291e.f8316c;
            interfaceC2197xd3.mo9192a(3, c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8351i(), Collections.emptyList(), this.f8289c, this.f8290d);
            return InterfaceC2078q.f8002Q;
        }
        int m9072b = AbstractC2174w5.m9072b(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue());
        if (m9072b != 2) {
            if (m9072b != 3) {
                if (m9072b != 5) {
                    if (m9072b != 6) {
                        i10 = 3;
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 5;
                }
            } else {
                i10 = 1;
            }
        } else {
            i10 = 4;
        }
        String mo8351i = c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8351i();
        if (list.size() == 2) {
            interfaceC2197xd2 = this.f8291e.f8316c;
            interfaceC2197xd2.mo9192a(i10, mo8351i, Collections.emptyList(), this.f8289c, this.f8290d);
            return InterfaceC2078q.f8002Q;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
            arrayList.add(c2158v4.m9027b((InterfaceC2078q) list.get(i11)).mo8351i());
        }
        interfaceC2197xd = this.f8291e.f8316c;
        interfaceC2197xd.mo9192a(i10, mo8351i, arrayList, this.f8289c, this.f8290d);
        return InterfaceC2078q.f8002Q;
    }
}
