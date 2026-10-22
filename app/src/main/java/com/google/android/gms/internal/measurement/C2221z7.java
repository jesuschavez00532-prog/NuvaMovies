package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.z7 */
/* loaded from: classes.dex */
public class C2221z7 extends AbstractC2191x7 {

    /* renamed from: e */
    protected final byte[] f8307e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2221z7(byte[] bArr) {
        bArr.getClass();
        this.f8307e = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1873c8
    /* renamed from: c */
    public byte mo8180c(int i10) {
        return this.f8307e[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1873c8
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1873c8) || mo8182i() != ((AbstractC1873c8) obj).mo8182i()) {
            return false;
        }
        if (mo8182i() == 0) {
            return true;
        }
        if (obj instanceof C2221z7) {
            C2221z7 c2221z7 = (C2221z7) obj;
            int m8188t = m8188t();
            int m8188t2 = c2221z7.m8188t();
            if (m8188t != 0 && m8188t2 != 0 && m8188t != m8188t2) {
                return false;
            }
            int mo8182i = mo8182i();
            if (mo8182i <= c2221z7.mo8182i()) {
                if (mo8182i <= c2221z7.mo8182i()) {
                    byte[] bArr = this.f8307e;
                    byte[] bArr2 = c2221z7.f8307e;
                    c2221z7.mo9043x();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < mo8182i) {
                        if (bArr[i10] != bArr2[i11]) {
                            return false;
                        }
                        i10++;
                        i11++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + mo8182i + ", " + c2221z7.mo8182i());
            }
            throw new IllegalArgumentException("Length too large: " + mo8182i + mo8182i());
        }
        return obj.equals(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1873c8
    /* renamed from: g */
    public byte mo8181g(int i10) {
        return this.f8307e[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1873c8
    /* renamed from: i */
    public int mo8182i() {
        return this.f8307e.length;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1873c8
    /* renamed from: j */
    protected final int mo8183j(int i10, int i11, int i12) {
        return AbstractC1938g9.m8417d(i10, this.f8307e, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1873c8
    /* renamed from: k */
    public final AbstractC1873c8 mo8184k(int i10, int i11) {
        int m8177q = AbstractC1873c8.m8177q(0, i11, mo8182i());
        if (m8177q == 0) {
            return AbstractC1873c8.f7691b;
        }
        return new C2161v7(this.f8307e, 0, m8177q);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1873c8
    /* renamed from: n */
    protected final String mo8185n(Charset charset) {
        return new String(this.f8307e, 0, mo8182i(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1873c8
    /* renamed from: o */
    public final void mo8186o(AbstractC2101r7 abstractC2101r7) {
        ((C1952h8) abstractC2101r7).m8498D(this.f8307e, 0, mo8182i());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1873c8
    /* renamed from: p */
    public final boolean mo8187p() {
        return AbstractC2000kb.m8608f(this.f8307e, 0, mo8182i());
    }

    /* renamed from: x */
    protected int mo9043x() {
        return 0;
    }
}
