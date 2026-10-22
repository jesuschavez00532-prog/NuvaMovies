package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.ce */
/* loaded from: classes3.dex */
public class C3337ce {
    /* renamed from: a */
    public static final boolean m14041a(int i10, int i11) {
        return (i10 & (1 << i11)) != 0;
    }

    /* renamed from: b */
    public static final int m14045b(int i10, int i11) {
        return i10 & ((1 << i11) ^ (-1));
    }

    /* renamed from: a */
    public static final boolean m14042a(long j10, int i10) {
        return (j10 & (1 << i10)) != 0;
    }

    /* renamed from: b */
    public static final long m14046b(long j10, int i10) {
        return j10 & ((1 << i10) ^ (-1));
    }

    /* renamed from: a */
    public static final void m14038a(int i10, byte[] bArr) {
        m14039a(i10, bArr, 0);
    }

    /* renamed from: b */
    public static final byte m14044b(byte b10, int i10) {
        return (byte) m14045b((int) b10, i10);
    }

    /* renamed from: a */
    public static final void m14039a(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) ((i10 >> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
    }

    /* renamed from: b */
    public static final short m14047b(short s10, int i10) {
        return (short) m14045b((int) s10, i10);
    }

    /* renamed from: a */
    public static final int m14034a(byte[] bArr) {
        return m14035a(bArr, 0);
    }

    /* renamed from: a */
    public static final int m14035a(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    /* renamed from: a */
    public static final boolean m14040a(byte b10, int i10) {
        return m14041a((int) b10, i10);
    }

    /* renamed from: a */
    public static final boolean m14043a(short s10, int i10) {
        return m14041a((int) s10, i10);
    }

    /* renamed from: a */
    public static final byte m14032a(byte b10, int i10, boolean z10) {
        return (byte) m14033a((int) b10, i10, z10);
    }

    /* renamed from: a */
    public static final short m14037a(short s10, int i10, boolean z10) {
        return (short) m14033a((int) s10, i10, z10);
    }

    /* renamed from: a */
    public static final int m14033a(int i10, int i11, boolean z10) {
        return z10 ? i10 | (1 << i11) : m14045b(i10, i11);
    }

    /* renamed from: a */
    public static final long m14036a(long j10, int i10, boolean z10) {
        return z10 ? j10 | (1 << i10) : m14046b(j10, i10);
    }
}
