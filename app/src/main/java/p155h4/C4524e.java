package p155h4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;

/* renamed from: h4.e */
/* loaded from: classes.dex */
public final class C4524e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            if (AbstractC5594b.m22718i(m22723n) != 1) {
                AbstractC5594b.m22729t(parcel, m22723n);
            } else {
                intent = (Intent) AbstractC5594b.m22712c(parcel, m22723n, Intent.CREATOR);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C4516a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new C4516a[i10];
    }
}
