package p373w;

/* renamed from: w.e */
/* loaded from: classes.dex */
public class C7340e implements InterfaceC7339d {

    /* renamed from: a */
    private final Object[] f27241a;

    /* renamed from: b */
    private int f27242b;

    public C7340e(int i10) {
        if (i10 > 0) {
            this.f27241a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m28320c(Object obj) {
        for (int i10 = 0; i10 < this.f27242b; i10++) {
            if (this.f27241a[i10] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // p373w.InterfaceC7339d
    /* renamed from: a */
    public boolean mo16817a(Object obj) {
        if (!m28320c(obj)) {
            int i10 = this.f27242b;
            Object[] objArr = this.f27241a;
            if (i10 < objArr.length) {
                objArr[i10] = obj;
                this.f27242b = i10 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // p373w.InterfaceC7339d
    /* renamed from: b */
    public Object mo16818b() {
        int i10 = this.f27242b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f27241a;
        Object obj = objArr[i11];
        objArr[i11] = null;
        this.f27242b = i10 - 1;
        return obj;
    }
}
