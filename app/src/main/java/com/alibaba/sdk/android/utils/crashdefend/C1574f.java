package com.alibaba.sdk.android.utils.crashdefend;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.utils.crashdefend.f */
/* loaded from: classes.dex */
final class C1574f {

    /* renamed from: a */
    private final ThreadFactory f6082a = new ThreadFactory() { // from class: com.alibaba.sdk.android.utils.crashdefend.f.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "safe_thread");
            thread.setDaemon(false);
            return thread;
        }
    };

    /* renamed from: b */
    private ExecutorService f6083b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized ExecutorService m7265a() {
        if (this.f6083b == null) {
            this.f6083b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), this.f6082a);
        }
        return this.f6083b;
    }
}
