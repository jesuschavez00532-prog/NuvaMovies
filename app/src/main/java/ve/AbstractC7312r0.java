package ve;

import be.AbstractC1321q;
import be.C1328x;
import ee.InterfaceC4184g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.AbstractC5285x;
import kotlinx.coroutines.internal.C5273l;
import kotlinx.coroutines.internal.C5280s;
import kotlinx.coroutines.internal.InterfaceC5286y;
import ne.AbstractC5868k;
import re.AbstractC6576d;

/* renamed from: ve.r0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7312r0 extends AbstractC7315s0 implements InterfaceC7282h0 {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f27216e = AtomicReferenceFieldUpdater.newUpdater(AbstractC7312r0.class, Object.class, "_queue");

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f27217f = AtomicReferenceFieldUpdater.newUpdater(AbstractC7312r0.class, Object.class, "_delayed");
    private volatile Object _queue = null;
    private volatile Object _delayed = null;
    private volatile int _isCompleted = 0;

    /* renamed from: ve.r0$a */
    /* loaded from: classes3.dex */
    private final class a extends b {

        /* renamed from: d */
        private final InterfaceC7281h f27218d;

        public a(long j10, InterfaceC7281h interfaceC7281h) {
            super(j10);
            this.f27218d = interfaceC7281h;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27218d.mo28137g(AbstractC7312r0.this, C1328x.f4998a);
        }

        @Override // ve.AbstractC7312r0.b
        public String toString() {
            return super.toString() + this.f27218d.toString();
        }
    }

    /* renamed from: ve.r0$b */
    /* loaded from: classes3.dex */
    public static abstract class b implements Runnable, Comparable, InterfaceC7300n0, InterfaceC5286y {

        /* renamed from: a */
        private Object f27220a;

        /* renamed from: b */
        private int f27221b = -1;

        /* renamed from: c */
        public long f27222c;

        public b(long j10) {
            this.f27222c = j10;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC5286y
        /* renamed from: a */
        public void mo21280a(AbstractC5285x abstractC5285x) {
            C5280s c5280s;
            boolean z10;
            Object obj = this.f27220a;
            c5280s = AbstractC7321u0.f27228a;
            if (obj != c5280s) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f27220a = abstractC5285x;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.internal.InterfaceC5286y
        /* renamed from: b */
        public AbstractC5285x mo21281b() {
            Object obj = this.f27220a;
            if (!(obj instanceof AbstractC5285x)) {
                obj = null;
            }
            return (AbstractC5285x) obj;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC5286y
        /* renamed from: c */
        public void mo21282c(int i10) {
            this.f27221b = i10;
        }

        @Override // ve.InterfaceC7300n0
        public final synchronized void dispose() {
            C5280s c5280s;
            C5280s c5280s2;
            Object obj = this.f27220a;
            c5280s = AbstractC7321u0.f27228a;
            if (obj == c5280s) {
                return;
            }
            if (!(obj instanceof c)) {
                obj = null;
            }
            c cVar = (c) obj;
            if (cVar != null) {
                cVar.m21277g(this);
            }
            c5280s2 = AbstractC7321u0.f27228a;
            this.f27220a = c5280s2;
        }

        @Override // kotlinx.coroutines.internal.InterfaceC5286y
        /* renamed from: e */
        public int mo21283e() {
            return this.f27221b;
        }

        @Override // java.lang.Comparable
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j10 = this.f27222c - bVar.f27222c;
            if (j10 > 0) {
                return 1;
            }
            if (j10 < 0) {
                return -1;
            }
            return 0;
        }

        /* renamed from: g */
        public final synchronized int m28291g(long j10, c cVar, AbstractC7312r0 abstractC7312r0) {
            C5280s c5280s;
            Object obj = this.f27220a;
            c5280s = AbstractC7321u0.f27228a;
            if (obj == c5280s) {
                return 2;
            }
            synchronized (cVar) {
                b bVar = (b) cVar.m21273b();
                if (abstractC7312r0.m28280Q()) {
                    return 1;
                }
                if (bVar == null) {
                    cVar.f27223b = j10;
                } else {
                    long j11 = bVar.f27222c;
                    if (j11 - j10 < 0) {
                        j10 = j11;
                    }
                    if (j10 - cVar.f27223b > 0) {
                        cVar.f27223b = j10;
                    }
                }
                long j12 = this.f27222c;
                long j13 = cVar.f27223b;
                if (j12 - j13 < 0) {
                    this.f27222c = j13;
                }
                cVar.m21272a(this);
                return 0;
            }
        }

        /* renamed from: h */
        public final boolean m28292h(long j10) {
            if (j10 - this.f27222c >= 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f27222c + ']';
        }
    }

    /* renamed from: ve.r0$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC5285x {

        /* renamed from: b */
        public long f27223b;

        public c(long j10) {
            this.f27223b = j10;
        }
    }

    /* renamed from: M */
    private final void m28277M() {
        C5280s c5280s;
        C5280s c5280s2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27216e;
                c5280s = AbstractC7321u0.f27229b;
                if (AbstractC1321q.m5977a(atomicReferenceFieldUpdater, this, null, c5280s)) {
                    return;
                }
            } else if (!(obj instanceof C5273l)) {
                c5280s2 = AbstractC7321u0.f27229b;
                if (obj == c5280s2) {
                    return;
                }
                C5273l c5273l = new C5273l(8, true);
                c5273l.m21220a((Runnable) obj);
                if (AbstractC1321q.m5977a(f27216e, this, obj, c5273l)) {
                    return;
                }
            } else {
                ((C5273l) obj).m21221d();
                return;
            }
        }
    }

    /* renamed from: N */
    private final Runnable m28278N() {
        C5280s c5280s;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof C5273l)) {
                c5280s = AbstractC7321u0.f27229b;
                if (obj == c5280s) {
                    return null;
                }
                if (AbstractC1321q.m5977a(f27216e, this, obj, null)) {
                    return (Runnable) obj;
                }
            } else {
                C5273l c5273l = (C5273l) obj;
                Object m21225j = c5273l.m21225j();
                if (m21225j != C5273l.f21488g) {
                    return (Runnable) m21225j;
                }
                AbstractC1321q.m5977a(f27216e, this, obj, c5273l.m21224i());
            }
        }
    }

    /* renamed from: P */
    private final boolean m28279P(Runnable runnable) {
        C5280s c5280s;
        while (true) {
            Object obj = this._queue;
            if (m28280Q()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC1321q.m5977a(f27216e, this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof C5273l)) {
                c5280s = AbstractC7321u0.f27229b;
                if (obj == c5280s) {
                    return false;
                }
                C5273l c5273l = new C5273l(8, true);
                c5273l.m21220a((Runnable) obj);
                c5273l.m21220a(runnable);
                if (AbstractC1321q.m5977a(f27216e, this, obj, c5273l)) {
                    return true;
                }
            } else {
                C5273l c5273l2 = (C5273l) obj;
                int m21220a = c5273l2.m21220a(runnable);
                if (m21220a == 0) {
                    return true;
                }
                if (m21220a != 1) {
                    if (m21220a == 2) {
                        return false;
                    }
                } else {
                    AbstractC1321q.m5977a(f27216e, this, obj, c5273l2.m21224i());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: Q */
    public final boolean m28280Q() {
        return this._isCompleted;
    }

    /* renamed from: T */
    private final void m28281T() {
        b bVar;
        AbstractC7319t1.m28299a();
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            if (cVar != null && (bVar = (b) cVar.m21279i()) != null) {
                m28296J(nanoTime, bVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: W */
    private final int m28282W(long j10, b bVar) {
        if (m28280Q()) {
            return 1;
        }
        c cVar = (c) this._delayed;
        if (cVar == null) {
            AbstractC1321q.m5977a(f27217f, this, null, new c(j10));
            Object obj = this._delayed;
            AbstractC5868k.m23671c(obj);
            cVar = (c) obj;
        }
        return bVar.m28291g(j10, cVar, this);
    }

    /* renamed from: X */
    private final void m28283X(boolean z10) {
        this._isCompleted = z10 ? 1 : 0;
    }

    /* renamed from: Y */
    private final boolean m28284Y(b bVar) {
        b bVar2;
        c cVar = (c) this._delayed;
        if (cVar != null) {
            bVar2 = (b) cVar.m21276e();
        } else {
            bVar2 = null;
        }
        if (bVar2 == bVar) {
            return true;
        }
        return false;
    }

    @Override // ve.AbstractC7309q0
    /* renamed from: C */
    protected long mo28266C() {
        b bVar;
        C5280s c5280s;
        if (super.mo28266C() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C5273l)) {
                c5280s = AbstractC7321u0.f27229b;
                if (obj != c5280s) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            if (!((C5273l) obj).m21223g()) {
                return 0L;
            }
        }
        c cVar = (c) this._delayed;
        if (cVar == null || (bVar = (b) cVar.m21276e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = bVar.f27222c;
        AbstractC7319t1.m28299a();
        return AbstractC6576d.m25667b(j10 - System.nanoTime(), 0L);
    }

    /* renamed from: O */
    public final void m28285O(Runnable runnable) {
        if (m28279P(runnable)) {
            m28297K();
        } else {
            RunnableC7276f0.f27165h.m28285O(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R */
    public boolean m28286R() {
        C5280s c5280s;
        if (!m28269G()) {
            return false;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.m21275d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof C5273l)) {
                c5280s = AbstractC7321u0.f27229b;
                if (obj != c5280s) {
                    return false;
                }
            } else {
                return ((C5273l) obj).m21223g();
            }
        }
        return true;
    }

    /* renamed from: S */
    public long m28287S() {
        InterfaceC5286y interfaceC5286y;
        boolean z10;
        if (m28270H()) {
            return 0L;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.m21275d()) {
            AbstractC7319t1.m28299a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (cVar) {
                    InterfaceC5286y m21273b = cVar.m21273b();
                    interfaceC5286y = null;
                    if (m21273b != null) {
                        b bVar = (b) m21273b;
                        if (bVar.m28292h(nanoTime)) {
                            z10 = m28279P(bVar);
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            interfaceC5286y = cVar.m21278h(0);
                        }
                    }
                }
            } while (((b) interfaceC5286y) != null);
        }
        Runnable m28278N = m28278N();
        if (m28278N != null) {
            m28278N.run();
            return 0L;
        }
        return mo28266C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public final void m28288U() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: V */
    public final void m28289V(long j10, b bVar) {
        int m28282W = m28282W(j10, bVar);
        if (m28282W != 0) {
            if (m28282W != 1) {
                if (m28282W != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            } else {
                m28296J(j10, bVar);
                return;
            }
        }
        if (m28284Y(bVar)) {
            m28297K();
        }
    }

    @Override // ve.InterfaceC7282h0
    /* renamed from: e */
    public void mo21238e(long j10, InterfaceC7281h interfaceC7281h) {
        long m28302c = AbstractC7321u0.m28302c(j10);
        if (m28302c < 4611686018427387903L) {
            AbstractC7319t1.m28299a();
            long nanoTime = System.nanoTime();
            a aVar = new a(m28302c + nanoTime, interfaceC7281h);
            AbstractC7287j.m28238a(interfaceC7281h, aVar);
            m28289V(nanoTime, aVar);
        }
    }

    @Override // ve.AbstractC7309q0
    protected void shutdown() {
        C7313r1.f27225b.m28294b();
        m28283X(true);
        m28277M();
        do {
        } while (m28287S() <= 0);
        m28281T();
    }

    @Override // ve.AbstractC7329x
    /* renamed from: x */
    public final void mo21239x(InterfaceC4184g interfaceC4184g, Runnable runnable) {
        m28285O(runnable);
    }
}
