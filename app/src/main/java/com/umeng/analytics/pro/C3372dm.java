package com.umeng.analytics.pro;

import java.util.BitSet;

/* renamed from: com.umeng.analytics.pro.dm */
/* loaded from: classes3.dex */
public final class C3372dm extends C3360da {

    /* renamed from: com.umeng.analytics.pro.dm$a */
    /* loaded from: classes3.dex */
    public static class a implements InterfaceC3368di {
        @Override // com.umeng.analytics.pro.InterfaceC3368di
        /* renamed from: a */
        public AbstractC3366dg mo14177a(AbstractC3380du abstractC3380du) {
            return new C3372dm(abstractC3380du);
        }
    }

    public C3372dm(AbstractC3380du abstractC3380du) {
        super(abstractC3380du);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: D */
    public Class<? extends InterfaceC3374do> mo14209D() {
        return AbstractC3377dr.class;
    }

    /* renamed from: a */
    public void m14217a(BitSet bitSet, int i10) {
        for (byte b10 : m14216b(bitSet, i10)) {
            mo14135a(b10);
        }
    }

    /* renamed from: b */
    public BitSet m14218b(int i10) {
        double d10 = i10;
        Double.isNaN(d10);
        int ceil = (int) Math.ceil(d10 / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i11 = 0; i11 < ceil; i11++) {
            bArr[i11] = mo14171u();
        }
        return m14215a(bArr);
    }

    /* renamed from: a */
    public static BitSet m14215a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i10 = 0; i10 < bArr.length * 8; i10++) {
            if ((bArr[(bArr.length - (i10 / 8)) - 1] & (1 << (i10 % 8))) > 0) {
                bitSet.set(i10);
            }
        }
        return bitSet;
    }

    /* renamed from: b */
    public static byte[] m14216b(BitSet bitSet, int i10) {
        double d10 = i10;
        Double.isNaN(d10);
        int ceil = (int) Math.ceil(d10 / 8.0d);
        byte[] bArr = new byte[ceil];
        for (int i11 = 0; i11 < bitSet.length(); i11++) {
            if (bitSet.get(i11)) {
                int i12 = (ceil - (i11 / 8)) - 1;
                bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
            }
        }
        return bArr;
    }
}
