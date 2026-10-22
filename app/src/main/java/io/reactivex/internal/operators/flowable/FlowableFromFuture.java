package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    final Future<? extends T> future;
    final long timeout;
    final TimeUnit unit;

    public FlowableFromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j10;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC5074c interfaceC5074c) {
        T t10;
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(interfaceC5074c);
        interfaceC5074c.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.unit;
            if (timeUnit != null) {
                t10 = this.future.get(this.timeout, timeUnit);
            } else {
                t10 = this.future.get();
            }
            if (t10 == null) {
                interfaceC5074c.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(t10);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            if (!deferredScalarSubscription.isCancelled()) {
                interfaceC5074c.onError(th);
            }
        }
    }
}
