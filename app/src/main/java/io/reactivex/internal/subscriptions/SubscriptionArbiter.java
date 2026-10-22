package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public class SubscriptionArbiter extends AtomicInteger implements InterfaceC5075d {
    private static final long serialVersionUID = -2189523197179400958L;
    InterfaceC5075d actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<InterfaceC5075d> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public SubscriptionArbiter(boolean z10) {
        this.cancelOnReplace = z10;
    }

    public void cancel() {
        if (!this.cancelled) {
            this.cancelled = true;
            drain();
        }
    }

    final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        drainLoop();
    }

    final void drainLoop() {
        int i10 = 1;
        long j10 = 0;
        InterfaceC5075d interfaceC5075d = null;
        do {
            InterfaceC5075d interfaceC5075d2 = this.missedSubscription.get();
            if (interfaceC5075d2 != null) {
                interfaceC5075d2 = this.missedSubscription.getAndSet(null);
            }
            long j11 = this.missedRequested.get();
            if (j11 != 0) {
                j11 = this.missedRequested.getAndSet(0L);
            }
            long j12 = this.missedProduced.get();
            if (j12 != 0) {
                j12 = this.missedProduced.getAndSet(0L);
            }
            InterfaceC5075d interfaceC5075d3 = this.actual;
            if (this.cancelled) {
                if (interfaceC5075d3 != null) {
                    interfaceC5075d3.cancel();
                    this.actual = null;
                }
                if (interfaceC5075d2 != null) {
                    interfaceC5075d2.cancel();
                }
            } else {
                long j13 = this.requested;
                if (j13 != Long.MAX_VALUE) {
                    j13 = BackpressureHelper.addCap(j13, j11);
                    if (j13 != Long.MAX_VALUE) {
                        j13 -= j12;
                        if (j13 < 0) {
                            SubscriptionHelper.reportMoreProduced(j13);
                            j13 = 0;
                        }
                    }
                    this.requested = j13;
                }
                if (interfaceC5075d2 != null) {
                    if (interfaceC5075d3 != null && this.cancelOnReplace) {
                        interfaceC5075d3.cancel();
                    }
                    this.actual = interfaceC5075d2;
                    if (j13 != 0) {
                        j10 = BackpressureHelper.addCap(j10, j13);
                        interfaceC5075d = interfaceC5075d2;
                    }
                } else if (interfaceC5075d3 != null && j11 != 0) {
                    j10 = BackpressureHelper.addCap(j10, j11);
                    interfaceC5075d = interfaceC5075d3;
                }
            }
            i10 = addAndGet(-i10);
        } while (i10 != 0);
        if (j10 != 0) {
            interfaceC5075d.request(j10);
        }
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final void produced(long j10) {
        if (this.unbounded) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j11 = this.requested;
            if (j11 != Long.MAX_VALUE) {
                long j12 = j11 - j10;
                if (j12 < 0) {
                    SubscriptionHelper.reportMoreProduced(j12);
                    j12 = 0;
                }
                this.requested = j12;
            }
            if (decrementAndGet() == 0) {
                return;
            }
            drainLoop();
            return;
        }
        BackpressureHelper.add(this.missedProduced, j10);
        drain();
    }

    @Override // p197jf.InterfaceC5075d
    public final void request(long j10) {
        if (!SubscriptionHelper.validate(j10) || this.unbounded) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j11 = this.requested;
            if (j11 != Long.MAX_VALUE) {
                long addCap = BackpressureHelper.addCap(j11, j10);
                this.requested = addCap;
                if (addCap == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            InterfaceC5075d interfaceC5075d = this.actual;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (interfaceC5075d != null) {
                interfaceC5075d.request(j10);
                return;
            }
            return;
        }
        BackpressureHelper.add(this.missedRequested, j10);
        drain();
    }

    public final void setSubscription(InterfaceC5075d interfaceC5075d) {
        if (this.cancelled) {
            interfaceC5075d.cancel();
            return;
        }
        ObjectHelper.requireNonNull(interfaceC5075d, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            InterfaceC5075d interfaceC5075d2 = this.actual;
            if (interfaceC5075d2 != null && this.cancelOnReplace) {
                interfaceC5075d2.cancel();
            }
            this.actual = interfaceC5075d;
            long j10 = this.requested;
            if (decrementAndGet() != 0) {
                drainLoop();
            }
            if (j10 != 0) {
                interfaceC5075d.request(j10);
                return;
            }
            return;
        }
        InterfaceC5075d andSet = this.missedSubscription.getAndSet(interfaceC5075d);
        if (andSet != null && this.cancelOnReplace) {
            andSet.cancel();
        }
        drain();
    }
}
