package p181if;

/* renamed from: if.m */
/* loaded from: classes3.dex */
public abstract class AbstractC4945m {

    /* renamed from: a */
    protected C4943k f20552a;

    /* renamed from: b */
    protected int f20553b;

    /* renamed from: c */
    protected C4943k f20554c;

    /* renamed from: d */
    protected int[] f20555d;

    /* renamed from: e */
    protected String f20556e;

    public AbstractC4945m(C4943k c4943k, int i10, C4943k c4943k2, int[] iArr, String str) {
        this.f20552a = c4943k;
        this.f20553b = i10;
        this.f20554c = c4943k2;
        this.f20555d = iArr;
        this.f20556e = str;
    }

    /* renamed from: a */
    public int m20277a(int i10) {
        return this.f20555d[i10];
    }

    /* renamed from: b */
    public int m20278b(byte b10) {
        return this.f20552a.m20276d(b10 & 255);
    }

    /* renamed from: c */
    public String m20279c() {
        return this.f20556e;
    }

    /* renamed from: d */
    public int m20280d(int i10, int i11) {
        return this.f20554c.m20276d((i11 * this.f20553b) + i10);
    }
}
