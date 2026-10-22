package p348u2;

import android.os.Looper;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/* renamed from: u2.f */
/* loaded from: classes.dex */
public abstract class AbstractC7029f {

    /* renamed from: u2.f$a */
    /* loaded from: classes.dex */
    class a implements ObservableTransformer {
        a() {
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return observable.subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2.f$b */
    /* loaded from: classes.dex */
    public class b implements ObservableTransformer {
        b() {
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return observable.subscribeOn(Schedulers.m20294io()).observeOn(AndroidSchedulers.mainThread());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u2.f$c */
    /* loaded from: classes.dex */
    public class c implements ObservableTransformer {
        c() {
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return observable.subscribeOn(Schedulers.m20294io());
        }
    }

    /* renamed from: u2.f$d */
    /* loaded from: classes.dex */
    class d implements ObservableTransformer {
        d() {
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return observable.observeOn(Schedulers.m20294io());
        }
    }

    /* renamed from: u2.f$e */
    /* loaded from: classes.dex */
    class e implements ObservableTransformer {
        e() {
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return observable.observeOn(AndroidSchedulers.mainThread());
        }
    }

    /* renamed from: u2.f$f */
    /* loaded from: classes.dex */
    class f implements ObservableTransformer {
        f() {
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            return observable;
        }
    }

    /* renamed from: u2.f$g */
    /* loaded from: classes.dex */
    class g implements ObservableTransformer {
        g() {
        }

        @Override // io.reactivex.ObservableTransformer
        public ObservableSource apply(Observable observable) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                return observable.subscribeOn(Schedulers.m20294io());
            }
            return observable;
        }
    }

    /* renamed from: a */
    public static ObservableTransformer m27120a() {
        return new a();
    }

    /* renamed from: b */
    public static ObservableTransformer m27121b() {
        return new b();
    }

    /* renamed from: c */
    public static ObservableTransformer m27122c() {
        return new c();
    }

    /* renamed from: d */
    public static ObservableTransformer m27123d() {
        return new f();
    }

    /* renamed from: e */
    public static ObservableTransformer m27124e() {
        return new d();
    }

    /* renamed from: f */
    public static ObservableTransformer m27125f() {
        return new e();
    }

    /* renamed from: g */
    public static ObservableTransformer m27126g() {
        return new g();
    }
}
