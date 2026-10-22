package com.efs.sdk.launch;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.launch.a */
/* loaded from: classes.dex */
public class C1738a {

    /* renamed from: a */
    private static final String f7252a = "com.efs.sdk.launch.a";

    /* renamed from: b */
    private static volatile ScheduledThreadPoolExecutor f7253b;

    /* renamed from: c */
    private static ThreadFactory f7254c = new ThreadFactory() { // from class: com.efs.sdk.launch.a.1

        /* renamed from: a */
        private AtomicInteger f7255a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("LaunchThreadPoolExecutor" + this.f7255a.addAndGet(1));
            return thread;
        }
    };

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor m7793a() {
        if (f7253b == null) {
            synchronized (C1738a.class) {
                if (f7253b == null) {
                    f7253b = new ScheduledThreadPoolExecutor(4, f7254c);
                }
            }
        }
        return f7253b;
    }

    /* renamed from: a */
    public static void m7794a(Runnable runnable) {
        try {
            m7793a().execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
