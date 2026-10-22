package com.umeng.p079ut.p080a.p082b;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.umeng.ut.a.b.f */
/* loaded from: classes3.dex */
class C3750f implements X509TrustManager {

    /* renamed from: a */
    private static TrustManager[] f16787a;

    C3750f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized TrustManager[] getTrustManagers() {
        TrustManager[] trustManagerArr;
        synchronized (C3750f.class) {
            if (f16787a == null) {
                f16787a = new TrustManager[]{new C3750f()};
            }
            trustManagerArr = f16787a;
        }
        return trustManagerArr;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr != null && x509CertificateArr.length > 0) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                trustManagerFactory.init((KeyStore) null);
                if (trustManagerFactory.getTrustManagers() != null) {
                    for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                        try {
                            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
                        } catch (CertificateException e10) {
                            for (Throwable th = e10; th != null; th = th.getCause()) {
                                if ((th instanceof CertificateExpiredException) || (th instanceof CertificateNotYetValidException)) {
                                    return;
                                }
                            }
                            throw e10;
                        }
                    }
                    return;
                }
                return;
            } catch (KeyStoreException e11) {
                throw new CertificateException(e11);
            } catch (NoSuchAlgorithmException e12) {
                throw new CertificateException(e12);
            }
        }
        throw new IllegalArgumentException("checkServerTrusted: X509Certificate array is null");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
