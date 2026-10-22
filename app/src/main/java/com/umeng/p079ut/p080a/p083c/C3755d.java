package com.umeng.p079ut.p080a.p083c;

/* renamed from: com.umeng.ut.a.c.d */
/* loaded from: classes3.dex */
public class C3755d {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.ut.a.c.d$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public int[] f16791a;

        /* renamed from: x */
        public int f16792x;

        /* renamed from: y */
        public int f16793y;

        private a() {
            this.f16791a = new int[256];
        }
    }

    /* renamed from: a */
    private static a m15947a(String str) {
        if (str == null) {
            return null;
        }
        a aVar = new a();
        for (int i10 = 0; i10 < 256; i10++) {
            aVar.f16791a[i10] = i10;
        }
        aVar.f16792x = 0;
        aVar.f16793y = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            try {
                char charAt = str.charAt(i11);
                int[] iArr = aVar.f16791a;
                int i14 = iArr[i13];
                i12 = ((charAt + i14) + i12) % 256;
                iArr[i13] = iArr[i12];
                iArr[i12] = i14;
                i11 = (i11 + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return aVar;
    }

    /* renamed from: b */
    public static byte[] m15949b(byte[] bArr) {
        a m15947a;
        if (bArr != null && (m15947a = m15947a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) != null) {
            return m15948a(bArr, m15947a);
        }
        return null;
    }

    /* renamed from: a */
    private static byte[] m15948a(byte[] bArr, a aVar) {
        if (bArr == null || aVar == null) {
            return null;
        }
        int i10 = aVar.f16792x;
        int i11 = aVar.f16793y;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            i10 = (i10 + 1) % 256;
            int[] iArr = aVar.f16791a;
            int i13 = iArr[i10];
            i11 = (i11 + i13) % 256;
            iArr[i10] = iArr[i11];
            iArr[i11] = i13;
            int i14 = (iArr[i10] + i13) % 256;
            bArr[i12] = (byte) (iArr[i14] ^ bArr[i12]);
        }
        aVar.f16792x = i10;
        aVar.f16793y = i11;
        return bArr;
    }
}
