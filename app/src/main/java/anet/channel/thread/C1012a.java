package anet.channel.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: anet.channel.thread.a */
/* loaded from: classes.dex */
class C1012a extends ThreadPoolExecutor {
    public C1012a(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t10) {
        return new a(runnable, t10);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new a(callable);
    }

    /* renamed from: anet.channel.thread.a$a */
    /* loaded from: classes.dex */
    class a<V> extends FutureTask<V> implements Comparable<a<V>> {

        /* renamed from: b */
        private Object f4200b;

        public a(Callable<V> callable) {
            super(callable);
            this.f4200b = callable;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a<V> aVar) {
            if (this == aVar) {
                return 0;
            }
            if (aVar == null) {
                return -1;
            }
            Object obj = this.f4200b;
            if (obj != null && aVar.f4200b != null && obj.getClass().equals(aVar.f4200b.getClass())) {
                Object obj2 = this.f4200b;
                if (obj2 instanceof Comparable) {
                    return ((Comparable) obj2).compareTo(aVar.f4200b);
                }
            }
            return 0;
        }

        public a(Runnable runnable, V v10) {
            super(runnable, v10);
            this.f4200b = runnable;
        }
    }
}
