package com.umeng.p079ut.p080a.p082b;

import android.annotation.TargetApi;
import com.umeng.p079ut.p080a.p083c.C3756e;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

@TargetApi(24)
/* renamed from: com.umeng.ut.a.b.c */
/* loaded from: classes3.dex */
class C3747c extends X509ExtendedTrustManager {

    /* renamed from: a */
    private static TrustManager[] f16783a;

    C3747c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized TrustManager[] getTrustManagers() {
        TrustManager[] trustManagerArr;
        synchronized (C3747c.class) {
            if (f16783a == null) {
                f16783a = new TrustManager[]{new C3747c()};
            }
            trustManagerArr = f16783a;
        }
        return trustManagerArr;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        C3756e.m15954a("UtExtendTrustManager", "checkClientTrusted1");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        C3756e.m15954a("UtExtendTrustManager", "checkServerTrusted1");
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

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        C3756e.m15954a("UtExtendTrustManager", "checkClientTrusted2");
        if (x509CertificateArr != null && x509CertificateArr.length != 0) {
            if (str != null && str.length() != 0) {
                try {
                    x509CertificateArr[0].checkValidity();
                    return;
                } catch (Exception unused) {
                    throw new CertificateException("Certificate not valid or trusted.");
                }
            }
            throw new IllegalArgumentException("parameter is not used");
        }
        throw new IllegalArgumentException("parameter is not used");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        C3756e.m15954a("UtExtendTrustManager", "checkClientTrusted3");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        C3756e.m15954a("UtExtendTrustManager", "checkServerTrusted2");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        C3756e.m15954a("UtExtendTrustManager", "checkServerTrusted3");
    }
}
