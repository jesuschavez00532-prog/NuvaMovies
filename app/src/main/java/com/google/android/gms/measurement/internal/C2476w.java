package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;
import p233m4.AbstractC5595c;

/* renamed from: com.google.android.gms.measurement.internal.w */
/* loaded from: classes.dex */
public final class C2476w implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10096a(C2465v c2465v, Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22746n(parcel, 2, c2465v.f9137a, false);
        AbstractC5595c.m22745m(parcel, 3, c2465v.f9138b, i10, false);
        AbstractC5595c.m22746n(parcel, 4, c2465v.f9139c, false);
        AbstractC5595c.m22743k(parcel, 5, c2465v.f9140d);
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        String str = null;
        C2443t c2443t = null;
        String str2 = null;
        long j10 = 0;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            int m22718i = AbstractC5594b.m22718i(m22723n);
            if (m22718i != 2) {
                if (m22718i != 3) {
                    if (m22718i != 4) {
                        if (m22718i != 5) {
                            AbstractC5594b.m22729t(parcel, m22723n);
                        } else {
                            j10 = AbstractC5594b.m22726q(parcel, m22723n);
                        }
                    } else {
                        str2 = AbstractC5594b.m22713d(parcel, m22723n);
                    }
                } else {
                    c2443t = (C2443t) AbstractC5594b.m22712c(parcel, m22723n, C2443t.CREATOR);
                }
            } else {
                str = AbstractC5594b.m22713d(parcel, m22723n);
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C2465v(str, c2443t, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2465v[i10];
    }
}
