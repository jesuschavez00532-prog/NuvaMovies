package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.y7 */
/* loaded from: classes.dex */
final class RunnableC2506y7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ServiceConnectionC2242a8 f9237a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2506y7(ServiceConnectionC2242a8 serviceConnectionC2242a8) {
        this.f9237a = serviceConnectionC2242a8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2254b8 c2254b8 = this.f9237a.f8366c;
        Context mo9584f = c2254b8.f8714a.mo9584f();
        this.f9237a.f8366c.f8714a.mo9580d();
        C2254b8.m9487M(c2254b8, new ComponentName(mo9584f, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
