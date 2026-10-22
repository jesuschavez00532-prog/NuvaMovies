package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.u4 */
/* loaded from: classes.dex */
final class CallableC2459u4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f9116a;

    /* renamed from: b */
    final /* synthetic */ String f9117b;

    /* renamed from: c */
    final /* synthetic */ String f9118c;

    /* renamed from: d */
    final /* synthetic */ BinderC2328i5 f9119d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2459u4(BinderC2328i5 binderC2328i5, String str, String str2, String str3) {
        this.f9119d = binderC2328i5;
        this.f9116a = str;
        this.f9117b = str2;
        this.f9118c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        c2310g9 = this.f9119d.f8683a;
        c2310g9.m9582e();
        c2310g92 = this.f9119d.f8683a;
        return c2310g92.m9571W().m9767d0(this.f9116a, this.f9117b, this.f9118c);
    }
}
