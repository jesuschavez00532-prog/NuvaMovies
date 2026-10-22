package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p219l4.AbstractC5391n;
import p325s4.BinderC6676b;

/* renamed from: com.google.android.gms.internal.measurement.u2 */
/* loaded from: classes.dex */
final class C2141u2 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ Activity f8139e;

    /* renamed from: f */
    final /* synthetic */ C2186x2 f8140f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2141u2(C2186x2 c2186x2, Activity activity) {
        super(c2186x2.f8251a, true);
        this.f8140f = c2186x2;
        this.f8139e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f8140f.f8251a.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).onActivityStopped(BinderC6676b.m26053M(this.f8139e), this.f7959b);
    }
}
