package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j8 */
/* loaded from: classes.dex */
final class RunnableC2342j8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f8724a;

    /* renamed from: b */
    final /* synthetic */ C2430r8 f8725b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2342j8(C2430r8 c2430r8, long j10) {
        this.f8725b = c2430r8;
        this.f8724a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2430r8.m10064r(this.f8725b, this.f8724a);
    }
}
