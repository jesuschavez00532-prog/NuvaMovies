package anet.channel.session;

import anet.channel.IAuth;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.statist.SessionStatistic;
import anet.channel.util.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.session.i */
/* loaded from: classes.dex */
public class C0971i implements IAuth.AuthCallback {

    /* renamed from: a */
    final /* synthetic */ TnetSpdySession f4036a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0971i(TnetSpdySession tnetSpdySession) {
        this.f4036a = tnetSpdySession;
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthFail(int i10, String str) {
        this.f4036a.notifyStatus(5, null);
        SessionStatistic sessionStatistic = this.f4036a.f3739q;
        if (sessionStatistic != null) {
            sessionStatistic.closeReason = "Accs_Auth_Fail:" + i10;
            this.f4036a.f3739q.errorCode = (long) i10;
        }
        this.f4036a.close();
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthSuccess() {
        this.f4036a.notifyStatus(4, null);
        this.f4036a.f4015z = System.currentTimeMillis();
        TnetSpdySession tnetSpdySession = this.f4036a;
        IHeartbeat iHeartbeat = tnetSpdySession.f4006D;
        if (iHeartbeat != null) {
            iHeartbeat.start(tnetSpdySession);
        }
        TnetSpdySession tnetSpdySession2 = this.f4036a;
        SessionStatistic sessionStatistic = tnetSpdySession2.f3739q;
        sessionStatistic.ret = 1;
        ALog.m4785d("awcn.TnetSpdySession", "spdyOnStreamResponse", tnetSpdySession2.f3738p, "authTime", Long.valueOf(sessionStatistic.authTime));
        TnetSpdySession tnetSpdySession3 = this.f4036a;
        if (tnetSpdySession3.f4003A > 0) {
            tnetSpdySession3.f3739q.authTime = System.currentTimeMillis() - this.f4036a.f4003A;
        }
    }
}
