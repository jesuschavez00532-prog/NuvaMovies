package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.umeng.analytics.pro.InterfaceC3305b;

/* renamed from: com.umeng.analytics.pro.c */
/* loaded from: classes3.dex */
public interface InterfaceC3332c extends IInterface {

    /* renamed from: com.umeng.analytics.pro.c$a */
    /* loaded from: classes3.dex */
    public static class a implements InterfaceC3332c {
        @Override // com.umeng.analytics.pro.InterfaceC3332c
        /* renamed from: a */
        public void mo14006a(int i10, long j10, boolean z10, float f10, double d10, String str) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3332c
        /* renamed from: b */
        public void mo14008b(InterfaceC3305b interfaceC3305b) {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3332c
        /* renamed from: a */
        public void mo14007a(InterfaceC3305b interfaceC3305b) {
        }
    }

    /* renamed from: a */
    void mo14006a(int i10, long j10, boolean z10, float f10, double d10, String str);

    /* renamed from: a */
    void mo14007a(InterfaceC3305b interfaceC3305b);

    /* renamed from: b */
    void mo14008b(InterfaceC3305b interfaceC3305b);

    /* renamed from: com.umeng.analytics.pro.c$b */
    /* loaded from: classes3.dex */
    public static abstract class b extends Binder implements InterfaceC3332c {

        /* renamed from: a */
        static final int f14371a = 1;

        /* renamed from: b */
        static final int f14372b = 2;

        /* renamed from: c */
        static final int f14373c = 3;

        /* renamed from: d */
        private static final String f14374d = "com.hihonor.cloudservice.oaid.IOAIDService";

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.umeng.analytics.pro.c$b$a */
        /* loaded from: classes3.dex */
        public static class a implements InterfaceC3332c {

            /* renamed from: a */
            public static InterfaceC3332c f14375a;

            /* renamed from: b */
            private IBinder f14376b;

            a(IBinder iBinder) {
                this.f14376b = iBinder;
            }

            /* renamed from: a */
            public String m14012a() {
                return b.f14374d;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14376b;
            }

            @Override // com.umeng.analytics.pro.InterfaceC3332c
            /* renamed from: b */
            public void mo14008b(InterfaceC3305b interfaceC3305b) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14374d);
                    if (interfaceC3305b != null) {
                        iBinder = interfaceC3305b.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f14376b.transact(3, obtain, obtain2, 0) && b.m14009a() != null) {
                        b.m14009a().mo14008b(interfaceC3305b);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC3332c
            /* renamed from: a */
            public void mo14006a(int i10, long j10, boolean z10, float f10, double d10, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14374d);
                    obtain.writeInt(i10);
                    obtain.writeLong(j10);
                    obtain.writeInt(z10 ? 1 : 0);
                    obtain.writeFloat(f10);
                    obtain.writeDouble(d10);
                    obtain.writeString(str);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (!this.f14376b.transact(1, obtain, obtain2, 0) && b.m14009a() != null) {
                        b.m14009a().mo14006a(i10, j10, z10, f10, d10, str);
                        obtain2.recycle();
                        obtain.recycle();
                    } else {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC3332c
            /* renamed from: a */
            public void mo14007a(InterfaceC3305b interfaceC3305b) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14374d);
                    obtain.writeStrongBinder(interfaceC3305b != null ? interfaceC3305b.asBinder() : null);
                    if (!this.f14376b.transact(2, obtain, obtain2, 0) && b.m14009a() != null) {
                        b.m14009a().mo14007a(interfaceC3305b);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, f14374d);
        }

        /* renamed from: a */
        public static InterfaceC3332c m14010a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f14374d);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC3332c)) {
                return (InterfaceC3332c) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            boolean z10;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 1598968902) {
                            return super.onTransact(i10, parcel, parcel2, i11);
                        }
                        parcel2.writeString(f14374d);
                        return true;
                    }
                    parcel.enforceInterface(f14374d);
                    mo14008b(InterfaceC3305b.b.m13829a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface(f14374d);
                mo14007a(InterfaceC3305b.b.m13829a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(f14374d);
            int readInt = parcel.readInt();
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            mo14006a(readInt, readLong, z10, parcel.readFloat(), parcel.readDouble(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        /* renamed from: a */
        public static boolean m14011a(InterfaceC3332c interfaceC3332c) {
            if (a.f14375a != null || interfaceC3332c == null) {
                return false;
            }
            a.f14375a = interfaceC3332c;
            return true;
        }

        /* renamed from: a */
        public static InterfaceC3332c m14009a() {
            return a.f14375a;
        }
    }
}
