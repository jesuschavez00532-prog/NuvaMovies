package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h9 */
/* loaded from: classes.dex */
final class RunnableC2321h9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2431r9 f8674a;

    /* renamed from: b */
    final /* synthetic */ AppMeasurementDynamiteService f8675b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2321h9(AppMeasurementDynamiteService appMeasurementDynamiteService, C2431r9 c2431r9) {
        this.f8675b = appMeasurementDynamiteService;
        this.f8674a = c2431r9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8675b.f8325a.m10026I().m9977H(this.f8674a);
    }
}
