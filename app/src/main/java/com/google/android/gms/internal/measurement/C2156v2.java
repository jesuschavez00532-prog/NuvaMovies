package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p219l4.AbstractC5391n;
import p325s4.BinderC6676b;

/* renamed from: com.google.android.gms.internal.measurement.v2 */
/* loaded from: classes.dex */
final class C2156v2 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ Activity f8190e;

    /* renamed from: f */
    final /* synthetic */ BinderC1882d1 f8191f;

    /* renamed from: g */
    final /* synthetic */ C2186x2 f8192g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2156v2(C2186x2 c2186x2, Activity activity, BinderC1882d1 binderC1882d1) {
        super(c2186x2.f8251a, true);
        this.f8192g = c2186x2;
        this.f8190e = activity;
        this.f8191f = binderC1882d1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f8192g.f8251a.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).onActivitySaveInstanceState(BinderC6676b.m26053M(this.f8190e), this.f8191f, this.f7959b);
    }
}
