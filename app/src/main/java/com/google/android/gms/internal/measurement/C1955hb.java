package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.hb */
/* loaded from: classes.dex */
public final class C1955hb extends AbstractC1973j {

    /* renamed from: c */
    private final InterfaceC1941gc f7805c;

    public C1955hb(String str, InterfaceC1941gc interfaceC1941gc) {
        super("internal.remoteConfig");
        this.f7805c = interfaceC1941gc;
        this.f7824b.put("getValue", new C2104ra(this, "getValue", interfaceC1941gc));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1973j
    /* renamed from: a */
    public final InterfaceC2078q mo8107a(C2158v4 c2158v4, List list) {
        return InterfaceC2078q.f8002Q;
    }
}
