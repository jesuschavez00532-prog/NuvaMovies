package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.nc */
/* loaded from: classes.dex */
public final class C2046nc implements InterfaceC2031mc {

    /* renamed from: a */
    public static final AbstractC2220z6 f7971a;

    /* renamed from: b */
    public static final AbstractC2220z6 f7972b;

    /* renamed from: c */
    public static final AbstractC2220z6 f7973c;

    static {
        C2160v6 m9037a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9037a();
        f7971a = m9037a.m9042f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f7972b = m9037a.m9042f("measurement.client.sessions.check_on_startup", true);
        f7973c = m9037a.m9042f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2031mc
    /* renamed from: a */
    public final boolean mo8710a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2031mc
    /* renamed from: e */
    public final boolean mo8711e() {
        return ((Boolean) f7971a.m9396b()).booleanValue();
    }
}
