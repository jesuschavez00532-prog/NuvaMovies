package anet.channel.p018e;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.C0934a;
import anet.channel.session.TnetSpdySession;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.e.e */
/* loaded from: classes.dex */
public final class RunnableC0931e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f3870a;

    /* renamed from: b */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f3871b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0931e(List list, NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f3870a = list;
        this.f3871b = networkStatus;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        AtomicInteger atomicInteger;
        IConnStrategy m4560b;
        IConnStrategy iConnStrategy = (IConnStrategy) this.f3870a.get(0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://");
        str = C0927a.f3858b;
        sb2.append(str);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Http3Detect");
        atomicInteger = C0927a.f3864h;
        sb4.append(atomicInteger.getAndIncrement());
        String sb5 = sb4.toString();
        m4560b = C0927a.m4560b(iConnStrategy);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(GlobalAppRuntimeInfo.getContext(), new C0934a(sb3, sb5, m4560b));
        tnetSpdySession.registerEventcb(257, new C0932f(this, iConnStrategy));
        tnetSpdySession.f3739q.isCommitted = true;
        tnetSpdySession.connect();
    }
}
