package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.zc */
/* loaded from: classes.dex */
public final class C2226zc implements InterfaceC2211yc {

    /* renamed from: a */
    public static final AbstractC2220z6 f8311a;

    /* renamed from: b */
    public static final AbstractC2220z6 f8312b;

    /* renamed from: c */
    public static final AbstractC2220z6 f8313c;

    /* renamed from: d */
    public static final AbstractC2220z6 f8314d;

    /* renamed from: e */
    public static final AbstractC2220z6 f8315e;

    static {
        C2160v6 m9037a = new C2160v6(AbstractC2040n6.m8736a("com.google.android.gms.measurement")).m9037a();
        f8311a = m9037a.m9042f("measurement.test.boolean_flag", false);
        f8312b = m9037a.m9039c("measurement.test.double_flag", -3.0d);
        f8313c = m9037a.m9040d("measurement.test.int_flag", -2L);
        f8314d = m9037a.m9040d("measurement.test.long_flag", -1L);
        f8315e = m9037a.m9041e("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2211yc
    /* renamed from: a */
    public final double mo9367a() {
        return ((Double) f8312b.m9396b()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2211yc
    /* renamed from: b */
    public final boolean mo9368b() {
        return ((Boolean) f8311a.m9396b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2211yc
    /* renamed from: e */
    public final long mo9369e() {
        return ((Long) f8313c.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2211yc
    /* renamed from: f */
    public final long mo9370f() {
        return ((Long) f8314d.m9396b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2211yc
    /* renamed from: g */
    public final String mo9371g() {
        return (String) f8315e.m9396b();
    }
}
