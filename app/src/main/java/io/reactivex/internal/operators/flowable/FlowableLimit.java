package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: n */
    final long f20597n;

    /* loaded from: classes3.dex */
    static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = 2288246011222124525L;
        final InterfaceC5074c downstream;
        long remaining;
        InterfaceC5075d upstream;

        LimitSubscriber(InterfaceC5074c interfaceC5074c, long j10) {
            this.downstream = interfaceC5074c;
            this.remaining = j10;
            lazySet(j10);
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            long j10 = this.remaining;
            if (j10 > 0) {
                long j11 = j10 - 1;
                this.remaining = j11;
                this.downstream.onNext(t10);
                if (j11 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                if (this.remaining == 0) {
                    interfaceC5075d.cancel();
                    EmptySubscription.complete(this.downstream);
                } else {
                    this.upstream = interfaceC5075d;
                    this.downstream.onSubscribe(this);
                }
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
                if (j11 != 0) {
                    if (j11 <= j10) {
                        j12 = j11;
                    } else {
                        j12 = j10;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(j11, j11 - j12));
            this.upstream.request(j12);
        }
    }

    public FlowableLimit(Flowable<T> flowable, long j10) {
        super(flowable);
        this.f20597n = j10;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe((FlowableSubscriber) new LimitSubscriber(interfaceC5074c, this.f20597n));
    }
}
