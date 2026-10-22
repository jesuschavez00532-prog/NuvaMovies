package anet.channel.p018e;

import anet.channel.entity.ConnType;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;

/* renamed from: anet.channel.e.b */
/* loaded from: classes.dex */
final class C0928b implements IStrategyFilter {
    @Override // anet.channel.strategy.IStrategyFilter
    public boolean accept(IConnStrategy iConnStrategy) {
        String str = iConnStrategy.getProtocol().protocol;
        if (!ConnType.HTTP3.equals(str) && !ConnType.HTTP3_PLAIN.equals(str)) {
            return false;
        }
        return true;
    }
}
