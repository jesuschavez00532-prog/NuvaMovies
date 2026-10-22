package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
/* loaded from: classes.dex */
final class RunnableC2317h5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f8664a;

    /* renamed from: b */
    final /* synthetic */ String f8665b;

    /* renamed from: c */
    final /* synthetic */ String f8666c;

    /* renamed from: d */
    final /* synthetic */ long f8667d;

    /* renamed from: e */
    final /* synthetic */ BinderC2328i5 f8668e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2317h5(BinderC2328i5 binderC2328i5, String str, String str2, String str3, long j10) {
        this.f8668e = binderC2328i5;
        this.f8664a = str;
        this.f8665b = str2;
        this.f8666c = str3;
        this.f8667d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2310g9 c2310g9;
        C2310g9 c2310g92;
        String str = this.f8664a;
        if (str == null) {
            c2310g92 = this.f8668e.f8683a;
            c2310g92.m9606w(this.f8665b, null);
        } else {
            C2461u6 c2461u6 = new C2461u6(this.f8666c, str, this.f8667d);
            c2310g9 = this.f8668e.f8683a;
            c2310g9.m9606w(this.f8665b, c2461u6);
        }
    }
}
