package org.repackage.com.zui.deviceidservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface IDeviceidInterface extends IInterface {
    /* renamed from: a */
    String mo24344a();

    /* renamed from: a */
    String mo24345a(String str);

    /* renamed from: b */
    String mo24346b();

    /* renamed from: b */
    String mo24347b(String str);

    /* renamed from: c */
    boolean mo24348c();

    /* renamed from: c */
    boolean mo24349c(String str);

    /* loaded from: classes3.dex */
    public static abstract class Stub extends Binder implements IDeviceidInterface {

        /* renamed from: a */
        static final int f23969a = 1;

        /* renamed from: b */
        static final int f23970b = 2;

        /* renamed from: c */
        static final int f23971c = 3;

        /* renamed from: d */
        static final int f23972d = 4;

        /* renamed from: e */
        static final int f23973e = 5;

        /* renamed from: f */
        static final int f23974f = 6;

        /* renamed from: g */
        private static final String f23975g = "org.repackage.com.zui.deviceidservice.IDeviceidInterface";

        public Stub() {
            attachInterface(this, f23975g);
        }

        /* renamed from: a */
        public static IDeviceidInterface m24350a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f23975g);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IDeviceidInterface)) {
                return (IDeviceidInterface) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(f23975g);
                        String mo24344a = mo24344a();
                        parcel2.writeNoException();
                        parcel2.writeString(mo24344a);
                        return true;
                    case 2:
                        parcel.enforceInterface(f23975g);
                        String mo24346b = mo24346b();
                        parcel2.writeNoException();
                        parcel2.writeString(mo24346b);
                        return true;
                    case 3:
                        parcel.enforceInterface(f23975g);
                        boolean mo24348c = mo24348c();
                        parcel2.writeNoException();
                        parcel2.writeInt(mo24348c ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(f23975g);
                        String mo24345a = mo24345a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(mo24345a);
                        return true;
                    case 5:
                        parcel.enforceInterface(f23975g);
                        String mo24347b = mo24347b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(mo24347b);
                        return true;
                    case 6:
                        parcel.enforceInterface(f23975g);
                        boolean mo24349c = mo24349c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(mo24349c ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            }
            parcel2.writeString(f23975g);
            return true;
        }

        /* loaded from: classes3.dex */
        private static class Proxy implements IDeviceidInterface {

            /* renamed from: a */
            private IBinder f23976a;

            Proxy(IBinder iBinder) {
                this.f23976a = iBinder;
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            /* renamed from: a */
            public String mo24344a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f23975g);
                    this.f23976a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f23976a;
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            /* renamed from: b */
            public String mo24346b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f23975g);
                    this.f23976a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            /* renamed from: c */
            public boolean mo24348c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f23975g);
                    this.f23976a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public String m24351d() {
                return Stub.f23975g;
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            /* renamed from: a */
            public String mo24345a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f23975g);
                    obtain.writeString(str);
                    this.f23976a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            /* renamed from: b */
            public String mo24347b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f23975g);
                    obtain.writeString(str);
                    this.f23976a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // org.repackage.com.zui.deviceidservice.IDeviceidInterface
            /* renamed from: c */
            public boolean mo24349c(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f23975g);
                    obtain.writeString(str);
                    this.f23976a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
