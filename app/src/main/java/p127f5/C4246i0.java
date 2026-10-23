package p127f5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f5.i0 */
/* loaded from: classes.dex */
public final class C4246i0 extends AbstractC4245i {

    /* renamed from: a */
    private final Object f18540a = new Object();

    /* renamed from: b */
    private final C4240f0 f18541b = new C4240f0();

    /* renamed from: c */
    private boolean f18542c;

    /* renamed from: d */
    private volatile boolean f18543d;

    /* renamed from: e */
    private Object f18544e;

    /* renamed from: f */
    private Exception f18545f;

    /* renamed from: v */
    private final void m17715v() {
        AbstractC5391n.m21787m(this.f18542c, "Task is not yet complete");
    }

    /* renamed from: w */
    private final void m17716w() {
        if (!this.f18543d) {
        } else {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: x */
    private final void m17717x() {
        if (!this.f18542c) {
        } else {
            throw C4231b.m17690a(this);
        }
    }

    /* renamed from: y */
    private final void m17718y() {
        synchronized (this.f18540a) {
            if (!this.f18542c) {
                return;
            }
            this.f18541b.m17698b(this);
        }
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: a */
    public final AbstractC4245i mo17699a(Executor executor, InterfaceC4233c interfaceC4233c) {
        this.f18541b.m17697a(new C4260v(executor, interfaceC4233c));
        m17718y();
        return this;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: b */
    public final AbstractC4245i mo17700b(InterfaceC4235d interfaceC4235d) {
        this.f18541b.m17697a(new C4262x(AbstractC4249k.f18549a, interfaceC4235d));
        m17718y();
        return this;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: c */
    public final AbstractC4245i mo17701c(Executor executor, InterfaceC4235d interfaceC4235d) {
        this.f18541b.m17697a(new C4262x(executor, interfaceC4235d));
        m17718y();
        return this;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: d */
    public final AbstractC4245i mo17702d(Executor executor, InterfaceC4237e interfaceC4237e) {
        this.f18541b.m17697a(new C4264z(executor, interfaceC4237e));
        m17718y();
        return this;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: e */
    public final AbstractC4245i mo17703e(Executor executor, InterfaceC4239f interfaceC4239f) {
        this.f18541b.m17697a(new C4232b0(executor, interfaceC4239f));
        m17718y();
        return this;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: f */
    public final AbstractC4245i mo17704f(InterfaceC4229a interfaceC4229a) {
        return mo17705g(AbstractC4249k.f18549a, interfaceC4229a);
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: g */
    public final AbstractC4245i mo17705g(Executor executor, InterfaceC4229a interfaceC4229a) {
        C4246i0 c4246i0 = new C4246i0();
        this.f18541b.m17697a(new C4256r(executor, interfaceC4229a, c4246i0));
        m17718y();
        return c4246i0;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: h */
    public final AbstractC4245i mo17706h(Executor executor, InterfaceC4229a interfaceC4229a) {
        C4246i0 c4246i0 = new C4246i0();
        this.f18541b.m17697a(new C4258t(executor, interfaceC4229a, c4246i0));
        m17718y();
        return c4246i0;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: i */
    public final Exception mo17707i() {
        Exception exc = null;
        synchronized (this.f18540a) {
            exc = this.f18545f;
        }
        return exc;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: j */
    public final Object mo17708j() {
        Object obj;
        synchronized (this.f18540a) {
            m17715v();
            m17716w();
            Exception exc = this.f18545f;
            if (exc == null) {
                obj = this.f18544e;
            } else {
                throw new C4241g(exc);
            }
        }
        return obj;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: k */
    public final Object mo17709k(Class cls) {
        Object obj;
        synchronized (this.f18540a) {
            m17715v();
            m17716w();
            if (!cls.isInstance(this.f18545f)) {
                Exception exc = this.f18545f;
                if (exc == null) {
                    obj = this.f18544e;
                } else {
                    throw new C4241g(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f18545f));
            }
        }
        return obj;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: l */
    public final boolean mo17710l() {
        return this.f18543d;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: m */
    public final boolean mo17711m() {
        boolean z10;
        synchronized (this.f18540a) {
            z10 = this.f18542c;
        }
        return z10;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: n */
    public final boolean mo17712n() {
        boolean z10;
        synchronized (this.f18540a) {
            z10 = false;
            if (this.f18542c && !this.f18543d && this.f18545f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: o */
    public final AbstractC4245i mo17713o(InterfaceC4243h interfaceC4243h) {
        Executor executor = AbstractC4249k.f18549a;
        C4246i0 c4246i0 = new C4246i0();
        this.f18541b.m17697a(new C4236d0(executor, interfaceC4243h, c4246i0));
        m17718y();
        return c4246i0;
    }

    @Override // p127f5.AbstractC4245i
    /* renamed from: p */
    public final AbstractC4245i mo17714p(Executor executor, InterfaceC4243h interfaceC4243h) {
        C4246i0 c4246i0 = new C4246i0();
        this.f18541b.m17697a(new C4236d0(executor, interfaceC4243h, c4246i0));
        m17718y();
        return c4246i0;
    }

    /* renamed from: q */
    public final void m17719q(Exception exc) {
        AbstractC5391n.m21784j(exc, "Exception must not be null");
        synchronized (this.f18540a) {
            m17717x();
            this.f18542c = true;
            this.f18545f = exc;
        }
        this.f18541b.m17698b(this);
    }

    /* renamed from: r */
    public final void m17720r(Object obj) {
        synchronized (this.f18540a) {
            m17717x();
            this.f18542c = true;
            this.f18544e = obj;
        }
        this.f18541b.m17698b(this);
    }

    /* renamed from: s */
    public final boolean m17721s() {
        synchronized (this.f18540a) {
            if (this.f18542c) {
                return false;
            }
            this.f18542c = true;
            this.f18543d = true;
            this.f18541b.m17698b(this);
            return true;
        }
    }

    /* renamed from: t */
    public final boolean m17722t(Exception exc) {
        AbstractC5391n.m21784j(exc, "Exception must not be null");
        synchronized (this.f18540a) {
            if (this.f18542c) {
                return false;
            }
            this.f18542c = true;
            this.f18545f = exc;
            this.f18541b.m17698b(this);
            return true;
        }
    }

    /* renamed from: u */
    public final boolean m17723u(Object obj) {
        synchronized (this.f18540a) {
            if (this.f18542c) {
                return false;
            }
            this.f18542c = true;
            this.f18544e = obj;
            this.f18541b.m17698b(this);
            return true;
        }
    }
}
