package p213kf;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Response;

/* renamed from: kf.a */
/* loaded from: classes3.dex */
final class C5253a extends Observable {

    /* renamed from: a */
    private final Observable f21434a;

    /* renamed from: kf.a$a */
    /* loaded from: classes3.dex */
    private static class a implements Observer {

        /* renamed from: a */
        private final Observer f21435a;

        /* renamed from: b */
        private boolean f21436b;

        a(Observer observer) {
            this.f21435a = observer;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Response response) {
            if (response.m25763d()) {
                this.f21435a.onNext(response.m25761a());
                return;
            }
            this.f21436b = true;
            C5256d c5256d = new C5256d(response);
            try {
                this.f21435a.onError(c5256d);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(new CompositeException(c5256d, th));
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f21436b) {
                this.f21435a.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.f21436b) {
                this.f21435a.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            RxJavaPlugins.onError(assertionError);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f21435a.onSubscribe(disposable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5253a(Observable observable) {
        this.f21434a = observable;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer observer) {
        this.f21434a.subscribe(new a(observer));
    }
}
