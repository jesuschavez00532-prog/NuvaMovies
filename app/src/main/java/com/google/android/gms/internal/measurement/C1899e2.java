package com.google.android.gms.internal.measurement;

import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.e2 */
/* loaded from: classes.dex */
public final class C1899e2 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ BinderC1882d1 f7714e;

    /* renamed from: f */
    final /* synthetic */ C2201y2 f7715f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899e2(C2201y2 c2201y2, BinderC1882d1 binderC1882d1) {
        super(c2201y2, true);
        this.f7715f = c2201y2;
        this.f7714e = binderC1882d1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f7715f.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).getCurrentScreenName(this.f7714e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: b */
    protected final void mo8117b() {
        this.f7714e.mo8200b(null);
    }
}
