package com.google.android.gms.measurement.internal;

import p025b5.InterfaceC1106f;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
/* loaded from: classes.dex */
final class RunnableC2495x7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InterfaceC1106f f9215a;

    /* renamed from: b */
    final /* synthetic */ ServiceConnectionC2242a8 f9216b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2495x7(ServiceConnectionC2242a8 serviceConnectionC2242a8, InterfaceC1106f interfaceC1106f) {
        this.f9216b = serviceConnectionC2242a8;
        this.f9215a = interfaceC1106f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9216b) {
            this.f9216b.f8364a = false;
            if (!this.f9216b.f8366c.m9512z()) {
                this.f9216b.f8366c.f8714a.mo9577b().m9799q().m9699a("Connected to remote service");
                this.f9216b.f8366c.m9510x(this.f9215a);
            }
        }
    }
}
