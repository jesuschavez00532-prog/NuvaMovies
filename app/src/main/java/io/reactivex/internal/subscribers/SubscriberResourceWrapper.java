package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, Disposable, InterfaceC5075d {
    private static final long serialVersionUID = -8612022020200669122L;
    final InterfaceC5074c downstream;
    final AtomicReference<InterfaceC5075d> upstream = new AtomicReference<>();

    public SubscriberResourceWrapper(InterfaceC5074c interfaceC5074c) {
        this.downstream = interfaceC5074c;
    }

    @Override // p197jf.InterfaceC5075d
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (this.upstream.get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onNext(T t10) {
        this.downstream.onNext(t10);
    }

    @Override // io.reactivex.FlowableSubscriber, p197jf.InterfaceC5074c
    public void onSubscribe(InterfaceC5075d interfaceC5075d) {
        if (SubscriptionHelper.setOnce(this.upstream, interfaceC5075d)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // p197jf.InterfaceC5075d
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            this.upstream.get().request(j10);
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }
}
