package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.xb */
/* loaded from: classes.dex */
public final class C2195xb implements InterfaceC2180wb {

    /* renamed from: a */
    public static final AbstractC2220z6 f8262a;

    /* renamed from: b */
    public static final AbstractC2220z6 f8263b;

    /* renamed from: c */
    public static final AbstractC2220z6 f8264c;

    /* renamed from: d */
    public static final AbstractC2220z6 f8265d;

    static {
        C2160v6 m9037a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9037a();
        f8262a = m9037a.m9042f("measurement.client.consent_state_v1", true);
        f8263b = m9037a.m9042f("measurement.client.3p_consent_state_v1", true);
        f8264c = m9037a.m9042f("measurement.service.consent_state_v1_W36", true);
        f8265d = m9037a.m9040d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2180wb
    /* renamed from: a */
    public final long mo9086a() {
        return ((Long) f8265d.m9396b()).longValue();
    }
}
