package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p233m4.AbstractC5594b;

/* renamed from: com.google.android.gms.auth.api.signin.a */
/* loaded from: classes.dex */
public final class C1787a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 4:
                    str3 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 5:
                    str4 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 6:
                    uri = (Uri) AbstractC5594b.m22712c(parcel, m22723n, Uri.CREATOR);
                    break;
                case 7:
                    str5 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 8:
                    j10 = AbstractC5594b.m22726q(parcel, m22723n);
                    break;
                case 9:
                    str6 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 10:
                    arrayList = AbstractC5594b.m22716g(parcel, m22723n, Scope.CREATOR);
                    break;
                case 11:
                    str7 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 12:
                    str8 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                default:
                    AbstractC5594b.m22729t(parcel, m22723n);
                    break;
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
