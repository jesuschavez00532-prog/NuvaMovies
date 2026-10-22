package p219l4;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p394x4.AbstractC7493a;
import p394x4.AbstractC7495c;

/* renamed from: l4.m1 */
/* loaded from: classes.dex */
public final class C5390m1 extends AbstractC7493a implements InterfaceC5376i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5390m1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // p219l4.InterfaceC5376i
    /* renamed from: e */
    public final Account mo21746e() {
        Parcel m28694a = m28694a(2, m28695d());
        Account account = (Account) AbstractC7495c.m28696a(m28694a, Account.CREATOR);
        m28694a.recycle();
        return account;
    }
}
