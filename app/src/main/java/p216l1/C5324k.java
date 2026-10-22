package p216l1;

import android.util.Log;
import com.bumptech.glide.C1588e;
import com.bumptech.glide.EnumC1591h;
import java.util.Map;
import java.util.concurrent.Executor;
import p003a2.InterfaceC0013i;
import p109e2.AbstractC4117g;
import p109e2.AbstractC4121k;
import p124f2.AbstractC4219a;
import p184j1.C4977h;
import p184j1.EnumC4970a;
import p184j1.InterfaceC4975f;
import p216l1.C5329p;
import p216l1.RunnableC5321h;
import p243n1.C5724b;
import p243n1.InterfaceC5723a;
import p243n1.InterfaceC5731i;
import p256o1.ExecutorServiceC5901a;
import p373w.InterfaceC7339d;

/* renamed from: l1.k */
/* loaded from: classes.dex */
public class C5324k implements InterfaceC5326m, InterfaceC5731i.a, C5329p.a {

    /* renamed from: i */
    private static final boolean f21748i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C5332s f21749a;

    /* renamed from: b */
    private final C5328o f21750b;

    /* renamed from: c */
    private final InterfaceC5731i f21751c;

    /* renamed from: d */
    private final b f21752d;

    /* renamed from: e */
    private final C5338y f21753e;

    /* renamed from: f */
    private final c f21754f;

    /* renamed from: g */
    private final a f21755g;

    /* renamed from: h */
    private final C5314a f21756h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.k$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final RunnableC5321h.e f21757a;

        /* renamed from: b */
        final InterfaceC7339d f21758b = AbstractC4219a.m17633d(150, new C7852a());

        /* renamed from: c */
        private int f21759c;

        /* renamed from: l1.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C7852a implements AbstractC4219a.d {
            C7852a() {
            }

            @Override // p124f2.AbstractC4219a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public RunnableC5321h mo17637a() {
                a aVar = a.this;
                return new RunnableC5321h(aVar.f21757a, aVar.f21758b);
            }
        }

        a(RunnableC5321h.e eVar) {
            this.f21757a = eVar;
        }

        /* renamed from: a */
        RunnableC5321h m21548a(C1588e c1588e, Object obj, C5327n c5327n, InterfaceC4975f interfaceC4975f, int i10, int i11, Class cls, Class cls2, EnumC1591h enumC1591h, AbstractC5323j abstractC5323j, Map map, boolean z10, boolean z11, boolean z12, C4977h c4977h, RunnableC5321h.b bVar) {
            RunnableC5321h runnableC5321h = (RunnableC5321h) AbstractC4121k.m17226d((RunnableC5321h) this.f21758b.mo16818b());
            int i12 = this.f21759c;
            this.f21759c = i12 + 1;
            return runnableC5321h.m21509n(c1588e, obj, c5327n, interfaceC4975f, i10, i11, cls, cls2, enumC1591h, abstractC5323j, map, z10, z11, z12, c4977h, bVar, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.k$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final ExecutorServiceC5901a f21761a;

        /* renamed from: b */
        final ExecutorServiceC5901a f21762b;

        /* renamed from: c */
        final ExecutorServiceC5901a f21763c;

        /* renamed from: d */
        final ExecutorServiceC5901a f21764d;

        /* renamed from: e */
        final InterfaceC5326m f21765e;

        /* renamed from: f */
        final C5329p.a f21766f;

        /* renamed from: g */
        final InterfaceC7339d f21767g = AbstractC4219a.m17633d(150, new a());

        /* renamed from: l1.k$b$a */
        /* loaded from: classes.dex */
        class a implements AbstractC4219a.d {
            a() {
            }

            @Override // p124f2.AbstractC4219a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C5325l mo17637a() {
                b bVar = b.this;
                return new C5325l(bVar.f21761a, bVar.f21762b, bVar.f21763c, bVar.f21764d, bVar.f21765e, bVar.f21766f, bVar.f21767g);
            }
        }

        b(ExecutorServiceC5901a executorServiceC5901a, ExecutorServiceC5901a executorServiceC5901a2, ExecutorServiceC5901a executorServiceC5901a3, ExecutorServiceC5901a executorServiceC5901a4, InterfaceC5326m interfaceC5326m, C5329p.a aVar) {
            this.f21761a = executorServiceC5901a;
            this.f21762b = executorServiceC5901a2;
            this.f21763c = executorServiceC5901a3;
            this.f21764d = executorServiceC5901a4;
            this.f21765e = interfaceC5326m;
            this.f21766f = aVar;
        }

        /* renamed from: a */
        C5325l m21550a(InterfaceC4975f interfaceC4975f, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((C5325l) AbstractC4121k.m17226d((C5325l) this.f21767g.mo16818b())).m21562l(interfaceC4975f, z10, z11, z12, z13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.k$c */
    /* loaded from: classes.dex */
    public static class c implements RunnableC5321h.e {

        /* renamed from: a */
        private final InterfaceC5723a.a f21769a;

        /* renamed from: b */
        private volatile InterfaceC5723a f21770b;

        c(InterfaceC5723a.a aVar) {
            this.f21769a = aVar;
        }

        @Override // p216l1.RunnableC5321h.e
        /* renamed from: a */
        public InterfaceC5723a mo21520a() {
            if (this.f21770b == null) {
                synchronized (this) {
                    if (this.f21770b == null) {
                        this.f21770b = this.f21769a.mo23119a();
                    }
                    if (this.f21770b == null) {
                        this.f21770b = new C5724b();
                    }
                }
            }
            return this.f21770b;
        }
    }

    /* renamed from: l1.k$d */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a */
        private final C5325l f21771a;

        /* renamed from: b */
        private final InterfaceC0013i f21772b;

        d(InterfaceC0013i interfaceC0013i, C5325l c5325l) {
            this.f21772b = interfaceC0013i;
            this.f21771a = c5325l;
        }

        /* renamed from: a */
        public void m21552a() {
            synchronized (C5324k.this) {
                this.f21771a.m21566r(this.f21772b);
            }
        }
    }

    public C5324k(InterfaceC5731i interfaceC5731i, InterfaceC5723a.a aVar, ExecutorServiceC5901a executorServiceC5901a, ExecutorServiceC5901a executorServiceC5901a2, ExecutorServiceC5901a executorServiceC5901a3, ExecutorServiceC5901a executorServiceC5901a4, boolean z10) {
        this(interfaceC5731i, aVar, executorServiceC5901a, executorServiceC5901a2, executorServiceC5901a3, executorServiceC5901a4, null, null, null, null, null, null, z10);
    }

    /* renamed from: f */
    private C5329p m21535f(InterfaceC4975f interfaceC4975f) {
        InterfaceC5335v mo23130c = this.f21751c.mo23130c(interfaceC4975f);
        if (mo23130c == null) {
            return null;
        }
        if (mo23130c instanceof C5329p) {
            return (C5329p) mo23130c;
        }
        return new C5329p(mo23130c, true, true, interfaceC4975f, this);
    }

    /* renamed from: h */
    private C5329p m21536h(InterfaceC4975f interfaceC4975f) {
        C5329p m21452e = this.f21756h.m21452e(interfaceC4975f);
        if (m21452e != null) {
            m21452e.m21575a();
        }
        return m21452e;
    }

    /* renamed from: i */
    private C5329p m21537i(InterfaceC4975f interfaceC4975f) {
        C5329p m21535f = m21535f(interfaceC4975f);
        if (m21535f != null) {
            m21535f.m21575a();
            this.f21756h.m21448a(interfaceC4975f, m21535f);
        }
        return m21535f;
    }

    /* renamed from: j */
    private C5329p m21538j(C5327n c5327n, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        C5329p m21536h = m21536h(c5327n);
        if (m21536h != null) {
            if (f21748i) {
                m21539k("Loaded resource from active resources", j10, c5327n);
            }
            return m21536h;
        }
        C5329p m21537i = m21537i(c5327n);
        if (m21537i == null) {
            return null;
        }
        if (f21748i) {
            m21539k("Loaded resource from cache", j10, c5327n);
        }
        return m21537i;
    }

    /* renamed from: k */
    private static void m21539k(String str, long j10, InterfaceC4975f interfaceC4975f) {
        Log.v("Engine", str + " in " + AbstractC4117g.m17209a(j10) + "ms, key: " + interfaceC4975f);
    }

    /* renamed from: m */
    private d m21540m(C1588e c1588e, Object obj, InterfaceC4975f interfaceC4975f, int i10, int i11, Class cls, Class cls2, EnumC1591h enumC1591h, AbstractC5323j abstractC5323j, Map map, boolean z10, boolean z11, C4977h c4977h, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC0013i interfaceC0013i, Executor executor, C5327n c5327n, long j10) {
        C5325l m21595a = this.f21749a.m21595a(c5327n, z15);
        if (m21595a != null) {
            m21595a.m21556d(interfaceC0013i, executor);
            if (f21748i) {
                m21539k("Added to existing load", j10, c5327n);
            }
            return new d(interfaceC0013i, m21595a);
        }
        C5325l m21550a = this.f21752d.m21550a(c5327n, z12, z13, z14, z15);
        RunnableC5321h m21548a = this.f21755g.m21548a(c1588e, obj, c5327n, interfaceC4975f, i10, i11, cls, cls2, enumC1591h, abstractC5323j, map, z10, z11, z15, c4977h, m21550a);
        this.f21749a.m21596c(c5327n, m21550a);
        m21550a.m21556d(interfaceC0013i, executor);
        m21550a.m21567s(m21548a);
        if (f21748i) {
            m21539k("Started new load", j10, c5327n);
        }
        return new d(interfaceC0013i, m21550a);
    }

    @Override // p216l1.C5329p.a
    /* renamed from: a */
    public void mo21541a(InterfaceC4975f interfaceC4975f, C5329p c5329p) {
        this.f21756h.m21451d(interfaceC4975f);
        if (c5329p.m21579e()) {
            this.f21751c.mo23132e(interfaceC4975f, c5329p);
        } else {
            this.f21753e.m21607a(c5329p, false);
        }
    }

    @Override // p243n1.InterfaceC5731i.a
    /* renamed from: b */
    public void mo21542b(InterfaceC5335v interfaceC5335v) {
        this.f21753e.m21607a(interfaceC5335v, true);
    }

    @Override // p216l1.InterfaceC5326m
    /* renamed from: c */
    public synchronized void mo21543c(C5325l c5325l, InterfaceC4975f interfaceC4975f) {
        this.f21749a.m21597d(interfaceC4975f, c5325l);
    }

    @Override // p216l1.InterfaceC5326m
    /* renamed from: d */
    public synchronized void mo21544d(C5325l c5325l, InterfaceC4975f interfaceC4975f, C5329p c5329p) {
        if (c5329p != null) {
            if (c5329p.m21579e()) {
                this.f21756h.m21448a(interfaceC4975f, c5329p);
            }
        }
        this.f21749a.m21597d(interfaceC4975f, c5325l);
    }

    /* renamed from: e */
    public void m21545e() {
        this.f21754f.mo21520a().clear();
    }

    /* renamed from: g */
    public d m21546g(C1588e c1588e, Object obj, InterfaceC4975f interfaceC4975f, int i10, int i11, Class cls, Class cls2, EnumC1591h enumC1591h, AbstractC5323j abstractC5323j, Map map, boolean z10, boolean z11, C4977h c4977h, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC0013i interfaceC0013i, Executor executor) {
        long m17210b = f21748i ? AbstractC4117g.m17210b() : 0L;
        C5327n m21574a = this.f21750b.m21574a(obj, interfaceC4975f, i10, i11, map, cls, cls2, c4977h);
        synchronized (this) {
            C5329p m21538j = m21538j(m21574a, z12, m17210b);
            if (m21538j == null) {
                return m21540m(c1588e, obj, interfaceC4975f, i10, i11, cls, cls2, enumC1591h, abstractC5323j, map, z10, z11, c4977h, z12, z13, z14, z15, interfaceC0013i, executor, m21574a, m17210b);
            }
            interfaceC0013i.mo109c(m21538j, EnumC4970a.MEMORY_CACHE, false);
            return null;
        }
    }

    /* renamed from: l */
    public void m21547l(InterfaceC5335v interfaceC5335v) {
        if (interfaceC5335v instanceof C5329p) {
            ((C5329p) interfaceC5335v).m21580f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    C5324k(InterfaceC5731i interfaceC5731i, InterfaceC5723a.a aVar, ExecutorServiceC5901a executorServiceC5901a, ExecutorServiceC5901a executorServiceC5901a2, ExecutorServiceC5901a executorServiceC5901a3, ExecutorServiceC5901a executorServiceC5901a4, C5332s c5332s, C5328o c5328o, C5314a c5314a, b bVar, a aVar2, C5338y c5338y, boolean z10) {
        this.f21751c = interfaceC5731i;
        c cVar = new c(aVar);
        this.f21754f = cVar;
        C5314a c5314a2 = c5314a == null ? new C5314a(z10) : c5314a;
        this.f21756h = c5314a2;
        c5314a2.m21453f(this);
        this.f21750b = c5328o == null ? new C5328o() : c5328o;
        this.f21749a = c5332s == null ? new C5332s() : c5332s;
        this.f21752d = bVar == null ? new b(executorServiceC5901a, executorServiceC5901a2, executorServiceC5901a3, executorServiceC5901a4, this, this) : bVar;
        this.f21755g = aVar2 == null ? new a(cVar) : aVar2;
        this.f21753e = c5338y == null ? new C5338y() : c5338y;
        interfaceC5731i.mo23131d(this);
    }
}
