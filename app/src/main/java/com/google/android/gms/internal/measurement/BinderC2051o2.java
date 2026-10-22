package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p025b5.InterfaceC1123u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.o2 */
/* loaded from: classes.dex */
public final class BinderC2051o2 extends AbstractBinderC2020m1 {

    /* renamed from: a */
    private final InterfaceC1123u f7978a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC2051o2(InterfaceC1123u interfaceC1123u) {
        this.f7978a = interfaceC1123u;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2035n1
    /* renamed from: g */
    public final int mo8611g() {
        return System.identityHashCode(this.f7978a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2035n1
    /* renamed from: h */
    public final void mo8612h(String str, String str2, Bundle bundle, long j10) {
        this.f7978a.mo5090a(str, str2, bundle, j10);
    }
}
