package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k7 */
/* loaded from: classes.dex */
public final class RunnableC2352k7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2453t9 f8752a;

    /* renamed from: b */
    final /* synthetic */ Bundle f8753b;

    /* renamed from: c */
    final /* synthetic */ C2254b8 f8754c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2352k7(C2254b8 c2254b8, C2453t9 c2453t9, Bundle bundle) {
        this.f8754c = c2254b8;
        this.f8752a = c2453t9;
        this.f8753b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1106f interfaceC1106f;
        C2254b8 c2254b8 = this.f8754c;
        interfaceC1106f = c2254b8.f8405d;
        if (interfaceC1106f == null) {
            c2254b8.f8714a.mo9577b().m9800r().m9699a("Failed to send default event parameters to service");
            return;
        }
        try {
            AbstractC5391n.m21783i(this.f8752a);
            interfaceC1106f.mo5069k(this.f8753b, this.f8752a);
        } catch (RemoteException e10) {
            this.f8754c.f8714a.mo9577b().m9800r().m9700b("Failed to send default event parameters to service", e10);
        }
    }
}
