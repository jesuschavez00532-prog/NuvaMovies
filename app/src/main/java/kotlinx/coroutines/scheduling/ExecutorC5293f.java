package kotlinx.coroutines.scheduling;

import ee.InterfaceC4184g;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ve.AbstractC7324v0;

/* renamed from: kotlinx.coroutines.scheduling.f */
/* loaded from: classes3.dex */
final class ExecutorC5293f extends AbstractC7324v0 implements InterfaceC5297j, Executor {

    /* renamed from: h */
    private static final AtomicIntegerFieldUpdater f21552h = AtomicIntegerFieldUpdater.newUpdater(ExecutorC5293f.class, "inFlightTasks");

    /* renamed from: d */
    private final AbstractC5291d f21554d;

    /* renamed from: e */
    private final int f21555e;

    /* renamed from: f */
    private final String f21556f;

    /* renamed from: g */
    private final int f21557g;

    /* renamed from: c */
    private final ConcurrentLinkedQueue f21553c = new ConcurrentLinkedQueue();
    private volatile int inFlightTasks = 0;

    public ExecutorC5293f(AbstractC5291d abstractC5291d, int i10, String str, int i11) {
        this.f21554d = abstractC5291d;
        this.f21555e = i10;
        this.f21556f = str;
        this.f21557g = i11;
    }

    /* renamed from: z */
    private final void m21331z(Runnable runnable, boolean z10) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f21552h;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f21555e) {
                this.f21554d.m21330A(runnable, this, z10);
                return;
            }
            this.f21553c.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f21555e) {
                return;
            } else {
                runnable = (Runnable) this.f21553c.poll();
            }
        } while (runnable != null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // kotlinx.coroutines.scheduling.InterfaceC5297j
    /* renamed from: d */
    public void mo21332d() {
        Runnable runnable = (Runnable) this.f21553c.poll();
        if (runnable != null) {
            this.f21554d.m21330A(runnable, this, true);
            return;
        }
        f21552h.decrementAndGet(this);
        Runnable runnable2 = (Runnable) this.f21553c.poll();
        if (runnable2 != null) {
            m21331z(runnable2, true);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m21331z(runnable, false);
    }

    @Override // kotlinx.coroutines.scheduling.InterfaceC5297j
    /* renamed from: l */
    public int mo21333l() {
        return this.f21557g;
    }

    @Override // ve.AbstractC7329x
    public String toString() {
        String str = this.f21556f;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f21554d + ']';
        }
        return str;
    }

    @Override // ve.AbstractC7329x
    /* renamed from: x */
    public void mo21239x(InterfaceC4184g interfaceC4184g, Runnable runnable) {
        m21331z(runnable, false);
    }
}
