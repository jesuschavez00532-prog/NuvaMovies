package org.repackage.p270a.p271a.p272a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: org.repackage.a.a.a.a */
/* loaded from: classes3.dex */
public interface InterfaceC6067a extends IInterface {

    /* renamed from: org.repackage.a.a.a.a$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends Binder implements InterfaceC6067a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: org.repackage.a.a.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C7856a implements InterfaceC6067a {

            /* renamed from: a */
            public IBinder f23843a;

            public C7856a(IBinder iBinder) {
                this.f23843a = iBinder;
            }

            /* renamed from: a */
            public String m24222a(String str, String str2, String str3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f23843a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23843a;
            }
        }

        /* renamed from: a */
        public static InterfaceC6067a m24221a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC6067a)) {
                return (InterfaceC6067a) queryLocalInterface;
            }
            return new C7856a(iBinder);
        }
    }
}
