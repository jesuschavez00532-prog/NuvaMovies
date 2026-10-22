package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.dc */
/* loaded from: classes.dex */
public final class C1893dc implements InterfaceC1877cc {

    /* renamed from: a */
    public static final AbstractC2220z6 f7705a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9037a().m9042f("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.InterfaceC1877cc
    /* renamed from: a */
    public final boolean mo8194a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1877cc
    /* renamed from: e */
    public final boolean mo8195e() {
        return ((Boolean) f7705a.m9396b()).booleanValue();
    }
}
