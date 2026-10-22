package p214l;

/* renamed from: l.j */
/* loaded from: classes.dex */
public class C5312j implements Cloneable {

    /* renamed from: e */
    private static final Object f21634e = new Object();

    /* renamed from: a */
    private boolean f21635a;

    /* renamed from: b */
    private int[] f21636b;

    /* renamed from: c */
    private Object[] f21637c;

    /* renamed from: d */
    private int f21638d;

    public C5312j() {
        this(10);
    }

    /* renamed from: e */
    private void m21436e() {
        int i10 = this.f21638d;
        int[] iArr = this.f21636b;
        Object[] objArr = this.f21637c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f21634e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f21635a = false;
        this.f21638d = i11;
    }

    /* renamed from: a */
    public void m21437a(int i10, Object obj) {
        int i11 = this.f21638d;
        if (i11 != 0 && i10 <= this.f21636b[i11 - 1]) {
            m21444j(i10, obj);
            return;
        }
        if (this.f21635a && i11 >= this.f21636b.length) {
            m21436e();
        }
        int i12 = this.f21638d;
        if (i12 >= this.f21636b.length) {
            int m21387e = AbstractC5307e.m21387e(i12 + 1);
            int[] iArr = new int[m21387e];
            Object[] objArr = new Object[m21387e];
            int[] iArr2 = this.f21636b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f21637c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f21636b = iArr;
            this.f21637c = objArr;
        }
        this.f21636b[i12] = i10;
        this.f21637c[i12] = obj;
        this.f21638d = i12 + 1;
    }

    /* renamed from: b */
    public void m21438b() {
        int i10 = this.f21638d;
        Object[] objArr = this.f21637c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f21638d = 0;
        this.f21635a = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C5312j clone() {
        try {
            C5312j c5312j = (C5312j) super.clone();
            c5312j.f21636b = (int[]) this.f21636b.clone();
            c5312j.f21637c = (Object[]) this.f21637c.clone();
            return c5312j;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: f */
    public Object m21440f(int i10) {
        return m21441g(i10, null);
    }

    /* renamed from: g */
    public Object m21441g(int i10, Object obj) {
        Object obj2;
        int m21383a = AbstractC5307e.m21383a(this.f21636b, this.f21638d, i10);
        if (m21383a >= 0 && (obj2 = this.f21637c[m21383a]) != f21634e) {
            return obj2;
        }
        return obj;
    }

    /* renamed from: h */
    public int m21442h(Object obj) {
        if (this.f21635a) {
            m21436e();
        }
        for (int i10 = 0; i10 < this.f21638d; i10++) {
            if (this.f21637c[i10] == obj) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public int m21443i(int i10) {
        if (this.f21635a) {
            m21436e();
        }
        return this.f21636b[i10];
    }

    /* renamed from: j */
    public void m21444j(int i10, Object obj) {
        int m21383a = AbstractC5307e.m21383a(this.f21636b, this.f21638d, i10);
        if (m21383a >= 0) {
            this.f21637c[m21383a] = obj;
            return;
        }
        int i11 = m21383a ^ (-1);
        int i12 = this.f21638d;
        if (i11 < i12) {
            Object[] objArr = this.f21637c;
            if (objArr[i11] == f21634e) {
                this.f21636b[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f21635a && i12 >= this.f21636b.length) {
            m21436e();
            i11 = AbstractC5307e.m21383a(this.f21636b, this.f21638d, i10) ^ (-1);
        }
        int i13 = this.f21638d;
        if (i13 >= this.f21636b.length) {
            int m21387e = AbstractC5307e.m21387e(i13 + 1);
            int[] iArr = new int[m21387e];
            Object[] objArr2 = new Object[m21387e];
            int[] iArr2 = this.f21636b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f21637c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f21636b = iArr;
            this.f21637c = objArr2;
        }
        int i14 = this.f21638d;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f21636b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f21637c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f21638d - i11);
        }
        this.f21636b[i11] = i10;
        this.f21637c[i11] = obj;
        this.f21638d++;
    }

    /* renamed from: k */
    public int m21445k() {
        if (this.f21635a) {
            m21436e();
        }
        return this.f21638d;
    }

    /* renamed from: l */
    public Object m21446l(int i10) {
        if (this.f21635a) {
            m21436e();
        }
        return this.f21637c[i10];
    }

    public String toString() {
        if (m21445k() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f21638d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f21638d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m21443i(i10));
            sb2.append('=');
            Object m21446l = m21446l(i10);
            if (m21446l != this) {
                sb2.append(m21446l);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C5312j(int i10) {
        this.f21635a = false;
        if (i10 == 0) {
            this.f21636b = AbstractC5307e.f21596a;
            this.f21637c = AbstractC5307e.f21598c;
        } else {
            int m21387e = AbstractC5307e.m21387e(i10);
            this.f21636b = new int[m21387e];
            this.f21637c = new Object[m21387e];
        }
    }
}
