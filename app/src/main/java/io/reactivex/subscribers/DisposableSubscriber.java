package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    final AtomicReference<InterfaceC5075d> upstream = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public abstract /* synthetic */ void onNext(Object obj);

    protected void onStart() {
        this.upstream.get().request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public final void onSubscribe(InterfaceC5075d interfaceC5075d) {
        if (EndConsumerHelper.setOnce(this.upstream, interfaceC5075d, getClass())) {
            onStart();
        }
    }

    protected final void request(long j10) {
        this.upstream.get().request(j10);
    }
}
