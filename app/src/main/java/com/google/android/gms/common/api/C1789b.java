package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p172i4.C4854b;
import p233m4.AbstractC5594b;

/* renamed from: com.google.android.gms.common.api.b */
/* loaded from: classes.dex */
public final class C1789b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        C4854b c4854b = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            int m22718i = AbstractC5594b.m22718i(m22723n);
            if (m22718i != 1) {
                if (m22718i != 2) {
                    if (m22718i != 3) {
                        if (m22718i != 4) {
                            if (m22718i != 1000) {
                                AbstractC5594b.m22729t(parcel, m22723n);
                            } else {
                                i10 = AbstractC5594b.m22725p(parcel, m22723n);
                            }
                        } else {
                            c4854b = (C4854b) AbstractC5594b.m22712c(parcel, m22723n, C4854b.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) AbstractC5594b.m22712c(parcel, m22723n, PendingIntent.CREATOR);
                    }
                } else {
                    str = AbstractC5594b.m22713d(parcel, m22723n);
                }
            } else {
                i11 = AbstractC5594b.m22725p(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new Status(i10, i11, str, pendingIntent, c4854b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
