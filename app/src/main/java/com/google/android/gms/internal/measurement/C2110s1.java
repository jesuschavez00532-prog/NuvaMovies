package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s1 */
/* loaded from: classes.dex */
public final class C2110s1 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ Bundle f8049e;

    /* renamed from: f */
    final /* synthetic */ C2201y2 f8050f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2110s1(C2201y2 c2201y2, Bundle bundle) {
        super(c2201y2, true);
        this.f8050f = c2201y2;
        this.f8049e = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f8050f.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).setConditionalUserProperty(this.f8049e, this.f7958a);
    }
}
