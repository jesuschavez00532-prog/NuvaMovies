package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1990k1;
import p025b5.EnumC1096a;
import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g7 */
/* loaded from: classes.dex */
public final class RunnableC2308g7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2453t9 f8616a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC1990k1 f8617b;

    /* renamed from: c */
    final /* synthetic */ C2254b8 f8618c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2308g7(C2254b8 c2254b8, C2453t9 c2453t9, InterfaceC1990k1 interfaceC1990k1) {
        this.f8618c = c2254b8;
        this.f8616a = c2453t9;
        this.f8617b = interfaceC1990k1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2415q4 c2415q4;
        InterfaceC1106f interfaceC1106f;
        String str = null;
        try {
            try {
                if (!this.f8618c.f8714a.m10024F().m9433q().m5055i(EnumC1096a.ANALYTICS_STORAGE)) {
                    this.f8618c.f8714a.mo9577b().m9806x().m9699a("Analytics storage consent denied; will not get app instance id");
                    this.f8618c.f8714a.m10026I().m9972C(null);
                    this.f8618c.f8714a.m10024F().f8340g.m10116b(null);
                    c2415q4 = this.f8618c.f8714a;
                } else {
                    C2254b8 c2254b8 = this.f8618c;
                    interfaceC1106f = c2254b8.f8405d;
                    if (interfaceC1106f == null) {
                        c2254b8.f8714a.mo9577b().m9800r().m9699a("Failed to get app instance id");
                        c2415q4 = this.f8618c.f8714a;
                    } else {
                        AbstractC5391n.m21783i(this.f8616a);
                        str = interfaceC1106f.mo5074r(this.f8616a);
                        if (str != null) {
                            this.f8618c.f8714a.m10026I().m9972C(str);
                            this.f8618c.f8714a.m10024F().f8340g.m10116b(str);
                        }
                        this.f8618c.m9480E();
                        c2415q4 = this.f8618c.f8714a;
                    }
                }
            } catch (RemoteException e10) {
                this.f8618c.f8714a.mo9577b().m9800r().m9700b("Failed to get app instance id", e10);
                c2415q4 = this.f8618c.f8714a;
            }
            c2415q4.m10031N().m9922J(this.f8617b, str);
        } catch (Throwable th) {
            this.f8618c.f8714a.m10031N().m9922J(this.f8617b, null);
            throw th;
        }
    }
}
