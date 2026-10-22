package p214l;

/* renamed from: l.c */
/* loaded from: classes.dex */
public final class C5305c {

    /* renamed from: a */
    private Object[] f21588a;

    /* renamed from: b */
    private int f21589b;

    /* renamed from: c */
    private int f21590c;

    /* renamed from: d */
    private int f21591d;

    public C5305c(int i10) {
        if (i10 >= 1) {
            if (i10 <= 1073741824) {
                i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
                this.f21591d = i10 - 1;
                this.f21588a = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        throw new IllegalArgumentException("capacity must be >= 1");
    }

    /* renamed from: d */
    private void m21368d() {
        Object[] objArr = this.f21588a;
        int length = objArr.length;
        int i10 = this.f21589b;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 >= 0) {
            Object[] objArr2 = new Object[i12];
            System.arraycopy(objArr, i10, objArr2, 0, i11);
            System.arraycopy(this.f21588a, 0, objArr2, i11, this.f21589b);
            this.f21588a = objArr2;
            this.f21589b = 0;
            this.f21590c = length;
            this.f21591d = i12 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: a */
    public void m21369a(Object obj) {
        int i10 = (this.f21589b - 1) & this.f21591d;
        this.f21589b = i10;
        this.f21588a[i10] = obj;
        if (i10 == this.f21590c) {
            m21368d();
        }
    }

    /* renamed from: b */
    public void m21370b(Object obj) {
        Object[] objArr = this.f21588a;
        int i10 = this.f21590c;
        objArr[i10] = obj;
        int i11 = this.f21591d & (i10 + 1);
        this.f21590c = i11;
        if (i11 == this.f21589b) {
            m21368d();
        }
    }

    /* renamed from: c */
    public void m21371c() {
        m21374g(m21375h());
    }

    /* renamed from: e */
    public Object m21372e(int i10) {
        if (i10 >= 0 && i10 < m21375h()) {
            return this.f21588a[this.f21591d & (this.f21589b + i10)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: f */
    public void m21373f(int i10) {
        int i11;
        int i12;
        if (i10 <= 0) {
            return;
        }
        if (i10 <= m21375h()) {
            int i13 = this.f21590c;
            if (i10 < i13) {
                i11 = i13 - i10;
            } else {
                i11 = 0;
            }
            int i14 = i11;
            while (true) {
                i12 = this.f21590c;
                if (i14 >= i12) {
                    break;
                }
                this.f21588a[i14] = null;
                i14++;
            }
            int i15 = i12 - i11;
            int i16 = i10 - i15;
            this.f21590c = i12 - i15;
            if (i16 > 0) {
                int length = this.f21588a.length;
                this.f21590c = length;
                int i17 = length - i16;
                for (int i18 = i17; i18 < this.f21590c; i18++) {
                    this.f21588a[i18] = null;
                }
                this.f21590c = i17;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: g */
    public void m21374g(int i10) {
        if (i10 <= 0) {
            return;
        }
        if (i10 <= m21375h()) {
            int length = this.f21588a.length;
            int i11 = this.f21589b;
            if (i10 < length - i11) {
                length = i11 + i10;
            }
            while (i11 < length) {
                this.f21588a[i11] = null;
                i11++;
            }
            int i12 = this.f21589b;
            int i13 = length - i12;
            int i14 = i10 - i13;
            this.f21589b = this.f21591d & (i12 + i13);
            if (i14 > 0) {
                for (int i15 = 0; i15 < i14; i15++) {
                    this.f21588a[i15] = null;
                }
                this.f21589b = i14;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: h */
    public int m21375h() {
        return (this.f21590c - this.f21589b) & this.f21591d;
    }
}
