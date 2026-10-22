package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c6 */
/* loaded from: classes.dex */
public final class RunnableC2263c6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f8503a;

    /* renamed from: b */
    final /* synthetic */ String f8504b;

    /* renamed from: c */
    final /* synthetic */ String f8505c;

    /* renamed from: d */
    final /* synthetic */ boolean f8506d;

    /* renamed from: e */
    final /* synthetic */ C2406p6 f8507e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2263c6(C2406p6 c2406p6, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f8507e = c2406p6;
        this.f8503a = atomicReference;
        this.f8504b = str2;
        this.f8505c = str3;
        this.f8506d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8507e.f8714a.m10029L().m9500W(this.f8503a, null, this.f8504b, this.f8505c, this.f8506d);
    }
}
