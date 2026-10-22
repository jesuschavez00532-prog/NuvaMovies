package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.jd */
/* loaded from: classes.dex */
public final class C1987jd implements InterfaceC1972id {

    /* renamed from: a */
    public static final AbstractC2220z6 f7846a;

    /* renamed from: b */
    public static final AbstractC2220z6 f7847b;

    static {
        C2160v6 m9037a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9038b().m9037a();
        f7846a = m9037a.m9042f("measurement.collection.enable_session_stitching_token.client.dev", false);
        f7847b = m9037a.m9042f("measurement.collection.enable_session_stitching_token.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1972id
    /* renamed from: a */
    public final boolean mo8535a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1972id
    /* renamed from: e */
    public final boolean mo8536e() {
        return ((Boolean) f7846a.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1972id
    /* renamed from: f */
    public final boolean mo8537f() {
        return ((Boolean) f7847b.m9396b()).booleanValue();
    }
}
