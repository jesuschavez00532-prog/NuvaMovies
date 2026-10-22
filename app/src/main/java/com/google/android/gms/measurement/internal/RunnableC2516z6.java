package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z6 */
/* loaded from: classes.dex */
public final class RunnableC2516z6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2461u6 f9255a;

    /* renamed from: b */
    final /* synthetic */ long f9256b;

    /* renamed from: c */
    final /* synthetic */ C2253b7 f9257c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2516z6(C2253b7 c2253b7, C2461u6 c2461u6, long j10) {
        this.f9257c = c2253b7;
        this.f9255a = c2461u6;
        this.f9256b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9257c.m9461p(this.f9255a, false, this.f9256b);
        C2253b7 c2253b7 = this.f9257c;
        c2253b7.f8396e = null;
        c2253b7.f8714a.m10029L().m9507u(null);
    }
}
