package p343tb;

import cc.C1466m0;
import com.request.bean.UserTokenInvalidEvent;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import ne.AbstractC5868k;
import ye.C7709c;

/* renamed from: tb.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6929a implements Observer {

    /* renamed from: a */
    private Disposable f26275a;

    /* renamed from: b */
    private final void m26921b(Throwable th) {
        try {
            th.printStackTrace();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final Disposable m26922a() {
        return this.f26275a;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        AbstractC5868k.m23674f(th, "e");
        m26921b(th);
    }

    @Override // io.reactivex.Observer
    public void onNext(Object obj) {
        AbstractC5868k.m23674f(obj, "t");
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        AbstractC5868k.m23674f(disposable, "d");
        this.f26275a = disposable;
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6880o() != 0 && c1466m0.m6880o() <= System.currentTimeMillis()) {
            C7709c.m29787d().m29801m(new UserTokenInvalidEvent());
            disposable.dispose();
        }
    }
}
