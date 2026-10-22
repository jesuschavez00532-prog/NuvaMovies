package p219l4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p172i4.C4858d;
import p233m4.AbstractC5594b;

/* renamed from: l4.a1 */
/* loaded from: classes.dex */
public final class C5354a1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        Bundle bundle = null;
        C4858d[] c4858dArr = null;
        C5364e c5364e = null;
        int i10 = 0;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            int m22718i = AbstractC5594b.m22718i(m22723n);
            if (m22718i != 1) {
                if (m22718i != 2) {
                    if (m22718i != 3) {
                        if (m22718i != 4) {
                            AbstractC5594b.m22729t(parcel, m22723n);
                        } else {
                            c5364e = (C5364e) AbstractC5594b.m22712c(parcel, m22723n, C5364e.CREATOR);
                        }
                    } else {
                        i10 = AbstractC5594b.m22725p(parcel, m22723n);
                    }
                } else {
                    c4858dArr = (C4858d[]) AbstractC5594b.m22715f(parcel, m22723n, C4858d.CREATOR);
                }
            } else {
                bundle = AbstractC5594b.m22710a(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C5419z0(bundle, c4858dArr, i10, c5364e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5419z0[i10];
    }
}
