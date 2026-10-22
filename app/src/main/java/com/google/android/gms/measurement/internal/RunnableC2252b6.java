package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b6 */
/* loaded from: classes.dex */
public final class RunnableC2252b6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f8392a;

    /* renamed from: b */
    final /* synthetic */ C2406p6 f8393b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2252b6(C2406p6 c2406p6, AtomicReference atomicReference) {
        this.f8393b = c2406p6;
        this.f8392a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8392a) {
            try {
                this.f8392a.set(Boolean.valueOf(this.f8393b.f8714a.m10051z().m9614B(this.f8393b.f8714a.m10020B().m9528s(), AbstractC2260c3.f8431L)));
            } finally {
                this.f8392a.notify();
            }
        }
    }
}
