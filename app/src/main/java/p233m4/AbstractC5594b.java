package p233m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: m4.b */
/* loaded from: classes.dex */
public abstract class AbstractC5594b {

    /* renamed from: m4.b$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    /* renamed from: a */
    public static Bundle m22710a(Parcel parcel, int i10) {
        int m22728s = m22728s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m22728s == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m22728s);
        return readBundle;
    }

    /* renamed from: b */
    public static int[] m22711b(Parcel parcel, int i10) {
        int m22728s = m22728s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m22728s == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m22728s);
        return createIntArray;
    }

    /* renamed from: c */
    public static Parcelable m22712c(Parcel parcel, int i10, Parcelable.Creator creator) {
        int m22728s = m22728s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m22728s == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m22728s);
        return parcelable;
    }

    /* renamed from: d */
    public static String m22713d(Parcel parcel, int i10) {
        int m22728s = m22728s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m22728s == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m22728s);
        return readString;
    }

    /* renamed from: e */
    public static ArrayList m22714e(Parcel parcel, int i10) {
        int m22728s = m22728s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m22728s == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m22728s);
        return createStringArrayList;
    }

    /* renamed from: f */
    public static Object[] m22715f(Parcel parcel, int i10, Parcelable.Creator creator) {
        int m22728s = m22728s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m22728s == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m22728s);
        return createTypedArray;
    }

    /* renamed from: g */
    public static ArrayList m22716g(Parcel parcel, int i10, Parcelable.Creator creator) {
        int m22728s = m22728s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m22728s == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m22728s);
        return createTypedArrayList;
    }

    /* renamed from: h */
    public static void m22717h(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a("Overread allowed size end=" + i10, parcel);
    }

    /* renamed from: i */
    public static int m22718i(int i10) {
        return (char) i10;
    }

    /* renamed from: j */
    public static boolean m22719j(Parcel parcel, int i10) {
        m22732w(parcel, i10, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static Boolean m22720k(Parcel parcel, int i10) {
        boolean z10;
        int m22728s = m22728s(parcel, i10);
        if (m22728s == 0) {
            return null;
        }
        m22731v(parcel, i10, m22728s, 4);
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* renamed from: l */
    public static Double m22721l(Parcel parcel, int i10) {
        int m22728s = m22728s(parcel, i10);
        if (m22728s == 0) {
            return null;
        }
        m22731v(parcel, i10, m22728s, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: m */
    public static Float m22722m(Parcel parcel, int i10) {
        int m22728s = m22728s(parcel, i10);
        if (m22728s == 0) {
            return null;
        }
        m22731v(parcel, i10, m22728s, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: n */
    public static int m22723n(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: o */
    public static IBinder m22724o(Parcel parcel, int i10) {
        int m22728s = m22728s(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m22728s == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m22728s);
        return readStrongBinder;
    }

    /* renamed from: p */
    public static int m22725p(Parcel parcel, int i10) {
        m22732w(parcel, i10, 4);
        return parcel.readInt();
    }

    /* renamed from: q */
    public static long m22726q(Parcel parcel, int i10) {
        m22732w(parcel, i10, 8);
        return parcel.readLong();
    }

    /* renamed from: r */
    public static Long m22727r(Parcel parcel, int i10) {
        int m22728s = m22728s(parcel, i10);
        if (m22728s == 0) {
            return null;
        }
        m22731v(parcel, i10, m22728s, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: s */
    public static int m22728s(Parcel parcel, int i10) {
        if ((i10 & (-65536)) != -65536) {
            return (char) (i10 >> 16);
        }
        return parcel.readInt();
    }

    /* renamed from: t */
    public static void m22729t(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + m22728s(parcel, i10));
    }

    /* renamed from: u */
    public static int m22730u(Parcel parcel) {
        int m22723n = m22723n(parcel);
        int m22728s = m22728s(parcel, m22723n);
        int dataPosition = parcel.dataPosition();
        if (m22718i(m22723n) == 20293) {
            int i10 = m22728s + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(m22723n))), parcel);
    }

    /* renamed from: v */
    private static void m22731v(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new a("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    /* renamed from: w */
    private static void m22732w(Parcel parcel, int i10, int i11) {
        int m22728s = m22728s(parcel, i10);
        if (m22728s == i11) {
            return;
        }
        throw new a("Expected size " + i11 + " got " + m22728s + " (0x" + Integer.toHexString(m22728s) + ")", parcel);
    }
}
