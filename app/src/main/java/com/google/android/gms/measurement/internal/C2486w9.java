package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1870c5;
import com.google.android.gms.internal.measurement.C1886d5;
import com.google.android.gms.internal.measurement.C1902e5;
import com.google.android.gms.internal.measurement.C1909ec;
import com.google.android.gms.internal.measurement.C1918f5;
import com.google.android.gms.internal.measurement.C1963i4;
import com.google.android.gms.internal.measurement.C1978j4;
import com.google.android.gms.internal.measurement.C1993k4;
import com.google.android.gms.internal.measurement.C2008l4;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p025b5.AbstractC1107f0;
import p214l.C5303a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w9 */
/* loaded from: classes.dex */
public final class C2486w9 {

    /* renamed from: a */
    private String f9195a;

    /* renamed from: b */
    private boolean f9196b;

    /* renamed from: c */
    private C1886d5 f9197c;

    /* renamed from: d */
    private BitSet f9198d;

    /* renamed from: e */
    private BitSet f9199e;

    /* renamed from: f */
    private Map f9200f;

    /* renamed from: g */
    private Map f9201g;

    /* renamed from: h */
    final /* synthetic */ C2245b f9202h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2486w9(C2245b c2245b, String str, AbstractC1107f0 abstractC1107f0) {
        this.f9202h = c2245b;
        this.f9195a = str;
        this.f9196b = true;
        this.f9198d = new BitSet();
        this.f9199e = new BitSet();
        this.f9200f = new C5303a();
        this.f9201g = new C5303a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ BitSet m10102b(C2486w9 c2486w9) {
        return c2486w9.f9198d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1978j4 m10103a(int i10) {
        ArrayList arrayList;
        List list;
        C1963i4 m8547y = C1978j4.m8547y();
        m8547y.m8518s(i10);
        m8547y.m8520u(this.f9196b);
        C1886d5 c1886d5 = this.f9197c;
        if (c1886d5 != null) {
            m8547y.m8521v(c1886d5);
        }
        C1870c5 m8222C = C1886d5.m8222C();
        m8222C.m8167t(C2343j9.m9670H(this.f9198d));
        m8222C.m8169v(C2343j9.m9670H(this.f9199e));
        Map map = this.f9200f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            Iterator it = this.f9200f.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                Long l10 = (Long) this.f9200f.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    C1993k4 m8617z = C2008l4.m8617z();
                    m8617z.m8577t(intValue);
                    m8617z.m8576s(l10.longValue());
                    arrayList2.add((C2008l4) m8617z.m9176o());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            m8222C.m8166s(arrayList);
        }
        Map map2 = this.f9201g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f9201g.keySet()) {
                C1902e5 m8377A = C1918f5.m8377A();
                m8377A.m8286t(num.intValue());
                List list2 = (List) this.f9201g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    m8377A.m8285s(list2);
                }
                arrayList3.add((C1918f5) m8377A.m9176o());
            }
            list = arrayList3;
        }
        m8222C.m8168u(list);
        m8547y.m8519t(m8222C);
        return (C1978j4) m8547y.m9176o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m10104c(AbstractC2519z9 abstractC2519z9) {
        int mo9448a = abstractC2519z9.mo9448a();
        Boolean bool = abstractC2519z9.f9263c;
        if (bool != null) {
            this.f9199e.set(mo9448a, bool.booleanValue());
        }
        Boolean bool2 = abstractC2519z9.f9264d;
        if (bool2 != null) {
            this.f9198d.set(mo9448a, bool2.booleanValue());
        }
        if (abstractC2519z9.f9265e != null) {
            Map map = this.f9200f;
            Integer valueOf = Integer.valueOf(mo9448a);
            Long l10 = (Long) map.get(valueOf);
            long longValue = abstractC2519z9.f9265e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f9200f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC2519z9.f9266f != null) {
            Map map2 = this.f9201g;
            Integer valueOf2 = Integer.valueOf(mo9448a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f9201g.put(valueOf2, list);
            }
            if (abstractC2519z9.mo9450c()) {
                list.clear();
            }
            C1909ec.m8325c();
            C2311h m10051z = this.f9202h.f8714a.m10051z();
            String str = this.f9195a;
            C2249b3 c2249b3 = AbstractC2260c3.f8444Y;
            if (m10051z.m9614B(str, c2249b3) && abstractC2519z9.mo9449b()) {
                list.clear();
            }
            C1909ec.m8325c();
            if (this.f9202h.f8714a.m10051z().m9614B(this.f9195a, c2249b3)) {
                Long valueOf3 = Long.valueOf(abstractC2519z9.f9266f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(abstractC2519z9.f9266f.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2486w9(C2245b c2245b, String str, C1886d5 c1886d5, BitSet bitSet, BitSet bitSet2, Map map, Map map2, AbstractC1107f0 abstractC1107f0) {
        this.f9202h = c2245b;
        this.f9195a = str;
        this.f9198d = bitSet;
        this.f9199e = bitSet2;
        this.f9200f = map;
        this.f9201g = new C5303a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f9201g.put(num, arrayList);
        }
        this.f9196b = false;
        this.f9197c = c1886d5;
    }
}
