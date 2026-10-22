package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.x9 */
/* loaded from: classes.dex */
public final class C2193x9 extends LinkedHashMap {

    /* renamed from: b */
    private static final C2193x9 f8257b;

    /* renamed from: a */
    private boolean f8258a;

    static {
        C2193x9 c2193x9 = new C2193x9();
        f8257b = c2193x9;
        c2193x9.f8258a = false;
    }

    private C2193x9() {
        this.f8258a = true;
    }

    /* renamed from: a */
    public static C2193x9 m9179a() {
        return f8257b;
    }

    /* renamed from: g */
    private static int m9180g(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC1938g9.m8415b((byte[]) obj);
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    private final void m9181h() {
        if (this.f8258a) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final C2193x9 m9182b() {
        if (isEmpty()) {
            return new C2193x9();
        }
        return new C2193x9(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9181h();
        super.clear();
    }

    /* renamed from: d */
    public final void m9183d() {
        this.f8258a = false;
    }

    /* renamed from: e */
    public final void m9184e(C2193x9 c2193x9) {
        m9181h();
        if (!c2193x9.isEmpty()) {
            putAll(c2193x9);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                equals = value.equals(obj2);
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m9185f() {
        return this.f8258a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i10 += m9180g(entry.getValue()) ^ m9180g(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m9181h();
        AbstractC1938g9.m8418e(obj);
        AbstractC1938g9.m8418e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m9181h();
        for (Object obj : map.keySet()) {
            AbstractC1938g9.m8418e(obj);
            AbstractC1938g9.m8418e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m9181h();
        return super.remove(obj);
    }

    private C2193x9(Map map) {
        super(map);
        this.f8258a = true;
    }
}
