package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p025b5.InterfaceC1106f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j7 */
/* loaded from: classes.dex */
public final class RunnableC2341j7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2461u6 f8722a;

    /* renamed from: b */
    final /* synthetic */ C2254b8 f8723b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2341j7(C2254b8 c2254b8, C2461u6 c2461u6) {
        this.f8723b = c2254b8;
        this.f8722a = c2461u6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1106f interfaceC1106f;
        C2254b8 c2254b8 = this.f8723b;
        interfaceC1106f = c2254b8.f8405d;
        if (interfaceC1106f == null) {
            c2254b8.f8714a.mo9577b().m9800r().m9699a("Failed to send current screen to service");
            return;
        }
        try {
            C2461u6 c2461u6 = this.f8722a;
            if (c2461u6 == null) {
                interfaceC1106f.mo5061B(0L, null, null, c2254b8.f8714a.mo9584f().getPackageName());
            } else {
                interfaceC1106f.mo5061B(c2461u6.f9124c, c2461u6.f9122a, c2461u6.f9123b, c2254b8.f8714a.mo9584f().getPackageName());
            }
            this.f8723b.m9480E();
        } catch (RemoteException e10) {
            this.f8723b.f8714a.mo9577b().m9800r().m9700b("Failed to send current screen to the service", e10);
        }
    }
}
