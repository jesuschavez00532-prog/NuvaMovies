package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v7 */
/* loaded from: classes.dex */
final class C2161v7 extends C2221z7 {

    /* renamed from: f */
    private final int f8218f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2161v7(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC1873c8.m8177q(0, i11, bArr.length);
        this.f8218f = i11;
    }

    @Override // com.google.android.gms.internal.measurement.C2221z7, com.google.android.gms.internal.measurement.AbstractC1873c8
    /* renamed from: c */
    public final byte mo8180c(int i10) {
        int i11 = this.f8218f;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
        return this.f8307e[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.C2221z7, com.google.android.gms.internal.measurement.AbstractC1873c8
    /* renamed from: g */
    public final byte mo8181g(int i10) {
        return this.f8307e[i10];
    }

    @Override // com.google.android.gms.internal.measurement.C2221z7, com.google.android.gms.internal.measurement.AbstractC1873c8
    /* renamed from: i */
    public final int mo8182i() {
        return this.f8218f;
    }

    @Override // com.google.android.gms.internal.measurement.C2221z7
    /* renamed from: x */
    protected final int mo9043x() {
        return 0;
    }
}
