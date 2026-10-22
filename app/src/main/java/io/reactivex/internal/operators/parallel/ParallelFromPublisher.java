package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {
    final int parallelism;
    final int prefetch;
    final InterfaceC5073b source;

    /* loaded from: classes3.dex */
    static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        volatile boolean cancelled;
        volatile boolean done;
        final long[] emissions;
        Throwable error;
        int index;
        final int limit;
        final int prefetch;
        int produced;
        SimpleQueue<T> queue;
        final AtomicLongArray requests;
        int sourceMode;
        final AtomicInteger subscriberCount = new AtomicInteger();
        final InterfaceC5074c[] subscribers;
        InterfaceC5075d upstream;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public final class RailSubscription implements InterfaceC5075d {

            /* renamed from: j */
            final int f20641j;

            /* renamed from: m */
            final int f20642m;

            RailSubscription(int i10, int i11) {
                this.f20641j = i10;
                this.f20642m = i11;
            }

            @Override // p197jf.InterfaceC5075d
            public void cancel() {
                if (ParallelDispatcher.this.requests.compareAndSet(this.f20641j + this.f20642m, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i10 = this.f20642m;
                    parallelDispatcher.cancel(i10 + i10);
                }
            }

            @Override // p197jf.InterfaceC5075d
            public void request(long j10) {
                long j11;
                if (SubscriptionHelper.validate(j10)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.requests;
                    do {
                        j11 = atomicLongArray.get(this.f20641j);
                        if (j11 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f20641j, j11, BackpressureHelper.addCap(j11, j10)));
                    if (ParallelDispatcher.this.subscriberCount.get() == this.f20642m) {
                        ParallelDispatcher.this.drain();
                    }
                }
            }
        }

        ParallelDispatcher(InterfaceC5074c[] interfaceC5074cArr, int i10) {
            this.subscribers = interfaceC5074cArr;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
            int length = interfaceC5074cArr.length;
            int i11 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i11 + 1);
            this.requests = atomicLongArray;
            atomicLongArray.lazySet(i11, length);
            this.emissions = new long[length];
        }

        void cancel(int i10) {
            if (this.requests.decrementAndGet(i10) == 0) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.sourceMode == 1) {
                drainSync();
            } else {
                drainAsync();
            }
        }

        void drainAsync() {
            Throwable th;
            SimpleQueue<T> simpleQueue = this.queue;
            InterfaceC5074c[] interfaceC5074cArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i10 = this.index;
            int i11 = this.produced;
            int i12 = 1;
            while (true) {
                int i13 = 0;
                int i14 = 0;
                while (!this.cancelled) {
                    boolean z10 = this.done;
                    if (z10 && (th = this.error) != null) {
                        simpleQueue.clear();
                        int length2 = interfaceC5074cArr.length;
                        while (i13 < length2) {
                            interfaceC5074cArr[i13].onError(th);
                            i13++;
                        }
                        return;
                    }
                    boolean isEmpty = simpleQueue.isEmpty();
                    if (z10 && isEmpty) {
                        int length3 = interfaceC5074cArr.length;
                        while (i13 < length3) {
                            interfaceC5074cArr[i13].onComplete();
                            i13++;
                        }
                        return;
                    }
                    if (!isEmpty) {
                        long j10 = atomicLongArray.get(i10);
                        long j11 = jArr[i10];
                        if (j10 != j11 && atomicLongArray.get(length + i10) == 0) {
                            try {
                                T poll = simpleQueue.poll();
                                if (poll != null) {
                                    interfaceC5074cArr[i10].onNext(poll);
                                    jArr[i10] = j11 + 1;
                                    i11++;
                                    if (i11 == this.limit) {
                                        this.upstream.request(i11);
                                        i11 = 0;
                                    }
                                    i14 = 0;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.upstream.cancel();
                                int length4 = interfaceC5074cArr.length;
                                while (i13 < length4) {
                                    interfaceC5074cArr[i13].onError(th2);
                                    i13++;
                                }
                                return;
                            }
                        } else {
                            i14++;
                        }
                        i10++;
                        if (i10 == length) {
                            i10 = 0;
                        }
                        if (i14 == length) {
                        }
                    }
                    int i15 = get();
                    if (i15 == i12) {
                        this.index = i10;
                        this.produced = i11;
                        i12 = addAndGet(-i12);
                        if (i12 == 0) {
                            return;
                        }
                    } else {
                        i12 = i15;
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        void drainSync() {
            SimpleQueue<T> simpleQueue = this.queue;
            InterfaceC5074c[] interfaceC5074cArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i10 = this.index;
            int i11 = 1;
            while (true) {
                int i12 = 0;
                int i13 = 0;
                while (!this.cancelled) {
                    if (simpleQueue.isEmpty()) {
                        int length2 = interfaceC5074cArr.length;
                        while (i12 < length2) {
                            interfaceC5074cArr[i12].onComplete();
                            i12++;
                        }
                        return;
                    }
                    long j10 = atomicLongArray.get(i10);
                    long j11 = jArr[i10];
                    if (j10 != j11 && atomicLongArray.get(length + i10) == 0) {
                        try {
                            T poll = simpleQueue.poll();
                            if (poll == null) {
                                int length3 = interfaceC5074cArr.length;
                                while (i12 < length3) {
                                    interfaceC5074cArr[i12].onComplete();
                                    i12++;
                                }
                                return;
                            }
                            interfaceC5074cArr[i10].onNext(poll);
                            jArr[i10] = j11 + 1;
                            i13 = 0;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.cancel();
                            int length4 = interfaceC5074cArr.length;
                            while (i12 < length4) {
                                interfaceC5074cArr[i12].onError(th);
                                i12++;
                            }
                            return;
                        }
                    } else {
                        i13++;
                    }
                    i10++;
                    if (i10 == length) {
                        i10 = 0;
                    }
                    if (i13 == length) {
                        int i14 = get();
                        if (i14 == i11) {
                            this.index = i10;
                            i11 = addAndGet(-i11);
                            if (i11 == 0) {
                                return;
                            }
                        } else {
                            i11 = i14;
                        }
                    }
                }
                simpleQueue.clear();
                return;
            }
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
            if (this.sourceMode == 0 && !this.queue.offer(t10)) {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                if (interfaceC5075d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC5075d;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        setupSubscribers();
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        setupSubscribers();
                        interfaceC5075d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                setupSubscribers();
                interfaceC5075d.request(this.prefetch);
            }
        }

        void setupSubscribers() {
            InterfaceC5074c[] interfaceC5074cArr = this.subscribers;
            int length = interfaceC5074cArr.length;
            int i10 = 0;
            while (i10 < length && !this.cancelled) {
                int i11 = i10 + 1;
                this.subscriberCount.lazySet(i11);
                interfaceC5074cArr[i10].onSubscribe(new RailSubscription(i10, length));
                i10 = i11;
            }
        }
    }

    public ParallelFromPublisher(InterfaceC5073b interfaceC5073b, int i10, int i11) {
        this.source = interfaceC5073b;
        this.parallelism = i10;
        this.prefetch = i11;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.parallelism;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC5074c[] interfaceC5074cArr) {
        if (!validate(interfaceC5074cArr)) {
            return;
        }
        this.source.subscribe(new ParallelDispatcher(interfaceC5074cArr, this.prefetch));
    }
}
