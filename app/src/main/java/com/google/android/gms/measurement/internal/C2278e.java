package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;

/* renamed from: com.google.android.gms.measurement.internal.e */
/* loaded from: classes.dex */
public final class C2278e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        String str = null;
        String str2 = null;
        C2354k9 c2354k9 = null;
        String str3 = null;
        C2465v c2465v = null;
        C2465v c2465v2 = null;
        C2465v c2465v3 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            switch (AbstractC5594b.m22718i(m22723n)) {
                case 2:
                    str = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 3:
                    str2 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 4:
                    c2354k9 = (C2354k9) AbstractC5594b.m22712c(parcel, m22723n, C2354k9.CREATOR);
                    break;
                case 5:
                    j10 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 6:
                    z10 = AbstractC5594b.m22719j(parcel, m22723n);
                    break;
                case 7:
                    str3 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 8:
                    c2465v = (C2465v) AbstractC5594b.m22712c(parcel, m22723n, C2465v.CREATOR);
                    break;
                case 9:
                    j11 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 10:
                    c2465v2 = (C2465v) AbstractC5594b.m22712c(parcel, m22723n, C2465v.CREATOR);
                    break;
                case 11:
                    j12 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 12:
                    c2465v3 = (C2465v) AbstractC5594b.m22712c(parcel, m22723n, C2465v.CREATOR);
                    break;
                default:
                    AbstractC5594b.m22729t(parcel, m22723n);
                    break;
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C2267d(str, str2, c2354k9, j10, z10, str3, c2465v, j11, c2465v2, j12, c2465v3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2267d[i10];
    }
}
