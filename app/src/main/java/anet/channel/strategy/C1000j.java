package anet.channel.strategy;

import anet.channel.strategy.C1002l;
import anet.channel.strategy.StrategyList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.strategy.j */
/* loaded from: classes.dex */
public class C1000j implements StrategyList.Predicate<IPConnStrategy> {

    /* renamed from: a */
    final /* synthetic */ C1002l.a f4142a;

    /* renamed from: b */
    final /* synthetic */ String f4143b;

    /* renamed from: c */
    final /* synthetic */ ConnProtocol f4144c;

    /* renamed from: d */
    final /* synthetic */ StrategyList f4145d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1000j(StrategyList strategyList, C1002l.a aVar, String str, ConnProtocol connProtocol) {
        this.f4145d = strategyList;
        this.f4142a = aVar;
        this.f4143b = str;
        this.f4144c = connProtocol;
    }

    @Override // anet.channel.strategy.StrategyList.Predicate
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean apply(IPConnStrategy iPConnStrategy) {
        if (iPConnStrategy.getPort() == this.f4142a.f4147a && iPConnStrategy.getIp().equals(this.f4143b) && iPConnStrategy.protocol.equals(this.f4144c)) {
            return true;
        }
        return false;
    }
}
