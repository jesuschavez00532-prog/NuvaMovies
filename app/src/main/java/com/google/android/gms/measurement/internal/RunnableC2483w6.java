package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w6 */
/* loaded from: classes.dex */
public final class RunnableC2483w6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2461u6 f9187a;

    /* renamed from: b */
    final /* synthetic */ C2461u6 f9188b;

    /* renamed from: c */
    final /* synthetic */ long f9189c;

    /* renamed from: d */
    final /* synthetic */ boolean f9190d;

    /* renamed from: e */
    final /* synthetic */ C2253b7 f9191e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2483w6(C2253b7 c2253b7, C2461u6 c2461u6, C2461u6 c2461u62, long j10, boolean z10) {
        this.f9191e = c2253b7;
        this.f9187a = c2461u6;
        this.f9188b = c2461u62;
        this.f9189c = j10;
        this.f9190d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9191e.m9460o(this.f9187a, this.f9188b, this.f9189c, this.f9190d, null);
    }
}
