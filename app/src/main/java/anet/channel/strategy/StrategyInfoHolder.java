package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.StrategyStatObject;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C1002l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.utils.C1006a;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StrategyInfoHolder implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    Map<String, StrategyTable> f4091a = new LruStrategyMap();

    /* renamed from: b */
    volatile StrategyConfig f4092b = null;

    /* renamed from: c */
    final C0985a f4093c = new C0985a();

    /* renamed from: d */
    private final StrategyTable f4094d = new StrategyTable("Unknown");

    /* renamed from: e */
    private final Set<String> f4095e = new HashSet();

    /* renamed from: f */
    private volatile String f4096f = "";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class LruStrategyMap extends SerialLruCache<String, StrategyTable> {
        public LruStrategyMap() {
            super(3);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyTable> entry) {
            C1006a.m4773a(new RunnableC0996f(this, entry));
            return true;
        }
    }

    private StrategyInfoHolder() {
        try {
            m4711e();
            m4713g();
        } catch (Throwable unused) {
        }
        m4712f();
    }

    /* renamed from: a */
    public static StrategyInfoHolder m4709a() {
        return new StrategyInfoHolder();
    }

    /* renamed from: e */
    private void m4711e() {
        NetworkStatusHelper.addStatusChangeListener(this);
        this.f4096f = m4710a(NetworkStatusHelper.getStatus());
    }

    /* renamed from: f */
    private void m4712f() {
        Iterator<Map.Entry<String, StrategyTable>> it = this.f4091a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m4728a();
        }
        synchronized (this) {
            if (this.f4092b == null) {
                StrategyConfig strategyConfig = new StrategyConfig();
                strategyConfig.m4708b();
                strategyConfig.m4705a(this);
                this.f4092b = strategyConfig;
            }
        }
    }

    /* renamed from: g */
    private void m4713g() {
        ALog.m4788i("awcn.StrategyInfoHolder", "restore", null, new Object[0]);
        String str = this.f4096f;
        if (!AwcnConfig.isAsyncLoadStrategyEnable()) {
            if (!TextUtils.isEmpty(str)) {
                m4715a(str, true);
            }
            this.f4092b = (StrategyConfig) C1003m.m4763a("StrategyConfig", null);
            if (this.f4092b != null) {
                this.f4092b.m4708b();
                this.f4092b.m4705a(this);
            }
        }
        C1006a.m4773a(new RunnableC0988d(this, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4716b() {
        NetworkStatusHelper.removeStatusChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m4717c() {
        synchronized (this) {
            for (StrategyTable strategyTable : this.f4091a.values()) {
                if (strategyTable.f4105d) {
                    StrategyStatObject strategyStatObject = new StrategyStatObject(1);
                    String str = strategyTable.f4102a;
                    strategyStatObject.writeStrategyFileId = str;
                    C1003m.m4766a(strategyTable, str, strategyStatObject);
                    strategyTable.f4105d = false;
                }
            }
            C1003m.m4766a(this.f4092b.m4703a(), "StrategyConfig", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public StrategyTable m4718d() {
        StrategyTable strategyTable = this.f4094d;
        String str = this.f4096f;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f4091a) {
                strategyTable = this.f4091a.get(str);
                if (strategyTable == null) {
                    strategyTable = new StrategyTable(str);
                    this.f4091a.put(str, strategyTable);
                }
            }
        }
        return strategyTable;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f4093c.m4734a();
        this.f4096f = m4710a(networkStatus);
        String str = this.f4096f;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f4091a) {
                if (!this.f4091a.containsKey(str)) {
                    C1006a.m4773a(new RunnableC0995e(this, str));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m4715a(String str, boolean z10) {
        StrategyStatObject strategyStatObject;
        synchronized (this.f4095e) {
            if (this.f4095e.contains(str)) {
                return;
            }
            this.f4095e.add(str);
            if (z10) {
                strategyStatObject = new StrategyStatObject(0);
                strategyStatObject.readStrategyFileId = str;
            } else {
                strategyStatObject = null;
            }
            StrategyTable strategyTable = (StrategyTable) C1003m.m4763a(str, strategyStatObject);
            if (strategyTable != null) {
                strategyTable.m4728a();
                synchronized (this.f4091a) {
                    this.f4091a.put(strategyTable.f4102a, strategyTable);
                }
            }
            synchronized (this.f4095e) {
                this.f4095e.remove(str);
            }
            if (z10) {
                strategyStatObject.isSucceed = strategyTable != null ? 1 : 0;
                AppMonitor.getInstance().commitStat(strategyStatObject);
            }
        }
    }

    /* renamed from: a */
    private String m4710a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String md5ToHex = StringUtils.md5ToHex(NetworkStatusHelper.getWifiBSSID());
            return "WIFI$" + (TextUtils.isEmpty(md5ToHex) ? "" : md5ToHex);
        }
        if (!networkStatus.isMobile()) {
            return "";
        }
        return networkStatus.getType() + "$" + NetworkStatusHelper.getApn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4714a(C1002l.d dVar) {
        int i10 = dVar.f4175g;
        if (i10 != 0) {
            AmdcRuntimeInfo.updateAmdcLimit(i10, dVar.f4176h);
        }
        m4718d().update(dVar);
        this.f4092b.m4706a(dVar);
    }
}
