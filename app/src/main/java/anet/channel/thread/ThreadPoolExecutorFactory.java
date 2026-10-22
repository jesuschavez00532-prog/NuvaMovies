package anet.channel.thread;

import anet.channel.util.ALog;
import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.Progress;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ThreadPoolExecutorFactory {

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor f4186a = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC1011b("AWCN Scheduler"));

    /* renamed from: b */
    private static ThreadPoolExecutor f4187b;

    /* renamed from: c */
    private static ThreadPoolExecutor f4188c;

    /* renamed from: d */
    private static ThreadPoolExecutor f4189d;

    /* renamed from: e */
    private static ThreadPoolExecutor f4190e;

    /* renamed from: f */
    private static ThreadPoolExecutor f4191f;

    /* renamed from: g */
    private static ThreadPoolExecutor f4192g;

    /* renamed from: h */
    private static ThreadPoolExecutor f4193h;

    /* loaded from: classes.dex */
    public static class Priority {
        public static int HIGH = 0;
        public static int LOW = 9;
        public static int NORMAL = 1;
    }

    /* renamed from: anet.channel.thread.ThreadPoolExecutorFactory$a */
    /* loaded from: classes.dex */
    static class RunnableC1010a implements Comparable<RunnableC1010a>, Runnable {

        /* renamed from: a */
        Runnable f4194a;

        /* renamed from: b */
        int f4195b;

        /* renamed from: c */
        long f4196c;

        public RunnableC1010a(Runnable runnable, int i10) {
            this.f4194a = null;
            this.f4195b = 0;
            this.f4196c = System.currentTimeMillis();
            this.f4194a = runnable;
            this.f4195b = i10;
            this.f4196c = System.currentTimeMillis();
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(RunnableC1010a runnableC1010a) {
            int i10 = this.f4195b;
            int i11 = runnableC1010a.f4195b;
            if (i10 != i11) {
                return i10 - i11;
            }
            return (int) (runnableC1010a.f4196c - this.f4196c);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4194a.run();
        }
    }

    /* renamed from: anet.channel.thread.ThreadPoolExecutorFactory$b */
    /* loaded from: classes.dex */
    private static class ThreadFactoryC1011b implements ThreadFactory {

        /* renamed from: a */
        AtomicInteger f4197a = new AtomicInteger(0);

        /* renamed from: b */
        String f4198b;

        ThreadFactoryC1011b(String str) {
            this.f4198b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f4198b + this.f4197a.incrementAndGet());
            ALog.m4788i("awcn.ThreadPoolExecutorFactory", "thread created!", null, SerializableCookie.NAME, thread.getName());
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f4187b = new ThreadPoolExecutor(2, 2, 60L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC1011b("AWCN Worker(H)"));
        f4188c = new C1012a(16, 16, 60L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC1011b("AWCN Worker(M)"));
        f4189d = new ThreadPoolExecutor(2, 2, 60L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC1011b("AWCN Worker(L)"));
        f4190e = new ThreadPoolExecutor(32, 32, 60L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC1011b("AWCN Worker(Backup)"));
        f4191f = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC1011b("AWCN Detector"));
        f4192g = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC1011b("AWCN HR"));
        f4193h = new ThreadPoolExecutor(1, 1, 30L, timeUnit, new LinkedBlockingDeque(), new ThreadFactoryC1011b("AWCN Cookie"));
        f4187b.allowCoreThreadTimeOut(true);
        f4188c.allowCoreThreadTimeOut(true);
        f4189d.allowCoreThreadTimeOut(true);
        f4190e.allowCoreThreadTimeOut(true);
        f4191f.allowCoreThreadTimeOut(true);
        f4192g.allowCoreThreadTimeOut(true);
        f4193h.allowCoreThreadTimeOut(true);
    }

    public static void removeScheduleTask(Runnable runnable) {
        f4186a.remove(runnable);
    }

    public static synchronized void setNormalExecutorPoolSize(int i10) {
        synchronized (ThreadPoolExecutorFactory.class) {
            if (i10 < 6) {
                i10 = 6;
            }
            f4188c.setCorePoolSize(i10);
            f4188c.setMaximumPoolSize(i10);
        }
    }

    public static Future<?> submitBackupTask(Runnable runnable) {
        return f4190e.submit(runnable);
    }

    public static Future<?> submitCookieMonitor(Runnable runnable) {
        return f4193h.submit(runnable);
    }

    public static Future<?> submitDetectTask(Runnable runnable) {
        return f4191f.submit(runnable);
    }

    public static Future<?> submitHRTask(Runnable runnable) {
        return f4192g.submit(runnable);
    }

    public static Future<?> submitPriorityTask(Runnable runnable, int i10) {
        if (ALog.isPrintLog(1)) {
            ALog.m4785d("awcn.ThreadPoolExecutorFactory", "submit priority task", null, Progress.PRIORITY, Integer.valueOf(i10));
        }
        if (i10 < Priority.HIGH || i10 > Priority.LOW) {
            i10 = Priority.LOW;
        }
        if (i10 == Priority.HIGH) {
            return f4187b.submit(runnable);
        }
        if (i10 == Priority.LOW) {
            return f4189d.submit(runnable);
        }
        return f4188c.submit(new RunnableC1010a(runnable, i10));
    }

    public static Future<?> submitScheduledTask(Runnable runnable) {
        return f4186a.submit(runnable);
    }

    public static Future<?> submitScheduledTask(Runnable runnable, long j10, TimeUnit timeUnit) {
        return f4186a.schedule(runnable, j10, timeUnit);
    }
}
