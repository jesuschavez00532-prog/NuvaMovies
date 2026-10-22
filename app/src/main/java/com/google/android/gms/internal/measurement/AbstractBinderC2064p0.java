package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.p0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2064p0 extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC2064p0(String str) {
        attachInterface(this, str);
    }

    /* renamed from: a */
    protected abstract boolean mo5059a(int i10, Parcel parcel, Parcel parcel2, int i11);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 > 16777215) {
            if (super.onTransact(i10, parcel, parcel2, i11)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return mo5059a(i10, parcel, parcel2, i11);
    }
}
