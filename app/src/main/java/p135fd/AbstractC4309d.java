package p135fd;

import id.AbstractC4931a;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: fd.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4309d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fd.d$a */
    /* loaded from: classes3.dex */
    public static class a implements Predicate {

        /* renamed from: a */
        final /* synthetic */ Object f18747a;

        a(Object obj) {
            this.f18747a = obj;
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            return obj.equals(this.f18747a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fd.d$b */
    /* loaded from: classes3.dex */
    public static class b implements BiFunction {
        b() {
        }

        @Override // io.reactivex.functions.BiFunction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(Object obj, Object obj2) {
            return Boolean.valueOf(obj2.equals(obj));
        }
    }

    /* renamed from: a */
    public static C4307b m18082a(Observable observable) {
        return new C4307b(observable);
    }

    /* renamed from: b */
    public static C4307b m18083b(Observable observable, Function function) {
        AbstractC4931a.m20267a(observable, "lifecycle == null");
        AbstractC4931a.m20267a(function, "correspondingEvents == null");
        return m18082a(m18085d(observable.share(), function));
    }

    /* renamed from: c */
    public static C4307b m18084c(Observable observable, Object obj) {
        AbstractC4931a.m20267a(observable, "lifecycle == null");
        AbstractC4931a.m20267a(obj, "event == null");
        return m18082a(m18086e(observable, obj));
    }

    /* renamed from: d */
    private static Observable m18085d(Observable observable, Function function) {
        return Observable.combineLatest(observable.take(1L).map(function), observable.skip(1L), new b()).onErrorReturn(AbstractC4306a.f18743a).filter(AbstractC4306a.f18744b);
    }

    /* renamed from: e */
    private static Observable m18086e(Observable observable, Object obj) {
        return observable.filter(new a(obj));
    }
}
