package com.umeng.umzid;

import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.umzid.c */
/* loaded from: classes3.dex */
public class C3740c {

    /* renamed from: a */
    public static volatile ScheduledThreadPoolExecutor f16772a;

    /* renamed from: b */
    public static ThreadFactory f16773b = new a();

    /* renamed from: com.umeng.umzid.c$a */
    /* loaded from: classes3.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        public AtomicInteger f16774a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("ZIDThreadPoolExecutor" + this.f16774a.addAndGet(1));
            return thread;
        }
    }

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor m15904a() {
        if (f16772a == null) {
            synchronized (C3740c.class) {
                if (f16772a == null) {
                    f16772a = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 4, f16773b);
                }
            }
        }
        return f16772a;
    }

    /* renamed from: a */
    public static void m15905a(Runnable runnable) {
        try {
            m15904a().execute(runnable);
        } catch (Throwable unused) {
            Log.e("com.umeng.umzid.c", "UmengThreadPoolExecutorFactory execute exception");
        }
    }
}
