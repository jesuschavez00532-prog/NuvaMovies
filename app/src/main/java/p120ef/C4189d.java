package p120ef;

import gf.C4449d;
import java.util.Arrays;
import p105df.AbstractC4102b;
import p120ef.AbstractC4187b;
import p181if.AbstractC4945m;
import p181if.C4934b;
import p181if.C4936d;

/* renamed from: ef.d */
/* loaded from: classes3.dex */
public class C4189d extends AbstractC4187b {

    /* renamed from: e */
    private static final AbstractC4945m f18315e = new C4936d();

    /* renamed from: b */
    private AbstractC4187b.a f18317b;

    /* renamed from: a */
    private C4934b f18316a = new C4934b(f18315e);

    /* renamed from: c */
    private C4449d f18318c = new C4449d();

    /* renamed from: d */
    private byte[] f18319d = new byte[2];

    public C4189d() {
        mo17503i();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: c */
    public String mo17499c() {
        return AbstractC4102b.f18017j;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: d */
    public float mo17500d() {
        return this.f18318c.m18643a();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: e */
    public AbstractC4187b.a mo17501e() {
        return this.f18317b;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: f */
    public AbstractC4187b.a mo17502f(byte[] bArr, int i10, int i11) {
        AbstractC4187b.a aVar;
        int i12 = i11 + i10;
        for (int i13 = i10; i13 < i12; i13++) {
            int m20271c = this.f18316a.m20271c(bArr[i13]);
            if (m20271c == 1) {
                aVar = AbstractC4187b.a.NOT_ME;
            } else if (m20271c == 2) {
                aVar = AbstractC4187b.a.FOUND_IT;
            } else {
                if (m20271c == 0) {
                    int m20270b = this.f18316a.m20270b();
                    if (i13 == i10) {
                        byte[] bArr2 = this.f18319d;
                        bArr2[1] = bArr[i10];
                        this.f18318c.m18645d(bArr2, 0, m20270b);
                    } else {
                        this.f18318c.m18645d(bArr, i13 - 1, m20270b);
                    }
                }
            }
            this.f18317b = aVar;
        }
        this.f18319d[0] = bArr[i12 - 1];
        if (this.f18317b == AbstractC4187b.a.DETECTING && this.f18318c.m18644c() && mo17500d() > 0.95f) {
            this.f18317b = AbstractC4187b.a.FOUND_IT;
        }
        return this.f18317b;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: i */
    public void mo17503i() {
        this.f18316a.m20272d();
        this.f18317b = AbstractC4187b.a.DETECTING;
        this.f18318c.m18646e();
        Arrays.fill(this.f18319d, (byte) 0);
    }
}
