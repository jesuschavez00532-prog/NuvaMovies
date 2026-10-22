package anet.channel;

import anet.channel.entity.C0935b;
import anet.channel.entity.EventCb;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.g */
/* loaded from: classes.dex */
public class C0940g implements EventCb {

    /* renamed from: a */
    final /* synthetic */ Session f3899a;

    /* renamed from: b */
    final /* synthetic */ SessionRequest f3900b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0940g(SessionRequest sessionRequest, Session session) {
        this.f3900b = sessionRequest;
        this.f3899a = session;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, C0935b c0935b) {
        ALog.m4785d("awcn.SessionRequest", "Receive session event", null, "eventType", Integer.valueOf(i10));
        ConnEvent connEvent = new ConnEvent();
        if (i10 == 512) {
            connEvent.isSuccess = true;
        }
        SessionInfo sessionInfo = this.f3900b.f3763c;
        if (sessionInfo != null) {
            connEvent.isAccs = sessionInfo.isAccs;
        }
        StrategyCenter.getInstance().notifyConnEvent(this.f3899a.getRealHost(), this.f3899a.getConnStrategy(), connEvent);
    }
}
