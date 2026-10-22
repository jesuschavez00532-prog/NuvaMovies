package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v8 */
/* loaded from: classes.dex */
final class C2162v8 implements InterfaceC1859ba {

    /* renamed from: a */
    private static final C2162v8 f8219a = new C2162v8();

    private C2162v8() {
    }

    /* renamed from: c */
    public static C2162v8 m9044c() {
        return f8219a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1859ba
    /* renamed from: a */
    public final InterfaceC1843aa mo8140a(Class cls) {
        if (AbstractC2222z8.class.isAssignableFrom(cls)) {
            try {
                return (InterfaceC1843aa) AbstractC2222z8.m9406v(cls.asSubclass(AbstractC2222z8.class)).mo8126w(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1859ba
    /* renamed from: b */
    public final boolean mo8141b(Class cls) {
        return AbstractC2222z8.class.isAssignableFrom(cls);
    }
}
