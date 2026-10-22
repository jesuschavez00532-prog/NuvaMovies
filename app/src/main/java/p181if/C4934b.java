package p181if;

/* renamed from: if.b */
/* loaded from: classes3.dex */
public class C4934b {

    /* renamed from: a */
    protected AbstractC4945m f20516a;

    /* renamed from: b */
    protected int f20517b = 0;

    /* renamed from: c */
    protected int f20518c;

    /* renamed from: d */
    protected int f20519d;

    public C4934b(AbstractC4945m abstractC4945m) {
        this.f20516a = abstractC4945m;
    }

    /* renamed from: a */
    public String m20269a() {
        return this.f20516a.m20279c();
    }

    /* renamed from: b */
    public int m20270b() {
        return this.f20518c;
    }

    /* renamed from: c */
    public int m20271c(byte b10) {
        int m20278b = this.f20516a.m20278b(b10);
        if (this.f20517b == 0) {
            this.f20519d = 0;
            this.f20518c = this.f20516a.m20277a(m20278b);
        }
        int m20280d = this.f20516a.m20280d(m20278b, this.f20517b);
        this.f20517b = m20280d;
        this.f20519d++;
        return m20280d;
    }

    /* renamed from: d */
    public void m20272d() {
        this.f20517b = 0;
    }
}
