package p120ef;

import gf.C4448c;
import java.util.Arrays;
import p105df.AbstractC4102b;
import p120ef.AbstractC4187b;
import p137ff.C4314a;
import p181if.AbstractC4945m;
import p181if.C4934b;
import p181if.C4935c;

/* renamed from: ef.c */
/* loaded from: classes3.dex */
public class C4188c extends AbstractC4187b {

    /* renamed from: f */
    private static final AbstractC4945m f18309f = new C4935c();

    /* renamed from: b */
    private AbstractC4187b.a f18311b;

    /* renamed from: a */
    private C4934b f18310a = new C4934b(f18309f);

    /* renamed from: c */
    private C4314a f18312c = new C4314a();

    /* renamed from: d */
    private C4448c f18313d = new C4448c();

    /* renamed from: e */
    private byte[] f18314e = new byte[2];

    public C4188c() {
        mo17503i();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: c */
    public String mo17499c() {
        return AbstractC4102b.f18016i;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: d */
    public float mo17500d() {
        return Math.max(this.f18312c.m18096a(), this.f18313d.m18643a());
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: e */
    public AbstractC4187b.a mo17501e() {
        return this.f18311b;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: f */
    public AbstractC4187b.a mo17502f(byte[] bArr, int i10, int i11) {
        AbstractC4187b.a aVar;
        int i12 = i11 + i10;
        for (int i13 = i10; i13 < i12; i13++) {
            int m20271c = this.f18310a.m20271c(bArr[i13]);
            if (m20271c == 1) {
                aVar = AbstractC4187b.a.NOT_ME;
            } else if (m20271c == 2) {
                aVar = AbstractC4187b.a.FOUND_IT;
            } else {
                if (m20271c == 0) {
                    int m20270b = this.f18310a.m20270b();
                    if (i13 == i10) {
                        byte[] bArr2 = this.f18314e;
                        bArr2[1] = bArr[i10];
                        this.f18312c.m18098d(bArr2, 0, m20270b);
                        this.f18313d.m18645d(this.f18314e, 0, m20270b);
                    } else {
                        int i14 = i13 - 1;
                        this.f18312c.m18098d(bArr, i14, m20270b);
                        this.f18313d.m18645d(bArr, i14, m20270b);
                    }
                }
            }
            this.f18311b = aVar;
        }
        this.f18314e[0] = bArr[i12 - 1];
        if (this.f18311b == AbstractC4187b.a.DETECTING && this.f18312c.m18097c() && mo17500d() > 0.95f) {
            this.f18311b = AbstractC4187b.a.FOUND_IT;
        }
        return this.f18311b;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: i */
    public void mo17503i() {
        this.f18310a.m20272d();
        this.f18311b = AbstractC4187b.a.DETECTING;
        this.f18312c.m18099e();
        this.f18313d.m18646e();
        Arrays.fill(this.f18314e, (byte) 0);
    }
}
