package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y6 */
/* loaded from: classes.dex */
public final class RunnableC2505y6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f9235a;

    /* renamed from: b */
    final /* synthetic */ C2253b7 f9236b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2505y6(C2253b7 c2253b7, long j10) {
        this.f9236b = c2253b7;
        this.f9235a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9236b.f8714a.m10050y().m9427n(this.f9235a);
        this.f9236b.f8396e = null;
    }
}
