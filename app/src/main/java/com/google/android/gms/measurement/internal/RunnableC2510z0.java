package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z0 */
/* loaded from: classes.dex */
public final class RunnableC2510z0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f9243a;

    /* renamed from: b */
    final /* synthetic */ C2236a2 f9244b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2510z0(C2236a2 c2236a2, long j10) {
        this.f9244b = c2236a2;
        this.f9243a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9244b.m9424q(this.f9243a);
    }
}
