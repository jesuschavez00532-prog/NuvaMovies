package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1990k1;

/* renamed from: com.google.android.gms.measurement.internal.m6 */
/* loaded from: classes.dex */
final class RunnableC2373m6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1990k1 f8834a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f8835b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2373m6(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1990k1 interfaceC1990k1) {
        this.f8835b = appMeasurementDynamiteService;
        this.f8834a = interfaceC1990k1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8835b.f8325a.m10029L().m9495R(this.f8834a);
    }
}
