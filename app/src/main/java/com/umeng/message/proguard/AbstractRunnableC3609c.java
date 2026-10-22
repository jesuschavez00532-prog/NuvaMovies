package com.umeng.message.proguard;

import java.util.concurrent.Future;

/* renamed from: com.umeng.message.proguard.c */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC3609c implements Runnable {

    /* renamed from: a */
    protected Future<?> f16121a;

    /* renamed from: a */
    public final AbstractRunnableC3609c m15483a() {
        this.f16121a = mo15382b();
        return this;
    }

    /* renamed from: b */
    protected abstract Future<?> mo15382b();

    /* renamed from: c */
    public final void m15484c() {
        Future<?> future = this.f16121a;
        if (future != null) {
            try {
                if (!future.isCancelled() && !future.isDone()) {
                    future.cancel(false);
                }
            } catch (Throwable unused) {
            }
        }
        this.f16121a = null;
    }

    /* renamed from: d */
    public final boolean m15485d() {
        Future<?> future = this.f16121a;
        if (future != null && !future.isDone()) {
            return true;
        }
        return false;
    }
}
