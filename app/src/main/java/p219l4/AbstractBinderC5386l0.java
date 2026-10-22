package p219l4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p394x4.AbstractBinderC7494b;
import p394x4.AbstractC7495c;

/* renamed from: l4.l0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5386l0 extends AbstractBinderC7494b implements InterfaceC5379j {
    public AbstractBinderC5386l0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p394x4.AbstractBinderC7494b
    /* renamed from: a */
    protected final boolean mo21766a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                C5419z0 c5419z0 = (C5419z0) AbstractC7495c.m28696a(parcel, C5419z0.CREATOR);
                AbstractC7495c.m28697b(parcel);
                mo21755t(readInt, readStrongBinder, c5419z0);
            } else {
                int readInt2 = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC7495c.m28696a(parcel, Bundle.CREATOR);
                AbstractC7495c.m28697b(parcel);
                mo21756u(readInt2, bundle);
            }
        } else {
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) AbstractC7495c.m28696a(parcel, Bundle.CREATOR);
            AbstractC7495c.m28697b(parcel);
            mo21757z(readInt3, readStrongBinder2, bundle2);
        }
        parcel2.writeNoException();
        return true;
    }
}
