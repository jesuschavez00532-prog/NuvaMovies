package nf;

import android.os.Parcel;

/* renamed from: nf.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5883a {
    /* renamed from: a */
    public static String m23715a() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            try {
                C5885c.m23720a().m23721b().transact(1, obtain2, obtain, 0);
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
}
