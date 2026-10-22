package p241n;

import java.util.ArrayList;
import p241n.C5701e;

/* renamed from: n.p */
/* loaded from: classes.dex */
public class C5712p {

    /* renamed from: a */
    private int f22926a;

    /* renamed from: b */
    private int f22927b;

    /* renamed from: c */
    private int f22928c;

    /* renamed from: d */
    private int f22929d;

    /* renamed from: e */
    private ArrayList f22930e = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n.p$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private C5701e f22931a;

        /* renamed from: b */
        private C5701e f22932b;

        /* renamed from: c */
        private int f22933c;

        /* renamed from: d */
        private C5701e.c f22934d;

        /* renamed from: e */
        private int f22935e;

        public a(C5701e c5701e) {
            this.f22931a = c5701e;
            this.f22932b = c5701e.m22934i();
            this.f22933c = c5701e.m22929d();
            this.f22934d = c5701e.m22933h();
            this.f22935e = c5701e.m22928c();
        }

        /* renamed from: a */
        public void m23082a(C5702f c5702f) {
            c5702f.mo22983h(this.f22931a.m22935j()).m22927b(this.f22932b, this.f22933c, this.f22934d, this.f22935e);
        }

        /* renamed from: b */
        public void m23083b(C5702f c5702f) {
            C5701e mo22983h = c5702f.mo22983h(this.f22931a.m22935j());
            this.f22931a = mo22983h;
            if (mo22983h != null) {
                this.f22932b = mo22983h.m22934i();
                this.f22933c = this.f22931a.m22929d();
                this.f22934d = this.f22931a.m22933h();
                this.f22935e = this.f22931a.m22928c();
                return;
            }
            this.f22932b = null;
            this.f22933c = 0;
            this.f22934d = C5701e.c.STRONG;
            this.f22935e = 0;
        }
    }

    public C5712p(C5702f c5702f) {
        this.f22926a = c5702f.m22955G();
        this.f22927b = c5702f.m22957H();
        this.f22928c = c5702f.m22949D();
        this.f22929d = c5702f.m23003r();
        ArrayList mo22985i = c5702f.mo22985i();
        int size = mo22985i.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f22930e.add(new a((C5701e) mo22985i.get(i10)));
        }
    }

    /* renamed from: a */
    public void m23080a(C5702f c5702f) {
        c5702f.m22948C0(this.f22926a);
        c5702f.m22950D0(this.f22927b);
        c5702f.m23018y0(this.f22928c);
        c5702f.m22975b0(this.f22929d);
        int size = this.f22930e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a) this.f22930e.get(i10)).m23082a(c5702f);
        }
    }

    /* renamed from: b */
    public void m23081b(C5702f c5702f) {
        this.f22926a = c5702f.m22955G();
        this.f22927b = c5702f.m22957H();
        this.f22928c = c5702f.m22949D();
        this.f22929d = c5702f.m23003r();
        int size = this.f22930e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((a) this.f22930e.get(i10)).m23083b(c5702f);
        }
    }
}
