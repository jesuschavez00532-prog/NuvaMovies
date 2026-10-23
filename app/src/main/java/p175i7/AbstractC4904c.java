package p175i7;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import p098d7.C3963c;
import p114e7.C4139a;
import p114e7.EnumC4141c;
import p129f7.C4271a;
import p129f7.C4273c;
import p158h7.C4563c;
import p158h7.EnumC4561a;
import p158h7.EnumC4562b;

/* renamed from: i7.c */
/* loaded from: classes.dex */
public abstract class AbstractC4904c {

    /* renamed from: a */
    private static final int[] f20419a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i7.c$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20420a;

        static {
            int[] iArr = new int[EnumC4562b.values().length];
            f20420a = iArr;
            try {
                iArr[EnumC4562b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20420a[EnumC4562b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20420a[EnumC4562b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20420a[EnumC4562b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    static void m20111a(String str, C4139a c4139a, String str2) {
        try {
            for (byte b10 : str.getBytes(str2)) {
                c4139a.m17335d(b10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new C3963c(e10);
        }
    }

    /* renamed from: b */
    static void m20112b(CharSequence charSequence, C4139a c4139a) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int m20126p = m20126p(charSequence.charAt(i10));
            if (m20126p != -1) {
                int i11 = i10 + 1;
                if (i11 < length) {
                    int m20126p2 = m20126p(charSequence.charAt(i11));
                    if (m20126p2 != -1) {
                        c4139a.m17335d((m20126p * 45) + m20126p2, 11);
                        i10 += 2;
                    } else {
                        throw new C3963c();
                    }
                } else {
                    c4139a.m17335d(m20126p, 6);
                    i10 = i11;
                }
            } else {
                throw new C3963c();
            }
        }
    }

    /* renamed from: c */
    static void m20113c(String str, EnumC4562b enumC4562b, C4139a c4139a, String str2) {
        int i10 = a.f20420a[enumC4562b.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        m20115e(str, c4139a);
                        return;
                    } else {
                        throw new C3963c("Invalid mode: " + enumC4562b);
                    }
                }
                m20111a(str, c4139a, str2);
                return;
            }
            m20112b(str, c4139a);
            return;
        }
        m20118h(str, c4139a);
    }

    /* renamed from: d */
    private static void m20114d(EnumC4141c enumC4141c, C4139a c4139a) {
        c4139a.m17335d(EnumC4562b.ECI.m18985a(), 4);
        c4139a.m17335d(enumC4141c.m17350b(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[LOOP:0: B:4:0x0008->B:11:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void m20115e(java.lang.String r6, p114e7.C4139a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L4c
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L24
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L24
        L22:
            int r2 = r2 - r3
            goto L33
        L24:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L32
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L32
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L22
        L32:
            r2 = -1
        L33:
            if (r2 == r4) goto L44
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.m17335d(r3, r2)
            int r1 = r1 + 2
            goto L8
        L44:
            d7.c r6 = new d7.c
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            d7.c r7 = new d7.c
            r7.<init>(r6)
            goto L55
        L54:
            throw r7
        L55:
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: p175i7.AbstractC4904c.m20115e(java.lang.String, e7.a):void");
    }

    /* renamed from: f */
    static void m20116f(int i10, C4563c c4563c, EnumC4562b enumC4562b, C4139a c4139a) {
        int m18986b = enumC4562b.m18986b(c4563c);
        int i11 = 1 << m18986b;
        if (i10 < i11) {
            c4139a.m17335d(i10, m18986b);
            return;
        }
        throw new C3963c(i10 + " is bigger than " + (i11 - 1));
    }

    /* renamed from: g */
    static void m20117g(EnumC4562b enumC4562b, C4139a c4139a) {
        c4139a.m17335d(enumC4562b.m18985a(), 4);
    }

    /* renamed from: h */
    static void m20118h(CharSequence charSequence, C4139a c4139a) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                c4139a.m17335d((charAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    c4139a.m17335d((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    c4139a.m17335d(charAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    private static int m20119i(EnumC4562b enumC4562b, C4139a c4139a, C4139a c4139a2, C4563c c4563c) {
        return c4139a.m17338h() + enumC4562b.m18986b(c4563c) + c4139a2.m17338h();
    }

    /* renamed from: j */
    private static int m20120j(C4903b c4903b) {
        return AbstractC4905d.m20133a(c4903b) + AbstractC4905d.m20135c(c4903b) + AbstractC4905d.m20136d(c4903b) + AbstractC4905d.m20137e(c4903b);
    }

    /* renamed from: k */
    private static int m20121k(C4139a c4139a, EnumC4561a enumC4561a, C4563c c4563c, C4903b c4903b) {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            AbstractC4906e.m20141a(c4139a, enumC4561a, c4563c, i12, c4903b);
            int m20120j = m20120j(c4903b);
            if (m20120j < i10) {
                i11 = i12;
                i10 = m20120j;
            }
        }
        return i11;
    }

    /* renamed from: l */
    private static EnumC4562b m20122l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m20129s(str)) {
            return EnumC4562b.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else if (m20126p(charAt) != -1) {
                z10 = true;
            } else {
                return EnumC4562b.BYTE;
            }
        }
        if (z10) {
            return EnumC4562b.ALPHANUMERIC;
        }
        if (z11) {
            return EnumC4562b.NUMERIC;
        }
        return EnumC4562b.BYTE;
    }

    /* renamed from: m */
    private static C4563c m20123m(int i10, EnumC4561a enumC4561a) {
        for (int i11 = 1; i11 <= 40; i11++) {
            C4563c m18988e = C4563c.m18988e(i11);
            if (m20132v(i10, m18988e, enumC4561a)) {
                return m18988e;
            }
        }
        throw new C3963c("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p175i7.C4907f m20124n(java.lang.String r6, p158h7.EnumC4561a r7, java.util.Map r8) {
        /*
            java.lang.String r0 = "ISO-8859-1"
            if (r8 == 0) goto L15
            d7.b r1 = p098d7.EnumC3962b.CHARACTER_SET
            boolean r2 = r8.containsKey(r1)
            if (r2 == 0) goto L15
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            goto L16
        L15:
            r1 = r0
        L16:
            h7.b r2 = m20122l(r6, r1)
            e7.a r3 = new e7.a
            r3.<init>()
            h7.b r4 = p158h7.EnumC4562b.BYTE
            if (r2 != r4) goto L32
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            e7.c r0 = p114e7.EnumC4141c.m17349a(r1)
            if (r0 == 0) goto L32
            m20114d(r0, r3)
        L32:
            m20117g(r2, r3)
            e7.a r0 = new e7.a
            r0.<init>()
            m20113c(r6, r2, r0, r1)
            if (r8 == 0) goto L6a
            d7.b r1 = p098d7.EnumC3962b.QR_VERSION
            boolean r5 = r8.containsKey(r1)
            if (r5 == 0) goto L6a
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = r8.toString()
            int r8 = java.lang.Integer.parseInt(r8)
            h7.c r8 = p158h7.C4563c.m18988e(r8)
            int r1 = m20119i(r2, r3, r0, r8)
            boolean r1 = m20132v(r1, r8, r7)
            if (r1 == 0) goto L62
            goto L6e
        L62:
            d7.c r6 = new d7.c
            java.lang.String r7 = "Data too big for requested version"
            r6.<init>(r7)
            throw r6
        L6a:
            h7.c r8 = m20130t(r7, r2, r3, r0)
        L6e:
            e7.a r1 = new e7.a
            r1.<init>()
            r1.m17334b(r3)
            if (r2 != r4) goto L7d
            int r6 = r0.m17339i()
            goto L81
        L7d:
            int r6 = r6.length()
        L81:
            m20116f(r6, r8, r2, r1)
            r1.m17334b(r0)
            h7.c$b r6 = r8.m18990c(r7)
            int r0 = r8.m18991d()
            int r3 = r6.m18998d()
            int r0 = r0 - r3
            m20131u(r0, r1)
            int r3 = r8.m18991d()
            int r6 = r6.m18997c()
            e7.a r6 = m20128r(r1, r3, r0, r6)
            i7.f r0 = new i7.f
            r0.<init>()
            r0.m20162c(r7)
            r0.m20165f(r2)
            r0.m20166g(r8)
            int r1 = r8.m18989b()
            i7.b r2 = new i7.b
            r2.<init>(r1, r1)
            int r1 = m20121k(r6, r7, r8, r2)
            r0.m20163d(r1)
            p175i7.AbstractC4906e.m20141a(r6, r7, r8, r1, r2)
            r0.m20164e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p175i7.AbstractC4904c.m20124n(java.lang.String, h7.a, java.util.Map):i7.f");
    }

    /* renamed from: o */
    static byte[] m20125o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new C4273c(C4271a.f18602l).m17823b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    /* renamed from: p */
    static int m20126p(int i10) {
        int[] iArr = f20419a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    /* renamed from: q */
    static void m20127q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 < i12) {
            int i14 = i10 % i12;
            int i15 = i12 - i14;
            int i16 = i10 / i12;
            int i17 = i16 + 1;
            int i18 = i11 / i12;
            int i19 = i18 + 1;
            int i20 = i16 - i18;
            int i21 = i17 - i19;
            if (i20 == i21) {
                if (i12 == i15 + i14) {
                    if (i10 == ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
                        if (i13 < i15) {
                            iArr[0] = i18;
                            iArr2[0] = i20;
                            return;
                        } else {
                            iArr[0] = i19;
                            iArr2[0] = i21;
                            return;
                        }
                    }
                    throw new C3963c("Total bytes mismatch");
                }
                throw new C3963c("RS blocks mismatch");
            }
            throw new C3963c("EC bytes mismatch");
        }
        throw new C3963c("Block ID too large");
    }

    /* renamed from: r */
    static C4139a m20128r(C4139a c4139a, int i10, int i11, int i12) {
        if (c4139a.m17339i() == i11) {
            ArrayList arrayList = new ArrayList(i12);
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m20127q(i10, i11, i12, i16, iArr, iArr2);
                int i17 = iArr[0];
                byte[] bArr = new byte[i17];
                c4139a.m17340k(i13 << 3, bArr, 0, i17);
                byte[] m20125o = m20125o(bArr, iArr2[0]);
                arrayList.add(new C4902a(bArr, m20125o));
                i14 = Math.max(i14, i17);
                i15 = Math.max(i15, m20125o.length);
                i13 += iArr[0];
            }
            if (i11 == i13) {
                C4139a c4139a2 = new C4139a();
                for (int i18 = 0; i18 < i14; i18++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] m20102a = ((C4902a) it.next()).m20102a();
                        if (i18 < m20102a.length) {
                            c4139a2.m17335d(m20102a[i18], 8);
                        }
                    }
                }
                for (int i19 = 0; i19 < i15; i19++) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        byte[] m20103b = ((C4902a) it2.next()).m20103b();
                        if (i19 < m20103b.length) {
                            c4139a2.m17335d(m20103b[i19], 8);
                        }
                    }
                }
                if (i10 == c4139a2.m17339i()) {
                    return c4139a2;
                }
                throw new C3963c("Interleaving error: " + i10 + " and " + c4139a2.m17339i() + " differ.");
            }
            throw new C3963c("Data bytes does not match offset");
        }
        throw new C3963c("Number of bits and data bytes does not match");
    }

    /* renamed from: s */
    private static boolean m20129s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                int i11 = bytes[i10] & 255;
                if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private static C4563c m20130t(EnumC4561a enumC4561a, EnumC4562b enumC4562b, C4139a c4139a, C4139a c4139a2) {
        return m20123m(m20119i(enumC4562b, c4139a, c4139a2, m20123m(m20119i(enumC4562b, c4139a, c4139a2, C4563c.m18988e(1)), enumC4561a)), enumC4561a);
    }

    /* renamed from: u */
    static void m20131u(int i10, C4139a c4139a) {
        int i11 = 0;
        int i12 = i10 << 3;
        if (c4139a.m17338h() <= i12) {
            for (int i13 = 0; i13 < 4 && c4139a.m17338h() < i12; i13++) {
                c4139a.m17333a(false);
            }
            int m17338h = c4139a.m17338h() & 7;
            if (m17338h > 0) {
                while (m17338h < 8) {
                    c4139a.m17333a(false);
                    m17338h++;
                }
            }
            int m17339i = i10 - c4139a.m17339i();
            for (int i14 = 0; i14 < m17339i; i14++) {
                if ((i14 & 1) == 0) {
                    i11 = 236;
                } else {
                    i11 = 17;
                }
                c4139a.m17335d(i11, 8);
            }
            if (c4139a.m17338h() == i12) {
                return;
            } else {
                throw new C3963c("Bits size does not equal capacity");
            }
        }
        throw new C3963c("data bits cannot fit in the QR Code" + c4139a.m17338h() + " > " + i12);
    }

    /* renamed from: v */
    private static boolean m20132v(int i10, C4563c c4563c, EnumC4561a enumC4561a) {
        if (c4563c.m18991d() - c4563c.m18990c(enumC4561a).m18998d() >= (i10 + 7) / 8) {
            return true;
        }
        return false;
    }
}
