package kotlinx.coroutines.scheduling;

import be.C1328x;
import com.umeng.analytics.pro.C3325bt;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.C5280s;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import pe.AbstractC6291c;
import re.AbstractC6578f;
import ve.AbstractC7273e0;
import ve.AbstractC7319t1;

/* renamed from: kotlinx.coroutines.scheduling.a */
/* loaded from: classes3.dex */
public final class ExecutorC5288a implements Executor, Closeable {
    private volatile int _isTerminated;

    /* renamed from: a */
    public final C5292e f21523a;

    /* renamed from: b */
    public final C5292e f21524b;

    /* renamed from: c */
    public final AtomicReferenceArray f21525c;
    volatile long controlState;

    /* renamed from: d */
    public final int f21526d;

    /* renamed from: e */
    public final int f21527e;

    /* renamed from: f */
    public final long f21528f;

    /* renamed from: g */
    public final String f21529g;
    private volatile long parkedWorkersStack;

    /* renamed from: l */
    public static final a f21522l = new a(null);

    /* renamed from: k */
    public static final C5280s f21521k = new C5280s("NOT_IN_STACK");

    /* renamed from: h */
    private static final AtomicLongFieldUpdater f21518h = AtomicLongFieldUpdater.newUpdater(ExecutorC5288a.class, "parkedWorkersStack");

    /* renamed from: i */
    static final AtomicLongFieldUpdater f21519i = AtomicLongFieldUpdater.newUpdater(ExecutorC5288a.class, "controlState");

    /* renamed from: j */
    private static final AtomicIntegerFieldUpdater f21520j = AtomicIntegerFieldUpdater.newUpdater(ExecutorC5288a.class, "_isTerminated");

    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$c */
    /* loaded from: classes3.dex */
    public enum c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public ExecutorC5288a(int i10, int i11, long j10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        this.f21526d = i10;
        this.f21527e = i11;
        this.f21528f = j10;
        this.f21529g = str;
        if (i10 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= 2097150) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (j10 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        this.f21523a = new C5292e();
                        this.f21524b = new C5292e();
                        this.parkedWorkersStack = 0L;
                        this.f21525c = new AtomicReferenceArray(i11 + 1);
                        this.controlState = i10 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
    }

    /* renamed from: A */
    private final boolean m21288A(long j10) {
        int m25673a;
        m25673a = AbstractC6578f.m25673a(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0);
        if (m25673a < this.f21526d) {
            int m21293c = m21293c();
            if (m21293c == 1 && this.f21526d > 1) {
                m21293c();
            }
            if (m21293c > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    static /* synthetic */ boolean m21289B(ExecutorC5288a executorC5288a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = executorC5288a.controlState;
        }
        return executorC5288a.m21288A(j10);
    }

    /* renamed from: C */
    private final boolean m21290C() {
        b m21298n;
        do {
            m21298n = m21298n();
            if (m21298n == null) {
                return false;
            }
        } while (!b.f21530h.compareAndSet(m21298n, -1, 0));
        LockSupport.unpark(m21298n);
        return true;
    }

    /* renamed from: b */
    private final boolean m21292b(AbstractRunnableC5296i abstractRunnableC5296i) {
        boolean z10 = true;
        if (abstractRunnableC5296i.f21562b.mo21333l() != 1) {
            z10 = false;
        }
        if (z10) {
            return this.f21524b.m21211a(abstractRunnableC5296i);
        }
        return this.f21523a.m21211a(abstractRunnableC5296i);
    }

    /* renamed from: c */
    private final int m21293c() {
        int m25673a;
        boolean z10;
        synchronized (this.f21525c) {
            if (isTerminated()) {
                return -1;
            }
            long j10 = this.controlState;
            int i10 = (int) (j10 & 2097151);
            boolean z11 = false;
            m25673a = AbstractC6578f.m25673a(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (m25673a >= this.f21526d) {
                return 0;
            }
            if (i10 >= this.f21527e) {
                return 0;
            }
            int i11 = ((int) (this.controlState & 2097151)) + 1;
            if (i11 > 0 && this.f21525c.get(i11) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b bVar = new b(this, i11);
                this.f21525c.set(i11, bVar);
                if (i11 == ((int) (2097151 & f21519i.incrementAndGet(this)))) {
                    z11 = true;
                }
                if (z11) {
                    bVar.start();
                    return m25673a + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: e */
    private final b m21294e() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof b)) {
            currentThread = null;
        }
        b bVar = (b) currentThread;
        if (bVar == null || !AbstractC5868k.m23669a(ExecutorC5288a.this, this)) {
            return null;
        }
        return bVar;
    }

    /* renamed from: h */
    public static /* synthetic */ void m21295h(ExecutorC5288a executorC5288a, Runnable runnable, InterfaceC5297j interfaceC5297j, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC5297j = C5295h.f21560b;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        executorC5288a.m21302f(runnable, interfaceC5297j, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final int m21296l() {
        return (int) (this.controlState & 2097151);
    }

    /* renamed from: m */
    private final int m21297m(b bVar) {
        Object m21323g = bVar.m21323g();
        while (m21323g != f21521k) {
            if (m21323g == null) {
                return 0;
            }
            b bVar2 = (b) m21323g;
            int m21322f = bVar2.m21322f();
            if (m21322f != 0) {
                return m21322f;
            }
            m21323g = bVar2.m21323g();
        }
        return -1;
    }

    /* renamed from: n */
    private final b m21298n() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            b bVar = (b) this.f21525c.get((int) (2097151 & j10));
            if (bVar != null) {
                long j11 = (2097152 + j10) & (-2097152);
                int m21297m = m21297m(bVar);
                if (m21297m >= 0 && f21518h.compareAndSet(this, j10, m21297m | j11)) {
                    bVar.m21326o(f21521k);
                    return bVar;
                }
            } else {
                return null;
            }
        }
    }

    /* renamed from: x */
    private final void m21299x(boolean z10) {
        long addAndGet = f21519i.addAndGet(this, 2097152L);
        if (z10 || m21290C() || m21288A(addAndGet)) {
            return;
        }
        m21290C();
    }

    /* renamed from: z */
    private final AbstractRunnableC5296i m21300z(b bVar, AbstractRunnableC5296i abstractRunnableC5296i, boolean z10) {
        if (bVar == null) {
            return abstractRunnableC5296i;
        }
        if (bVar.f21532b == c.TERMINATED) {
            return abstractRunnableC5296i;
        }
        if (abstractRunnableC5296i.f21562b.mo21333l() == 0 && bVar.f21532b == c.BLOCKING) {
            return abstractRunnableC5296i;
        }
        bVar.f21536f = true;
        return bVar.f21531a.m21342a(abstractRunnableC5296i, z10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m21306t(10000L);
    }

    /* renamed from: d */
    public final AbstractRunnableC5296i m21301d(Runnable runnable, InterfaceC5297j interfaceC5297j) {
        long mo21334a = AbstractC5299l.f21569f.mo21334a();
        if (runnable instanceof AbstractRunnableC5296i) {
            AbstractRunnableC5296i abstractRunnableC5296i = (AbstractRunnableC5296i) runnable;
            abstractRunnableC5296i.f21561a = mo21334a;
            abstractRunnableC5296i.f21562b = interfaceC5297j;
            return abstractRunnableC5296i;
        }
        return new C5298k(runnable, mo21334a, interfaceC5297j);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m21295h(this, runnable, null, false, 6, null);
    }

    /* renamed from: f */
    public final void m21302f(Runnable runnable, InterfaceC5297j interfaceC5297j, boolean z10) {
        boolean z11;
        AbstractC7319t1.m28299a();
        AbstractRunnableC5296i m21301d = m21301d(runnable, interfaceC5297j);
        b m21294e = m21294e();
        AbstractRunnableC5296i m21300z = m21300z(m21294e, m21301d, z10);
        if (m21300z != null && !m21292b(m21300z)) {
            throw new RejectedExecutionException(this.f21529g + " was terminated");
        }
        if (z10 && m21294e != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m21301d.f21562b.mo21333l() == 0) {
            if (z11) {
                return;
            }
            m21307y();
            return;
        }
        m21299x(z11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: q */
    public final boolean m21303q(b bVar) {
        long j10;
        int m21322f;
        if (bVar.m21323g() != f21521k) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            m21322f = bVar.m21322f();
            bVar.m21326o(this.f21525c.get((int) (2097151 & j10)));
        } while (!f21518h.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | m21322f));
        return true;
    }

    /* renamed from: r */
    public final void m21304r(b bVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    i12 = m21297m(bVar);
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0 && f21518h.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    /* renamed from: s */
    public final void m21305s(AbstractRunnableC5296i abstractRunnableC5296i) {
        try {
            abstractRunnableC5296i.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r8 != null) goto L26;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m21306t(long r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.ExecutorC5288a.f21520j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.scheduling.a$b r0 = r7.m21294e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r7.f21525c
            monitor-enter(r1)
            long r3 = r7.controlState     // Catch: java.lang.Throwable -> L7d
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r4 = (int) r3
            monitor-exit(r1)
            if (r2 > r4) goto L43
            r1 = 1
        L1d:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r7.f21525c
            java.lang.Object r3 = r3.get(r1)
            ne.AbstractC5868k.m23671c(r3)
            kotlinx.coroutines.scheduling.a$b r3 = (kotlinx.coroutines.scheduling.ExecutorC5288a.b) r3
            if (r3 == r0) goto L3e
        L2a:
            boolean r5 = r3.isAlive()
            if (r5 == 0) goto L37
            java.util.concurrent.locks.LockSupport.unpark(r3)
            r3.join(r8)
            goto L2a
        L37:
            kotlinx.coroutines.scheduling.o r3 = r3.f21531a
            kotlinx.coroutines.scheduling.e r5 = r7.f21524b
            r3.m21345g(r5)
        L3e:
            if (r1 == r4) goto L43
            int r1 = r1 + 1
            goto L1d
        L43:
            kotlinx.coroutines.scheduling.e r8 = r7.f21524b
            r8.m21212b()
            kotlinx.coroutines.scheduling.e r8 = r7.f21523a
            r8.m21212b()
        L4d:
            if (r0 == 0) goto L56
            kotlinx.coroutines.scheduling.i r8 = r0.m21321e(r2)
            if (r8 == 0) goto L56
            goto L5e
        L56:
            kotlinx.coroutines.scheduling.e r8 = r7.f21523a
            java.lang.Object r8 = r8.m21214d()
            kotlinx.coroutines.scheduling.i r8 = (kotlinx.coroutines.scheduling.AbstractRunnableC5296i) r8
        L5e:
            if (r8 == 0) goto L61
            goto L69
        L61:
            kotlinx.coroutines.scheduling.e r8 = r7.f21524b
            java.lang.Object r8 = r8.m21214d()
            kotlinx.coroutines.scheduling.i r8 = (kotlinx.coroutines.scheduling.AbstractRunnableC5296i) r8
        L69:
            if (r8 == 0) goto L6f
            r7.m21305s(r8)
            goto L4d
        L6f:
            if (r0 == 0) goto L76
            kotlinx.coroutines.scheduling.a$c r8 = kotlinx.coroutines.scheduling.ExecutorC5288a.c.TERMINATED
            r0.m21327r(r8)
        L76:
            r8 = 0
            r7.parkedWorkersStack = r8
            r7.controlState = r8
            return
        L7d:
            r8 = move-exception
            monitor-exit(r1)
            goto L81
        L80:
            throw r8
        L81:
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.ExecutorC5288a.m21306t(long):void");
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.f21525c.length();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < length; i15++) {
            b bVar = (b) this.f21525c.get(i15);
            if (bVar != null) {
                int m21344f = bVar.f21531a.m21344f();
                int i16 = AbstractC5289b.f21544a[bVar.f21532b.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 != 4) {
                                if (i16 == 5) {
                                    i14++;
                                }
                            } else {
                                i13++;
                                if (m21344f > 0) {
                                    arrayList.add(String.valueOf(m21344f) + "d");
                                }
                            }
                        } else {
                            i10++;
                            arrayList.add(String.valueOf(m21344f) + C3325bt.f14194aL);
                        }
                    } else {
                        i11++;
                        arrayList.add(String.valueOf(m21344f) + "b");
                    }
                } else {
                    i12++;
                }
            }
        }
        long j10 = this.controlState;
        return this.f21529g + '@' + AbstractC7273e0.m28128b(this) + "[Pool Size {core = " + this.f21526d + ", max = " + this.f21527e + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f21523a.m21213c() + ", global blocking queue size = " + this.f21524b.m21213c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f21526d - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* renamed from: y */
    public final void m21307y() {
        if (m21290C() || m21289B(this, 0L, 1, null)) {
            return;
        }
        m21290C();
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$b */
    /* loaded from: classes3.dex */
    public final class b extends Thread {

        /* renamed from: h */
        static final AtomicIntegerFieldUpdater f21530h = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");

        /* renamed from: a */
        public final C5302o f21531a;

        /* renamed from: b */
        public c f21532b;

        /* renamed from: c */
        private long f21533c;

        /* renamed from: d */
        private long f21534d;

        /* renamed from: e */
        private int f21535e;

        /* renamed from: f */
        public boolean f21536f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile int workerCtl;

        private b() {
            setDaemon(true);
            this.f21531a = new C5302o();
            this.f21532b = c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = ExecutorC5288a.f21521k;
            this.f21535e = AbstractC6291c.f24632a.mo25031b();
        }

        /* renamed from: a */
        private final void m21308a(int i10) {
            if (i10 == 0) {
                return;
            }
            ExecutorC5288a.f21519i.addAndGet(ExecutorC5288a.this, -2097152L);
            if (this.f21532b != c.TERMINATED) {
                this.f21532b = c.DORMANT;
            }
        }

        /* renamed from: b */
        private final void m21309b(int i10) {
            if (i10 != 0 && m21327r(c.BLOCKING)) {
                ExecutorC5288a.this.m21307y();
            }
        }

        /* renamed from: c */
        private final void m21310c(AbstractRunnableC5296i abstractRunnableC5296i) {
            int mo21333l = abstractRunnableC5296i.f21562b.mo21333l();
            m21312h(mo21333l);
            m21309b(mo21333l);
            ExecutorC5288a.this.m21305s(abstractRunnableC5296i);
            m21308a(mo21333l);
        }

        /* renamed from: d */
        private final AbstractRunnableC5296i m21311d(boolean z10) {
            boolean z11;
            AbstractRunnableC5296i m21315l;
            AbstractRunnableC5296i m21315l2;
            if (z10) {
                if (m21324j(ExecutorC5288a.this.f21526d * 2) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (m21315l2 = m21315l()) != null) {
                    return m21315l2;
                }
                AbstractRunnableC5296i m21346h = this.f21531a.m21346h();
                if (m21346h != null) {
                    return m21346h;
                }
                if (!z11 && (m21315l = m21315l()) != null) {
                    return m21315l;
                }
            } else {
                AbstractRunnableC5296i m21315l3 = m21315l();
                if (m21315l3 != null) {
                    return m21315l3;
                }
            }
            return m21319s(false);
        }

        /* renamed from: h */
        private final void m21312h(int i10) {
            this.f21533c = 0L;
            if (this.f21532b == c.PARKING) {
                this.f21532b = c.BLOCKING;
            }
        }

        /* renamed from: i */
        private final boolean m21313i() {
            if (this.nextParkedWorker != ExecutorC5288a.f21521k) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        private final void m21314k() {
            if (this.f21533c == 0) {
                this.f21533c = System.nanoTime() + ExecutorC5288a.this.f21528f;
            }
            LockSupport.parkNanos(ExecutorC5288a.this.f21528f);
            if (System.nanoTime() - this.f21533c >= 0) {
                this.f21533c = 0L;
                m21320t();
            }
        }

        /* renamed from: l */
        private final AbstractRunnableC5296i m21315l() {
            if (m21324j(2) == 0) {
                AbstractRunnableC5296i abstractRunnableC5296i = (AbstractRunnableC5296i) ExecutorC5288a.this.f21523a.m21214d();
                if (abstractRunnableC5296i != null) {
                    return abstractRunnableC5296i;
                }
                return (AbstractRunnableC5296i) ExecutorC5288a.this.f21524b.m21214d();
            }
            AbstractRunnableC5296i abstractRunnableC5296i2 = (AbstractRunnableC5296i) ExecutorC5288a.this.f21524b.m21214d();
            if (abstractRunnableC5296i2 != null) {
                return abstractRunnableC5296i2;
            }
            return (AbstractRunnableC5296i) ExecutorC5288a.this.f21523a.m21214d();
        }

        /* renamed from: m */
        private final void m21316m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!ExecutorC5288a.this.isTerminated() && this.f21532b != c.TERMINATED) {
                    AbstractRunnableC5296i m21321e = m21321e(this.f21536f);
                    if (m21321e != null) {
                        this.f21534d = 0L;
                        m21310c(m21321e);
                    } else {
                        this.f21536f = false;
                        if (this.f21534d != 0) {
                            if (!z10) {
                                z10 = true;
                            } else {
                                m21327r(c.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f21534d);
                                this.f21534d = 0L;
                            }
                        } else {
                            m21318q();
                        }
                    }
                }
            }
            m21327r(c.TERMINATED);
        }

        /* renamed from: p */
        private final boolean m21317p() {
            boolean z10;
            if (this.f21532b == c.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC5288a executorC5288a = ExecutorC5288a.this;
            while (true) {
                long j10 = executorC5288a.controlState;
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    z10 = false;
                    break;
                }
                if (ExecutorC5288a.f21519i.compareAndSet(executorC5288a, j10, j10 - 4398046511104L)) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                this.f21532b = c.CPU_ACQUIRED;
                return true;
            }
            return false;
        }

        /* renamed from: q */
        private final void m21318q() {
            if (!m21313i()) {
                ExecutorC5288a.this.m21303q(this);
                return;
            }
            this.workerCtl = -1;
            while (m21313i() && this.workerCtl == -1 && !ExecutorC5288a.this.isTerminated() && this.f21532b != c.TERMINATED) {
                m21327r(c.PARKING);
                Thread.interrupted();
                m21314k();
            }
        }

        /* renamed from: s */
        private final AbstractRunnableC5296i m21319s(boolean z10) {
            long m21348l;
            int m21296l = ExecutorC5288a.this.m21296l();
            if (m21296l < 2) {
                return null;
            }
            int m21324j = m21324j(m21296l);
            long j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < m21296l; i10++) {
                m21324j++;
                if (m21324j > m21296l) {
                    m21324j = 1;
                }
                b bVar = (b) ExecutorC5288a.this.f21525c.get(m21324j);
                if (bVar != null && bVar != this) {
                    if (z10) {
                        m21348l = this.f21531a.m21347k(bVar.f21531a);
                    } else {
                        m21348l = this.f21531a.m21348l(bVar.f21531a);
                    }
                    if (m21348l == -1) {
                        return this.f21531a.m21346h();
                    }
                    if (m21348l > 0) {
                        j10 = Math.min(j10, m21348l);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f21534d = j10;
            return null;
        }

        /* renamed from: t */
        private final void m21320t() {
            synchronized (ExecutorC5288a.this.f21525c) {
                if (ExecutorC5288a.this.isTerminated()) {
                    return;
                }
                if (ExecutorC5288a.this.m21296l() <= ExecutorC5288a.this.f21526d) {
                    return;
                }
                if (!f21530h.compareAndSet(this, -1, 1)) {
                    return;
                }
                int i10 = this.indexInArray;
                m21325n(0);
                ExecutorC5288a.this.m21304r(this, i10, 0);
                int andDecrement = (int) (ExecutorC5288a.f21519i.getAndDecrement(ExecutorC5288a.this) & 2097151);
                if (andDecrement != i10) {
                    Object obj = ExecutorC5288a.this.f21525c.get(andDecrement);
                    AbstractC5868k.m23671c(obj);
                    b bVar = (b) obj;
                    ExecutorC5288a.this.f21525c.set(i10, bVar);
                    bVar.m21325n(i10);
                    ExecutorC5288a.this.m21304r(bVar, andDecrement, i10);
                }
                ExecutorC5288a.this.f21525c.set(andDecrement, null);
                C1328x c1328x = C1328x.f4998a;
                this.f21532b = c.TERMINATED;
            }
        }

        /* renamed from: e */
        public final AbstractRunnableC5296i m21321e(boolean z10) {
            AbstractRunnableC5296i abstractRunnableC5296i;
            if (m21317p()) {
                return m21311d(z10);
            }
            if (z10) {
                abstractRunnableC5296i = this.f21531a.m21346h();
                if (abstractRunnableC5296i == null) {
                    abstractRunnableC5296i = (AbstractRunnableC5296i) ExecutorC5288a.this.f21524b.m21214d();
                }
            } else {
                abstractRunnableC5296i = (AbstractRunnableC5296i) ExecutorC5288a.this.f21524b.m21214d();
            }
            if (abstractRunnableC5296i == null) {
                return m21319s(true);
            }
            return abstractRunnableC5296i;
        }

        /* renamed from: f */
        public final int m21322f() {
            return this.indexInArray;
        }

        /* renamed from: g */
        public final Object m21323g() {
            return this.nextParkedWorker;
        }

        /* renamed from: j */
        public final int m21324j(int i10) {
            int i11 = this.f21535e;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f21535e = i14;
            int i15 = i10 - 1;
            if ((i15 & i10) == 0) {
                return i14 & i15;
            }
            return (i14 & Integer.MAX_VALUE) % i10;
        }

        /* renamed from: n */
        public final void m21325n(int i10) {
            String valueOf;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ExecutorC5288a.this.f21529g);
            sb2.append("-worker-");
            if (i10 == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i10);
            }
            sb2.append(valueOf);
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        /* renamed from: o */
        public final void m21326o(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: r */
        public final boolean m21327r(c cVar) {
            boolean z10;
            c cVar2 = this.f21532b;
            if (cVar2 == c.CPU_ACQUIRED) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ExecutorC5288a.f21519i.addAndGet(ExecutorC5288a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.f21532b = cVar;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m21316m();
        }

        public b(ExecutorC5288a executorC5288a, int i10) {
            this();
            m21325n(i10);
        }
    }
}
