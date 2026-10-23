package cc;

import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: cc.y */
/* loaded from: classes.dex */
public class C1479y extends SSLSocketFactory {

    /* renamed from: b */
    static String[] f5667b;

    /* renamed from: c */
    static String[] f5668c;

    /* renamed from: a */
    private SSLSocketFactory f5669a;

    static {
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            if (sSLSocket != null) {
                LinkedList linkedList = new LinkedList();
                for (String str : sSLSocket.getSupportedProtocols()) {
                    if (!str.toUpperCase().contains("SSL")) {
                        linkedList.add(str);
                    }
                }
                f5667b = (String[]) linkedList.toArray(new String[linkedList.size()]);
                if (Build.VERSION.SDK_INT < 21) {
                    List asList = Arrays.asList("TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECHDE_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
                    List asList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
                    HashSet hashSet = new HashSet(asList);
                    hashSet.retainAll(asList2);
                    hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
                    f5668c = (String[]) hashSet.toArray(new String[hashSet.size()]);
                }
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public C1479y(X509TrustManager x509TrustManager) {
        X509TrustManager[] x509TrustManagerArr;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            if (x509TrustManager != null) {
                x509TrustManagerArr = new X509TrustManager[]{x509TrustManager};
            } else {
                x509TrustManagerArr = null;
            }
            sSLContext.init(null, x509TrustManagerArr, null);
            this.f5669a = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private void m6922a(SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2 = f5667b;
        if (strArr2 != null) {
            sSLSocket.setEnabledProtocols(strArr2);
        }
        if (Build.VERSION.SDK_INT < 21 && (strArr = f5668c) != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket createSocket = this.f5669a.createSocket(socket, str, i10, z10);
        if (createSocket instanceof SSLSocket) {
            m6922a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return f5668c;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return f5668c;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        Socket createSocket = this.f5669a.createSocket(str, i10);
        if (createSocket instanceof SSLSocket) {
            m6922a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        Socket createSocket = this.f5669a.createSocket(str, i10, inetAddress, i11);
        if (createSocket instanceof SSLSocket) {
            m6922a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        Socket createSocket = this.f5669a.createSocket(inetAddress, i10);
        if (createSocket instanceof SSLSocket) {
            m6922a((SSLSocket) createSocket);
        }
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket createSocket = this.f5669a.createSocket(inetAddress, i10, inetAddress2, i11);
        if (createSocket instanceof SSLSocket) {
            m6922a((SSLSocket) createSocket);
        }
        return createSocket;
    }
}
