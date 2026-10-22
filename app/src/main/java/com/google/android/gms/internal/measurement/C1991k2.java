package com.google.android.gms.internal.measurement;

import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.k2 */
/* loaded from: classes.dex */
public final class C1991k2 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ BinderC2051o2 f7848e;

    /* renamed from: f */
    final /* synthetic */ C2201y2 f7849f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1991k2(C2201y2 c2201y2, BinderC2051o2 binderC2051o2) {
        super(c2201y2, true);
        this.f7849f = c2201y2;
        this.f7848e = binderC2051o2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f7849f.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).registerOnMeasurementEventListener(this.f7848e);
    }
}
