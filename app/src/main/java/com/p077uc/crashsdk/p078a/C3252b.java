package com.p077uc.crashsdk.p078a;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: com.uc.crashsdk.a.b */
/* loaded from: classes3.dex */
public final class C3252b {

    /* renamed from: a */
    private static final int[] f13647a = {126, 147, 115, 241, 101, 198, 215, 134};

    /* renamed from: b */
    private static final int[] f13648b = {125, 185, 233, 226, 129, 142, 151, 176};

    /* renamed from: c */
    private static final int[] f13649c = {238, 185, 233, 179, 129, 142, 151, 167};

    /* renamed from: a */
    public static String m13174a(String str) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        File file = new File(str);
        FileInputStream fileInputStream3 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream2 = new FileInputStream(file);
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[(int) file.length()];
            fileInputStream2.read(bArr);
            C3257g.m13218a(fileInputStream2);
            byte[] m13177a = m13177a(bArr, f13647a);
            if (m13177a == null || m13177a.length <= 0) {
                C3257g.m13218a((Closeable) null);
                return null;
            }
            int length = m13177a.length - 1;
            String str2 = m13177a[length] == 10 ? new String(m13177a, 0, length) : new String(m13177a);
            C3257g.m13218a((Closeable) null);
            return str2;
        } catch (Exception e11) {
            fileInputStream = fileInputStream2;
            e = e11;
            try {
                C3257g.m13220a(e);
                C3257g.m13218a(fileInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream3 = fileInputStream;
                C3257g.m13218a(fileInputStream3);
                throw th;
            }
        } catch (Throwable th3) {
            fileInputStream3 = fileInputStream2;
            th = th3;
            C3257g.m13218a(fileInputStream3);
            throw th;
        }
    }

    /* renamed from: b */
    private static byte[] m13178b(byte[] bArr, int[] iArr) {
        if (bArr != null && iArr != null && iArr.length == 8) {
            int length = bArr.length;
            try {
                byte[] bArr2 = new byte[length + 2];
                byte b10 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    byte b11 = bArr[i10];
                    bArr2[i10] = (byte) (iArr[i10 % 8] ^ b11);
                    b10 = (byte) (b10 ^ b11);
                }
                bArr2[length] = (byte) (iArr[0] ^ b10);
                bArr2[length + 1] = (byte) (iArr[1] ^ b10);
                return bArr2;
            } catch (Exception e10) {
                C3257g.m13220a(e10);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r1 = com.p077uc.crashsdk.p078a.C3257g.m13238e(r0);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m13175a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            if (r9 != 0) goto L3
            return r7
        L3:
            boolean r0 = com.p077uc.crashsdk.p078a.C3257g.m13225a(r7)
            if (r0 == 0) goto La
            return r7
        La:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r1 = r0.exists()
            if (r1 == 0) goto Lc3
            long r1 = r0.length()
            r3 = 3145728(0x300000, double:1.554196E-317)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L22
            goto Lc3
        L22:
            byte[] r1 = com.p077uc.crashsdk.p078a.C3257g.m13238e(r0)
            if (r1 == 0) goto Lc3
            int r2 = r1.length
            if (r2 > 0) goto L2d
            goto Lc3
        L2d:
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L88
            r9 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L50
            r4.<init>()     // Catch: java.lang.Throwable -> L50
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L4b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4b
            r5.write(r1)     // Catch: java.lang.Throwable -> L49
            r4.flush()     // Catch: java.lang.Throwable -> L49
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r4)
        L45:
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r5)
            goto L5b
        L49:
            r9 = move-exception
            goto L54
        L4b:
            r5 = move-exception
            r6 = r5
            r5 = r9
            r9 = r6
            goto L54
        L50:
            r4 = move-exception
            r5 = r9
            r9 = r4
            r4 = r5
        L54:
            com.p077uc.crashsdk.p078a.C3257g.m13220a(r9)     // Catch: java.lang.Throwable -> L80
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r4)
            goto L45
        L5b:
            byte[] r1 = r4.toByteArray()     // Catch: java.lang.Throwable -> L61
            r9 = 1
            goto L66
        L61:
            r9 = move-exception
            com.p077uc.crashsdk.p078a.C3257g.m13220a(r9)
            r9 = 0
        L66:
            if (r9 == 0) goto L7f
            if (r1 == 0) goto L7f
            int r9 = r1.length
            if (r9 > 0) goto L6e
            goto L7f
        L6e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 1
            goto L8a
        L7f:
            return r7
        L80:
            r7 = move-exception
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r4)
            com.p077uc.crashsdk.p078a.C3257g.m13218a(r5)
            throw r7
        L88:
            r8 = r7
            r9 = 0
        L8a:
            if (r9 == 0) goto Lc3
            java.lang.String r9 = r0.getName()
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto La9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r4 = ".tmp"
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r4 = 1
            goto Lab
        La9:
            r9 = r8
            r4 = 0
        Lab:
            java.io.File r5 = new java.io.File
            r5.<init>(r9)
            boolean r9 = com.p077uc.crashsdk.p078a.C3257g.m13224a(r5, r1)
            if (r9 != 0) goto Lb8
            r2 = 0
            goto Lc0
        Lb8:
            if (r4 == 0) goto Lc0
            r0.delete()
            r5.renameTo(r0)
        Lc0:
            if (r2 == 0) goto Lc3
            return r8
        Lc3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p077uc.crashsdk.p078a.C3252b.m13175a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    private static byte[] m13177a(byte[] bArr, int[] iArr) {
        if (bArr.length - 0 >= 2 && iArr != null && iArr.length == 8) {
            int length = (bArr.length - 2) - 0;
            try {
                byte[] bArr2 = new byte[length];
                byte b10 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    byte b11 = (byte) (bArr[i10 + 0] ^ iArr[i10 % 8]);
                    bArr2[i10] = b11;
                    b10 = (byte) (b10 ^ b11);
                }
                if (bArr[length + 0] == ((byte) ((iArr[0] ^ b10) & 255)) && bArr[length + 1 + 0] == ((byte) ((iArr[1] ^ b10) & 255))) {
                    return bArr2;
                }
                return null;
            } catch (Exception e10) {
                C3257g.m13220a(e10);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m13176a(String str, String str2) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            C3257g.m13220a(th);
            fileOutputStream = null;
        }
        if (fileOutputStream == null) {
            return false;
        }
        byte[] m13178b = m13178b(str2.getBytes(), f13647a);
        if (m13178b == null) {
            return false;
        }
        try {
            fileOutputStream.write(m13178b);
            C3257g.m13218a(fileOutputStream);
            return true;
        } catch (Throwable th2) {
            try {
                C3257g.m13220a(th2);
                return false;
            } finally {
                C3257g.m13218a(fileOutputStream);
            }
        }
    }
}
