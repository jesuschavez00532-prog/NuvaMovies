package p120ef;

import p120ef.AbstractC4187b;
import p166hf.AbstractC4832l;

/* renamed from: ef.m */
/* loaded from: classes3.dex */
public class C4198m extends AbstractC4187b {

    /* renamed from: a */
    private AbstractC4187b.a f18376a;

    /* renamed from: b */
    private AbstractC4832l f18377b;

    /* renamed from: c */
    private boolean f18378c;

    /* renamed from: d */
    private short f18379d;

    /* renamed from: e */
    private int f18380e;

    /* renamed from: f */
    private int[] f18381f;

    /* renamed from: g */
    private int f18382g;

    /* renamed from: h */
    private int f18383h;

    /* renamed from: i */
    private AbstractC4187b f18384i;

    public C4198m(AbstractC4832l abstractC4832l) {
        this.f18377b = abstractC4832l;
        this.f18378c = false;
        this.f18384i = null;
        this.f18381f = new int[4];
        mo17503i();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: c */
    public String mo17499c() {
        AbstractC4187b abstractC4187b = this.f18384i;
        return abstractC4187b == null ? this.f18377b.m19910a() : abstractC4187b.mo17499c();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: d */
    public float mo17500d() {
        int i10 = this.f18380e;
        if (i10 <= 0) {
            return 0.01f;
        }
        float m19913d = ((((this.f18381f[3] * 1.0f) / i10) / this.f18377b.m19913d()) * this.f18383h) / this.f18382g;
        if (m19913d >= 1.0f) {
            return 0.99f;
        }
        return m19913d;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: e */
    public AbstractC4187b.a mo17501e() {
        return this.f18376a;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: f */
    public AbstractC4187b.a mo17502f(byte[] bArr, int i10, int i11) {
        AbstractC4187b.a aVar = null;
        int i12 = i11 + i10;
        while (i10 < i12) {
            short m19911b = this.f18377b.m19911b(bArr[i10]);
            if (m19911b < 250) {
                this.f18382g++;
            }
            if (m19911b < 64) {
                this.f18383h++;
                short s10 = this.f18379d;
                if (s10 < 64) {
                    this.f18380e++;
                    if (this.f18378c) {
                        int[] iArr = this.f18381f;
                        byte m19912c = this.f18377b.m19912c((m19911b * 64) + s10);
                        iArr[m19912c] = iArr[m19912c] + 1;
                    } else {
                        int[] iArr2 = this.f18381f;
                        byte m19912c2 = this.f18377b.m19912c((s10 * 64) + m19911b);
                        iArr2[m19912c2] = iArr2[m19912c2] + 1;
                    }
                }
            }
            this.f18379d = m19911b;
            i10++;
        }
        if (this.f18376a == AbstractC4187b.a.DETECTING && this.f18380e > 1024) {
            float mo17500d = mo17500d();
            if (mo17500d > 0.95f) {
                aVar = AbstractC4187b.a.FOUND_IT;
            } else if (mo17500d < 0.05f) {
                aVar = AbstractC4187b.a.NOT_ME;
            }
            this.f18376a = aVar;
        }
        return this.f18376a;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: i */
    public void mo17503i() {
        this.f18376a = AbstractC4187b.a.DETECTING;
        this.f18379d = (short) 255;
        for (int i10 = 0; i10 < 4; i10++) {
            this.f18381f[i10] = 0;
        }
        this.f18380e = 0;
        this.f18382g = 0;
        this.f18383h = 0;
    }

    public C4198m(AbstractC4832l abstractC4832l, boolean z10, AbstractC4187b abstractC4187b) {
        this.f18377b = abstractC4832l;
        this.f18378c = z10;
        this.f18384i = abstractC4187b;
        this.f18381f = new int[4];
        mo17503i();
    }
}
