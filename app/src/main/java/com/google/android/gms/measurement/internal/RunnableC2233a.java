package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a */
/* loaded from: classes.dex */
public final class RunnableC2233a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f8327a;

    /* renamed from: b */
    final /* synthetic */ long f8328b;

    /* renamed from: c */
    final /* synthetic */ C2236a2 f8329c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2233a(C2236a2 c2236a2, String str, long j10) {
        this.f8329c = c2236a2;
        this.f8327a = str;
        this.f8328b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2236a2.m9419i(this.f8329c, this.f8327a, this.f8328b);
    }
}
