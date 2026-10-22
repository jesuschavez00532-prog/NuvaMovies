package anet.channel.strategy;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.strategy.k */
/* loaded from: classes.dex */
public class C1001k implements Comparator<IPConnStrategy> {

    /* renamed from: a */
    final /* synthetic */ StrategyList f4146a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1001k(StrategyList strategyList) {
        this.f4146a = strategyList;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(IPConnStrategy iPConnStrategy, IPConnStrategy iPConnStrategy2) {
        Map map;
        Map map2;
        int i10;
        int i11;
        map = this.f4146a.f4098b;
        ConnHistoryItem connHistoryItem = (ConnHistoryItem) map.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
        map2 = this.f4146a.f4098b;
        ConnHistoryItem connHistoryItem2 = (ConnHistoryItem) map2.get(Integer.valueOf(iPConnStrategy2.getUniqueId()));
        int m4696a = connHistoryItem.m4696a();
        int m4696a2 = connHistoryItem2.m4696a();
        if (m4696a != m4696a2) {
            return m4696a - m4696a2;
        }
        if (iPConnStrategy.f4076a != iPConnStrategy2.f4076a) {
            i10 = iPConnStrategy.f4076a;
            i11 = iPConnStrategy2.f4076a;
        } else {
            i10 = iPConnStrategy.protocol.isHttp;
            i11 = iPConnStrategy2.protocol.isHttp;
        }
        return i10 - i11;
    }
}
