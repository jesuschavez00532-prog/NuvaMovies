package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i6 */
/* loaded from: classes.dex */
public final class RunnableC2329i6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Boolean f8686a;

    /* renamed from: b */
    final /* synthetic */ C2406p6 f8687b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2329i6(C2406p6 c2406p6, Boolean bool) {
        this.f8687b = c2406p6;
        this.f8686a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8687b.m9964O(this.f8686a, true);
    }
}
