package com.open.leanback.widget;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p214l.C5306d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.open.leanback.widget.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3051b {

    /* renamed from: b */
    protected b f12516b;

    /* renamed from: c */
    protected boolean f12517c;

    /* renamed from: d */
    protected int f12518d;

    /* renamed from: e */
    protected int f12519e;

    /* renamed from: h */
    protected C5306d[] f12522h;

    /* renamed from: a */
    Object[] f12515a = new Object[1];

    /* renamed from: f */
    protected int f12520f = -1;

    /* renamed from: g */
    protected int f12521g = -1;

    /* renamed from: i */
    protected int f12523i = -1;

    /* renamed from: com.open.leanback.widget.b$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public int f12524a;

        public a(int i10) {
            this.f12524a = i10;
        }
    }

    /* renamed from: com.open.leanback.widget.b$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        int mo12483a();

        /* renamed from: b */
        int mo12484b(int i10);

        /* renamed from: c */
        int mo12485c(int i10);

        /* renamed from: d */
        void mo12486d(Object obj, int i10, int i11, int i12, int i13);

        /* renamed from: e */
        int mo12487e(int i10, boolean z10, Object[] objArr, boolean z11);

        int getCount();

        void removeItem(int i10);
    }

    /* renamed from: B */
    private void m12526B() {
        if (this.f12521g < this.f12520f) {
            m12528A();
        }
    }

    /* renamed from: g */
    public static AbstractC3051b m12527g(int i10) {
        if (i10 == 1) {
            return new C3058i();
        }
        C3060k c3060k = new C3060k();
        c3060k.m12529C(i10);
        return c3060k;
    }

    /* renamed from: A */
    public void m12528A() {
        this.f12521g = -1;
        this.f12520f = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public void m12529C(int i10) {
        if (i10 > 0) {
            if (this.f12519e == i10) {
                return;
            }
            this.f12519e = i10;
            this.f12522h = new C5306d[i10];
            for (int i11 = 0; i11 < this.f12519e; i11++) {
                this.f12522h[i11] = new C5306d();
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: D */
    public void m12530D(b bVar) {
        this.f12516b = bVar;
    }

    /* renamed from: E */
    public final void m12531E(boolean z10) {
        this.f12517c = z10;
    }

    /* renamed from: F */
    public final void m12532F(int i10) {
        this.f12518d = i10;
    }

    /* renamed from: G */
    public void m12533G(int i10) {
        this.f12523i = i10;
    }

    /* renamed from: a */
    public boolean m12534a() {
        int i10;
        if (this.f12517c) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = Integer.MIN_VALUE;
        }
        return mo12536c(i10, true);
    }

    /* renamed from: b */
    public final void m12535b(int i10) {
        mo12536c(i10, false);
    }

    /* renamed from: c */
    protected abstract boolean mo12536c(int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean m12537d(int i10) {
        if (this.f12521g < 0) {
            return false;
        }
        if (this.f12517c) {
            if (m12544l(true, null) > i10 + this.f12518d) {
                return false;
            }
        } else if (m12542j(false, null) < i10 - this.f12518d) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean m12538e(int i10) {
        if (this.f12521g < 0) {
            return false;
        }
        if (this.f12517c) {
            if (m12542j(false, null) < i10 - this.f12518d) {
                return false;
            }
        } else if (m12544l(true, null) > i10 + this.f12518d) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo12539f(int i10, int i11, RecyclerView.AbstractC0797p.c cVar) {
    }

    /* renamed from: h */
    public void m12540h(int[] iArr, int i10, SparseIntArray sparseIntArray) {
        int i11;
        int i12;
        int mo12485c;
        int i13;
        int mo12485c2;
        int i14;
        int m12548p = m12548p();
        if (m12548p >= 0) {
            i11 = Arrays.binarySearch(iArr, 0, i10, m12548p);
        } else {
            i11 = 0;
        }
        if (i11 < 0) {
            if (this.f12517c) {
                mo12485c2 = (this.f12516b.mo12485c(m12548p) - this.f12516b.mo12484b(m12548p)) - this.f12518d;
            } else {
                mo12485c2 = this.f12516b.mo12485c(m12548p) + this.f12516b.mo12484b(m12548p) + this.f12518d;
            }
            int i15 = mo12485c2;
            for (int i16 = (-i11) - 1; i16 < i10; i16++) {
                int i17 = iArr[i16];
                int i18 = sparseIntArray.get(i17);
                if (i18 < 0) {
                    i14 = 0;
                } else {
                    i14 = i18;
                }
                int mo12487e = this.f12516b.mo12487e(i17, true, this.f12515a, true);
                this.f12516b.mo12486d(this.f12515a[0], i17, mo12487e, i14, i15);
                if (this.f12517c) {
                    i15 = (i15 - mo12487e) - this.f12518d;
                } else {
                    i15 = i15 + mo12487e + this.f12518d;
                }
            }
        }
        int m12545m = m12545m();
        if (m12545m >= 0) {
            i12 = Arrays.binarySearch(iArr, 0, i10, m12545m);
        } else {
            i12 = 0;
        }
        if (i12 < 0) {
            if (this.f12517c) {
                mo12485c = this.f12516b.mo12485c(m12545m);
            } else {
                mo12485c = this.f12516b.mo12485c(m12545m);
            }
            for (int i19 = (-i12) - 2; i19 >= 0; i19--) {
                int i20 = iArr[i19];
                int i21 = sparseIntArray.get(i20);
                if (i21 < 0) {
                    i13 = 0;
                } else {
                    i13 = i21;
                }
                int mo12487e2 = this.f12516b.mo12487e(i20, false, this.f12515a, true);
                if (this.f12517c) {
                    mo12485c = mo12485c + this.f12518d + mo12487e2;
                } else {
                    mo12485c = (mo12485c - this.f12518d) - mo12487e2;
                }
                this.f12516b.mo12486d(this.f12515a[0], i20, mo12487e2, i13, mo12485c);
            }
        }
    }

    /* renamed from: i */
    protected abstract int mo12541i(boolean z10, int i10, int[] iArr);

    /* renamed from: j */
    public final int m12542j(boolean z10, int[] iArr) {
        int i10;
        if (this.f12517c) {
            i10 = this.f12520f;
        } else {
            i10 = this.f12521g;
        }
        return mo12541i(z10, i10, iArr);
    }

    /* renamed from: k */
    protected abstract int mo12543k(boolean z10, int i10, int[] iArr);

    /* renamed from: l */
    public final int m12544l(boolean z10, int[] iArr) {
        int i10;
        if (this.f12517c) {
            i10 = this.f12521g;
        } else {
            i10 = this.f12520f;
        }
        return mo12543k(z10, i10, iArr);
    }

    /* renamed from: m */
    public final int m12545m() {
        return this.f12520f;
    }

    /* renamed from: n */
    public final C5306d[] m12546n() {
        return mo12547o(m12545m(), m12548p());
    }

    /* renamed from: o */
    public abstract C5306d[] mo12547o(int i10, int i11);

    /* renamed from: p */
    public final int m12548p() {
        return this.f12521g;
    }

    /* renamed from: q */
    public abstract a mo12549q(int i10);

    /* renamed from: r */
    public int m12550r() {
        return this.f12519e;
    }

    /* renamed from: s */
    public final int m12551s(int i10) {
        a mo12549q = mo12549q(i10);
        if (mo12549q == null) {
            return -1;
        }
        return mo12549q.f12524a;
    }

    /* renamed from: t */
    public void mo12552t(int i10) {
        int i11;
        if (i10 < 0 || (i11 = this.f12521g) < 0) {
            return;
        }
        if (i11 >= i10) {
            this.f12521g = i10 - 1;
        }
        m12526B();
        if (m12545m() < 0) {
            m12533G(i10);
        }
    }

    /* renamed from: u */
    public boolean m12553u() {
        return this.f12517c;
    }

    /* renamed from: v */
    public final boolean m12554v() {
        int i10;
        if (this.f12517c) {
            i10 = Integer.MIN_VALUE;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        return mo12556x(i10, true);
    }

    /* renamed from: w */
    public final void m12555w(int i10) {
        mo12556x(i10, false);
    }

    /* renamed from: x */
    protected abstract boolean mo12556x(int i10, boolean z10);

    /* renamed from: y */
    public void m12557y(int i10, int i11) {
        while (true) {
            int i12 = this.f12521g;
            if (i12 < this.f12520f || i12 <= i10) {
                break;
            }
            boolean z10 = false;
            if (this.f12517c ? this.f12516b.mo12485c(i12) <= i11 : this.f12516b.mo12485c(i12) >= i11) {
                z10 = true;
            }
            if (!z10) {
                break;
            }
            this.f12516b.removeItem(this.f12521g);
            this.f12521g--;
        }
        m12526B();
    }

    /* renamed from: z */
    public void m12558z(int i10, int i11) {
        while (true) {
            int i12 = this.f12521g;
            int i13 = this.f12520f;
            if (i12 < i13 || i13 >= i10) {
                break;
            }
            int mo12484b = this.f12516b.mo12484b(i13);
            boolean z10 = false;
            if (this.f12517c ? this.f12516b.mo12485c(this.f12520f) - mo12484b >= i11 : this.f12516b.mo12485c(this.f12520f) + mo12484b <= i11) {
                z10 = true;
            }
            if (!z10) {
                break;
            }
            this.f12516b.removeItem(this.f12520f);
            this.f12520f++;
        }
        m12526B();
    }
}
