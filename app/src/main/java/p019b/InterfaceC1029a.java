package p019b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.a */
/* loaded from: classes.dex */
public interface InterfaceC1029a extends IInterface {

    /* renamed from: b.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC1029a {

        /* renamed from: b.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C7800a implements InterfaceC1029a {

            /* renamed from: a */
            private IBinder f4259a;

            C7800a(IBinder iBinder) {
                this.f4259a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4259a;
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static InterfaceC1029a m4825a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1029a)) {
                return (InterfaceC1029a) queryLocalInterface;
            }
            return new C7800a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws android.os.RemoteException {
            Bundle bundle = null;
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            int readInt = parcel.readInt();
            if (parcel.readInt() != 0) {
                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
            } else {
                bundle = null;
            }
            mo4824L(readInt, bundle);
            return true;
        }
    }

    /* renamed from: L */
    void mo4824L(int i10, Bundle bundle);
}
