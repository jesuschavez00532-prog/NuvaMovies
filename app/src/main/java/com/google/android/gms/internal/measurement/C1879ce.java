package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.ce */
/* loaded from: classes.dex */
public final class C1879ce extends AbstractC1973j {

    /* renamed from: c */
    private final C2206y7 f7696c;

    /* renamed from: d */
    final Map f7697d;

    public C1879ce(C2206y7 c2206y7) {
        super("require");
        this.f7697d = new HashMap();
        this.f7696c = c2206y7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1973j
    /* renamed from: a */
    public final InterfaceC2078q mo8107a(C2158v4 c2158v4, List list) {
        InterfaceC2078q interfaceC2078q;
        AbstractC2174w5.m9078h("require", 1, list);
        String mo8351i = c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8351i();
        if (this.f7697d.containsKey(mo8351i)) {
            return (InterfaceC2078q) this.f7697d.get(mo8351i);
        }
        C2206y7 c2206y7 = this.f7696c;
        if (c2206y7.f8284a.containsKey(mo8351i)) {
            try {
                interfaceC2078q = (InterfaceC2078q) ((Callable) c2206y7.f8284a.get(mo8351i)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(mo8351i)));
            }
        } else {
            interfaceC2078q = InterfaceC2078q.f8002Q;
        }
        if (interfaceC2078q instanceof AbstractC1973j) {
            this.f7697d.put(mo8351i, (AbstractC1973j) interfaceC2078q);
        }
        return interfaceC2078q;
    }
}
