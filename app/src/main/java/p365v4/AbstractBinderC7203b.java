package p365v4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: v4.b */
/* loaded from: classes.dex */
public abstract class AbstractBinderC7203b extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC7203b(String str) {
        attachInterface(this, str);
    }

    /* renamed from: M */
    protected abstract boolean mo16776M(int i10, Parcel parcel, Parcel parcel2, int i11);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws android.os.RemoteException {
        if (i10 > 16777215) {
            if (super.onTransact(i10, parcel, parcel2, i11)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return mo16776M(i10, parcel, parcel2, i11);
    }
}
