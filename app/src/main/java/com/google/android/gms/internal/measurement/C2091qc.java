package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.qc */
/* loaded from: classes.dex */
public final class C2091qc implements InterfaceC2076pc {

    /* renamed from: a */
    public static final AbstractC2220z6 f8027a;

    /* renamed from: b */
    public static final AbstractC2220z6 f8028b;

    /* renamed from: c */
    public static final AbstractC2220z6 f8029c;

    /* renamed from: d */
    public static final AbstractC2220z6 f8030d;

    /* renamed from: e */
    public static final AbstractC2220z6 f8031e;

    static {
        C2160v6 m9037a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9038b().m9037a();
        f8027a = m9037a.m9042f("measurement.client.global_params", true);
        f8028b = m9037a.m9042f("measurement.service.global_params_in_payload", true);
        f8029c = m9037a.m9042f("measurement.service.clear_global_params_on_uninstall", true);
        f8030d = m9037a.m9042f("measurement.service.global_params", true);
        f8031e = m9037a.m9040d("measurement.id.service.global_params", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2076pc
    /* renamed from: a */
    public final boolean mo8772a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2076pc
    /* renamed from: e */
    public final boolean mo8773e() {
        return ((Boolean) f8029c.m9396b()).booleanValue();
    }
}
