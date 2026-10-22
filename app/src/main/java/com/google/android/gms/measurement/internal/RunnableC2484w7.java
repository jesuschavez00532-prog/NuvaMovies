package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.w7 */
/* loaded from: classes.dex */
final class RunnableC2484w7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComponentName f9192a;

    /* renamed from: b */
    final /* synthetic */ ServiceConnectionC2242a8 f9193b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2484w7(ServiceConnectionC2242a8 serviceConnectionC2242a8, ComponentName componentName) {
        this.f9193b = serviceConnectionC2242a8;
        this.f9192a = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2254b8.m9487M(this.f9193b.f8366c, this.f9192a);
    }
}
