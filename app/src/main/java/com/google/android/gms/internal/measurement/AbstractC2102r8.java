package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r8 */
/* loaded from: classes.dex */
abstract class AbstractC2102r8 {

    /* renamed from: a */
    private static final AbstractC2072p8 f8039a = new C2087q8();

    /* renamed from: b */
    private static final AbstractC2072p8 f8040b;

    static {
        AbstractC2072p8 abstractC2072p8;
        try {
            abstractC2072p8 = (AbstractC2072p8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC2072p8 = null;
        }
        f8040b = abstractC2072p8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC2072p8 m8903a() {
        AbstractC2072p8 abstractC2072p8 = f8040b;
        if (abstractC2072p8 != null) {
            return abstractC2072p8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC2072p8 m8904b() {
        return f8039a;
    }
}
