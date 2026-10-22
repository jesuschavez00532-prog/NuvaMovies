package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {
    final Callable<C> bufferSupplier;
    final int size;
    final int skip;

    /* loaded from: classes3.dex */
    static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, InterfaceC5075d {
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final InterfaceC5074c downstream;
        int index;
        final int size;
        InterfaceC5075d upstream;

        PublisherBufferExactSubscriber(InterfaceC5074c interfaceC5074c, int i10, Callable<C> callable) {
            this.downstream = interfaceC5074c;
            this.size = i10;
            this.bufferSupplier = callable;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c10 = this.buffer;
            if (c10 != null && !c10.isEmpty()) {
                this.downstream.onNext(c10);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            C c10 = this.buffer;
            if (c10 == null) {
                try {
                    c10 = (C) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                    this.buffer = c10;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            c10.add(t10);
            int i10 = this.index + 1;
            if (i10 == this.size) {
                this.index = 0;
                this.buffer = null;
                this.downstream.onNext(c10);
                return;
            }
            this.index = i10;
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                this.upstream.request(BackpressureHelper.multiplyCap(j10, this.size));
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC5075d, BooleanSupplier {
        private static final long serialVersionUID = -7370244972039324525L;
        final Callable<C> bufferSupplier;
        volatile boolean cancelled;
        boolean done;
        final InterfaceC5074c downstream;
        int index;
        long produced;
        final int size;
        final int skip;
        InterfaceC5075d upstream;
        final AtomicBoolean once = new AtomicBoolean();
        final ArrayDeque<C> buffers = new ArrayDeque<>();

        PublisherBufferOverlappingSubscriber(InterfaceC5074c interfaceC5074c, int i10, int i11, Callable<C> callable) {
            this.downstream = interfaceC5074c;
            this.size = i10;
            this.skip = i11;
            this.bufferSupplier = callable;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        @Override // io.reactivex.functions.BooleanSupplier
        public boolean getAsBoolean() {
            return this.cancelled;
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            long j10 = this.produced;
            if (j10 != 0) {
                BackpressureHelper.produced(this, j10);
            }
            QueueDrainHelper.postComplete(this.downstream, this.buffers, this, this);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.buffers;
            int i10 = this.index;
            int i11 = i10 + 1;
            if (i10 == 0) {
                try {
                    arrayDeque.offer((Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer"));
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection != null && collection.size() + 1 == this.size) {
                arrayDeque.poll();
                collection.add(t10);
                this.produced++;
                this.downstream.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(t10);
            }
            if (i11 == this.skip) {
                i11 = 0;
            }
            this.index = i11;
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (!SubscriptionHelper.validate(j10) || QueueDrainHelper.postCompleteRequest(j10, this.downstream, this.buffers, this, this)) {
                return;
            }
            if (!this.once.get() && this.once.compareAndSet(false, true)) {
                this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j10 - 1)));
            } else {
                this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j10));
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = -5616169793639412593L;
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final InterfaceC5074c downstream;
        int index;
        final int size;
        final int skip;
        InterfaceC5075d upstream;

        PublisherBufferSkipSubscriber(InterfaceC5074c interfaceC5074c, int i10, int i11, Callable<C> callable) {
            this.downstream = interfaceC5074c;
            this.size = i10;
            this.skip = i11;
            this.bufferSupplier = callable;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c10 = this.buffer;
            this.buffer = null;
            if (c10 != null) {
                this.downstream.onNext(c10);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            C c10 = this.buffer;
            int i10 = this.index;
            int i11 = i10 + 1;
            if (i10 == 0) {
                try {
                    c10 = (C) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                    this.buffer = c10;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (c10 != null) {
                c10.add(t10);
                if (c10.size() == this.size) {
                    this.buffer = null;
                    this.downstream.onNext(c10);
                }
            }
            if (i11 == this.skip) {
                i11 = 0;
            }
            this.index = i11;
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(j10, this.size), BackpressureHelper.multiplyCap(this.skip - this.size, j10 - 1)));
                    return;
                }
                this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j10));
            }
        }
    }

    public FlowableBuffer(Flowable<T> flowable, int i10, int i11, Callable<C> callable) {
        super(flowable);
        this.size = i10;
        this.skip = i11;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC5074c interfaceC5074c) {
        int i10 = this.size;
        int i11 = this.skip;
        if (i10 == i11) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferExactSubscriber(interfaceC5074c, i10, this.bufferSupplier));
        } else if (i11 > i10) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferSkipSubscriber(interfaceC5074c, this.size, this.skip, this.bufferSupplier));
        } else {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferOverlappingSubscriber(interfaceC5074c, this.size, this.skip, this.bufferSupplier));
        }
    }
}
