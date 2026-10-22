package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.u3 */
/* loaded from: classes.dex */
public final class C2142u3 {

    /* renamed from: a */
    final C2198y f8141a;

    /* renamed from: b */
    final C2158v4 f8142b;

    /* renamed from: c */
    final C2158v4 f8143c;

    /* renamed from: d */
    final C2206y7 f8144d;

    public C2142u3() {
        C2198y c2198y = new C2198y();
        this.f8141a = c2198y;
        C2158v4 c2158v4 = new C2158v4(null, c2198y);
        this.f8143c = c2158v4;
        this.f8142b = c2158v4.m9026a();
        C2206y7 c2206y7 = new C2206y7();
        this.f8144d = c2206y7;
        c2158v4.m9032g("require", new C1879ce(c2206y7));
        c2206y7.m9360a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.t2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C1911ee();
            }
        });
        c2158v4.m9032g("runtime.counter", new C1958i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final InterfaceC2078q m9007a(C2158v4 c2158v4, C2129t5... c2129t5Arr) {
        InterfaceC2078q interfaceC2078q = InterfaceC2078q.f8002Q;
        for (C2129t5 c2129t5 : c2129t5Arr) {
            interfaceC2078q = AbstractC2205y6.m9358a(c2129t5);
            AbstractC2174w5.m9073c(this.f8143c);
            if ((interfaceC2078q instanceof C2093r) || (interfaceC2078q instanceof C2063p)) {
                interfaceC2078q = this.f8141a.m9193a(c2158v4, interfaceC2078q);
            }
        }
        return interfaceC2078q;
    }
}
