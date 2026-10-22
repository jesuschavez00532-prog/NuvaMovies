package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.zd */
/* loaded from: classes.dex */
public final class C2227zd extends AbstractC1973j {

    /* renamed from: c */
    private final InterfaceC2197xd f8316c;

    public C2227zd(InterfaceC2197xd interfaceC2197xd) {
        super("internal.logger");
        this.f8316c = interfaceC2197xd;
        this.f7824b.put("log", new C2212yd(this, false, true));
        this.f7824b.put("silent", new C1957hd(this, "silent"));
        ((AbstractC1973j) this.f7824b.get("silent")).mo8354n("log", new C2212yd(this, true, true));
        this.f7824b.put("unmonitored", new C2182wd(this, "unmonitored"));
        ((AbstractC1973j) this.f7824b.get("unmonitored")).mo8354n("log", new C2212yd(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1973j
    /* renamed from: a */
    public final InterfaceC2078q mo8107a(C2158v4 c2158v4, List list) {
        return InterfaceC2078q.f8002Q;
    }
}
