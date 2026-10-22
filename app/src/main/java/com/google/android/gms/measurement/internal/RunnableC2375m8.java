package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import anet.channel.entity.ConnType;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m8 */
/* loaded from: classes.dex */
public final class RunnableC2375m8 implements Runnable {

    /* renamed from: a */
    final long f8840a;

    /* renamed from: b */
    final long f8841b;

    /* renamed from: c */
    final /* synthetic */ C2386n8 f8842c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2375m8(C2386n8 c2386n8, long j10, long j11) {
        this.f8842c = c2386n8;
        this.f8840a = j10;
        this.f8841b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8842c.f8869b.f8714a.mo9575a().m9897z(new Runnable() { // from class: com.google.android.gms.measurement.internal.l8
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC2375m8 runnableC2375m8 = RunnableC2375m8.this;
                C2386n8 c2386n8 = runnableC2375m8.f8842c;
                long j10 = runnableC2375m8.f8840a;
                long j11 = runnableC2375m8.f8841b;
                c2386n8.f8869b.mo9428h();
                c2386n8.f8869b.f8714a.mo9577b().m9799q().m9699a("Application going to the background");
                c2386n8.f8869b.f8714a.m10024F().f8350q.m10081a(true);
                Bundle bundle = new Bundle();
                if (!c2386n8.f8869b.f8714a.m10051z().m9616D()) {
                    c2386n8.f8869b.f9044e.m10009b(j11);
                    c2386n8.f8869b.f9044e.m10011d(false, false, j11);
                }
                c2386n8.f8869b.f8714a.m10026I().m10003v(ConnType.PK_AUTO, "_ab", j10, bundle);
            }
        });
    }
}
