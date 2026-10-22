package com.efs.sdk.net.p057a;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.net.a.b */
/* loaded from: classes.dex */
public class C1765b {

    /* renamed from: a */
    private static final String f7366a = "com.efs.sdk.net.a.b";

    /* renamed from: b */
    private static volatile ScheduledThreadPoolExecutor f7367b;

    /* renamed from: c */
    private static ThreadFactory f7368c = new ThreadFactory() { // from class: com.efs.sdk.net.a.b.1

        /* renamed from: a */
        private AtomicInteger f7369a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("NetThreadPoolExecutor" + this.f7369a.addAndGet(1));
            return thread;
        }
    };

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor m7859a() {
        if (f7367b == null) {
            synchronized (C1765b.class) {
                if (f7367b == null) {
                    f7367b = new ScheduledThreadPoolExecutor(4, f7368c);
                }
            }
        }
        return f7367b;
    }

    /* renamed from: a */
    public static void m7860a(Runnable runnable) {
        try {
            m7859a().execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
