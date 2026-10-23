package p216l1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p003a2.InterfaceC0013i;
import p109e2.AbstractC4115e;
import p109e2.AbstractC4121k;
import p124f2.AbstractC4219a;
import p124f2.AbstractC4221c;
import p184j1.EnumC4970a;
import p184j1.InterfaceC4975f;
import p216l1.C5329p;
import p216l1.RunnableC5321h;
import p256o1.ExecutorServiceC5901a;
import p373w.InterfaceC7339d;

/* renamed from: l1.l */
/* loaded from: classes.dex */
class C5325l implements RunnableC5321h.b, AbstractC4219a.f {

    /* renamed from: z */
    private static final c f21774z = new c();

    /* renamed from: a */
    final e f21775a;

    /* renamed from: b */
    private final AbstractC4221c f21776b;

    /* renamed from: c */
    private final C5329p.a f21777c;

    /* renamed from: d */
    private final InterfaceC7339d f21778d;

    /* renamed from: e */
    private final c f21779e;

    /* renamed from: f */
    private final InterfaceC5326m f21780f;

    /* renamed from: g */
    private final ExecutorServiceC5901a f21781g;

    /* renamed from: h */
    private final ExecutorServiceC5901a f21782h;

    /* renamed from: i */
    private final ExecutorServiceC5901a f21783i;

    /* renamed from: j */
    private final ExecutorServiceC5901a f21784j;

    /* renamed from: k */
    private final AtomicInteger f21785k;

    /* renamed from: l */
    private InterfaceC4975f f21786l;

    /* renamed from: m */
    private boolean f21787m;

    /* renamed from: n */
    private boolean f21788n;

    /* renamed from: o */
    private boolean f21789o;

    /* renamed from: p */
    private boolean f21790p;

    /* renamed from: q */
    private InterfaceC5335v f21791q;

    /* renamed from: r */
    EnumC4970a f21792r;

    /* renamed from: s */
    private boolean f21793s;

    /* renamed from: t */
    C5330q f21794t;

    /* renamed from: u */
    private boolean f21795u;

    /* renamed from: v */
    C5329p f21796v;

    /* renamed from: w */
    private RunnableC5321h f21797w;

    /* renamed from: x */
    private volatile boolean f21798x;

    /* renamed from: y */
    private boolean f21799y;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.l$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        private final InterfaceC0013i f21800a;

        a(InterfaceC0013i interfaceC0013i) {
            this.f21800a = interfaceC0013i;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f21800a.mo110f()) {
                synchronized (C5325l.this) {
                    if (C5325l.this.f21775a.m21571g(this.f21800a)) {
                        C5325l.this.m21557f(this.f21800a);
                    }
                    C5325l.this.m21560i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.l$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        private final InterfaceC0013i f21802a;

        b(InterfaceC0013i interfaceC0013i) {
            this.f21802a = interfaceC0013i;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f21802a.mo110f()) {
                synchronized (C5325l.this) {
                    if (C5325l.this.f21775a.m21571g(this.f21802a)) {
                        C5325l.this.f21796v.m21575a();
                        C5325l.this.m21558g(this.f21802a);
                        C5325l.this.m21566r(this.f21802a);
                    }
                    C5325l.this.m21560i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.l$c */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        /* renamed from: a */
        public C5329p m21568a(InterfaceC5335v interfaceC5335v, boolean z10, InterfaceC4975f interfaceC4975f, C5329p.a aVar) {
            return new C5329p(interfaceC5335v, z10, true, interfaceC4975f, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.l$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        final InterfaceC0013i f21804a;

        /* renamed from: b */
        final Executor f21805b;

        d(InterfaceC0013i interfaceC0013i, Executor executor) {
            this.f21804a = interfaceC0013i;
            this.f21805b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f21804a.equals(((d) obj).f21804a);
            }
            return false;
        }

        public int hashCode() {
            return this.f21804a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.l$e */
    /* loaded from: classes.dex */
    public static final class e implements Iterable {

        /* renamed from: a */
        private final List f21806a;

        e() {
            this(new ArrayList(2));
        }

        /* renamed from: j */
        private static d m21569j(InterfaceC0013i interfaceC0013i) {
            return new d(interfaceC0013i, AbstractC4115e.m17206a());
        }

        /* renamed from: c */
        void m21570c(InterfaceC0013i interfaceC0013i, Executor executor) {
            this.f21806a.add(new d(interfaceC0013i, executor));
        }

        void clear() {
            this.f21806a.clear();
        }

        /* renamed from: g */
        boolean m21571g(InterfaceC0013i interfaceC0013i) {
            return this.f21806a.contains(m21569j(interfaceC0013i));
        }

        /* renamed from: i */
        e m21572i() {
            return new e(new ArrayList(this.f21806a));
        }

        boolean isEmpty() {
            return this.f21806a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f21806a.iterator();
        }

        /* renamed from: k */
        void m21573k(InterfaceC0013i interfaceC0013i) {
            this.f21806a.remove(m21569j(interfaceC0013i));
        }

        int size() {
            return this.f21806a.size();
        }

        e(List list) {
            this.f21806a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5325l(ExecutorServiceC5901a executorServiceC5901a, ExecutorServiceC5901a executorServiceC5901a2, ExecutorServiceC5901a executorServiceC5901a3, ExecutorServiceC5901a executorServiceC5901a4, InterfaceC5326m interfaceC5326m, C5329p.a aVar, InterfaceC7339d interfaceC7339d) {
        this(executorServiceC5901a, executorServiceC5901a2, executorServiceC5901a3, executorServiceC5901a4, interfaceC5326m, aVar, interfaceC7339d, f21774z);
    }

    /* renamed from: j */
    private ExecutorServiceC5901a m21553j() {
        if (this.f21788n) {
            return this.f21783i;
        }
        if (this.f21789o) {
            return this.f21784j;
        }
        return this.f21782h;
    }

    /* renamed from: m */
    private boolean m21554m() {
        if (!this.f21795u && !this.f21793s && !this.f21798x) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private synchronized void m21555q() {
        if (this.f21786l != null) {
            this.f21775a.clear();
            this.f21786l = null;
            this.f21796v = null;
            this.f21791q = null;
            this.f21795u = false;
            this.f21798x = false;
            this.f21793s = false;
            this.f21799y = false;
            this.f21797w.m21511w(false);
            this.f21797w = null;
            this.f21794t = null;
            this.f21792r = null;
            this.f21778d.mo16817a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // p216l1.RunnableC5321h.b
    /* renamed from: a */
    public void mo21512a(C5330q c5330q) {
        synchronized (this) {
            this.f21794t = c5330q;
        }
        m21563n();
    }

    @Override // p216l1.RunnableC5321h.b
    /* renamed from: b */
    public void mo21513b(RunnableC5321h runnableC5321h) {
        m21553j().execute(runnableC5321h);
    }

    @Override // p216l1.RunnableC5321h.b
    /* renamed from: c */
    public void mo21514c(InterfaceC5335v interfaceC5335v, EnumC4970a enumC4970a, boolean z10) {
        synchronized (this) {
            this.f21791q = interfaceC5335v;
            this.f21792r = enumC4970a;
            this.f21799y = z10;
        }
        m21564o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void m21556d(InterfaceC0013i interfaceC0013i, Executor executor) {
        this.f21776b.mo17649c();
        this.f21775a.m21570c(interfaceC0013i, executor);
        boolean z10 = true;
        if (this.f21793s) {
            m21561k(1);
            executor.execute(new b(interfaceC0013i));
        } else if (this.f21795u) {
            m21561k(1);
            executor.execute(new a(interfaceC0013i));
        } else {
            if (this.f21798x) {
                z10 = false;
            }
            AbstractC4121k.m17223a(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // p124f2.AbstractC4219a.f
    /* renamed from: e */
    public AbstractC4221c mo17640e() {
        return this.f21776b;
    }

    /* renamed from: f */
    void m21557f(InterfaceC0013i interfaceC0013i) {
        try {
            interfaceC0013i.mo108a(this.f21794t);
        } catch (Throwable th) {
            throw new C5315b(th);
        }
    }

    /* renamed from: g */
    void m21558g(InterfaceC0013i interfaceC0013i) {
        try {
            interfaceC0013i.mo109c(this.f21796v, this.f21792r, this.f21799y);
        } catch (Throwable th) {
            throw new C5315b(th);
        }
    }

    /* renamed from: h */
    void m21559h() {
        if (m21554m()) {
            return;
        }
        this.f21798x = true;
        this.f21797w.m21507a();
        this.f21780f.mo21543c(this, this.f21786l);
    }

    /* renamed from: i */
    void m21560i() {
        boolean z10 = false;
        C5329p c5329p;
        synchronized (this) {
            this.f21776b.mo17649c();
            AbstractC4121k.m17223a(m21554m(), "Not yet complete!");
            int decrementAndGet = this.f21785k.decrementAndGet();
            if (decrementAndGet >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC4121k.m17223a(z10, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                c5329p = this.f21796v;
                m21555q();
            } else {
                c5329p = null;
            }
        }
        if (c5329p != null) {
            c5329p.m21580f();
        }
    }

    /* renamed from: k */
    synchronized void m21561k(int i10) {
        C5329p c5329p;
        AbstractC4121k.m17223a(m21554m(), "Not yet complete!");
        if (this.f21785k.getAndAdd(i10) == 0 && (c5329p = this.f21796v) != null) {
            c5329p.m21575a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized C5325l m21562l(InterfaceC4975f interfaceC4975f, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f21786l = interfaceC4975f;
        this.f21787m = z10;
        this.f21788n = z11;
        this.f21789o = z12;
        this.f21790p = z13;
        return this;
    }

    /* renamed from: n */
    void m21563n() {
        synchronized (this) {
            this.f21776b.mo17649c();
            if (this.f21798x) {
                m21555q();
                return;
            }
            if (!this.f21775a.isEmpty()) {
                if (!this.f21795u) {
                    this.f21795u = true;
                    InterfaceC4975f interfaceC4975f = this.f21786l;
                    e m21572i = this.f21775a.m21572i();
                    m21561k(m21572i.size() + 1);
                    this.f21780f.mo21544d(this, interfaceC4975f, null);
                    Iterator it = m21572i.iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        dVar.f21805b.execute(new a(dVar.f21804a));
                    }
                    m21560i();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            }
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        }
    }

    /* renamed from: o */
    void m21564o() {
        synchronized (this) {
            this.f21776b.mo17649c();
            if (this.f21798x) {
                this.f21791q.mo21576b();
                m21555q();
                return;
            }
            if (!this.f21775a.isEmpty()) {
                if (!this.f21793s) {
                    this.f21796v = this.f21779e.m21568a(this.f21791q, this.f21787m, this.f21786l, this.f21777c);
                    this.f21793s = true;
                    e m21572i = this.f21775a.m21572i();
                    m21561k(m21572i.size() + 1);
                    this.f21780f.mo21544d(this, this.f21786l, this.f21796v);
                    Iterator it = m21572i.iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        dVar.f21805b.execute(new b(dVar.f21804a));
                    }
                    m21560i();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            }
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m21565p() {
        return this.f21790p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized void m21566r(InterfaceC0013i interfaceC0013i) {
        boolean z10 = false;
        this.f21776b.mo17649c();
        this.f21775a.m21573k(interfaceC0013i);
        if (this.f21775a.isEmpty()) {
            m21559h();
            if (!this.f21793s && !this.f21795u) {
                z10 = false;
                if (z10 && this.f21785k.get() == 0) {
                    m21555q();
                }
            }
            z10 = true;
            if (z10) {
                m21555q();
            }
        }
    }

    /* renamed from: s */
    public synchronized void m21567s(RunnableC5321h runnableC5321h) {
        ExecutorServiceC5901a m21553j;
        this.f21797w = runnableC5321h;
        if (runnableC5321h.m21506D()) {
            m21553j = this.f21781g;
        } else {
            m21553j = m21553j();
        }
        m21553j.execute(runnableC5321h);
    }

    C5325l(ExecutorServiceC5901a executorServiceC5901a, ExecutorServiceC5901a executorServiceC5901a2, ExecutorServiceC5901a executorServiceC5901a3, ExecutorServiceC5901a executorServiceC5901a4, InterfaceC5326m interfaceC5326m, C5329p.a aVar, InterfaceC7339d interfaceC7339d, c cVar) {
        this.f21775a = new e();
        this.f21776b = AbstractC4221c.m17647a();
        this.f21785k = new AtomicInteger();
        this.f21781g = executorServiceC5901a;
        this.f21782h = executorServiceC5901a2;
        this.f21783i = executorServiceC5901a3;
        this.f21784j = executorServiceC5901a4;
        this.f21780f = interfaceC5326m;
        this.f21777c = aVar;
        this.f21778d = interfaceC7339d;
        this.f21779e = cVar;
    }
}
