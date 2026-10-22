package p213kf;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: kf.b */
/* loaded from: classes3.dex */
final class C5254b extends Observable {

    /* renamed from: a */
    private final Call f21437a;

    /* renamed from: kf.b$a */
    /* loaded from: classes3.dex */
    private static final class a implements Disposable, Callback {

        /* renamed from: a */
        private final Call f21438a;

        /* renamed from: b */
        private final Observer f21439b;

        /* renamed from: c */
        private volatile boolean f21440c;

        /* renamed from: d */
        boolean f21441d = false;

        a(Call call, Observer observer) {
            this.f21438a = call;
            this.f21439b = observer;
        }

        @Override // retrofit2.Callback
        /* renamed from: a */
        public void mo21158a(Call call, Throwable th) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.f21439b.onError(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(th, th2));
            }
        }

        @Override // retrofit2.Callback
        /* renamed from: b */
        public void mo21159b(Call call, Response response) {
            if (this.f21440c) {
                return;
            }
            try {
                this.f21439b.onNext(response);
                if (!this.f21440c) {
                    this.f21441d = true;
                    this.f21439b.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                if (this.f21441d) {
                    RxJavaPlugins.onError(th);
                    return;
                }
                if (!this.f21440c) {
                    try {
                        this.f21439b.onError(th);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        RxJavaPlugins.onError(new CompositeException(th, th2));
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f21440c = true;
            this.f21438a.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f21440c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5254b(Call call) {
        this.f21437a = call;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer observer) {
        Call clone = this.f21437a.clone();
        a aVar = new a(clone, observer);
        observer.onSubscribe(aVar);
        if (!aVar.isDisposed()) {
            clone.mo25686n(aVar);
        }
    }
}
