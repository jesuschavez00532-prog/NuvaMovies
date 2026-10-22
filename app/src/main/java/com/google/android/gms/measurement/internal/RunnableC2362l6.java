package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
/* loaded from: classes.dex */
final class RunnableC2362l6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f8780a;

    /* renamed from: b */
    final /* synthetic */ C2406p6 f8781b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2362l6(C2406p6 c2406p6, boolean z10) {
        this.f8781b = c2406p6;
        this.f8780a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m10044o = this.f8781b.f8714a.m10044o();
        boolean m10043n = this.f8781b.f8714a.m10043n();
        this.f8781b.f8714a.m10040k(this.f8780a);
        if (m10043n == this.f8780a) {
            this.f8781b.f8714a.mo9577b().m9804v().m9700b("Default data collection state already set to", Boolean.valueOf(this.f8780a));
        }
        if (this.f8781b.f8714a.m10044o() == m10044o || this.f8781b.f8714a.m10044o() != this.f8781b.f8714a.m10043n()) {
            this.f8781b.f8714a.mo9577b().m9806x().m9701c("Default data collection is different than actual status", Boolean.valueOf(this.f8780a), Boolean.valueOf(m10044o));
        }
        this.f8781b.m9965P();
    }
}
