package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import p025b5.C1113k;
import p025b5.InterfaceC1112j;
import p107e0.AbstractC4106a;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC4106a implements InterfaceC1112j {

    /* renamed from: c */
    private C1113k f8320c;

    @Override // p025b5.InterfaceC1112j
    /* renamed from: a */
    public void mo5080a(Context context, Intent intent) {
        AbstractC4106a.m17175c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f8320c == null) {
            this.f8320c = new C1113k(this);
        }
        this.f8320c.m5081a(context, intent);
    }
}
