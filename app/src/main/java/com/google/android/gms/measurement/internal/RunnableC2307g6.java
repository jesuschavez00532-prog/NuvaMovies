package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g6 */
/* loaded from: classes.dex */
public final class RunnableC2307g6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f8614a;

    /* renamed from: b */
    final /* synthetic */ C2406p6 f8615b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2307g6(C2406p6 c2406p6, AtomicReference atomicReference) {
        this.f8615b = c2406p6;
        this.f8614a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8614a) {
            try {
                this.f8614a.set(Integer.valueOf(this.f8615b.f8714a.m10051z().m9625o(this.f8615b.f8714a.m10020B().m9528s(), AbstractC2260c3.f8434O)));
            } finally {
                this.f8614a.notify();
            }
        }
    }
}
