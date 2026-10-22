package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1990k1;

/* renamed from: com.google.android.gms.measurement.internal.q9 */
/* loaded from: classes.dex */
final class RunnableC2420q9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1990k1 f9012a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f9013b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2420q9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1990k1 interfaceC1990k1) {
        this.f9013b = appMeasurementDynamiteService;
        this.f9012a = interfaceC1990k1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9013b.f8325a.m10031N().m9916D(this.f9012a, this.f9013b.f8325a.m10043n());
    }
}
