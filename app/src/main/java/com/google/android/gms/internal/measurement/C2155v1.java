package com.google.android.gms.internal.measurement;

import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.v1 */
/* loaded from: classes.dex */
public final class C2155v1 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ String f8188e;

    /* renamed from: f */
    final /* synthetic */ C2201y2 f8189f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2155v1(C2201y2 c2201y2, String str) {
        super(c2201y2, true);
        this.f8189f = c2201y2;
        this.f8188e = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f8189f.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).setUserId(this.f8188e, this.f7958a);
    }
}
