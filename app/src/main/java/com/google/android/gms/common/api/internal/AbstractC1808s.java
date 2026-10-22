package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p127f5.C4247j;
import p187j4.C4988b;
import p203k4.AbstractC5120q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.s */
/* loaded from: classes.dex */
public abstract class AbstractC1808s extends AbstractC5120q {

    /* renamed from: b */
    protected final C4247j f7611b;

    public AbstractC1808s(int i10, C4247j c4247j) {
        super(i10);
        this.f7611b = c4247j;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1811v
    /* renamed from: a */
    public final void mo8039a(Status status) {
        this.f7611b.m17727d(new C4988b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1811v
    /* renamed from: b */
    public final void mo8040b(Exception exc) {
        this.f7611b.m17727d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1811v
    /* renamed from: c */
    public final void mo8041c(C1801l c1801l) {
        try {
            mo8042h(c1801l);
        } catch (DeadObjectException e10) {
            mo8039a(AbstractC1811v.m8046e(e10));
            throw e10;
        } catch (RemoteException e11) {
            mo8039a(AbstractC1811v.m8046e(e11));
        } catch (RuntimeException e12) {
            this.f7611b.m17727d(e12);
        }
    }

    /* renamed from: h */
    protected abstract void mo8042h(C1801l c1801l);
}
