package p134fc;

import anet.channel.request.Request;

/* renamed from: fc.a */
/* loaded from: classes.dex */
public abstract class AbstractC4304a {

    /* renamed from: a */
    private static byte[] f18741a = new byte[103];

    static {
        for (int i10 = 0; i10 <= 102; i10++) {
            f18741a[i10] = -1;
        }
        for (int i11 = 48; i11 <= 57; i11++) {
            f18741a[i11] = (byte) (i11 - 48);
        }
        for (int i12 = 65; i12 <= 70; i12++) {
            f18741a[i12] = (byte) ((i12 - 65) + 10);
        }
        for (int i13 = 97; i13 <= 102; i13++) {
            f18741a[i13] = (byte) ((i13 - 97) + 10);
        }
    }

    /* renamed from: a */
    private static int m18073a(char c10) {
        if (c10 <= 'f') {
            byte b10 = f18741a[c10];
            if (b10 >= 0) {
                return b10;
            }
            throw new IllegalArgumentException("Invalid hex character: " + c10);
        }
        throw new IllegalArgumentException("Invalid hex character: " + c10);
    }

    /* renamed from: b */
    public static String m18074b(String str) {
        int length = str.length();
        if ((length & 1) == 0) {
            byte[] bArr = new byte[length / 2];
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                bArr[i11] = (byte) ((m18073a(str.charAt(i10)) << 4) | m18073a(str.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return new String(bArr, Request.DEFAULT_CHARSET);
        }
        throw new IllegalArgumentException("fromHexString requires an even number of hex characters");
    }

    /* renamed from: c */
    public static String m18075c(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(Integer.toHexString(str.charAt(i10)));
        }
        return sb2.toString();
    }
}
