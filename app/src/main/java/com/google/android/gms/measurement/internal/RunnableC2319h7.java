package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h7 */
/* loaded from: classes.dex */
public final class RunnableC2319h7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2453t9 f8671a;

    /* renamed from: b */
    final /* synthetic */ C2254b8 f8672b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2319h7(C2254b8 c2254b8, C2453t9 c2453t9) {
        this.f8672b = c2254b8;
        this.f8671a = c2453t9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1106f interfaceC1106f;
        C2254b8 c2254b8 = this.f8672b;
        interfaceC1106f = c2254b8.f8405d;
        if (interfaceC1106f == null) {
            c2254b8.f8714a.mo9577b().m9800r().m9699a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            AbstractC5391n.m21783i(this.f8671a);
            interfaceC1106f.mo5077x(this.f8671a);
            this.f8672b.f8714a.m10021C().m9542t();
            this.f8672b.m9504r(interfaceC1106f, null, this.f8671a);
            this.f8672b.m9480E();
        } catch (RemoteException e10) {
            this.f8672b.f8714a.mo9577b().m9800r().m9700b("Failed to send app launch to the service", e10);
        }
    }
}
