package p281p4;

import com.umeng.analytics.pro.C3373dn;

/* renamed from: p4.i */
/* loaded from: classes.dex */
public abstract class AbstractC6205i {

    /* renamed from: a */
    private static final char[] f24375a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f24376b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m24761a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = b10 & 255;
            int i12 = i10 + 1;
            char[] cArr2 = f24376b;
            cArr[i10] = cArr2[i11 >>> 4];
            i10 = i12 + 1;
            cArr[i12] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static String m24762b(byte[] bArr, boolean z10) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length && (!z10 || i10 != length - 1 || (bArr[i10] & 255) != 0); i10++) {
            char[] cArr = f24375a;
            sb2.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb2.append(cArr[bArr[i10] & C3373dn.f14525m]);
        }
        return sb2.toString();
    }
}
