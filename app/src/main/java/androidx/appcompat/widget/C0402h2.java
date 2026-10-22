package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.h2 */
/* loaded from: classes.dex */
class C0402h2 {

    /* renamed from: a */
    private int f1765a = 0;

    /* renamed from: b */
    private int f1766b = 0;

    /* renamed from: c */
    private int f1767c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1768d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1769e = 0;

    /* renamed from: f */
    private int f1770f = 0;

    /* renamed from: g */
    private boolean f1771g = false;

    /* renamed from: h */
    private boolean f1772h = false;

    /* renamed from: a */
    public int m1741a() {
        if (this.f1771g) {
            return this.f1765a;
        }
        return this.f1766b;
    }

    /* renamed from: b */
    public int m1742b() {
        return this.f1765a;
    }

    /* renamed from: c */
    public int m1743c() {
        return this.f1766b;
    }

    /* renamed from: d */
    public int m1744d() {
        if (this.f1771g) {
            return this.f1766b;
        }
        return this.f1765a;
    }

    /* renamed from: e */
    public void m1745e(int i10, int i11) {
        this.f1772h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1769e = i10;
            this.f1765a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1770f = i11;
            this.f1766b = i11;
        }
    }

    /* renamed from: f */
    public void m1746f(boolean z10) {
        if (z10 == this.f1771g) {
            return;
        }
        this.f1771g = z10;
        if (this.f1772h) {
            if (z10) {
                int i10 = this.f1768d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = this.f1769e;
                }
                this.f1765a = i10;
                int i11 = this.f1767c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = this.f1770f;
                }
                this.f1766b = i11;
                return;
            }
            int i12 = this.f1767c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = this.f1769e;
            }
            this.f1765a = i12;
            int i13 = this.f1768d;
            if (i13 == Integer.MIN_VALUE) {
                i13 = this.f1770f;
            }
            this.f1766b = i13;
            return;
        }
        this.f1765a = this.f1769e;
        this.f1766b = this.f1770f;
    }

    /* renamed from: g */
    public void m1747g(int i10, int i11) {
        this.f1767c = i10;
        this.f1768d = i11;
        this.f1772h = true;
        if (this.f1771g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1765a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1766b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1765a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1766b = i11;
        }
    }
}
