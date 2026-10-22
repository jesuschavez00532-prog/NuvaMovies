package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
/* loaded from: classes.dex */
final class RunnableC2262c5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2465v f8500a;

    /* renamed from: b */
    final /* synthetic */ String f8501b;

    /* renamed from: c */
    final /* synthetic */ BinderC2328i5 f8502c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2262c5(BinderC2328i5 binderC2328i5, C2465v c2465v, String str) {
        this.f8502c = binderC2328i5;
        this.f8500a = c2465v;
        this.f8501b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        c2310g9 = this.f8502c.f8683a;
        c2310g9.m9582e();
        c2310g92 = this.f8502c.f8683a;
        c2310g92.m9593k(this.f8500a, this.f8501b);
    }
}
