package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.wc */
/* loaded from: classes.dex */
public final class C2181wc implements InterfaceC2166vc {

    /* renamed from: a */
    public static final AbstractC2220z6 f8239a;

    /* renamed from: b */
    public static final AbstractC2220z6 f8240b;

    /* renamed from: c */
    public static final AbstractC2220z6 f8241c;

    /* renamed from: d */
    public static final AbstractC2220z6 f8242d;

    static {
        C2160v6 m9037a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9037a();
        f8239a = m9037a.m9040d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f8240b = m9037a.m9042f("measurement.lifecycle.app_backgrounded_tracking", true);
        f8241c = m9037a.m9042f("measurement.lifecycle.app_in_background_parameter", false);
        f8242d = m9037a.m9040d("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2166vc
    /* renamed from: a */
    public final boolean mo9056a() {
        return ((Boolean) f8241c.m9396b()).booleanValue();
    }
}
