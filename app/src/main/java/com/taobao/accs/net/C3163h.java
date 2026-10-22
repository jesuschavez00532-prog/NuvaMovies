package com.taobao.accs.net;

import anet.channel.entity.ConnType;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.taobao.accs.utl.ALog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.taobao.accs.net.h */
/* loaded from: classes.dex */
public class C3163h {

    /* renamed from: a */
    private int f13012a = 0;

    /* renamed from: b */
    private List<IConnStrategy> f13013b = new ArrayList();

    public C3163h(String str) {
        HttpDispatcher.getInstance().addListener(new C3164i(this));
        m12880a(str);
    }

    /* renamed from: a */
    public List<IConnStrategy> m12880a(String str) {
        List<IConnStrategy> connStrategyListByHost;
        if ((this.f13012a == 0 || this.f13013b.isEmpty()) && (connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str)) != null && !connStrategyListByHost.isEmpty()) {
            this.f13013b.clear();
            for (IConnStrategy iConnStrategy : connStrategyListByHost) {
                ConnType valueOf = ConnType.valueOf(iConnStrategy.getProtocol());
                if (valueOf.getTypeLevel() == ConnType.TypeLevel.SPDY && valueOf.isSSL()) {
                    this.f13013b.add(iConnStrategy);
                }
            }
        }
        return this.f13013b;
    }

    /* renamed from: b */
    public void m12881b() {
        this.f13012a++;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m12938d("HttpDnsProvider", "updateStrategyPos StrategyPos:" + this.f13012a, new Object[0]);
        }
    }

    /* renamed from: c */
    public int m12883c() {
        return this.f13012a;
    }

    /* renamed from: b */
    public void m12882b(String str) {
        StrategyCenter.getInstance().forceRefreshStrategy(str);
    }

    /* renamed from: a */
    public IConnStrategy m12878a() {
        return m12879a(this.f13013b);
    }

    /* renamed from: a */
    public IConnStrategy m12879a(List<IConnStrategy> list) {
        if (list != null && !list.isEmpty()) {
            int i10 = this.f13012a;
            if (i10 < 0 || i10 >= list.size()) {
                this.f13012a = 0;
            }
            return list.get(this.f13012a);
        }
        ALog.m12938d("HttpDnsProvider", "strategys null or 0", new Object[0]);
        return null;
    }
}
