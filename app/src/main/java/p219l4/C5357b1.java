package p219l4;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;

/* renamed from: l4.b1 */
/* loaded from: classes.dex */
public final class C5357b1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        C5397p c5397p = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            switch (AbstractC5594b.m22718i(m22723n)) {
                case 1:
                    c5397p = (C5397p) AbstractC5594b.m22712c(parcel, m22723n, C5397p.CREATOR);
                    break;
                case 2:
                    z10 = AbstractC5594b.m22719j(parcel, m22723n);
                    break;
                case 3:
                    z11 = AbstractC5594b.m22719j(parcel, m22723n);
                    break;
                case 4:
                    iArr = AbstractC5594b.m22711b(parcel, m22723n);
                    break;
                case 5:
                    i10 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                case 6:
                    iArr2 = AbstractC5594b.m22711b(parcel, m22723n);
                    break;
                default:
                    AbstractC5594b.m22729t(parcel, m22723n);
                    break;
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C5364e(c5397p, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5364e[i10];
    }
}
