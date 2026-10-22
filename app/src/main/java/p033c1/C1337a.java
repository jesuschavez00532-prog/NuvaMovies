package p033c1;

import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.model.HttpHeaders;
import com.taobao.accs.utl.BaseMonitor;
import com.umeng.analytics.pro.C3330by;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import ne.AbstractC5868k;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p092d1.C3921a;
import p123f1.C4209a;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public final class C1337a implements InterfaceRunnableC1340d {

    /* renamed from: b */
    private String f5053b;

    /* renamed from: c */
    private String f5054c;

    /* renamed from: e */
    private InterfaceC1338b f5056e;

    /* renamed from: k */
    private Dns f5062k;

    /* renamed from: l */
    private Interceptor f5063l;

    /* renamed from: a */
    private String f5052a = C1337a.class.getSimpleName();

    /* renamed from: d */
    private String f5055d = EnumC1341e.GET.m6107b();

    /* renamed from: f */
    private HashMap f5057f = new HashMap();

    /* renamed from: g */
    private HashMap f5058g = new HashMap();

    /* renamed from: h */
    private String f5059h = "";

    /* renamed from: i */
    private int f5060i = C3330by.f14355b;

    /* renamed from: j */
    private int f5061j = C3330by.f14355b;

    public C1337a() {
        Dns dns = Dns.SYSTEM;
        AbstractC5868k.m23673e(dns, "SYSTEM");
        this.f5062k = dns;
    }

    /* renamed from: c */
    private final C3921a m6096c(boolean z10) {
        boolean z11;
        Response execute;
        long parseLong;
        C3921a c3921a = new C3921a();
        String m6097d = m6097d(z10);
        boolean z12 = false;
        if (m6097d != null && m6097d.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            Response response = null;
            String str = null;
            try {
                try {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    builder.proxy(Proxy.NO_PROXY);
                    X509TrustManager m6105a = AbstractC1339c.m6105a();
                    AbstractC5868k.m23673e(m6105a, "getTrustAllCert()");
                    builder.sslSocketFactory(new C1342f(m6105a), m6105a);
                    Interceptor interceptor = this.f5063l;
                    if (interceptor != null) {
                        builder.addInterceptor(interceptor);
                    }
                    long j10 = this.f5061j;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    OkHttpClient build = builder.readTimeout(j10, timeUnit).connectTimeout(this.f5060i, timeUnit).dns(this.f5062k).build();
                    Request.Builder addHeader = new Request.Builder().url(m6097d).addHeader(HttpHeaders.HEAD_KEY_USER_AGENT, "BigBee/3.7.0");
                    for (Map.Entry entry : this.f5057f.entrySet()) {
                        addHeader.addHeader((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (AbstractC5868k.m23669a(this.f5055d, EnumC1341e.POST.m6107b())) {
                        RequestBody create = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), this.f5059h);
                        AbstractC5868k.m23673e(create, "create(MediaType.parse(\"…et=utf-8\"), mRequestJson)");
                        addHeader.post(create);
                    }
                    execute = build.newCall(addHeader.build()).execute();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e10) {
                e = e10;
            }
            try {
                c3921a.m16759g(execute.code());
                if (execute.code() == 200) {
                    ResponseBody body = execute.body();
                    if (body != null) {
                        str = body.string();
                    }
                    c3921a.m16758f(str);
                    String str2 = execute.headers().get("reportClock");
                    if (str2 == null || str2.length() == 0) {
                        z12 = true;
                    }
                    if (z12) {
                        parseLong = C4209a.f18456a.m17585c();
                    } else {
                        parseLong = Long.parseLong(str2);
                    }
                    c3921a.m16757e(parseLong);
                }
                execute.close();
                return c3921a;
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                throw e;
            } catch (Throwable th2) {
                response = execute;
                th = th2;
                if (response != null) {
                    response.close();
                }
                throw th;
            }
        }
        return c3921a;
    }

    /* renamed from: d */
    private final String m6097d(boolean z10) {
        if (z10) {
            return this.f5053b;
        }
        return this.f5054c;
    }

    /* renamed from: a */
    public final C1337a m6098a(InterfaceC1338b interfaceC1338b) {
        AbstractC5868k.m23674f(interfaceC1338b, "callback");
        this.f5056e = interfaceC1338b;
        return this;
    }

    /* renamed from: b */
    public final C1337a m6099b(Dns dns) {
        AbstractC5868k.m23674f(dns, BaseMonitor.COUNT_POINT_DNS);
        this.f5062k = dns;
        return this;
    }

    /* renamed from: e */
    public final C1337a m6100e(String str, String str2) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        AbstractC5868k.m23674f(str2, "value");
        this.f5057f.put(str, str2);
        return this;
    }

    /* renamed from: f */
    public final C1337a m6101f(Interceptor interceptor) {
        this.f5063l = interceptor;
        return this;
    }

    /* renamed from: g */
    public final C1337a m6102g(String str) {
        AbstractC5868k.m23674f(str, "json");
        this.f5059h = str;
        return this;
    }

    /* renamed from: h */
    public final C1337a m6103h(EnumC1341e enumC1341e) {
        AbstractC5868k.m23674f(enumC1341e, "requestMethod");
        this.f5055d = enumC1341e.m6107b();
        return this;
    }

    /* renamed from: i */
    public final C1337a m6104i(String str, String str2) {
        AbstractC5868k.m23674f(str, "mainUrl");
        AbstractC5868k.m23674f(str2, "reserveUrl");
        this.f5053b = str;
        this.f5054c = str2;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C3921a m6096c = m6096c(true);
            if (m6096c.m16756d()) {
                InterfaceC1338b interfaceC1338b = this.f5056e;
                if (interfaceC1338b != null) {
                    interfaceC1338b.mo13b(this, m6096c);
                    return;
                }
                return;
            }
        } catch (Exception unused) {
        }
        try {
            C3921a m6096c2 = m6096c(false);
            InterfaceC1338b interfaceC1338b2 = this.f5056e;
            if (interfaceC1338b2 != null) {
                interfaceC1338b2.mo13b(this, m6096c2);
            }
        } catch (Exception e10) {
            InterfaceC1338b interfaceC1338b3 = this.f5056e;
            if (interfaceC1338b3 != null) {
                interfaceC1338b3.mo12a(this, e10);
            }
        }
    }
}
