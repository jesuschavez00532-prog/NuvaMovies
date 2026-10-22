package p030bc;

import anet.channel.util.HttpConstant;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.AbstractC1453g;
import cc.AbstractC1459j;
import cc.C1479y;
import com.request.bean.SubTitleResult;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import okhttp3.OkHttpClient;
import p030bc.C1293z1;
import p213kf.C5260h;
import p279p2.AbstractC6187a;
import p317rb.AbstractC6567a;
import p317rb.C6569c;
import p348u2.AbstractC7027d;
import p385wb.C7386a;
import p385wb.C7391f;
import p431zb.C7778a;
import retrofit2.Retrofit;
import sb.InterfaceC6782c;

/* renamed from: bc.c2 */
/* loaded from: classes.dex */
public final class C1215c2 {

    /* renamed from: c */
    public static final b f4783c = new b(null);

    /* renamed from: d */
    private static final InterfaceC1312h f4784d;

    /* renamed from: a */
    private long f4785a;

    /* renamed from: b */
    private final InterfaceC1312h f4786b;

    /* renamed from: bc.c2$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f4787a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1215c2 invoke() {
            return new C1215c2(null);
        }
    }

    /* renamed from: bc.c2$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: b */
        private final C1215c2 m5517b() {
            return (C1215c2) C1215c2.f4784d.getValue();
        }

        /* renamed from: a */
        public final C1215c2 m5518a() {
            return m5517b();
        }
    }

    /* renamed from: bc.c2$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6782c invoke() {
            return (InterfaceC6782c) C1215c2.this.m5513e().m25767b(InterfaceC6782c.class);
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f4787a);
        f4784d = m5965b;
    }

    public /* synthetic */ C1215c2(AbstractC5864g abstractC5864g) {
        this();
    }

    /* renamed from: d */
    private final InterfaceC6782c m5512d() {
        return (InterfaceC6782c) this.f4786b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final Retrofit m5513e() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j10 = this.f4785a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder connectionPool = builder.connectTimeout(j10, timeUnit).readTimeout(this.f4785a, timeUnit).writeTimeout(this.f4785a, timeUnit).connectionPool(AbstractC6187a.m24711a());
        AbstractC5868k.m23673e(connectionPool, "Builder()\n              …izer.getConnectionPool())");
        OkHttpClient.Builder addInterceptor = AbstractC6567a.m25633c(connectionPool, 5).addInterceptor(new C7778a());
        X509TrustManager m6758a = AbstractC1453g.m6758a();
        if (m6758a != null) {
            addInterceptor.sslSocketFactory(new C1479y(m6758a), m6758a);
        }
        OkHttpClient build = addInterceptor.build();
        AbstractC5868k.m23673e(build, "builder.build()");
        Retrofit m25779e = new Retrofit.Builder().m25777c("http://www.baidu.com").m25781g(build).m25775a(C5260h.m21165d()).m25776b(C7386a.m28498f(true, new C7391f())).m25779e();
        AbstractC5868k.m23673e(m25779e, "Builder()\n              …\n                .build()");
        return m25779e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final Observable m5514g(C1215c2 c1215c2, String str) {
        AbstractC5868k.m23674f(c1215c2, "this$0");
        AbstractC5868k.m23674f(str, "it");
        HashMap hashMap = new HashMap();
        hashMap.put("programId", str);
        String m6799d = AbstractC1459j.m6799d(AbstractC7027d.m27114a().toJson(hashMap), "NxZZ7EYgaJiJSBHjnq7sDxYvYRm32tPQ");
        InterfaceC6782c m5512d = c1215c2.m5512d();
        C1293z1.b bVar = C1293z1.f4924d;
        String m5888b = bVar.m5888b();
        AbstractC5868k.m23673e(m6799d, "encryptJson");
        return m5512d.m26765a(HttpConstant.HTTPS, m5888b, m6799d).onErrorResumeNext((Function<? super Throwable, ? extends ObservableSource<? extends SubTitleResult>>) C6569c.f25182a.m25643b(c1215c2.m5512d().m26765a(HttpConstant.HTTPS, bVar.m5889c(), m6799d)));
    }

    /* renamed from: f */
    public final Observable m5515f(String str) {
        AbstractC5868k.m23674f(str, "programId");
        return C1207a2.f4775a.m5508c(str, new Function() { // from class: bc.b2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Observable m5514g;
                m5514g = C1215c2.m5514g(C1215c2.this, (String) obj);
                return m5514g;
            }
        });
    }

    private C1215c2() {
        InterfaceC1312h m5965b;
        this.f4785a = 15L;
        m5965b = AbstractC1314j.m5965b(new c());
        this.f4786b = m5965b;
    }
}
