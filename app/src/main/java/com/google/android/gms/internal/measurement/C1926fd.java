package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fd */
/* loaded from: classes.dex */
public final class C1926fd implements InterfaceC1910ed {

    /* renamed from: a */
    public static final AbstractC2220z6 f7738a;

    /* renamed from: b */
    public static final AbstractC2220z6 f7739b;

    /* renamed from: c */
    public static final AbstractC2220z6 f7740c;

    /* renamed from: d */
    public static final AbstractC2220z6 f7741d;

    /* renamed from: e */
    public static final AbstractC2220z6 f7742e;

    /* renamed from: f */
    public static final AbstractC2220z6 f7743f;

    /* renamed from: g */
    public static final AbstractC2220z6 f7744g;

    /* renamed from: h */
    public static final AbstractC2220z6 f7745h;

    /* renamed from: i */
    public static final AbstractC2220z6 f7746i;

    /* renamed from: j */
    public static final AbstractC2220z6 f7747j;

    /* renamed from: k */
    public static final AbstractC2220z6 f7748k;

    /* renamed from: l */
    public static final AbstractC2220z6 f7749l;

    /* renamed from: m */
    public static final AbstractC2220z6 f7750m;

    /* renamed from: n */
    public static final AbstractC2220z6 f7751n;

    static {
        C2160v6 m9037a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9038b().m9037a();
        f7738a = m9037a.m9042f("measurement.redaction.app_instance_id", true);
        f7739b = m9037a.m9042f("measurement.redaction.client_ephemeral_aiid_generation", true);
        f7740c = m9037a.m9042f("measurement.redaction.config_redacted_fields", true);
        f7741d = m9037a.m9042f("measurement.redaction.device_info", true);
        f7742e = m9037a.m9042f("measurement.redaction.e_tag", true);
        f7743f = m9037a.m9042f("measurement.redaction.enhanced_uid", true);
        f7744g = m9037a.m9042f("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f7745h = m9037a.m9042f("measurement.redaction.google_signals", true);
        f7746i = m9037a.m9042f("measurement.redaction.no_aiid_in_config_request", true);
        f7747j = m9037a.m9042f("measurement.redaction.retain_major_os_version", true);
        f7748k = m9037a.m9042f("measurement.redaction.scion_payload_generator", true);
        f7749l = m9037a.m9042f("measurement.redaction.upload_redacted_fields", true);
        f7750m = m9037a.m9042f("measurement.redaction.upload_subdomain_override", true);
        f7751n = m9037a.m9042f("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: a */
    public final boolean mo8330a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: b */
    public final boolean mo8331b() {
        return ((Boolean) f7741d.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: c */
    public final boolean mo8332c() {
        return ((Boolean) f7750m.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: d */
    public final boolean mo8333d() {
        return ((Boolean) f7742e.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: e */
    public final boolean mo8334e() {
        return ((Boolean) f7738a.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: f */
    public final boolean mo8335f() {
        return ((Boolean) f7739b.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: g */
    public final boolean mo8336g() {
        return ((Boolean) f7740c.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: h */
    public final boolean mo8337h() {
        return ((Boolean) f7744g.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: i */
    public final boolean mo8338i() {
        return ((Boolean) f7745h.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: j */
    public final boolean mo8339j() {
        return ((Boolean) f7743f.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: k */
    public final boolean mo8340k() {
        return ((Boolean) f7748k.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: l */
    public final boolean mo8341l() {
        return ((Boolean) f7746i.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: m */
    public final boolean mo8342m() {
        return ((Boolean) f7747j.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: n */
    public final boolean mo8343n() {
        return ((Boolean) f7751n.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1910ed
    /* renamed from: o */
    public final boolean mo8344o() {
        return ((Boolean) f7749l.m9396b()).booleanValue();
    }
}
