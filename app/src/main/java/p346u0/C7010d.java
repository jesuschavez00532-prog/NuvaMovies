package p346u0;

import anet.channel.util.HttpConstant;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.advertlib.bean.AdReportRequest;
import com.advertlib.bean.AdvertBean;
import com.advertlib.bean.AdvertResult;
import com.advertlib.bean.ReportResult;
import com.dcs.bean.DomainInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.taobao.accs.utl.BaseMonitor;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p179ib.AbstractC4926c;
import p213kf.C5260h;
import p227lf.C5555a;
import p279p2.AbstractC6187a;
import p361v0.AbstractC7188a;
import p361v0.C7192e;
import p363v2.C7197a;
import retrofit2.Call;
import retrofit2.Retrofit;

/* renamed from: u0.d */
/* loaded from: classes.dex */
public final class C7010d {

    /* renamed from: g */
    public static final b f26372g = new b(null);

    /* renamed from: h */
    private static final String f26373h = HttpConstant.HTTP;

    /* renamed from: i */
    private static final InterfaceC1312h f26374i;

    /* renamed from: a */
    private Dns f26375a;

    /* renamed from: b */
    private Interceptor f26376b;

    /* renamed from: c */
    private final String f26377c;

    /* renamed from: d */
    private final InterfaceC1312h f26378d;

    /* renamed from: e */
    private final Gson f26379e;

    /* renamed from: f */
    private long f26380f;

    /* renamed from: u0.d$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f26381a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DomainInfo invoke() {
            return C7197a.f26917a.m27845b(AbstractC4926c.m20234a().first.toString(), AbstractC4926c.m20234a().second.toString(), "key_ads");
        }
    }

    /* renamed from: u0.d$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final String m27068a() {
            return C7010d.f26373h;
        }

        /* renamed from: b */
        public final DomainInfo m27069b() {
            return (DomainInfo) C7010d.f26374i.getValue();
        }
    }

    /* renamed from: u0.d$c */
    /* loaded from: classes.dex */
    public static final class c implements Function {

        /* renamed from: b */
        final /* synthetic */ RequestBody f26383b;

        c(RequestBody requestBody) {
            this.f26383b = requestBody;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable apply(Throwable th) {
            AbstractC5868k.m23674f(th, "t");
            InterfaceC7007a m27060i = C7010d.this.m27060i();
            b bVar = C7010d.f26372g;
            return m27060i.m27051b(bVar.m27068a(), bVar.m27069b().getSecond(), this.f26383b);
        }
    }

    /* renamed from: u0.d$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f26384a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m27071a(Throwable th) {
            C7197a.f26917a.m27860t(C7010d.f26372g.m27069b(), "key_ads");
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27071a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: u0.d$e */
    /* loaded from: classes.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {
        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7007a invoke() {
            return (InterfaceC7007a) C7010d.this.m27061j().m25767b(InterfaceC7007a.class);
        }
    }

    /* renamed from: u0.d$f */
    /* loaded from: classes.dex */
    public static final class f implements Function {

        /* renamed from: b */
        final /* synthetic */ RequestBody f26387b;

        f(RequestBody requestBody) {
            this.f26387b = requestBody;
        }

        @Override // io.reactivex.functions.Function
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable apply(Throwable th) {
            AbstractC5868k.m23674f(th, "t");
            InterfaceC7007a m27060i = C7010d.this.m27060i();
            b bVar = C7010d.f26372g;
            return m27060i.m27050a(bVar.m27068a(), bVar.m27069b().getSecond(), this.f26387b);
        }
    }

    /* renamed from: u0.d$g */
    /* loaded from: classes.dex */
    static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final g f26388a = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m27074a(Throwable th) {
            C7197a.f26917a.m27860t(C7010d.f26372g.m27069b(), "key_ads");
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m27074a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f26381a);
        f26374i = m5965b;
    }

    public C7010d(Dns dns, Interceptor interceptor) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(dns, BaseMonitor.COUNT_POINT_DNS);
        this.f26375a = dns;
        this.f26376b = interceptor;
        this.f26377c = C7010d.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(new e());
        this.f26378d = m5965b;
        this.f26380f = 15L;
        Gson create = new GsonBuilder().disableHtmlEscaping().create();
        AbstractC5868k.m23673e(create, "GsonBuilder().disableHtmlEscaping().create()");
        this.f26379e = create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m27059h(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final InterfaceC7007a m27060i() {
        Object value = this.f26378d.getValue();
        AbstractC5868k.m23673e(value, "<get-mAdApi>(...)");
        return (InterfaceC7007a) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final Retrofit m27061j() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j10 = this.f26380f;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder dns = builder.connectTimeout(j10, timeUnit).readTimeout(this.f26380f, timeUnit).writeTimeout(this.f26380f, timeUnit).connectionPool(AbstractC6187a.m24711a()).dns(this.f26375a);
        Interceptor interceptor = this.f26376b;
        if (interceptor != null) {
            dns.addInterceptor(interceptor);
        }
        X509TrustManager m27819a = AbstractC7188a.m27819a();
        if (m27819a != null) {
            dns.sslSocketFactory(new C7192e(m27819a), m27819a);
        }
        OkHttpClient build = dns.build();
        AbstractC5868k.m23673e(build, "builder.build()");
        Retrofit m25779e = new Retrofit.Builder().m25777c("http://www.baidu.com").m25781g(build).m25775a(C5260h.m21165d()).m25776b(C5555a.m22516f()).m25779e();
        AbstractC5868k.m23673e(m25779e, "Builder()\n              …\n                .build()");
        return m25779e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m27062l(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: n */
    private final RequestBody m27063n(String str) {
        RequestBody create = RequestBody.create(MediaType.parse("application/json"), str);
        AbstractC5868k.m23673e(create, "create(MediaType.parse(\"application/json\"), str)");
        return create;
    }

    /* renamed from: g */
    public final Observable m27064g(AdvertBean advertBean) {
        AbstractC5868k.m23674f(advertBean, "bean");
        String json = this.f26379e.toJson(advertBean);
        AbstractC5868k.m23673e(json, "mGson.toJson(bean)");
        RequestBody m27063n = m27063n(json);
        Observable<AdvertResult> onErrorResumeNext = m27060i().m27051b(f26373h, f26372g.m27069b().getFirst(), m27063n).onErrorResumeNext(new c(m27063n));
        final d dVar = d.f26384a;
        Observable<AdvertResult> doOnError = onErrorResumeNext.doOnError(new Consumer() { // from class: u0.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7010d.m27059h(InterfaceC5660l.this, obj);
            }
        });
        AbstractC5868k.m23673e(doOnError, "fun getAd(bean: AdvertBe…\n                }\n\n    }");
        return doOnError;
    }

    /* renamed from: k */
    public final Observable m27065k(AdReportRequest adReportRequest) {
        AbstractC5868k.m23674f(adReportRequest, "bean");
        String json = this.f26379e.toJson(adReportRequest);
        AbstractC5868k.m23673e(json, "mGson.toJson(bean)");
        RequestBody m27063n = m27063n(json);
        Observable<ReportResult> onErrorResumeNext = m27060i().m27050a(f26373h, f26372g.m27069b().getFirst(), m27063n).onErrorResumeNext(new f(m27063n));
        final g gVar = g.f26388a;
        Observable<ReportResult> doOnError = onErrorResumeNext.doOnError(new Consumer() { // from class: u0.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7010d.m27062l(InterfaceC5660l.this, obj);
            }
        });
        AbstractC5868k.m23673e(doOnError, "fun reportAd(bean: AdRep…)\n                }\n    }");
        return doOnError;
    }

    /* renamed from: m */
    public final Call m27066m(String str) {
        AbstractC5868k.m23674f(str, "videoUrl");
        return m27060i().m27052c(str);
    }
}
