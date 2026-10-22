package com.alibaba.sdk.android.httpdns;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.alibaba.sdk.android.httpdns.j */
/* loaded from: classes.dex */
public class C1546j {

    /* renamed from: a */
    private static ScheduledExecutorService f5961a;

    /* renamed from: a */
    private static final ThreadFactory f5962a = new ThreadFactory() { // from class: com.alibaba.sdk.android.httpdns.j.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("httpdns worker");
            thread.setDaemon(false);
            thread.setUncaughtExceptionHandler(new C1547k());
            return thread;
        }
    };

    /* renamed from: a */
    public static synchronized ScheduledExecutorService m7168a() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (C1546j.class) {
            if (f5961a == null) {
                f5961a = new ScheduledThreadPoolExecutor(1, f5962a);
            }
            scheduledExecutorService = f5961a;
        }
        return scheduledExecutorService;
    }
}
