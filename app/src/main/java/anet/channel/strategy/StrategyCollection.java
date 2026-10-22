package anet.channel.strategy;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.PolicyVersionStat;
import anet.channel.strategy.C1002l;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.lzy.okgo.OkGo;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StrategyCollection implements Serializable {

    /* renamed from: a */
    String f4080a;

    /* renamed from: b */
    volatile long f4081b;

    /* renamed from: c */
    volatile String f4082c;

    /* renamed from: d */
    boolean f4083d;

    /* renamed from: e */
    int f4084e;

    /* renamed from: f */
    private StrategyList f4085f;

    /* renamed from: g */
    private transient long f4086g;

    /* renamed from: h */
    private transient boolean f4087h;

    public StrategyCollection() {
        this.f4085f = null;
        this.f4081b = 0L;
        this.f4082c = null;
        this.f4083d = false;
        this.f4084e = 0;
        this.f4086g = 0L;
        this.f4087h = true;
    }

    public synchronized void checkInit() {
        if (System.currentTimeMillis() - this.f4081b > 172800000) {
            this.f4085f = null;
            return;
        }
        StrategyList strategyList = this.f4085f;
        if (strategyList != null) {
            strategyList.checkInit();
        }
    }

    public boolean isExpired() {
        if (System.currentTimeMillis() > this.f4081b) {
            return true;
        }
        return false;
    }

    public synchronized void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyList strategyList = this.f4085f;
        if (strategyList != null) {
            strategyList.notifyConnEvent(iConnStrategy, connEvent);
            if (!connEvent.isSuccess && this.f4085f.shouldRefresh()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f4086g > OkGo.DEFAULT_MILLISECONDS) {
                    StrategyCenter.getInstance().forceRefreshStrategy(this.f4080a);
                    this.f4086g = currentTimeMillis;
                }
            }
        }
    }

    public synchronized List<IConnStrategy> queryStrategyList() {
        if (this.f4085f == null) {
            return Collections.EMPTY_LIST;
        }
        if (this.f4087h) {
            this.f4087h = false;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(this.f4080a, this.f4084e);
            policyVersionStat.reportType = 0;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        return this.f4085f.getStrategyList();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("\nStrategyList = ");
        sb2.append(this.f4081b);
        StrategyList strategyList = this.f4085f;
        if (strategyList != null) {
            sb2.append(strategyList.toString());
        } else if (this.f4082c != null) {
            sb2.append('[');
            sb2.append(this.f4080a);
            sb2.append("=>");
            sb2.append(this.f4082c);
            sb2.append(']');
        } else {
            sb2.append("[]");
        }
        return sb2.toString();
    }

    public synchronized void update(C1002l.b bVar) {
        C1002l.e[] eVarArr;
        C1002l.a[] aVarArr;
        this.f4081b = System.currentTimeMillis() + (bVar.f4156b * 1000);
        if (!bVar.f4155a.equalsIgnoreCase(this.f4080a)) {
            ALog.m4787e("StrategyCollection", "update error!", null, "host", this.f4080a, "dnsInfo.host", bVar.f4155a);
            return;
        }
        int i10 = this.f4084e;
        int i11 = bVar.f4166l;
        if (i10 != i11) {
            this.f4084e = i11;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(this.f4080a, i11);
            policyVersionStat.reportType = 1;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        this.f4082c = bVar.f4158d;
        String[] strArr = bVar.f4160f;
        if ((strArr != null && strArr.length != 0 && (aVarArr = bVar.f4162h) != null && aVarArr.length != 0) || ((eVarArr = bVar.f4163i) != null && eVarArr.length != 0)) {
            if (this.f4085f == null) {
                this.f4085f = new StrategyList();
            }
            this.f4085f.update(bVar);
            return;
        }
        this.f4085f = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public StrategyCollection(String str) {
        this.f4085f = null;
        this.f4081b = 0L;
        this.f4082c = null;
        this.f4083d = false;
        this.f4084e = 0;
        this.f4086g = 0L;
        this.f4087h = true;
        this.f4080a = str;
        this.f4083d = DispatchConstants.isAmdcServerDomain(str);
    }
}
