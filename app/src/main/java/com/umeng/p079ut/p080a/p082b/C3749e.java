package com.umeng.p079ut.p080a.p082b;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.p079ut.p080a.p083c.C3756e;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.umeng.ut.a.b.e */
/* loaded from: classes3.dex */
class C3749e extends SSLSocketFactory {

    /* renamed from: b */
    private String f16786b;

    /* renamed from: a */
    private Method f16785a = null;
    private HostnameVerifier hostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();

    public C3749e(String str) {
        this.f16786b = str;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return null;
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f16786b) || !(obj instanceof C3749e)) {
            return false;
        }
        String str = ((C3749e) obj).f16786b;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f16786b.equals(str);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        SSLSocket sSLSocket;
        C3756e.m15957b("", "peerHost", this.f16786b, "host", str, IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, Integer.valueOf(i10), "autoClose", Boolean.valueOf(z10));
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 24) {
            sSLCertificateSocketFactory.setTrustManagers(C3750f.getTrustManagers());
        } else {
            sSLCertificateSocketFactory.setTrustManagers(C3747c.getTrustManagers());
        }
        C3756e.m15954a("", "createSocket");
        if (i11 < 23) {
            InetAddress inetAddress = socket.getInetAddress();
            if (z10) {
                socket.close();
            }
            sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i10);
        } else {
            sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(socket, this.f16786b, i10, true);
        }
        C3756e.m15954a("", "createSocket end");
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        sSLCertificateSocketFactory.setHostname(sSLSocket, this.f16786b);
        SSLSession session = sSLSocket.getSession();
        if (this.hostnameVerifier.verify(this.f16786b, session)) {
            C3756e.m15957b("", "SSLSession PeerHost", session.getPeerHost());
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + this.f16786b);
    }
}
