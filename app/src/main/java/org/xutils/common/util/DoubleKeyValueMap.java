package org.xutils.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class DoubleKeyValueMap<K1, K2, V> {
    private final ConcurrentHashMap<K1, ConcurrentHashMap<K2, V>> k1_k2V_map = new ConcurrentHashMap<>();

    public void clear() {
        if (this.k1_k2V_map.size() > 0) {
            Iterator<ConcurrentHashMap<K2, V>> it = this.k1_k2V_map.values().iterator();
            while (it.hasNext()) {
                it.next().clear();
            }
            this.k1_k2V_map.clear();
        }
    }

    public boolean containsKey(K1 k12, K2 k22) {
        ConcurrentHashMap<K2, V> concurrentHashMap;
        if (!this.k1_k2V_map.containsKey(k12) || (concurrentHashMap = this.k1_k2V_map.get(k12)) == null) {
            return false;
        }
        return concurrentHashMap.containsKey(k22);
    }

    public ConcurrentHashMap<K2, V> get(K1 k12) {
        return this.k1_k2V_map.get(k12);
    }

    public Collection<V> getAllValues(K1 k12) {
        ConcurrentHashMap<K2, V> concurrentHashMap = this.k1_k2V_map.get(k12);
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.values();
    }

    public Set<K1> getFirstKeys() {
        return this.k1_k2V_map.keySet();
    }

    public void put(K1 k12, K2 k22, V v10) {
        if (k12 != null && k22 != null && v10 != null) {
            if (this.k1_k2V_map.containsKey(k12)) {
                ConcurrentHashMap<K2, V> concurrentHashMap = this.k1_k2V_map.get(k12);
                if (concurrentHashMap != null) {
                    concurrentHashMap.put(k22, v10);
                    return;
                }
                ConcurrentHashMap<K2, V> concurrentHashMap2 = new ConcurrentHashMap<>();
                concurrentHashMap2.put(k22, v10);
                this.k1_k2V_map.put(k12, concurrentHashMap2);
                return;
            }
            ConcurrentHashMap<K2, V> concurrentHashMap3 = new ConcurrentHashMap<>();
            concurrentHashMap3.put(k22, v10);
            this.k1_k2V_map.put(k12, concurrentHashMap3);
        }
    }

    public void remove(K1 k12) {
        this.k1_k2V_map.remove(k12);
    }

    public int size() {
        int i10 = 0;
        if (this.k1_k2V_map.size() == 0) {
            return 0;
        }
        Iterator<ConcurrentHashMap<K2, V>> it = this.k1_k2V_map.values().iterator();
        while (it.hasNext()) {
            i10 += it.next().size();
        }
        return i10;
    }

    public V get(K1 k12, K2 k22) {
        ConcurrentHashMap<K2, V> concurrentHashMap = this.k1_k2V_map.get(k12);
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(k22);
    }

    public void remove(K1 k12, K2 k22) {
        ConcurrentHashMap<K2, V> concurrentHashMap = this.k1_k2V_map.get(k12);
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(k22);
        }
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            this.k1_k2V_map.remove(k12);
        }
    }

    public Collection<V> getAllValues() {
        Collection<V> values;
        Set<K1> keySet = this.k1_k2V_map.keySet();
        if (keySet == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<K1> it = keySet.iterator();
        while (it.hasNext()) {
            ConcurrentHashMap<K2, V> concurrentHashMap = this.k1_k2V_map.get(it.next());
            if (concurrentHashMap != null && (values = concurrentHashMap.values()) != null) {
                arrayList.addAll(values);
            }
        }
        return arrayList;
    }

    public boolean containsKey(K1 k12) {
        return this.k1_k2V_map.containsKey(k12);
    }
}
