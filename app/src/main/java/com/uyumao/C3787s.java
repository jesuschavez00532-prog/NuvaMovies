package com.uyumao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.uyumao.s */
/* loaded from: classes3.dex */
public class C3787s {

    /* renamed from: a */
    public static volatile ScheduledThreadPoolExecutor f16997a;

    /* renamed from: b */
    public static volatile ExecutorService f16998b;

    /* renamed from: c */
    public static final ThreadFactory f16999c = new a();

    /* renamed from: com.uyumao.s$a */
    /* loaded from: classes3.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f17000a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Azx-" + this.f17000a.incrementAndGet());
        }
    }

    /* renamed from: com.uyumao.s$b */
    /* loaded from: classes3.dex */
    public static class b implements Runnable {

        /* renamed from: a */
        public final Runnable f17001a;

        public b(Runnable runnable) {
            this.f17001a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Runnable runnable = this.f17001a;
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor m16050a() {
        if (f16997a == null) {
            synchronized (C3787s.class) {
                if (f16997a == null) {
                    f16997a = new ScheduledThreadPoolExecutor(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors(), 4)), f16999c);
                    f16997a.setKeepAliveTime(3L, TimeUnit.SECONDS);
                    f16997a.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f16997a;
    }

    /* renamed from: a */
    public static Future<?> m16049a(Runnable runnable) {
        try {
            if (f16998b == null) {
                synchronized (C3787s.class) {
                    if (f16998b == null) {
                        f16998b = Executors.newSingleThreadExecutor(f16999c);
                    }
                }
            }
            return f16998b.submit(new b(runnable));
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    public static void m16051a(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            m16050a().schedule(runnable, j10, timeUnit);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
