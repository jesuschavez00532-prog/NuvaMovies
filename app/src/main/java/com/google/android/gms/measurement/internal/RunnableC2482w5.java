package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w5 */
/* loaded from: classes.dex */
public final class RunnableC2482w5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f9182a;

    /* renamed from: b */
    final /* synthetic */ String f9183b;

    /* renamed from: c */
    final /* synthetic */ Object f9184c;

    /* renamed from: d */
    final /* synthetic */ long f9185d;

    /* renamed from: e */
    final /* synthetic */ C2406p6 f9186e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2482w5(C2406p6 c2406p6, String str, String str2, Object obj, long j10) {
        this.f9186e = c2406p6;
        this.f9182a = str;
        this.f9183b = str2;
        this.f9184c = obj;
        this.f9185d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9186e.m9982M(this.f9182a, this.f9183b, this.f9184c, this.f9185d);
    }
}
