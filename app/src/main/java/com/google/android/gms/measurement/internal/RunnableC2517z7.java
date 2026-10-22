package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
/* loaded from: classes.dex */
final class RunnableC2517z7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ServiceConnectionC2242a8 f9258a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2517z7(ServiceConnectionC2242a8 serviceConnectionC2242a8) {
        this.f9258a = serviceConnectionC2242a8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9258a.f8366c.f8405d = null;
        this.f9258a.f8366c.m9479D();
    }
}
