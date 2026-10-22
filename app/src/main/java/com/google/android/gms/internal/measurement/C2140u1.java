package com.google.android.gms.internal.measurement;

import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u1 */
/* loaded from: classes.dex */
public final class C2140u1 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ String f8135e;

    /* renamed from: f */
    final /* synthetic */ String f8136f;

    /* renamed from: g */
    final /* synthetic */ BinderC1882d1 f8137g;

    /* renamed from: h */
    final /* synthetic */ C2201y2 f8138h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2140u1(C2201y2 c2201y2, String str, String str2, BinderC1882d1 binderC1882d1) {
        super(c2201y2, true);
        this.f8138h = c2201y2;
        this.f8135e = str;
        this.f8136f = str2;
        this.f8137g = binderC1882d1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f8138h.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).getConditionalUserProperties(this.f8135e, this.f8136f, this.f8137g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: b */
    protected final void mo8117b() {
        this.f8137g.mo8200b(null);
    }
}
