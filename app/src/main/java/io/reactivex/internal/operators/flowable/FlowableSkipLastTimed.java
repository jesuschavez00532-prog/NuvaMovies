package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    /* loaded from: classes3.dex */
    static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final InterfaceC5074c downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested = new AtomicLong();
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        InterfaceC5075d upstream;

        SkipLastTimedSubscriber(InterfaceC5074c interfaceC5074c, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
            this.downstream = interfaceC5074c;
            this.time = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i10);
            this.delayError = z10;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        boolean checkTerminated(boolean z10, boolean z11, InterfaceC5074c interfaceC5074c, boolean z12) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z10) {
                if (z12) {
                    if (z11) {
                        Throwable th = this.error;
                        if (th != null) {
                            interfaceC5074c.onError(th);
                        } else {
                            interfaceC5074c.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.queue.clear();
                    interfaceC5074c.onError(th2);
                    return true;
                }
                if (z11) {
                    interfaceC5074c.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        void drain() {
            boolean z10;
            boolean z11;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC5074c interfaceC5074c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z12 = this.delayError;
            TimeUnit timeUnit = this.unit;
            Scheduler scheduler = this.scheduler;
            long j10 = this.time;
            int i10 = 1;
            do {
                long j11 = this.requested.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z13 = this.done;
                    Long l10 = (Long) spscLinkedArrayQueue.peek();
                    if (l10 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long now = scheduler.now(timeUnit);
                    if (!z10 && l10.longValue() > now - j10) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (checkTerminated(z13, z11, interfaceC5074c, z12)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    spscLinkedArrayQueue.poll();
                    interfaceC5074c.onNext(spscLinkedArrayQueue.poll());
                    j12++;
                }
                if (j12 != 0) {
                    BackpressureHelper.produced(this.requested, j12);
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t10);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                this.downstream.onSubscribe(this);
                interfaceC5075d.request(Long.MAX_VALUE);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        super(flowable);
        this.time = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i10;
        this.delayError = z10;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe((FlowableSubscriber) new SkipLastTimedSubscriber(interfaceC5074c, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}
