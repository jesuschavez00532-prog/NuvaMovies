package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p9 */
/* loaded from: classes.dex */
final class C2073p9 extends AbstractC2103r9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2073p9(AbstractC2058o9 abstractC2058o9) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2103r9
    /* renamed from: a */
    public final void mo8738a(Object obj, long j10) {
        ((InterfaceC1922f9) AbstractC1908eb.m8309k(obj, j10)).mo8386e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2103r9
    /* renamed from: b */
    public final void mo8739b(Object obj, Object obj2, long j10) {
        InterfaceC1922f9 interfaceC1922f9 = (InterfaceC1922f9) AbstractC1908eb.m8309k(obj, j10);
        InterfaceC1922f9 interfaceC1922f92 = (InterfaceC1922f9) AbstractC1908eb.m8309k(obj2, j10);
        int size = interfaceC1922f9.size();
        int size2 = interfaceC1922f92.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC1922f9.mo8387f()) {
                interfaceC1922f9 = interfaceC1922f9.mo8095l(size2 + size);
            }
            interfaceC1922f9.addAll(interfaceC1922f92);
        }
        if (size > 0) {
            interfaceC1922f92 = interfaceC1922f9;
        }
        AbstractC1908eb.m8322x(obj, j10, interfaceC1922f92);
    }
}
