package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;

/* renamed from: com.google.android.gms.internal.measurement.r1 */
/* loaded from: classes.dex */
public final class C2095r1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z10 = false;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            switch (AbstractC5594b.m22718i(m22723n)) {
                case 1:
                    j10 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 2:
                    j11 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 3:
                    z10 = AbstractC5594b.m22719j(parcel, m22723n);
                    break;
                case 4:
                    str = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 5:
                    str2 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 6:
                    str3 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 7:
                    bundle = AbstractC5594b.m22710a(parcel, m22723n);
                    break;
                case 8:
                    str4 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                default:
                    AbstractC5594b.m22729t(parcel, m22723n);
                    break;
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C2080q1(j10, j11, z10, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2080q1[i10];
    }
}
