package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.q */
/* loaded from: classes.dex */
class C0830q {

    /* renamed from: a */
    final b f3489a;

    /* renamed from: b */
    a f3490b = new a();

    /* renamed from: androidx.recyclerview.widget.q$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a */
        int f3491a = 0;

        /* renamed from: b */
        int f3492b;

        /* renamed from: c */
        int f3493c;

        /* renamed from: d */
        int f3494d;

        /* renamed from: e */
        int f3495e;

        a() {
        }

        /* renamed from: a */
        void m4279a(int i10) {
            this.f3491a = i10 | this.f3491a;
        }

        /* renamed from: b */
        boolean m4280b() {
            int i10 = this.f3491a;
            if ((i10 & 7) != 0 && (i10 & (m4281c(this.f3494d, this.f3492b) << 0)) == 0) {
                return false;
            }
            int i11 = this.f3491a;
            if ((i11 & 112) != 0 && (i11 & (m4281c(this.f3494d, this.f3493c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f3491a;
            if ((i12 & 1792) != 0 && (i12 & (m4281c(this.f3495e, this.f3492b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f3491a;
            if ((i13 & 28672) != 0 && (i13 & (m4281c(this.f3495e, this.f3493c) << 12)) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        int m4281c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        /* renamed from: d */
        void m4282d() {
            this.f3491a = 0;
        }

        /* renamed from: e */
        void m4283e(int i10, int i11, int i12, int i13) {
            this.f3492b = i10;
            this.f3493c = i11;
            this.f3494d = i12;
            this.f3495e = i13;
        }
    }

    /* renamed from: androidx.recyclerview.widget.q$b */
    /* loaded from: classes.dex */
    interface b {
        /* renamed from: a */
        View mo3919a(int i10);

        /* renamed from: b */
        int mo3920b(View view);

        /* renamed from: c */
        int mo3921c();

        /* renamed from: d */
        int mo3922d();

        /* renamed from: e */
        int mo3923e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0830q(b bVar) {
        this.f3489a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public View m4277a(int i10, int i11, int i12, int i13) {
        int i14;
        int mo3921c = this.f3489a.mo3921c();
        int mo3922d = this.f3489a.mo3922d();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View mo3919a = this.f3489a.mo3919a(i10);
            this.f3490b.m4283e(mo3921c, mo3922d, this.f3489a.mo3920b(mo3919a), this.f3489a.mo3923e(mo3919a));
            if (i12 != 0) {
                this.f3490b.m4282d();
                this.f3490b.m4279a(i12);
                if (this.f3490b.m4280b()) {
                    return mo3919a;
                }
            }
            if (i13 != 0) {
                this.f3490b.m4282d();
                this.f3490b.m4279a(i13);
                if (this.f3490b.m4280b()) {
                    view = mo3919a;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m4278b(View view, int i10) {
        this.f3490b.m4283e(this.f3489a.mo3921c(), this.f3489a.mo3922d(), this.f3489a.mo3920b(view), this.f3489a.mo3923e(view));
        if (i10 != 0) {
            this.f3490b.m4282d();
            this.f3490b.m4279a(i10);
            return this.f3490b.m4280b();
        }
        return false;
    }
}
