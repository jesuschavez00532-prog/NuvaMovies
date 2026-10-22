package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.t4 */
/* loaded from: classes.dex */
final class RunnableC2448t4 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2267d f9075a;

    /* renamed from: b */
    final /* synthetic */ BinderC2328i5 f9076b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2448t4(BinderC2328i5 binderC2328i5, C2267d c2267d) {
        this.f9076b = binderC2328i5;
        this.f9075a = c2267d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        C2310g9 c2310g93;
        c2310g9 = this.f9076b.f8683a;
        c2310g9.m9582e();
        if (this.f9075a.f8523c.m9735g() == null) {
            c2310g93 = this.f9076b.f8683a;
            c2310g93.m9602s(this.f9075a);
        } else {
            c2310g92 = this.f9076b.f8683a;
            c2310g92.m9608y(this.f9075a);
        }
    }
}
