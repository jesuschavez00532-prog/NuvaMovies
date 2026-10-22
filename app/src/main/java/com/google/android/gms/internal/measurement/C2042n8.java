package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n8 */
/* loaded from: classes.dex */
final class C2042n8 {

    /* renamed from: a */
    private final Object f7964a;

    /* renamed from: b */
    private final int f7965b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2042n8(Object obj, int i10) {
        this.f7964a = obj;
        this.f7965b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2042n8)) {
            return false;
        }
        C2042n8 c2042n8 = (C2042n8) obj;
        if (this.f7964a != c2042n8.f7964a || this.f7965b != c2042n8.f7965b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f7964a) * 65535) + this.f7965b;
    }
}
