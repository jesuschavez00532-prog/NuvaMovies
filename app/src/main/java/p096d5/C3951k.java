package p096d5;

import android.os.Parcel;
import android.os.Parcelable;
import p219l4.C5371g0;
import p233m4.AbstractC5594b;

/* renamed from: d5.k */
/* loaded from: classes.dex */
public final class C3951k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        int i10 = 0;
        C5371g0 c5371g0 = null;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            int m22718i = AbstractC5594b.m22718i(m22723n);
            if (m22718i != 1) {
                if (m22718i != 2) {
                    AbstractC5594b.m22729t(parcel, m22723n);
                } else {
                    c5371g0 = (C5371g0) AbstractC5594b.m22712c(parcel, m22723n, C5371g0.CREATOR);
                }
            } else {
                i10 = AbstractC5594b.m22725p(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C3950j(i10, c5371g0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3950j[i10];
    }
}
