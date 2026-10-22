package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.umeng.analytics.pro.b */
/* loaded from: classes3.dex */
public interface InterfaceC3305b extends IInterface {

    /* renamed from: com.umeng.analytics.pro.b$a */
    /* loaded from: classes3.dex */
    public static class a implements InterfaceC3305b {
        @Override // com.umeng.analytics.pro.InterfaceC3305b
        /* renamed from: a */
        public void mo13826a(int i10, long j10, boolean z10, float f10, double d10, String str) {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3305b
        /* renamed from: a */
        public void mo13827a(int i10, Bundle bundle) {
        }
    }

    /* renamed from: a */
    void mo13826a(int i10, long j10, boolean z10, float f10, double d10, String str);

    /* renamed from: a */
    void mo13827a(int i10, Bundle bundle);

    /* renamed from: com.umeng.analytics.pro.b$b */
    /* loaded from: classes3.dex */
    public static abstract class b extends Binder implements InterfaceC3305b {

        /* renamed from: a */
        static final int f14063a = 1;

        /* renamed from: b */
        static final int f14064b = 2;

        /* renamed from: c */
        private static final String f14065c = "com.hihonor.cloudservice.oaid.IOAIDCallBack";

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.umeng.analytics.pro.b$b$a */
        /* loaded from: classes3.dex */
        public static class a implements InterfaceC3305b {

            /* renamed from: a */
            public static InterfaceC3305b f14066a;

            /* renamed from: b */
            private IBinder f14067b;

            a(IBinder iBinder) {
                this.f14067b = iBinder;
            }

            /* renamed from: a */
            public String m13831a() {
                return b.f14065c;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14067b;
            }

            @Override // com.umeng.analytics.pro.InterfaceC3305b
            /* renamed from: a */
            public void mo13826a(int i10, long j10, boolean z10, float f10, double d10, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14065c);
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
                    if (!this.f14067b.transact(1, obtain, obtain2, 0) && b.m13828a() != null) {
                        b.m13828a().mo13826a(i10, j10, z10, f10, d10, str);
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

            @Override // com.umeng.analytics.pro.InterfaceC3305b
            /* renamed from: a */
            public void mo13827a(int i10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f14065c);
                    obtain.writeInt(i10);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f14067b.transact(2, obtain, obtain2, 0) && b.m13828a() != null) {
                        b.m13828a().mo13827a(i10, bundle);
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
            attachInterface(this, f14065c);
        }

        /* renamed from: a */
        public static InterfaceC3305b m13829a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f14065c);
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC3305b)) {
                return (InterfaceC3305b) queryLocalInterface;
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
            Bundle bundle;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 1598968902) {
                        return super.onTransact(i10, parcel, parcel2, i11);
                    }
                    parcel2.writeString(f14065c);
                    return true;
                }
                parcel.enforceInterface(f14065c);
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                mo13827a(readInt, bundle);
                parcel2.writeNoException();
                return true;
            }
            parcel.enforceInterface(f14065c);
            int readInt2 = parcel.readInt();
            long readLong = parcel.readLong();
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            mo13826a(readInt2, readLong, z10, parcel.readFloat(), parcel.readDouble(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        /* renamed from: a */
        public static boolean m13830a(InterfaceC3305b interfaceC3305b) {
            if (a.f14066a != null || interfaceC3305b == null) {
                return false;
            }
            a.f14066a = interfaceC3305b;
            return true;
        }

        /* renamed from: a */
        public static InterfaceC3305b m13828a() {
            return a.f14066a;
        }
    }
}
