package anet.channel.strategy.utils;

import anet.channel.strategy.dispatch.C0990a;
import anet.channel.util.ALog;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anet.channel.strategy.utils.a */
/* loaded from: classes.dex */
public class C1006a {

    /* renamed from: a */
    private static AtomicInteger f4184a = new AtomicInteger(0);

    /* renamed from: b */
    private static ScheduledThreadPoolExecutor f4185b = null;

    /* renamed from: a */
    static ScheduledThreadPoolExecutor m4772a() {
        if (f4185b == null) {
            synchronized (C1006a.class) {
                if (f4185b == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(2, new ThreadFactoryC1007b());
                    f4185b = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
                    f4185b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f4185b;
    }

    /* renamed from: a */
    public static void m4773a(Runnable runnable) {
        try {
            m4772a().submit(runnable);
        } catch (Exception e10) {
            ALog.m4786e(C0990a.TAG, "submit task failed", null, e10, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m4774a(Runnable runnable, long j10) {
        try {
            m4772a().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            ALog.m4786e(C0990a.TAG, "schedule task failed", null, e10, new Object[0]);
        }
    }
}
