package p350u4;

import android.os.Parcel;

/* renamed from: u4.c */
/* loaded from: classes.dex */
public abstract class AbstractC7034c {

    /* renamed from: a */
    private static final ClassLoader f26409a = AbstractC7034c.class.getClassLoader();

    /* renamed from: a */
    public static void m27133a(Parcel parcel, boolean z10) {
        parcel.writeInt(1);
    }

    /* renamed from: b */
    public static boolean m27134b(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
