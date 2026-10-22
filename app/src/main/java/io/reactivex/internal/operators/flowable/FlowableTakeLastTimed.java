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
public final class FlowableTakeLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final long count;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    /* loaded from: classes3.dex */
    static final class TakeLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
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

        TakeLastTimedSubscriber(InterfaceC5074c interfaceC5074c, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
            this.downstream = interfaceC5074c;
            this.count = j10;
            this.time = j11;
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

        boolean checkTerminated(boolean z10, InterfaceC5074c interfaceC5074c, boolean z11) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z11) {
                if (z10) {
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
            if (z10) {
                interfaceC5074c.onComplete();
                return true;
            }
            return false;
        }

        void drain() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC5074c interfaceC5074c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z11 = this.delayError;
            int i10 = 1;
            do {
                if (this.done) {
                    if (checkTerminated(spscLinkedArrayQueue.isEmpty(), interfaceC5074c, z11)) {
                        return;
                    }
                    long j10 = this.requested.get();
                    long j11 = 0;
                    while (true) {
                        if (spscLinkedArrayQueue.peek() == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (checkTerminated(z10, interfaceC5074c, z11)) {
                            return;
                        }
                        if (j10 == j11) {
                            if (j11 != 0) {
                                BackpressureHelper.produced(this.requested, j11);
                            }
                        } else {
                            spscLinkedArrayQueue.poll();
                            interfaceC5074c.onNext(spscLinkedArrayQueue.poll());
                            j11++;
                        }
                    }
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            trim(this.scheduler.now(this.unit), this.queue);
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.delayError) {
                trim(this.scheduler.now(this.unit), this.queue);
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            long now = this.scheduler.now(this.unit);
            spscLinkedArrayQueue.offer(Long.valueOf(now), t10);
            trim(now, spscLinkedArrayQueue);
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

        void trim(long j10, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue) {
            boolean z10;
            long j11 = this.time;
            long j12 = this.count;
            if (j12 == Long.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() < j10 - j11 || (!z10 && (spscLinkedArrayQueue.size() >> 1) > j12)) {
                    spscLinkedArrayQueue.poll();
                    spscLinkedArrayQueue.poll();
                } else {
                    return;
                }
            }
        }
    }

    public FlowableTakeLastTimed(Flowable<T> flowable, long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, int i10, boolean z10) {
        super(flowable);
        this.count = j10;
        this.time = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i10;
        this.delayError = z10;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe((FlowableSubscriber) new TakeLastTimedSubscriber(interfaceC5074c, this.count, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}
