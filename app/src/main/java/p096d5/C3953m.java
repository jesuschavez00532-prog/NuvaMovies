package p096d5;

import android.os.Parcel;
import android.os.Parcelable;
import p172i4.C4854b;
import p219l4.C5377i0;
import p233m4.AbstractC5594b;

/* renamed from: d5.m */
/* loaded from: classes.dex */
public final class C3953m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        int i10 = 0;
        C4854b c4854b = null;
        C5377i0 c5377i0 = null;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            int m22718i = AbstractC5594b.m22718i(m22723n);
            if (m22718i != 1) {
                if (m22718i != 2) {
                    if (m22718i != 3) {
                        AbstractC5594b.m22729t(parcel, m22723n);
                    } else {
                        c5377i0 = (C5377i0) AbstractC5594b.m22712c(parcel, m22723n, C5377i0.CREATOR);
                    }
                } else {
                    c4854b = (C4854b) AbstractC5594b.m22712c(parcel, m22723n, C4854b.CREATOR);
                }
            } else {
                i10 = AbstractC5594b.m22725p(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C3952l(i10, c4854b, c5377i0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3952l[i10];
    }
}
