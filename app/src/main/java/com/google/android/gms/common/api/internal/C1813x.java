package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import p203k4.AbstractC5118o;

/* renamed from: com.google.android.gms.common.api.internal.x */
/* loaded from: classes.dex */
final class C1813x extends AbstractC5118o {

    /* renamed from: a */
    final /* synthetic */ Dialog f7618a;

    /* renamed from: b */
    final /* synthetic */ RunnableC1814y f7619b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1813x(RunnableC1814y runnableC1814y, Dialog dialog) {
        this.f7619b = runnableC1814y;
        this.f7618a = dialog;
    }

    @Override // p203k4.AbstractC5118o
    /* renamed from: a */
    public final void mo8049a() {
        this.f7619b.f7621b.m8051o();
        if (this.f7618a.isShowing()) {
            this.f7618a.dismiss();
        }
    }
}
