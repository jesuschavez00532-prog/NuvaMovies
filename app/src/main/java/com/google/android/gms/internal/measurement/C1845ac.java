package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ac */
/* loaded from: classes.dex */
public final class C1845ac implements InterfaceC2225zb {

    /* renamed from: a */
    public static final AbstractC2220z6 f7656a;

    /* renamed from: b */
    public static final AbstractC2220z6 f7657b;

    /* renamed from: c */
    public static final AbstractC2220z6 f7658c;

    static {
        C2160v6 m9037a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9038b().m9037a();
        f7656a = m9037a.m9042f("measurement.collection.event_safelist", true);
        f7657b = m9037a.m9042f("measurement.service.store_null_safelist", true);
        f7658c = m9037a.m9042f("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2225zb
    /* renamed from: a */
    public final boolean mo8101a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2225zb
    /* renamed from: e */
    public final boolean mo8102e() {
        return ((Boolean) f7657b.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2225zb
    /* renamed from: f */
    public final boolean mo8103f() {
        return ((Boolean) f7658c.m9396b()).booleanValue();
    }
}
