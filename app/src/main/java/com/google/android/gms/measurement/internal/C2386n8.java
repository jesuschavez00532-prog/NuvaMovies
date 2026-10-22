package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n8 */
/* loaded from: classes.dex */
public final class C2386n8 {

    /* renamed from: a */
    private RunnableC2375m8 f8868a;

    /* renamed from: b */
    final /* synthetic */ C2430r8 f8869b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2386n8(C2430r8 c2430r8) {
        this.f8869b = c2430r8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9875a(long j10) {
        Handler handler;
        this.f8868a = new RunnableC2375m8(this, this.f8869b.f8714a.mo9578c().mo24747a(), j10);
        handler = this.f8869b.f9042c;
        handler.postDelayed(this.f8868a, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m9876b() {
        Handler handler;
        this.f8869b.mo9428h();
        RunnableC2375m8 runnableC2375m8 = this.f8868a;
        if (runnableC2375m8 != null) {
            handler = this.f8869b.f9042c;
            handler.removeCallbacks(runnableC2375m8);
        }
        this.f8869b.f8714a.m10024F().f8350q.m10081a(false);
    }
}
