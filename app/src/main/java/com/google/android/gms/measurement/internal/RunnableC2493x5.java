package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x5 */
/* loaded from: classes.dex */
public final class RunnableC2493x5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f9212a;

    /* renamed from: b */
    final /* synthetic */ C2406p6 f9213b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2493x5(C2406p6 c2406p6, long j10) {
        this.f9213b = c2406p6;
        this.f9212a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9213b.m10007z(this.f9212a, true);
        this.f9213b.f8714a.m10029L().m9496S(new AtomicReference());
    }
}
