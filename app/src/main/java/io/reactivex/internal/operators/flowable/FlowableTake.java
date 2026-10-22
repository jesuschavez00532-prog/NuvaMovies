package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {
    final long limit;

    /* loaded from: classes3.dex */
    static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, InterfaceC5075d {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final InterfaceC5074c downstream;
        final long limit;
        long remaining;
        InterfaceC5075d upstream;

        /* JADX INFO: Access modifiers changed from: package-private */
        public TakeSubscriber(InterfaceC5074c interfaceC5074c, long j10) {
            this.downstream = interfaceC5074c;
            this.limit = j10;
            this.remaining = j10;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onNext(T t10) {
            boolean z10;
            if (!this.done) {
                long j10 = this.remaining;
                long j11 = j10 - 1;
                this.remaining = j11;
                if (j10 > 0) {
                    if (j11 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.downstream.onNext(t10);
                    if (z10) {
                        this.upstream.cancel();
                        onComplete();
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
                this.upstream = interfaceC5075d;
                if (this.limit == 0) {
                    interfaceC5075d.cancel();
                    this.done = true;
                    EmptySubscription.complete(this.downstream);
                    return;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
            if (!SubscriptionHelper.validate(j10)) {
                return;
            }
            if (!get() && compareAndSet(false, true) && j10 >= this.limit) {
                this.upstream.request(Long.MAX_VALUE);
            } else {
                this.upstream.request(j10);
            }
        }
    }

    public FlowableTake(Flowable<T> flowable, long j10) {
        super(flowable);
        this.limit = j10;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.source.subscribe((FlowableSubscriber) new TakeSubscriber(interfaceC5074c, this.limit));
    }
}
