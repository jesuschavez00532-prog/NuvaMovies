package p155h4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

/* renamed from: h4.c */
/* loaded from: classes.dex */
interface InterfaceC4520c extends IInterface {

    /* renamed from: h4.c$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC4520c {

        /* renamed from: a */
        private final IBinder f19543a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(IBinder iBinder) {
            this.f19543a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f19543a;
        }

        @Override // p155h4.InterfaceC4520c
        /* renamed from: o */
        public void mo18910o(Message message) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.f19543a.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }

    /* renamed from: o */
    void mo18910o(Message message);
}
