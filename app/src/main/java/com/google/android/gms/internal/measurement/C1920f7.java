package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f7 */
/* loaded from: classes.dex */
final class C1920f7 extends AbstractC1904e7 {

    /* renamed from: a */
    private final Object f7737a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1920f7(Object obj) {
        this.f7737a = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1904e7
    /* renamed from: a */
    public final Object mo8175a() {
        return this.f7737a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1904e7
    /* renamed from: b */
    public final boolean mo8176b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1920f7) {
            return this.f7737a.equals(((C1920f7) obj).f7737a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7737a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f7737a + ")";
    }
}
