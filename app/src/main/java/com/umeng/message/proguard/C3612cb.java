package com.umeng.message.proguard;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.message.proguard.cb */
/* loaded from: classes3.dex */
public class C3612cb {

    /* renamed from: a */
    private static volatile ScheduledThreadPoolExecutor f16126a;

    /* renamed from: b */
    private static final Handler f16127b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static final ThreadFactory f16128c = new ThreadFactory() { // from class: com.umeng.message.proguard.cb.1

        /* renamed from: a */
        private final AtomicInteger f16129a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "union-" + this.f16129a.incrementAndGet());
        }
    };

    /* renamed from: com.umeng.message.proguard.cb$a */
    /* loaded from: classes3.dex */
    static class a implements Runnable {

        /* renamed from: a */
        private final Runnable f16130a;

        public a(Runnable runnable) {
            this.f16130a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Runnable runnable = this.f16130a;
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor m15498a() {
        if (f16126a == null) {
            synchronized (C3612cb.class) {
                if (f16126a == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors(), 4)), f16128c);
                    f16126a = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(3L, TimeUnit.SECONDS);
                    f16126a.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f16126a;
    }

    /* renamed from: b */
    public static void m15500b(Runnable runnable) {
        a aVar = new a(runnable);
        if (Looper.myLooper() == f16127b.getLooper()) {
            m15499a(aVar);
        } else {
            aVar.run();
        }
    }

    /* renamed from: c */
    public static void m15501c(Runnable runnable) {
        a aVar = new a(runnable);
        Looper myLooper = Looper.myLooper();
        Handler handler = f16127b;
        if (myLooper == handler.getLooper()) {
            aVar.run();
        } else {
            handler.post(aVar);
        }
    }

    /* renamed from: a */
    public static void m15499a(Runnable runnable) {
        try {
            m15498a().execute(runnable);
        } catch (Throwable th) {
            C3615ce.m15512d("Executor", "execute", th.getMessage());
        }
    }

    /* renamed from: a */
    public static <V> Future<V> m15497a(Callable<V> callable, long j10, TimeUnit timeUnit) {
        try {
            return m15498a().schedule(callable, j10, timeUnit);
        } catch (Throwable unused) {
            C3615ce.m15512d("Executor", "schedule exception");
            return null;
        }
    }
}
