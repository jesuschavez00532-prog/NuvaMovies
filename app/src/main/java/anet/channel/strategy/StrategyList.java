package anet.channel.strategy;

import anet.channel.strategy.C1002l;
import anet.channel.strategy.utils.C1009d;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import com.taobao.accs.common.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes.dex */
class StrategyList implements Serializable {

    /* renamed from: a */
    private List<IPConnStrategy> f4097a;

    /* renamed from: b */
    private Map<Integer, ConnHistoryItem> f4098b;

    /* renamed from: c */
    private boolean f4099c;

    /* renamed from: d */
    private transient Comparator<IPConnStrategy> f4100d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface Predicate<T> {
        boolean apply(T t10);
    }

    public StrategyList() {
        this.f4097a = new ArrayList();
        this.f4098b = new SerialLruCache(40);
        this.f4099c = false;
        this.f4100d = null;
    }

    public void checkInit() {
        if (this.f4097a == null) {
            this.f4097a = new ArrayList();
        }
        if (this.f4098b == null) {
            this.f4098b = new SerialLruCache(40);
        }
        Iterator<Map.Entry<Integer, ConnHistoryItem>> it = this.f4098b.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().m4700d()) {
                it.remove();
            }
        }
        for (IPConnStrategy iPConnStrategy : this.f4097a) {
            if (!this.f4098b.containsKey(Integer.valueOf(iPConnStrategy.getUniqueId()))) {
                this.f4098b.put(Integer.valueOf(iPConnStrategy.getUniqueId()), new ConnHistoryItem());
            }
        }
        Collections.sort(this.f4097a, m4720a());
    }

    public List<IConnStrategy> getStrategyList() {
        if (this.f4097a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = null;
        for (IPConnStrategy iPConnStrategy : this.f4097a) {
            ConnHistoryItem connHistoryItem = this.f4098b.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
            if (connHistoryItem != null && connHistoryItem.m4699c()) {
                ALog.m4788i("awcn.StrategyList", "strategy ban!", null, Constants.KEY_STRATEGY, iPConnStrategy);
            } else {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(iPConnStrategy);
            }
        }
        if (linkedList == null) {
            return Collections.EMPTY_LIST;
        }
        return linkedList;
    }

    public void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        if ((iConnStrategy instanceof IPConnStrategy) && this.f4097a.indexOf(iConnStrategy) != -1) {
            this.f4098b.get(Integer.valueOf(((IPConnStrategy) iConnStrategy).getUniqueId())).m4697a(connEvent.isSuccess);
            Collections.sort(this.f4097a, this.f4100d);
        }
    }

    public boolean shouldRefresh() {
        boolean z10 = true;
        boolean z11 = true;
        for (IPConnStrategy iPConnStrategy : this.f4097a) {
            if (!this.f4098b.get(Integer.valueOf(iPConnStrategy.getUniqueId())).m4698b()) {
                if (iPConnStrategy.f4076a == 0) {
                    z10 = false;
                }
                z11 = false;
            }
        }
        if ((this.f4099c && z10) || z11) {
            return true;
        }
        return false;
    }

    public String toString() {
        return new ArrayList(this.f4097a).toString();
    }

    public void update(C1002l.b bVar) {
        int i10;
        Iterator<IPConnStrategy> it = this.f4097a.iterator();
        while (it.hasNext()) {
            it.next().f4078c = true;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < bVar.f4162h.length; i12++) {
            int i13 = 0;
            while (true) {
                String[] strArr = bVar.f4160f;
                if (i13 >= strArr.length) {
                    break;
                }
                m4722a(strArr[i13], 1, bVar.f4162h[i12]);
                i13++;
            }
            if (bVar.f4161g != null) {
                this.f4099c = true;
                int i14 = 0;
                while (true) {
                    String[] strArr2 = bVar.f4161g;
                    if (i14 < strArr2.length) {
                        m4722a(strArr2[i14], 0, bVar.f4162h[i12]);
                        i14++;
                    }
                }
            } else {
                this.f4099c = false;
            }
        }
        if (bVar.f4163i != null) {
            while (true) {
                C1002l.e[] eVarArr = bVar.f4163i;
                if (i11 >= eVarArr.length) {
                    break;
                }
                C1002l.e eVar = eVarArr[i11];
                String str = eVar.f4177a;
                if (C1009d.m4781c(str)) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                m4722a(str, i10, eVar.f4178b);
                i11++;
            }
        }
        ListIterator<IPConnStrategy> listIterator = this.f4097a.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().f4078c) {
                listIterator.remove();
            }
        }
        Collections.sort(this.f4097a, m4720a());
    }

    /* renamed from: a */
    private void m4722a(String str, int i10, C1002l.a aVar) {
        int m4719a = m4719a(this.f4097a, new C1000j(this, aVar, str, ConnProtocol.valueOf(aVar)));
        if (m4719a != -1) {
            IPConnStrategy iPConnStrategy = this.f4097a.get(m4719a);
            iPConnStrategy.cto = aVar.f4149c;
            iPConnStrategy.rto = aVar.f4150d;
            iPConnStrategy.heartbeat = aVar.f4152f;
            iPConnStrategy.f4076a = i10;
            iPConnStrategy.f4077b = 0;
            iPConnStrategy.f4078c = false;
            return;
        }
        IPConnStrategy m4702a = IPConnStrategy.m4702a(str, aVar);
        if (m4702a != null) {
            m4702a.f4076a = i10;
            m4702a.f4077b = 0;
            if (!this.f4098b.containsKey(Integer.valueOf(m4702a.getUniqueId()))) {
                this.f4098b.put(Integer.valueOf(m4702a.getUniqueId()), new ConnHistoryItem());
            }
            this.f4097a.add(m4702a);
        }
    }

    StrategyList(List<IPConnStrategy> list) {
        this.f4097a = new ArrayList();
        this.f4098b = new SerialLruCache(40);
        this.f4099c = false;
        this.f4100d = null;
        this.f4097a = list;
    }

    /* renamed from: a */
    private Comparator m4720a() {
        if (this.f4100d == null) {
            this.f4100d = new C1001k(this);
        }
        return this.f4100d;
    }

    /* renamed from: a */
    private static <T> int m4719a(Collection<T> collection, Predicate<T> predicate) {
        if (collection == null) {
            return -1;
        }
        Iterator<T> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext() && !predicate.apply(it.next())) {
            i10++;
        }
        if (i10 == collection.size()) {
            return -1;
        }
        return i10;
    }
}
