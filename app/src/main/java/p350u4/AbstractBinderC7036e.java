package p350u4;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: u4.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC7036e extends AbstractBinderC7033b implements InterfaceC7037f {
    /* renamed from: a */
    public static InterfaceC7037f m27137a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof InterfaceC7037f) {
            return (InterfaceC7037f) queryLocalInterface;
        }
        return new C7035d(iBinder);
    }
}
