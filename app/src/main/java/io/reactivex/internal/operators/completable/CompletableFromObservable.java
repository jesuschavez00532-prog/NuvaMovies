package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* loaded from: classes3.dex */
public final class CompletableFromObservable<T> extends Completable {
    final ObservableSource<T> observable;

    /* loaded from: classes3.dex */
    static final class CompletableFromObservableObserver<T> implements Observer<T> {

        /* renamed from: co */
        final CompletableObserver f20583co;

        CompletableFromObservableObserver(CompletableObserver completableObserver) {
            this.f20583co = completableObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f20583co.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.f20583co.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t10) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f20583co.onSubscribe(disposable);
        }
    }

    public CompletableFromObservable(ObservableSource<T> observableSource) {
        this.observable = observableSource;
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(CompletableObserver completableObserver) {
        this.observable.subscribe(new CompletableFromObservableObserver(completableObserver));
    }
}
