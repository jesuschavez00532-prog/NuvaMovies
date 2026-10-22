package p432zc;

import android.util.Log;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5642a;
import ne.AbstractC5868k;

/* renamed from: zc.c */
/* loaded from: classes3.dex */
public final class C7783c {

    /* renamed from: a */
    private Disposable f28709a;

    /* renamed from: b */
    private final String f28710b = "RxTimerUtil";

    /* renamed from: zc.c$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo29695a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zc.c$b */
    /* loaded from: classes3.dex */
    public static final class b implements Function {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5642a f28711a;

        b(InterfaceC5642a interfaceC5642a) {
            this.f28711a = interfaceC5642a;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String apply(Long l10) {
            AbstractC5868k.m23675g(l10, "it");
            return (String) this.f28711a.invoke();
        }
    }

    /* renamed from: zc.c$c */
    /* loaded from: classes3.dex */
    public static final class c implements Observer {

        /* renamed from: b */
        final /* synthetic */ a f28713b;

        c(a aVar) {
            this.f28713b = aVar;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(String str) {
            AbstractC5868k.m23675g(str, "programData");
            a aVar = this.f28713b;
            if (aVar != null) {
                aVar.mo29695a(str);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Log.d(C7783c.this.f28710b, "onComplete");
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23675g(th, "e");
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23675g(disposable, "disposable");
            C7783c.this.f28709a = disposable;
        }
    }

    /* renamed from: c */
    public final void m30148c() {
        Disposable disposable = this.f28709a;
        if (disposable != null && !disposable.isDisposed()) {
            Disposable disposable2 = this.f28709a;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            Log.d(this.f28710b, "cancel");
        }
        this.f28709a = null;
    }

    /* renamed from: d */
    public final void m30149d(long j10, InterfaceC5642a interfaceC5642a, a aVar) {
        AbstractC5868k.m23675g(interfaceC5642a, "subscribe");
        Observable.interval(j10, TimeUnit.SECONDS).map(new b(interfaceC5642a)).compose(AbstractC7782b.m30144a()).subscribe(new c(aVar));
    }
}
