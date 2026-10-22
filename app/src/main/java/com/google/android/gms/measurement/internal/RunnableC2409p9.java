package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1990k1;

/* renamed from: com.google.android.gms.measurement.internal.p9 */
/* loaded from: classes.dex */
final class RunnableC2409p9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1990k1 f8946a;

    /* renamed from: b */
    final /* synthetic */ String f8947b;

    /* renamed from: c */
    final /* synthetic */ String f8948c;

    /* renamed from: d */
    final /* synthetic */ AppMeasurementDynamiteService f8949d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2409p9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1990k1 interfaceC1990k1, String str, String str2) {
        this.f8949d = appMeasurementDynamiteService;
        this.f8946a = interfaceC1990k1;
        this.f8947b = str;
        this.f8948c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8949d.f8325a.m10029L().m9497T(this.f8946a, this.f8947b, this.f8948c);
    }
}
