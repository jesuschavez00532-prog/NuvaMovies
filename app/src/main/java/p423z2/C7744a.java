package p423z2;

import com.dcs.bean.N1Data;
import com.dcs.bean.NetWorkUnavailableException;
import com.dcs.bean.V1Bean;
import com.dcs.bean.V1Data;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.Observable;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Dispatcher;
import okhttp3.Dns;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;
import p004a3.InterfaceC0016a;
import p035c3.AbstractC1346a;
import p035c3.AbstractC1348c;
import p035c3.C1353h;
import p035c3.C1356k;
import p213kf.C5260h;
import p227lf.C5555a;
import p363v2.C7197a;
import p376w2.AbstractC7354a;
import p408y2.C7661a;
import retrofit2.Retrofit;

/* renamed from: z2.a */
/* loaded from: classes.dex */
public class C7744a {

    /* renamed from: a */
    private InterfaceC0016a f28502a;

    /* renamed from: b */
    private InterfaceC0016a f28503b;

    /* renamed from: c */
    private Gson f28504c;

    /* renamed from: d */
    private int f28505d;

    /* renamed from: z2.a$a */
    /* loaded from: classes.dex */
    class a extends AbstractC7354a {

        /* renamed from: b */
        final /* synthetic */ String f28506b;

        /* renamed from: c */
        final /* synthetic */ String f28507c;

        /* renamed from: d */
        final /* synthetic */ String f28508d;

        /* renamed from: e */
        final /* synthetic */ RequestBody f28509e;

        a(String str, String str2, String str3, RequestBody requestBody) {
            this.f28506b = str;
            this.f28507c = str2;
            this.f28508d = str3;
            this.f28509e = requestBody;
        }

        @Override // p376w2.AbstractC7354a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Observable mo4897a(Throwable th) {
            if (th instanceof NetWorkUnavailableException) {
                return Observable.never();
            }
            if (C7744a.this.f28503b != null) {
                if (!"304,500,404,400,506,401".contains(m28384b() + "")) {
                    return C7744a.this.f28503b.m137b(this.f28506b, this.f28507c, this.f28508d, this.f28509e);
                }
            }
            return Observable.error(th);
        }
    }

    /* renamed from: z2.a$b */
    /* loaded from: classes.dex */
    class b extends AbstractC7354a {

        /* renamed from: b */
        final /* synthetic */ String f28511b;

        /* renamed from: c */
        final /* synthetic */ String f28512c;

        /* renamed from: d */
        final /* synthetic */ String f28513d;

        /* renamed from: e */
        final /* synthetic */ RequestBody f28514e;

        b(String str, String str2, String str3, RequestBody requestBody) {
            this.f28511b = str;
            this.f28512c = str2;
            this.f28513d = str3;
            this.f28514e = requestBody;
        }

        @Override // p376w2.AbstractC7354a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Observable mo4897a(Throwable th) {
            if (th instanceof NetWorkUnavailableException) {
                return Observable.never();
            }
            if (C7744a.this.f28503b != null) {
                if (!"304,500,404,400,506,401".contains(m28384b() + "")) {
                    return C7744a.this.f28503b.m136a(this.f28511b, this.f28512c, this.f28513d, this.f28514e);
                }
            }
            return Observable.error(th);
        }
    }

    public C7744a() {
        this.f28505d = 15;
        this.f28504c = new GsonBuilder().disableHtmlEscaping().create();
    }

    /* renamed from: b */
    private InterfaceC0016a m29940b(String str) {
        new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.proxy(Proxy.NO_PROXY);
        X509TrustManager m6117a = AbstractC1348c.m6117a();
        if (m6117a != null) {
            builder.sslSocketFactory(new C1353h(m6117a), m6117a);
        }
        OkHttpClient.Builder retryOnConnectionFailure = builder.retryOnConnectionFailure(true);
        long j10 = this.f28505d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        retryOnConnectionFailure.connectTimeout(j10, timeUnit).readTimeout(this.f28505d, timeUnit).writeTimeout(this.f28505d, timeUnit).dispatcher(new Dispatcher(C1356k.f5086a.m6131d())).addInterceptor(new C7661a());
        Dns m27851h = C7197a.f26917a.m27851h();
        if (m27851h != null) {
            builder.dns(m27851h);
        }
        return (InterfaceC0016a) new Retrofit.Builder().m25781g(builder.build()).m25777c(str).m25775a(C5260h.m21166e()).m25776b(C5555a.m22516f()).m25779e().m25767b(InterfaceC0016a.class);
    }

    /* renamed from: c */
    public Observable m29941c(N1Data n1Data) {
        RequestBody create = RequestBody.create(MediaType.parse("application/json"), this.f28504c.toJson(new V1Bean(AbstractC1346a.m6114c(this.f28504c.toJson(n1Data)), 0)));
        C1356k c1356k = C1356k.f5086a;
        String m6132e = c1356k.m6132e(c1356k.m6129b());
        String m6132e2 = c1356k.m6132e(c1356k.m6130c());
        String m27852i = C7197a.f26917a.m27852i();
        return this.f28502a.m136a(m6132e, m6132e2, m27852i, create).onErrorResumeNext(new b(m6132e, m6132e2, m27852i, create));
    }

    /* renamed from: d */
    public Observable m29942d(V1Data v1Data) {
        RequestBody create = RequestBody.create(MediaType.parse("application/json"), this.f28504c.toJson(new V1Bean(AbstractC1346a.m6114c(this.f28504c.toJson(v1Data)), 0)));
        C1356k c1356k = C1356k.f5086a;
        String m6132e = c1356k.m6132e(c1356k.m6129b());
        String m6132e2 = c1356k.m6132e(c1356k.m6130c());
        String m27849f = C7197a.f26917a.m27849f();
        return this.f28502a.m137b(m6132e, m6132e2, m27849f, create).onErrorResumeNext(new a(m6132e, m6132e2, m27849f, create));
    }

    public C7744a(String str, String str2) {
        this();
        this.f28502a = m29940b(str);
        this.f28503b = m29940b(str2);
    }
}
