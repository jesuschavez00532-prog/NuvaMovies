package p214l;

/* renamed from: l.d */
/* loaded from: classes.dex */
public final class C5306d {

    /* renamed from: a */
    private int[] f21592a;

    /* renamed from: b */
    private int f21593b;

    /* renamed from: c */
    private int f21594c;

    /* renamed from: d */
    private int f21595d;

    public C5306d() {
        this(8);
    }

    /* renamed from: c */
    private void m21376c() {
        int[] iArr = this.f21592a;
        int length = iArr.length;
        int i10 = this.f21593b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 >= 0) {
            int[] iArr2 = new int[i12];
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f21592a, 0, iArr2, i11, this.f21593b);
            this.f21592a = iArr2;
            this.f21593b = 0;
            this.f21594c = length;
            this.f21595d = i12 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: a */
    public void m21377a(int i10) {
        int[] iArr = this.f21592a;
        int i11 = this.f21594c;
        iArr[i11] = i10;
        int i12 = this.f21595d & (i11 + 1);
        this.f21594c = i12;
        if (i12 == this.f21593b) {
            m21376c();
        }
    }

    /* renamed from: b */
    public void m21378b() {
        this.f21594c = this.f21593b;
    }

    /* renamed from: d */
    public int m21379d(int i10) {
        if (i10 >= 0 && i10 < m21382g()) {
            return this.f21592a[this.f21595d & (this.f21593b + i10)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: e */
    public int m21380e() {
        int i10 = this.f21593b;
        int i11 = this.f21594c;
        if (i10 != i11) {
            return this.f21592a[(i11 - 1) & this.f21595d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: f */
    public int m21381f() {
        int i10 = this.f21593b;
        int i11 = this.f21594c;
        if (i10 != i11) {
            int i12 = this.f21595d & (i11 - 1);
            int i13 = this.f21592a[i12];
            this.f21594c = i12;
            return i13;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int m21382g() {
        return (this.f21594c - this.f21593b) & this.f21595d;
    }

    public C5306d(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i10 <= 1073741824) {
            i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
            this.f21595d = i10 - 1;
            this.f21592a = new int[i10];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }
}
