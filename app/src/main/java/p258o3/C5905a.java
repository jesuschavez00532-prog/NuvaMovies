package p258o3;

import android.app.Application;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.cookie.CookieJarImpl;
import com.lzy.okgo.cookie.store.DBCookieStore;
import com.lzy.okgo.https.HttpsUtils;
import com.umeng.analytics.pro.C3384f;
import java.util.concurrent.TimeUnit;
import ne.AbstractC5868k;
import okhttp3.OkHttpClient;
import p142g3.C4343e;
import p279p2.AbstractC6187a;

/* renamed from: o3.a */
/* loaded from: classes.dex */
public final class C5905a {

    /* renamed from: a */
    public static final C5905a f23499a = new C5905a();

    private C5905a() {
    }

    /* renamed from: a */
    public final void m23856a(Application application) {
        AbstractC5868k.m23674f(application, C3384f.f14563X);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.readTimeout(OkGo.DEFAULT_MILLISECONDS, timeUnit);
        builder.writeTimeout(OkGo.DEFAULT_MILLISECONDS, timeUnit);
        builder.connectTimeout(OkGo.DEFAULT_MILLISECONDS, timeUnit);
        builder.connectionPool(AbstractC6187a.m24711a());
        builder.cookieJar(new CookieJarImpl(new DBCookieStore(application)));
        HttpsUtils.SSLParams sslSocketFactory = HttpsUtils.getSslSocketFactory();
        builder.sslSocketFactory(sslSocketFactory.sSLSocketFactory, sslSocketFactory.trustManager);
        OkGo.getInstance().init(application).setOkHttpClient(builder.build()).setCacheMode(CacheMode.NO_CACHE).setCacheTime(-1L).setRetryCount(1);
        C4343e.m18227a().m18232d().m18226b();
    }
}
