package p219l4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p172i4.C4854b;
import p233m4.AbstractC5594b;

/* renamed from: l4.j0 */
/* loaded from: classes.dex */
public final class C5380j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        IBinder iBinder = null;
        C4854b c4854b = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            int m22718i = AbstractC5594b.m22718i(m22723n);
            if (m22718i != 1) {
                if (m22718i != 2) {
                    if (m22718i != 3) {
                        if (m22718i != 4) {
                            if (m22718i != 5) {
                                AbstractC5594b.m22729t(parcel, m22723n);
                            } else {
                                z11 = AbstractC5594b.m22719j(parcel, m22723n);
                            }
                        } else {
                            z10 = AbstractC5594b.m22719j(parcel, m22723n);
                        }
                    } else {
                        c4854b = (C4854b) AbstractC5594b.m22712c(parcel, m22723n, C4854b.CREATOR);
                    }
                } else {
                    iBinder = AbstractC5594b.m22724o(parcel, m22723n);
                }
            } else {
                i10 = AbstractC5594b.m22725p(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C5377i0(i10, iBinder, c4854b, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5377i0[i10];
    }
}
