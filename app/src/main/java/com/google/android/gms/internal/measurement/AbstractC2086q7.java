package com.google.android.gms.internal.measurement;

import com.umeng.analytics.pro.C3373dn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.q7 */
/* loaded from: classes.dex */
public abstract class AbstractC2086q7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m8793a(byte[] bArr, int i10, C2071p7 c2071p7) {
        int m8802j = m8802j(bArr, i10, c2071p7);
        int i11 = c2071p7.f7995a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - m8802j) {
                if (i11 == 0) {
                    c2071p7.f7997c = AbstractC1873c8.f7691b;
                    return m8802j;
                }
                c2071p7.f7997c = AbstractC1873c8.m8178u(bArr, m8802j, i11);
                return m8802j + i11;
            }
            throw C1968i9.m8531f();
        }
        throw C1968i9.m8529d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m8794b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m8795c(InterfaceC2059oa interfaceC2059oa, byte[] bArr, int i10, int i11, int i12, C2071p7 c2071p7) {
        C1939ga c1939ga = (C1939ga) interfaceC2059oa;
        Object mo8461b = c1939ga.mo8461b();
        int m8459D = c1939ga.m8459D(mo8461b, bArr, i10, i11, i12, c2071p7);
        c1939ga.mo8460a(mo8461b);
        c2071p7.f7997c = mo8461b;
        return m8459D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m8796d(InterfaceC2059oa interfaceC2059oa, byte[] bArr, int i10, int i11, C2071p7 c2071p7) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = m8803k(i13, bArr, i12, c2071p7);
            i13 = c2071p7.f7995a;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            Object mo8461b = interfaceC2059oa.mo8461b();
            int i15 = i13 + i14;
            interfaceC2059oa.mo8467h(mo8461b, bArr, i14, i15, c2071p7);
            interfaceC2059oa.mo8460a(mo8461b);
            c2071p7.f7997c = mo8461b;
            return i15;
        }
        throw C1968i9.m8531f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m8797e(InterfaceC2059oa interfaceC2059oa, int i10, byte[] bArr, int i11, int i12, InterfaceC1922f9 interfaceC1922f9, C2071p7 c2071p7) {
        int m8796d = m8796d(interfaceC2059oa, bArr, i11, i12, c2071p7);
        interfaceC1922f9.add(c2071p7.f7997c);
        while (m8796d < i12) {
            int m8802j = m8802j(bArr, m8796d, c2071p7);
            if (i10 != c2071p7.f7995a) {
                break;
            }
            m8796d = m8796d(interfaceC2059oa, bArr, m8802j, i12, c2071p7);
            interfaceC1922f9.add(c2071p7.f7997c);
        }
        return m8796d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static int m8798f(byte[] bArr, int i10, InterfaceC1922f9 interfaceC1922f9, C2071p7 c2071p7) {
        C1842a9 c1842a9 = (C1842a9) interfaceC1922f9;
        int m8802j = m8802j(bArr, i10, c2071p7);
        int i11 = c2071p7.f7995a + m8802j;
        while (m8802j < i11) {
            m8802j = m8802j(bArr, m8802j, c2071p7);
            c1842a9.m8094j(c2071p7.f7995a);
        }
        if (m8802j == i11) {
            return m8802j;
        }
        throw C1968i9.m8531f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m8799g(byte[] bArr, int i10, C2071p7 c2071p7) {
        int m8802j = m8802j(bArr, i10, c2071p7);
        int i11 = c2071p7.f7995a;
        if (i11 >= 0) {
            if (i11 == 0) {
                c2071p7.f7997c = "";
                return m8802j;
            }
            c2071p7.f7997c = new String(bArr, m8802j, i11, AbstractC1938g9.f7766b);
            return m8802j + i11;
        }
        throw C1968i9.m8529d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static int m8800h(byte[] bArr, int i10, C2071p7 c2071p7) {
        int m8802j = m8802j(bArr, i10, c2071p7);
        int i11 = c2071p7.f7995a;
        if (i11 >= 0) {
            if (i11 == 0) {
                c2071p7.f7997c = "";
                return m8802j;
            }
            c2071p7.f7997c = AbstractC2000kb.m8606d(bArr, m8802j, i11);
            return m8802j + i11;
        }
        throw C1968i9.m8529d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m8801i(int i10, byte[] bArr, int i11, int i12, C2164va c2164va, C2071p7 c2071p7) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                c2164va.m9052h(i10, Integer.valueOf(m8794b(bArr, i11)));
                                return i11 + 4;
                            }
                            throw C1968i9.m8527b();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        C2164va m9047e = C2164va.m9047e();
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int m8802j = m8802j(bArr, i11, c2071p7);
                            int i16 = c2071p7.f7995a;
                            if (i16 == i14) {
                                i15 = i16;
                                i11 = m8802j;
                                break;
                            }
                            i15 = i16;
                            i11 = m8801i(i16, bArr, m8802j, i12, m9047e, c2071p7);
                        }
                        if (i11 <= i12 && i15 == i14) {
                            c2164va.m9052h(i10, m9047e);
                            return i11;
                        }
                        throw C1968i9.m8530e();
                    }
                    int m8802j2 = m8802j(bArr, i11, c2071p7);
                    int i17 = c2071p7.f7995a;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - m8802j2) {
                            if (i17 == 0) {
                                c2164va.m9052h(i10, AbstractC1873c8.f7691b);
                            } else {
                                c2164va.m9052h(i10, AbstractC1873c8.m8178u(bArr, m8802j2, i17));
                            }
                            return m8802j2 + i17;
                        }
                        throw C1968i9.m8531f();
                    }
                    throw C1968i9.m8529d();
                }
                c2164va.m9052h(i10, Long.valueOf(m8806n(bArr, i11)));
                return i11 + 8;
            }
            int m8805m = m8805m(bArr, i11, c2071p7);
            c2164va.m9052h(i10, Long.valueOf(c2071p7.f7996b));
            return m8805m;
        }
        throw C1968i9.m8527b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m8802j(byte[] bArr, int i10, C2071p7 c2071p7) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            c2071p7.f7995a = b10;
            return i11;
        }
        return m8803k(b10, bArr, i11, c2071p7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static int m8803k(int i10, byte[] bArr, int i11, C2071p7 c2071p7) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            c2071p7.f7995a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            c2071p7.f7995a = i14 | (b11 << C3373dn.f14524l);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c2071p7.f7995a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c2071p7.f7995a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                c2071p7.f7995a = i20;
                return i21;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static int m8804l(int i10, byte[] bArr, int i11, int i12, InterfaceC1922f9 interfaceC1922f9, C2071p7 c2071p7) {
        C1842a9 c1842a9 = (C1842a9) interfaceC1922f9;
        int m8802j = m8802j(bArr, i11, c2071p7);
        c1842a9.m8094j(c2071p7.f7995a);
        while (m8802j < i12) {
            int m8802j2 = m8802j(bArr, m8802j, c2071p7);
            if (i10 != c2071p7.f7995a) {
                break;
            }
            m8802j = m8802j(bArr, m8802j2, c2071p7);
            c1842a9.m8094j(c2071p7.f7995a);
        }
        return m8802j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m8805m(byte[] bArr, int i10, C2071p7 c2071p7) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            c2071p7.f7996b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        c2071p7.f7996b = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static long m8806n(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
