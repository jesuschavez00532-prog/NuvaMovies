package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.c7 */
/* loaded from: classes.dex */
final class C1872c7 extends AbstractC1904e7 {

    /* renamed from: a */
    static final C1872c7 f7690a = new C1872c7();

    private C1872c7() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1904e7
    /* renamed from: a */
    public final Object mo8175a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1904e7
    /* renamed from: b */
    public final boolean mo8176b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
