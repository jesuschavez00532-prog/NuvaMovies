package p096d5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p233m4.AbstractC5594b;

/* renamed from: d5.i */
/* loaded from: classes.dex */
public final class C3949i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            int m22718i = AbstractC5594b.m22718i(m22723n);
            if (m22718i != 1) {
                if (m22718i != 2) {
                    AbstractC5594b.m22729t(parcel, m22723n);
                } else {
                    str = AbstractC5594b.m22713d(parcel, m22723n);
                }
            } else {
                arrayList = AbstractC5594b.m22714e(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C3948h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C3948h[i10];
    }
}
