package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.h8 */
/* loaded from: classes.dex */
public final class C1952h8 extends AbstractC1997k8 {

    /* renamed from: d */
    private final byte[] f7798d;

    /* renamed from: e */
    private final int f7799e;

    /* renamed from: f */
    private int f7800f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1952h8(byte[] bArr, int i10, int i11) {
        super(null);
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i11) | i11) >= 0) {
                this.f7798d = bArr;
                this.f7800f = 0;
                this.f7799e = i11;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: D */
    public final void m8498D(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f7798d, this.f7800f, i11);
            this.f7800f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C1967i8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7800f), Integer.valueOf(this.f7799e), Integer.valueOf(i11)), e10);
        }
    }

    /* renamed from: E */
    public final void m8499E(String str) {
        int i10 = this.f7800f;
        try {
            int m8588a = AbstractC1997k8.m8588a(str.length() * 3);
            int m8588a2 = AbstractC1997k8.m8588a(str.length());
            if (m8588a2 == m8588a) {
                int i11 = i10 + m8588a2;
                this.f7800f = i11;
                int m8604b = AbstractC2000kb.m8604b(str, this.f7798d, i11, this.f7799e - i11);
                this.f7800f = i10;
                mo8514u((m8604b - i10) - m8588a2);
                this.f7800f = m8604b;
                return;
            }
            mo8514u(AbstractC2000kb.m8605c(str));
            byte[] bArr = this.f7798d;
            int i12 = this.f7800f;
            this.f7800f = AbstractC2000kb.m8604b(str, bArr, i12, this.f7799e - i12);
        } catch (C1985jb e10) {
            this.f7800f = i10;
            m8596e(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new C1967i8(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: g */
    public final int mo8500g() {
        return this.f7799e - this.f7800f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: h */
    public final void mo8501h(byte b10) {
        try {
            byte[] bArr = this.f7798d;
            int i10 = this.f7800f;
            this.f7800f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new C1967i8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7800f), Integer.valueOf(this.f7799e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: i */
    public final void mo8502i(int i10, boolean z10) {
        mo8514u(i10 << 3);
        mo8501h(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: j */
    public final void mo8503j(int i10, AbstractC1873c8 abstractC1873c8) {
        mo8514u((i10 << 3) | 2);
        mo8514u(abstractC1873c8.mo8182i());
        abstractC1873c8.mo8186o(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: k */
    public final void mo8504k(int i10, int i11) {
        mo8514u((i10 << 3) | 5);
        mo8505l(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: l */
    public final void mo8505l(int i10) {
        try {
            byte[] bArr = this.f7798d;
            int i11 = this.f7800f;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f7800f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C1967i8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7800f), Integer.valueOf(this.f7799e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: m */
    public final void mo8506m(int i10, long j10) {
        mo8514u((i10 << 3) | 1);
        mo8507n(j10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: n */
    public final void mo8507n(long j10) {
        try {
            byte[] bArr = this.f7798d;
            int i10 = this.f7800f;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f7800f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new C1967i8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7800f), Integer.valueOf(this.f7799e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: o */
    public final void mo8508o(int i10, int i11) {
        mo8514u(i10 << 3);
        mo8509p(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: p */
    public final void mo8509p(int i10) {
        if (i10 >= 0) {
            mo8514u(i10);
        } else {
            mo8516w(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: q */
    public final void mo8510q(byte[] bArr, int i10, int i11) {
        m8498D(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: r */
    public final void mo8511r(int i10, String str) {
        mo8514u((i10 << 3) | 2);
        m8499E(str);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: s */
    public final void mo8512s(int i10, int i11) {
        mo8514u((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: t */
    public final void mo8513t(int i10, int i11) {
        mo8514u(i10 << 3);
        mo8514u(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: u */
    public final void mo8514u(int i10) {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f7798d;
                int i11 = this.f7800f;
                this.f7800f = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C1967i8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7800f), Integer.valueOf(this.f7799e), 1), e10);
            }
        }
        byte[] bArr2 = this.f7798d;
        int i12 = this.f7800f;
        this.f7800f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: v */
    public final void mo8515v(int i10, long j10) {
        mo8514u(i10 << 3);
        mo8516w(j10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1997k8
    /* renamed from: w */
    public final void mo8516w(long j10) {
        boolean z10;
        z10 = AbstractC1997k8.f7851c;
        if (z10 && this.f7799e - this.f7800f >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f7798d;
                int i10 = this.f7800f;
                this.f7800f = i10 + 1;
                AbstractC1908eb.m8317s(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f7798d;
            int i11 = this.f7800f;
            this.f7800f = i11 + 1;
            AbstractC1908eb.m8317s(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f7798d;
                int i12 = this.f7800f;
                this.f7800f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C1967i8(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f7800f), Integer.valueOf(this.f7799e), 1), e10);
            }
        }
        byte[] bArr4 = this.f7798d;
        int i13 = this.f7800f;
        this.f7800f = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
