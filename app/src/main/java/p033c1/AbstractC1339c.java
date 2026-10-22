package p033c1;

import android.util.Log;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: c1.c */
/* loaded from: classes.dex */
public abstract class AbstractC1339c {

    /* renamed from: a */
    private static String f5064a = "CertificatesUtil";

    /* renamed from: c1.c$a */
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
    public static X509TrustManager m6105a() {
        try {
            a aVar = new a();
            Log.d(f5064a, "信任证书");
            return aVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
