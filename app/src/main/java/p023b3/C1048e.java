package p023b3;

import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.dcs.bean.DomainInfo;
import com.dcs.bean.N1Data;
import com.dcs.bean.V1Data;
import com.dcs.bean.V1Result;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p035c3.C1356k;
import p359ue.AbstractC7167u;
import p363v2.C7197a;
import p376w2.AbstractC7354a;
import p423z2.C7744a;
import retrofit2.HttpException;

/* renamed from: b3.e */
/* loaded from: classes.dex */
public final class C1048e {

    /* renamed from: d */
    public static final b f4305d = new b(null);

    /* renamed from: e */
    private static final InterfaceC1312h f4306e;

    /* renamed from: a */
    private final String f4307a = C1048e.class.getSimpleName();

    /* renamed from: b */
    private final InterfaceC1312h f4308b;

    /* renamed from: c */
    private final InterfaceC1312h f4309c;

    /* renamed from: b3.e$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f4310a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1048e invoke() {
            return new C1048e();
        }
    }

    /* renamed from: b3.e$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: b */
        private final C1048e m4891b() {
            return (C1048e) C1048e.f4306e.getValue();
        }

        /* renamed from: a */
        public final C1048e m4892a() {
            return m4891b();
        }
    }

    /* renamed from: b3.e$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f4311a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DomainInfo invoke() {
            return C7197a.f26917a.m27846c();
        }
    }

    /* renamed from: b3.e$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7744a invoke() {
            return new C7744a("https://" + C1048e.this.m4882g().getFirst(), "https://" + C1048e.this.m4882g().getSecond());
        }
    }

    /* renamed from: b3.e$e */
    /* loaded from: classes.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f4313a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m4895a(V1Result v1Result) {
            C7197a c7197a = C7197a.f26917a;
            AbstractC5868k.m23673e(v1Result, "it");
            c7197a.m27861u(v1Result);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m4895a((V1Result) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: b3.e$f */
    /* loaded from: classes.dex */
    static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f4314a = new f();

        f() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo542f(V1Result v1Result) {
            AbstractC5868k.m23674f(v1Result, "it");
            String m27853j = C7197a.f26917a.m27853j();
            if (m27853j == null) {
                return "";
            }
            return m27853j;
        }
    }

    /* renamed from: b3.e$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC7354a {
        g() {
        }

        @Override // p376w2.AbstractC7354a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Observable mo4897a(Throwable th) {
            boolean m27763v;
            Observable error;
            AbstractC5868k.m23674f(th, "it");
            if (th instanceof HttpException) {
                HttpException httpException = (HttpException) th;
                m27763v = AbstractC7167u.m27763v("304,500,404,400,506,401", String.valueOf(httpException.m25696a()), false, 2, null);
                if (m27763v) {
                    if (httpException.m25696a() == 304) {
                        String m27853j = C7197a.f26917a.m27853j();
                        if (m27853j == null) {
                            m27853j = "";
                        }
                        error = Observable.just(m27853j);
                    } else {
                        error = Observable.error(th);
                    }
                    AbstractC5868k.m23673e(error, "{\n                    if…      }\n                }");
                    return error;
                }
            }
            C7197a.f26917a.m27862v(C1048e.this.m4882g().getFirst(), C1048e.this.m4882g().getSecond(), C1048e.this.m4882g().getDomainType());
            Observable error2 = Observable.error(th);
            AbstractC5868k.m23673e(error2, "{\n                    Do…ror(it)\n                }");
            return error2;
        }
    }

    /* renamed from: b3.e$h */
    /* loaded from: classes.dex */
    static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f4316a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m4899a(V1Result v1Result) {
            C7197a c7197a = C7197a.f26917a;
            AbstractC5868k.m23673e(v1Result, "it");
            c7197a.m27863w(v1Result);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m4899a((V1Result) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: b3.e$i */
    /* loaded from: classes.dex */
    static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final i f4317a = new i();

        i() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo542f(V1Result v1Result) {
            AbstractC5868k.m23674f(v1Result, "it");
            String m27855l = C7197a.f26917a.m27855l();
            if (m27855l == null) {
                return "";
            }
            return m27855l;
        }
    }

    /* renamed from: b3.e$j */
    /* loaded from: classes.dex */
    public static final class j extends AbstractC7354a {
        j() {
        }

        @Override // p376w2.AbstractC7354a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Observable mo4897a(Throwable th) {
            boolean m27763v;
            Observable error;
            AbstractC5868k.m23674f(th, "it");
            if (th instanceof HttpException) {
                HttpException httpException = (HttpException) th;
                m27763v = AbstractC7167u.m27763v("304,500,404,400,506,401", String.valueOf(httpException.m25696a()), false, 2, null);
                if (m27763v) {
                    if (httpException.m25696a() == 304) {
                        String m27855l = C7197a.f26917a.m27855l();
                        if (m27855l == null) {
                            m27855l = "";
                        }
                        error = Observable.just(m27855l);
                    } else {
                        error = Observable.error(th);
                    }
                    AbstractC5868k.m23673e(error, "{\n                    if…      }\n                }");
                    return error;
                }
            }
            C7197a.f26917a.m27862v(C1048e.this.m4882g().getFirst(), C1048e.this.m4882g().getSecond(), C1048e.this.m4882g().getDomainType());
            Observable error2 = Observable.error(th);
            AbstractC5868k.m23673e(error2, "{\n                    Do…ror(it)\n                }");
            return error2;
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f4310a);
        f4306e = m5965b;
    }

    public C1048e() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        m5965b = AbstractC1314j.m5965b(c.f4311a);
        this.f4308b = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new d());
        this.f4309c = m5965b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final DomainInfo m4882g() {
        return (DomainInfo) this.f4308b.getValue();
    }

    /* renamed from: h */
    private final C7744a m4883h() {
        return (C7744a) this.f4309c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m4884j(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final String m4885k(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (String) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m4886m(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final String m4887n(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (String) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: i */
    public final Observable m4888i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC5868k.m23674f(str, "sn");
        AbstractC5868k.m23674f(str3, "authVersion");
        AbstractC5868k.m23674f(str4, "appId");
        AbstractC5868k.m23674f(str6, "reserve1");
        Observable m29941c = m4883h().m29941c(new N1Data(str, str2, str3, str4, String.valueOf(C1356k.f5086a.m6128a()), str5, "", str6, str7, str8));
        final e eVar = e.f4313a;
        Observable doOnNext = m29941c.doOnNext(new Consumer() { // from class: b3.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1048e.m4884j(InterfaceC5660l.this, obj);
            }
        });
        final f fVar = f.f4314a;
        Observable observeOn = doOnNext.map(new Function() { // from class: b3.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m4885k = null;
                m4885k = C1048e.m4885k(InterfaceC5660l.this, obj);
                return m4885k;
            }
        }).onErrorResumeNext(new g()).observeOn(AndroidSchedulers.mainThread());
        AbstractC5868k.m23673e(observeOn, "fun n1(sn: String, pre_c…lers.mainThread())\n\n    }");
        return observeOn;
    }

    /* renamed from: l */
    public final Observable m4889l(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, String str9, String str10) {
        AbstractC5868k.m23674f(str, "sn");
        AbstractC5868k.m23674f(str2, "authCode");
        AbstractC5868k.m23674f(str3, "authVersion");
        AbstractC5868k.m23674f(str6, "appId");
        AbstractC5868k.m23674f(str7, "spkgVer");
        AbstractC5868k.m23674f(str8, "reserve1");
        Observable m29942d = m4883h().m29942d(new V1Data("all", str, str2, str3, str4, str5, str6, String.valueOf(C1356k.f5086a.m6128a()), str7, str8, i10, str9, str10));
        final h hVar = h.f4316a;
        Observable doOnNext = m29942d.doOnNext(new Consumer() { // from class: b3.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1048e.m4886m(InterfaceC5660l.this, obj);
            }
        });
        final i iVar = i.f4317a;
        Observable observeOn = doOnNext.map(new Function() { // from class: b3.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m4887n = null;
                m4887n = C1048e.m4887n(InterfaceC5660l.this, obj);
                return m4887n;
            }
        }).onErrorResumeNext(new j()).observeOn(AndroidSchedulers.mainThread());
        AbstractC5868k.m23673e(observeOn, "fun v1(sn: String, authC…lers.mainThread())\n\n    }");
        return observeOn;
    }
}
