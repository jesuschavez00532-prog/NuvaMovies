package com.alibaba.sdk.android.httpdns.p047d;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.httpdns.d.a */
/* loaded from: classes.dex */
final class C1537a {

    /* renamed from: b */
    private ExecutorService f5906b;

    /* renamed from: b */
    private final ThreadFactory f5907b = new ThreadFactory() { // from class: com.alibaba.sdk.android.httpdns.d.a.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "report_thread");
            thread.setDaemon(false);
            return thread;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized ExecutorService m7125b() {
        if (this.f5906b == null) {
            this.f5906b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), this.f5907b);
        }
        return this.f5906b;
    }
}
