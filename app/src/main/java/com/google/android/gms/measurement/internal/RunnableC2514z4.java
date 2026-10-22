package com.google.android.gms.measurement.internal;

import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
/* loaded from: classes.dex */
final class RunnableC2514z4 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2453t9 f9251a;

    /* renamed from: b */
    final /* synthetic */ BinderC2328i5 f9252b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2514z4(BinderC2328i5 binderC2328i5, C2453t9 c2453t9) {
        this.f9252b = binderC2328i5;
        this.f9251a = c2453t9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        c2310g9 = this.f9252b.f8683a;
        c2310g9.m9582e();
        c2310g92 = this.f9252b.f8683a;
        C2453t9 c2453t9 = this.f9251a;
        c2310g92.mo9575a().mo9428h();
        c2310g92.m9585g();
        AbstractC5391n.m21779e(c2453t9.f9084a);
        c2310g92.m9567S(c2453t9);
    }
}
