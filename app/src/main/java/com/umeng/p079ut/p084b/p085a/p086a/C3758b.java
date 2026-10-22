package com.umeng.p079ut.p084b.p085a.p086a;

/* renamed from: com.umeng.ut.b.a.a.b */
/* loaded from: classes3.dex */
public class C3758b {
    public static byte[] getBytes(int i10) {
        byte[] bArr = {(byte) ((r3 >> 8) % 256), (byte) (r3 % 256), (byte) (r3 % 256), (byte) (i10 % 256)};
        int i11 = i10 >> 8;
        int i12 = i11 >> 8;
        return bArr;
    }
}
