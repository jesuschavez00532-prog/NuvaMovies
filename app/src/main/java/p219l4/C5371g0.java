package p219l4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p233m4.AbstractC5593a;
import p233m4.AbstractC5595c;

/* renamed from: l4.g0 */
/* loaded from: classes.dex */
public final class C5371g0 extends AbstractC5593a {
    public static final Parcelable.Creator<C5371g0> CREATOR = new C5374h0();

    /* renamed from: a */
    final int f21980a;

    /* renamed from: b */
    private final Account f21981b;

    /* renamed from: c */
    private final int f21982c;

    /* renamed from: d */
    private final GoogleSignInAccount f21983d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5371g0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f21980a = i10;
        this.f21981b = account;
        this.f21982c = i11;
        this.f21983d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m22733a = AbstractC5595c.m22733a(parcel);
        AbstractC5595c.m22741i(parcel, 1, this.f21980a);
        AbstractC5595c.m22745m(parcel, 2, this.f21981b, i10, false);
        AbstractC5595c.m22741i(parcel, 3, this.f21982c);
        AbstractC5595c.m22745m(parcel, 4, this.f21983d, i10, false);
        AbstractC5595c.m22734b(parcel, m22733a);
    }

    public C5371g0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
