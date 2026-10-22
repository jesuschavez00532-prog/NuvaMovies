package p120ef;

import p105df.AbstractC4102b;
import p120ef.AbstractC4187b;
import p181if.AbstractC4945m;
import p181if.C4934b;
import p181if.C4946n;

/* renamed from: ef.n */
/* loaded from: classes3.dex */
public class C4199n extends AbstractC4187b {

    /* renamed from: d */
    private static final AbstractC4945m f18385d = new C4946n();

    /* renamed from: b */
    private AbstractC4187b.a f18387b;

    /* renamed from: c */
    private int f18388c = 0;

    /* renamed from: a */
    private C4934b f18386a = new C4934b(f18385d);

    public C4199n() {
        mo17503i();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: c */
    public String mo17499c() {
        return AbstractC4102b.f18028u;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: d */
    public float mo17500d() {
        float f10 = 0.99f;
        if (this.f18388c >= 6) {
            return 0.99f;
        }
        for (int i10 = 0; i10 < this.f18388c; i10++) {
            f10 *= 0.5f;
        }
        return 1.0f - f10;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: e */
    public AbstractC4187b.a mo17501e() {
        return this.f18387b;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: f */
    public AbstractC4187b.a mo17502f(byte[] bArr, int i10, int i11) {
        AbstractC4187b.a aVar;
        int i12 = i11 + i10;
        while (i10 < i12) {
            int m20271c = this.f18386a.m20271c(bArr[i10]);
            if (m20271c == 1) {
                aVar = AbstractC4187b.a.NOT_ME;
            } else if (m20271c == 2) {
                aVar = AbstractC4187b.a.FOUND_IT;
            } else {
                if (m20271c == 0 && this.f18386a.m20270b() >= 2) {
                    this.f18388c++;
                }
                i10++;
            }
            this.f18387b = aVar;
            break;
        }
        if (this.f18387b == AbstractC4187b.a.DETECTING && mo17500d() > 0.95f) {
            this.f18387b = AbstractC4187b.a.FOUND_IT;
        }
        return this.f18387b;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: i */
    public void mo17503i() {
        this.f18386a.m20272d();
        this.f18388c = 0;
        this.f18387b = AbstractC4187b.a.DETECTING;
    }
}
