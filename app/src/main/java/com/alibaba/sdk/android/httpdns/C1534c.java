package com.alibaba.sdk.android.httpdns;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.httpdns.c */
/* loaded from: classes.dex */
public class C1534c {

    /* renamed from: a */
    private static final ExecutorService f5895a;

    /* renamed from: a */
    private static final ThreadFactory f5896a;

    /* renamed from: a */
    private static final TimeUnit f5897a;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f5897a = timeUnit;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.alibaba.sdk.android.httpdns.c.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("httpdns worker");
                thread.setDaemon(false);
                thread.setUncaughtExceptionHandler(new C1547k());
                return thread;
            }
        };
        f5896a = threadFactory;
        f5895a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1L, timeUnit, new SynchronousQueue(), threadFactory);
    }

    /* renamed from: a */
    public static ExecutorService m7102a() {
        return f5895a;
    }
}
