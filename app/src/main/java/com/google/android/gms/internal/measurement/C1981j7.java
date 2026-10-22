package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.j7 */
/* loaded from: classes.dex */
final class C1981j7 implements Serializable, InterfaceC1936g7 {

    /* renamed from: a */
    final Object f7829a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1981j7(Object obj) {
        this.f7829a = obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1936g7
    /* renamed from: a */
    public final Object mo8105a() {
        return this.f7829a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1981j7)) {
            return false;
        }
        Object obj2 = this.f7829a;
        Object obj3 = ((C1981j7) obj).f7829a;
        if (obj2 != obj3 && !obj2.equals(obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7829a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f7829a + ")";
    }
}
