package p172i4;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;

/* renamed from: i4.v */
/* loaded from: classes.dex */
public final class C4891v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        String str = null;
        int i10 = 0;
        long j10 = -1;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            int m22718i = AbstractC5594b.m22718i(m22723n);
            if (m22718i != 1) {
                if (m22718i != 2) {
                    if (m22718i != 3) {
                        AbstractC5594b.m22729t(parcel, m22723n);
                    } else {
                        j10 = AbstractC5594b.m22726q(parcel, m22723n);
                    }
                } else {
                    i10 = AbstractC5594b.m22725p(parcel, m22723n);
                }
            } else {
                str = AbstractC5594b.m22713d(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C4858d(str, i10, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4858d[i10];
    }
}
