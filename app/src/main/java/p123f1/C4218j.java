package p123f1;

import be.AbstractC1314j;
import be.InterfaceC1312h;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p348u2.AbstractC7029f;

/* renamed from: f1.j */
/* loaded from: classes.dex */
public final class C4218j {

    /* renamed from: c */
    public static final b f18486c = new b(null);

    /* renamed from: d */
    private static final InterfaceC1312h f18487d;

    /* renamed from: a */
    private Disposable f18488a;

    /* renamed from: b */
    private final String f18489b;

    /* renamed from: f1.j$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f18490a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4218j invoke() {
            return new C4218j(null);
        }
    }

    /* renamed from: f1.j$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C4218j m17627a() {
            return (C4218j) C4218j.f18487d.getValue();
        }
    }

    /* renamed from: f1.j$c */
    /* loaded from: classes.dex */
    public class c {
        /* renamed from: a */
        void mo17628a();
    }

    /* renamed from: f1.j$d */
    /* loaded from: classes.dex */
    public static final class d implements Observer {

        /* renamed from: b */
        final /* synthetic */ c f18492b;

        d(c cVar) {
            this.f18492b = cVar;
        }

        /* renamed from: a */
        public void m17629a(long j10) {
            c cVar = this.f18492b;
            if (cVar != null) {
                cVar.mo17628a();
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
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            m17629a(((Number) obj).longValue());
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "disposable");
            C4218j.this.f18488a = disposable;
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f18490a);
        f18487d = m5965b;
    }

    public /* synthetic */ C4218j(AbstractC5864g abstractC5864g) {
        this();
    }

    /* renamed from: c */
    public final void m17624c() {
        Disposable disposable;
        Disposable disposable2 = this.f18488a;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f18488a) != null) {
            disposable.dispose();
        }
    }

    /* renamed from: d */
    public final void m17625d(long j10, long j11, c cVar) {
        Observable.interval(j10, j11, TimeUnit.SECONDS).compose(AbstractC7029f.m27122c()).safeSubscribe(new d(cVar));
    }

    private C4218j() {
        this.f18489b = C4218j.class.getSimpleName();
    }
}
