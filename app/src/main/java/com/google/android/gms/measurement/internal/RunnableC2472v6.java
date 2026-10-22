package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v6 */
/* loaded from: classes.dex */
public final class RunnableC2472v6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f9161a;

    /* renamed from: b */
    final /* synthetic */ C2461u6 f9162b;

    /* renamed from: c */
    final /* synthetic */ C2461u6 f9163c;

    /* renamed from: d */
    final /* synthetic */ long f9164d;

    /* renamed from: e */
    final /* synthetic */ C2253b7 f9165e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2472v6(C2253b7 c2253b7, Bundle bundle, C2461u6 c2461u6, C2461u6 c2461u62, long j10) {
        this.f9165e = c2253b7;
        this.f9161a = bundle;
        this.f9162b = c2461u6;
        this.f9163c = c2461u62;
        this.f9164d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2253b7.m9465w(this.f9165e, this.f9161a, this.f9162b, this.f9163c, this.f9164d);
    }
}
