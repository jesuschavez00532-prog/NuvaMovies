package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import p197jf.InterfaceC5073b;
import p197jf.InterfaceC5074c;

/* loaded from: classes3.dex */
public final class FlowableDefer<T> extends Flowable<T> {
    final Callable<? extends InterfaceC5073b> supplier;

    public FlowableDefer(Callable<? extends InterfaceC5073b> callable) {
        this.supplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC5074c interfaceC5074c) {
        try {
            ((InterfaceC5073b) ObjectHelper.requireNonNull(this.supplier.call(), "The publisher supplied is null")).subscribe(interfaceC5074c);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, interfaceC5074c);
        }
    }
}
