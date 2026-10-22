package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    final AtomicReference<InterfaceC5074c> downstream;
    boolean enableOperatorFusion;
    Throwable error;
    final AtomicReference<Runnable> onTerminate;
    final AtomicBoolean once;
    final SpscLinkedArrayQueue<T> queue;
    final AtomicLong requested;
    final BasicIntQueueSubscription<T> wip;

    /* loaded from: classes3.dex */
    final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p197jf.InterfaceC5075d
        public void cancel() {
            if (UnicastProcessor.this.cancelled) {
                return;
            }
            UnicastProcessor.this.cancelled = true;
            UnicastProcessor.this.doTerminate();
            UnicastProcessor.this.downstream.lazySet(null);
            if (UnicastProcessor.this.wip.getAndIncrement() == 0) {
                UnicastProcessor.this.downstream.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (!unicastProcessor.enableOperatorFusion) {
                    unicastProcessor.queue.clear();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastProcessor.this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastProcessor.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return UnicastProcessor.this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(UnicastProcessor.this.requested, j10);
                UnicastProcessor.this.drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) != 0) {
                UnicastProcessor.this.enableOperatorFusion = true;
                return 2;
            }
            return 0;
        }
    }

    UnicastProcessor(int i10) {
        this(i10, null, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(Flowable.bufferSize());
    }

    boolean checkTerminated(boolean z10, boolean z11, boolean z12, InterfaceC5074c interfaceC5074c, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.cancelled) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            return true;
        }
        if (z11) {
            if (z10 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                interfaceC5074c.onError(this.error);
                return true;
            }
            if (z12) {
                Throwable th = this.error;
                this.downstream.lazySet(null);
                if (th != null) {
                    interfaceC5074c.onError(th);
                } else {
                    interfaceC5074c.onComplete();
                }
                return true;
            }
            return false;
        }
        return false;
    }

    void doTerminate() {
        Runnable andSet = this.onTerminate.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        InterfaceC5074c interfaceC5074c = this.downstream.get();
        int i10 = 1;
        while (interfaceC5074c == null) {
            i10 = this.wip.addAndGet(-i10);
            if (i10 == 0) {
                return;
            } else {
                interfaceC5074c = this.downstream.get();
            }
        }
        if (this.enableOperatorFusion) {
            drainFused(interfaceC5074c);
        } else {
            drainRegular(interfaceC5074c);
        }
    }

    void drainFused(InterfaceC5074c interfaceC5074c) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        int i10 = 1;
        boolean z10 = !this.delayError;
        while (!this.cancelled) {
            boolean z11 = this.done;
            if (z10 && z11 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                interfaceC5074c.onError(this.error);
                return;
            }
            interfaceC5074c.onNext(null);
            if (z11) {
                this.downstream.lazySet(null);
                Throwable th = this.error;
                if (th != null) {
                    interfaceC5074c.onError(th);
                    return;
                } else {
                    interfaceC5074c.onComplete();
                    return;
                }
            }
            i10 = this.wip.addAndGet(-i10);
            if (i10 == 0) {
                return;
            }
        }
        this.downstream.lazySet(null);
    }

    void drainRegular(InterfaceC5074c interfaceC5074c) {
        long j10;
        boolean z10;
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z11 = !this.delayError;
        int i10 = 1;
        do {
            long j11 = this.requested.get();
            long j12 = 0;
            while (true) {
                if (j11 != j12) {
                    boolean z12 = this.done;
                    T poll = spscLinkedArrayQueue.poll();
                    if (poll == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j10 = j12;
                    if (checkTerminated(z11, z12, z10, interfaceC5074c, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    interfaceC5074c.onNext(poll);
                    j12 = 1 + j10;
                } else {
                    j10 = j12;
                    break;
                }
            }
            if (j11 == j10 && checkTerminated(z11, this.done, spscLinkedArrayQueue.isEmpty(), interfaceC5074c, spscLinkedArrayQueue)) {
                return;
            }
            if (j10 != 0 && j11 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j10);
            }
            i10 = this.wip.addAndGet(-i10);
        } while (i10 != 0);
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        if (this.done && this.error == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        if (this.downstream.get() != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        if (this.done && this.error != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.processors.FlowableProcessor, p197jf.InterfaceC5074c
    public void onComplete() {
        if (!this.done && !this.cancelled) {
            this.done = true;
            doTerminate();
            drain();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, p197jf.InterfaceC5074c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done && !this.cancelled) {
            this.error = th;
            this.done = true;
            doTerminate();
            drain();
            return;
        }
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.processors.FlowableProcessor, p197jf.InterfaceC5074c
    public void onNext(T t10) {
        ObjectHelper.requireNonNull(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.done && !this.cancelled) {
            this.queue.offer(t10);
            drain();
        }
    }

    @Override // p197jf.InterfaceC5074c
    public void onSubscribe(InterfaceC5075d interfaceC5075d) {
        if (!this.done && !this.cancelled) {
            interfaceC5075d.request(Long.MAX_VALUE);
        } else {
            interfaceC5075d.cancel();
        }
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        if (!this.once.get() && this.once.compareAndSet(false, true)) {
            interfaceC5074c.onSubscribe(this.wip);
            this.downstream.set(interfaceC5074c);
            if (this.cancelled) {
                this.downstream.lazySet(null);
                return;
            } else {
                drain();
                return;
            }
        }
        EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), interfaceC5074c);
    }

    UnicastProcessor(int i10, Runnable runnable) {
        this(i10, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i10) {
        return new UnicastProcessor<>(i10);
    }

    UnicastProcessor(int i10, Runnable runnable, boolean z10) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i10, "capacityHint"));
        this.onTerminate = new AtomicReference<>(runnable);
        this.delayError = z10;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueSubscription();
        this.requested = new AtomicLong();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(boolean z10) {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, z10);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i10, Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i10, runnable);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i10, Runnable runnable, boolean z10) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i10, runnable, z10);
    }
}
