package com.efs.sdk.h5pagesdk;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.h5pagesdk.a */
/* loaded from: classes.dex */
public class C1735a {
    private static final String TAG = "com.efs.sdk.h5pagesdk.a";

    /* renamed from: i */
    private static volatile ScheduledThreadPoolExecutor f7235i;

    /* renamed from: j */
    private static ThreadFactory f7236j = new ThreadFactory() { // from class: com.efs.sdk.h5pagesdk.a.1

        /* renamed from: k */
        private AtomicInteger f7237k = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("H5ThreadPoolExecutor" + this.f7237k.addAndGet(1));
            return thread;
        }
    };

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor m7789a() {
        if (f7235i == null) {
            synchronized (C1735a.class) {
                if (f7235i == null) {
                    f7235i = new ScheduledThreadPoolExecutor(4, f7236j);
                }
            }
        }
        return f7235i;
    }

    public static void execute(Runnable runnable) {
        try {
            m7789a().execute(runnable);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
