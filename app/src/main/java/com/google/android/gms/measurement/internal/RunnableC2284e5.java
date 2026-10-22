package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e5 */
/* loaded from: classes.dex */
final class RunnableC2284e5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2354k9 f8571a;

    /* renamed from: b */
    final /* synthetic */ C2453t9 f8572b;

    /* renamed from: c */
    final /* synthetic */ BinderC2328i5 f8573c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2284e5(BinderC2328i5 binderC2328i5, C2354k9 c2354k9, C2453t9 c2453t9) {
        this.f8573c = binderC2328i5;
        this.f8571a = c2354k9;
        this.f8572b = c2453t9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        C2310g9 c2310g93;
        c2310g9 = this.f8573c.f8683a;
        c2310g9.m9582e();
        if (this.f8571a.m9735g() == null) {
            c2310g93 = this.f8573c.f8683a;
            c2310g93.m9604u(this.f8571a, this.f8572b);
        } else {
            c2310g92 = this.f8573c.f8683a;
            c2310g92.m9562B(this.f8571a, this.f8572b);
        }
    }
}
