package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.hc */
/* loaded from: classes.dex */
public final class C1956hc implements InterfaceC1925fc {

    /* renamed from: a */
    public static final AbstractC2220z6 f7806a;

    /* renamed from: b */
    public static final AbstractC2220z6 f7807b;

    /* renamed from: c */
    public static final AbstractC2220z6 f7808c;

    /* renamed from: d */
    public static final AbstractC2220z6 f7809d;

    static {
        C2160v6 m9037a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9037a();
        f7806a = m9037a.m9042f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f7807b = m9037a.m9042f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f7808c = m9037a.m9042f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f7809d = m9037a.m9042f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1925fc
    /* renamed from: a */
    public final boolean mo8397a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1925fc
    /* renamed from: e */
    public final boolean mo8398e() {
        return ((Boolean) f7807b.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1925fc
    /* renamed from: f */
    public final boolean mo8399f() {
        return ((Boolean) f7808c.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1925fc
    /* renamed from: g */
    public final boolean mo8400g() {
        return ((Boolean) f7809d.m9396b()).booleanValue();
    }
}
