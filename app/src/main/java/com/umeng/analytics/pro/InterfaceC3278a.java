package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.umeng.analytics.pro.a */
/* loaded from: classes3.dex */
public interface InterfaceC3278a extends IInterface {

    /* renamed from: com.umeng.analytics.pro.a$a */
    /* loaded from: classes3.dex */
    public static class a implements InterfaceC3278a {
        @Override // com.umeng.analytics.pro.InterfaceC3278a
        /* renamed from: a */
        public String mo13700a(String str) {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3278a
        /* renamed from: b */
        public String mo13702b() {
            return null;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3278a
        /* renamed from: c */
        public String mo13704c(String str) {
            return null;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3278a
        /* renamed from: d */
        public String mo13705d(String str) {
            return null;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3278a
        /* renamed from: e */
        public String mo13706e(String str) {
            return null;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3278a
        /* renamed from: a */
        public boolean mo13701a() {
            return false;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3278a
        /* renamed from: b */
        public String mo13703b(String str) {
            return null;
        }
    }

    /* renamed from: a */
    String mo13700a(String str);

    /* renamed from: a */
    boolean mo13701a();

    /* renamed from: b */
    String mo13702b();

    /* renamed from: b */
    String mo13703b(String str);

    /* renamed from: c */
    String mo13704c(String str);

    /* renamed from: d */
    String mo13705d(String str);

    /* renamed from: e */
    String mo13706e(String str);

    /* renamed from: com.umeng.analytics.pro.a$b */
    /* loaded from: classes3.dex */
    public static abstract class b extends Binder implements InterfaceC3278a {

        /* renamed from: a */
        static final int f13937a = 1;

        /* renamed from: b */
        static final int f13938b = 2;

        /* renamed from: c */
        static final int f13939c = 3;

        /* renamed from: d */
        static final int f13940d = 4;

        /* renamed from: e */
        static final int f13941e = 5;

        /* renamed from: f */
        static final int f13942f = 6;

        /* renamed from: g */
        static final int f13943g = 7;

        /* renamed from: h */
        private static final String f13944h = "com.coolpad.deviceidsupport.IDeviceIdManager";

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.umeng.analytics.pro.a$b$a */
        /* loaded from: classes3.dex */
        public static class a implements InterfaceC3278a {

            /* renamed from: a */
            public static InterfaceC3278a f13945a;

            /* renamed from: b */
            private IBinder f13946b;

            a(IBinder iBinder) {
                this.f13946b = iBinder;
            }

            @Override // com.umeng.analytics.pro.InterfaceC3278a
            /* renamed from: a */
            public String mo13700a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f13944h);
                    obtain.writeString(str);
                    if (!this.f13946b.transact(1, obtain, obtain2, 0) && b.m13709c() != null) {
                        return b.m13709c().mo13700a(str);
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
                return this.f13946b;
            }

            @Override // com.umeng.analytics.pro.InterfaceC3278a
            /* renamed from: b */
            public String mo13703b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f13944h);
                    obtain.writeString(str);
                    if (!this.f13946b.transact(2, obtain, obtain2, 0) && b.m13709c() != null) {
                        return b.m13709c().mo13703b(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public String m13710c() {
                return b.f13944h;
            }

            @Override // com.umeng.analytics.pro.InterfaceC3278a
            /* renamed from: d */
            public String mo13705d(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f13944h);
                    obtain.writeString(str);
                    if (!this.f13946b.transact(4, obtain, obtain2, 0) && b.m13709c() != null) {
                        return b.m13709c().mo13705d(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC3278a
            /* renamed from: e */
            public String mo13706e(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f13944h);
                    obtain.writeString(str);
                    if (!this.f13946b.transact(5, obtain, obtain2, 0) && b.m13709c() != null) {
                        return b.m13709c().mo13706e(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC3278a
            /* renamed from: c */
            public String mo13704c(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f13944h);
                    obtain.writeString(str);
                    if (!this.f13946b.transact(3, obtain, obtain2, 0) && b.m13709c() != null) {
                        return b.m13709c().mo13704c(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC3278a
            /* renamed from: a */
            public boolean mo13701a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f13944h);
                    if (!this.f13946b.transact(6, obtain, obtain2, 0) && b.m13709c() != null) {
                        return b.m13709c().mo13701a();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC3278a
            /* renamed from: b */
            public String mo13702b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f13944h);
                    if (!this.f13946b.transact(7, obtain, obtain2, 0) && b.m13709c() != null) {
                        return b.m13709c().mo13702b();
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
            attachInterface(this, f13944h);
        }

        /* renamed from: a */
        public static InterfaceC3278a m13707a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f13944h);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC3278a)) {
                return (InterfaceC3278a) queryLocalInterface;
            }
            return new a(iBinder);
        }

        /* renamed from: c */
        public static InterfaceC3278a m13709c() {
            return a.f13945a;
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
                        parcel.enforceInterface(f13944h);
                        String mo13700a = mo13700a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(mo13700a);
                        return true;
                    case 2:
                        parcel.enforceInterface(f13944h);
                        String mo13703b = mo13703b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(mo13703b);
                        return true;
                    case 3:
                        parcel.enforceInterface(f13944h);
                        String mo13704c = mo13704c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(mo13704c);
                        return true;
                    case 4:
                        parcel.enforceInterface(f13944h);
                        String mo13705d = mo13705d(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(mo13705d);
                        return true;
                    case 5:
                        parcel.enforceInterface(f13944h);
                        String mo13706e = mo13706e(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(mo13706e);
                        return true;
                    case 6:
                        parcel.enforceInterface(f13944h);
                        boolean mo13701a = mo13701a();
                        parcel2.writeNoException();
                        parcel2.writeInt(mo13701a ? 1 : 0);
                        return true;
                    case 7:
                        parcel.enforceInterface(f13944h);
                        String mo13702b = mo13702b();
                        parcel2.writeNoException();
                        parcel2.writeString(mo13702b);
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            }
            parcel2.writeString(f13944h);
            return true;
        }

        /* renamed from: a */
        public static boolean m13708a(InterfaceC3278a interfaceC3278a) {
            if (a.f13945a != null || interfaceC3278a == null) {
                return false;
            }
            a.f13945a = interfaceC3278a;
            return true;
        }
    }
}
