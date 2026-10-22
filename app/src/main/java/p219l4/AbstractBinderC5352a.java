package p219l4;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import p219l4.InterfaceC5376i;

/* renamed from: l4.a */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5352a extends InterfaceC5376i.a {
    /* renamed from: d */
    public static Account m21642d(InterfaceC5376i interfaceC5376i) {
        Account account = null;
        if (interfaceC5376i != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC5376i.mo21746e();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }
}
