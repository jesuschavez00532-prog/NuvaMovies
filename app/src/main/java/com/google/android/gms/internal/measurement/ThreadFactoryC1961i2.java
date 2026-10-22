package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.i2 */
/* loaded from: classes.dex */
public final class ThreadFactoryC1961i2 implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f7813a = Executors.defaultThreadFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadFactoryC1961i2(C2201y2 c2201y2) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f7813a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
