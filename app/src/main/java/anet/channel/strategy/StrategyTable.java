package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnType;
import anet.channel.p018e.C0927a;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C1002l;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.C1009d;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.HttpConstant;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StrategyTable implements Serializable {

    /* renamed from: e */
    protected static Comparator<StrategyCollection> f4101e = new C1005o();

    /* renamed from: a */
    protected String f4102a;

    /* renamed from: b */
    protected volatile String f4103b;

    /* renamed from: c */
    Map<String, Long> f4104c;

    /* renamed from: d */
    protected transient boolean f4105d = false;

    /* renamed from: f */
    private HostLruCache f4106f;

    /* renamed from: g */
    private volatile transient int f4107g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class HostLruCache extends SerialLruCache<String, StrategyCollection> {
        public HostLruCache(int i10) {
            super(i10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(Map.Entry<String, StrategyCollection> entry) {
            if (!entry.getValue().f4083d) {
                return true;
            }
            Iterator<Map.Entry<String, StrategyCollection>> it = entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().f4083d) {
                    it.remove();
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public StrategyTable(String str) {
        this.f4102a = str;
        m4728a();
    }

    /* renamed from: b */
    private void m4725b() {
        if (HttpDispatcher.getInstance().isInitHostsChanged(this.f4102a)) {
            for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                this.f4106f.put(str, new StrategyCollection(str));
            }
        }
    }

    /* renamed from: c */
    private void m4727c() {
        TreeSet treeSet;
        try {
            if (HttpDispatcher.getInstance().isInitHostsChanged(this.f4102a)) {
                synchronized (this.f4106f) {
                    treeSet = null;
                    for (String str : HttpDispatcher.getInstance().getInitHosts()) {
                        if (!this.f4106f.containsKey(str)) {
                            this.f4106f.put(str, new StrategyCollection(str));
                            if (treeSet == null) {
                                treeSet = new TreeSet();
                            }
                            treeSet.add(str);
                        }
                    }
                }
                if (treeSet != null) {
                    m4724a(treeSet);
                }
            }
        } catch (Exception e10) {
            ALog.m4786e("awcn.StrategyTable", "checkInitHost failed", this.f4102a, e10, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m4728a() {
        if (this.f4106f == null) {
            this.f4106f = new HostLruCache(256);
            m4725b();
        }
        Iterator<StrategyCollection> it = this.f4106f.values().iterator();
        while (it.hasNext()) {
            it.next().checkInit();
        }
        ALog.m4788i("awcn.StrategyTable", "strategy map", null, "size", Integer.valueOf(this.f4106f.size()));
        this.f4107g = GlobalAppRuntimeInfo.isTargetProcess() ? 0 : -1;
        if (this.f4104c == null) {
            this.f4104c = new ConcurrentHashMap();
        }
    }

    public String getCnameByHost(String str) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f4106f) {
            strategyCollection = this.f4106f.get(str);
        }
        if (strategyCollection != null && strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0) {
            m4723a(str);
        }
        if (strategyCollection == null) {
            return null;
        }
        return strategyCollection.f4082c;
    }

    public List<IConnStrategy> queryByHost(String str) {
        StrategyCollection strategyCollection;
        if (!TextUtils.isEmpty(str) && C1009d.m4781c(str)) {
            m4727c();
            synchronized (this.f4106f) {
                strategyCollection = this.f4106f.get(str);
                if (strategyCollection == null) {
                    strategyCollection = new StrategyCollection(str);
                    this.f4106f.put(str, strategyCollection);
                }
            }
            if (strategyCollection.f4081b == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
                m4723a(str);
            }
            return strategyCollection.queryStrategyList();
        }
        return Collections.EMPTY_LIST;
    }

    public void update(C1002l.d dVar) {
        C1002l.b[] bVarArr;
        String str;
        ALog.m4788i("awcn.StrategyTable", "update strategyTable with httpDns response", this.f4102a, new Object[0]);
        try {
            this.f4103b = dVar.f4169a;
            this.f4107g = dVar.f4174f;
            bVarArr = dVar.f4170b;
        } catch (Throwable th) {
            ALog.m4786e("awcn.StrategyTable", "fail to update strategyTable", this.f4102a, th, new Object[0]);
        }
        if (bVarArr == null) {
            return;
        }
        synchronized (this.f4106f) {
            for (C1002l.b bVar : bVarArr) {
                if (bVar != null && (str = bVar.f4155a) != null) {
                    if (bVar.f4164j) {
                        this.f4106f.remove(str);
                    } else {
                        StrategyCollection strategyCollection = this.f4106f.get(str);
                        if (strategyCollection == null) {
                            strategyCollection = new StrategyCollection(bVar.f4155a);
                            this.f4106f.put(bVar.f4155a, strategyCollection);
                        }
                        strategyCollection.update(bVar);
                    }
                }
            }
        }
        this.f4105d = true;
        if (ALog.isPrintLog(1)) {
            StringBuilder sb2 = new StringBuilder("uniqueId : ");
            sb2.append(this.f4102a);
            sb2.append("\n-------------------------domains:------------------------------------");
            ALog.m4785d("awcn.StrategyTable", sb2.toString(), null, new Object[0]);
            synchronized (this.f4106f) {
                for (Map.Entry<String, StrategyCollection> entry : this.f4106f.entrySet()) {
                    sb2.setLength(0);
                    sb2.append(entry.getKey());
                    sb2.append(" = ");
                    sb2.append(entry.getValue().toString());
                    ALog.m4785d("awcn.StrategyTable", sb2.toString(), null, new Object[0]);
                }
            }
        }
    }

    /* renamed from: b */
    private void m4726b(Set<String> set) {
        TreeSet treeSet = new TreeSet(f4101e);
        synchronized (this.f4106f) {
            treeSet.addAll(this.f4106f.values());
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            StrategyCollection strategyCollection = (StrategyCollection) it.next();
            if (!strategyCollection.isExpired() || set.size() >= 40) {
                return;
            }
            strategyCollection.f4081b = 30000 + currentTimeMillis;
            set.add(strategyCollection.f4080a);
        }
    }

    /* renamed from: a */
    private void m4723a(String str) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(str);
        m4724a(treeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m4730a(String str, boolean z10) {
        StrategyCollection strategyCollection;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f4106f) {
            strategyCollection = this.f4106f.get(str);
            if (strategyCollection == null) {
                strategyCollection = new StrategyCollection(str);
                this.f4106f.put(str, strategyCollection);
            }
        }
        if (z10 || strategyCollection.f4081b == 0 || (strategyCollection.isExpired() && AmdcRuntimeInfo.getAmdcLimitLevel() == 0)) {
            m4723a(str);
        }
    }

    /* renamed from: a */
    private void m4724a(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        if ((GlobalAppRuntimeInfo.isAppBackground() && AppLifecycle.lastEnterBackgroundTime > 0) || !NetworkStatusHelper.isConnected()) {
            ALog.m4788i("awcn.StrategyTable", "app in background or no network", this.f4102a, new Object[0]);
            return;
        }
        int amdcLimitLevel = AmdcRuntimeInfo.getAmdcLimitLevel();
        if (amdcLimitLevel == 3) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f4106f) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                StrategyCollection strategyCollection = this.f4106f.get(it.next());
                if (strategyCollection != null) {
                    strategyCollection.f4081b = 30000 + currentTimeMillis;
                }
            }
        }
        if (amdcLimitLevel == 0) {
            m4726b(set);
        }
        HttpDispatcher.getInstance().sendAmdcRequest(set, this.f4107g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m4729a(String str, IConnStrategy iConnStrategy, ConnEvent connEvent) {
        StrategyCollection strategyCollection;
        if (ALog.isPrintLog(1)) {
            ALog.m4785d("awcn.StrategyTable", "[notifyConnEvent]", null, HttpConstant.HOST, str, "IConnStrategy", iConnStrategy, "ConnEvent", connEvent);
        }
        String str2 = iConnStrategy.getProtocol().protocol;
        if (ConnType.HTTP3.equals(str2) || ConnType.HTTP3_PLAIN.equals(str2)) {
            C0927a.m4559a(connEvent.isSuccess);
            ALog.m4787e("awcn.StrategyTable", "enable http3", null, "uniqueId", this.f4102a, "enable", Boolean.valueOf(connEvent.isSuccess));
        }
        if (!connEvent.isSuccess && C1009d.m4780b(iConnStrategy.getIp())) {
            this.f4104c.put(str, Long.valueOf(System.currentTimeMillis()));
            ALog.m4787e("awcn.StrategyTable", "disable ipv6", null, "uniqueId", this.f4102a, "host", str);
        }
        synchronized (this.f4106f) {
            strategyCollection = this.f4106f.get(str);
        }
        if (strategyCollection != null) {
            strategyCollection.notifyConnEvent(iConnStrategy, connEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m4731a(String str, long j10) {
        Long l10 = this.f4104c.get(str);
        if (l10 == null) {
            return false;
        }
        if (l10.longValue() + j10 >= System.currentTimeMillis()) {
            return true;
        }
        this.f4104c.remove(str);
        return false;
    }
}
