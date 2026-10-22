package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v9 */
/* loaded from: classes.dex */
final class C2163v9 implements InterfaceC1859ba {

    /* renamed from: a */
    private final InterfaceC1859ba[] f8220a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2163v9(InterfaceC1859ba... interfaceC1859baArr) {
        this.f8220a = interfaceC1859baArr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1859ba
    /* renamed from: a */
    public final InterfaceC1843aa mo8140a(Class cls) {
        InterfaceC1859ba[] interfaceC1859baArr = this.f8220a;
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC1859ba interfaceC1859ba = interfaceC1859baArr[i10];
            if (interfaceC1859ba.mo8141b(cls)) {
                return interfaceC1859ba.mo8140a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1859ba
    /* renamed from: b */
    public final boolean mo8141b(Class cls) {
        InterfaceC1859ba[] interfaceC1859baArr = this.f8220a;
        for (int i10 = 0; i10 < 2; i10++) {
            if (interfaceC1859baArr[i10].mo8141b(cls)) {
                return true;
            }
        }
        return false;
    }
}
