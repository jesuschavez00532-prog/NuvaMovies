package p135fd;

import id.AbstractC4931a;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.MaybeTransformer;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import p197jf.InterfaceC5073b;

/* renamed from: fd.b */
/* loaded from: classes3.dex */
public final class C4307b implements ObservableTransformer, FlowableTransformer, SingleTransformer, MaybeTransformer, CompletableTransformer {

    /* renamed from: a */
    final Observable f18746a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4307b(Observable observable) {
        AbstractC4931a.m20267a(observable, "observable == null");
        this.f18746a = observable;
    }

    @Override // io.reactivex.ObservableTransformer
    public ObservableSource apply(Observable observable) {
        return observable.takeUntil(this.f18746a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4307b.class == obj.getClass()) {
            return this.f18746a.equals(((C4307b) obj).f18746a);
        }
        return false;
    }

    public int hashCode() {
        return this.f18746a.hashCode();
    }

    public String toString() {
        return "LifecycleTransformer{observable=" + this.f18746a + '}';
    }

    @Override // io.reactivex.FlowableTransformer
    public InterfaceC5073b apply(Flowable flowable) {
        return flowable.takeUntil(this.f18746a.toFlowable(BackpressureStrategy.LATEST));
    }

    @Override // io.reactivex.SingleTransformer
    public SingleSource apply(Single single) {
        return single.takeUntil(this.f18746a.firstOrError());
    }

    @Override // io.reactivex.MaybeTransformer
    public MaybeSource apply(Maybe maybe) {
        return maybe.takeUntil(this.f18746a.firstElement());
    }

    @Override // io.reactivex.CompletableTransformer
    public CompletableSource apply(Completable completable) {
        return Completable.ambArray(completable, this.f18746a.flatMapCompletable(AbstractC4306a.f18745c));
    }
}
