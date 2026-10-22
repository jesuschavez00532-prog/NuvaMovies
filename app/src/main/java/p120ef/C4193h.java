package p120ef;

import p105df.AbstractC4102b;
import p120ef.AbstractC4187b;

/* renamed from: ef.h */
/* loaded from: classes3.dex */
public class C4193h extends AbstractC4187b {

    /* renamed from: a */
    private int f18338a;

    /* renamed from: b */
    private int f18339b;

    /* renamed from: c */
    private byte f18340c;

    /* renamed from: d */
    private byte f18341d;

    /* renamed from: e */
    private AbstractC4187b f18342e = null;

    /* renamed from: f */
    private AbstractC4187b f18343f = null;

    public C4193h() {
        mo17503i();
    }

    /* renamed from: j */
    protected static boolean m17508j(byte b10) {
        int i10 = b10 & 255;
        return i10 == 234 || i10 == 237 || i10 == 239 || i10 == 243 || i10 == 245;
    }

    /* renamed from: k */
    protected static boolean m17509k(byte b10) {
        int i10 = b10 & 255;
        return i10 == 235 || i10 == 238 || i10 == 240 || i10 == 244;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: c */
    public String mo17499c() {
        int i10 = this.f18338a - this.f18339b;
        if (i10 >= 5) {
            return AbstractC4102b.f18027t;
        }
        if (i10 <= -5) {
            return AbstractC4102b.f18013f;
        }
        float mo17500d = this.f18342e.mo17500d() - this.f18343f.mo17500d();
        if (mo17500d > 0.01f) {
            return AbstractC4102b.f18027t;
        }
        if (mo17500d >= -0.01f && i10 >= 0) {
            return AbstractC4102b.f18027t;
        }
        return AbstractC4102b.f18013f;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: d */
    public float mo17500d() {
        return 0.0f;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: e */
    public AbstractC4187b.a mo17501e() {
        AbstractC4187b.a mo17501e = this.f18342e.mo17501e();
        AbstractC4187b.a aVar = AbstractC4187b.a.NOT_ME;
        return (mo17501e == aVar && this.f18343f.mo17501e() == aVar) ? aVar : AbstractC4187b.a.DETECTING;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: f */
    public AbstractC4187b.a mo17502f(byte[] bArr, int i10, int i11) {
        AbstractC4187b.a mo17501e = mo17501e();
        AbstractC4187b.a aVar = AbstractC4187b.a.NOT_ME;
        if (mo17501e == aVar) {
            return aVar;
        }
        int i12 = i11 + i10;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            byte b11 = this.f18341d;
            if (b10 == 32) {
                if (b11 != 32) {
                    if (m17508j(this.f18340c)) {
                        this.f18338a++;
                    } else {
                        if (!m17509k(this.f18340c)) {
                        }
                        this.f18339b++;
                    }
                }
            } else if (b11 == 32) {
                if (m17508j(this.f18340c)) {
                    if (b10 == 32) {
                    }
                    this.f18339b++;
                }
            }
            this.f18341d = this.f18340c;
            this.f18340c = b10;
            i10++;
        }
        return AbstractC4187b.a.DETECTING;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: i */
    public void mo17503i() {
        this.f18338a = 0;
        this.f18339b = 0;
        this.f18340c = (byte) 32;
        this.f18341d = (byte) 32;
    }

    /* renamed from: l */
    public void m17510l(AbstractC4187b abstractC4187b, AbstractC4187b abstractC4187b2) {
        this.f18342e = abstractC4187b;
        this.f18343f = abstractC4187b2;
    }
}
