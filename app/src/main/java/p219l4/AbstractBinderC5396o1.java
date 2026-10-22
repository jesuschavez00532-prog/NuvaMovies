package p219l4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p325s4.InterfaceC6675a;
import p394x4.AbstractBinderC7494b;
import p394x4.AbstractC7495c;

/* renamed from: l4.o1 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5396o1 extends AbstractBinderC7494b implements InterfaceC5399p1 {
    public AbstractBinderC5396o1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: c */
    public static InterfaceC5399p1 m21796c(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof InterfaceC5399p1) {
            return (InterfaceC5399p1) queryLocalInterface;
        }
        return new C5393n1(iBinder);
    }

    @Override // p394x4.AbstractBinderC7494b
    /* renamed from: a */
    protected final boolean mo21766a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int mo20025f = mo20025f();
            parcel2.writeNoException();
            parcel2.writeInt(mo20025f);
        } else {
            InterfaceC6675a mo20026g = mo20026g();
            parcel2.writeNoException();
            AbstractC7495c.m28700e(parcel2, mo20026g);
        }
        return true;
    }
}
