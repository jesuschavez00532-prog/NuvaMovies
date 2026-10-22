package nf;

import android.os.Parcel;
import android.os.Process;

/* renamed from: nf.b */
/* loaded from: classes3.dex */
public class C5884b {

    /* renamed from: nf.b$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f23416a;

        /* renamed from: b */
        public String f23417b;
    }

    /* renamed from: a */
    public static String m23716a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain2.writeInt(Process.myPid());
        try {
            try {
                C5885c.m23720a().m23721b().transact(16, obtain2, obtain, 0);
                if (obtain.readInt() == 0) {
                    return obtain.readString();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public static String m23717b(String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        obtain2.writeInt(Process.myPid());
        obtain2.writeString(str);
        try {
            try {
                C5885c.m23720a().m23721b().transact(16, obtain2, obtain, 0);
                if (obtain.readInt() == 0) {
                    return obtain.readString();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: c */
    public static String m23718c() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                C5885c.m23720a().m23721b().transact(5, obtain2, obtain, 0);
                if (obtain.readInt() == 0) {
                    return obtain.readString();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: d */
    public a m23719d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        a aVar = new a();
        try {
            try {
                C5885c.m23720a().m23721b().transact(17, obtain2, obtain, 0);
                if (obtain.readInt() == 0) {
                    aVar.f23416a = obtain.readString();
                    aVar.f23417b = obtain.readString();
                    return aVar;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
