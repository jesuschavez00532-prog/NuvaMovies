package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableZip<T, R> extends Flowable<R> {
    final int bufferSize;
    final boolean delayError;
    final InterfaceC5073b[] sources;
    final Iterable<? extends InterfaceC5073b> sourcesIterable;
    final Function<? super Object[], ? extends R> zipper;

    /* loaded from: classes3.dex */
    static final class ZipCoordinator<T, R> extends AtomicInteger implements InterfaceC5075d {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean cancelled;
        final Object[] current;
        final boolean delayErrors;
        final InterfaceC5074c downstream;
        final AtomicThrowable errors;
        final AtomicLong requested;
        final ZipSubscriber<T, R>[] subscribers;
        final Function<? super Object[], ? extends R> zipper;

        ZipCoordinator(InterfaceC5074c interfaceC5074c, Function<? super Object[], ? extends R> function, int i10, int i11, boolean z10) {
            this.downstream = interfaceC5074c;
            this.zipper = function;
            this.delayErrors = z10;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                zipSubscriberArr[i12] = new ZipSubscriber<>(this, i11);
            }
            this.current = new Object[i10];
            this.subscribers = zipSubscriberArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
            }
        }

        void cancelAll() {
            for (ZipSubscriber<T, R> zipSubscriber : this.subscribers) {
                zipSubscriber.cancel();
            }
        }

        void drain() {
            T t10;
            boolean z10;
            boolean z11;
            T t11;
            boolean z12;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC5074c interfaceC5074c = this.downstream;
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            int length = zipSubscriberArr.length;
            Object[] objArr = this.current;
            int i10 = 1;
            do {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j10 != j11) {
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        interfaceC5074c.onError(this.errors.terminate());
                        return;
                    }
                    boolean z13 = false;
                    for (int i11 = 0; i11 < length; i11++) {
                        ZipSubscriber<T, R> zipSubscriber = zipSubscriberArr[i11];
                        if (objArr[i11] == null) {
                            try {
                                z11 = zipSubscriber.done;
                                SimpleQueue<T> simpleQueue = zipSubscriber.queue;
                                if (simpleQueue != null) {
                                    t11 = simpleQueue.poll();
                                } else {
                                    t11 = null;
                                }
                                if (t11 == null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.errors.addThrowable(th);
                                if (!this.delayErrors) {
                                    cancelAll();
                                    interfaceC5074c.onError(this.errors.terminate());
                                    return;
                                }
                            }
                            if (z11 && z12) {
                                cancelAll();
                                if (this.errors.get() != null) {
                                    interfaceC5074c.onError(this.errors.terminate());
                                    return;
                                } else {
                                    interfaceC5074c.onComplete();
                                    return;
                                }
                            }
                            if (!z12) {
                                objArr[i11] = t11;
                            }
                            z13 = true;
                        }
                    }
                    if (z13) {
                        break;
                    }
                    try {
                        interfaceC5074c.onNext(ObjectHelper.requireNonNull(this.zipper.apply(objArr.clone()), "The zipper returned a null value"));
                        j11++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        cancelAll();
                        this.errors.addThrowable(th2);
                        interfaceC5074c.onError(this.errors.terminate());
                        return;
                    }
                }
                if (j10 == j11) {
                    if (this.cancelled) {
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        cancelAll();
                        interfaceC5074c.onError(this.errors.terminate());
                        return;
                    }
                    for (int i12 = 0; i12 < length; i12++) {
                        ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i12];
                        if (objArr[i12] == null) {
                            try {
                                boolean z14 = zipSubscriber2.done;
                                SimpleQueue<T> simpleQueue2 = zipSubscriber2.queue;
                                if (simpleQueue2 != null) {
                                    t10 = simpleQueue2.poll();
                                } else {
                                    t10 = null;
                                }
                                if (t10 == null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z14 && z10) {
                                    cancelAll();
                                    if (this.errors.get() != null) {
                                        interfaceC5074c.onError(this.errors.terminate());
                                        return;
                                    } else {
                                        interfaceC5074c.onComplete();
                                        return;
                                    }
                                }
                                if (!z10) {
                                    objArr[i12] = t10;
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.errors.addThrowable(th3);
                                if (!this.delayErrors) {
                                    cancelAll();
                                    interfaceC5074c.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        }
                    }
                }
                if (j11 != 0) {
                    for (ZipSubscriber<T, R> zipSubscriber3 : zipSubscriberArr) {
                        zipSubscriber3.request(j11);
                    }
                    if (j10 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j11);
                    }
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        void error(ZipSubscriber<T, R> zipSubscriber, Throwable th) {
            if (this.errors.addThrowable(th)) {
                zipSubscriber.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        void subscribe(InterfaceC5073b[] interfaceC5073bArr, int i10) {
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            for (int i11 = 0; i11 < i10 && !this.cancelled; i11++) {
                if (this.delayErrors || this.errors.get() == null) {
                    interfaceC5073bArr[i11].subscribe(zipSubscriberArr[i11]);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ZipSubscriber<T, R> extends AtomicReference<InterfaceC5075d> implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = -4627193790118206028L;
        volatile boolean done;
        final int limit;
        final ZipCoordinator<T, R> parent;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        int sourceMode;

        ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i10) {
            this.parent = zipCoordinator;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            this.parent.error(this, th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            if (this.sourceMode != 2) {
                this.queue.offer(t10);
            }
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.setOnce(this, interfaceC5075d)) {
                if (interfaceC5075d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC5075d;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        interfaceC5075d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                interfaceC5075d.request(this.prefetch);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (this.sourceMode != 1) {
                long j11 = this.produced + j10;
                if (j11 >= this.limit) {
                    this.produced = 0L;
                    get().request(j11);
                } else {
                    this.produced = j11;
                }
            }
        }
    }

    public FlowableZip(InterfaceC5073b[] interfaceC5073bArr, Iterable<? extends InterfaceC5073b> iterable, Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.sources = interfaceC5073bArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i10;
        this.delayError = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC5074c interfaceC5074c) {
        int length;
        InterfaceC5073b[] interfaceC5073bArr = this.sources;
        if (interfaceC5073bArr == null) {
            interfaceC5073bArr = new InterfaceC5073b[8];
            length = 0;
            for (InterfaceC5073b interfaceC5073b : this.sourcesIterable) {
                if (length == interfaceC5073bArr.length) {
                    InterfaceC5073b[] interfaceC5073bArr2 = new InterfaceC5073b[(length >> 2) + length];
                    System.arraycopy(interfaceC5073bArr, 0, interfaceC5073bArr2, 0, length);
                    interfaceC5073bArr = interfaceC5073bArr2;
                }
                interfaceC5073bArr[length] = interfaceC5073b;
                length++;
            }
        } else {
            length = interfaceC5073bArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptySubscription.complete(interfaceC5074c);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(interfaceC5074c, this.zipper, i10, this.bufferSize, this.delayError);
        interfaceC5074c.onSubscribe(zipCoordinator);
        zipCoordinator.subscribe(interfaceC5073bArr, i10);
    }
}
