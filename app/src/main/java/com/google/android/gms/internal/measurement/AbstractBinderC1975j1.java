package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1975j1 extends AbstractBinderC2064p0 implements InterfaceC1990k1 {
    public AbstractBinderC1975j1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC2064p0
    /* renamed from: a */
    protected final boolean mo5059a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Bundle bundle = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
            AbstractC2079q0.m8776c(parcel);
            mo8200b(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
