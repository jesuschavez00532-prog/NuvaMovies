package p003a2;

import p003a2.InterfaceC0009e;

/* renamed from: a2.b */
/* loaded from: classes.dex */
public final class C0006b implements InterfaceC0009e, InterfaceC0008d {

    /* renamed from: a */
    private final Object f37a;

    /* renamed from: b */
    private final InterfaceC0009e f38b;

    /* renamed from: c */
    private volatile InterfaceC0008d f39c;

    /* renamed from: d */
    private volatile InterfaceC0008d f40d;

    /* renamed from: e */
    private InterfaceC0009e.a f41e;

    /* renamed from: f */
    private InterfaceC0009e.a f42f;

    public C0006b(Object obj, InterfaceC0009e interfaceC0009e) {
        InterfaceC0009e.a aVar = InterfaceC0009e.a.CLEARED;
        this.f41e = aVar;
        this.f42f = aVar;
        this.f37a = obj;
        this.f38b = interfaceC0009e;
    }

    /* renamed from: l */
    private boolean m82l(InterfaceC0008d interfaceC0008d) {
        InterfaceC0009e.a aVar;
        InterfaceC0009e.a aVar2 = this.f41e;
        InterfaceC0009e.a aVar3 = InterfaceC0009e.a.FAILED;
        if (aVar2 != aVar3) {
            return interfaceC0008d.equals(this.f39c);
        }
        if (interfaceC0008d.equals(this.f40d) && ((aVar = this.f42f) == InterfaceC0009e.a.SUCCESS || aVar == aVar3)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m83m() {
        InterfaceC0009e interfaceC0009e = this.f38b;
        if (interfaceC0009e != null && !interfaceC0009e.mo94i(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private boolean m84n() {
        InterfaceC0009e interfaceC0009e = this.f38b;
        if (interfaceC0009e != null && !interfaceC0009e.mo88c(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m85o() {
        InterfaceC0009e interfaceC0009e = this.f38b;
        if (interfaceC0009e != null && !interfaceC0009e.mo91f(this)) {
            return false;
        }
        return true;
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: a */
    public InterfaceC0009e mo86a() {
        InterfaceC0009e interfaceC0009e;
        synchronized (this.f37a) {
            InterfaceC0009e interfaceC0009e2 = this.f38b;
            if (interfaceC0009e2 != null) {
                interfaceC0009e = interfaceC0009e2.mo86a();
            } else {
                interfaceC0009e = this;
            }
        }
        return interfaceC0009e;
    }

    @Override // p003a2.InterfaceC0009e, p003a2.InterfaceC0008d
    /* renamed from: b */
    public boolean mo87b() {
        boolean z10 = false;
        synchronized (this.f37a) {
            if (!this.f39c.mo87b() && !this.f40d.mo87b()) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: c */
    public boolean mo88c(InterfaceC0008d interfaceC0008d) {
        boolean z10 = false;
        synchronized (this.f37a) {
            if (m84n() && m82l(interfaceC0008d)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0008d
    public void clear() {
        synchronized (this.f37a) {
            InterfaceC0009e.a aVar = InterfaceC0009e.a.CLEARED;
            this.f41e = aVar;
            this.f39c.clear();
            if (this.f42f != aVar) {
                this.f42f = aVar;
                this.f40d.clear();
            }
        }
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: d */
    public boolean mo89d(InterfaceC0008d interfaceC0008d) {
        if (!(interfaceC0008d instanceof C0006b)) {
            return false;
        }
        C0006b c0006b = (C0006b) interfaceC0008d;
        if (!this.f39c.mo89d(c0006b.f39c) || !this.f40d.mo89d(c0006b.f40d)) {
            return false;
        }
        return true;
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: e */
    public void mo90e(InterfaceC0008d interfaceC0008d) {
        synchronized (this.f37a) {
            if (!interfaceC0008d.equals(this.f40d)) {
                this.f41e = InterfaceC0009e.a.FAILED;
                InterfaceC0009e.a aVar = this.f42f;
                InterfaceC0009e.a aVar2 = InterfaceC0009e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f42f = aVar2;
                    this.f40d.mo93h();
                }
                return;
            }
            this.f42f = InterfaceC0009e.a.FAILED;
            InterfaceC0009e interfaceC0009e = this.f38b;
            if (interfaceC0009e != null) {
                interfaceC0009e.mo90e(this);
            }
        }
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: f */
    public boolean mo91f(InterfaceC0008d interfaceC0008d) {
        boolean m85o;
        synchronized (this.f37a) {
            m85o = m85o();
        }
        return m85o;
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: g */
    public boolean mo92g() {
        boolean z10 = false;
        synchronized (this.f37a) {
            InterfaceC0009e.a aVar = this.f41e;
            InterfaceC0009e.a aVar2 = InterfaceC0009e.a.CLEARED;
            if (aVar == aVar2 && this.f42f == aVar2) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: h */
    public void mo93h() {
        synchronized (this.f37a) {
            InterfaceC0009e.a aVar = this.f41e;
            InterfaceC0009e.a aVar2 = InterfaceC0009e.a.RUNNING;
            if (aVar != aVar2) {
                this.f41e = aVar2;
                this.f39c.mo93h();
            }
        }
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: i */
    public boolean mo94i(InterfaceC0008d interfaceC0008d) {
        boolean z10 = false;
        synchronized (this.f37a) {
            if (m83m() && interfaceC0008d.equals(this.f39c)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0008d
    public boolean isRunning() {
        boolean z10 = false;
        synchronized (this.f37a) {
            InterfaceC0009e.a aVar = this.f41e;
            InterfaceC0009e.a aVar2 = InterfaceC0009e.a.RUNNING;
            if (aVar != aVar2 && this.f42f != aVar2) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: j */
    public boolean mo95j() {
        boolean z10 = false;
        synchronized (this.f37a) {
            InterfaceC0009e.a aVar = this.f41e;
            InterfaceC0009e.a aVar2 = InterfaceC0009e.a.SUCCESS;
            if (aVar != aVar2 && this.f42f != aVar2) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: k */
    public void mo96k(InterfaceC0008d interfaceC0008d) {
        synchronized (this.f37a) {
            if (interfaceC0008d.equals(this.f39c)) {
                this.f41e = InterfaceC0009e.a.SUCCESS;
            } else if (interfaceC0008d.equals(this.f40d)) {
                this.f42f = InterfaceC0009e.a.SUCCESS;
            }
            InterfaceC0009e interfaceC0009e = this.f38b;
            if (interfaceC0009e != null) {
                interfaceC0009e.mo96k(this);
            }
        }
    }

    /* renamed from: p */
    public void m97p(InterfaceC0008d interfaceC0008d, InterfaceC0008d interfaceC0008d2) {
        this.f39c = interfaceC0008d;
        this.f40d = interfaceC0008d2;
    }

    @Override // p003a2.InterfaceC0008d
    public void pause() {
        synchronized (this.f37a) {
            InterfaceC0009e.a aVar = this.f41e;
            InterfaceC0009e.a aVar2 = InterfaceC0009e.a.RUNNING;
            if (aVar == aVar2) {
                this.f41e = InterfaceC0009e.a.PAUSED;
                this.f39c.pause();
            }
            if (this.f42f == aVar2) {
                this.f42f = InterfaceC0009e.a.PAUSED;
                this.f40d.pause();
            }
        }
    }
}
