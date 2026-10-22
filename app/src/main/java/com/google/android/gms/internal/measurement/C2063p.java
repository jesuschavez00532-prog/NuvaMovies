package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p */
/* loaded from: classes.dex */
public final class C2063p extends AbstractC1973j {

    /* renamed from: c */
    protected final List f7987c;

    /* renamed from: d */
    protected final List f7988d;

    /* renamed from: e */
    protected C2158v4 f7989e;

    private C2063p(C2063p c2063p) {
        super(c2063p.f7823a);
        ArrayList arrayList = new ArrayList(c2063p.f7987c.size());
        this.f7987c = arrayList;
        arrayList.addAll(c2063p.f7987c);
        ArrayList arrayList2 = new ArrayList(c2063p.f7988d.size());
        this.f7988d = arrayList2;
        arrayList2.addAll(c2063p.f7988d);
        this.f7989e = c2063p.f7989e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1973j
    /* renamed from: a */
    public final InterfaceC2078q mo8107a(C2158v4 c2158v4, List list) {
        C2158v4 m9026a = this.f7989e.m9026a();
        for (int i10 = 0; i10 < this.f7987c.size(); i10++) {
            if (i10 < list.size()) {
                m9026a.m9030e((String) this.f7987c.get(i10), c2158v4.m9027b((InterfaceC2078q) list.get(i10)));
            } else {
                m9026a.m9030e((String) this.f7987c.get(i10), InterfaceC2078q.f8002Q);
            }
        }
        for (InterfaceC2078q interfaceC2078q : this.f7988d) {
            InterfaceC2078q m9027b = m9026a.m9027b(interfaceC2078q);
            if (m9027b instanceof C2093r) {
                m9027b = m9026a.m9027b(interfaceC2078q);
            }
            if (m9027b instanceof C1943h) {
                return ((C1943h) m9027b).m8476a();
            }
        }
        return InterfaceC2078q.f8002Q;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1973j, com.google.android.gms.internal.measurement.InterfaceC2078q
    /* renamed from: g */
    public final InterfaceC2078q mo8349g() {
        return new C2063p(this);
    }

    public C2063p(String str, List list, List list2, C2158v4 c2158v4) {
        super(str);
        this.f7987c = new ArrayList();
        this.f7989e = c2158v4;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f7987c.add(((InterfaceC2078q) it.next()).mo8351i());
            }
        }
        this.f7988d = new ArrayList(list2);
    }
}
