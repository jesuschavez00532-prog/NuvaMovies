package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.fe */
/* loaded from: classes.dex */
public final class C1927fe {

    /* renamed from: a */
    final TreeMap f7752a = new TreeMap();

    /* renamed from: b */
    final TreeMap f7753b = new TreeMap();

    /* renamed from: c */
    private static final int m8401c(C2158v4 c2158v4, C2063p c2063p, InterfaceC2078q interfaceC2078q) {
        InterfaceC2078q mo8107a = c2063p.mo8107a(c2158v4, Collections.singletonList(interfaceC2078q));
        if (mo8107a instanceof C1958i) {
            return AbstractC2174w5.m9072b(mo8107a.mo8350h().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void m8402a(String str, int i10, C2063p c2063p, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f7753b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f7752a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c2063p);
    }

    /* renamed from: b */
    public final void m8403b(C2158v4 c2158v4, C1864c c1864c) {
        C2118s9 c2118s9 = new C2118s9(c1864c);
        for (Integer num : this.f7752a.keySet()) {
            C1848b clone = c1864c.m8154b().clone();
            int m8401c = m8401c(c2158v4, (C2063p) this.f7752a.get(num), c2118s9);
            if (m8401c == 2 || m8401c == -1) {
                c1864c.m8158f(clone);
            }
        }
        Iterator it = this.f7753b.keySet().iterator();
        while (it.hasNext()) {
            m8401c(c2158v4, (C2063p) this.f7753b.get((Integer) it.next()), c2118s9);
        }
    }
}
