package cc;

import android.os.SystemClock;
import com.request.converterFactory.bean.ResultException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import ne.AbstractC5868k;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p035c3.AbstractC1349d;
import p359ue.AbstractC7167u;
import p421z0.C7729c;
import retrofit2.HttpException;

/* renamed from: cc.b */
/* loaded from: classes.dex */
public final class C1443b implements Interceptor {

    /* renamed from: a */
    private final String f5555a;

    public C1443b() {
        String simpleName = C1443b.class.getSimpleName();
        AbstractC5868k.m23673e(simpleName, "javaClass.simpleName");
        this.f5555a = simpleName;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        String str = null;
        String str2 = null;
        int m25696a;
        boolean m27763v;
        AbstractC5868k.m23674f(chain, "chain");
        Request request = chain.request();
        URL url = request.url().url();
        String path = url.getPath();
        Request build = request.newBuilder().build();
        String m6118a = AbstractC1349d.m6118a(url.getHost(), AbstractC1349d.f5077a);
        url.getProtocol();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Response proceed = chain.proceed(build);
            int code = proceed.code();
            if (code != 200) {
                C7729c c7729c = C7729c.f28423a;
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                AbstractC5868k.m23673e(path, "path");
                AbstractC5868k.m23673e(m6118a, "host");
                str = m6118a;
                str2 = path;
                try {
                    C7729c.m29846e(c7729c, elapsedRealtime, elapsedRealtime2, path, m6118a, code, C1466m0.f5627a.m6876l(), null, true, 64, null);
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
                            if (!(e instanceof HttpException)) {
                                if (!(e instanceof TimeoutException)) {
                                    if (!(e instanceof ConnectException)) {
                                        if (!(e instanceof SocketTimeoutException)) {
                                            if (!(e instanceof SSLException)) {
                                                if (e instanceof UnknownHostException) {
                                                    m25696a = 50014;
                                                } else {
                                                    m25696a = 50015;
                                                }
                                            } else {
                                                m25696a = 50013;
                                            }
                                        } else {
                                            m25696a = 50012;
                                        }
                                    } else {
                                        m25696a = 50011;
                                    }
                                } else {
                                    m25696a = 50010;
                                }
                            } else {
                                m25696a = ((HttpException) e).m25696a();
                            }
                            C7729c c7729c2 = C7729c.f28423a;
                            long elapsedRealtime3 = SystemClock.elapsedRealtime();
                            AbstractC5868k.m23673e(str2, "path");
                            String str3 = str;
                            AbstractC5868k.m23673e(str3, "host");
                            C7729c.m29846e(c7729c2, elapsedRealtime, elapsedRealtime3, str2, str3, m25696a, C1466m0.f5627a.m6876l(), null, true, 64, null);
                        }
                    }
                    throw e;
                }
            } else {
                str = m6118a;
                str2 = path;
            }
            AbstractC5868k.m23673e(proceed, "mResponse");
            return proceed;
        } catch (Exception e11) {
            e = e11;
            str = m6118a;
            str2 = path;
        }
    }
}
