package anet.channel.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class StrategyTemplate {
    Map<String, ConnProtocol> templateMap = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: anet.channel.strategy.StrategyTemplate$a */
    /* loaded from: classes.dex */
    public static class C0984a {

        /* renamed from: a */
        static StrategyTemplate f4108a = new StrategyTemplate();

        C0984a() {
        }
    }

    public static StrategyTemplate getInstance() {
        return C0984a.f4108a;
    }

    public ConnProtocol getConnProtocol(String str) {
        return this.templateMap.get(str);
    }

    public void registerConnProtocol(String str, ConnProtocol connProtocol) {
        if (connProtocol != null) {
            this.templateMap.put(str, connProtocol);
            try {
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                if (strategyCenter instanceof C0997g) {
                    ((C0997g) strategyCenter).f4136b.f4093c.m4736a(str, connProtocol);
                }
            } catch (Exception unused) {
            }
        }
    }
}
