package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1990k1;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
/* loaded from: classes.dex */
final class RunnableC2331i8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1990k1 f8692a;

    /* renamed from: b */
    final /* synthetic */ String f8693b;

    /* renamed from: c */
    final /* synthetic */ String f8694c;

    /* renamed from: d */
    final /* synthetic */ boolean f8695d;

    /* renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f8696e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2331i8(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1990k1 interfaceC1990k1, String str, String str2, boolean z10) {
        this.f8696e = appMeasurementDynamiteService;
        this.f8692a = interfaceC1990k1;
        this.f8693b = str;
        this.f8694c = str2;
        this.f8695d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8696e.f8325a.m10029L().m9499V(this.f8692a, this.f8693b, this.f8694c, this.f8695d);
    }
}
