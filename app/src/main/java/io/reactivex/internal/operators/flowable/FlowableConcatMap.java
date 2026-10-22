package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC5073b> mapper;
    final int prefetch;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C49521 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$internal$util$ErrorMode;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            $SwitchMap$io$reactivex$internal$util$ErrorMode = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$internal$util$ErrorMode[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, InterfaceC5075d {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final int limit;
        final Function<? super T, ? extends InterfaceC5073b> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        int sourceMode;
        InterfaceC5075d upstream;
        final ConcatMapInner<R> inner = new ConcatMapInner<>(this);
        final AtomicThrowable errors = new AtomicThrowable();

        BaseConcatMapSubscriber(Function<? super T, ? extends InterfaceC5073b> function, int i10) {
            this.mapper = function;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // p197jf.InterfaceC5075d
        public abstract /* synthetic */ void cancel();

        abstract void drain();

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public final void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public abstract /* synthetic */ void onError(Throwable th);

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public final void onNext(T t10) {
            if (this.sourceMode != 2 && !this.queue.offer(t10)) {
                this.upstream.cancel();
                onError(new IllegalStateException("Queue full?!"));
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public final void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                if (interfaceC5075d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC5075d;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        subscribeActual();
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        subscribeActual();
                        interfaceC5075d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                subscribeActual();
                interfaceC5075d.request(this.prefetch);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public abstract /* synthetic */ void request(long j10);

        abstract void subscribeActual();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final InterfaceC5074c downstream;
        final boolean veryEnd;

        ConcatMapDelayed(InterfaceC5074c interfaceC5074c, Function<? super T, ? extends InterfaceC5073b> function, int i10, boolean z10) {
            super(function, i10);
            this.downstream = interfaceC5074c;
            this.veryEnd = z10;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, p197jf.InterfaceC5075d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void drain() {
            boolean z10;
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z11 = this.done;
                        if (z11 && !this.veryEnd && this.errors.get() != null) {
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                        try {
                            T poll = this.queue.poll();
                            if (poll == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z11 && z10) {
                                Throwable terminate = this.errors.terminate();
                                if (terminate != null) {
                                    this.downstream.onError(terminate);
                                    return;
                                } else {
                                    this.downstream.onComplete();
                                    return;
                                }
                            }
                            if (!z10) {
                                try {
                                    InterfaceC5073b interfaceC5073b = (InterfaceC5073b) ObjectHelper.requireNonNull(this.mapper.apply(poll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i10 = this.consumed + 1;
                                        if (i10 == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i10);
                                        } else {
                                            this.consumed = i10;
                                        }
                                    }
                                    if (interfaceC5073b instanceof Callable) {
                                        try {
                                            obj = ((Callable) interfaceC5073b).call();
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            this.errors.addThrowable(th);
                                            if (!this.veryEnd) {
                                                this.upstream.cancel();
                                                this.downstream.onError(this.errors.terminate());
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.inner.isUnbounded()) {
                                            this.downstream.onNext(obj);
                                        } else {
                                            this.active = true;
                                            this.inner.setSubscription(new SimpleScalarSubscription(obj, this.inner));
                                        }
                                    } else {
                                        this.active = true;
                                        interfaceC5073b.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th2);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.upstream.cancel();
                            this.errors.addThrowable(th3);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                if (!this.veryEnd) {
                    this.upstream.cancel();
                    this.done = true;
                }
                this.active = false;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r10) {
            this.downstream.onNext(r10);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, p197jf.InterfaceC5075d
        public void request(long j10) {
            this.inner.request(j10);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final InterfaceC5074c downstream;
        final AtomicInteger wip;

        ConcatMapImmediate(InterfaceC5074c interfaceC5074c, Function<? super T, ? extends InterfaceC5073b> function, int i10) {
            super(function, i10);
            this.downstream = interfaceC5074c;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, p197jf.InterfaceC5075d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.inner.cancel();
                this.upstream.cancel();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void drain() {
            boolean z10;
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z11 = this.done;
                        try {
                            T poll = this.queue.poll();
                            if (poll == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z11 && z10) {
                                this.downstream.onComplete();
                                return;
                            }
                            if (!z10) {
                                try {
                                    InterfaceC5073b interfaceC5073b = (InterfaceC5073b) ObjectHelper.requireNonNull(this.mapper.apply(poll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i10 = this.consumed + 1;
                                        if (i10 == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i10);
                                        } else {
                                            this.consumed = i10;
                                        }
                                    }
                                    if (interfaceC5073b instanceof Callable) {
                                        try {
                                            Object call = ((Callable) interfaceC5073b).call();
                                            if (call == null) {
                                                continue;
                                            } else if (this.inner.isUnbounded()) {
                                                if (get() == 0 && compareAndSet(0, 1)) {
                                                    this.downstream.onNext(call);
                                                    if (!compareAndSet(1, 0)) {
                                                        this.downstream.onError(this.errors.terminate());
                                                        return;
                                                    }
                                                }
                                            } else {
                                                this.active = true;
                                                this.inner.setSubscription(new SimpleScalarSubscription(call, this.inner));
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            this.upstream.cancel();
                                            this.errors.addThrowable(th);
                                            this.downstream.onError(this.errors.terminate());
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        interfaceC5073b.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th2);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.upstream.cancel();
                            this.errors.addThrowable(th3);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(r10);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.errors.addThrowable(th)) {
                this.inner.cancel();
                if (getAndIncrement() == 0) {
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, p197jf.InterfaceC5075d
        public void request(long j10) {
            this.inner.request(j10);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final ConcatMapSupport<R> parent;
        long produced;

        ConcatMapInner(ConcatMapSupport<R> concatMapSupport) {
            super(false);
            this.parent = concatMapSupport;
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            long j10 = this.produced;
            if (j10 != 0) {
                this.produced = 0L;
                produced(j10);
            }
            this.parent.innerComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            long j10 = this.produced;
            if (j10 != 0) {
                this.produced = 0L;
                produced(j10);
            }
            this.parent.innerError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(R r10) {
            this.produced++;
            this.parent.innerNext(r10);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            setSubscription(interfaceC5075d);
        }
    }

    /* loaded from: classes3.dex */
    class ConcatMapSupport<T> {
        void innerComplete();

        void innerError(Throwable th);

        void innerNext(T t10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class SimpleScalarSubscription<T> extends AtomicBoolean implements InterfaceC5075d {
        final InterfaceC5074c downstream;
        final T value;

        SimpleScalarSubscription(T t10, InterfaceC5074c interfaceC5074c) {
            this.value = t10;
            this.downstream = interfaceC5074c;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (j10 > 0 && compareAndSet(false, true)) {
                InterfaceC5074c interfaceC5074c = this.downstream;
                interfaceC5074c.onNext(this.value);
                interfaceC5074c.onComplete();
            }
        }
    }

    public FlowableConcatMap(Flowable<T> flowable, Function<? super T, ? extends InterfaceC5073b> function, int i10, ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i10;
        this.errorMode = errorMode;
    }

    public static <T, R> InterfaceC5074c subscribe(InterfaceC5074c interfaceC5074c, Function<? super T, ? extends InterfaceC5073b> function, int i10, ErrorMode errorMode) {
        int i11 = C49521.$SwitchMap$io$reactivex$internal$util$ErrorMode[errorMode.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return new ConcatMapImmediate(interfaceC5074c, function, i10);
            }
            return new ConcatMapDelayed(interfaceC5074c, function, i10, true);
        }
        return new ConcatMapDelayed(interfaceC5074c, function, i10, false);
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC5074c, this.mapper)) {
            return;
        }
        this.source.subscribe(subscribe(interfaceC5074c, this.mapper, this.prefetch, this.errorMode));
    }
}
