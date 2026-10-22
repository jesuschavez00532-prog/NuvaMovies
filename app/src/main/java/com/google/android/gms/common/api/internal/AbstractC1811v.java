package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: classes.dex */
public abstract class AbstractC1811v {

    /* renamed from: a */
    public final int f7615a;

    public AbstractC1811v(int i10) {
        this.f7615a = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m8046e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo8039a(Status status);

    /* renamed from: b */
    public abstract void mo8040b(Exception exc);

    /* renamed from: c */
    public abstract void mo8041c(C1801l c1801l);

    /* renamed from: d */
    public abstract void mo8043d(C1794e c1794e, boolean z10);
}
