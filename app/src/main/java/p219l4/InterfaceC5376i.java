package p219l4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import p394x4.AbstractBinderC7494b;

/* renamed from: l4.i */
/* loaded from: classes.dex */
public interface InterfaceC5376i extends IInterface {

    /* renamed from: l4.i$a */
    /* loaded from: classes.dex */
    public static abstract class a extends AbstractBinderC7494b implements InterfaceC5376i {
        /* renamed from: c */
        public static InterfaceC5376i m21747c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof InterfaceC5376i) {
                return (InterfaceC5376i) queryLocalInterface;
            }
            return new C5390m1(iBinder);
        }
    }

    /* renamed from: e */
    Account mo21746e();
}
