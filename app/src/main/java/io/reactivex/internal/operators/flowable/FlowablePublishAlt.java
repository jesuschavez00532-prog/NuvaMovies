package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;
import p203k4.AbstractC5127x;

/* loaded from: classes3.dex */
public final class FlowablePublishAlt<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, ResettableConnectable {
    final int bufferSize;
    final AtomicReference<PublishConnection<T>> current = new AtomicReference<>();
    final InterfaceC5073b source;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class InnerSubscription<T> extends AtomicLong implements InterfaceC5075d {
        private static final long serialVersionUID = 2845000326761540265L;
        final InterfaceC5074c downstream;
        long emitted;
        final PublishConnection<T> parent;

        InnerSubscription(InterfaceC5074c interfaceC5074c, PublishConnection<T> publishConnection) {
            this.downstream = interfaceC5074c;
            this.parent = publishConnection;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.drain();
            }
        }

        public boolean isCancelled() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            BackpressureHelper.addCancel(this, j10);
            this.parent.drain();
        }
    }

    /* loaded from: classes3.dex */
    static final class PublishConnection<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscription[] EMPTY = new InnerSubscription[0];
        static final InnerSubscription[] TERMINATED = new InnerSubscription[0];
        private static final long serialVersionUID = -1672047311619175801L;
        final int bufferSize;
        int consumed;
        final AtomicReference<PublishConnection<T>> current;
        volatile boolean done;
        Throwable error;
        volatile SimpleQueue<T> queue;
        int sourceMode;
        final AtomicReference<InterfaceC5075d> upstream = new AtomicReference<>();
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<InnerSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);

        PublishConnection(AtomicReference<PublishConnection<T>> atomicReference, int i10) {
            this.current = atomicReference;
            this.bufferSize = i10;
        }

        boolean add(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.subscribers.get();
                if (innerSubscriptionArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new InnerSubscription[length + 1];
                System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!AbstractC5127x.m20760a(this.subscribers, innerSubscriptionArr, innerSubscriptionArr2));
            return true;
        }

        boolean checkTerminated(boolean z10, boolean z11) {
            if (!z10 || !z11) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                signalError(th);
                return true;
            }
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (!innerSubscription.isCancelled()) {
                    innerSubscription.downstream.onComplete();
                }
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.subscribers.getAndSet(TERMINATED);
            AbstractC5127x.m20760a(this.current, this, null);
            SubscriptionHelper.cancel(this.upstream);
        }

        void drain() {
            boolean z10;
            boolean z11;
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue<T> simpleQueue = this.queue;
            int i10 = this.consumed;
            int i11 = this.bufferSize;
            int i12 = i11 - (i11 >> 2);
            if (this.sourceMode != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i13 = 1;
            SimpleQueue<T> simpleQueue2 = simpleQueue;
            int i14 = i10;
            while (true) {
                if (simpleQueue2 != null) {
                    InnerSubscription<T>[] innerSubscriptionArr = this.subscribers.get();
                    long j10 = Long.MAX_VALUE;
                    boolean z12 = false;
                    for (InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                        long j11 = innerSubscription.get();
                        if (j11 != Long.MIN_VALUE) {
                            j10 = Math.min(j11 - innerSubscription.emitted, j10);
                            z12 = true;
                        }
                    }
                    if (!z12) {
                        j10 = 0;
                    }
                    for (long j12 = 0; j10 != j12; j12 = 0) {
                        boolean z13 = this.done;
                        try {
                            T poll = simpleQueue2.poll();
                            if (poll == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (checkTerminated(z13, z11)) {
                                return;
                            }
                            if (z11) {
                                break;
                            }
                            for (InnerSubscription<T> innerSubscription2 : innerSubscriptionArr) {
                                if (!innerSubscription2.isCancelled()) {
                                    innerSubscription2.downstream.onNext(poll);
                                    innerSubscription2.emitted++;
                                }
                            }
                            if (z10 && (i14 = i14 + 1) == i12) {
                                this.upstream.get().request(i12);
                                i14 = 0;
                            }
                            j10--;
                            if (innerSubscriptionArr != this.subscribers.get()) {
                                break;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.get().cancel();
                            simpleQueue2.clear();
                            this.done = true;
                            signalError(th);
                            return;
                        }
                    }
                    if (checkTerminated(this.done, simpleQueue2.isEmpty())) {
                        return;
                    }
                }
                this.consumed = i14;
                i13 = addAndGet(-i13);
                if (i13 == 0) {
                    return;
                }
                if (simpleQueue2 == null) {
                    simpleQueue2 = this.queue;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.subscribers.get() == TERMINATED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            if (this.sourceMode == 0 && !this.queue.offer(t10)) {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC5075d)) {
                if (interfaceC5075d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC5075d;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        interfaceC5075d.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                interfaceC5075d.request(this.bufferSize);
            }
        }

        void remove(InnerSubscription<T> innerSubscription) {
            InnerSubscription<T>[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.subscribers.get();
                int length = innerSubscriptionArr.length;
                if (length != 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            if (innerSubscriptionArr[i10] == innerSubscription) {
                                break;
                            } else {
                                i10++;
                            }
                        } else {
                            i10 = -1;
                            break;
                        }
                    }
                    if (i10 < 0) {
                        return;
                    }
                    if (length == 1) {
                        innerSubscriptionArr2 = EMPTY;
                    } else {
                        InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                        System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i10);
                        System.arraycopy(innerSubscriptionArr, i10 + 1, innerSubscriptionArr3, i10, (length - i10) - 1);
                        innerSubscriptionArr2 = innerSubscriptionArr3;
                    }
                } else {
                    return;
                }
            } while (!AbstractC5127x.m20760a(this.subscribers, innerSubscriptionArr, innerSubscriptionArr2));
        }

        void signalError(Throwable th) {
            for (InnerSubscription<T> innerSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (!innerSubscription.isCancelled()) {
                    innerSubscription.downstream.onError(th);
                }
            }
        }
    }

    public FlowablePublishAlt(InterfaceC5073b interfaceC5073b, int i10) {
        this.source = interfaceC5073b;
        this.bufferSize = i10;
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        PublishConnection<T> publishConnection;
        while (true) {
            publishConnection = this.current.get();
            if (publishConnection != null && !publishConnection.isDisposed()) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.current, this.bufferSize);
            if (AbstractC5127x.m20760a(this.current, publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        boolean z10 = false;
        if (!publishConnection.connect.get() && publishConnection.connect.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            consumer.accept(publishConnection);
            if (z10) {
                this.source.subscribe(publishConnection);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    public int publishBufferSize() {
        return this.bufferSize;
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable) {
        AbstractC5127x.m20760a(this.current, (PublishConnection) disposable, null);
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public InterfaceC5073b source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        PublishConnection<T> publishConnection;
        while (true) {
            publishConnection = this.current.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.current, this.bufferSize);
            if (AbstractC5127x.m20760a(this.current, publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        InnerSubscription<T> innerSubscription = new InnerSubscription<>(interfaceC5074c, publishConnection);
        interfaceC5074c.onSubscribe(innerSubscription);
        if (publishConnection.add(innerSubscription)) {
            if (innerSubscription.isCancelled()) {
                publishConnection.remove(innerSubscription);
                return;
            } else {
                publishConnection.drain();
                return;
            }
        }
        Throwable th = publishConnection.error;
        if (th != null) {
            interfaceC5074c.onError(th);
        } else {
            interfaceC5074c.onComplete();
        }
    }
}
