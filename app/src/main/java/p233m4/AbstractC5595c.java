package p233m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: m4.c */
/* loaded from: classes.dex */
public abstract class AbstractC5595c {
    /* renamed from: a */
    public static int m22733a(Parcel parcel) {
        return m22750r(parcel, 20293);
    }

    /* renamed from: b */
    public static void m22734b(Parcel parcel, int i10) {
        m22751s(parcel, i10);
    }

    /* renamed from: c */
    public static void m22735c(Parcel parcel, int i10, boolean z10) {
        m22752t(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: d */
    public static void m22736d(Parcel parcel, int i10, Boolean bool, boolean z10) {
        if (bool == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
            }
        } else {
            m22752t(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    /* renamed from: e */
    public static void m22737e(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
            }
        } else {
            int m22750r = m22750r(parcel, i10);
            parcel.writeBundle(bundle);
            m22751s(parcel, m22750r);
        }
    }

    /* renamed from: f */
    public static void m22738f(Parcel parcel, int i10, Double d10, boolean z10) {
        if (d10 == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
            }
        } else {
            m22752t(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        }
    }

    /* renamed from: g */
    public static void m22739g(Parcel parcel, int i10, Float f10, boolean z10) {
        if (f10 == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
            }
        } else {
            m22752t(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        }
    }

    /* renamed from: h */
    public static void m22740h(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
            }
        } else {
            int m22750r = m22750r(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            m22751s(parcel, m22750r);
        }
    }

    /* renamed from: i */
    public static void m22741i(Parcel parcel, int i10, int i11) {
        m22752t(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    /* renamed from: j */
    public static void m22742j(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
            }
        } else {
            int m22750r = m22750r(parcel, i10);
            parcel.writeIntArray(iArr);
            m22751s(parcel, m22750r);
        }
    }

    /* renamed from: k */
    public static void m22743k(Parcel parcel, int i10, long j10) {
        m22752t(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    /* renamed from: l */
    public static void m22744l(Parcel parcel, int i10, Long l10, boolean z10) {
        if (l10 == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
            }
        } else {
            m22752t(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        }
    }

    /* renamed from: m */
    public static void m22745m(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
            }
        } else {
            int m22750r = m22750r(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            m22751s(parcel, m22750r);
        }
    }

    /* renamed from: n */
    public static void m22746n(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
            }
        } else {
            int m22750r = m22750r(parcel, i10);
            parcel.writeString(str);
            m22751s(parcel, m22750r);
        }
    }

    /* renamed from: o */
    public static void m22747o(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
            }
        } else {
            int m22750r = m22750r(parcel, i10);
            parcel.writeStringList(list);
            m22751s(parcel, m22750r);
        }
    }

    /* renamed from: p */
    public static void m22748p(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11, boolean z10) {
        if (parcelableArr == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
                return;
            }
            return;
        }
        int m22750r = m22750r(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m22753u(parcel, parcelable, i11);
            }
        }
        m22751s(parcel, m22750r);
    }

    /* renamed from: q */
    public static void m22749q(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                m22752t(parcel, i10, 0);
                return;
            }
            return;
        }
        int m22750r = m22750r(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m22753u(parcel, parcelable, 0);
            }
        }
        m22751s(parcel, m22750r);
    }

    /* renamed from: r */
    private static int m22750r(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: s */
    private static void m22751s(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: t */
    private static void m22752t(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    /* renamed from: u */
    private static void m22753u(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
