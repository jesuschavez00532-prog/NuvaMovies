package com.umeng.message.proguard;

import com.umeng.analytics.pro.C3373dn;

/* renamed from: com.umeng.message.proguard.bf */
/* loaded from: classes3.dex */
public final class C3588bf extends AbstractC3589bg {

    /* renamed from: g */
    private static final byte[] f16057g = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: h */
    private static final byte[] f16058h = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, C3373dn.f14523k, C3373dn.f14524l, C3373dn.f14525m, C3373dn.f14526n, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* renamed from: l */
    private int f16062l;

    /* renamed from: k */
    private final int f16061k = 4;

    /* renamed from: j */
    private final int f16060j = 4 - 1;

    /* renamed from: i */
    private final byte[] f16059i = f16057g;

    /* renamed from: f */
    private static byte[] m15407f(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            C3588bf c3588bf = new C3588bf();
            long mo15411c = super.mo15411c(bArr);
            if (mo15411c <= 2147483647L) {
                return super.mo15412d(bArr);
            }
            throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + mo15411c + ") than the specified maximum size of 2147483647");
        }
        return bArr;
    }

    @Override // com.umeng.message.proguard.AbstractC3589bg
    /* renamed from: a */
    final void mo15408a(byte[] bArr, int i10, int i11) {
        if (this.f16066d) {
            return;
        }
        if (i11 >= 0) {
            int i12 = 0;
            while (i12 < i11) {
                m15416a(this.f16061k);
                int i13 = (this.f16068f + 1) % 3;
                this.f16068f = i13;
                int i14 = i10 + 1;
                int i15 = bArr[i10];
                if (i15 < 0) {
                    i15 += 256;
                }
                int i16 = (this.f16062l << 8) + i15;
                this.f16062l = i16;
                if (i13 == 0) {
                    byte[] bArr2 = this.f16064b;
                    int i17 = this.f16065c;
                    int i18 = i17 + 1;
                    byte[] bArr3 = this.f16059i;
                    bArr2[i17] = bArr3[(i16 >> 18) & 63];
                    int i19 = i18 + 1;
                    bArr2[i18] = bArr3[(i16 >> 12) & 63];
                    int i20 = i19 + 1;
                    bArr2[i19] = bArr3[(i16 >> 6) & 63];
                    this.f16065c = i20 + 1;
                    bArr2[i20] = bArr3[i16 & 63];
                    this.f16067e += 4;
                }
                i12++;
                i10 = i14;
            }
            return;
        }
        this.f16066d = true;
        if (this.f16068f == 0) {
            return;
        }
        m15416a(this.f16061k);
        int i21 = this.f16065c;
        int i22 = this.f16068f;
        if (i22 == 1) {
            byte[] bArr4 = this.f16064b;
            int i23 = i21 + 1;
            byte[] bArr5 = this.f16059i;
            int i24 = this.f16062l;
            bArr4[i21] = bArr5[(i24 >> 2) & 63];
            int i25 = i23 + 1;
            this.f16065c = i25;
            bArr4[i23] = bArr5[(i24 << 4) & 63];
            if (bArr5 == f16057g) {
                int i26 = i25 + 1;
                bArr4[i25] = 61;
                this.f16065c = i26 + 1;
                bArr4[i26] = 61;
            }
        } else if (i22 == 2) {
            byte[] bArr6 = this.f16064b;
            int i27 = i21 + 1;
            byte[] bArr7 = this.f16059i;
            int i28 = this.f16062l;
            bArr6[i21] = bArr7[(i28 >> 10) & 63];
            int i29 = i27 + 1;
            bArr6[i27] = bArr7[(i28 >> 4) & 63];
            int i30 = i29 + 1;
            this.f16065c = i30;
            bArr6[i29] = bArr7[(i28 << 2) & 63];
            if (bArr7 == f16057g) {
                this.f16065c = i30 + 1;
                bArr6[i30] = 61;
            }
        }
        this.f16067e += this.f16065c - i21;
    }

    @Override // com.umeng.message.proguard.AbstractC3589bg
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ byte[] mo15410b(String str) {
        return super.mo15410b(str);
    }

    @Override // com.umeng.message.proguard.AbstractC3589bg
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ long mo15411c(byte[] bArr) {
        return super.mo15411c(bArr);
    }

    @Override // com.umeng.message.proguard.AbstractC3589bg
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ byte[] mo15412d(byte[] bArr) {
        return super.mo15412d(bArr);
    }

    @Override // com.umeng.message.proguard.AbstractC3589bg
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ byte[] mo15413e(byte[] bArr) {
        return super.mo15413e(bArr);
    }

    @Override // com.umeng.message.proguard.AbstractC3589bg
    /* renamed from: b */
    final void mo15409b(byte[] bArr, int i10, int i11) {
        byte b10;
        if (this.f16066d) {
            return;
        }
        if (i11 < 0) {
            this.f16066d = true;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            m15416a(this.f16060j);
            int i13 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 == 61) {
                this.f16066d = true;
                break;
            }
            if (b11 >= 0) {
                byte[] bArr2 = f16058h;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i14 = (this.f16068f + 1) % 4;
                    this.f16068f = i14;
                    int i15 = (this.f16062l << 6) + b10;
                    this.f16062l = i15;
                    if (i14 == 0) {
                        byte[] bArr3 = this.f16064b;
                        int i16 = this.f16065c;
                        int i17 = i16 + 1;
                        bArr3[i16] = (byte) ((i15 >> 16) & 255);
                        int i18 = i17 + 1;
                        bArr3[i17] = (byte) ((i15 >> 8) & 255);
                        this.f16065c = i18 + 1;
                        bArr3[i18] = (byte) (i15 & 255);
                    }
                }
            }
            i12++;
            i10 = i13;
        }
        if (!this.f16066d || this.f16068f == 0) {
            return;
        }
        m15416a(this.f16060j);
        int i19 = this.f16068f;
        if (i19 == 2) {
            int i20 = this.f16062l >> 4;
            this.f16062l = i20;
            byte[] bArr4 = this.f16064b;
            int i21 = this.f16065c;
            this.f16065c = i21 + 1;
            bArr4[i21] = (byte) (i20 & 255);
            return;
        }
        if (i19 != 3) {
            return;
        }
        int i22 = this.f16062l >> 2;
        this.f16062l = i22;
        byte[] bArr5 = this.f16064b;
        int i23 = this.f16065c;
        int i24 = i23 + 1;
        bArr5[i23] = (byte) ((i22 >> 8) & 255);
        this.f16065c = i24 + 1;
        bArr5[i24] = (byte) (i22 & 255);
    }

    /* renamed from: b */
    public static byte[] m15406b(byte[] bArr) {
        return m15407f(bArr);
    }

    /* renamed from: a */
    public static String m15404a(byte[] bArr) {
        return new String(m15407f(bArr));
    }

    /* renamed from: a */
    public static byte[] m15405a(String str) {
        return super.mo15410b(str);
    }
}
