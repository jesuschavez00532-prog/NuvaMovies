package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2035n1;
import p025b5.InterfaceC1123u;

/* renamed from: com.google.android.gms.measurement.internal.s9 */
/* loaded from: classes.dex */
final class C2442s9 implements InterfaceC1123u {

    /* renamed from: a */
    public final InterfaceC2035n1 f9066a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f9067b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2442s9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2035n1 interfaceC2035n1) {
        this.f9067b = appMeasurementDynamiteService;
        this.f9066a = interfaceC2035n1;
    }

    @Override // p025b5.InterfaceC1123u
    /* renamed from: a */
    public final void mo5090a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f9066a.mo8612h(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            C2415q4 c2415q4 = this.f9067b.f8325a;
            if (c2415q4 != null) {
                c2415q4.mo9577b().m9805w().m9700b("Event listener threw exception", e10);
            }
        }
    }
}
