package com.umeng.message.proguard;

/* renamed from: com.umeng.message.proguard.dz */
/* loaded from: classes3.dex */
public final class C3664dz {
    /* renamed from: a */
    public static byte[] m15717a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr[i10] = (byte) ((bArr[i10] ^ bArr2[i10 % bArr2.length]) ^ (i10 & 255));
            }
        }
        return bArr;
    }
}
