package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;
import p203k4.AbstractC5127x;

@SchedulerSupport("none")
@BackpressureSupport(BackpressureKind.FULL)
/* loaded from: classes.dex */
public final class MulticastProcessor<T> extends FlowableProcessor<T> {
    static final MulticastSubscription[] EMPTY = new MulticastSubscription[0];
    static final MulticastSubscription[] TERMINATED = new MulticastSubscription[0];
    final int bufferSize;
    int consumed;
    volatile boolean done;
    volatile Throwable error;
    int fusionMode;
    final int limit;
    final AtomicBoolean once;
    volatile SimpleQueue<T> queue;
    final boolean refcount;
    final AtomicReference<MulticastSubscription<T>[]> subscribers;
    final AtomicReference<InterfaceC5075d> upstream;
    final AtomicInteger wip;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class MulticastSubscription<T> extends AtomicLong implements InterfaceC5075d {
        private static final long serialVersionUID = -363282618957264509L;
        final InterfaceC5074c downstream;
        long emitted;
        final MulticastProcessor<T> parent;

        MulticastSubscription(InterfaceC5074c interfaceC5074c, MulticastProcessor<T> multicastProcessor) {
            this.downstream = interfaceC5074c;
            this.parent = multicastProcessor;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            }
        }

        void onNext(T t10) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t10);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            long j11;
            long j12;
            if (!SubscriptionHelper.validate(j10)) {
                return;
            }
            do {
                j11 = get();
                if (j11 != Long.MIN_VALUE) {
                    j12 = Long.MAX_VALUE;
                    if (j11 != Long.MAX_VALUE) {
                        long j13 = j11 + j10;
                        if (j13 >= 0) {
                            j12 = j13;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(j11, j12));
            this.parent.drain();
        }
    }

    MulticastProcessor(int i10, boolean z10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        this.bufferSize = i10;
        this.limit = i10 - (i10 >> 2);
        this.wip = new AtomicInteger();
        this.subscribers = new AtomicReference<>(EMPTY);
        this.upstream = new AtomicReference<>();
        this.refcount = z10;
        this.once = new AtomicBoolean();
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create() {
        return new MulticastProcessor<>(Flowable.bufferSize(), false);
    }

    boolean add(MulticastSubscription<T> multicastSubscription) {
        MulticastSubscription<T>[] multicastSubscriptionArr;
        MulticastSubscription[] multicastSubscriptionArr2;
        do {
            multicastSubscriptionArr = this.subscribers.get();
            if (multicastSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = multicastSubscriptionArr.length;
            multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
            System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
            multicastSubscriptionArr2[length] = multicastSubscription;
        } while (!AbstractC5127x.m20760a(this.subscribers, multicastSubscriptionArr, multicastSubscriptionArr2));
        return true;
    }

    void drain() {
        T t10;
        boolean z10;
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
        int i10 = this.consumed;
        int i11 = this.limit;
        int i12 = this.fusionMode;
        int i13 = 1;
        while (true) {
            SimpleQueue<T> simpleQueue = this.queue;
            if (simpleQueue != null) {
                MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference.get();
                if (multicastSubscriptionArr.length != 0) {
                    int length = multicastSubscriptionArr.length;
                    long j10 = -1;
                    long j11 = -1;
                    int i14 = 0;
                    while (i14 < length) {
                        MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i14];
                        long j12 = multicastSubscription.get();
                        if (j12 >= 0) {
                            if (j11 == j10) {
                                j11 = j12 - multicastSubscription.emitted;
                            } else {
                                j11 = Math.min(j11, j12 - multicastSubscription.emitted);
                            }
                        }
                        i14++;
                        j10 = -1;
                    }
                    int i15 = i10;
                    while (j11 > 0) {
                        MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                        if (multicastSubscriptionArr2 == TERMINATED) {
                            simpleQueue.clear();
                            return;
                        }
                        if (multicastSubscriptionArr != multicastSubscriptionArr2) {
                            break;
                        }
                        boolean z11 = this.done;
                        try {
                            t10 = simpleQueue.poll();
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            SubscriptionHelper.cancel(this.upstream);
                            this.error = th;
                            this.done = true;
                            t10 = null;
                            z11 = true;
                        }
                        if (t10 == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z11 && z10) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                for (MulticastSubscription<T> multicastSubscription2 : atomicReference.getAndSet(TERMINATED)) {
                                    multicastSubscription2.onError(th2);
                                }
                                return;
                            }
                            for (MulticastSubscription<T> multicastSubscription3 : atomicReference.getAndSet(TERMINATED)) {
                                multicastSubscription3.onComplete();
                            }
                            return;
                        }
                        if (z10) {
                            break;
                        }
                        for (MulticastSubscription<T> multicastSubscription4 : multicastSubscriptionArr) {
                            multicastSubscription4.onNext(t10);
                        }
                        j11--;
                        if (i12 != 1 && (i15 = i15 + 1) == i11) {
                            this.upstream.get().request(i11);
                            i15 = 0;
                        }
                    }
                    if (j11 == 0) {
                        MulticastSubscription<T>[] multicastSubscriptionArr3 = atomicReference.get();
                        MulticastSubscription<T>[] multicastSubscriptionArr4 = TERMINATED;
                        if (multicastSubscriptionArr3 == multicastSubscriptionArr4) {
                            simpleQueue.clear();
                            return;
                        }
                        if (multicastSubscriptionArr != multicastSubscriptionArr3) {
                            i10 = i15;
                        } else if (this.done && simpleQueue.isEmpty()) {
                            Throwable th3 = this.error;
                            if (th3 != null) {
                                for (MulticastSubscription<T> multicastSubscription5 : atomicReference.getAndSet(multicastSubscriptionArr4)) {
                                    multicastSubscription5.onError(th3);
                                }
                                return;
                            }
                            for (MulticastSubscription<T> multicastSubscription6 : atomicReference.getAndSet(multicastSubscriptionArr4)) {
                                multicastSubscription6.onComplete();
                            }
                            return;
                        }
                    }
                    i10 = i15;
                }
            }
            this.consumed = i10;
            i13 = this.wip.addAndGet(-i13);
            if (i13 == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        if (this.once.get()) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        if (this.once.get() && this.error == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        if (this.subscribers.get().length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        if (this.once.get() && this.error != null) {
            return true;
        }
        return false;
    }

    public boolean offer(T t10) {
        if (this.once.get()) {
            return false;
        }
        ObjectHelper.requireNonNull(t10, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.fusionMode != 0 || !this.queue.offer(t10)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor, p197jf.InterfaceC5074c
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            this.done = true;
            drain();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, p197jf.InterfaceC5074c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.once.compareAndSet(false, true)) {
            this.error = th;
            this.done = true;
            drain();
            return;
        }
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.processors.FlowableProcessor, p197jf.InterfaceC5074c
    public void onNext(T t10) {
        if (this.once.get()) {
            return;
        }
        if (this.fusionMode == 0) {
            ObjectHelper.requireNonNull(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.queue.offer(t10)) {
                SubscriptionHelper.cancel(this.upstream);
                onError(new MissingBackpressureException());
                return;
            }
        }
        drain();
    }

    @Override // p197jf.InterfaceC5074c
    public void onSubscribe(InterfaceC5075d interfaceC5075d) {
        if (SubscriptionHelper.setOnce(this.upstream, interfaceC5075d)) {
            if (interfaceC5075d instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) interfaceC5075d;
                int requestFusion = queueSubscription.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    drain();
                    return;
                }
                if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    interfaceC5075d.request(this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            interfaceC5075d.request(this.bufferSize);
        }
    }

    void remove(MulticastSubscription<T> multicastSubscription) {
        while (true) {
            MulticastSubscription<T>[] multicastSubscriptionArr = this.subscribers.get();
            int length = multicastSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (multicastSubscriptionArr[i10] == multicastSubscription) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                if (length == 1) {
                    if (this.refcount) {
                        if (AbstractC5127x.m20760a(this.subscribers, multicastSubscriptionArr, TERMINATED)) {
                            SubscriptionHelper.cancel(this.upstream);
                            this.once.set(true);
                            return;
                        }
                    } else if (AbstractC5127x.m20760a(this.subscribers, multicastSubscriptionArr, EMPTY)) {
                        return;
                    }
                } else {
                    MulticastSubscription[] multicastSubscriptionArr2 = new MulticastSubscription[length - 1];
                    System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, i10);
                    System.arraycopy(multicastSubscriptionArr, i10 + 1, multicastSubscriptionArr2, i10, (length - i10) - 1);
                    if (AbstractC5127x.m20760a(this.subscribers, multicastSubscriptionArr, multicastSubscriptionArr2)) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public void start() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscArrayQueue(this.bufferSize);
        }
    }

    public void startUnbounded() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscLinkedArrayQueue(this.bufferSize);
        }
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        Throwable th;
        MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(interfaceC5074c, this);
        interfaceC5074c.onSubscribe(multicastSubscription);
        if (add(multicastSubscription)) {
            if (multicastSubscription.get() == Long.MIN_VALUE) {
                remove(multicastSubscription);
                return;
            } else {
                drain();
                return;
            }
        }
        if ((this.once.get() || !this.refcount) && (th = this.error) != null) {
            interfaceC5074c.onError(th);
        } else {
            interfaceC5074c.onComplete();
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(boolean z10) {
        return new MulticastProcessor<>(Flowable.bufferSize(), z10);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i10) {
        return new MulticastProcessor<>(i10, false);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i10, boolean z10) {
        return new MulticastProcessor<>(i10, z10);
    }
}
