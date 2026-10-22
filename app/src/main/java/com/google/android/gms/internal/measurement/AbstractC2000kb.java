package com.google.android.gms.internal.measurement;

import com.umeng.analytics.pro.C3373dn;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.kb */
/* loaded from: classes.dex */
public abstract class AbstractC2000kb {

    /* renamed from: a */
    private static final AbstractC1940gb f7856a;

    static {
        if (AbstractC1908eb.m8296C() && AbstractC1908eb.m8297D()) {
            int i10 = AbstractC2056o7.f7980a;
        }
        f7856a = new C1970ib();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ int m8603a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    byte b11 = bArr[i10];
                    byte b12 = bArr[i10 + 1];
                    if (b10 <= -12 && b11 <= -65 && b12 <= -65) {
                        return ((b11 << 8) ^ b10) ^ (b12 << C3373dn.f14526n);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                byte b13 = bArr[i10];
                if (b10 <= -12 && b13 <= -65) {
                    return b10 ^ (b13 << 8);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        return r9 + r0;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m8604b(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC2000kb.m8604b(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m8605c(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new C1985jb(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + IjkMediaMeta.AV_CH_WIDE_RIGHT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m8606d(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        if ((i10 | i11 | ((length - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!AbstractC1924fb.m8395d(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            while (i10 < i12) {
                int i14 = i10 + 1;
                byte b11 = bArr[i10];
                if (AbstractC1924fb.m8395d(b11)) {
                    int i15 = i13 + 1;
                    cArr[i13] = (char) b11;
                    i10 = i14;
                    while (true) {
                        i13 = i15;
                        if (i10 < i12) {
                            byte b12 = bArr[i10];
                            if (!AbstractC1924fb.m8395d(b12)) {
                                break;
                            }
                            i10++;
                            i15 = i13 + 1;
                            cArr[i13] = (char) b12;
                        }
                    }
                } else if (b11 < -32) {
                    if (i14 < i12) {
                        AbstractC1924fb.m8394c(b11, bArr[i14], cArr, i13);
                        i10 = i14 + 1;
                        i13++;
                    } else {
                        throw C1968i9.m8528c();
                    }
                } else if (b11 < -16) {
                    if (i14 < i12 - 1) {
                        int i16 = i14 + 1;
                        AbstractC1924fb.m8393b(b11, bArr[i14], bArr[i16], cArr, i13);
                        i10 = i16 + 1;
                        i13++;
                    } else {
                        throw C1968i9.m8528c();
                    }
                } else if (i14 < i12 - 2) {
                    int i17 = i14 + 1;
                    int i18 = i17 + 1;
                    AbstractC1924fb.m8392a(b11, bArr[i14], bArr[i17], bArr[i18], cArr, i13);
                    i13 += 2;
                    i10 = i18 + 1;
                } else {
                    throw C1968i9.m8528c();
                }
            }
            return new String(cArr, 0, i13);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m8607e(byte[] bArr) {
        return f7856a.m8470b(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m8608f(byte[] bArr, int i10, int i11) {
        return f7856a.m8470b(bArr, i10, i11);
    }
}
