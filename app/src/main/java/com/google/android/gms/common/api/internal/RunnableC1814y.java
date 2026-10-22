package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import p172i4.C4854b;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.y */
/* loaded from: classes.dex */
public final class RunnableC1814y implements Runnable {

    /* renamed from: a */
    private final C1812w f7620a;

    /* renamed from: b */
    final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC1815z f7621b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1814y(AbstractDialogInterfaceOnCancelListenerC1815z abstractDialogInterfaceOnCancelListenerC1815z, C1812w c1812w) {
        this.f7621b = abstractDialogInterfaceOnCancelListenerC1815z;
        this.f7620a = c1812w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f7621b.f7622b) {
            return;
        }
        C4854b m8048b = this.f7620a.m8048b();
        if (m8048b.m20020k()) {
            AbstractDialogInterfaceOnCancelListenerC1815z abstractDialogInterfaceOnCancelListenerC1815z = this.f7621b;
            abstractDialogInterfaceOnCancelListenerC1815z.f7532a.startActivityForResult(GoogleApiActivity.m7909a(abstractDialogInterfaceOnCancelListenerC1815z.m7920b(), (PendingIntent) AbstractC5391n.m21783i(m8048b.m20019j()), this.f7620a.m8047a(), false), 1);
            return;
        }
        AbstractDialogInterfaceOnCancelListenerC1815z abstractDialogInterfaceOnCancelListenerC1815z2 = this.f7621b;
        if (abstractDialogInterfaceOnCancelListenerC1815z2.f7625e.mo20042b(abstractDialogInterfaceOnCancelListenerC1815z2.m7920b(), m8048b.m20017g(), null) != null) {
            AbstractDialogInterfaceOnCancelListenerC1815z abstractDialogInterfaceOnCancelListenerC1815z3 = this.f7621b;
            abstractDialogInterfaceOnCancelListenerC1815z3.f7625e.m20058v(abstractDialogInterfaceOnCancelListenerC1815z3.m7920b(), this.f7621b.f7532a, m8048b.m20017g(), 2, this.f7621b);
        } else {
            if (m8048b.m20017g() != 18) {
                this.f7621b.m8050l(m8048b, this.f7620a.m8047a());
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC1815z abstractDialogInterfaceOnCancelListenerC1815z4 = this.f7621b;
            Dialog m20053q = abstractDialogInterfaceOnCancelListenerC1815z4.f7625e.m20053q(abstractDialogInterfaceOnCancelListenerC1815z4.m7920b(), this.f7621b);
            AbstractDialogInterfaceOnCancelListenerC1815z abstractDialogInterfaceOnCancelListenerC1815z5 = this.f7621b;
            abstractDialogInterfaceOnCancelListenerC1815z5.f7625e.m20054r(abstractDialogInterfaceOnCancelListenerC1815z5.m7920b().getApplicationContext(), new C1813x(this, m20053q));
        }
    }
}
