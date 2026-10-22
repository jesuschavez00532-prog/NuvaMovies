package com.efs.sdk.base.core.util.concurrent;

import com.efs.sdk.base.core.util.Log;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class WorkThreadUtil {
    public static final int DEFAULT_THREAD_POOL_MAX_CNT = 2;

    /* renamed from: a */
    private static ThreadPoolExecutor f7205a = new ThreadPoolExecutor(2, 2, 10, TimeUnit.MINUTES, new LinkedBlockingQueue(Integer.MAX_VALUE), new ThreadPoolExecutor.DiscardOldestPolicy());

    public static Future<?> submit(Runnable runnable) {
        try {
            return f7205a.submit(runnable);
        } catch (Throwable th) {
            Log.m7727e("efs.util.concurrent", "submit task error!", th);
            return null;
        }
    }
}
