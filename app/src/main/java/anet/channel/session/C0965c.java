package anet.channel.session;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: anet.channel.session.c */
/* loaded from: classes.dex */
final class C0965c implements HostnameVerifier {

    /* renamed from: a */
    final /* synthetic */ String f4026a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0965c(String str) {
        this.f4026a = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f4026a, sSLSession);
    }
}
