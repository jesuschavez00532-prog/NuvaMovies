package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends QueueDrainSubscriberPad4 implements FlowableSubscriber<T>, QueueDrain<U, V> {
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected final InterfaceC5074c downstream;
    protected Throwable error;
    protected final SimplePlainQueue<U> queue;

    public QueueDrainSubscriber(InterfaceC5074c interfaceC5074c, SimplePlainQueue<U> simplePlainQueue) {
        this.downstream = interfaceC5074c;
        this.queue = simplePlainQueue;
    }

    public boolean accept(InterfaceC5074c interfaceC5074c, U u10) {
        return false;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean enter() {
        if (this.wip.getAndIncrement() == 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final Throwable error() {
        return this.error;
    }

    public final boolean fastEnter() {
        if (this.wip.get() != 0 || !this.wip.compareAndSet(0, 1)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void fastPathEmitMax(U u10, boolean z10, Disposable disposable) {
        InterfaceC5074c interfaceC5074c = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j10 = this.requested.get();
            if (j10 != 0) {
                if (accept(interfaceC5074c, u10) && j10 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                disposable.dispose();
                interfaceC5074c.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            simplePlainQueue.offer(u10);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, interfaceC5074c, z10, disposable, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void fastPathOrderedEmitMax(U u10, boolean z10, Disposable disposable) {
        InterfaceC5074c interfaceC5074c = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j10 = this.requested.get();
            if (j10 != 0) {
                if (simplePlainQueue.isEmpty()) {
                    if (accept(interfaceC5074c, u10) && j10 != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (leave(-1) == 0) {
                        return;
                    }
                } else {
                    simplePlainQueue.offer(u10);
                }
            } else {
                this.cancelled = true;
                disposable.dispose();
                interfaceC5074c.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            simplePlainQueue.offer(u10);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, interfaceC5074c, z10, disposable, this);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final int leave(int i10) {
        return this.wip.addAndGet(i10);
    }

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.internal.util.QueueDrain
    public final long produced(long j10) {
        return this.requested.addAndGet(-j10);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long requested() {
        return this.requested.get();
    }

    public final void requested(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            BackpressureHelper.add(this.requested, j10);
        }
    }
}
