package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import p197jf.InterfaceC5074c;
import p197jf.InterfaceC5075d;

/* loaded from: classes3.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {
    private final Observable<T> upstream;

    /* loaded from: classes3.dex */
    static final class SubscriberObserver<T> implements Observer<T>, InterfaceC5075d {
        final InterfaceC5074c downstream;
        Disposable upstream;

        SubscriberObserver(InterfaceC5074c interfaceC5074c) {
            this.downstream = interfaceC5074c;
        }

        @Override // p197jf.InterfaceC5075d
        public void cancel() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.upstream = disposable;
            this.downstream.onSubscribe(this);
        }

        @Override // p197jf.InterfaceC5075d
        public void request(long j10) {
        }
    }

    public FlowableFromObservable(Observable<T> observable) {
        this.upstream = observable;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(InterfaceC5074c interfaceC5074c) {
        this.upstream.subscribe(new SubscriberObserver(interfaceC5074c));
    }
}
