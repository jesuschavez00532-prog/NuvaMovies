package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.r0 */
/* loaded from: classes.dex */
public final class C2094r0 extends AbstractC2049o0 implements InterfaceC2124t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2094r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2124t0
    /* renamed from: b */
    public final Bundle mo8866b(Bundle bundle) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, bundle);
        Parcel m8746M = m8746M(1, m8748d);
        Bundle bundle2 = (Bundle) AbstractC2079q0.m8774a(m8746M, Bundle.CREATOR);
        m8746M.recycle();
        return bundle2;
    }
}
