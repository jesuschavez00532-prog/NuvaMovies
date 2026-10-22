package com.umeng.message.proguard;

import com.umeng.message.common.UPLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.message.proguard.b */
/* loaded from: classes3.dex */
public class C3581b {

    /* renamed from: a */
    private static volatile ScheduledThreadPoolExecutor f16040a;

    /* renamed from: b */
    private static volatile ScheduledThreadPoolExecutor f16041b;

    /* renamed from: c */
    private static volatile ScheduledExecutorService f16042c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.b$a */
    /* loaded from: classes3.dex */
    public static final class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f16043a = new AtomicInteger();

        /* renamed from: b */
        private final String f16044b;

        a(String str) {
            this.f16044b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f16044b + " " + this.f16043a.incrementAndGet());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.b$b */
    /* loaded from: classes3.dex */
    public static class b implements Runnable {

        /* renamed from: a */
        private final Runnable f16045a;

        public b(Runnable runnable) {
            this.f16045a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Runnable runnable = this.f16045a;
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                UPLog.m15196e("Executors", th);
            }
        }
    }

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor m15372a() {
        if (f16040a == null) {
            synchronized (C3581b.class) {
                if (f16040a == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new a("pool"));
                    f16040a = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
                    f16040a.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f16040a;
    }

    /* renamed from: b */
    private static ScheduledExecutorService m15375b() {
        if (f16042c == null) {
            synchronized (C3581b.class) {
                if (f16042c == null) {
                    f16042c = Executors.newSingleThreadScheduledExecutor(new a("single"));
                }
            }
        }
        return f16042c;
    }

    /* renamed from: c */
    private static ExecutorService m15377c() {
        if (f16041b == null) {
            synchronized (C3581b.class) {
                if (f16041b == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("msg"));
                    f16041b = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(30L, TimeUnit.SECONDS);
                    f16041b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f16041b;
    }

    /* renamed from: d */
    private static Runnable m15379d(Runnable runnable) {
        return new b(runnable);
    }

    /* renamed from: b */
    public static Future<?> m15374b(Runnable runnable) {
        try {
            return m15375b().submit(m15379d(runnable));
        } catch (Throwable th) {
            UPLog.m15196e("Executors", th);
            return null;
        }
    }

    /* renamed from: a */
    public static ScheduledFuture<?> m15371a(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            return m15375b().schedule(m15379d(runnable), j10, timeUnit);
        } catch (Throwable th) {
            UPLog.m15196e("Executors", th);
            return null;
        }
    }

    /* renamed from: b */
    public static ScheduledFuture<?> m15376b(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            return m15372a().schedule(m15379d(runnable), j10, timeUnit);
        } catch (Throwable th) {
            UPLog.m15196e("Executors", th);
            return null;
        }
    }

    /* renamed from: c */
    public static void m15378c(Runnable runnable) {
        try {
            m15372a().execute(m15379d(runnable));
        } catch (Throwable th) {
            UPLog.m15196e("Executors", th);
        }
    }

    /* renamed from: a */
    public static void m15373a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            m15377c().execute(m15379d(runnable));
        } catch (Throwable th) {
            UPLog.m15196e("Executors", th);
        }
    }
}
