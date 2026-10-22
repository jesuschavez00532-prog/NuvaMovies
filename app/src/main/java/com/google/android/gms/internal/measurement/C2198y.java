package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y */
/* loaded from: classes.dex */
public final class C2198y {

    /* renamed from: a */
    final Map f8268a = new HashMap();

    /* renamed from: b */
    final C2004l0 f8269b = new C2004l0();

    public C2198y() {
        m9194b(new C2168w());
        m9194b(new C2213z());
        m9194b(new C1833a0());
        m9194b(new C1897e0());
        m9194b(new C1974j0());
        m9194b(new C1989k0());
        m9194b(new C2019m0());
    }

    /* renamed from: a */
    public final InterfaceC2078q m9193a(C2158v4 c2158v4, InterfaceC2078q interfaceC2078q) {
        AbstractC2183x abstractC2183x;
        AbstractC2174w5.m9073c(c2158v4);
        if (interfaceC2078q instanceof C2093r) {
            C2093r c2093r = (C2093r) interfaceC2078q;
            ArrayList m8865b = c2093r.m8865b();
            String m8864a = c2093r.m8864a();
            if (this.f8268a.containsKey(m8864a)) {
                abstractC2183x = (AbstractC2183x) this.f8268a.get(m8864a);
            } else {
                abstractC2183x = this.f8269b;
            }
            return abstractC2183x.mo8080a(m8864a, c2158v4, m8865b);
        }
        return interfaceC2078q;
    }

    /* renamed from: b */
    final void m9194b(AbstractC2183x abstractC2183x) {
        Iterator it = abstractC2183x.f8243a.iterator();
        while (it.hasNext()) {
            this.f8268a.put(((EnumC2034n0) it.next()).m8714b().toString(), abstractC2183x);
        }
    }
}
