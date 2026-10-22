package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y6 */
/* loaded from: classes.dex */
public abstract class AbstractC2205y6 {
    /* renamed from: a */
    public static InterfaceC2078q m9358a(C2129t5 c2129t5) {
        if (c2129t5 == null) {
            return InterfaceC2078q.f8002Q;
        }
        int m8960G = c2129t5.m8960G() - 1;
        if (m8960G != 1) {
            if (m8960G != 2) {
                if (m8960G != 3) {
                    if (m8960G == 4) {
                        List m8955B = c2129t5.m8955B();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = m8955B.iterator();
                        while (it.hasNext()) {
                            arrayList.add(m9358a((C2129t5) it.next()));
                        }
                        return new C2093r(c2129t5.m8962z(), arrayList);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                }
                if (c2129t5.m8957D()) {
                    return new C1928g(Boolean.valueOf(c2129t5.m8956C()));
                }
                return new C1928g(null);
            }
            if (c2129t5.m8958E()) {
                return new C1958i(Double.valueOf(c2129t5.m8961x()));
            }
            return new C1958i(null);
        }
        if (c2129t5.m8959F()) {
            return new C2138u(c2129t5.m8954A());
        }
        return InterfaceC2078q.f8009c0;
    }

    /* renamed from: b */
    public static InterfaceC2078q m9359b(Object obj) {
        if (obj == null) {
            return InterfaceC2078q.f8003R;
        }
        if (obj instanceof String) {
            return new C2138u((String) obj);
        }
        if (obj instanceof Double) {
            return new C1958i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1958i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1958i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1928g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C2033n c2033n = new C2033n();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                InterfaceC2078q m9359b = m9359b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c2033n.mo8354n((String) obj2, m9359b);
                }
            }
            return c2033n;
        }
        if (obj instanceof List) {
            C1912f c1912f = new C1912f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1912f.m8346B(c1912f.m8358t(), m9359b(it.next()));
            }
            return c1912f;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
