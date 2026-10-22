package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {
    final long bufferSize;
    final Action onOverflow;
    final BackpressureOverflowStrategy strategy;

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C49541 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureOverflowStrategy;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            $SwitchMap$io$reactivex$BackpressureOverflowStrategy = iArr;
            try {
                iArr[BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureOverflowStrategy[BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = 3240706908776709697L;
        final long bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC5074c downstream;
        Throwable error;
        final Action onOverflow;
        final BackpressureOverflowStrategy strategy;
        InterfaceC5075d upstream;
        final AtomicLong requested = new AtomicLong();
        final Deque<T> deque = new ArrayDeque();

        OnBackpressureBufferStrategySubscriber(InterfaceC5074c interfaceC5074c, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy, long j10) {
            this.downstream = interfaceC5074c;
            this.onOverflow = action;
            this.strategy = backpressureOverflowStrategy;
            this.bufferSize = j10;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                clear(this.deque);
            }
        }

        void clear(Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        void drain() {
            boolean isEmpty;
            T poll;
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            Deque<T> deque = this.deque;
            InterfaceC5074c interfaceC5074c = this.downstream;
            int i10 = 1;
            do {
                long j10 = this.requested.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.cancelled) {
                        clear(deque);
                        return;
                    }
                    boolean z11 = this.done;
                    synchronized (deque) {
                        poll = deque.poll();
                    }
                    if (poll == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11) {
                        Throwable th = this.error;
                        if (th != null) {
                            clear(deque);
                            interfaceC5074c.onError(th);
                            return;
                        } else if (z10) {
                            interfaceC5074c.onComplete();
                            return;
                        }
                    }
                    if (z10) {
                        break;
                    }
                    interfaceC5074c.onNext(poll);
                    j11++;
                }
                if (j11 == j10) {
                    if (this.cancelled) {
                        clear(deque);
                        return;
                    }
                    boolean z12 = this.done;
                    synchronized (deque) {
                        isEmpty = deque.isEmpty();
                    }
                    if (z12) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            clear(deque);
                            interfaceC5074c.onError(th2);
                            return;
                        } else if (isEmpty) {
                            interfaceC5074c.onComplete();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    BackpressureHelper.produced(this.requested, j11);
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
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
            boolean z10;
            boolean z11;
            if (this.done) {
                return;
            }
            Deque<T> deque = this.deque;
            synchronized (deque) {
                z10 = false;
                if (deque.size() == this.bufferSize) {
                    int i10 = C49541.$SwitchMap$io$reactivex$BackpressureOverflowStrategy[this.strategy.ordinal()];
                    z11 = true;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            deque.poll();
                            deque.offer(t10);
                        }
                    } else {
                        deque.pollLast();
                        deque.offer(t10);
                    }
                    z11 = false;
                    z10 = true;
                } else {
                    deque.offer(t10);
                    z11 = false;
                }
            }
            if (z10) {
                Action action = this.onOverflow;
                if (action != null) {
                    try {
                        action.run();
                        return;
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.upstream.cancel();
                        onError(th);
                        return;
                    }
                }
                return;
            }
            if (z11) {
                this.upstream.cancel();
                onError(new MissingBackpressureException());
            } else {
                drain();
            }
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
    }

    public FlowableOnBackpressureBufferStrategy(Flowable<T> flowable, long j10, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(flowable);
        this.bufferSize = j10;
        this.onOverflow = action;
        this.strategy = backpressureOverflowStrategy;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe((FlowableSubscriber) new OnBackpressureBufferStrategySubscriber(interfaceC5074c, this.onOverflow, this.strategy, this.bufferSize));
    }
}
