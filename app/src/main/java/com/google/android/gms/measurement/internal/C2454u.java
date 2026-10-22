package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;

/* renamed from: com.google.android.gms.measurement.internal.u */
/* loaded from: classes.dex */
public final class C2454u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            if (AbstractC5594b.m22718i(m22723n) != 2) {
                AbstractC5594b.m22729t(parcel, m22723n);
            } else {
                bundle = AbstractC5594b.m22710a(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C2443t(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2443t[i10];
    }
}
