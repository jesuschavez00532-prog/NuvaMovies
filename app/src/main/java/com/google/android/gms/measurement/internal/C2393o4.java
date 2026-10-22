package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.o4 */
/* loaded from: classes.dex */
public final class C2393o4 extends AbstractC2350k5 {

    /* renamed from: l */
    private static final AtomicLong f8877l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    private C2382n4 f8878c;

    /* renamed from: d */
    private C2382n4 f8879d;

    /* renamed from: e */
    private final PriorityBlockingQueue f8880e;

    /* renamed from: f */
    private final BlockingQueue f8881f;

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f8882g;

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f8883h;

    /* renamed from: i */
    private final Object f8884i;

    /* renamed from: j */
    private final Semaphore f8885j;

    /* renamed from: k */
    private volatile boolean f8886k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2393o4(C2415q4 c2415q4) {
        super(c2415q4);
        this.f8884i = new Object();
        this.f8885j = new Semaphore(2);
        this.f8880e = new PriorityBlockingQueue();
        this.f8881f = new LinkedBlockingQueue();
        this.f8882g = new C2360l4(this, "Thread death: Uncaught exception on worker thread");
        this.f8883h = new C2360l4(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static /* bridge */ /* synthetic */ boolean m9882B(C2393o4 c2393o4) {
        boolean z10 = c2393o4.f8886k;
        return false;
    }

    /* renamed from: D */
    private final void m9883D(C2371m4 c2371m4) {
        synchronized (this.f8884i) {
            this.f8880e.add(c2371m4);
            C2382n4 c2382n4 = this.f8878c;
            if (c2382n4 == null) {
                C2382n4 c2382n42 = new C2382n4(this, "Measurement Worker", this.f8880e);
                this.f8878c = c2382n42;
                c2382n42.setUncaughtExceptionHandler(this.f8882g);
                this.f8878c.start();
            } else {
                c2382n4.m9874a();
            }
        }
    }

    /* renamed from: A */
    public final void m9891A(Runnable runnable) {
        m9731k();
        AbstractC5391n.m21783i(runnable);
        m9883D(new C2371m4(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean m9892C() {
        if (Thread.currentThread() == this.f8878c) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2339j5
    /* renamed from: g */
    public final void mo9668g() {
        if (Thread.currentThread() == this.f8879d) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2339j5
    /* renamed from: h */
    public final void mo9428h() {
        if (Thread.currentThread() == this.f8878c) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2350k5
    /* renamed from: j */
    protected final boolean mo9430j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final Object m9893r(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f8714a.mo9575a().m9897z(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                this.f8714a.mo9577b().m9805w().m9699a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f8714a.mo9577b().m9805w().m9699a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* renamed from: s */
    public final Future m9894s(Callable callable) {
        m9731k();
        AbstractC5391n.m21783i(callable);
        C2371m4 c2371m4 = new C2371m4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f8878c) {
            if (!this.f8880e.isEmpty()) {
                this.f8714a.mo9577b().m9805w().m9699a("Callable skipped the worker queue.");
            }
            c2371m4.run();
        } else {
            m9883D(c2371m4);
        }
        return c2371m4;
    }

    /* renamed from: t */
    public final Future m9895t(Callable callable) {
        m9731k();
        AbstractC5391n.m21783i(callable);
        C2371m4 c2371m4 = new C2371m4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f8878c) {
            c2371m4.run();
        } else {
            m9883D(c2371m4);
        }
        return c2371m4;
    }

    /* renamed from: y */
    public final void m9896y(Runnable runnable) {
        m9731k();
        AbstractC5391n.m21783i(runnable);
        C2371m4 c2371m4 = new C2371m4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f8884i) {
            this.f8881f.add(c2371m4);
            C2382n4 c2382n4 = this.f8879d;
            if (c2382n4 == null) {
                C2382n4 c2382n42 = new C2382n4(this, "Measurement Network", this.f8881f);
                this.f8879d = c2382n42;
                c2382n42.setUncaughtExceptionHandler(this.f8883h);
                this.f8879d.start();
            } else {
                c2382n4.m9874a();
            }
        }
    }

    /* renamed from: z */
    public final void m9897z(Runnable runnable) {
        m9731k();
        AbstractC5391n.m21783i(runnable);
        m9883D(new C2371m4(this, runnable, false, "Task exception on worker thread"));
    }
}
