package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableMergeWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    final SingleSource<? extends T> other;

    /* loaded from: classes3.dex */
    static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC5075d {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean cancelled;
        int consumed;
        final InterfaceC5074c downstream;
        long emitted;
        final int limit;
        volatile boolean mainDone;
        volatile int otherState;
        final int prefetch;
        volatile SimplePlainQueue<T> queue;
        T singleItem;
        final AtomicReference<InterfaceC5075d> mainSubscription = new AtomicReference<>();
        final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        final AtomicThrowable error = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();

        /* loaded from: classes3.dex */
        static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithObserver<T> parent;

            OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t10) {
                this.parent.otherSuccess(t10);
            }
        }

        MergeWithObserver(InterfaceC5074c interfaceC5074c) {
            this.downstream = interfaceC5074c;
            int bufferSize = Flowable.bufferSize();
            this.prefetch = bufferSize;
            this.limit = bufferSize - (bufferSize >> 2);
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.cancelled = true;
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        void drainLoop() {
            boolean z10;
            T t10;
            boolean z11;
            InterfaceC5074c interfaceC5074c = this.downstream;
            long j10 = this.emitted;
            int i10 = this.consumed;
            int i11 = this.limit;
            int i12 = 1;
            int i13 = 1;
            while (true) {
                long j11 = this.requested.get();
                while (j10 != j11) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        interfaceC5074c.onError(this.error.terminate());
                        return;
                    }
                    int i14 = this.otherState;
                    if (i14 == i12) {
                        T t11 = this.singleItem;
                        this.singleItem = null;
                        this.otherState = 2;
                        interfaceC5074c.onNext(t11);
                        j10++;
                    } else {
                        boolean z12 = this.mainDone;
                        SimplePlainQueue<T> simplePlainQueue = this.queue;
                        if (simplePlainQueue != null) {
                            t10 = simplePlainQueue.poll();
                        } else {
                            t10 = null;
                        }
                        if (t10 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z12 && z11 && i14 == 2) {
                            this.queue = null;
                            interfaceC5074c.onComplete();
                            return;
                        } else {
                            if (z11) {
                                break;
                            }
                            interfaceC5074c.onNext(t10);
                            j10++;
                            i10++;
                            if (i10 == i11) {
                                this.mainSubscription.get().request(i11);
                                i10 = 0;
                            }
                            i12 = 1;
                        }
                    }
                }
                if (j10 == j11) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        interfaceC5074c.onError(this.error.terminate());
                        return;
                    }
                    boolean z13 = this.mainDone;
                    SimplePlainQueue<T> simplePlainQueue2 = this.queue;
                    if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z13 && z10 && this.otherState == 2) {
                        this.queue = null;
                        interfaceC5074c.onComplete();
                        return;
                    }
                }
                this.emitted = j10;
                this.consumed = i10;
                i13 = addAndGet(-i13);
                if (i13 == 0) {
                    return;
                } else {
                    i12 = 1;
                }
            }
        }

        SimplePlainQueue<T> getOrCreateQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue == null) {
                SpscArrayQueue spscArrayQueue = new SpscArrayQueue(Flowable.bufferSize());
                this.queue = spscArrayQueue;
                return spscArrayQueue;
            }
            return simplePlainQueue;
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.error.addThrowable(th)) {
                DisposableHelper.dispose(this.otherObserver);
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            if (compareAndSet(0, 1)) {
                long j10 = this.emitted;
                if (this.requested.get() != j10) {
                    SimplePlainQueue<T> simplePlainQueue = this.queue;
                    if (simplePlainQueue != null && !simplePlainQueue.isEmpty()) {
                        simplePlainQueue.offer(t10);
                    } else {
                        this.emitted = j10 + 1;
                        this.downstream.onNext(t10);
                        int i10 = this.consumed + 1;
                        if (i10 == this.limit) {
                            this.consumed = 0;
                            this.mainSubscription.get().request(i10);
                        } else {
                            this.consumed = i10;
                        }
                    }
                } else {
                    getOrCreateQueue().offer(t10);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            SubscriptionHelper.setOnce(this.mainSubscription, interfaceC5075d, this.prefetch);
        }

        void otherError(Throwable th) {
            if (this.error.addThrowable(th)) {
                SubscriptionHelper.cancel(this.mainSubscription);
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        void otherSuccess(T t10) {
            if (compareAndSet(0, 1)) {
                long j10 = this.emitted;
                if (this.requested.get() != j10) {
                    this.emitted = j10 + 1;
                    this.downstream.onNext(t10);
                    this.otherState = 2;
                } else {
                    this.singleItem = t10;
                    this.otherState = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.singleItem = t10;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            BackpressureHelper.add(this.requested, j10);
            drain();
        }
    }

    public FlowableMergeWithSingle(Flowable<T> flowable, SingleSource<? extends T> singleSource) {
        super(flowable);
        this.other = singleSource;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(interfaceC5074c);
        interfaceC5074c.onSubscribe(mergeWithObserver);
        this.source.subscribe((FlowableSubscriber) mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }
}
