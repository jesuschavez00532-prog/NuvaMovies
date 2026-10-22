package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {
    InterfaceC5075d upstream;

    protected final void cancel() {
        InterfaceC5075d interfaceC5075d = this.upstream;
        this.upstream = SubscriptionHelper.CANCELLED;
        interfaceC5075d.cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public abstract /* synthetic */ void onNext(Object obj);

    protected void onStart() {
        request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public final void onSubscribe(InterfaceC5075d interfaceC5075d) {
        if (EndConsumerHelper.validate(this.upstream, interfaceC5075d, getClass())) {
            this.upstream = interfaceC5075d;
            onStart();
        }
    }

    protected final void request(long j10) {
        InterfaceC5075d interfaceC5075d = this.upstream;
        if (interfaceC5075d != null) {
            interfaceC5075d.request(j10);
        }
    }
}
