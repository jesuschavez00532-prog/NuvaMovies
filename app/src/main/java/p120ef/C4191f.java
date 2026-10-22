package p120ef;

import p120ef.AbstractC4187b;
import p181if.C4934b;
import p181if.C4939g;
import p181if.C4940h;
import p181if.C4941i;
import p181if.C4942j;

/* renamed from: ef.f */
/* loaded from: classes3.dex */
public class C4191f extends AbstractC4187b {

    /* renamed from: e */
    private static final C4939g f18325e = new C4939g();

    /* renamed from: f */
    private static final C4940h f18326f = new C4940h();

    /* renamed from: g */
    private static final C4941i f18327g = new C4941i();

    /* renamed from: h */
    private static final C4942j f18328h = new C4942j();

    /* renamed from: a */
    private C4934b[] f18329a;

    /* renamed from: b */
    private int f18330b;

    /* renamed from: c */
    private AbstractC4187b.a f18331c;

    /* renamed from: d */
    private String f18332d;

    public C4191f() {
        C4934b[] c4934bArr = new C4934b[4];
        this.f18329a = c4934bArr;
        c4934bArr[0] = new C4934b(f18325e);
        this.f18329a[1] = new C4934b(f18326f);
        this.f18329a[2] = new C4934b(f18327g);
        this.f18329a[3] = new C4934b(f18328h);
        mo17503i();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: c */
    public String mo17499c() {
        return this.f18332d;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: d */
    public float mo17500d() {
        return 0.99f;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: e */
    public AbstractC4187b.a mo17501e() {
        return this.f18331c;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: f */
    public AbstractC4187b.a mo17502f(byte[] bArr, int i10, int i11) {
        int i12 = i11 + i10;
        while (i10 < i12 && this.f18331c == AbstractC4187b.a.DETECTING) {
            for (int i13 = this.f18330b - 1; i13 >= 0; i13--) {
                int m20271c = this.f18329a[i13].m20271c(bArr[i10]);
                if (m20271c == 1) {
                    int i14 = this.f18330b - 1;
                    this.f18330b = i14;
                    if (i14 <= 0) {
                        AbstractC4187b.a aVar = AbstractC4187b.a.NOT_ME;
                        this.f18331c = aVar;
                        return aVar;
                    }
                    if (i13 != i14) {
                        C4934b[] c4934bArr = this.f18329a;
                        C4934b c4934b = c4934bArr[i14];
                        c4934bArr[i14] = c4934bArr[i13];
                        c4934bArr[i13] = c4934b;
                    }
                } else if (m20271c == 2) {
                    this.f18331c = AbstractC4187b.a.FOUND_IT;
                    this.f18332d = this.f18329a[i13].m20269a();
                    return this.f18331c;
                }
            }
            i10++;
        }
        return this.f18331c;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: i */
    public void mo17503i() {
        this.f18331c = AbstractC4187b.a.DETECTING;
        int i10 = 0;
        while (true) {
            C4934b[] c4934bArr = this.f18329a;
            if (i10 >= c4934bArr.length) {
                this.f18330b = c4934bArr.length;
                this.f18332d = null;
                return;
            } else {
                c4934bArr[i10].m20272d();
                i10++;
            }
        }
    }
}
