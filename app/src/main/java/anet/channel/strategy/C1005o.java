package anet.channel.strategy;

import java.util.Comparator;

/* renamed from: anet.channel.strategy.o */
/* loaded from: classes.dex */
final class C1005o implements Comparator<StrategyCollection> {
    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(StrategyCollection strategyCollection, StrategyCollection strategyCollection2) {
        if (strategyCollection.f4081b != strategyCollection2.f4081b) {
            return (int) (strategyCollection.f4081b - strategyCollection2.f4081b);
        }
        return strategyCollection.f4080a.compareTo(strategyCollection2.f4080a);
    }
}
