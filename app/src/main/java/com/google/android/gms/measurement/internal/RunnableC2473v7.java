package com.google.android.gms.measurement.internal;

import p025b5.InterfaceC1106f;

/* renamed from: com.google.android.gms.measurement.internal.v7 */
/* loaded from: classes.dex */
final class RunnableC2473v7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1106f f9166a;

    /* renamed from: b */
    final /* synthetic */ ServiceConnectionC2242a8 f9167b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2473v7(ServiceConnectionC2242a8 serviceConnectionC2242a8, InterfaceC1106f interfaceC1106f) {
        this.f9167b = serviceConnectionC2242a8;
        this.f9166a = interfaceC1106f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9167b) {
            this.f9167b.f8364a = false;
            if (!this.f9167b.f8366c.m9512z()) {
                this.f9167b.f8366c.f8714a.mo9577b().m9804v().m9699a("Connected to service");
                this.f9167b.f8366c.m9510x(this.f9166a);
            }
        }
    }
}
