package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC2049o0 implements IInterface {

    /* renamed from: a */
    private final IBinder f7976a;

    /* renamed from: b */
    private final String f7977b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2049o0(IBinder iBinder, String str) {
        this.f7976a = iBinder;
        this.f7977b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public final Parcel m8746M(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f7976a.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: N */
    public final void m8747N(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7976a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7976a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcel m8748d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7977b);
        return obtain;
    }
}
