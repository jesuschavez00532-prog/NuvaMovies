package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e6 */
/* loaded from: classes.dex */
public final class RunnableC2285e6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f8574a;

    /* renamed from: b */
    final /* synthetic */ C2406p6 f8575b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2285e6(C2406p6 c2406p6, AtomicReference atomicReference) {
        this.f8575b = c2406p6;
        this.f8574a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8574a) {
            try {
                this.f8574a.set(this.f8575b.f8714a.m10051z().m9634x(this.f8575b.f8714a.m10020B().m9528s(), AbstractC2260c3.f8432M));
            } finally {
                this.f8574a.notify();
            }
        }
    }
}
