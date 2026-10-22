package p120ef;

import java.nio.ByteBuffer;
import p120ef.AbstractC4187b;
import p166hf.AbstractC4832l;
import p166hf.C4824d;
import p166hf.C4825e;
import p166hf.C4826f;
import p166hf.C4827g;
import p166hf.C4828h;
import p166hf.C4829i;
import p166hf.C4830j;
import p166hf.C4831k;
import p166hf.C4833m;
import p166hf.C4834n;
import p166hf.C4835o;

/* renamed from: ef.k */
/* loaded from: classes3.dex */
public class C4196k extends AbstractC4187b {

    /* renamed from: f */
    private static final AbstractC4832l f18354f = new C4834n();

    /* renamed from: g */
    private static final AbstractC4832l f18355g = new C4827g();

    /* renamed from: h */
    private static final AbstractC4832l f18356h = new C4829i();

    /* renamed from: i */
    private static final AbstractC4832l f18357i = new C4831k();

    /* renamed from: j */
    private static final AbstractC4832l f18358j = new C4826f();

    /* renamed from: k */
    private static final AbstractC4832l f18359k = new C4825e();

    /* renamed from: l */
    private static final AbstractC4832l f18360l = new C4830j();

    /* renamed from: m */
    private static final AbstractC4832l f18361m = new C4835o();

    /* renamed from: n */
    private static final AbstractC4832l f18362n = new C4828h();

    /* renamed from: o */
    private static final AbstractC4832l f18363o = new C4833m();

    /* renamed from: p */
    private static final AbstractC4832l f18364p = new C4824d();

    /* renamed from: a */
    private AbstractC4187b.a f18365a;

    /* renamed from: b */
    private AbstractC4187b[] f18366b;

    /* renamed from: c */
    private boolean[] f18367c = new boolean[13];

    /* renamed from: d */
    private int f18368d;

    /* renamed from: e */
    private int f18369e;

    public C4196k() {
        AbstractC4187b[] abstractC4187bArr = new AbstractC4187b[13];
        this.f18366b = abstractC4187bArr;
        abstractC4187bArr[0] = new C4198m(f18354f);
        this.f18366b[1] = new C4198m(f18355g);
        this.f18366b[2] = new C4198m(f18356h);
        this.f18366b[3] = new C4198m(f18357i);
        this.f18366b[4] = new C4198m(f18358j);
        this.f18366b[5] = new C4198m(f18359k);
        this.f18366b[6] = new C4198m(f18360l);
        this.f18366b[7] = new C4198m(f18361m);
        this.f18366b[8] = new C4198m(f18362n);
        this.f18366b[9] = new C4198m(f18363o);
        C4193h c4193h = new C4193h();
        AbstractC4187b[] abstractC4187bArr2 = this.f18366b;
        abstractC4187bArr2[10] = c4193h;
        AbstractC4832l abstractC4832l = f18364p;
        abstractC4187bArr2[11] = new C4198m(abstractC4832l, false, c4193h);
        this.f18366b[12] = new C4198m(abstractC4832l, true, c4193h);
        AbstractC4187b[] abstractC4187bArr3 = this.f18366b;
        c4193h.m17510l(abstractC4187bArr3[11], abstractC4187bArr3[12]);
        mo17503i();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: c */
    public String mo17499c() {
        if (this.f18368d == -1) {
            mo17500d();
            if (this.f18368d == -1) {
                this.f18368d = 0;
            }
        }
        return this.f18366b[this.f18368d].mo17499c();
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: d */
    public float mo17500d() {
        AbstractC4187b.a aVar = this.f18365a;
        if (aVar == AbstractC4187b.a.FOUND_IT) {
            return 0.99f;
        }
        if (aVar == AbstractC4187b.a.NOT_ME) {
            return 0.01f;
        }
        float f10 = 0.0f;
        int i10 = 0;
        while (true) {
            AbstractC4187b[] abstractC4187bArr = this.f18366b;
            if (i10 >= abstractC4187bArr.length) {
                return f10;
            }
            if (this.f18367c[i10]) {
                float mo17500d = abstractC4187bArr[i10].mo17500d();
                if (f10 < mo17500d) {
                    this.f18368d = i10;
                    f10 = mo17500d;
                }
            }
            i10++;
        }
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: e */
    public AbstractC4187b.a mo17501e() {
        return this.f18365a;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: f */
    public AbstractC4187b.a mo17502f(byte[] bArr, int i10, int i11) {
        AbstractC4187b.a aVar;
        ByteBuffer m17507b = m17507b(bArr, i10, i11);
        if (m17507b.position() != 0) {
            int i12 = 0;
            while (true) {
                AbstractC4187b[] abstractC4187bArr = this.f18366b;
                if (i12 >= abstractC4187bArr.length) {
                    break;
                }
                if (this.f18367c[i12]) {
                    AbstractC4187b.a mo17502f = abstractC4187bArr[i12].mo17502f(m17507b.array(), 0, m17507b.position());
                    aVar = AbstractC4187b.a.FOUND_IT;
                    if (mo17502f == aVar) {
                        this.f18368d = i12;
                        break;
                    }
                    aVar = AbstractC4187b.a.NOT_ME;
                    if (mo17502f == aVar) {
                        this.f18367c[i12] = false;
                        int i13 = this.f18369e - 1;
                        this.f18369e = i13;
                        if (i13 <= 0) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i12++;
            }
            this.f18365a = aVar;
        }
        return this.f18365a;
    }

    @Override // p120ef.AbstractC4187b
    /* renamed from: i */
    public void mo17503i() {
        int i10 = 0;
        this.f18369e = 0;
        while (true) {
            AbstractC4187b[] abstractC4187bArr = this.f18366b;
            if (i10 >= abstractC4187bArr.length) {
                this.f18368d = -1;
                this.f18365a = AbstractC4187b.a.DETECTING;
                return;
            } else {
                abstractC4187bArr[i10].mo17503i();
                this.f18367c[i10] = true;
                this.f18369e++;
                i10++;
            }
        }
    }
}
