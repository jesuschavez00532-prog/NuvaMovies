package p219l4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p233m4.AbstractC5594b;

/* renamed from: l4.v */
/* loaded from: classes.dex */
public final class C5410v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            int m22718i = AbstractC5594b.m22718i(m22723n);
            if (m22718i != 1) {
                if (m22718i != 2) {
                    AbstractC5594b.m22729t(parcel, m22723n);
                } else {
                    arrayList = AbstractC5594b.m22716g(parcel, m22723n, C5385l.CREATOR);
                }
            } else {
                i10 = AbstractC5594b.m22725p(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C5402r(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5402r[i10];
    }
}
