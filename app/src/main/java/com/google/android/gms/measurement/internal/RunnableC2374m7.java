package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1990k1;
import p025b5.InterfaceC1106f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m7 */
/* loaded from: classes.dex */
public final class RunnableC2374m7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2465v f8836a;

    /* renamed from: b */
    final /* synthetic */ String f8837b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC1990k1 f8838c;

    /* renamed from: d */
    final /* synthetic */ C2254b8 f8839d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2374m7(C2254b8 c2254b8, C2465v c2465v, String str, InterfaceC1990k1 interfaceC1990k1) {
        this.f8839d = c2254b8;
        this.f8836a = c2465v;
        this.f8837b = str;
        this.f8838c = interfaceC1990k1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2415q4 c2415q4;
        InterfaceC1106f interfaceC1106f;
        byte[] bArr = null;
        try {
            try {
                C2254b8 c2254b8 = this.f8839d;
                interfaceC1106f = c2254b8.f8405d;
                if (interfaceC1106f == null) {
                    c2254b8.f8714a.mo9577b().m9800r().m9699a("Discarding data. Failed to send event to service to bundle");
                    c2415q4 = this.f8839d.f8714a;
                } else {
                    bArr = interfaceC1106f.mo5073p(this.f8836a, this.f8837b);
                    this.f8839d.m9480E();
                    c2415q4 = this.f8839d.f8714a;
                }
            } catch (RemoteException e10) {
                this.f8839d.f8714a.mo9577b().m9800r().m9700b("Failed to send event to the service to bundle", e10);
                c2415q4 = this.f8839d.f8714a;
            }
            c2415q4.m10031N().m9919G(this.f8838c, bArr);
        } catch (Throwable th) {
            this.f8839d.f8714a.m10031N().m9919G(this.f8838c, bArr);
            throw th;
        }
    }
}
