package org.xutils.http.app;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.xutils.common.util.KeyValue;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

/* loaded from: classes3.dex */
public class DefaultParamsBuilder implements ParamsBuilder {
    private static SSLSocketFactory trustAllSSlSocketFactory;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.xutils.http.app.DefaultParamsBuilder$a */
    /* loaded from: classes3.dex */
    public static class C6101a implements X509TrustManager {
        C6101a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            LogUtil.m24373d("checkClientTrusted:" + str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            LogUtil.m24373d("checkServerTrusted:" + str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static SSLSocketFactory getTrustAllSSLSocketFactory() {
        if (trustAllSSlSocketFactory == null) {
            synchronized (DefaultParamsBuilder.class) {
                if (trustAllSSlSocketFactory == null) {
                    TrustManager[] trustManagerArr = {new C6101a()};
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, trustManagerArr, null);
                        trustAllSSlSocketFactory = sSLContext.getSocketFactory();
                    } catch (Throwable th) {
                        LogUtil.m24376e(th.getMessage(), th);
                    }
                }
            }
        }
        return trustAllSSlSocketFactory;
    }

    @Override // org.xutils.http.app.ParamsBuilder
    public String buildCacheKey(RequestParams requestParams, String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        if (strArr != null && strArr.length > 0) {
            sb2.append(requestParams.getUri());
            sb2.append(Operator.Operation.EMPTY_PARAM);
            for (String str : strArr) {
                List<KeyValue> params = requestParams.getParams(str);
                if (params != null && !params.isEmpty()) {
                    Iterator<KeyValue> it = params.iterator();
                    while (it.hasNext()) {
                        String valueStrOrNull = it.next().getValueStrOrNull();
                        if (valueStrOrNull != null) {
                            sb2.append(str);
                            sb2.append(Operator.Operation.EQUALS);
                            sb2.append(valueStrOrNull);
                            sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
                        }
                    }
                }
            }
        }
        return sb2.toString();
    }

    @Override // org.xutils.http.app.ParamsBuilder
    public void buildParams(RequestParams requestParams) {
    }

    @Override // org.xutils.http.app.ParamsBuilder
    public void buildSign(RequestParams requestParams, String[] strArr) {
    }

    @Override // org.xutils.http.app.ParamsBuilder
    public String buildUri(RequestParams requestParams, HttpRequest httpRequest) {
        return httpRequest.host() + Operator.Operation.DIVISION + httpRequest.path();
    }

    @Override // org.xutils.http.app.ParamsBuilder
    public SSLSocketFactory getSSLSocketFactory() {
        return getTrustAllSSLSocketFactory();
    }
}
