package com.google.android.gms.internal.measurement;

import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.j2 */
/* loaded from: classes.dex */
public final class C1976j2 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ String f7825e;

    /* renamed from: f */
    final /* synthetic */ BinderC1882d1 f7826f;

    /* renamed from: g */
    final /* synthetic */ C2201y2 f7827g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1976j2(C2201y2 c2201y2, String str, BinderC1882d1 binderC1882d1) {
        super(c2201y2, true);
        this.f7827g = c2201y2;
        this.f7825e = str;
        this.f7826f = binderC1882d1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f7827g.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).getMaxUserProperties(this.f7825e, this.f7826f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: b */
    protected final void mo8117b() {
        this.f7826f.mo8200b(null);
    }
}
