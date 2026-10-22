package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {
    final long count;

    /* loaded from: classes3.dex */
    static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final InterfaceC5074c downstream;
        long produced;
        long remaining;

        /* renamed from: sa */
        final SubscriptionArbiter f20599sa;
        final InterfaceC5073b source;

        RepeatSubscriber(InterfaceC5074c interfaceC5074c, long j10, SubscriptionArbiter subscriptionArbiter, InterfaceC5073b interfaceC5073b) {
            this.downstream = interfaceC5074c;
            this.f20599sa = subscriptionArbiter;
            this.source = interfaceC5073b;
            this.remaining = j10;
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            long j10 = this.remaining;
            if (j10 != Long.MAX_VALUE) {
                this.remaining = j10 - 1;
            }
            if (j10 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            this.produced++;
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            this.f20599sa.setSubscription(interfaceC5075d);
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i10 = 1;
                while (!this.f20599sa.isCancelled()) {
                    long j10 = this.produced;
                    if (j10 != 0) {
                        this.produced = 0L;
                        this.f20599sa.produced(j10);
                    }
                    this.source.subscribe(this);
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                }
            }
        }
    }

    public FlowableRepeat(Flowable<T> flowable, long j10) {
        super(flowable);
        this.count = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC5074c interfaceC5074c) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        interfaceC5074c.onSubscribe(subscriptionArbiter);
        long j10 = this.count;
        long j11 = Long.MAX_VALUE;
        if (j10 != Long.MAX_VALUE) {
            j11 = j10 - 1;
        }
        new RepeatSubscriber(interfaceC5074c, j11, subscriptionArbiter, this.source).subscribeNext();
    }
}
