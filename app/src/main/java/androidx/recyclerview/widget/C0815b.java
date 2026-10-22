package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.b */
/* loaded from: classes.dex */
public class C0815b {

    /* renamed from: a */
    final b f3354a;

    /* renamed from: b */
    final a f3355b = new a();

    /* renamed from: c */
    final List f3356c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        long f3357a = 0;

        /* renamed from: b */
        a f3358b;

        a() {
        }

        /* renamed from: c */
        private void m4146c() {
            if (this.f3358b == null) {
                this.f3358b = new a();
            }
        }

        /* renamed from: a */
        void m4147a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f3358b;
                if (aVar != null) {
                    aVar.m4147a(i10 - 64);
                    return;
                }
                return;
            }
            this.f3357a &= (1 << i10) ^ (-1);
        }

        /* renamed from: b */
        int m4148b(int i10) {
            a aVar = this.f3358b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f3357a);
                }
                return Long.bitCount(this.f3357a & ((1 << i10) - 1));
            }
            if (i10 < 64) {
                return Long.bitCount(this.f3357a & ((1 << i10) - 1));
            }
            return aVar.m4148b(i10 - 64) + Long.bitCount(this.f3357a);
        }

        /* renamed from: d */
        boolean m4149d(int i10) {
            if (i10 >= 64) {
                m4146c();
                return this.f3358b.m4149d(i10 - 64);
            }
            if ((this.f3357a & (1 << i10)) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        void m4150e(int i10, boolean z10) {
            boolean z11;
            if (i10 >= 64) {
                m4146c();
                this.f3358b.m4150e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3357a;
            if ((Long.MIN_VALUE & j10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            long j11 = (1 << i10) - 1;
            this.f3357a = ((j10 & (j11 ^ (-1))) << 1) | (j10 & j11);
            if (z10) {
                m4153h(i10);
            } else {
                m4147a(i10);
            }
            if (z11 || this.f3358b != null) {
                m4146c();
                this.f3358b.m4150e(0, z11);
            }
        }

        /* renamed from: f */
        boolean m4151f(int i10) {
            boolean z10;
            if (i10 >= 64) {
                m4146c();
                return this.f3358b.m4151f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3357a;
            if ((j11 & j10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            long j12 = j11 & (j10 ^ (-1));
            this.f3357a = j12;
            long j13 = j10 - 1;
            this.f3357a = (j12 & j13) | Long.rotateRight((j13 ^ (-1)) & j12, 1);
            a aVar = this.f3358b;
            if (aVar != null) {
                if (aVar.m4149d(0)) {
                    m4153h(63);
                }
                this.f3358b.m4151f(0);
            }
            return z10;
        }

        /* renamed from: g */
        void m4152g() {
            this.f3357a = 0L;
            a aVar = this.f3358b;
            if (aVar != null) {
                aVar.m4152g();
            }
        }

        /* renamed from: h */
        void m4153h(int i10) {
            if (i10 >= 64) {
                m4146c();
                this.f3358b.m4153h(i10 - 64);
            } else {
                this.f3357a |= 1 << i10;
            }
        }

        public String toString() {
            if (this.f3358b == null) {
                return Long.toBinaryString(this.f3357a);
            }
            return this.f3358b.toString() + "xx" + Long.toBinaryString(this.f3357a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        View mo3849a(int i10);

        /* renamed from: b */
        void mo3850b(View view);

        /* renamed from: c */
        int mo3851c();

        /* renamed from: d */
        void mo3852d();

        /* renamed from: e */
        int mo3853e(View view);

        /* renamed from: f */
        RecyclerView.AbstractC0787f0 mo3854f(View view);

        /* renamed from: g */
        void mo3855g(int i10);

        /* renamed from: h */
        void mo3856h(View view);

        /* renamed from: i */
        void mo3857i(View view, int i10);

        /* renamed from: j */
        void mo3858j(int i10);

        /* renamed from: k */
        void mo3859k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0815b(b bVar) {
        this.f3354a = bVar;
    }

    /* renamed from: h */
    private int m4126h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int mo3851c = this.f3354a.mo3851c();
        int i11 = i10;
        while (i11 < mo3851c) {
            int m4148b = i10 - (i11 - this.f3355b.m4148b(i11));
            if (m4148b == 0) {
                while (this.f3355b.m4149d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += m4148b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m4127l(View view) {
        this.f3356c.add(view);
        this.f3354a.mo3850b(view);
    }

    /* renamed from: t */
    private boolean m4128t(View view) {
        if (this.f3356c.remove(view)) {
            this.f3354a.mo3856h(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4129a(View view, int i10, boolean z10) {
        int m4126h;
        if (i10 < 0) {
            m4126h = this.f3354a.mo3851c();
        } else {
            m4126h = m4126h(i10);
        }
        this.f3355b.m4150e(m4126h, z10);
        if (z10) {
            m4127l(view);
        }
        this.f3354a.mo3857i(view, m4126h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4130b(View view, boolean z10) {
        m4129a(view, -1, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m4131c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int m4126h;
        if (i10 < 0) {
            m4126h = this.f3354a.mo3851c();
        } else {
            m4126h = m4126h(i10);
        }
        this.f3355b.m4150e(m4126h, z10);
        if (z10) {
            m4127l(view);
        }
        this.f3354a.mo3859k(view, m4126h, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m4132d(int i10) {
        int m4126h = m4126h(i10);
        this.f3355b.m4151f(m4126h);
        this.f3354a.mo3855g(m4126h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public View m4133e(int i10) {
        int size = this.f3356c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f3356c.get(i11);
            RecyclerView.AbstractC0787f0 mo3854f = this.f3354a.mo3854f(view);
            if (mo3854f.getLayoutPosition() == i10 && !mo3854f.isInvalid() && !mo3854f.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public View m4134f(int i10) {
        return this.f3354a.mo3849a(m4126h(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m4135g() {
        return this.f3354a.mo3851c() - this.f3356c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public View m4136i(int i10) {
        return this.f3354a.mo3849a(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m4137j() {
        return this.f3354a.mo3851c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m4138k(View view) {
        int mo3853e = this.f3354a.mo3853e(view);
        if (mo3853e >= 0) {
            this.f3355b.m4153h(mo3853e);
            m4127l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m4139m(View view) {
        int mo3853e = this.f3354a.mo3853e(view);
        if (mo3853e == -1 || this.f3355b.m4149d(mo3853e)) {
            return -1;
        }
        return mo3853e - this.f3355b.m4148b(mo3853e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m4140n(View view) {
        return this.f3356c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m4141o() {
        this.f3355b.m4152g();
        for (int size = this.f3356c.size() - 1; size >= 0; size--) {
            this.f3354a.mo3856h((View) this.f3356c.get(size));
            this.f3356c.remove(size);
        }
        this.f3354a.mo3852d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m4142p(View view) {
        int mo3853e = this.f3354a.mo3853e(view);
        if (mo3853e < 0) {
            return;
        }
        if (this.f3355b.m4151f(mo3853e)) {
            m4128t(view);
        }
        this.f3354a.mo3858j(mo3853e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m4143q(int i10) {
        int m4126h = m4126h(i10);
        View mo3849a = this.f3354a.mo3849a(m4126h);
        if (mo3849a == null) {
            return;
        }
        if (this.f3355b.m4151f(m4126h)) {
            m4128t(mo3849a);
        }
        this.f3354a.mo3858j(m4126h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m4144r(View view) {
        int mo3853e = this.f3354a.mo3853e(view);
        if (mo3853e == -1) {
            m4128t(view);
            return true;
        }
        if (this.f3355b.m4149d(mo3853e)) {
            this.f3355b.m4151f(mo3853e);
            m4128t(view);
            this.f3354a.mo3858j(mo3853e);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m4145s(View view) {
        int mo3853e = this.f3354a.mo3853e(view);
        if (mo3853e >= 0) {
            if (this.f3355b.m4149d(mo3853e)) {
                this.f3355b.m4147a(mo3853e);
                m4128t(view);
                return;
            } else {
                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
            }
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public String toString() {
        return this.f3355b.toString() + ", hidden list:" + this.f3356c.size();
    }
}
