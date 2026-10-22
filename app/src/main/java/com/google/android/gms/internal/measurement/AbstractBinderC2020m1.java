package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.m1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2020m1 extends AbstractBinderC2064p0 implements InterfaceC2035n1 {
    public AbstractBinderC2020m1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC2064p0
    /* renamed from: a */
    protected final boolean mo5059a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int mo8611g = mo8611g();
            parcel2.writeNoException();
            parcel2.writeInt(mo8611g);
        } else {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC2079q0.m8774a(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            AbstractC2079q0.m8776c(parcel);
            mo8612h(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        }
        return true;
    }
}
