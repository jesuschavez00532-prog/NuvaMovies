package p003a2;

import p003a2.InterfaceC0009e;

/* renamed from: a2.k */
/* loaded from: classes.dex */
public class C0015k implements InterfaceC0009e, InterfaceC0008d {

    /* renamed from: a */
    private final InterfaceC0009e f99a;

    /* renamed from: b */
    private final Object f100b;

    /* renamed from: c */
    private volatile InterfaceC0008d f101c;

    /* renamed from: d */
    private volatile InterfaceC0008d f102d;

    /* renamed from: e */
    private InterfaceC0009e.a f103e;

    /* renamed from: f */
    private InterfaceC0009e.a f104f;

    /* renamed from: g */
    private boolean f105g;

    public C0015k(Object obj, InterfaceC0009e interfaceC0009e) {
        InterfaceC0009e.a aVar = InterfaceC0009e.a.CLEARED;
        this.f103e = aVar;
        this.f104f = aVar;
        this.f100b = obj;
        this.f99a = interfaceC0009e;
    }

    /* renamed from: l */
    private boolean m132l() {
        InterfaceC0009e interfaceC0009e = this.f99a;
        if (interfaceC0009e != null && !interfaceC0009e.mo94i(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m133m() {
        InterfaceC0009e interfaceC0009e = this.f99a;
        if (interfaceC0009e != null && !interfaceC0009e.mo88c(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private boolean m134n() {
        InterfaceC0009e interfaceC0009e = this.f99a;
        if (interfaceC0009e != null && !interfaceC0009e.mo91f(this)) {
            return false;
        }
        return true;
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: a */
    public InterfaceC0009e mo86a() {
        InterfaceC0009e interfaceC0009e;
        synchronized (this.f100b) {
            InterfaceC0009e interfaceC0009e2 = this.f99a;
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
        boolean z10;
        synchronized (this.f100b) {
            if (!this.f102d.mo87b() && !this.f101c.mo87b()) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: c */
    public boolean mo88c(InterfaceC0008d interfaceC0008d) {
        boolean z10;
        synchronized (this.f100b) {
            if (m133m() && interfaceC0008d.equals(this.f101c) && !mo87b()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0008d
    public void clear() {
        synchronized (this.f100b) {
            this.f105g = false;
            InterfaceC0009e.a aVar = InterfaceC0009e.a.CLEARED;
            this.f103e = aVar;
            this.f104f = aVar;
            this.f102d.clear();
            this.f101c.clear();
        }
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: d */
    public boolean mo89d(InterfaceC0008d interfaceC0008d) {
        if (!(interfaceC0008d instanceof C0015k)) {
            return false;
        }
        C0015k c0015k = (C0015k) interfaceC0008d;
        if (this.f101c == null) {
            if (c0015k.f101c != null) {
                return false;
            }
        } else if (!this.f101c.mo89d(c0015k.f101c)) {
            return false;
        }
        if (this.f102d == null) {
            if (c0015k.f102d != null) {
                return false;
            }
        } else if (!this.f102d.mo89d(c0015k.f102d)) {
            return false;
        }
        return true;
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: e */
    public void mo90e(InterfaceC0008d interfaceC0008d) {
        synchronized (this.f100b) {
            if (!interfaceC0008d.equals(this.f101c)) {
                this.f104f = InterfaceC0009e.a.FAILED;
                return;
            }
            this.f103e = InterfaceC0009e.a.FAILED;
            InterfaceC0009e interfaceC0009e = this.f99a;
            if (interfaceC0009e != null) {
                interfaceC0009e.mo90e(this);
            }
        }
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: f */
    public boolean mo91f(InterfaceC0008d interfaceC0008d) {
        boolean z10;
        synchronized (this.f100b) {
            if (m134n() && (interfaceC0008d.equals(this.f101c) || this.f103e != InterfaceC0009e.a.SUCCESS)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: g */
    public boolean mo92g() {
        boolean z10;
        synchronized (this.f100b) {
            if (this.f103e == InterfaceC0009e.a.CLEARED) {
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
        synchronized (this.f100b) {
            this.f105g = true;
            try {
                if (this.f103e != InterfaceC0009e.a.SUCCESS) {
                    InterfaceC0009e.a aVar = this.f104f;
                    InterfaceC0009e.a aVar2 = InterfaceC0009e.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f104f = aVar2;
                        this.f102d.mo93h();
                    }
                }
                if (this.f105g) {
                    InterfaceC0009e.a aVar3 = this.f103e;
                    InterfaceC0009e.a aVar4 = InterfaceC0009e.a.RUNNING;
                    if (aVar3 != aVar4) {
                        this.f103e = aVar4;
                        this.f101c.mo93h();
                    }
                }
            } finally {
                this.f105g = false;
            }
        }
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: i */
    public boolean mo94i(InterfaceC0008d interfaceC0008d) {
        boolean z10;
        synchronized (this.f100b) {
            if (m132l() && interfaceC0008d.equals(this.f101c) && this.f103e != InterfaceC0009e.a.PAUSED) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0008d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f100b) {
            if (this.f103e == InterfaceC0009e.a.RUNNING) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: j */
    public boolean mo95j() {
        boolean z10;
        synchronized (this.f100b) {
            if (this.f103e == InterfaceC0009e.a.SUCCESS) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0009e
    /* renamed from: k */
    public void mo96k(InterfaceC0008d interfaceC0008d) {
        synchronized (this.f100b) {
            if (interfaceC0008d.equals(this.f102d)) {
                this.f104f = InterfaceC0009e.a.SUCCESS;
                return;
            }
            this.f103e = InterfaceC0009e.a.SUCCESS;
            InterfaceC0009e interfaceC0009e = this.f99a;
            if (interfaceC0009e != null) {
                interfaceC0009e.mo96k(this);
            }
            if (!this.f104f.m99b()) {
                this.f102d.clear();
            }
        }
    }

    /* renamed from: o */
    public void m135o(InterfaceC0008d interfaceC0008d, InterfaceC0008d interfaceC0008d2) {
        this.f101c = interfaceC0008d;
        this.f102d = interfaceC0008d2;
    }

    @Override // p003a2.InterfaceC0008d
    public void pause() {
        synchronized (this.f100b) {
            if (!this.f104f.m99b()) {
                this.f104f = InterfaceC0009e.a.PAUSED;
                this.f102d.pause();
            }
            if (!this.f103e.m99b()) {
                this.f103e = InterfaceC0009e.a.PAUSED;
                this.f101c.pause();
            }
        }
    }
}
