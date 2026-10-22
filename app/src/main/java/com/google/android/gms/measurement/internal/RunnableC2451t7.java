package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1990k1;
import java.util.ArrayList;
import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t7 */
/* loaded from: classes.dex */
public final class RunnableC2451t7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f9078a;

    /* renamed from: b */
    final /* synthetic */ String f9079b;

    /* renamed from: c */
    final /* synthetic */ C2453t9 f9080c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC1990k1 f9081d;

    /* renamed from: e */
    final /* synthetic */ C2254b8 f9082e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2451t7(C2254b8 c2254b8, String str, String str2, C2453t9 c2453t9, InterfaceC1990k1 interfaceC1990k1) {
        this.f9082e = c2254b8;
        this.f9078a = str;
        this.f9079b = str2;
        this.f9080c = c2453t9;
        this.f9081d = interfaceC1990k1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2415q4 c2415q4;
        InterfaceC1106f interfaceC1106f;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                C2254b8 c2254b8 = this.f9082e;
                interfaceC1106f = c2254b8.f8405d;
                if (interfaceC1106f == null) {
                    c2254b8.f8714a.mo9577b().m9800r().m9701c("Failed to get conditional properties; not connected to service", this.f9078a, this.f9079b);
                    c2415q4 = this.f9082e.f8714a;
                } else {
                    AbstractC5391n.m21783i(this.f9080c);
                    arrayList = C2398o9.m9911v(interfaceC1106f.mo5078y(this.f9078a, this.f9079b, this.f9080c));
                    this.f9082e.m9480E();
                    c2415q4 = this.f9082e.f8714a;
                }
            } catch (RemoteException e10) {
                this.f9082e.f8714a.mo9577b().m9800r().m9702d("Failed to get conditional properties; remote exception", this.f9078a, this.f9079b, e10);
                c2415q4 = this.f9082e.f8714a;
            }
            c2415q4.m10031N().m9917E(this.f9081d, arrayList);
        } catch (Throwable th) {
            this.f9082e.f8714a.m10031N().m9917E(this.f9081d, arrayList);
            throw th;
        }
    }
}
