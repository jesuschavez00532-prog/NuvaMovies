package com.umeng.message.proguard;

/* renamed from: com.umeng.message.proguard.bg */
/* loaded from: classes3.dex */
abstract class AbstractC3589bg {

    /* renamed from: b */
    protected byte[] f16064b;

    /* renamed from: c */
    protected int f16065c;

    /* renamed from: d */
    protected boolean f16066d;

    /* renamed from: e */
    protected int f16067e;

    /* renamed from: f */
    protected int f16068f;

    /* renamed from: i */
    private int f16071i;

    /* renamed from: a */
    protected final byte f16063a = 61;

    /* renamed from: g */
    private final int f16069g = 3;

    /* renamed from: h */
    private final int f16070h = 4;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m15416a(int i10) {
        byte[] bArr = this.f16064b;
        if (bArr == null || bArr.length < this.f16065c + i10) {
            if (bArr == null) {
                this.f16064b = new byte[8192];
                this.f16065c = 0;
                this.f16071i = 0;
            } else {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f16064b = bArr2;
            }
        }
    }

    /* renamed from: a */
    abstract void mo15408a(byte[] bArr, int i10, int i11);

    /* renamed from: b */
    abstract void mo15409b(byte[] bArr, int i10, int i11);

    /* renamed from: b */
    public byte[] mo15410b(String str) {
        return mo15413e(str.getBytes());
    }

    /* renamed from: c */
    public long mo15411c(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f16069g;
        return (((length + i10) - 1) / i10) * this.f16070h;
    }

    /* renamed from: d */
    public byte[] mo15412d(byte[] bArr) {
        m15415a();
        if (bArr != null && bArr.length != 0) {
            mo15408a(bArr, 0, bArr.length);
            mo15408a(bArr, 0, -1);
            int i10 = this.f16065c - this.f16071i;
            byte[] bArr2 = new byte[i10];
            m15414a(bArr2, i10);
            return bArr2;
        }
        return bArr;
    }

    /* renamed from: e */
    public byte[] mo15413e(byte[] bArr) {
        m15415a();
        if (bArr != null && bArr.length != 0) {
            mo15409b(bArr, 0, bArr.length);
            mo15409b(bArr, 0, -1);
            int i10 = this.f16065c;
            byte[] bArr2 = new byte[i10];
            m15414a(bArr2, i10);
            return bArr2;
        }
        return bArr;
    }

    /* renamed from: a */
    private int m15414a(byte[] bArr, int i10) {
        byte[] bArr2 = this.f16064b;
        if (bArr2 == null) {
            return this.f16066d ? -1 : 0;
        }
        int min = Math.min(bArr2 != null ? this.f16065c - this.f16071i : 0, i10);
        System.arraycopy(this.f16064b, this.f16071i, bArr, 0, min);
        int i11 = this.f16071i + min;
        this.f16071i = i11;
        if (i11 >= this.f16065c) {
            this.f16064b = null;
        }
        return min;
    }

    /* renamed from: a */
    private void m15415a() {
        this.f16064b = null;
        this.f16065c = 0;
        this.f16071i = 0;
        this.f16067e = 0;
        this.f16068f = 0;
        this.f16066d = false;
    }
}
