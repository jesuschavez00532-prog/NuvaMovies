package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1990k1;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
/* loaded from: classes.dex */
final class RunnableC2330i7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1990k1 f8688a;

    /* renamed from: b */
    final /* synthetic */ C2465v f8689b;

    /* renamed from: c */
    final /* synthetic */ String f8690c;

    /* renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f8691d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2330i7(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1990k1 interfaceC1990k1, C2465v c2465v, String str) {
        this.f8691d = appMeasurementDynamiteService;
        this.f8688a = interfaceC1990k1;
        this.f8689b = c2465v;
        this.f8690c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8691d.f8325a.m10029L().m9502p(this.f8688a, this.f8689b, this.f8690c);
    }
}
