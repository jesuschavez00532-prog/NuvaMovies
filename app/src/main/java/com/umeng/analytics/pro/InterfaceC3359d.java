package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.umeng.analytics.pro.d */
/* loaded from: classes3.dex */
public interface InterfaceC3359d extends IInterface {

    /* renamed from: com.umeng.analytics.pro.d$a */
    /* loaded from: classes3.dex */
    public static class a implements InterfaceC3359d {
        @Override // com.umeng.analytics.pro.InterfaceC3359d
        /* renamed from: a */
        public String mo14178a() {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3359d
        /* renamed from: b */
        public String mo14180b(String str) {
            return null;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3359d
        /* renamed from: a */
        public String mo14179a(String str) {
            return null;
        }
    }

    /* renamed from: a */
    String mo14178a();

    /* renamed from: a */
    String mo14179a(String str);

    /* renamed from: b */
    String mo14180b(String str);

    /* renamed from: com.umeng.analytics.pro.d$b */
    /* loaded from: classes3.dex */
    public static abstract class b extends Binder implements InterfaceC3359d {

        /* renamed from: a */
        static final int f14449a = 1;

        /* renamed from: b */
        static final int f14450b = 2;

        /* renamed from: c */
        static final int f14451c = 3;

        /* renamed from: d */
        private static final String f14452d = "com.samsung.android.deviceidservice.IDeviceIdService";

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.umeng.analytics.pro.d$b$a */
        /* loaded from: classes3.dex */
        public static class a implements InterfaceC3359d {

            /* renamed from: a */
            public static InterfaceC3359d f14453a;

            /* renamed from: b */
            private IBinder f14454b;

            a(IBinder iBinder) {
                this.f14454b = iBinder;
            }

            @Override // com.umeng.analytics.pro.InterfaceC3359d
            /* renamed from: a */
            public String mo14178a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14452d);
                    if (!this.f14454b.transact(1, obtain, obtain2, 0) && b.m14183b() != null) {
                        return b.m14183b().mo14178a();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14454b;
            }

            /* renamed from: b */
            public String m14184b() {
                return b.f14452d;
            }

            @Override // com.umeng.analytics.pro.InterfaceC3359d
            /* renamed from: b */
            public String mo14180b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14452d);
                    obtain.writeString(str);
                    if (!this.f14454b.transact(3, obtain, obtain2, 0) && b.m14183b() != null) {
                        return b.m14183b().mo14180b(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC3359d
            /* renamed from: a */
            public String mo14179a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14452d);
                    obtain.writeString(str);
                    if (!this.f14454b.transact(2, obtain, obtain2, 0) && b.m14183b() != null) {
                        return b.m14183b().mo14179a(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, f14452d);
        }

        /* renamed from: a */
        public static InterfaceC3359d m14181a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f14452d);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC3359d)) {
                return (InterfaceC3359d) queryLocalInterface;
            }
            return new a(iBinder);
        }

        /* renamed from: b */
        public static InterfaceC3359d m14183b() {
            return a.f14453a;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 1598968902) {
                            return super.onTransact(i10, parcel, parcel2, i11);
                        }
                        parcel2.writeString(f14452d);
                        return true;
                    }
                    parcel.enforceInterface(f14452d);
                    String mo14180b = mo14180b(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(mo14180b);
                    return true;
                }
                parcel.enforceInterface(f14452d);
                String mo14179a = mo14179a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(mo14179a);
                return true;
            }
            parcel.enforceInterface(f14452d);
            String mo14178a = mo14178a();
            parcel2.writeNoException();
            parcel2.writeString(mo14178a);
            return true;
        }

        /* renamed from: a */
        public static boolean m14182a(InterfaceC3359d interfaceC3359d) {
            if (a.f14453a != null || interfaceC3359d == null) {
                return false;
            }
            a.f14453a = interfaceC3359d;
            return true;
        }
    }
}
