package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.s4 */
/* loaded from: classes.dex */
final class RunnableC2437s4 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2267d f9055a;

    /* renamed from: b */
    final /* synthetic */ C2453t9 f9056b;

    /* renamed from: c */
    final /* synthetic */ BinderC2328i5 f9057c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2437s4(BinderC2328i5 binderC2328i5, C2267d c2267d, C2453t9 c2453t9) {
        this.f9057c = binderC2328i5;
        this.f9055a = c2267d;
        this.f9056b = c2453t9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        C2310g9 c2310g93;
        c2310g9 = this.f9057c.f8683a;
        c2310g9.m9582e();
        if (this.f9055a.f8523c.m9735g() == null) {
            c2310g93 = this.f9057c.f8683a;
            c2310g93.m9603t(this.f9055a, this.f9056b);
        } else {
            c2310g92 = this.f9057c.f8683a;
            c2310g92.m9609z(this.f9055a, this.f9056b);
        }
    }
}
