package org.android.agoo.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface SendMessage extends IInterface {

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements SendMessage {
        private static final String DESCRIPTOR = "org.android.agoo.service.SendMessage";
        static final int TRANSACTION_doSend = 1;

        /* renamed from: org.android.agoo.service.SendMessage$Stub$a */
        /* loaded from: classes3.dex */
        private static class C6056a implements SendMessage {

            /* renamed from: a */
            private IBinder f23727a;

            C6056a(IBinder iBinder) {
                this.f23727a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23727a;
            }

            @Override // org.android.agoo.service.SendMessage
            public int doSend(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f23727a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static SendMessage asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof SendMessage) {
                return (SendMessage) queryLocalInterface;
            }
            return new C6056a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Intent intent;
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            if (parcel.readInt() != 0) {
                intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
            } else {
                intent = null;
            }
            int doSend = doSend(intent);
            parcel2.writeNoException();
            parcel2.writeInt(doSend);
            return true;
        }
    }

    int doSend(Intent intent);
}
