package p219l4;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;

/* renamed from: l4.s0 */
/* loaded from: classes.dex */
public final class C5405s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
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
                                i12 = AbstractC5594b.m22725p(parcel, m22723n);
                            }
                        } else {
                            i11 = AbstractC5594b.m22725p(parcel, m22723n);
                        }
                    } else {
                        z11 = AbstractC5594b.m22719j(parcel, m22723n);
                    }
                } else {
                    z10 = AbstractC5594b.m22719j(parcel, m22723n);
                }
            } else {
                i10 = AbstractC5594b.m22725p(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C5397p(i10, z10, z11, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5397p[i10];
    }
}
