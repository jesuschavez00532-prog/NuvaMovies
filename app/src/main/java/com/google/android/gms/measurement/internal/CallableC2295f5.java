package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
/* loaded from: classes.dex */
final class CallableC2295f5 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f8593a;

    /* renamed from: b */
    final /* synthetic */ BinderC2328i5 f8594b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2295f5(BinderC2328i5 binderC2328i5, String str) {
        this.f8594b = binderC2328i5;
        this.f8593a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        c2310g9 = this.f8594b.f8683a;
        c2310g9.m9582e();
        c2310g92 = this.f8594b.f8683a;
        return c2310g92.m9571W().m9766c0(this.f8593a);
    }
}
