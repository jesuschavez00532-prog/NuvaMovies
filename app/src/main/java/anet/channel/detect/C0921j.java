package anet.channel.detect;

import anet.channel.strategy.C1002l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;

/* renamed from: anet.channel.detect.j */
/* loaded from: classes.dex */
final class C0921j implements IConnStrategy {

    /* renamed from: a */
    final /* synthetic */ C1002l.e f3843a;

    /* renamed from: b */
    final /* synthetic */ ConnProtocol f3844b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0921j(C1002l.e eVar, ConnProtocol connProtocol) {
        this.f3843a = eVar;
        this.f3844b = connProtocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.f3843a.f4178b.f4149c;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return 0;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.f3843a.f4177a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return 2;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return 1;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.f3843a.f4178b.f4147a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        return this.f3844b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.f3843a.f4178b.f4150d;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return 0;
    }
}
