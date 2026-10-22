package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l7 */
/* loaded from: classes.dex */
public final class C2363l7 extends AbstractC2388o {

    /* renamed from: e */
    final /* synthetic */ C2254b8 f8782e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2363l7(C2254b8 c2254b8, InterfaceC2361l5 interfaceC2361l5) {
        super(interfaceC2361l5);
        this.f8782e = c2254b8;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2388o
    /* renamed from: c */
    public final void mo9785c() {
        C2254b8 c2254b8 = this.f8782e;
        c2254b8.mo9428h();
        if (!c2254b8.m9512z()) {
            return;
        }
        c2254b8.f8714a.mo9577b().m9804v().m9699a("Inactivity, disconnecting from the service");
        c2254b8.m9494Q();
    }
}
