package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p233m4.AbstractC5594b;

/* renamed from: com.google.android.gms.measurement.internal.u9 */
/* loaded from: classes.dex */
public final class C2464u9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        String str = "";
        String str2 = str;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str10 = null;
        String str11 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = -2147483648L;
        boolean z10 = true;
        boolean z11 = false;
        int i10 = 0;
        boolean z12 = true;
        boolean z13 = false;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            switch (AbstractC5594b.m22718i(m22723n)) {
                case 2:
                    str3 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 3:
                    str4 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 4:
                    str5 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 5:
                    str6 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 6:
                    j10 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 7:
                    j11 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 8:
                    str7 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 9:
                    z10 = AbstractC5594b.m22719j(parcel, m22723n);
                    break;
                case 10:
                    z11 = AbstractC5594b.m22719j(parcel, m22723n);
                    break;
                case 11:
                    j15 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 12:
                    str8 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 13:
                    j12 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 14:
                    j13 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 15:
                    i10 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                case 16:
                    z12 = AbstractC5594b.m22719j(parcel, m22723n);
                    break;
                case 17:
                case 20:
                default:
                    AbstractC5594b.m22729t(parcel, m22723n);
                    break;
                case 18:
                    z13 = AbstractC5594b.m22719j(parcel, m22723n);
                    break;
                case 19:
                    str9 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 21:
                    bool = AbstractC5594b.m22720k(parcel, m22723n);
                    break;
                case 22:
                    j14 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 23:
                    arrayList = AbstractC5594b.m22714e(parcel, m22723n);
                    break;
                case 24:
                    str10 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 25:
                    str = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 26:
                    str2 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 27:
                    str11 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C2453t9(str3, str4, str5, str6, j10, j11, str7, z10, z11, j15, str8, j12, j13, i10, z12, z13, str9, bool, j14, arrayList, str10, str, str2, str11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2453t9[i10];
    }
}
