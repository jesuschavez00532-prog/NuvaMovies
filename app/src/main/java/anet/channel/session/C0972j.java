package anet.channel.session;

import android.content.Context;
import anet.channel.Session;
import anet.channel.security.ISecurity;
import anet.channel.util.ALog;
import org.android.spdy.AccsSSLCallback;
import org.android.spdy.SpdyProtocol;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.session.j */
/* loaded from: classes.dex */
public class C0972j implements AccsSSLCallback {

    /* renamed from: a */
    final /* synthetic */ TnetSpdySession f4037a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0972j(TnetSpdySession tnetSpdySession) {
        this.f4037a = tnetSpdySession;
    }

    @Override // org.android.spdy.AccsSSLCallback
    public byte[] getSSLPublicKey(int i10, byte[] bArr) {
        byte[] bArr2;
        Context context;
        try {
            TnetSpdySession tnetSpdySession = this.f4037a;
            ISecurity iSecurity = tnetSpdySession.f4009G;
            context = ((Session) tnetSpdySession).f3723a;
            bArr2 = iSecurity.decrypt(context, ISecurity.CIPHER_ALGORITHM_AES128, SpdyProtocol.TNET_PUBKEY_SG_KEY, bArr);
            if (bArr2 != null) {
                try {
                    if (ALog.isPrintLog(2)) {
                        ALog.m4788i("getSSLPublicKey", null, "decrypt", new String(bArr2));
                    }
                } catch (Throwable th) {
                    th = th;
                    ALog.m4786e("awcn.TnetSpdySession", "getSSLPublicKey", null, th, new Object[0]);
                    return bArr2;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bArr2 = null;
        }
        return bArr2;
    }
}
