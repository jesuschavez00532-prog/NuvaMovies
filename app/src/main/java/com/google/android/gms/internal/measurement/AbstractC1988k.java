package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1988k {
    /* renamed from: a */
    public static InterfaceC2078q m8562a(InterfaceC2018m interfaceC2018m, InterfaceC2078q interfaceC2078q, C2158v4 c2158v4, List list) {
        if (interfaceC2018m.mo8348c(interfaceC2078q.mo8351i())) {
            InterfaceC2078q mo8356p = interfaceC2018m.mo8356p(interfaceC2078q.mo8351i());
            if (mo8356p instanceof AbstractC1973j) {
                return ((AbstractC1973j) mo8356p).mo8107a(c2158v4, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC2078q.mo8351i()));
        }
        if ("hasOwnProperty".equals(interfaceC2078q.mo8351i())) {
            AbstractC2174w5.m9078h("hasOwnProperty", 1, list);
            if (interfaceC2018m.mo8348c(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8351i())) {
                return InterfaceC2078q.f8007a0;
            }
            return InterfaceC2078q.f8008b0;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC2078q.mo8351i()));
    }

    /* renamed from: b */
    public static Iterator m8563b(Map map) {
        return new C2003l(map.keySet().iterator());
    }
}
