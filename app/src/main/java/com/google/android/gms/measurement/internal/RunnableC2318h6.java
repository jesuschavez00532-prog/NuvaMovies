package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.h6 */
/* loaded from: classes.dex */
public final class RunnableC2318h6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f8669a;

    /* renamed from: b */
    final /* synthetic */ C2406p6 f8670b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2318h6(C2406p6 c2406p6, AtomicReference atomicReference) {
        this.f8670b = c2406p6;
        this.f8669a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8669a) {
            try {
                this.f8669a.set(Double.valueOf(this.f8670b.f8714a.m10051z().m9621k(this.f8670b.f8714a.m10020B().m9528s(), AbstractC2260c3.f8435P)));
            } finally {
                this.f8669a.notify();
            }
        }
    }
}
