package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a6 */
/* loaded from: classes.dex */
public final class RunnableC2240a6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f8359a;

    /* renamed from: b */
    final /* synthetic */ String f8360b;

    /* renamed from: c */
    final /* synthetic */ String f8361c;

    /* renamed from: d */
    final /* synthetic */ C2406p6 f8362d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2240a6(C2406p6 c2406p6, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f8362d = c2406p6;
        this.f8359a = atomicReference;
        this.f8360b = str2;
        this.f8361c = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8362d.f8714a.m10029L().m9498U(this.f8359a, null, this.f8360b, this.f8361c);
    }
}
