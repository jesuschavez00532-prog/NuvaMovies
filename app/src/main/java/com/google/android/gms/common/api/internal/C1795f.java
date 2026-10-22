package com.google.android.gms.common.api.internal;

import android.app.Activity;
import p172i4.C4854b;
import p172i4.C4868i;
import p203k4.C5104b;
import p203k4.InterfaceC5108e;
import p214l.C5304b;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.common.api.internal.f */
/* loaded from: classes.dex */
public final class C1795f extends AbstractDialogInterfaceOnCancelListenerC1815z {

    /* renamed from: f */
    private final C5304b f7570f;

    /* renamed from: g */
    private final C1791b f7571g;

    C1795f(InterfaceC5108e interfaceC5108e, C1791b c1791b, C4868i c4868i) {
        super(interfaceC5108e, c4868i);
        this.f7570f = new C5304b();
        this.f7571g = c1791b;
        this.f7532a.mo20747Z0("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m7983u(Activity activity, C1791b c1791b, C5104b c5104b) {
        InterfaceC5108e m7917c = LifecycleCallback.m7917c(activity);
        C1795f c1795f = (C1795f) m7917c.mo20748d3("ConnectionlessLifecycleHelper", C1795f.class);
        if (c1795f == null) {
            c1795f = new C1795f(m7917c, c1791b, C4868i.m20041m());
        }
        AbstractC5391n.m21784j(c5104b, "ApiKey cannot be null");
        c1795f.f7570f.add(c5104b);
        c1791b.m7961c(c1795f);
    }

    /* renamed from: v */
    private final void m7984v() {
        if (!this.f7570f.isEmpty()) {
            this.f7571g.m7961c(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: h */
    public final void mo7924h() {
        super.mo7924h();
        m7984v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1815z, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo7926j() {
        super.mo7926j();
        m7984v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1815z, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public final void mo7927k() {
        super.mo7927k();
        this.f7571g.m7962d(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1815z
    /* renamed from: m */
    protected final void mo7985m(C4854b c4854b, int i10) {
        this.f7571g.m7958F(c4854b, i10);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterfaceOnCancelListenerC1815z
    /* renamed from: n */
    protected final void mo7986n() {
        this.f7571g.m7959a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final C5304b m7987t() {
        return this.f7570f;
    }
}
