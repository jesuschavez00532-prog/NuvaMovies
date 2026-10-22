package p219l4;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;

/* renamed from: l4.f0 */
/* loaded from: classes.dex */
public final class C5368f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            switch (AbstractC5594b.m22718i(m22723n)) {
                case 1:
                    i10 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                case 2:
                    i11 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                case 3:
                    i12 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                case 4:
                    j10 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 5:
                    j11 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 6:
                    str = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 7:
                    str2 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 8:
                    i13 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                case 9:
                    i14 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                default:
                    AbstractC5594b.m22729t(parcel, m22723n);
                    break;
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C5385l(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5385l[i10];
    }
}
