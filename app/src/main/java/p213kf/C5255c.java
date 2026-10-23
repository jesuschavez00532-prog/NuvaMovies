package p213kf;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.Call;
import retrofit2.Response;

/* renamed from: kf.c */
/* loaded from: classes3.dex */
final class C5255c extends Observable {

    /* renamed from: a */
    private final Call f21442a;

    /* renamed from: kf.c$a */
    /* loaded from: classes3.dex */
    private static final class a implements Disposable {

        /* renamed from: a */
        private final Call f21443a;

        /* renamed from: b */
        private volatile boolean f21444b;

        a(Call call) {
            this.f21443a = call;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f21444b = true;
            this.f21443a.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f21444b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5255c(Call call) {
        this.f21442a = call;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer observer) {
        boolean z10 = false;
        Call clone = this.f21442a.clone();
        a aVar = new a(clone);
        observer.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        try {
            Response execute = clone.execute();
            if (!aVar.isDisposed()) {
                observer.onNext(execute);
            }
            if (!aVar.isDisposed()) {
                try {
                    observer.onComplete();
                } catch (Throwable th) {
                    th = th;
                    z10 = true;
                    Exceptions.throwIfFatal(th);
                    if (z10) {
                        RxJavaPlugins.onError(th);
                        return;
                    }
                    if (!aVar.isDisposed()) {
                        try {
                            observer.onError(th);
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            RxJavaPlugins.onError(new CompositeException(th, th2));
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }
}
