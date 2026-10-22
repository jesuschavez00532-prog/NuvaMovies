package p172i4;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;

/* renamed from: i4.k0 */
/* loaded from: classes.dex */
public final class C4873k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        boolean z10 = false;
        String str = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            int m22718i = AbstractC5594b.m22718i(m22723n);
            if (m22718i != 1) {
                if (m22718i != 2) {
                    if (m22718i != 3) {
                        if (m22718i != 4) {
                            AbstractC5594b.m22729t(parcel, m22723n);
                        } else {
                            i11 = AbstractC5594b.m22725p(parcel, m22723n);
                        }
                    } else {
                        i10 = AbstractC5594b.m22725p(parcel, m22723n);
                    }
                } else {
                    str = AbstractC5594b.m22713d(parcel, m22723n);
                }
            } else {
                z10 = AbstractC5594b.m22719j(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C4871j0(z10, str, i10, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C4871j0[i10];
    }
}
