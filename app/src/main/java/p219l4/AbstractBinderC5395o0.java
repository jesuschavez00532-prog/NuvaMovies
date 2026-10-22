package p219l4;

import android.os.IBinder;
import android.os.IInterface;
import p394x4.AbstractBinderC7494b;

/* renamed from: l4.o0 */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5395o0 extends AbstractBinderC7494b implements InterfaceC5398p0 {
    /* renamed from: c */
    public static InterfaceC5398p0 m21795c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof InterfaceC5398p0) {
            return (InterfaceC5398p0) queryLocalInterface;
        }
        return new C5392n0(iBinder);
    }
}
