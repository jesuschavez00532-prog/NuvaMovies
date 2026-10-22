package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.e0 */
/* loaded from: classes.dex */
public class C0568e0 {

    /* renamed from: a */
    private ViewParent f2340a;

    /* renamed from: b */
    private ViewParent f2341b;

    /* renamed from: c */
    private final View f2342c;

    /* renamed from: d */
    private boolean f2343d;

    /* renamed from: e */
    private int[] f2344e;

    public C0568e0(View view) {
        this.f2342c = view;
    }

    /* renamed from: h */
    private boolean m2437h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent m2438i;
        int i15;
        int i16;
        int[] iArr3;
        if (!m2450m() || (m2438i = m2438i(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f2342c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] m2439j = m2439j();
            m2439j[0] = 0;
            m2439j[1] = 0;
            iArr3 = m2439j;
        } else {
            iArr3 = iArr2;
        }
        AbstractC0585i1.m2475d(m2438i, this.f2342c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f2342c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    /* renamed from: i */
    private ViewParent m2438i(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f2341b;
        }
        return this.f2340a;
    }

    /* renamed from: j */
    private int[] m2439j() {
        if (this.f2344e == null) {
            this.f2344e = new int[2];
        }
        return this.f2344e;
    }

    /* renamed from: o */
    private void m2440o(int i10, ViewParent viewParent) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.f2341b = viewParent;
                return;
            }
            return;
        }
        this.f2340a = viewParent;
    }

    /* renamed from: a */
    public boolean m2441a(float f10, float f11, boolean z10) {
        ViewParent m2438i;
        if (!m2450m() || (m2438i = m2438i(0)) == null) {
            return false;
        }
        return AbstractC0585i1.m2472a(m2438i, this.f2342c, f10, f11, z10);
    }

    /* renamed from: b */
    public boolean m2442b(float f10, float f11) {
        ViewParent m2438i;
        if (!m2450m() || (m2438i = m2438i(0)) == null) {
            return false;
        }
        return AbstractC0585i1.m2473b(m2438i, this.f2342c, f10, f11);
    }

    /* renamed from: c */
    public boolean m2443c(int i10, int i11, int[] iArr, int[] iArr2) {
        return m2444d(i10, i11, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m2444d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent m2438i;
        int i13;
        int i14;
        if (!m2450m() || (m2438i = m2438i(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f2342c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = m2439j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        AbstractC0585i1.m2474c(m2438i, this.f2342c, i10, i11, iArr, i12);
        if (iArr2 != null) {
            this.f2342c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void m2445e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        m2437h(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    /* renamed from: f */
    public boolean m2446f(int i10, int i11, int i12, int i13, int[] iArr) {
        return m2437h(i10, i11, i12, i13, iArr, 0, null);
    }

    /* renamed from: g */
    public boolean m2447g(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return m2437h(i10, i11, i12, i13, iArr, i14, null);
    }

    /* renamed from: k */
    public boolean m2448k() {
        return m2449l(0);
    }

    /* renamed from: l */
    public boolean m2449l(int i10) {
        if (m2438i(i10) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m2450m() {
        return this.f2343d;
    }

    /* renamed from: n */
    public void m2451n(boolean z10) {
        if (this.f2343d) {
            AbstractC0616q0.m2586E0(this.f2342c);
        }
        this.f2343d = z10;
    }

    /* renamed from: p */
    public boolean m2452p(int i10) {
        return m2453q(i10, 0);
    }

    /* renamed from: q */
    public boolean m2453q(int i10, int i11) {
        if (m2449l(i11)) {
            return true;
        }
        if (m2450m()) {
            View view = this.f2342c;
            for (ViewParent parent = this.f2342c.getParent(); parent != null; parent = parent.getParent()) {
                if (AbstractC0585i1.m2477f(parent, view, this.f2342c, i10, i11)) {
                    m2440o(i11, parent);
                    AbstractC0585i1.m2476e(parent, view, this.f2342c, i10, i11);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: r */
    public void m2454r() {
        m2455s(0);
    }

    /* renamed from: s */
    public void m2455s(int i10) {
        ViewParent m2438i = m2438i(i10);
        if (m2438i != null) {
            AbstractC0585i1.m2478g(m2438i, this.f2342c, i10);
            m2440o(i10, null);
        }
    }
}
