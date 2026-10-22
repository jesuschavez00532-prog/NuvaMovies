package anet.channel.session;

import anet.channel.Session;
import anet.channel.statist.SessionStatistic;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyInstance;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

/* renamed from: anet.channel.session.h */
/* loaded from: classes.dex */
class RunnableC0970h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TnetSpdySession f4035a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0970h(TnetSpdySession tnetSpdySession) {
        this.f4035a = tnetSpdySession;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        IConnStrategy iConnStrategy;
        if (this.f4035a.f4014y) {
            TnetSpdySession tnetSpdySession = this.f4035a;
            ALog.m4787e("awcn.TnetSpdySession", "send msg time out!", tnetSpdySession.f3738p, "pingUnRcv:", Boolean.valueOf(tnetSpdySession.f4014y));
            try {
                this.f4035a.handleCallbacks(2048, null);
                SessionStatistic sessionStatistic = this.f4035a.f3739q;
                if (sessionStatistic != null) {
                    sessionStatistic.closeReason = "ping time out";
                }
                ConnEvent connEvent = new ConnEvent();
                connEvent.isSuccess = false;
                connEvent.isAccs = this.f4035a.f4011I;
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                str = ((Session) this.f4035a).f3726d;
                iConnStrategy = ((Session) this.f4035a).f3733k;
                strategyCenter.notifyConnEvent(str, iConnStrategy, connEvent);
                this.f4035a.close(true);
            } catch (Exception unused) {
            }
        }
    }
}
