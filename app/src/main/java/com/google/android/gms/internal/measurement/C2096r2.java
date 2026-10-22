package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p219l4.AbstractC5391n;
import p325s4.BinderC6676b;

/* renamed from: com.google.android.gms.internal.measurement.r2 */
/* loaded from: classes.dex */
final class C2096r2 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ Activity f8036e;

    /* renamed from: f */
    final /* synthetic */ C2186x2 f8037f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2096r2(C2186x2 c2186x2, Activity activity) {
        super(c2186x2.f8251a, true);
        this.f8037f = c2186x2;
        this.f8036e = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f8037f.f8251a.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).onActivityResumed(BinderC6676b.m26053M(this.f8036e), this.f7959b);
    }
}
