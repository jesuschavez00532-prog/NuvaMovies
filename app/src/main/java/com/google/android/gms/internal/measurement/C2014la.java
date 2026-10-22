package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.la */
/* loaded from: classes.dex */
public final class C2014la {

    /* renamed from: c */
    private static final C2014la f7870c = new C2014la();

    /* renamed from: b */
    private final ConcurrentMap f7872b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC2074pa f7871a = new C2178w9();

    private C2014la() {
    }

    /* renamed from: a */
    public static C2014la m8663a() {
        return f7870c;
    }

    /* renamed from: b */
    public final InterfaceC2059oa m8664b(Class cls) {
        AbstractC1938g9.m8419f(cls, "messageType");
        InterfaceC2059oa interfaceC2059oa = (InterfaceC2059oa) this.f7872b.get(cls);
        if (interfaceC2059oa == null) {
            interfaceC2059oa = this.f7871a.mo8769a(cls);
            AbstractC1938g9.m8419f(cls, "messageType");
            AbstractC1938g9.m8419f(interfaceC2059oa, "schema");
            InterfaceC2059oa interfaceC2059oa2 = (InterfaceC2059oa) this.f7872b.putIfAbsent(cls, interfaceC2059oa);
            if (interfaceC2059oa2 != null) {
                return interfaceC2059oa2;
            }
        }
        return interfaceC2059oa;
    }
}
