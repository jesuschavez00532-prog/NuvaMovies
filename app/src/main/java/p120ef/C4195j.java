package p120ef;

import p120ef.AbstractC4187b;

/* renamed from: ef.j */
/* loaded from: classes3.dex */
public class C4195j extends AbstractC4187b {

    /* renamed from: a */
    private AbstractC4187b.a f18349a;

    /* renamed from: b */
    private AbstractC4187b[] f18350b;

    /* renamed from: c */
    private boolean[] f18351c = new boolean[7];

    /* renamed from: d */
    private int f18352d;

    /* renamed from: e */
    private int f18353e;

    public C4195j() {
        AbstractC4187b[] abstractC4187bArr = new AbstractC4187b[7];
        this.f18350b = abstractC4187bArr;
        abstractC4187bArr[0] = new C4199n();
        this.f18350b[1] = new C4197l();
        this.f18350b[2] = new C4188c();
        this.f18350b[3] = new C4192g();
        this.f18350b[4] = new C4189d();
        this.f18350b[5] = new C4186a();
        this.f18350b[6] = new C4190e();
        mo17503i();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: c */
    public String mo17499c() {
        if (this.f18352d == -1) {
            mo17500d();
            if (this.f18352d == -1) {
                this.f18352d = 0;
            }
        }
        return this.f18350b[this.f18352d].mo17499c();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: d */
    public float mo17500d() {
        AbstractC4187b.a aVar = this.f18349a;
        if (aVar == AbstractC4187b.a.FOUND_IT) {
            return 0.99f;
        }
        if (aVar == AbstractC4187b.a.NOT_ME) {
            return 0.01f;
        }
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            AbstractC4187b[] abstractC4187bArr = this.f18350b;
            if (i10 >= abstractC4187bArr.length) {
                return f10;
            }
            if (this.f18351c[i10]) {
                float mo17500d = abstractC4187bArr[i10].mo17500d();
                if (f10 < mo17500d) {
                    this.f18352d = i10;
                    f10 = mo17500d;
                }
            }
            i10++;
        }
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: e */
    public AbstractC4187b.a mo17501e() {
        return this.f18349a;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: f */
    public AbstractC4187b.a mo17502f(byte[] bArr, int i10, int i11) {
        AbstractC4187b.a aVar;
        byte[] bArr2 = new byte[i11];
        int i12 = i11 + i10;
        boolean z10 = true;
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if ((b10 & 128) != 0) {
                bArr2[i13] = b10;
                i13++;
                z10 = true;
            } else if (z10) {
                bArr2[i13] = b10;
                i13++;
                z10 = false;
            }
            i10++;
        }
        int i14 = 0;
        while (true) {
            AbstractC4187b[] abstractC4187bArr = this.f18350b;
            if (i14 >= abstractC4187bArr.length) {
                break;
            }
            if (this.f18351c[i14]) {
                AbstractC4187b.a mo17502f = abstractC4187bArr[i14].mo17502f(bArr2, 0, i13);
                aVar = AbstractC4187b.a.FOUND_IT;
                if (mo17502f == aVar) {
                    this.f18352d = i14;
                    break;
                }
                aVar = AbstractC4187b.a.NOT_ME;
                if (mo17502f == aVar) {
                    this.f18351c[i14] = false;
                    int i15 = this.f18353e - 1;
                    this.f18353e = i15;
                    if (i15 <= 0) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i14++;
        }
        this.f18349a = aVar;
        return this.f18349a;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: i */
    public void mo17503i() {
        int i10 = 0;
        this.f18353e = 0;
        while (true) {
            AbstractC4187b[] abstractC4187bArr = this.f18350b;
            if (i10 >= abstractC4187bArr.length) {
                this.f18352d = -1;
                this.f18349a = AbstractC4187b.a.DETECTING;
                return;
            } else {
                abstractC4187bArr[i10].mo17503i();
                this.f18351c[i10] = true;
                this.f18353e++;
                i10++;
            }
        }
    }
}
