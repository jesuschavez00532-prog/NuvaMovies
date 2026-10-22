package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
/* loaded from: classes.dex */
final class RunnableC2251b5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2465v f8389a;

    /* renamed from: b */
    final /* synthetic */ C2453t9 f8390b;

    /* renamed from: c */
    final /* synthetic */ BinderC2328i5 f8391c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2251b5(BinderC2328i5 binderC2328i5, C2465v c2465v, C2453t9 c2453t9) {
        this.f8391c = binderC2328i5;
        this.f8389a = c2465v;
        this.f8390b = c2453t9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8391c.m9664N(this.f8391c.m9667d(this.f8389a, this.f8390b), this.f8390b);
    }
}
