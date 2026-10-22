package com.google.android.gms.internal.measurement;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.measurement.y5 */
/* loaded from: classes.dex */
final class C2204y5 extends AbstractC2175w6 {

    /* renamed from: a */
    private final Context f8282a;

    /* renamed from: b */
    private final InterfaceC1936g7 f8283b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2204y5(Context context, InterfaceC1936g7 interfaceC1936g7) {
        if (context != null) {
            this.f8282a = context;
            this.f8283b = interfaceC1936g7;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2175w6
    /* renamed from: a */
    public final Context mo9083a() {
        return this.f8282a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2175w6
    /* renamed from: b */
    public final InterfaceC1936g7 mo9084b() {
        return this.f8283b;
    }

    public final boolean equals(Object obj) {
        InterfaceC1936g7 interfaceC1936g7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2175w6) {
            AbstractC2175w6 abstractC2175w6 = (AbstractC2175w6) obj;
            if (this.f8282a.equals(abstractC2175w6.mo9083a()) && ((interfaceC1936g7 = this.f8283b) != null ? interfaceC1936g7.equals(abstractC2175w6.mo9084b()) : abstractC2175w6.mo9084b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f8282a.hashCode() ^ 1000003) * 1000003;
        InterfaceC1936g7 interfaceC1936g7 = this.f8283b;
        if (interfaceC1936g7 == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC1936g7.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f8282a.toString() + ", hermeticFileOverrides=" + String.valueOf(this.f8283b) + "}";
    }
}
