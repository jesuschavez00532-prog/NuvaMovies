package org.android.agoo.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface IMessageService extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IMessageService {
        private static final String DESCRIPTOR = "org.android.agoo.service.IMessageService";
        static final int TRANSACTION_ping = 1;
        static final int TRANSACTION_probe = 2;

        /* renamed from: org.android.agoo.service.IMessageService$Stub$a */
        /* loaded from: classes3.dex */
        private static class C6055a implements IMessageService {

            /* renamed from: a */
            private IBinder f23726a;

            C6055a(IBinder iBinder) {
                this.f23726a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23726a;
            }

            @Override // org.android.agoo.service.IMessageService
            public boolean ping() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    boolean z10 = false;
                    this.f23726a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.android.agoo.service.IMessageService
            public void probe() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f23726a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMessageService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof IMessageService) {
                return (IMessageService) queryLocalInterface;
            }
            return new C6055a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 1598968902) {
                        return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                parcel.enforceInterface(DESCRIPTOR);
                probe();
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            boolean ping = ping();
            parcel2.writeNoException();
            parcel2.writeInt(ping ? 1 : 0);
            return true;
        }
    }

    boolean ping();

    void probe();
}
