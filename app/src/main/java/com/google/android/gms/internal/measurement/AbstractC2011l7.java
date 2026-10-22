package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l7 */
/* loaded from: classes.dex */
public abstract class AbstractC2011l7 implements InterfaceC1875ca {
    @Override // com.google.android.gms.internal.measurement.InterfaceC1875ca
    /* renamed from: T */
    public final /* bridge */ /* synthetic */ InterfaceC1875ca mo8191T(InterfaceC1891da interfaceC1891da) {
        if (mo8293a().getClass().isInstance(interfaceC1891da)) {
            return mo8623g((AbstractC2026m7) interfaceC1891da);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1875ca
    /* renamed from: c */
    public final /* synthetic */ InterfaceC1875ca mo8192c(byte[] bArr) {
        return mo8624h(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    protected abstract AbstractC2011l7 mo8623g(AbstractC2026m7 abstractC2026m7);

    /* renamed from: h */
    public abstract AbstractC2011l7 mo8624h(byte[] bArr, int i10, int i11);

    /* renamed from: i */
    public abstract AbstractC2011l7 mo8625i(byte[] bArr, int i10, int i11, C2057o8 c2057o8);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1875ca
    /* renamed from: q */
    public final /* synthetic */ InterfaceC1875ca mo8193q(byte[] bArr, C2057o8 c2057o8) {
        return mo8625i(bArr, 0, bArr.length, c2057o8);
    }
}
