package com.google.android.gms.measurement.internal;

import p025b5.C1098b;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
/* loaded from: classes.dex */
final class RunnableC2239a5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2453t9 f8357a;

    /* renamed from: b */
    final /* synthetic */ BinderC2328i5 f8358b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2239a5(BinderC2328i5 binderC2328i5, C2453t9 c2453t9) {
        this.f8358b = binderC2328i5;
        this.f8357a = c2453t9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        c2310g9 = this.f8358b.f8683a;
        c2310g9.m9582e();
        c2310g92 = this.f8358b.f8683a;
        C2453t9 c2453t9 = this.f8357a;
        c2310g92.mo9575a().mo9428h();
        c2310g92.m9585g();
        AbstractC5391n.m21779e(c2453t9.f9084a);
        C1098b m5045b = C1098b.m5045b(c2453t9.f9105v);
        C1098b m9570V = c2310g92.m9570V(c2453t9.f9084a);
        c2310g92.mo9577b().m9804v().m9701c("Setting consent, package, consent", c2453t9.f9084a, m5045b);
        c2310g92.m9561A(c2453t9.f9084a, m5045b);
        if (m5045b.m5056k(m9570V)) {
            c2310g92.m9605v(c2453t9);
        }
    }
}
