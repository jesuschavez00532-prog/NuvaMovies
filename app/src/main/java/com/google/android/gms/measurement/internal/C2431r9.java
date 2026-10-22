package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2035n1;
import p025b5.InterfaceC1122t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r9 */
/* loaded from: classes.dex */
public final class C2431r9 implements InterfaceC1122t {

    /* renamed from: a */
    public final InterfaceC2035n1 f9046a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f9047b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2431r9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2035n1 interfaceC2035n1) {
        this.f9047b = appMeasurementDynamiteService;
        this.f9046a = interfaceC2035n1;
    }

    @Override // p025b5.InterfaceC1122t
    /* renamed from: a */
    public final void mo5089a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f9046a.mo8612h(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            C2415q4 c2415q4 = this.f9047b.f8325a;
            if (c2415q4 != null) {
                c2415q4.mo9577b().m9805w().m9700b("Event interceptor threw exception", e10);
            }
        }
    }
}
