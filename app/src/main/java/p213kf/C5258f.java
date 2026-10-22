package p213kf;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Response;

/* renamed from: kf.f */
/* loaded from: classes3.dex */
final class C5258f extends Observable {

    /* renamed from: a */
    private final Observable f21447a;

    /* renamed from: kf.f$a */
    /* loaded from: classes3.dex */
    private static class a implements Observer {

        /* renamed from: a */
        private final Observer f21448a;

        a(Observer observer) {
            this.f21448a = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Response response) {
            this.f21448a.onNext(C5257e.m21161b(response));
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f21448a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            try {
                this.f21448a.onNext(C5257e.m21160a(th));
                this.f21448a.onComplete();
            } catch (Throwable th2) {
                try {
                    this.f21448a.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th2, th3));
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f21448a.onSubscribe(disposable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5258f(Observable observable) {
        this.f21447a = observable;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer observer) {
        this.f21447a.subscribe(new a(observer));
    }
}
