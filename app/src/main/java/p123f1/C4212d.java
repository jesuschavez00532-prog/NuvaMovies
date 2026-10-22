package p123f1;

import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.umeng.analytics.pro.C3325bt;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p348u2.AbstractC7029f;

/* renamed from: f1.d */
/* loaded from: classes.dex */
public final class C4212d {

    /* renamed from: c */
    public static final b f18470c = new b(null);

    /* renamed from: d */
    private static final InterfaceC1312h f18471d;

    /* renamed from: a */
    private Disposable f18472a;

    /* renamed from: b */
    private final String f18473b;

    /* renamed from: f1.d$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f18474a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4212d invoke() {
            return new C4212d(null);
        }
    }

    /* renamed from: f1.d$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C4212d m17606a() {
            return (C4212d) C4212d.f18471d.getValue();
        }
    }

    /* renamed from: f1.d$c */
    /* loaded from: classes.dex */
    public class c {
        /* renamed from: a */
        void mo17607a();
    }

    /* renamed from: f1.d$d */
    /* loaded from: classes.dex */
    public static final class d implements Observer {

        /* renamed from: b */
        final /* synthetic */ c f18476b;

        d(c cVar) {
            this.f18476b = cVar;
        }

        @Override // io.reactivex.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(String str) {
            c cVar;
            AbstractC5868k.m23674f(str, C3325bt.f14190aH);
            Disposable disposable = C4212d.this.f18472a;
            boolean z10 = false;
            if (disposable != null && !disposable.isDisposed()) {
                z10 = true;
            }
            if (z10 && (cVar = this.f18476b) != null) {
                cVar.mo17607a();
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            C4212d.this.f18472a = disposable;
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f18474a);
        f18471d = m5965b;
    }

    public /* synthetic */ C4212d(AbstractC5864g abstractC5864g) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m17602g(ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(observableEmitter, "emitter");
        observableEmitter.onNext("insert");
        observableEmitter.onComplete();
    }

    /* renamed from: e */
    public final void m17603e() {
        Disposable disposable;
        Disposable disposable2 = this.f18472a;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f18472a) != null) {
            disposable.dispose();
        }
    }

    /* renamed from: f */
    public final void m17604f(c cVar) {
        Observable.create(new ObservableOnSubscribe() { // from class: f1.c
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4212d.m17602g(observableEmitter);
            }
        }).compose(AbstractC7029f.m27122c()).subscribe(new d(cVar));
    }

    private C4212d() {
        this.f18473b = C4212d.class.getSimpleName();
    }
}
