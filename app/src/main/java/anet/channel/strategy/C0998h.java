package anet.channel.strategy;

import anet.channel.AwcnConfig;
import anet.channel.entity.ConnType;
import anet.channel.p018e.C0927a;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.strategy.h */
/* loaded from: classes.dex */
public class C0998h implements IStrategyFilter {

    /* renamed from: a */
    final /* synthetic */ C0997g f4140a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0998h(C0997g c0997g) {
        this.f4140a = c0997g;
    }

    @Override // anet.channel.strategy.IStrategyFilter
    public boolean accept(IConnStrategy iConnStrategy) {
        String str = iConnStrategy.getProtocol().protocol;
        if (!ConnType.QUIC.equals(str) && !ConnType.QUIC_PLAIN.equals(str)) {
            boolean isHttp3Enable = AwcnConfig.isHttp3Enable();
            boolean m4561b = C0927a.m4561b();
            if ((isHttp3Enable && m4561b) || (!ConnType.HTTP3.equals(str) && !ConnType.HTTP3_PLAIN.equals(str))) {
                return true;
            }
            ALog.m4788i("awcn.StrategyCenter", "http3 strategy disabled", null, Constants.KEY_STRATEGY, iConnStrategy);
            return false;
        }
        ALog.m4788i("awcn.StrategyCenter", "gquic strategy disabled", null, Constants.KEY_STRATEGY, iConnStrategy);
        return false;
    }
}
