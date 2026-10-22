package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.i1 */
/* loaded from: classes.dex */
public final class C1960i1 extends AbstractC2049o0 implements InterfaceC1990k1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1960i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1990k1
    /* renamed from: b */
    public final void mo8200b(Bundle bundle) {
        Parcel m8748d = m8748d();
        AbstractC2079q0.m8778e(m8748d, bundle);
        m8747N(1, m8748d);
    }
}
