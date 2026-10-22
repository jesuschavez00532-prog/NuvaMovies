package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p233m4.AbstractC5594b;
import p233m4.AbstractC5595c;

/* renamed from: com.google.firebase.messaging.o0 */
/* loaded from: classes.dex */
public class C2701o0 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m11299c(C2699n0 c2699n0, Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22737e(parcel, 2, c2699n0.f10331a, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2699n0 createFromParcel(Parcel parcel) {
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
        return new C2699n0(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2699n0[] newArray(int i10) {
        return new C2699n0[i10];
    }
}
