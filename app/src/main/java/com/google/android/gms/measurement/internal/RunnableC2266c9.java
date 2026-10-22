package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import anet.channel.entity.ConnType;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.c9 */
/* loaded from: classes.dex */
final class RunnableC2266c9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f8517a;

    /* renamed from: b */
    final /* synthetic */ String f8518b = "_err";

    /* renamed from: c */
    final /* synthetic */ Bundle f8519c;

    /* renamed from: d */
    final /* synthetic */ C2277d9 f8520d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2266c9(C2277d9 c2277d9, String str, String str2, Bundle bundle) {
        this.f8520d = c2277d9;
        this.f8517a = str;
        this.f8519c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8520d.f8550a.m9593k((C2465v) AbstractC5391n.m21783i(this.f8520d.f8550a.m9588h0().m9956w0(this.f8517a, this.f8518b, this.f8519c, ConnType.PK_AUTO, this.f8520d.f8550a.mo9578c().mo24747a(), false, true)), this.f8517a);
    }
}
