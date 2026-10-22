package com.umeng.analytics.pro;

/* renamed from: com.umeng.analytics.pro.cf */
/* loaded from: classes3.dex */
public class C3338cf {

    /* renamed from: a */
    private short[] f14389a;

    /* renamed from: b */
    private int f14390b = -1;

    public C3338cf(int i10) {
        this.f14389a = new short[i10];
    }

    /* renamed from: d */
    private void m14048d() {
        short[] sArr = this.f14389a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f14389a = sArr2;
    }

    /* renamed from: a */
    public short m14049a() {
        short[] sArr = this.f14389a;
        int i10 = this.f14390b;
        this.f14390b = i10 - 1;
        return sArr[i10];
    }

    /* renamed from: b */
    public short m14051b() {
        return this.f14389a[this.f14390b];
    }

    /* renamed from: c */
    public void m14052c() {
        this.f14390b = -1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<ShortStack vector:[");
        for (int i10 = 0; i10 < this.f14389a.length; i10++) {
            if (i10 != 0) {
                sb2.append(" ");
            }
            if (i10 == this.f14390b) {
                sb2.append(">>");
            }
            sb2.append((int) this.f14389a[i10]);
            if (i10 == this.f14390b) {
                sb2.append("<<");
            }
        }
        sb2.append("]>");
        return sb2.toString();
    }

    /* renamed from: a */
    public void m14050a(short s10) {
        if (this.f14389a.length == this.f14390b + 1) {
            m14048d();
        }
        short[] sArr = this.f14389a;
        int i10 = this.f14390b + 1;
        this.f14390b = i10;
        sArr[i10] = s10;
    }
}
