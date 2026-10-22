package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ja */
/* loaded from: classes.dex */
abstract class AbstractC1984ja {

    /* renamed from: a */
    private static final C1969ia f7844a;

    /* renamed from: b */
    private static final C1969ia f7845b;

    static {
        C1969ia c1969ia;
        try {
            c1969ia = (C1969ia) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c1969ia = null;
        }
        f7844a = c1969ia;
        f7845b = new C1969ia();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1969ia m8558a() {
        return f7844a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1969ia m8559b() {
        return f7845b;
    }
}
