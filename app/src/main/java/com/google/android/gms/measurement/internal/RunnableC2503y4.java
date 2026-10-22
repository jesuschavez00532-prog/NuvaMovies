package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y4 */
/* loaded from: classes.dex */
final class RunnableC2503y4 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2453t9 f9231a;

    /* renamed from: b */
    final /* synthetic */ BinderC2328i5 f9232b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2503y4(BinderC2328i5 binderC2328i5, C2453t9 c2453t9) {
        this.f9232b = binderC2328i5;
        this.f9231a = c2453t9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        c2310g9 = this.f9232b.f8683a;
        c2310g9.m9582e();
        c2310g92 = this.f9232b.f8683a;
        c2310g92.m9605v(this.f9231a);
    }
}
