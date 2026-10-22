package kotlinx.coroutines.scheduling;

import be.AbstractC1321q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.scheduling.o */
/* loaded from: classes3.dex */
public final class C5302o {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f21570b = AtomicReferenceFieldUpdater.newUpdater(C5302o.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f21571c = AtomicIntegerFieldUpdater.newUpdater(C5302o.class, "producerIndex");

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f21572d = AtomicIntegerFieldUpdater.newUpdater(C5302o.class, "consumerIndex");

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f21573e = AtomicIntegerFieldUpdater.newUpdater(C5302o.class, "blockingTasksInBuffer");

    /* renamed from: a */
    private final AtomicReferenceArray f21574a = new AtomicReferenceArray(128);
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;
    private volatile int consumerIndex = 0;
    private volatile int blockingTasksInBuffer = 0;

    /* renamed from: b */
    public static /* synthetic */ AbstractRunnableC5296i m21336b(C5302o c5302o, AbstractRunnableC5296i abstractRunnableC5296i, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c5302o.m21342a(abstractRunnableC5296i, z10);
    }

    /* renamed from: c */
    private final AbstractRunnableC5296i m21337c(AbstractRunnableC5296i abstractRunnableC5296i) {
        boolean z10 = true;
        if (abstractRunnableC5296i.f21562b.mo21333l() != 1) {
            z10 = false;
        }
        if (z10) {
            f21573e.incrementAndGet(this);
        }
        if (m21343e() == 127) {
            return abstractRunnableC5296i;
        }
        int i10 = this.producerIndex & 127;
        while (this.f21574a.get(i10) != null) {
            Thread.yield();
        }
        this.f21574a.lazySet(i10, abstractRunnableC5296i);
        f21571c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m21338d(AbstractRunnableC5296i abstractRunnableC5296i) {
        if (abstractRunnableC5296i != null) {
            boolean z10 = true;
            if (abstractRunnableC5296i.f21562b.mo21333l() != 1) {
                z10 = false;
            }
            if (z10) {
                f21573e.decrementAndGet(this);
            }
        }
    }

    /* renamed from: i */
    private final AbstractRunnableC5296i m21339i() {
        AbstractRunnableC5296i abstractRunnableC5296i;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f21572d.compareAndSet(this, i10, i10 + 1) && (abstractRunnableC5296i = (AbstractRunnableC5296i) this.f21574a.getAndSet(i11, null)) != null) {
                m21338d(abstractRunnableC5296i);
                return abstractRunnableC5296i;
            }
        }
    }

    /* renamed from: j */
    private final boolean m21340j(C5292e c5292e) {
        AbstractRunnableC5296i m21339i = m21339i();
        if (m21339i != null) {
            c5292e.m21211a(m21339i);
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private final long m21341m(C5302o c5302o, boolean z10) {
        AbstractRunnableC5296i abstractRunnableC5296i;
        do {
            abstractRunnableC5296i = (AbstractRunnableC5296i) c5302o.lastScheduledTask;
            if (abstractRunnableC5296i == null) {
                return -2L;
            }
            if (z10) {
                boolean z11 = true;
                if (abstractRunnableC5296i.f21562b.mo21333l() != 1) {
                    z11 = false;
                }
                if (!z11) {
                    return -2L;
                }
            }
            long mo21334a = AbstractC5299l.f21569f.mo21334a() - abstractRunnableC5296i.f21561a;
            long j10 = AbstractC5299l.f21564a;
            if (mo21334a < j10) {
                return j10 - mo21334a;
            }
        } while (!AbstractC1321q.m5977a(f21570b, c5302o, abstractRunnableC5296i, null));
        m21336b(this, abstractRunnableC5296i, false, 2, null);
        return -1L;
    }

    /* renamed from: a */
    public final AbstractRunnableC5296i m21342a(AbstractRunnableC5296i abstractRunnableC5296i, boolean z10) {
        if (z10) {
            return m21337c(abstractRunnableC5296i);
        }
        AbstractRunnableC5296i abstractRunnableC5296i2 = (AbstractRunnableC5296i) f21570b.getAndSet(this, abstractRunnableC5296i);
        if (abstractRunnableC5296i2 != null) {
            return m21337c(abstractRunnableC5296i2);
        }
        return null;
    }

    /* renamed from: e */
    public final int m21343e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int m21344f() {
        if (this.lastScheduledTask != null) {
            return m21343e() + 1;
        }
        return m21343e();
    }

    /* renamed from: g */
    public final void m21345g(C5292e c5292e) {
        AbstractRunnableC5296i abstractRunnableC5296i = (AbstractRunnableC5296i) f21570b.getAndSet(this, null);
        if (abstractRunnableC5296i != null) {
            c5292e.m21211a(abstractRunnableC5296i);
        }
        do {
        } while (m21340j(c5292e));
    }

    /* renamed from: h */
    public final AbstractRunnableC5296i m21346h() {
        AbstractRunnableC5296i abstractRunnableC5296i = (AbstractRunnableC5296i) f21570b.getAndSet(this, null);
        if (abstractRunnableC5296i == null) {
            return m21339i();
        }
        return abstractRunnableC5296i;
    }

    /* renamed from: k */
    public final long m21347k(C5302o c5302o) {
        int i10 = c5302o.consumerIndex;
        int i11 = c5302o.producerIndex;
        AtomicReferenceArray atomicReferenceArray = c5302o.f21574a;
        while (true) {
            boolean z10 = true;
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (c5302o.blockingTasksInBuffer == 0) {
                break;
            }
            AbstractRunnableC5296i abstractRunnableC5296i = (AbstractRunnableC5296i) atomicReferenceArray.get(i12);
            if (abstractRunnableC5296i != null) {
                if (abstractRunnableC5296i.f21562b.mo21333l() != 1) {
                    z10 = false;
                }
                if (z10 && AbstractC5301n.m21335a(atomicReferenceArray, i12, abstractRunnableC5296i, null)) {
                    f21573e.decrementAndGet(c5302o);
                    m21336b(this, abstractRunnableC5296i, false, 2, null);
                    return -1L;
                }
            }
            i10++;
        }
        return m21341m(c5302o, true);
    }

    /* renamed from: l */
    public final long m21348l(C5302o c5302o) {
        AbstractRunnableC5296i m21339i = c5302o.m21339i();
        if (m21339i != null) {
            m21336b(this, m21339i, false, 2, null);
            return -1L;
        }
        return m21341m(c5302o, false);
    }
}
