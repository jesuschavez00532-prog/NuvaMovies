package p214l;

/* renamed from: l.f */
/* loaded from: classes.dex */
public class C5308f implements Cloneable {

    /* renamed from: e */
    private static final Object f21599e = new Object();

    /* renamed from: a */
    private boolean f21600a;

    /* renamed from: b */
    private long[] f21601b;

    /* renamed from: c */
    private Object[] f21602c;

    /* renamed from: d */
    private int f21603d;

    public C5308f() {
        this(10);
    }

    /* renamed from: f */
    private void m21389f() {
        int i10 = this.f21603d;
        long[] jArr = this.f21601b;
        Object[] objArr = this.f21602c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f21599e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f21600a = false;
        this.f21603d = i11;
    }

    /* renamed from: a */
    public void m21390a(long j10, Object obj) {
        int i10 = this.f21603d;
        if (i10 != 0 && j10 <= this.f21601b[i10 - 1]) {
            m21399l(j10, obj);
            return;
        }
        if (this.f21600a && i10 >= this.f21601b.length) {
            m21389f();
        }
        int i11 = this.f21603d;
        if (i11 >= this.f21601b.length) {
            int m21388f = AbstractC5307e.m21388f(i11 + 1);
            long[] jArr = new long[m21388f];
            Object[] objArr = new Object[m21388f];
            long[] jArr2 = this.f21601b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f21602c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f21601b = jArr;
            this.f21602c = objArr;
        }
        this.f21601b[i11] = j10;
        this.f21602c[i11] = obj;
        this.f21603d = i11 + 1;
    }

    /* renamed from: b */
    public void m21391b() {
        int i10 = this.f21603d;
        Object[] objArr = this.f21602c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f21603d = 0;
        this.f21600a = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C5308f clone() {
        try {
            C5308f c5308f = (C5308f) super.clone();
            c5308f.f21601b = (long[]) this.f21601b.clone();
            c5308f.f21602c = (Object[]) this.f21602c.clone();
            return c5308f;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: e */
    public boolean m21393e(long j10) {
        if (m21396i(j10) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public Object m21394g(long j10) {
        return m21395h(j10, null);
    }

    /* renamed from: h */
    public Object m21395h(long j10, Object obj) {
        Object obj2;
        int m21384b = AbstractC5307e.m21384b(this.f21601b, this.f21603d, j10);
        if (m21384b >= 0 && (obj2 = this.f21602c[m21384b]) != f21599e) {
            return obj2;
        }
        return obj;
    }

    /* renamed from: i */
    public int m21396i(long j10) {
        if (this.f21600a) {
            m21389f();
        }
        return AbstractC5307e.m21384b(this.f21601b, this.f21603d, j10);
    }

    /* renamed from: j */
    public boolean m21397j() {
        if (m21402p() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public long m21398k(int i10) {
        if (this.f21600a) {
            m21389f();
        }
        return this.f21601b[i10];
    }

    /* renamed from: l */
    public void m21399l(long j10, Object obj) {
        int m21384b = AbstractC5307e.m21384b(this.f21601b, this.f21603d, j10);
        if (m21384b >= 0) {
            this.f21602c[m21384b] = obj;
            return;
        }
        int i10 = m21384b ^ (-1);
        int i11 = this.f21603d;
        if (i10 < i11) {
            Object[] objArr = this.f21602c;
            if (objArr[i10] == f21599e) {
                this.f21601b[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f21600a && i11 >= this.f21601b.length) {
            m21389f();
            i10 = AbstractC5307e.m21384b(this.f21601b, this.f21603d, j10) ^ (-1);
        }
        int i12 = this.f21603d;
        if (i12 >= this.f21601b.length) {
            int m21388f = AbstractC5307e.m21388f(i12 + 1);
            long[] jArr = new long[m21388f];
            Object[] objArr2 = new Object[m21388f];
            long[] jArr2 = this.f21601b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f21602c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f21601b = jArr;
            this.f21602c = objArr2;
        }
        int i13 = this.f21603d;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f21601b;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f21602c;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f21603d - i10);
        }
        this.f21601b[i10] = j10;
        this.f21602c[i10] = obj;
        this.f21603d++;
    }

    /* renamed from: m */
    public void m21400m(long j10) {
        int m21384b = AbstractC5307e.m21384b(this.f21601b, this.f21603d, j10);
        if (m21384b >= 0) {
            Object[] objArr = this.f21602c;
            Object obj = objArr[m21384b];
            Object obj2 = f21599e;
            if (obj != obj2) {
                objArr[m21384b] = obj2;
                this.f21600a = true;
            }
        }
    }

    /* renamed from: o */
    public void m21401o(int i10) {
        Object[] objArr = this.f21602c;
        Object obj = objArr[i10];
        Object obj2 = f21599e;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f21600a = true;
        }
    }

    /* renamed from: p */
    public int m21402p() {
        if (this.f21600a) {
            m21389f();
        }
        return this.f21603d;
    }

    /* renamed from: r */
    public Object m21403r(int i10) {
        if (this.f21600a) {
            m21389f();
        }
        return this.f21602c[i10];
    }

    public String toString() {
        if (m21402p() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f21603d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f21603d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m21398k(i10));
            sb2.append('=');
            Object m21403r = m21403r(i10);
            if (m21403r != this) {
                sb2.append(m21403r);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C5308f(int i10) {
        this.f21600a = false;
        if (i10 == 0) {
            this.f21601b = AbstractC5307e.f21597b;
            this.f21602c = AbstractC5307e.f21598c;
        } else {
            int m21388f = AbstractC5307e.m21388f(i10);
            this.f21601b = new long[m21388f];
            this.f21602c = new Object[m21388f];
        }
    }
}
