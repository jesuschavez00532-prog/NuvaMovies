package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
/* loaded from: classes.dex */
final class CallableC2481w4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f9178a;

    /* renamed from: b */
    final /* synthetic */ String f9179b;

    /* renamed from: c */
    final /* synthetic */ String f9180c;

    /* renamed from: d */
    final /* synthetic */ BinderC2328i5 f9181d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2481w4(BinderC2328i5 binderC2328i5, String str, String str2, String str3) {
        this.f9181d = binderC2328i5;
        this.f9178a = str;
        this.f9179b = str2;
        this.f9180c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        c2310g9 = this.f9181d.f8683a;
        c2310g9.m9582e();
        c2310g92 = this.f9181d.f8683a;
        return c2310g92.m9571W().m9764a0(this.f9178a, this.f9179b, this.f9180c);
    }
}
