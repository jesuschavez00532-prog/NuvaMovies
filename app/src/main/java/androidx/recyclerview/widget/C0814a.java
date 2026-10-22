package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0823j;
import androidx.recyclerview.widget.RecyclerView;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import java.util.List;
import p373w.C7340e;
import p373w.InterfaceC7339d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public final class C0814a implements C0823j.a {

    /* renamed from: a */
    private InterfaceC7339d f3342a;

    /* renamed from: b */
    final ArrayList f3343b;

    /* renamed from: c */
    final ArrayList f3344c;

    /* renamed from: d */
    final a f3345d;

    /* renamed from: e */
    Runnable f3346e;

    /* renamed from: f */
    final boolean f3347f;

    /* renamed from: g */
    final C0823j f3348g;

    /* renamed from: h */
    private int f3349h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo3866a(int i10, int i11);

        /* renamed from: b */
        void mo3867b(b bVar);

        /* renamed from: c */
        void mo3868c(int i10, int i11, Object obj);

        /* renamed from: d */
        void mo3869d(b bVar);

        /* renamed from: e */
        RecyclerView.AbstractC0787f0 mo3870e(int i10);

        /* renamed from: f */
        void mo3871f(int i10, int i11);

        /* renamed from: g */
        void mo3872g(int i10, int i11);

        /* renamed from: h */
        void mo3873h(int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        int f3350a;

        /* renamed from: b */
        int f3351b;

        /* renamed from: c */
        Object f3352c;

        /* renamed from: d */
        int f3353d;

        b(int i10, int i11, int i12, Object obj) {
            this.f3350a = i10;
            this.f3351b = i11;
            this.f3353d = i12;
            this.f3352c = obj;
        }

        /* renamed from: a */
        String m4125a() {
            int i10 = this.f3350a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 8) {
                            return "??";
                        }
                        return "mv";
                    }
                    return C3384f.f14557R;
                }
                return "rm";
            }
            return "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f3350a;
            if (i10 != bVar.f3350a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f3353d - this.f3351b) == 1 && this.f3353d == bVar.f3351b && this.f3351b == bVar.f3353d) {
                return true;
            }
            if (this.f3353d != bVar.f3353d || this.f3351b != bVar.f3351b) {
                return false;
            }
            Object obj2 = this.f3352c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3352c)) {
                    return false;
                }
            } else if (bVar.f3352c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3350a * 31) + this.f3351b) * 31) + this.f3353d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m4125a() + ",s:" + this.f3351b + "c:" + this.f3353d + ",p:" + this.f3352c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0814a(a aVar) {
        this(aVar, false);
    }

    /* renamed from: c */
    private void m4099c(b bVar) {
        m4105v(bVar);
    }

    /* renamed from: d */
    private void m4100d(b bVar) {
        m4105v(bVar);
    }

    /* renamed from: f */
    private void m4101f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f3351b;
        int i11 = bVar.f3353d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f3345d.mo3870e(i12) == null && !m4103h(i12)) {
                if (c11 == 1) {
                    m4105v(mo4108b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            } else {
                if (c11 == 0) {
                    m4104k(mo4108b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f3353d) {
            mo4107a(bVar);
            bVar = mo4108b(2, i10, i13, null);
        }
        if (c11 == 0) {
            m4104k(bVar);
        } else {
            m4105v(bVar);
        }
    }

    /* renamed from: g */
    private void m4102g(b bVar) {
        int i10 = bVar.f3351b;
        int i11 = bVar.f3353d + i10;
        int i12 = i10;
        char c10 = 65535;
        int i13 = 0;
        while (i10 < i11) {
            if (this.f3345d.mo3870e(i10) == null && !m4103h(i10)) {
                if (c10 == 1) {
                    m4105v(mo4108b(4, i12, i13, bVar.f3352c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 0;
            } else {
                if (c10 == 0) {
                    m4104k(mo4108b(4, i12, i13, bVar.f3352c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 1;
            }
            i13++;
            i10++;
        }
        if (i13 != bVar.f3353d) {
            Object obj = bVar.f3352c;
            mo4107a(bVar);
            bVar = mo4108b(4, i12, i13, obj);
        }
        if (c10 == 0) {
            m4104k(bVar);
        } else {
            m4105v(bVar);
        }
    }

    /* renamed from: h */
    private boolean m4103h(int i10) {
        int size = this.f3344c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f3344c.get(i11);
            int i12 = bVar.f3350a;
            if (i12 == 8) {
                if (m4114n(bVar.f3353d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f3351b;
                int i14 = bVar.f3353d + i13;
                while (i13 < i14) {
                    if (m4114n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m4104k(b bVar) {
        int i10;
        boolean z10;
        int i11 = bVar.f3350a;
        if (i11 != 1 && i11 != 8) {
            int m4106z = m4106z(bVar.f3351b, i11);
            int i12 = bVar.f3351b;
            int i13 = bVar.f3350a;
            if (i13 != 2) {
                if (i13 == 4) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i10 = 0;
            }
            int i14 = 1;
            for (int i15 = 1; i15 < bVar.f3353d; i15++) {
                int m4106z2 = m4106z(bVar.f3351b + (i10 * i15), bVar.f3350a);
                int i16 = bVar.f3350a;
                if (i16 == 2 ? m4106z2 != m4106z : i16 != 4 || m4106z2 != m4106z + 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    i14++;
                } else {
                    b mo4108b = mo4108b(i16, m4106z, i14, bVar.f3352c);
                    m4112l(mo4108b, i12);
                    mo4107a(mo4108b);
                    if (bVar.f3350a == 4) {
                        i12 += i14;
                    }
                    m4106z = m4106z2;
                    i14 = 1;
                }
            }
            Object obj = bVar.f3352c;
            mo4107a(bVar);
            if (i14 > 0) {
                b mo4108b2 = mo4108b(bVar.f3350a, m4106z, i14, obj);
                m4112l(mo4108b2, i12);
                mo4107a(mo4108b2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    /* renamed from: v */
    private void m4105v(b bVar) {
        this.f3344c.add(bVar);
        int i10 = bVar.f3350a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        this.f3345d.mo3866a(bVar.f3351b, bVar.f3353d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                this.f3345d.mo3868c(bVar.f3351b, bVar.f3353d, bVar.f3352c);
                return;
            }
            this.f3345d.mo3871f(bVar.f3351b, bVar.f3353d);
            return;
        }
        this.f3345d.mo3872g(bVar.f3351b, bVar.f3353d);
    }

    /* renamed from: z */
    private int m4106z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f3344c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f3344c.get(size);
            int i14 = bVar.f3350a;
            if (i14 == 8) {
                int i15 = bVar.f3351b;
                int i16 = bVar.f3353d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 >= i13 && i10 <= i12) {
                    if (i13 == i15) {
                        if (i11 == 1) {
                            bVar.f3353d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f3353d = i16 - 1;
                        }
                        i10++;
                    } else {
                        if (i11 == 1) {
                            bVar.f3351b = i15 + 1;
                        } else if (i11 == 2) {
                            bVar.f3351b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        bVar.f3351b = i15 + 1;
                        bVar.f3353d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f3351b = i15 - 1;
                        bVar.f3353d = i16 - 1;
                    }
                }
            } else {
                int i17 = bVar.f3351b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f3353d;
                    } else if (i14 == 2) {
                        i10 += bVar.f3353d;
                    }
                } else if (i11 == 1) {
                    bVar.f3351b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f3351b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f3344c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f3344c.get(size2);
            if (bVar2.f3350a == 8) {
                int i18 = bVar2.f3353d;
                if (i18 == bVar2.f3351b || i18 < 0) {
                    this.f3344c.remove(size2);
                    mo4107a(bVar2);
                }
            } else if (bVar2.f3353d <= 0) {
                this.f3344c.remove(size2);
                mo4107a(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.C0823j.a
    /* renamed from: a */
    public void mo4107a(b bVar) {
        if (!this.f3347f) {
            bVar.f3352c = null;
            this.f3342a.mo16817a(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.C0823j.a
    /* renamed from: b */
    public b mo4108b(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f3342a.mo16818b();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f3350a = i10;
        bVar.f3351b = i11;
        bVar.f3353d = i12;
        bVar.f3352c = obj;
        return bVar;
    }

    /* renamed from: e */
    public int m4109e(int i10) {
        int size = this.f3343b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f3343b.get(i11);
            int i12 = bVar.f3350a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 8) {
                        int i13 = bVar.f3351b;
                        if (i13 == i10) {
                            i10 = bVar.f3353d;
                        } else {
                            if (i13 < i10) {
                                i10--;
                            }
                            if (bVar.f3353d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else {
                    int i14 = bVar.f3351b;
                    if (i14 <= i10) {
                        int i15 = bVar.f3353d;
                        if (i14 + i15 > i10) {
                            return -1;
                        }
                        i10 -= i15;
                    } else {
                        continue;
                    }
                }
            } else if (bVar.f3351b <= i10) {
                i10 += bVar.f3353d;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m4110i() {
        int size = this.f3344c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3345d.mo3869d((b) this.f3344c.get(i10));
        }
        m4123x(this.f3344c);
        this.f3349h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m4111j() {
        m4110i();
        int size = this.f3343b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f3343b.get(i10);
            int i11 = bVar.f3350a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            this.f3345d.mo3869d(bVar);
                            this.f3345d.mo3866a(bVar.f3351b, bVar.f3353d);
                        }
                    } else {
                        this.f3345d.mo3869d(bVar);
                        this.f3345d.mo3868c(bVar.f3351b, bVar.f3353d, bVar.f3352c);
                    }
                } else {
                    this.f3345d.mo3869d(bVar);
                    this.f3345d.mo3873h(bVar.f3351b, bVar.f3353d);
                }
            } else {
                this.f3345d.mo3869d(bVar);
                this.f3345d.mo3872g(bVar.f3351b, bVar.f3353d);
            }
            Runnable runnable = this.f3346e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m4123x(this.f3343b);
        this.f3349h = 0;
    }

    /* renamed from: l */
    void m4112l(b bVar, int i10) {
        this.f3345d.mo3867b(bVar);
        int i11 = bVar.f3350a;
        if (i11 != 2) {
            if (i11 == 4) {
                this.f3345d.mo3868c(i10, bVar.f3353d, bVar.f3352c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.f3345d.mo3873h(i10, bVar.f3353d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m4113m(int i10) {
        return m4114n(i10, 0);
    }

    /* renamed from: n */
    int m4114n(int i10, int i11) {
        int size = this.f3344c.size();
        while (i11 < size) {
            b bVar = (b) this.f3344c.get(i11);
            int i12 = bVar.f3350a;
            if (i12 == 8) {
                int i13 = bVar.f3351b;
                if (i13 == i10) {
                    i10 = bVar.f3353d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f3353d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f3351b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f3353d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f3353d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m4115o(int i10) {
        if ((i10 & this.f3349h) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m4116p() {
        if (this.f3343b.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m4117q() {
        if (!this.f3344c.isEmpty() && !this.f3343b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m4118r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f3343b.add(mo4108b(4, i10, i11, obj));
        this.f3349h |= 4;
        if (this.f3343b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean m4119s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3343b.add(mo4108b(1, i10, i11, null));
        this.f3349h |= 1;
        if (this.f3343b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m4120t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 == 1) {
            this.f3343b.add(mo4108b(8, i10, i11, null));
            this.f3349h |= 8;
            if (this.f3343b.size() != 1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m4121u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3343b.add(mo4108b(2, i10, i11, null));
        this.f3349h |= 2;
        if (this.f3343b.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m4122w() {
        this.f3348g.m4221b(this.f3343b);
        int size = this.f3343b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f3343b.get(i10);
            int i11 = bVar.f3350a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            m4100d(bVar);
                        }
                    } else {
                        m4102g(bVar);
                    }
                } else {
                    m4101f(bVar);
                }
            } else {
                m4099c(bVar);
            }
            Runnable runnable = this.f3346e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3343b.clear();
    }

    /* renamed from: x */
    void m4123x(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            mo4107a((b) list.get(i10));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m4124y() {
        m4123x(this.f3343b);
        m4123x(this.f3344c);
        this.f3349h = 0;
    }

    C0814a(a aVar, boolean z10) {
        this.f3342a = new C7340e(30);
        this.f3343b = new ArrayList();
        this.f3344c = new ArrayList();
        this.f3349h = 0;
        this.f3345d = aVar;
        this.f3347f = z10;
        this.f3348g = new C0823j(this);
    }
}
