package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.analytics.pro.av */
/* loaded from: classes3.dex */
public class C3300av {

    /* renamed from: a */
    private static final String f14037a = "UMExecutor";

    /* renamed from: b */
    private static volatile ScheduledThreadPoolExecutor f14038b;

    /* renamed from: c */
    private static final ThreadFactory f14039c = new ThreadFactory() { // from class: com.umeng.analytics.pro.av.1

        /* renamed from: a */
        private final AtomicInteger f14040a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ccg-" + this.f14040a.incrementAndGet());
        }
    };

    /* renamed from: a */
    private static ScheduledThreadPoolExecutor m13806a() {
        if (f14038b == null) {
            synchronized (C3300av.class) {
                if (f14038b == null) {
                    f14038b = new ScheduledThreadPoolExecutor(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors(), 4)), f14039c);
                    f14038b.setKeepAliveTime(3L, TimeUnit.SECONDS);
                    f14038b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f14038b;
    }

    /* renamed from: a */
    public static void m13807a(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            m13806a().schedule(runnable, j10, timeUnit);
        } catch (Throwable th) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "schedule error:" + th.getMessage());
        }
    }
}
