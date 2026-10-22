package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.tc */
/* loaded from: classes.dex */
public final class C2136tc implements InterfaceC2121sc {

    /* renamed from: a */
    public static final AbstractC2220z6 f8127a;

    /* renamed from: b */
    public static final AbstractC2220z6 f8128b;

    /* renamed from: c */
    public static final AbstractC2220z6 f8129c;

    /* renamed from: d */
    public static final AbstractC2220z6 f8130d;

    static {
        C2160v6 m9037a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9037a();
        f8127a = m9037a.m9042f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f8128b = m9037a.m9042f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f8129c = m9037a.m9042f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f8130d = m9037a.m9040d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2121sc
    /* renamed from: a */
    public final boolean mo8951a() {
        return ((Boolean) f8129c.m9396b()).booleanValue();
    }
}
