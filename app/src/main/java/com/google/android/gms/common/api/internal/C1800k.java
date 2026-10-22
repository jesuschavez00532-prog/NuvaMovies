package com.google.android.gms.common.api.internal;

import android.os.Handler;
import p219l4.AbstractC5358c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.k */
/* loaded from: classes.dex */
public final class C1800k implements AbstractC5358c.e {

    /* renamed from: a */
    final /* synthetic */ C1801l f7577a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1800k(C1801l c1801l) {
        this.f7577a = c1801l;
    }

    @Override // p219l4.AbstractC5358c.e
    /* renamed from: a */
    public final void mo7988a() {
        Handler handler;
        handler = this.f7577a.f7590m.f7557p;
        handler.post(new RunnableC1799j(this));
    }
}
