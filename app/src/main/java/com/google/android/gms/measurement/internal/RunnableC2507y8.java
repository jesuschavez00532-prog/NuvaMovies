package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y8 */
/* loaded from: classes.dex */
public final class RunnableC2507y8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2332i9 f9238a;

    /* renamed from: b */
    final /* synthetic */ C2310g9 f9239b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2507y8(C2310g9 c2310g9, C2332i9 c2332i9) {
        this.f9239b = c2310g9;
        this.f9238a = c2332i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2310g9.m9560k0(this.f9239b, this.f9238a);
        this.f9239b.m9607x();
    }
}
