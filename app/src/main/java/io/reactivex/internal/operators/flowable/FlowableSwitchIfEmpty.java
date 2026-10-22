package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {
    final InterfaceC5073b other;

    /* loaded from: classes3.dex */
    static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {
        final InterfaceC5074c downstream;
        final InterfaceC5073b other;
        boolean empty = true;
        final SubscriptionArbiter arbiter = new SubscriptionArbiter(false);

        SwitchIfEmptySubscriber(InterfaceC5074c interfaceC5074c, InterfaceC5073b interfaceC5073b) {
            this.downstream = interfaceC5074c;
            this.other = interfaceC5073b;
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onComplete() {
            if (this.empty) {
                this.empty = false;
                this.other.subscribe(this);
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
            if (this.empty) {
                this.empty = false;
            }
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
        public void onSubscribe(InterfaceC5075d interfaceC5075d) {
            this.arbiter.setSubscription(interfaceC5075d);
        }
    }

    public FlowableSwitchIfEmpty(Flowable<T> flowable, InterfaceC5073b interfaceC5073b) {
        super(flowable);
        this.other = interfaceC5073b;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber(interfaceC5074c, this.other);
        interfaceC5074c.onSubscribe(switchIfEmptySubscriber.arbiter);
        this.source.subscribe((FlowableSubscriber) switchIfEmptySubscriber);
    }
}
