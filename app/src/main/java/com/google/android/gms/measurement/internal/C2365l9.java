package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;
import p233m4.AbstractC5595c;

/* renamed from: com.google.android.gms.measurement.internal.l9 */
/* loaded from: classes.dex */
public final class C2365l9 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9786a(C2354k9 c2354k9, Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, c2354k9.f8757a);
        AbstractC5595c.m22746n(parcel, 2, c2354k9.f8758b, false);
        AbstractC5595c.m22743k(parcel, 3, c2354k9.f8759c);
        AbstractC5595c.m22744l(parcel, 4, c2354k9.f8760d, false);
        AbstractC5595c.m22739g(parcel, 5, null, false);
        AbstractC5595c.m22746n(parcel, 6, c2354k9.f8761e, false);
        AbstractC5595c.m22746n(parcel, 7, c2354k9.f8762f, false);
        AbstractC5595c.m22738f(parcel, 8, c2354k9.f8763g, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            switch (AbstractC5594b.m22718i(m22723n)) {
                case 1:
                    i10 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                case 2:
                    str = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 3:
                    j10 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 4:
                    l10 = AbstractC5594b.m22727r(parcel, m22723n);
                    break;
                case 5:
                    f10 = AbstractC5594b.m22722m(parcel, m22723n);
                    break;
                case 6:
                    str2 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 7:
                    str3 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 8:
                    d10 = AbstractC5594b.m22721l(parcel, m22723n);
                    break;
                default:
                    AbstractC5594b.m22729t(parcel, m22723n);
                    break;
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C2354k9(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2354k9[i10];
    }
}
