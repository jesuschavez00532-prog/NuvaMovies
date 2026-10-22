package p219l4;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p172i4.C4858d;
import p233m4.AbstractC5594b;
import p233m4.AbstractC5595c;

/* renamed from: l4.c1 */
/* loaded from: classes.dex */
public final class C5360c1 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m21698a(C5367f c5367f, Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, c5367f.f21956a);
        AbstractC5595c.m22741i(parcel, 2, c5367f.f21957b);
        AbstractC5595c.m22741i(parcel, 3, c5367f.f21958c);
        AbstractC5595c.m22746n(parcel, 4, c5367f.f21959d, false);
        AbstractC5595c.m22740h(parcel, 5, c5367f.f21960e, false);
        AbstractC5595c.m22748p(parcel, 6, c5367f.f21961f, i10, false);
        AbstractC5595c.m22737e(parcel, 7, c5367f.f21962g, false);
        AbstractC5595c.m22745m(parcel, 8, c5367f.f21963h, i10, false);
        AbstractC5595c.m22748p(parcel, 10, c5367f.f21964i, i10, false);
        AbstractC5595c.m22748p(parcel, 11, c5367f.f21965j, i10, false);
        AbstractC5595c.m22735c(parcel, 12, c5367f.f21966k);
        AbstractC5595c.m22741i(parcel, 13, c5367f.f21967l);
        AbstractC5595c.m22735c(parcel, 14, c5367f.f21968m);
        AbstractC5595c.m22746n(parcel, 15, c5367f.m21727g(), false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m22730u = AbstractC5594b.m22730u(parcel);
        Scope[] scopeArr = C5367f.f21954o;
        Bundle bundle = new Bundle();
        C4858d[] c4858dArr = C5367f.f21955p;
        C4858d[] c4858dArr2 = c4858dArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < m22730u) {
            int m22723n = AbstractC5594b.m22723n(parcel);
            switch (AbstractC5594b.m22718i(m22723n)) {
                case 1:
                    i10 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                case 2:
                    i11 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                case 3:
                    i12 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                case 4:
                    str = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
                case 5:
                    iBinder = AbstractC5594b.m22724o(parcel, m22723n);
                    break;
                case 6:
                    scopeArr = (Scope[]) AbstractC5594b.m22715f(parcel, m22723n, Scope.CREATOR);
                    break;
                case 7:
                    bundle = AbstractC5594b.m22710a(parcel, m22723n);
                    break;
                case 8:
                    account = (Account) AbstractC5594b.m22712c(parcel, m22723n, Account.CREATOR);
                    break;
                case 9:
                default:
                    AbstractC5594b.m22729t(parcel, m22723n);
                    break;
                case 10:
                    c4858dArr = (C4858d[]) AbstractC5594b.m22715f(parcel, m22723n, C4858d.CREATOR);
                    break;
                case 11:
                    c4858dArr2 = (C4858d[]) AbstractC5594b.m22715f(parcel, m22723n, C4858d.CREATOR);
                    break;
                case 12:
                    z10 = AbstractC5594b.m22719j(parcel, m22723n);
                    break;
                case 13:
                    i13 = AbstractC5594b.m22725p(parcel, m22723n);
                    break;
                case 14:
                    z11 = AbstractC5594b.m22719j(parcel, m22723n);
                    break;
                case 15:
                    str2 = AbstractC5594b.m22713d(parcel, m22723n);
                    break;
            }
        }
        AbstractC5594b.m22717h(parcel, m22730u);
        return new C5367f(i10, i11, i12, str, iBinder, scopeArr, bundle, account, c4858dArr, c4858dArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5367f[i10];
    }
}
