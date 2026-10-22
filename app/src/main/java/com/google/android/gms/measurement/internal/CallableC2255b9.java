package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import p025b5.C1098b;
import p025b5.EnumC1096a;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b9 */
/* loaded from: classes.dex */
public final class CallableC2255b9 implements Callable {

    /* renamed from: a */
    final /* synthetic */ C2453t9 f8411a;

    /* renamed from: b */
    final /* synthetic */ C2310g9 f8412b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2255b9(C2310g9 c2310g9, C2453t9 c2453t9) {
        this.f8412b = c2310g9;
        this.f8411a = c2453t9;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1098b m9570V = this.f8412b.m9570V((String) AbstractC5391n.m21783i(this.f8411a.f9084a));
        EnumC1096a enumC1096a = EnumC1096a.ANALYTICS_STORAGE;
        if (m9570V.m5055i(enumC1096a) && C1098b.m5045b(this.f8411a.f9105v).m5055i(enumC1096a)) {
            return this.f8412b.m9567S(this.f8411a).m9843e0();
        }
        this.f8412b.mo9577b().m9804v().m9699a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
