package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z9 */
/* loaded from: classes.dex */
abstract class AbstractC2223z9 {

    /* renamed from: a */
    private static final C2208y9 f8308a;

    /* renamed from: b */
    private static final C2208y9 f8309b;

    static {
        C2208y9 c2208y9;
        try {
            c2208y9 = (C2208y9) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c2208y9 = null;
        }
        f8308a = c2208y9;
        f8309b = new C2208y9();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2208y9 m9409a() {
        return f8308a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2208y9 m9410b() {
        return f8309b;
    }
}
