package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y */
/* loaded from: classes.dex */
public final class RunnableC2498y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f9221a;

    /* renamed from: b */
    final /* synthetic */ long f9222b;

    /* renamed from: c */
    final /* synthetic */ C2236a2 f9223c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2498y(C2236a2 c2236a2, String str, long j10) {
        this.f9223c = c2236a2;
        this.f9221a = str;
        this.f9222b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2236a2.m9420j(this.f9223c, this.f9221a, this.f9222b);
    }
}
