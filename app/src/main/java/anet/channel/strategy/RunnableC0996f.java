package anet.channel.strategy;

import anet.channel.statist.StrategyStatObject;
import anet.channel.strategy.StrategyInfoHolder;
import java.io.Serializable;
import java.util.Map;

/* renamed from: anet.channel.strategy.f */
/* loaded from: classes.dex */
class RunnableC0996f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map.Entry f4133a;

    /* renamed from: b */
    final /* synthetic */ StrategyInfoHolder.LruStrategyMap f4134b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0996f(StrategyInfoHolder.LruStrategyMap lruStrategyMap, Map.Entry entry) {
        this.f4134b = lruStrategyMap;
        this.f4133a = entry;
    }

    @Override // java.lang.Runnable
    public void run() {
        StrategyTable strategyTable = (StrategyTable) this.f4133a.getValue();
        if (strategyTable.f4105d) {
            StrategyStatObject strategyStatObject = new StrategyStatObject(1);
            strategyStatObject.writeStrategyFileId = strategyTable.f4102a;
            C1003m.m4766a((Serializable) this.f4133a.getValue(), strategyTable.f4102a, strategyStatObject);
            strategyTable.f4105d = false;
        }
    }
}
