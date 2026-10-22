package cc;

import android.content.Context;
import android.os.SystemClock;
import com.umeng.analytics.pro.C3384f;
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
import retrofit2.HttpException;

/* renamed from: cc.c */
/* loaded from: classes.dex */
public final class C1445c implements Interceptor {

    /* renamed from: a */
    private final Context f5557a;

    /* renamed from: b */
    private final String f5558b;

    public C1445c(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        this.f5557a = context;
        String simpleName = C1445c.class.getSimpleName();
        AbstractC5868k.m23673e(simpleName, "javaClass.simpleName");
        this.f5558b = simpleName;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        int m25696a;
        boolean m27763v;
        AbstractC5868k.m23674f(chain, "chain");
        Request request = chain.request();
        URL url = request.url().url();
        String path = url.getPath();
        Request build = request.newBuilder().build();
        String m6118a = AbstractC1349d.m6118a(url.getHost(), AbstractC1349d.f5077a);
        url.getProtocol();
        SystemClock.elapsedRealtime();
        try {
            Response proceed = chain.proceed(build);
            int code = proceed.code();
            if (code != 200) {
                C1451f c1451f = C1451f.f5570a;
                Context context = this.f5557a;
                AbstractC5868k.m23673e(path, "path");
                AbstractC5868k.m23673e(m6118a, "host");
                c1451f.m6757b(context, path, m6118a, code, C1466m0.f5627a.m6876l());
            }
            AbstractC5868k.m23673e(proceed, "mResponse");
            return proceed;
        } catch (Exception e10) {
            String message = e10.getMessage();
            boolean z10 = false;
            if (message != null) {
                m27763v = AbstractC7167u.m27763v(message, "Canceled", false, 2, null);
                if (m27763v) {
                    z10 = true;
                }
            }
            if (!z10) {
                if (!(e10 instanceof HttpException)) {
                    if (!(e10 instanceof TimeoutException)) {
                        if (!(e10 instanceof ConnectException)) {
                            if (!(e10 instanceof SocketTimeoutException)) {
                                if (!(e10 instanceof SSLException)) {
                                    if (e10 instanceof UnknownHostException) {
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
                    m25696a = ((HttpException) e10).m25696a();
                }
                C1451f c1451f2 = C1451f.f5570a;
                Context context2 = this.f5557a;
                AbstractC5868k.m23673e(path, "path");
                AbstractC5868k.m23673e(m6118a, "host");
                c1451f2.m6757b(context2, path, m6118a, m25696a, C1466m0.f5627a.m6876l());
            }
            throw e10;
        }
    }
}
