package p219l4;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: l4.m0 */
/* loaded from: classes.dex */
final class C5389m0 implements InterfaceC5382k {

    /* renamed from: a */
    private final IBinder f22022a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5389m0(IBinder iBinder) {
        this.f22022a = iBinder;
    }

    @Override // p219l4.InterfaceC5382k
    /* renamed from: A */
    public final void mo21758A(InterfaceC5379j interfaceC5379j, C5367f c5367f) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (interfaceC5379j != null) {
                iBinder = interfaceC5379j.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (c5367f != null) {
                obtain.writeInt(1);
                C5360c1.m21698a(c5367f, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f22022a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f22022a;
    }
}
