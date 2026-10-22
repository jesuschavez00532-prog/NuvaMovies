package anet.channel.p018e;

import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C0935b;
import anet.channel.entity.EventCb;
import anet.channel.p018e.C0927a;
import anet.channel.statist.Http3DetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;

/* renamed from: anet.channel.e.f */
/* loaded from: classes.dex */
class C0932f implements EventCb {

    /* renamed from: a */
    final /* synthetic */ IConnStrategy f3872a;

    /* renamed from: b */
    final /* synthetic */ RunnableC0931e f3873b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0932f(RunnableC0931e runnableC0931e, IConnStrategy iConnStrategy) {
        this.f3873b = runnableC0931e;
        this.f3872a = iConnStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, C0935b c0935b) {
        C0927a.b bVar;
        String str;
        Object r02 = 1;
        if (i10 != 1) {
            r02 = 0;
        }
        bVar = C0927a.f3857a;
        bVar.m4569a(NetworkStatusHelper.getUniqueId(this.f3873b.f3871b), r02);
        session.close(false);
        str = C0927a.f3858b;
        Http3DetectStat http3DetectStat = new Http3DetectStat(str, this.f3872a);
        http3DetectStat.ret = r02;
        AppMonitor.getInstance().commitStat(http3DetectStat);
    }
}
