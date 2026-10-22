package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.du */
/* loaded from: classes3.dex */
public abstract class AbstractC3380du {
    /* renamed from: a */
    public abstract int mo14219a(byte[] bArr, int i10, int i11);

    /* renamed from: a */
    public void mo14225a(int i10) {
    }

    /* renamed from: a */
    public abstract boolean mo14220a();

    /* renamed from: b */
    public abstract void mo14221b();

    /* renamed from: b */
    public void m14232b(byte[] bArr) {
        mo14222b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public abstract void mo14222b(byte[] bArr, int i10, int i11);

    /* renamed from: c */
    public abstract void mo14223c();

    /* renamed from: d */
    public void mo14224d() {
    }

    /* renamed from: f */
    public byte[] mo14229f() {
        return null;
    }

    /* renamed from: g */
    public int mo14230g() {
        return 0;
    }

    /* renamed from: h */
    public int mo14231h() {
        return -1;
    }

    /* renamed from: i */
    public boolean m14234i() {
        return mo14220a();
    }

    /* renamed from: d */
    public int m14233d(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int mo14219a = mo14219a(bArr, i10 + i12, i11 - i12);
            if (mo14219a <= 0) {
                throw new C3381dv("Cannot read. Remote side has closed. Tried to read " + i11 + " bytes, but only got " + i12 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
            }
            i12 += mo14219a;
        }
        return i12;
    }
}
