package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l4 */
/* loaded from: classes.dex */
public final class C2360l4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f8778a;

    /* renamed from: b */
    final /* synthetic */ C2393o4 f8779b;

    public C2360l4(C2393o4 c2393o4, String str) {
        this.f8779b = c2393o4;
        AbstractC5391n.m21783i(str);
        this.f8778a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f8779b.f8714a.mo9577b().m9800r().m9700b(this.f8778a, th);
    }
}
