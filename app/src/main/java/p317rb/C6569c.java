package p317rb;

import com.request.converterFactory.bean.ResultException;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import ne.AbstractC5868k;

/* renamed from: rb.c */
/* loaded from: classes2.dex */
public final class C6569c {

    /* renamed from: a */
    public static final C6569c f25182a = new C6569c();

    private C6569c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final Observable m25642c(Observable observable, Throwable th) {
        AbstractC5868k.m23674f(th, "throwable");
        if (th instanceof ResultException) {
            return Observable.error(th);
        }
        if (observable != null) {
            return observable;
        }
        return Observable.error(th);
    }

    /* renamed from: b */
    public final Function m25643b(final Observable observable) {
        return new Function() { // from class: rb.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m25642c;
                m25642c = C6569c.m25642c(Observable.this, (Throwable) obj);
                return m25642c;
            }
        };
    }
}
