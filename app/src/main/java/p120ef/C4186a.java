package p120ef;

import gf.C4446a;
import java.util.Arrays;
import p105df.AbstractC4102b;
import p120ef.AbstractC4187b;
import p181if.AbstractC4945m;
import p181if.C4933a;
import p181if.C4934b;

/* renamed from: ef.a */
/* loaded from: classes3.dex */
public class C4186a extends AbstractC4187b {

    /* renamed from: e */
    private static final AbstractC4945m f18300e = new C4933a();

    /* renamed from: b */
    private AbstractC4187b.a f18302b;

    /* renamed from: a */
    private C4934b f18301a = new C4934b(f18300e);

    /* renamed from: c */
    private C4446a f18303c = new C4446a();

    /* renamed from: d */
    private byte[] f18304d = new byte[2];

    public C4186a() {
        mo17503i();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: c */
    public String mo17499c() {
        return AbstractC4102b.f18014g;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: d */
    public float mo17500d() {
        return this.f18303c.m18643a();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: e */
    public AbstractC4187b.a mo17501e() {
        return this.f18302b;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: f */
    public AbstractC4187b.a mo17502f(byte[] bArr, int i10, int i11) {
        AbstractC4187b.a aVar;
        int i12 = i11 + i10;
        for (int i13 = i10; i13 < i12; i13++) {
            int m20271c = this.f18301a.m20271c(bArr[i13]);
            if (m20271c == 1) {
                aVar = AbstractC4187b.a.NOT_ME;
            } else if (m20271c == 2) {
                aVar = AbstractC4187b.a.FOUND_IT;
            } else {
                if (m20271c == 0) {
                    int m20270b = this.f18301a.m20270b();
                    if (i13 == i10) {
                        byte[] bArr2 = this.f18304d;
                        bArr2[1] = bArr[i10];
                        this.f18303c.m18645d(bArr2, 0, m20270b);
                    } else {
                        this.f18303c.m18645d(bArr, i13 - 1, m20270b);
                    }
                }
            }
            this.f18302b = aVar;
        }
        this.f18304d[0] = bArr[i12 - 1];
        if (this.f18302b == AbstractC4187b.a.DETECTING && this.f18303c.m18644c() && mo17500d() > 0.95f) {
            this.f18302b = AbstractC4187b.a.FOUND_IT;
        }
        return this.f18302b;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: i */
    public void mo17503i() {
        this.f18301a.m20272d();
        this.f18302b = AbstractC4187b.a.DETECTING;
        this.f18303c.m18646e();
        Arrays.fill(this.f18304d, (byte) 0);
    }
}
