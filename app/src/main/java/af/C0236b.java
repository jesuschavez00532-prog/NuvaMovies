package af;

import ye.C7721o;

/* renamed from: af.b */
/* loaded from: classes3.dex */
public class C0236b extends AbstractC0235a {

    /* renamed from: d */
    private final C0239e[] f753d;

    public C0236b(Class cls, boolean z10, C0239e[] c0239eArr) {
        super(cls, null, z10);
        this.f753d = c0239eArr;
    }

    @Override // af.InterfaceC0237c
    /* renamed from: a */
    public synchronized C7721o[] mo886a() {
        C7721o[] c7721oArr;
        int length = this.f753d.length;
        c7721oArr = new C7721o[length];
        for (int i10 = 0; i10 < length; i10++) {
            C0239e c0239e = this.f753d[i10];
            c7721oArr[i10] = m885d(c0239e.f754a, c0239e.f756c, c0239e.f755b, c0239e.f757d, c0239e.f758e);
        }
        return c7721oArr;
    }
}
