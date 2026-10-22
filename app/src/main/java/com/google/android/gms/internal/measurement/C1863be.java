package com.google.android.gms.internal.measurement;

import com.lzy.okgo.model.Progress;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.be */
/* loaded from: classes.dex */
public final class C1863be extends AbstractC1973j {

    /* renamed from: c */
    private final C1927fe f7681c;

    public C1863be(C1927fe c1927fe) {
        super("internal.registerCallback");
        this.f7681c = c1927fe;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1973j
    /* renamed from: a */
    public final InterfaceC2078q mo8107a(C2158v4 c2158v4, List list) {
        int i10;
        AbstractC2174w5.m9078h(this.f7823a, 3, list);
        String mo8351i = c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8351i();
        InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) list.get(1));
        if (m9027b instanceof C2063p) {
            InterfaceC2078q m9027b2 = c2158v4.m9027b((InterfaceC2078q) list.get(2));
            if (m9027b2 instanceof C2033n) {
                C2033n c2033n = (C2033n) m9027b2;
                if (c2033n.mo8348c("type")) {
                    String mo8351i2 = c2033n.mo8356p("type").mo8351i();
                    if (c2033n.mo8348c(Progress.PRIORITY)) {
                        i10 = AbstractC2174w5.m9072b(c2033n.mo8356p(Progress.PRIORITY).mo8350h().doubleValue());
                    } else {
                        i10 = 1000;
                    }
                    this.f7681c.m8402a(mo8351i, i10, (C2063p) m9027b, mo8351i2);
                    return InterfaceC2078q.f8002Q;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
