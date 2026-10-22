package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, InterfaceC5075d {
    final InterfaceC5074c subscriber;
    Disposable upstream;

    public SubscriberCompletableObserver(InterfaceC5074c interfaceC5074c) {
        this.subscriber = interfaceC5074c;
    }

    @Override // p197jf.InterfaceC5075d
    public void cancel() {
        this.upstream.dispose();
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        this.subscriber.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        this.subscriber.onError(th);
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.subscriber.onSubscribe(this);
        }
    }

    @Override // p197jf.InterfaceC5075d
    public void request(long j10) {
    }
}
