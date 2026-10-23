package p043ce;

import be.C1318n;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.c0 */
/* loaded from: classes3.dex */
public abstract class AbstractC1487c0 extends AbstractC1485b0 {
    /* renamed from: d */
    public static final Map m6936d() {
        C1511w c1511w = C1511w.f5685a;
        AbstractC5868k.m23672d(c1511w, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c1511w;
    }

    /* renamed from: e */
    public static HashMap m6937e(C1318n... c1318nArr) {
        AbstractC5868k.m23674f(c1318nArr, "pairs");
        HashMap hashMap = new HashMap(AbstractC1514z.m7033a(c1318nArr.length));
        m6940h(hashMap, c1318nArr);
        return hashMap;
    }

    /* renamed from: f */
    public static final Map m6938f(Map map) {
        AbstractC5868k.m23674f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                return AbstractC1485b0.m6934c(map);
            }
            return map;
        }
        return m6936d();
    }

    /* renamed from: g */
    public static final void m6939g(Map map, Iterable iterable) {
        AbstractC5868k.m23674f(map, "<this>");
        AbstractC5868k.m23674f(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1318n c1318n = (C1318n) it.next();
            map.put(c1318n.m5967a(), c1318n.m5968b());
        }
    }

    /* renamed from: h */
    public static final void m6940h(Map map, C1318n[] c1318nArr) {
        AbstractC5868k.m23674f(map, "<this>");
        AbstractC5868k.m23674f(c1318nArr, "pairs");
        for (C1318n c1318n : c1318nArr) {
            map.put(c1318n.m5967a(), c1318n.m5968b());
        }
    }

    /* renamed from: i */
    public static Map m6941i(Iterable iterable) {
        Object next = null;
        AbstractC5868k.m23674f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return m6942j(iterable, new LinkedHashMap(AbstractC1514z.m7033a(collection.size())));
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return AbstractC1485b0.m6933b((C1318n) next);
            }
            return m6936d();
        }
        return m6938f(m6942j(iterable, new LinkedHashMap()));
    }

    /* renamed from: j */
    public static final Map m6942j(Iterable iterable, Map map) {
        AbstractC5868k.m23674f(iterable, "<this>");
        AbstractC5868k.m23674f(map, "destination");
        m6939g(map, iterable);
        return map;
    }
}
