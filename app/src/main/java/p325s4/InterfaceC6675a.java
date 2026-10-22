package p325s4;

import android.os.IBinder;
import android.os.IInterface;
import p394x4.AbstractBinderC7494b;

/* renamed from: s4.a */
/* loaded from: classes.dex */
public interface InterfaceC6675a extends IInterface {

    /* renamed from: s4.a$a */
    /* loaded from: classes.dex */
    public static abstract class a extends AbstractBinderC7494b implements InterfaceC6675a {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: c */
        public static InterfaceC6675a m26052c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof InterfaceC6675a) {
                return (InterfaceC6675a) queryLocalInterface;
            }
            return new C6677c(iBinder);
        }
    }
}
