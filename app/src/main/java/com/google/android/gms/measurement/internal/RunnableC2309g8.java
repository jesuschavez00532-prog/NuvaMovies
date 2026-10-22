package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g8 */
/* loaded from: classes.dex */
final class RunnableC2309g8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2310g9 f8619a;

    /* renamed from: b */
    final /* synthetic */ Runnable f8620b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2309g8(C2320h8 c2320h8, C2310g9 c2310g9, Runnable runnable) {
        this.f8619a = c2310g9;
        this.f8620b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8619a.m9582e();
        this.f8619a.m9595l0(this.f8620b);
        this.f8619a.m9563C();
    }
}
