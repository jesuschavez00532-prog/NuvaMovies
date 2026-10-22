package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {
    volatile boolean cancelled;
    Throwable error;
    InterfaceC5075d upstream;
    T value;

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e10) {
                InterfaceC5075d interfaceC5075d = this.upstream;
                this.upstream = SubscriptionHelper.CANCELLED;
                if (interfaceC5075d != null) {
                    interfaceC5075d.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(e10);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public final void onSubscribe(InterfaceC5075d interfaceC5075d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC5075d)) {
            this.upstream = interfaceC5075d;
            if (!this.cancelled) {
                interfaceC5075d.request(Long.MAX_VALUE);
                if (this.cancelled) {
                    this.upstream = SubscriptionHelper.CANCELLED;
                    interfaceC5075d.cancel();
                }
            }
        }
    }
}
