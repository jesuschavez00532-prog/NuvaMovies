package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;

/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes.dex */
public final class C1788a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        int i10 = 0;
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
                i10 = AbstractC5594b.m22725p(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new Scope(i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}
