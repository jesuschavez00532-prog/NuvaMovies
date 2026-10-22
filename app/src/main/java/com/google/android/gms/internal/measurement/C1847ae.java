package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.ae */
/* loaded from: classes.dex */
public final class C1847ae extends AbstractC1973j {

    /* renamed from: c */
    private final Callable f7661c;

    public C1847ae(String str, Callable callable) {
        super("internal.appMetadata");
        this.f7661c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1973j
    /* renamed from: a */
    public final InterfaceC2078q mo8107a(C2158v4 c2158v4, List list) {
        try {
            return AbstractC2205y6.m9359b(this.f7661c.call());
        } catch (Exception unused) {
            return InterfaceC2078q.f8002Q;
        }
    }
}
