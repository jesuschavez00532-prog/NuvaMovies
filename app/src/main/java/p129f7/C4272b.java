package p129f7;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f7.b */
/* loaded from: classes.dex */
public final class C4272b {

    /* renamed from: a */
    private final C4271a f18613a;

    /* renamed from: b */
    private final int[] f18614b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4272b(C4271a c4271a, int[] iArr) {
        if (iArr.length != 0) {
            this.f18613a = c4271a;
            int length = iArr.length;
            int i10 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i10 < length && iArr[i10] == 0) {
                    i10++;
                }
                if (i10 == length) {
                    this.f18614b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i10];
                this.f18614b = iArr2;
                System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
                return;
            }
            this.f18614b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    C4272b m17814a(C4272b c4272b) {
        if (this.f18613a.equals(c4272b.f18613a)) {
            if (m17819f()) {
                return c4272b;
            }
            if (c4272b.m17819f()) {
                return this;
            }
            int[] iArr = this.f18614b;
            int[] iArr2 = c4272b.f18614b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr3[i10] = C4271a.m17806a(iArr2[i10 - length], iArr[i10]);
            }
            return new C4272b(this.f18613a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C4272b[] m17815b(C4272b c4272b) {
        if (this.f18613a.equals(c4272b.f18613a)) {
            if (!c4272b.m17819f()) {
                C4272b m17810e = this.f18613a.m17810e();
                int m17811f = this.f18613a.m17811f(c4272b.m17816c(c4272b.m17818e()));
                C4272b c4272b2 = this;
                while (c4272b2.m17818e() >= c4272b.m17818e() && !c4272b2.m17819f()) {
                    int m17818e = c4272b2.m17818e() - c4272b.m17818e();
                    int m17813h = this.f18613a.m17813h(c4272b2.m17816c(c4272b2.m17818e()), m17811f);
                    C4272b m17821h = c4272b.m17821h(m17818e, m17813h);
                    m17810e = m17810e.m17814a(this.f18613a.m17807b(m17818e, m17813h));
                    c4272b2 = c4272b2.m17814a(m17821h);
                }
                return new C4272b[]{m17810e, c4272b2};
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: c */
    int m17816c(int i10) {
        return this.f18614b[(r0.length - 1) - i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int[] m17817d() {
        return this.f18614b;
    }

    /* renamed from: e */
    int m17818e() {
        return this.f18614b.length - 1;
    }

    /* renamed from: f */
    boolean m17819f() {
        if (this.f18614b[0] != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C4272b m17820g(C4272b c4272b) {
        if (this.f18613a.equals(c4272b.f18613a)) {
            if (!m17819f() && !c4272b.m17819f()) {
                int[] iArr = this.f18614b;
                int length = iArr.length;
                int[] iArr2 = c4272b.f18614b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = iArr[i10];
                    for (int i12 = 0; i12 < length2; i12++) {
                        int i13 = i10 + i12;
                        iArr3[i13] = C4271a.m17806a(iArr3[i13], this.f18613a.m17813h(i11, iArr2[i12]));
                    }
                }
                return new C4272b(this.f18613a, iArr3);
            }
            return this.f18613a.m17810e();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C4272b m17821h(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 == 0) {
                return this.f18613a.m17810e();
            }
            int length = this.f18614b.length;
            int[] iArr = new int[i10 + length];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f18613a.m17813h(this.f18614b[i12], i11);
            }
            return new C4272b(this.f18613a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(m17818e() * 8);
        for (int m17818e = m17818e(); m17818e >= 0; m17818e--) {
            int m17816c = m17816c(m17818e);
            if (m17816c != 0) {
                if (m17816c < 0) {
                    sb2.append(" - ");
                    m17816c = -m17816c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (m17818e == 0 || m17816c != 1) {
                    int m17812g = this.f18613a.m17812g(m17816c);
                    if (m17812g == 0) {
                        sb2.append('1');
                    } else if (m17812g == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(m17812g);
                    }
                }
                if (m17818e != 0) {
                    if (m17818e == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(m17818e);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
