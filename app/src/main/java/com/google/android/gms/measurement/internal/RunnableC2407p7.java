package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p7 */
/* loaded from: classes.dex */
public final class RunnableC2407p7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2453t9 f8940a;

    /* renamed from: b */
    final /* synthetic */ C2254b8 f8941b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2407p7(C2254b8 c2254b8, C2453t9 c2453t9) {
        this.f8941b = c2254b8;
        this.f8940a = c2453t9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1106f interfaceC1106f;
        C2254b8 c2254b8 = this.f8941b;
        interfaceC1106f = c2254b8.f8405d;
        if (interfaceC1106f == null) {
            c2254b8.f8714a.mo9577b().m9800r().m9699a("Failed to send consent settings to service");
            return;
        }
        try {
            AbstractC5391n.m21783i(this.f8940a);
            interfaceC1106f.mo5064E(this.f8940a);
            this.f8941b.m9480E();
        } catch (RemoteException e10) {
            this.f8941b.f8714a.mo9577b().m9800r().m9700b("Failed to send consent settings to the service", e10);
        }
    }
}
