package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0272b;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y9 */
/* loaded from: classes.dex */
final class C2208y9 {
    /* renamed from: a */
    public static final int m9361a(int i10, Object obj, Object obj2) {
        C2193x9 c2193x9 = (C2193x9) obj;
        AbstractC0272b.m941a(obj2);
        if (!c2193x9.isEmpty()) {
            Iterator it = c2193x9.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    /* renamed from: b */
    public static final Object m9362b(Object obj, Object obj2) {
        C2193x9 c2193x9 = (C2193x9) obj;
        C2193x9 c2193x92 = (C2193x9) obj2;
        if (!c2193x92.isEmpty()) {
            if (!c2193x9.m9185f()) {
                c2193x9 = c2193x9.m9182b();
            }
            c2193x9.m9184e(c2193x92);
        }
        return c2193x9;
    }
}
