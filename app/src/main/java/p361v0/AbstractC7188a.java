package p361v0;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public abstract class AbstractC7188a {

    /* renamed from: v0.a$a */
    /* loaded from: classes.dex */
    class a implements X509TrustManager {
        a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* renamed from: a */
    public static X509TrustManager m27819a() {
        try {
            return new a();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
