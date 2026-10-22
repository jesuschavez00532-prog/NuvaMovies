package p042cb;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cb.a */
/* loaded from: classes2.dex */
public class ThreadFactoryC1440a implements ThreadFactory {

    /* renamed from: a */
    private final ThreadGroup f5549a;

    /* renamed from: b */
    private final AtomicInteger f5550b = new AtomicInteger(1);

    /* renamed from: c */
    private final String f5551c;

    public ThreadFactoryC1440a() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            threadGroup = securityManager.getThreadGroup();
        } else {
            threadGroup = Thread.currentThread().getThreadGroup();
        }
        this.f5549a = threadGroup;
        this.f5551c = "Rx-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f5549a, runnable, this.f5551c + this.f5550b.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
