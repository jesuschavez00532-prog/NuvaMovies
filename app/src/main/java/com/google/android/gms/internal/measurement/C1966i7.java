package com.google.android.gms.internal.measurement;

import com.raizlabs.android.dbflow.sql.language.Operator;

/* renamed from: com.google.android.gms.internal.measurement.i7 */
/* loaded from: classes.dex */
final class C1966i7 implements InterfaceC1936g7 {

    /* renamed from: a */
    volatile InterfaceC1936g7 f7818a;

    /* renamed from: b */
    volatile boolean f7819b;

    /* renamed from: c */
    Object f7820c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1966i7(InterfaceC1936g7 interfaceC1936g7) {
        interfaceC1936g7.getClass();
        this.f7818a = interfaceC1936g7;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1936g7
    /* renamed from: a */
    public final Object mo8105a() {
        if (!this.f7819b) {
            synchronized (this) {
                if (!this.f7819b) {
                    InterfaceC1936g7 interfaceC1936g7 = this.f7818a;
                    interfaceC1936g7.getClass();
                    Object mo8105a = interfaceC1936g7.mo8105a();
                    this.f7820c = mo8105a;
                    this.f7819b = true;
                    this.f7818a = null;
                    return mo8105a;
                }
            }
        }
        return this.f7820c;
    }

    public final String toString() {
        Object obj = this.f7818a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f7820c + Operator.Operation.GREATER_THAN;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
