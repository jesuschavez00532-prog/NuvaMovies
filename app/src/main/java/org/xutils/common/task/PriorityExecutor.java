package org.xutils.common.task;

import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class PriorityExecutor implements Executor {
    private static final int CORE_POOL_SIZE = 5;
    private static final int KEEP_ALIVE = 1;
    private static final int MAXIMUM_POOL_SIZE = 256;
    private final ThreadPoolExecutor mThreadPoolExecutor;
    private static final AtomicLong SEQ_SEED = new AtomicLong(0);
    private static final ThreadFactory sThreadFactory = new ThreadFactoryC6080a();
    private static final Comparator<Runnable> FIFO_CMP = new C6081b();
    private static final Comparator<Runnable> FILO_CMP = new C6082c();

    /* renamed from: org.xutils.common.task.PriorityExecutor$a */
    /* loaded from: classes3.dex */
    static class ThreadFactoryC6080a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f23995a = new AtomicInteger(1);

        ThreadFactoryC6080a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "xTID#" + this.f23995a.getAndIncrement());
        }
    }

    /* renamed from: org.xutils.common.task.PriorityExecutor$b */
    /* loaded from: classes3.dex */
    static class C6081b implements Comparator {
        C6081b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Runnable runnable, Runnable runnable2) {
            if ((runnable instanceof RunnableC6086a) && (runnable2 instanceof RunnableC6086a)) {
                RunnableC6086a runnableC6086a = (RunnableC6086a) runnable;
                RunnableC6086a runnableC6086a2 = (RunnableC6086a) runnable2;
                int ordinal = runnableC6086a.f24015b.ordinal() - runnableC6086a2.f24015b.ordinal();
                if (ordinal == 0) {
                    return (int) (runnableC6086a.f24014a - runnableC6086a2.f24014a);
                }
                return ordinal;
            }
            return 0;
        }
    }

    /* renamed from: org.xutils.common.task.PriorityExecutor$c */
    /* loaded from: classes3.dex */
    static class C6082c implements Comparator {
        C6082c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Runnable runnable, Runnable runnable2) {
            if ((runnable instanceof RunnableC6086a) && (runnable2 instanceof RunnableC6086a)) {
                RunnableC6086a runnableC6086a = (RunnableC6086a) runnable;
                RunnableC6086a runnableC6086a2 = (RunnableC6086a) runnable2;
                int ordinal = runnableC6086a.f24015b.ordinal() - runnableC6086a2.f24015b.ordinal();
                if (ordinal == 0) {
                    return (int) (runnableC6086a2.f24014a - runnableC6086a.f24014a);
                }
                return ordinal;
            }
            return 0;
        }
    }

    public PriorityExecutor(boolean z10) {
        this(5, z10);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable instanceof RunnableC6086a) {
            ((RunnableC6086a) runnable).f24014a = SEQ_SEED.getAndIncrement();
        }
        this.mThreadPoolExecutor.execute(runnable);
    }

    public int getPoolSize() {
        return this.mThreadPoolExecutor.getCorePoolSize();
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return this.mThreadPoolExecutor;
    }

    public boolean isBusy() {
        if (this.mThreadPoolExecutor.getActiveCount() >= this.mThreadPoolExecutor.getCorePoolSize()) {
            return true;
        }
        return false;
    }

    public void setPoolSize(int i10) {
        if (i10 > 0) {
            this.mThreadPoolExecutor.setCorePoolSize(i10);
        }
    }

    public PriorityExecutor(int i10, boolean z10) {
        this.mThreadPoolExecutor = new ThreadPoolExecutor(i10, 256, 1L, TimeUnit.SECONDS, new PriorityBlockingQueue(256, z10 ? FIFO_CMP : FILO_CMP), sThreadFactory);
    }
}
