package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableCombineLatest<T, R> extends Flowable<R> {

    @Nullable
    final InterfaceC5073b[] array;
    final int bufferSize;
    final Function<? super Object[], ? extends R> combiner;
    final boolean delayErrors;

    @Nullable
    final Iterable<? extends InterfaceC5073b> iterable;

    /* loaded from: classes3.dex */
    static final class CombineLatestCoordinator<T, R> extends BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int completedSources;
        final boolean delayErrors;
        volatile boolean done;
        final InterfaceC5074c downstream;
        final AtomicReference<Throwable> error;
        final Object[] latest;
        int nonEmptySources;
        boolean outputFused;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested;
        final CombineLatestInnerSubscriber<T>[] subscribers;

        CombineLatestCoordinator(InterfaceC5074c interfaceC5074c, Function<? super Object[], ? extends R> function, int i10, int i11, boolean z10) {
            this.downstream = interfaceC5074c;
            this.combiner = function;
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new CombineLatestInnerSubscriber[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                combineLatestInnerSubscriberArr[i12] = new CombineLatestInnerSubscriber<>(this, i12, i11);
            }
            this.subscribers = combineLatestInnerSubscriberArr;
            this.latest = new Object[i10];
            this.queue = new SpscLinkedArrayQueue<>(i11);
            this.requested = new AtomicLong();
            this.error = new AtomicReference<>();
            this.delayErrors = z10;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p197jf.InterfaceC5075d
        public void cancel() {
            this.cancelled = true;
            cancelAll();
        }

        void cancelAll() {
            for (CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.subscribers) {
                combineLatestInnerSubscriber.cancel();
            }
        }

        boolean checkTerminated(boolean z10, boolean z11, InterfaceC5074c interfaceC5074c, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                cancelAll();
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (z10) {
                if (this.delayErrors) {
                    if (z11) {
                        cancelAll();
                        Throwable terminate = ExceptionHelper.terminate(this.error);
                        if (terminate != null && terminate != ExceptionHelper.TERMINATED) {
                            interfaceC5074c.onError(terminate);
                        } else {
                            interfaceC5074c.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable terminate2 = ExceptionHelper.terminate(this.error);
                if (terminate2 != null && terminate2 != ExceptionHelper.TERMINATED) {
                    cancelAll();
                    spscLinkedArrayQueue.clear();
                    interfaceC5074c.onError(terminate2);
                    return true;
                }
                if (z11) {
                    cancelAll();
                    interfaceC5074c.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainOutput();
            } else {
                drainAsync();
            }
        }

        void drainAsync() {
            boolean z10;
            InterfaceC5074c interfaceC5074c = this.downstream;
            SpscLinkedArrayQueue<?> spscLinkedArrayQueue = this.queue;
            int i10 = 1;
            do {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z11 = this.done;
                    Object poll = spscLinkedArrayQueue.poll();
                    if (poll == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (checkTerminated(z11, z10, interfaceC5074c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    try {
                        interfaceC5074c.onNext(ObjectHelper.requireNonNull(this.combiner.apply((Object[]) spscLinkedArrayQueue.poll()), "The combiner returned a null value"));
                        ((CombineLatestInnerSubscriber) poll).requestOne();
                        j11++;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cancelAll();
                        ExceptionHelper.addThrowable(this.error, th);
                        interfaceC5074c.onError(ExceptionHelper.terminate(this.error));
                        return;
                    }
                }
                if (j11 == j10 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), interfaceC5074c, spscLinkedArrayQueue)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j11);
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        void drainOutput() {
            InterfaceC5074c interfaceC5074c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            int i10 = 1;
            while (!this.cancelled) {
                Throwable th = this.error.get();
                if (th != null) {
                    spscLinkedArrayQueue.clear();
                    interfaceC5074c.onError(th);
                    return;
                }
                boolean z10 = this.done;
                boolean isEmpty = spscLinkedArrayQueue.isEmpty();
                if (!isEmpty) {
                    interfaceC5074c.onNext(null);
                }
                if (z10 && isEmpty) {
                    interfaceC5074c.onComplete();
                    return;
                } else {
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        void innerComplete(int i10) {
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr[i10] != null) {
                    int i11 = this.completedSources + 1;
                    if (i11 == objArr.length) {
                        this.done = true;
                    } else {
                        this.completedSources = i11;
                        return;
                    }
                } else {
                    this.done = true;
                }
                drain();
            }
        }

        void innerError(int i10, Throwable th) {
            if (ExceptionHelper.addThrowable(this.error, th)) {
                if (!this.delayErrors) {
                    cancelAll();
                    this.done = true;
                    drain();
                    return;
                }
                innerComplete(i10);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        void innerValue(int i10, T t10) {
            boolean z10;
            synchronized (this) {
                Object[] objArr = this.latest;
                int i11 = this.nonEmptySources;
                if (objArr[i10] == null) {
                    i11++;
                    this.nonEmptySources = i11;
                }
                objArr[i10] = t10;
                if (objArr.length == i11) {
                    this.queue.offer(this.subscribers[i10], objArr.clone());
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                this.subscribers[i10].requestOne();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() {
            Object poll = this.queue.poll();
            if (poll == null) {
                return null;
            }
            R r10 = (R) ObjectHelper.requireNonNull(this.combiner.apply((Object[]) this.queue.poll()), "The combiner returned a null value");
            ((CombineLatestInnerSubscriber) poll).requestOne();
            return r10;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            boolean z10 = false;
            if ((i10 & 4) != 0) {
                return 0;
            }
            int i11 = i10 & 2;
            if (i11 != 0) {
                z10 = true;
            }
            this.outputFused = z10;
            return i11;
        }

        void subscribe(InterfaceC5073b[] interfaceC5073bArr, int i10) {
            CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.subscribers;
            for (int i11 = 0; i11 < i10 && !this.done && !this.cancelled; i11++) {
                interfaceC5073bArr[i11].subscribe(combineLatestInnerSubscriberArr[i11]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<InterfaceC5075d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int index;
        final int limit;
        final CombineLatestCoordinator<T, ?> parent;
        final int prefetch;
        int produced;

        CombineLatestInnerSubscriber(CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i10, int i11) {
            this.parent = combineLatestCoordinator;
            this.index = i10;
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            this.parent.innerValue(this.index, t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            SubscriptionHelper.setOnce(this, interfaceC5075d, this.prefetch);
        }

        public void requestOne() {
            int i10 = this.produced + 1;
            if (i10 == this.limit) {
                this.produced = 0;
                get().request(i10);
            } else {
                this.produced = i10;
            }
        }
    }

    /* loaded from: classes3.dex */
    final class SingletonArrayFunc implements Function<T, R> {
        SingletonArrayFunc() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[], java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public R apply(T t10) {
            return FlowableCombineLatest.this.combiner.apply(new Object[]{t10});
        }
    }

    public FlowableCombineLatest(@NonNull InterfaceC5073b[] interfaceC5073bArr, @NonNull Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.array = interfaceC5073bArr;
        this.iterable = null;
        this.combiner = function;
        this.bufferSize = i10;
        this.delayErrors = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC5074c interfaceC5074c) {
        int length;
        InterfaceC5073b[] interfaceC5073bArr = this.array;
        if (interfaceC5073bArr == null) {
            interfaceC5073bArr = new InterfaceC5073b[8];
            try {
                Iterator it = (Iterator) ObjectHelper.requireNonNull(this.iterable.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            InterfaceC5073b interfaceC5073b = (InterfaceC5073b) ObjectHelper.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == interfaceC5073bArr.length) {
                                InterfaceC5073b[] interfaceC5073bArr2 = new InterfaceC5073b[(length >> 2) + length];
                                System.arraycopy(interfaceC5073bArr, 0, interfaceC5073bArr2, 0, length);
                                interfaceC5073bArr = interfaceC5073bArr2;
                            }
                            interfaceC5073bArr[length] = interfaceC5073b;
                            length++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, interfaceC5074c);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptySubscription.error(th2, interfaceC5074c);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, interfaceC5074c);
                return;
            }
        } else {
            length = interfaceC5073bArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptySubscription.complete(interfaceC5074c);
        } else {
            if (i10 == 1) {
                interfaceC5073bArr[0].subscribe(new FlowableMap.MapSubscriber(interfaceC5074c, new SingletonArrayFunc()));
                return;
            }
            CombineLatestCoordinator combineLatestCoordinator = new CombineLatestCoordinator(interfaceC5074c, this.combiner, i10, this.bufferSize, this.delayErrors);
            interfaceC5074c.onSubscribe(combineLatestCoordinator);
            combineLatestCoordinator.subscribe(interfaceC5073bArr, i10);
        }
    }

    public FlowableCombineLatest(@NonNull Iterable<? extends InterfaceC5073b> iterable, @NonNull Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.array = null;
        this.iterable = iterable;
        this.combiner = function;
        this.bufferSize = i10;
        this.delayErrors = z10;
    }
}
