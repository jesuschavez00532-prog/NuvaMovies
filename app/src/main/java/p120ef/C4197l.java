package p120ef;

import gf.C4453h;
import java.util.Arrays;
import p105df.AbstractC4102b;
import p120ef.AbstractC4187b;
import p137ff.C4316c;
import p181if.AbstractC4945m;
import p181if.C4934b;
import p181if.C4944l;

/* renamed from: ef.l */
/* loaded from: classes3.dex */
public class C4197l extends AbstractC4187b {

    /* renamed from: f */
    private static final AbstractC4945m f18370f = new C4944l();

    /* renamed from: b */
    private AbstractC4187b.a f18372b;

    /* renamed from: a */
    private C4934b f18371a = new C4934b(f18370f);

    /* renamed from: c */
    private C4316c f18373c = new C4316c();

    /* renamed from: d */
    private C4453h f18374d = new C4453h();

    /* renamed from: e */
    private byte[] f18375e = new byte[2];

    public C4197l() {
        mo17503i();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: c */
    public String mo17499c() {
        return AbstractC4102b.f18019l;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: d */
    public float mo17500d() {
        return Math.max(this.f18373c.m18096a(), this.f18374d.m18643a());
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: e */
    public AbstractC4187b.a mo17501e() {
        return this.f18372b;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: f */
    public AbstractC4187b.a mo17502f(byte[] bArr, int i10, int i11) {
        AbstractC4187b.a aVar;
        int i12 = i11 + i10;
        for (int i13 = i10; i13 < i12; i13++) {
            int m20271c = this.f18371a.m20271c(bArr[i13]);
            if (m20271c == 1) {
                aVar = AbstractC4187b.a.NOT_ME;
            } else if (m20271c == 2) {
                aVar = AbstractC4187b.a.FOUND_IT;
            } else {
                if (m20271c == 0) {
                    int m20270b = this.f18371a.m20270b();
                    if (i13 == i10) {
                        byte[] bArr2 = this.f18375e;
                        bArr2[1] = bArr[i10];
                        this.f18373c.m18098d(bArr2, 2 - m20270b, m20270b);
                        this.f18374d.m18645d(this.f18375e, 0, m20270b);
                    } else {
                        this.f18373c.m18098d(bArr, (i13 + 1) - m20270b, m20270b);
                        this.f18374d.m18645d(bArr, i13 - 1, m20270b);
                    }
                }
            }
            this.f18372b = aVar;
        }
        this.f18375e[0] = bArr[i12 - 1];
        if (this.f18372b == AbstractC4187b.a.DETECTING && this.f18373c.m18097c() && mo17500d() > 0.95f) {
            this.f18372b = AbstractC4187b.a.FOUND_IT;
        }
        return this.f18372b;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: i */
    public void mo17503i() {
        this.f18371a.m20272d();
        this.f18372b = AbstractC4187b.a.DETECTING;
        this.f18373c.m18099e();
        this.f18374d.m18646e();
        Arrays.fill(this.f18375e, (byte) 0);
    }
}
