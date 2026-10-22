package com.google.android.gms.internal.measurement;

import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.h7 */
/* loaded from: classes.dex */
final class C1951h7 implements Serializable, InterfaceC1936g7 {

    /* renamed from: a */
    final InterfaceC1936g7 f7795a;

    /* renamed from: b */
    volatile transient boolean f7796b;

    /* renamed from: c */
    transient Object f7797c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1951h7(InterfaceC1936g7 interfaceC1936g7) {
        interfaceC1936g7.getClass();
        this.f7795a = interfaceC1936g7;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1936g7
    /* renamed from: a */
    public final Object mo8105a() {
        if (!this.f7796b) {
            synchronized (this) {
                if (!this.f7796b) {
                    Object mo8105a = this.f7795a.mo8105a();
                    this.f7797c = mo8105a;
                    this.f7796b = true;
                    return mo8105a;
                }
            }
        }
        return this.f7797c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Suppliers.memoize(");
        if (this.f7796b) {
            obj = "<supplier that returned " + this.f7797c + Operator.Operation.GREATER_THAN;
        } else {
            obj = this.f7795a;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
