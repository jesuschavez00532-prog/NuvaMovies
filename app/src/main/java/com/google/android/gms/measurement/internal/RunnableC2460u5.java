package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u5 */
/* loaded from: classes.dex */
final class RunnableC2460u5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f9120a;

    /* renamed from: b */
    final /* synthetic */ C2406p6 f9121b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2460u5(C2406p6 c2406p6, long j10) {
        this.f9121b = c2406p6;
        this.f9120a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9121b.f8714a.m10024F().f8344k.m10098b(this.f9120a);
        this.f9121b.f8714a.mo9577b().m9799q().m9700b("Session timeout duration set", Long.valueOf(this.f9120a));
    }
}
