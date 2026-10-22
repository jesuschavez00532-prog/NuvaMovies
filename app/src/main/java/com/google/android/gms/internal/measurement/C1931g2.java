package com.google.android.gms.internal.measurement;

import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.g2 */
/* loaded from: classes.dex */
public final class C1931g2 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ String f7757e;

    /* renamed from: f */
    final /* synthetic */ String f7758f;

    /* renamed from: g */
    final /* synthetic */ boolean f7759g;

    /* renamed from: h */
    final /* synthetic */ BinderC1882d1 f7760h;

    /* renamed from: i */
    final /* synthetic */ C2201y2 f7761i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1931g2(C2201y2 c2201y2, String str, String str2, boolean z10, BinderC1882d1 binderC1882d1) {
        super(c2201y2, true);
        this.f7761i = c2201y2;
        this.f7757e = str;
        this.f7758f = str2;
        this.f7759g = z10;
        this.f7760h = binderC1882d1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f7761i.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).getUserProperties(this.f7757e, this.f7758f, this.f7759g, this.f7760h);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: b */
    protected final void mo8117b() {
        this.f7760h.mo8200b(null);
    }
}
