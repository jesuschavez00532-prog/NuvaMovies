package com.taobao.accs.net;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.net.q */
/* loaded from: classes.dex */
class RunnableC3172q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3166k f13038a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3172q(C3166k c3166k) {
        this.f13038a = c3166k;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f13038a.f12984g) {
            try {
                Session session = SessionCenter.getInstance(this.f13038a.f12986i.getAppKey()).get(this.f13038a.mo12849b((String) null), ConnType.TypeLevel.SPDY, 0L);
                if (session != null) {
                    ALog.m12940e(this.f13038a.mo12858d(), "try session ping", new Object[0]);
                    int pingTimeout = this.f13038a.f12986i.getPingTimeout();
                    if (pingTimeout > 0) {
                        session.ping(true, pingTimeout);
                    } else {
                        session.ping(true);
                    }
                }
            } catch (Exception e10) {
                ALog.m12939e(this.f13038a.mo12858d(), "ping error", e10, new Object[0]);
            }
        }
    }
}
