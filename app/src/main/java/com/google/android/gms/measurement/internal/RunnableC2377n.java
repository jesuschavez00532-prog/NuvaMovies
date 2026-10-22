package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n */
/* loaded from: classes.dex */
public final class RunnableC2377n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC2361l5 f8848a;

    /* renamed from: b */
    final /* synthetic */ AbstractC2388o f8849b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2377n(AbstractC2388o abstractC2388o, InterfaceC2361l5 interfaceC2361l5) {
        this.f8849b = abstractC2388o;
        this.f8848a = interfaceC2361l5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8848a.mo9580d();
        if (C2256c.m9513a()) {
            this.f8848a.mo9575a().m9897z(this);
            return;
        }
        boolean m9881e = this.f8849b.m9881e();
        this.f8849b.f8873c = 0L;
        if (m9881e) {
            this.f8849b.mo9785c();
        }
    }
}
