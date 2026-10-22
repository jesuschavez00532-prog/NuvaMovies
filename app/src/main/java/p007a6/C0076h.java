package p007a6;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.InterfaceC4229a;

/* renamed from: a6.h */
/* loaded from: classes.dex */
public class C0076h {

    /* renamed from: a */
    private final Executor f217a;

    /* renamed from: b */
    private AbstractC4245i f218b = AbstractC4250l.m17733e(null);

    /* renamed from: c */
    private final Object f219c = new Object();

    /* renamed from: d */
    private final ThreadLocal f220d = new ThreadLocal();

    /* renamed from: a6.h$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0076h.this.f220d.set(Boolean.TRUE);
        }
    }

    /* renamed from: a6.h$b */
    /* loaded from: classes.dex */
    class b implements Callable {

        /* renamed from: a */
        final /* synthetic */ Runnable f222a;

        b(Runnable runnable) {
            this.f222a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f222a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.h$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC4229a {

        /* renamed from: a */
        final /* synthetic */ Callable f224a;

        c(Callable callable) {
            this.f224a = callable;
        }

        @Override // p127f5.InterfaceC4229a
        /* renamed from: a */
        public Object mo289a(AbstractC4245i abstractC4245i) {
            return this.f224a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.h$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC4229a {
        d() {
        }

        @Override // p127f5.InterfaceC4229a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo289a(AbstractC4245i abstractC4245i) {
            return null;
        }
    }

    public C0076h(Executor executor) {
        this.f217a = executor;
        executor.execute(new a());
    }

    /* renamed from: d */
    private AbstractC4245i m280d(AbstractC4245i abstractC4245i) {
        return abstractC4245i.mo17705g(this.f217a, new d());
    }

    /* renamed from: e */
    private boolean m281e() {
        return Boolean.TRUE.equals(this.f220d.get());
    }

    /* renamed from: f */
    private InterfaceC4229a m282f(Callable callable) {
        return new c(callable);
    }

    /* renamed from: b */
    public void m283b() {
        if (m281e()) {
        } else {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor m284c() {
        return this.f217a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public AbstractC4245i m285g(Runnable runnable) {
        return m286h(new b(runnable));
    }

    /* renamed from: h */
    public AbstractC4245i m286h(Callable callable) {
        AbstractC4245i mo17705g;
        synchronized (this.f219c) {
            mo17705g = this.f218b.mo17705g(this.f217a, m282f(callable));
            this.f218b = m280d(mo17705g);
        }
        return mo17705g;
    }

    /* renamed from: i */
    public AbstractC4245i m287i(Callable callable) {
        AbstractC4245i mo17706h;
        synchronized (this.f219c) {
            mo17706h = this.f218b.mo17706h(this.f217a, m282f(callable));
            this.f218b = m280d(mo17706h);
        }
        return mo17706h;
    }
}
