package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import p025b5.EnumC1096a;
import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f7 */
/* loaded from: classes.dex */
public final class RunnableC2297f7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f8597a;

    /* renamed from: b */
    final /* synthetic */ C2453t9 f8598b;

    /* renamed from: c */
    final /* synthetic */ C2254b8 f8599c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2297f7(C2254b8 c2254b8, AtomicReference atomicReference, C2453t9 c2453t9) {
        this.f8599c = c2254b8;
        this.f8597a = atomicReference;
        this.f8598b = c2453t9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC1106f interfaceC1106f;
        synchronized (this.f8597a) {
            try {
                try {
                } catch (RemoteException e10) {
                    this.f8599c.f8714a.mo9577b().m9800r().m9700b("Failed to get app instance id", e10);
                    atomicReference = this.f8597a;
                }
                if (!this.f8599c.f8714a.m10024F().m9433q().m5055i(EnumC1096a.ANALYTICS_STORAGE)) {
                    this.f8599c.f8714a.mo9577b().m9806x().m9699a("Analytics storage consent denied; will not get app instance id");
                    this.f8599c.f8714a.m10026I().m9972C(null);
                    this.f8599c.f8714a.m10024F().f8340g.m10116b(null);
                    this.f8597a.set(null);
                    return;
                }
                C2254b8 c2254b8 = this.f8599c;
                interfaceC1106f = c2254b8.f8405d;
                if (interfaceC1106f == null) {
                    c2254b8.f8714a.mo9577b().m9800r().m9699a("Failed to get app instance id");
                    return;
                }
                AbstractC5391n.m21783i(this.f8598b);
                this.f8597a.set(interfaceC1106f.mo5074r(this.f8598b));
                String str = (String) this.f8597a.get();
                if (str != null) {
                    this.f8599c.f8714a.m10026I().m9972C(str);
                    this.f8599c.f8714a.m10024F().f8340g.m10116b(str);
                }
                this.f8599c.m9480E();
                atomicReference = this.f8597a;
                atomicReference.notify();
            } finally {
                this.f8597a.notify();
            }
        }
    }
}
