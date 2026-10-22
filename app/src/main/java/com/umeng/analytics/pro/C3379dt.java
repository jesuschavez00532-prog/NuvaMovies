package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.dt */
/* loaded from: classes3.dex */
public final class C3379dt extends AbstractC3380du {

    /* renamed from: a */
    private byte[] f14529a;

    /* renamed from: b */
    private int f14530b;

    /* renamed from: c */
    private int f14531c;

    public C3379dt() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: a */
    public boolean mo14220a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: b */
    public void mo14221b() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: c */
    public void mo14223c() {
    }

    /* renamed from: e */
    public void m14228e() {
        this.f14529a = null;
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: f */
    public byte[] mo14229f() {
        return this.f14529a;
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: g */
    public int mo14230g() {
        return this.f14530b;
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: h */
    public int mo14231h() {
        return this.f14531c - this.f14530b;
    }

    public C3379dt(byte[] bArr) {
        m14226a(bArr);
    }

    /* renamed from: a */
    public void m14226a(byte[] bArr) {
        m14227c(bArr, 0, bArr.length);
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: b */
    public void mo14222b(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    /* renamed from: c */
    public void m14227c(byte[] bArr, int i10, int i11) {
        this.f14529a = bArr;
        this.f14530b = i10;
        this.f14531c = i10 + i11;
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: a */
    public int mo14219a(byte[] bArr, int i10, int i11) {
        int mo14231h = mo14231h();
        if (i11 > mo14231h) {
            i11 = mo14231h;
        }
        if (i11 > 0) {
            System.arraycopy(this.f14529a, this.f14530b, bArr, i10, i11);
            mo14225a(i11);
        }
        return i11;
    }

    public C3379dt(byte[] bArr, int i10, int i11) {
        m14227c(bArr, i10, i11);
    }

    @Override // com.umeng.analytics.pro.AbstractC3380du
    /* renamed from: a */
    public void mo14225a(int i10) {
        this.f14530b += i10;
    }
}
