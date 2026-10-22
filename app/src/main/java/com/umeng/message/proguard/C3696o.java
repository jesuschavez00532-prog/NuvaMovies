package com.umeng.message.proguard;

import java.lang.ref.WeakReference;
import java.util.concurrent.Future;

/* renamed from: com.umeng.message.proguard.o */
/* loaded from: classes3.dex */
public final class C3696o {

    /* renamed from: a */
    public static WeakReference<Future<?>> f16551a;

    /* renamed from: b */
    private static WeakReference<Future<?>> f16552b;

    /* renamed from: a */
    public static synchronized void m15793a() {
        Future<?> future;
        synchronized (C3696o.class) {
            WeakReference<Future<?>> weakReference = f16552b;
            if (weakReference != null && (future = weakReference.get()) != null && !future.isDone() && !future.isCancelled()) {
                return;
            }
            f16552b = new WeakReference<>(C3581b.m15374b(new RunnableC3692m()));
        }
    }
}
