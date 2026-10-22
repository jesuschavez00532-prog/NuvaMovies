package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w8 */
/* loaded from: classes.dex */
public final class C2177w8 extends AbstractC1973j {

    /* renamed from: c */
    private final C1864c f8236c;

    public C2177w8(C1864c c1864c) {
        super("internal.eventLogger");
        this.f8236c = c1864c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1973j
    /* renamed from: a */
    public final InterfaceC2078q mo8107a(C2158v4 c2158v4, List list) {
        Map hashMap;
        AbstractC2174w5.m9078h(this.f7823a, 3, list);
        String mo8351i = c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8351i();
        long m9071a = (long) AbstractC2174w5.m9071a(c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue());
        InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) list.get(2));
        if (m9027b instanceof C2033n) {
            hashMap = AbstractC2174w5.m9077g((C2033n) m9027b);
        } else {
            hashMap = new HashMap();
        }
        this.f8236c.m8157e(mo8351i, m9071a, hashMap);
        return InterfaceC2078q.f8002Q;
    }
}
