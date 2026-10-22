package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1990k1;
import java.util.List;
import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c7 */
/* loaded from: classes.dex */
public final class RunnableC2264c7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f8508a;

    /* renamed from: b */
    final /* synthetic */ String f8509b;

    /* renamed from: c */
    final /* synthetic */ C2453t9 f8510c;

    /* renamed from: d */
    final /* synthetic */ boolean f8511d;

    /* renamed from: e */
    final /* synthetic */ InterfaceC1990k1 f8512e;

    /* renamed from: f */
    final /* synthetic */ C2254b8 f8513f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2264c7(C2254b8 c2254b8, String str, String str2, C2453t9 c2453t9, boolean z10, InterfaceC1990k1 interfaceC1990k1) {
        this.f8513f = c2254b8;
        this.f8508a = str;
        this.f8509b = str2;
        this.f8510c = c2453t9;
        this.f8511d = z10;
        this.f8512e = interfaceC1990k1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        InterfaceC1106f interfaceC1106f;
        Bundle bundle2 = new Bundle();
        try {
            C2254b8 c2254b8 = this.f8513f;
            interfaceC1106f = c2254b8.f8405d;
            if (interfaceC1106f == null) {
                c2254b8.f8714a.mo9577b().m9800r().m9701c("Failed to get user properties; not connected to service", this.f8508a, this.f8509b);
                this.f8513f.f8714a.m10031N().m9918F(this.f8512e, bundle2);
                return;
            }
            AbstractC5391n.m21783i(this.f8510c);
            List<C2354k9> mo5065F = interfaceC1106f.mo5065F(this.f8508a, this.f8509b, this.f8511d, this.f8510c);
            bundle = new Bundle();
            if (mo5065F != null) {
                for (C2354k9 c2354k9 : mo5065F) {
                    String str = c2354k9.f8761e;
                    if (str != null) {
                        bundle.putString(c2354k9.f8758b, str);
                    } else {
                        Long l10 = c2354k9.f8760d;
                        if (l10 != null) {
                            bundle.putLong(c2354k9.f8758b, l10.longValue());
                        } else {
                            Double d10 = c2354k9.f8763g;
                            if (d10 != null) {
                                bundle.putDouble(c2354k9.f8758b, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f8513f.m9480E();
                    this.f8513f.f8714a.m10031N().m9918F(this.f8512e, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.f8513f.f8714a.mo9577b().m9800r().m9701c("Failed to get user properties; remote exception", this.f8508a, e10);
                    this.f8513f.f8714a.m10031N().m9918F(this.f8512e, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                this.f8513f.f8714a.m10031N().m9918F(this.f8512e, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            this.f8513f.f8714a.m10031N().m9918F(this.f8512e, bundle2);
            throw th;
        }
    }
}
