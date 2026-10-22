package p138g;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC0597l1;
import androidx.core.view.C0589j1;
import androidx.core.view.InterfaceC0593k1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g.h */
/* loaded from: classes.dex */
public class C4324h {

    /* renamed from: c */
    private Interpolator f18832c;

    /* renamed from: d */
    InterfaceC0593k1 f18833d;

    /* renamed from: e */
    private boolean f18834e;

    /* renamed from: b */
    private long f18831b = -1;

    /* renamed from: f */
    private final AbstractC0597l1 f18835f = new a();

    /* renamed from: a */
    final ArrayList f18830a = new ArrayList();

    /* renamed from: g.h$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0597l1 {

        /* renamed from: a */
        private boolean f18836a = false;

        /* renamed from: b */
        private int f18837b = 0;

        a() {
        }

        @Override // androidx.core.view.InterfaceC0593k1
        /* renamed from: b */
        public void mo1160b(View view) {
            int i10 = this.f18837b + 1;
            this.f18837b = i10;
            if (i10 == C4324h.this.f18830a.size()) {
                InterfaceC0593k1 interfaceC0593k1 = C4324h.this.f18833d;
                if (interfaceC0593k1 != null) {
                    interfaceC0593k1.mo1160b(null);
                }
                m18136d();
            }
        }

        @Override // androidx.core.view.AbstractC0597l1, androidx.core.view.InterfaceC0593k1
        /* renamed from: c */
        public void mo1161c(View view) {
            if (this.f18836a) {
                return;
            }
            this.f18836a = true;
            InterfaceC0593k1 interfaceC0593k1 = C4324h.this.f18833d;
            if (interfaceC0593k1 != null) {
                interfaceC0593k1.mo1161c(null);
            }
        }

        /* renamed from: d */
        void m18136d() {
            this.f18837b = 0;
            this.f18836a = false;
            C4324h.this.m18129b();
        }
    }

    /* renamed from: a */
    public void m18128a() {
        if (!this.f18834e) {
            return;
        }
        Iterator it = this.f18830a.iterator();
        while (it.hasNext()) {
            ((C0589j1) it.next()).m2484b();
        }
        this.f18834e = false;
    }

    /* renamed from: b */
    void m18129b() {
        this.f18834e = false;
    }

    /* renamed from: c */
    public C4324h m18130c(C0589j1 c0589j1) {
        if (!this.f18834e) {
            this.f18830a.add(c0589j1);
        }
        return this;
    }

    /* renamed from: d */
    public C4324h m18131d(C0589j1 c0589j1, C0589j1 c0589j12) {
        this.f18830a.add(c0589j1);
        c0589j12.m2489h(c0589j1.m2485c());
        this.f18830a.add(c0589j12);
        return this;
    }

    /* renamed from: e */
    public C4324h m18132e(long j10) {
        if (!this.f18834e) {
            this.f18831b = j10;
        }
        return this;
    }

    /* renamed from: f */
    public C4324h m18133f(Interpolator interpolator) {
        if (!this.f18834e) {
            this.f18832c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C4324h m18134g(InterfaceC0593k1 interfaceC0593k1) {
        if (!this.f18834e) {
            this.f18833d = interfaceC0593k1;
        }
        return this;
    }

    /* renamed from: h */
    public void m18135h() {
        if (this.f18834e) {
            return;
        }
        Iterator it = this.f18830a.iterator();
        while (it.hasNext()) {
            C0589j1 c0589j1 = (C0589j1) it.next();
            long j10 = this.f18831b;
            if (j10 >= 0) {
                c0589j1.m2486d(j10);
            }
            Interpolator interpolator = this.f18832c;
            if (interpolator != null) {
                c0589j1.m2487e(interpolator);
            }
            if (this.f18833d != null) {
                c0589j1.m2488f(this.f18835f);
            }
            c0589j1.m2491j();
        }
        this.f18834e = true;
    }
}
