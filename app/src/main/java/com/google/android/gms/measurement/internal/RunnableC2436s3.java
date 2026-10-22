package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s3 */
/* loaded from: classes.dex */
final class RunnableC2436s3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f9053a;

    /* renamed from: b */
    final /* synthetic */ C2447t3 f9054b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2436s3(C2447t3 c2447t3, boolean z10) {
        this.f9054b = c2447t3;
        this.f9053a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2310g9 c2310g9;
        c2310g9 = this.f9054b.f9072a;
        c2310g9.m9598o(this.f9053a);
    }
}
