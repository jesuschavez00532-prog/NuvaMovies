package gf;

/* renamed from: gf.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4447b {

    /* renamed from: a */
    private int f19264a;

    /* renamed from: b */
    private int f19265b;

    /* renamed from: c */
    protected int[] f19266c;

    /* renamed from: d */
    protected float f19267d;

    /* renamed from: e */
    protected boolean f19268e;

    public AbstractC4447b() {
        m18646e();
    }

    /* renamed from: a */
    public float m18643a() {
        int i10;
        int i11 = this.f19265b;
        if (i11 <= 0 || (i10 = this.f19264a) <= 4) {
            return 0.01f;
        }
        if (i11 != i10) {
            float f10 = (i10 / (i11 - i10)) * this.f19267d;
            if (f10 < 0.99f) {
                return f10;
            }
        }
        return 0.99f;
    }

    /* renamed from: b */
    protected abstract int mo18642b(byte[] bArr, int i10);

    /* renamed from: c */
    public boolean m18644c() {
        return this.f19265b > 1024;
    }

    /* renamed from: d */
    public void m18645d(byte[] bArr, int i10, int i11) {
        int mo18642b = i11 == 2 ? mo18642b(bArr, i10) : -1;
        if (mo18642b >= 0) {
            this.f19265b++;
            int[] iArr = this.f19266c;
            if (mo18642b >= iArr.length || 512 <= iArr[mo18642b]) {
                return;
            }
            this.f19264a++;
        }
    }

    /* renamed from: e */
    public void m18646e() {
        this.f19268e = false;
        this.f19265b = 0;
        this.f19264a = 0;
    }
}
