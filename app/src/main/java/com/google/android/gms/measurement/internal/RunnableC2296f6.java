package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f6 */
/* loaded from: classes.dex */
public final class RunnableC2296f6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f8595a;

    /* renamed from: b */
    final /* synthetic */ C2406p6 f8596b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2296f6(C2406p6 c2406p6, AtomicReference atomicReference) {
        this.f8596b = c2406p6;
        this.f8595a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8595a) {
            try {
                this.f8595a.set(Long.valueOf(this.f8596b.f8714a.m10051z().m9628r(this.f8596b.f8714a.m10020B().m9528s(), AbstractC2260c3.f8433N)));
            } finally {
                this.f8595a.notify();
            }
        }
    }
}
