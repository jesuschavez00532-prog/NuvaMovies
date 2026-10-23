package p416ya;

import android.os.SystemClock;
import cc.C1466m0;
import com.request.converterFactory.bean.ResultException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p035c3.AbstractC1349d;
import p359ue.AbstractC7167u;
import p421z0.C7729c;
import retrofit2.HttpException;

/* renamed from: ya.a */
/* loaded from: classes2.dex */
public final class C7691a implements Interceptor {

    /* renamed from: b */
    public static final a f28142b = new a(null);

    /* renamed from: c */
    private static final Set f28143c = new LinkedHashSet();

    /* renamed from: a */
    private final String f28144a;

    /* renamed from: ya.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    public C7691a() {
        String simpleName = C7691a.class.getSimpleName();
        AbstractC5868k.m23673e(simpleName, "javaClass.simpleName");
        this.f28144a = simpleName;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        String str = null;
        String str2 = null;
        int i10 = 0;
        boolean m27763v;
        AbstractC5868k.m23674f(chain, "chain");
        Request request = chain.request();
        URL url = request.url().url();
        String path = url.getPath();
        if (!AbstractC5868k.m23669a(request.header("ReqSource"), "own")) {
            Response proceed = chain.proceed(request);
            AbstractC5868k.m23673e(proceed, "chain.proceed(original)");
            return proceed;
        }
        Request build = request.newBuilder().build();
        String m6118a = AbstractC1349d.m6118a(url.getHost(), AbstractC1349d.f5077a);
        url.getProtocol();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Response proceed2 = chain.proceed(build);
            int code = proceed2.code();
            if (code != 200) {
                String str3 = url.getHost() + code;
                Set set = f28143c;
                if (!set.contains(str3)) {
                    set.add(str3);
                    C7729c c7729c = C7729c.f28423a;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    AbstractC5868k.m23673e(path, "path");
                    AbstractC5868k.m23673e(m6118a, "host");
                    str = m6118a;
                    str2 = path;
                    try {
                        C7729c.m29846e(c7729c, elapsedRealtime, elapsedRealtime2, path, m6118a, code, C1466m0.f5627a.m6876l(), null, true, 64, null);
                        AbstractC5868k.m23673e(proceed2, "mResponse");
                        return proceed2;
                    } catch (Exception e10) {
                        e = e10;
                        if (!(e instanceof ResultException)) {
                            String message = e.getMessage();
                            boolean z10 = false;
                            if (message != null) {
                                m27763v = AbstractC7167u.m27763v(message, "Canceled", false, 2, null);
                                if (m27763v) {
                                    z10 = true;
                                }
                            }
                            if (!z10) {
                                if (e instanceof HttpException) {
                                    i10 = ((HttpException) e).m25696a();
                                } else if (e instanceof TimeoutException) {
                                    i10 = 50010;
                                } else if (e instanceof ConnectException) {
                                    i10 = 50011;
                                } else if (e instanceof SocketTimeoutException) {
                                    i10 = 50012;
                                } else if (e instanceof SSLException) {
                                    i10 = 50013;
                                } else if (e instanceof UnknownHostException) {
                                    i10 = 50014;
                                } else {
                                    i10 = 50015;
                                }
                                String str4 = url.getHost() + i10;
                                Set set2 = f28143c;
                                if (!set2.contains(str4)) {
                                    set2.add(str4);
                                    C7729c c7729c2 = C7729c.f28423a;
                                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                                    AbstractC5868k.m23673e(str2, "path");
                                    String str5 = str;
                                    AbstractC5868k.m23673e(str5, "host");
                                    C7729c.m29846e(c7729c2, elapsedRealtime, elapsedRealtime3, str2, str5, i10, C1466m0.f5627a.m6876l(), null, true, 64, null);
                                }
                            }
                        }
                        throw e;
                    }
                }
            }
            str = m6118a;
            str2 = path;
            AbstractC5868k.m23673e(proceed2, "mResponse");
            return proceed2;
        } catch (Exception e11) {
            e = e11;
            str = m6118a;
            str2 = path;
        }
    }
}
