package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.s0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2109s0 extends AbstractBinderC2064p0 implements InterfaceC2124t0 {
    /* renamed from: c */
    public static InterfaceC2124t0 m8910c(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof InterfaceC2124t0) {
            return (InterfaceC2124t0) queryLocalInterface;
        }
        return new C2094r0(iBinder);
    }
}
