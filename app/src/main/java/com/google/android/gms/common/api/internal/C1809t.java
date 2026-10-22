package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p127f5.C4247j;
import p172i4.C4858d;
import p203k4.AbstractC5120q;
import p203k4.InterfaceC5113j;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* loaded from: classes.dex */
public final class C1809t extends AbstractC5120q {

    /* renamed from: b */
    private final AbstractC1792c f7612b;

    /* renamed from: c */
    private final C4247j f7613c;

    /* renamed from: d */
    private final InterfaceC5113j f7614d;

    public C1809t(int i10, AbstractC1792c abstractC1792c, C4247j c4247j, InterfaceC5113j interfaceC5113j) {
        super(i10);
        this.f7613c = c4247j;
        this.f7612b = abstractC1792c;
        this.f7614d = interfaceC5113j;
        if (i10 == 2 && abstractC1792c.m7969c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1811v
    /* renamed from: a */
    public final void mo8039a(Status status) {
        this.f7613c.m17727d(this.f7614d.mo20741a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1811v
    /* renamed from: b */
    public final void mo8040b(Exception exc) {
        this.f7613c.m17727d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1811v
    /* renamed from: c */
    public final void mo8041c(C1801l c1801l) {
        try {
            this.f7612b.mo7968b(c1801l.m8025u(), this.f7613c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            mo8039a(AbstractC1811v.m8046e(e11));
        } catch (RuntimeException e12) {
            this.f7613c.m17727d(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1811v
    /* renamed from: d */
    public final void mo8043d(C1794e c1794e, boolean z10) {
        c1794e.m7979b(this.f7613c, z10);
    }

    @Override // p203k4.AbstractC5120q
    /* renamed from: f */
    public final boolean mo8044f(C1801l c1801l) {
        return this.f7612b.m7969c();
    }

    @Override // p203k4.AbstractC5120q
    /* renamed from: g */
    public final C4858d[] mo8045g(C1801l c1801l) {
        return this.f7612b.m7971e();
    }
}
