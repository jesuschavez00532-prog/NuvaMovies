package p400xa;

import android.app.Activity;
import android.content.Context;
import be.AbstractC1314j;
import be.C1328x;
import be.EnumC1316l;
import be.InterfaceC1312h;
import ga.C4417e;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p102db.DialogC4020a;
import p170i2.C4842a;
import p170i2.InterfaceC4844c;
import p201k2.AbstractC5085b;
import p287pb.AbstractApplicationC6253c;
import p348u2.AbstractC7028e;

/* renamed from: xa.h */
/* loaded from: classes2.dex */
public final class C7572h {

    /* renamed from: j */
    public static final b f27809j = new b(null);

    /* renamed from: k */
    private static final InterfaceC1312h f27810k;

    /* renamed from: a */
    private final String f27811a;

    /* renamed from: b */
    private final long f27812b;

    /* renamed from: c */
    private DialogC4020a f27813c;

    /* renamed from: d */
    private boolean f27814d;

    /* renamed from: e */
    private Activity f27815e;

    /* renamed from: f */
    private final long f27816f;

    /* renamed from: g */
    private Disposable f27817g;

    /* renamed from: h */
    private Disposable f27818h;

    /* renamed from: i */
    private long f27819i;

    /* renamed from: xa.h$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f27820a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7572h invoke() {
            return new C7572h(null);
        }
    }

    /* renamed from: xa.h$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C7572h m29056a() {
            return (C7572h) C7572h.f27810k.getValue();
        }
    }

    /* renamed from: xa.h$c */
    /* loaded from: classes2.dex */
    public static final class c implements DialogC4020a.a {
        c() {
        }

        @Override // p102db.DialogC4020a.a
        /* renamed from: a */
        public void mo17015a() {
            Disposable disposable;
            boolean z10 = false;
            C7572h.this.f27814d = false;
            Disposable disposable2 = C7572h.this.f27818h;
            if (disposable2 != null && !disposable2.isDisposed()) {
                z10 = true;
            }
            if (z10 && (disposable = C7572h.this.f27818h) != null) {
                disposable.dispose();
            }
            C7572h.this.f27818h = null;
            DialogC4020a dialogC4020a = C7572h.this.f27813c;
            if (dialogC4020a != null) {
                dialogC4020a.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.h$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {
        d() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long mo542f(Long l10) {
            AbstractC5868k.m23674f(l10, "aLong");
            return Long.valueOf(C7572h.this.f27816f - l10.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.h$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m29058a(Disposable disposable) {
            C7572h.this.f27818h = disposable;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29058a((Disposable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: xa.h$f */
    /* loaded from: classes2.dex */
    public static final class f implements Observer {
        f() {
        }

        /* renamed from: a */
        public void m29059a(long j10) {
            DialogC4020a dialogC4020a;
            C7572h.this.f27819i = j10;
            DialogC4020a dialogC4020a2 = C7572h.this.f27813c;
            boolean z10 = false;
            if (dialogC4020a2 != null && dialogC4020a2.isShowing()) {
                z10 = true;
            }
            if (z10 && (dialogC4020a = C7572h.this.f27813c) != null) {
                dialogC4020a.m17013a(String.valueOf(C7572h.this.f27819i));
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (C7572h.this.f27814d) {
                try {
                    DialogC4020a dialogC4020a = C7572h.this.f27813c;
                    if (dialogC4020a != null) {
                        dialogC4020a.dismiss();
                    }
                } catch (IllegalArgumentException e10) {
                    e10.printStackTrace();
                }
                C7572h.this.m29054w();
                AbstractC7028e.m27115a("at");
                C4417e c4417e = C4417e.f19115a;
                AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
                Context m24887a = aVar.m24887a();
                String m20598h = AbstractC5085b.m20598h(aVar.m24887a());
                AbstractC5868k.m23673e(m20598h, "getPackageName(\n        …         BaseApp.context)");
                C4417e.m18497f(c4417e, m24887a, m20598h, false, false, 12, null);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            th.printStackTrace();
        }

        @Override // io.reactivex.Observer
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            m29059a(((Number) obj).longValue());
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.h$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m29060a(Long l10) {
            boolean z10 = false;
            Activity activity = C7572h.this.f27815e;
            boolean z11 = true;
            if (activity != null && activity.isFinishing()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                InterfaceC4844c m19921b = C4842a.f20329a.m19921b();
                if (m19921b == null || !m19921b.mo19981d()) {
                    z11 = false;
                }
                if (!z11) {
                    C7572h.this.m29047p();
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29060a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xa.h$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f27826a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m29061a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m29061a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    static {
        InterfaceC1312h m5964a;
        m5964a = AbstractC1314j.m5964a(EnumC1316l.SYNCHRONIZED, a.f27820a);
        f27810k = m5964a;
    }

    public /* synthetic */ C7572h(AbstractC5864g abstractC5864g) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m29047p() {
        DialogC4020a dialogC4020a = this.f27813c;
        if (dialogC4020a == null && this.f27815e != null) {
            Activity activity = this.f27815e;
            AbstractC5868k.m23671c(activity);
            this.f27813c = new DialogC4020a(activity);
        } else {
            boolean z10 = false;
            if (dialogC4020a != null && dialogC4020a.isShowing()) {
                z10 = true;
            }
            if (z10) {
                return;
            }
        }
        this.f27814d = true;
        DialogC4020a dialogC4020a2 = this.f27813c;
        if (dialogC4020a2 != null) {
            dialogC4020a2.m17014b(new c());
        }
        DialogC4020a dialogC4020a3 = this.f27813c;
        if (dialogC4020a3 != null) {
            dialogC4020a3.show();
        }
        m29048q();
    }

    /* renamed from: q */
    private final void m29048q() {
        Observable<Long> subscribeOn = Observable.interval(0L, 1L, TimeUnit.SECONDS).take(this.f27816f).subscribeOn(Schedulers.computation());
        final d dVar = new d();
        Observable observeOn = subscribeOn.map(new Function() { // from class: xa.f
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Long m29049r;
                m29049r = C7572h.m29049r(InterfaceC5660l.this, obj);
                return m29049r;
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final e eVar = new e();
        observeOn.doOnSubscribe(new Consumer() { // from class: xa.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7572h.m29050s(InterfaceC5660l.this, obj);
            }
        }).subscribe(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final Long m29049r(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Long) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m29050s(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m29051u(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m29052v(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r3 != false) goto L10;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29053t(android.app.Activity r7) {
        /*
            r6 = this;
            java.lang.String r0 = "activity"
            ne.AbstractC5868k.m23674f(r7, r0)
            w9.a r0 = p383w9.C7383a.f27389a
            r1 = 0
            r2 = 1
            p383w9.C7383a.m28494e(r0, r1, r2, r1)
            r6.f27815e = r7
            io.reactivex.disposables.Disposable r7 = r6.f27817g
            if (r7 == 0) goto L1e
            r3 = 0
            if (r7 == 0) goto L1c
            boolean r7 = r7.isDisposed()
            if (r7 != r2) goto L1c
            r3 = 1
        L1c:
            if (r3 == 0) goto L4d
        L1e:
            long r3 = r6.f27812b
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.Observable r7 = io.reactivex.Observable.interval(r3, r3, r7)
            io.reactivex.Scheduler r3 = io.reactivex.schedulers.Schedulers.computation()
            io.reactivex.Observable r7 = r7.subscribeOn(r3)
            io.reactivex.Scheduler r3 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r7 = r7.observeOn(r3)
            xa.h$g r3 = new xa.h$g
            r3.<init>()
            xa.d r4 = new xa.d
            r4.<init>()
            xa.h$h r3 = p400xa.C7572h.h.f27826a
            xa.e r5 = new xa.e
            r5.<init>()
            io.reactivex.disposables.Disposable r7 = r7.subscribe(r4, r5)
            r6.f27817g = r7
        L4d:
            p383w9.C7383a.m28493c(r0, r1, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p400xa.C7572h.m29053t(android.app.Activity):void");
    }

    /* renamed from: w */
    public final void m29054w() {
        boolean z10 = false;
        Disposable disposable;
        Disposable disposable2;
        Disposable disposable3 = this.f27817g;
        boolean z11 = true;
        if (disposable3 != null && !disposable3.isDisposed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (disposable2 = this.f27817g) != null) {
            disposable2.dispose();
        }
        this.f27817g = null;
        Disposable disposable4 = this.f27818h;
        if (disposable4 == null || disposable4.isDisposed()) {
            z11 = false;
        }
        if (z11 && (disposable = this.f27818h) != null) {
            disposable.dispose();
        }
        this.f27818h = null;
    }

    private C7572h() {
        this.f27811a = C7572h.class.getSimpleName();
        this.f27812b = 14400L;
        this.f27814d = true;
        this.f27816f = 60L;
    }
}
