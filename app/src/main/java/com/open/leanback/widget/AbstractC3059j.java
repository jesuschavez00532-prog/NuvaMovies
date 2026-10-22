package com.open.leanback.widget;

import com.open.leanback.widget.AbstractC3051b;
import p214l.C5305c;
import p214l.C5306d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.open.leanback.widget.j */
/* loaded from: classes2.dex */
public abstract class AbstractC3059j extends AbstractC3051b {

    /* renamed from: j */
    protected C5305c f12539j = new C5305c(64);

    /* renamed from: k */
    protected int f12540k = -1;

    /* renamed from: l */
    protected Object f12541l;

    /* renamed from: m */
    protected int f12542m;

    /* renamed from: com.open.leanback.widget.j$a */
    /* loaded from: classes2.dex */
    public static class a extends AbstractC3051b.a {

        /* renamed from: b */
        public int f12543b;

        /* renamed from: c */
        public int f12544c;

        public a(int i10, int i11, int i12) {
            super(i10);
            this.f12543b = i11;
            this.f12544c = i12;
        }
    }

    /* renamed from: K */
    private int m12575K(int i10) {
        boolean z10;
        int i11;
        int m12580M = m12580M();
        while (true) {
            if (m12580M >= this.f12540k) {
                if (mo12549q(m12580M).f12524a == i10) {
                    z10 = true;
                    break;
                }
                m12580M--;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            m12580M = m12580M();
        }
        if (m12553u()) {
            i11 = (-mo12549q(m12580M).f12544c) - this.f12518d;
        } else {
            i11 = mo12549q(m12580M).f12544c + this.f12518d;
        }
        for (int i12 = m12580M + 1; i12 <= m12580M(); i12++) {
            i11 -= mo12549q(i12).f12543b;
        }
        return i11;
    }

    /* renamed from: H */
    protected final boolean m12576H(int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (this.f12539j.m21375h() == 0) {
            return false;
        }
        int count = this.f12516b.getCount();
        int i14 = this.f12521g;
        if (i14 >= 0) {
            i11 = i14 + 1;
            i12 = this.f12516b.mo12485c(i14);
        } else {
            int i15 = this.f12523i;
            if (i15 != -1) {
                i11 = i15;
            } else {
                i11 = 0;
            }
            if (i11 <= m12580M() + 1 && i11 >= m12579L()) {
                if (i11 > m12580M()) {
                    return false;
                }
                i12 = Integer.MAX_VALUE;
            } else {
                this.f12539j.m21371c();
                return false;
            }
        }
        int m12580M = m12580M();
        int i16 = i11;
        while (i16 < count && i16 <= m12580M) {
            a mo12549q = mo12549q(i16);
            if (i12 != Integer.MAX_VALUE) {
                i12 += mo12549q.f12543b;
            }
            int i17 = mo12549q.f12524a;
            int mo12487e = this.f12516b.mo12487e(i16, true, this.f12515a, false);
            if (mo12487e != mo12549q.f12544c) {
                mo12549q.f12544c = mo12487e;
                this.f12539j.m21373f(m12580M - i16);
                i13 = i16;
            } else {
                i13 = m12580M;
            }
            this.f12521g = i16;
            if (this.f12520f < 0) {
                this.f12520f = i16;
            }
            this.f12516b.mo12486d(this.f12515a[0], i16, mo12487e, i17, i12);
            if (!z10 && m12537d(i10)) {
                return true;
            }
            if (i12 == Integer.MAX_VALUE) {
                i12 = this.f12516b.mo12485c(i16);
            }
            if (i17 == this.f12519e - 1 && z10) {
                return true;
            }
            i16++;
            m12580M = i13;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public final int m12577I(int i10, int i11, int i12) {
        int mo12485c;
        int i13 = this.f12521g;
        if (i13 >= 0 && (i13 != m12580M() || this.f12521g != i10 - 1)) {
            throw new IllegalStateException();
        }
        int i14 = this.f12521g;
        if (i14 < 0) {
            if (this.f12539j.m21375h() > 0 && i10 == m12580M() + 1) {
                mo12485c = m12575K(i11);
            } else {
                mo12485c = 0;
            }
        } else {
            mo12485c = i12 - this.f12516b.mo12485c(i14);
        }
        a aVar = new a(i11, mo12485c, 0);
        this.f12539j.m21370b(aVar);
        Object obj = this.f12541l;
        if (obj != null) {
            aVar.f12544c = this.f12542m;
            this.f12541l = null;
        } else {
            aVar.f12544c = this.f12516b.mo12487e(i10, true, this.f12515a, false);
            obj = this.f12515a[0];
        }
        Object obj2 = obj;
        if (this.f12539j.m21375h() == 1) {
            this.f12521g = i10;
            this.f12520f = i10;
            this.f12540k = i10;
        } else {
            int i15 = this.f12521g;
            if (i15 < 0) {
                this.f12521g = i10;
                this.f12520f = i10;
            } else {
                this.f12521g = i15 + 1;
            }
        }
        this.f12516b.mo12486d(obj2, i10, aVar.f12544c, i11, i12);
        return aVar.f12544c;
    }

    /* renamed from: J */
    protected abstract boolean mo12578J(int i10, boolean z10);

    /* renamed from: L */
    public final int m12579L() {
        return this.f12540k;
    }

    /* renamed from: M */
    public final int m12580M() {
        return (this.f12540k + this.f12539j.m21375h()) - 1;
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final a mo12549q(int i10) {
        int i11 = i10 - this.f12540k;
        if (i11 >= 0 && i11 < this.f12539j.m21375h()) {
            return (a) this.f12539j.m21372e(i11);
        }
        return null;
    }

    /* renamed from: O */
    protected final boolean m12582O(int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (this.f12539j.m21375h() == 0) {
            return false;
        }
        int i14 = this.f12520f;
        if (i14 >= 0) {
            i12 = this.f12516b.mo12485c(i14);
            i13 = mo12549q(this.f12520f).f12543b;
            i11 = this.f12520f - 1;
        } else {
            int i15 = this.f12523i;
            if (i15 != -1) {
                i11 = i15;
            } else {
                i11 = 0;
            }
            if (i11 <= m12580M() && i11 >= m12579L() - 1) {
                if (i11 < m12579L()) {
                    return false;
                }
                i12 = Integer.MAX_VALUE;
                i13 = 0;
            } else {
                this.f12539j.m21371c();
                return false;
            }
        }
        int max = Math.max(this.f12516b.mo12483a(), this.f12540k);
        while (i11 >= max) {
            a mo12549q = mo12549q(i11);
            int i16 = mo12549q.f12524a;
            int mo12487e = this.f12516b.mo12487e(i11, false, this.f12515a, false);
            if (mo12487e != mo12549q.f12544c) {
                this.f12539j.m21374g((i11 + 1) - this.f12540k);
                this.f12540k = this.f12520f;
                this.f12541l = this.f12515a[0];
                this.f12542m = mo12487e;
                return false;
            }
            this.f12520f = i11;
            if (this.f12521g < 0) {
                this.f12521g = i11;
            }
            this.f12516b.mo12486d(this.f12515a[0], i11, mo12487e, i16, i12 - i13);
            if (!z10 && m12538e(i10)) {
                return true;
            }
            i12 = this.f12516b.mo12485c(i11);
            i13 = mo12549q.f12543b;
            if (i16 == 0 && z10) {
                return true;
            }
            i11--;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: P */
    public final int m12583P(int i10, int i11, int i12) {
        a aVar;
        int i13;
        int i14 = this.f12520f;
        if (i14 >= 0 && (i14 != m12579L() || this.f12520f != i10 + 1)) {
            throw new IllegalStateException();
        }
        int i15 = this.f12540k;
        if (i15 >= 0) {
            aVar = mo12549q(i15);
        } else {
            aVar = null;
        }
        int mo12485c = this.f12516b.mo12485c(this.f12540k);
        a aVar2 = new a(i11, 0, 0);
        this.f12539j.m21369a(aVar2);
        Object obj = this.f12541l;
        if (obj != null) {
            aVar2.f12544c = this.f12542m;
            this.f12541l = null;
        } else {
            aVar2.f12544c = this.f12516b.mo12487e(i10, false, this.f12515a, false);
            obj = this.f12515a[0];
        }
        Object obj2 = obj;
        this.f12520f = i10;
        this.f12540k = i10;
        if (this.f12521g < 0) {
            this.f12521g = i10;
        }
        if (!this.f12517c) {
            i13 = i12 - aVar2.f12544c;
        } else {
            i13 = i12 + aVar2.f12544c;
        }
        int i16 = i13;
        if (aVar != null) {
            aVar.f12543b = mo12485c - i16;
        }
        this.f12516b.mo12486d(obj2, i10, aVar2.f12544c, i11, i16);
        return aVar2.f12544c;
    }

    /* renamed from: Q */
    protected abstract boolean mo12584Q(int i10, boolean z10);

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: c */
    protected final boolean mo12536c(int i10, boolean z10) {
        if (this.f12516b.getCount() == 0) {
            return false;
        }
        if (!z10 && m12537d(i10)) {
            return false;
        }
        try {
            if (m12576H(i10, z10)) {
                this.f12515a[0] = null;
                this.f12541l = null;
                return true;
            }
            return mo12578J(i10, z10);
        } finally {
            this.f12515a[0] = null;
            this.f12541l = null;
        }
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: o */
    public final C5306d[] mo12547o(int i10, int i11) {
        for (int i12 = 0; i12 < this.f12519e; i12++) {
            this.f12522h[i12].m21378b();
        }
        if (i10 >= 0) {
            while (i10 <= i11) {
                C5306d c5306d = this.f12522h[mo12549q(i10).f12524a];
                if (c5306d.m21382g() > 0 && c5306d.m21380e() == i10 - 1) {
                    c5306d.m21381f();
                    c5306d.m21377a(i10);
                } else {
                    c5306d.m21377a(i10);
                    c5306d.m21377a(i10);
                }
                i10++;
            }
        }
        return this.f12522h;
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: t */
    public void mo12552t(int i10) {
        super.mo12552t(i10);
        this.f12539j.m21373f((m12580M() - i10) + 1);
        if (this.f12539j.m21375h() == 0) {
            this.f12540k = -1;
        }
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: x */
    protected final boolean mo12556x(int i10, boolean z10) {
        if (this.f12516b.getCount() == 0) {
            return false;
        }
        if (!z10 && m12538e(i10)) {
            return false;
        }
        try {
            if (m12582O(i10, z10)) {
                this.f12515a[0] = null;
                this.f12541l = null;
                return true;
            }
            return mo12584Q(i10, z10);
        } finally {
            this.f12515a[0] = null;
            this.f12541l = null;
        }
    }
}
