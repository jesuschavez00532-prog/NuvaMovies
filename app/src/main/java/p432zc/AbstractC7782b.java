package p432zc;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/* renamed from: zc.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7782b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zc.b$a */
    /* loaded from: classes3.dex */
    public static class a implements ObservableTransformer {
        a() {
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return observable.subscribeOn(Schedulers.m20294io()).observeOn(AndroidSchedulers.mainThread());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zc.b$b */
    /* loaded from: classes3.dex */
    public static class b implements ObservableTransformer {
        b() {
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return observable.subscribeOn(Schedulers.m20294io()).observeOn(Schedulers.m20294io());
        }
    }

    /* renamed from: a */
    public static ObservableTransformer m30144a() {
        return new a();
    }

    /* renamed from: b */
    public static ObservableTransformer m30145b() {
        return new b();
    }
}
