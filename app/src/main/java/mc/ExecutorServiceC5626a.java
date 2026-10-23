package mc;

import android.util.SparseArray;
import be.C1328x;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: mc.a */
/* loaded from: classes3.dex */
public final class ExecutorServiceC5626a implements ExecutorService, Executor {

    /* renamed from: b */
    private RunnableC5630e f22679b;

    /* renamed from: d */
    private long f22681d;

    /* renamed from: f */
    private long f22683f;

    /* renamed from: a */
    private final ArrayDeque f22678a = new ArrayDeque();

    /* renamed from: c */
    private final SparseArray f22680c = new SparseArray();

    /* renamed from: e */
    private final HashMap f22682e = new HashMap();

    /* renamed from: mc.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: b */
        final /* synthetic */ Runnable f22685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Runnable runnable) {
            super(0);
            this.f22685b = runnable;
        }

        /* renamed from: a */
        public final void m22830a() {
            ExecutorServiceC5626a.this.m22829c().remove(this.f22685b.hashCode());
            ExecutorServiceC5626a.this.m22828d();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22830a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: b */
    private final void m22827b(String str) {
        if (C5634i.m22853o()) {
            int i10 = 0;
            if (System.currentTimeMillis() - this.f22681d > 30000) {
                SparseArray sparseArray = this.f22680c;
                int size = sparseArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    sparseArray.keyAt(i11);
                    C5628c c5628c = (C5628c) sparseArray.valueAt(i11);
                    if (System.currentTimeMillis() - c5628c.m22832a() > 30000) {
                        c5628c.m22834c();
                        AbstractC5635j.m22862d("ThreadPool", "该任务耗时过久，请判断是否需要优化代码\n" + c5628c.m22833b(), null, 4, null);
                    }
                }
                this.f22681d = System.currentTimeMillis();
            }
            Integer num = (Integer) this.f22682e.get(str);
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            if (System.currentTimeMillis() - this.f22683f > 5000 && intValue > 5) {
                AbstractC5635j.m22862d("ThreadPool", "该任务被频繁添加，请判断是否需要优化代码\n" + str, null, 4, null);
            } else {
                i10 = intValue;
            }
            this.f22682e.put(str, Integer.valueOf(i10));
            return;
        }
        this.f22680c.clear();
        this.f22682e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final synchronized void m22828d() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3;
        int i10 = 0;
        ThreadPoolExecutor threadPoolExecutor4;
        int i11 = 0;
        ThreadPoolExecutor threadPoolExecutor5;
        ThreadPoolExecutor threadPoolExecutor6;
        ThreadPoolExecutor threadPoolExecutor7;
        int i12 = 0;
        threadPoolExecutor = AbstractC5637l.f22714g;
        int activeCount = threadPoolExecutor.getActiveCount();
        threadPoolExecutor2 = AbstractC5637l.f22714g;
        int size = threadPoolExecutor2.getQueue().size();
        if (this.f22678a.size() > 1000) {
            threadPoolExecutor7 = AbstractC5637l.f22714g;
            i12 = AbstractC5637l.f22711d;
            threadPoolExecutor7.setCorePoolSize(i12);
        } else if (this.f22678a.size() > 100) {
            threadPoolExecutor4 = AbstractC5637l.f22714g;
            i11 = AbstractC5637l.f22710c;
            threadPoolExecutor4.setCorePoolSize(i11);
        } else {
            threadPoolExecutor3 = AbstractC5637l.f22714g;
            i10 = AbstractC5637l.f22709b;
            threadPoolExecutor3.setCorePoolSize(i10);
        }
        if (size <= 10) {
            threadPoolExecutor5 = AbstractC5637l.f22714g;
            if (activeCount < threadPoolExecutor5.getCorePoolSize()) {
                Object poll = this.f22678a.poll();
                RunnableC5630e runnableC5630e = (RunnableC5630e) poll;
                this.f22679b = runnableC5630e;
                if (poll != null) {
                    if (runnableC5630e != null) {
                        this.f22680c.put(runnableC5630e.m22838a().hashCode(), new C5628c(runnableC5630e.m22839b()));
                    }
                    threadPoolExecutor6 = AbstractC5637l.f22714g;
                    threadPoolExecutor6.execute(this.f22679b);
                    this.f22679b = null;
                }
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        ThreadPoolExecutor threadPoolExecutor;
        AbstractC5868k.m23674f(timeUnit, "unit");
        threadPoolExecutor = AbstractC5637l.f22714g;
        return threadPoolExecutor.awaitTermination(j10, timeUnit);
    }

    /* renamed from: c */
    public final SparseArray m22829c() {
        return this.f22680c;
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        String m22874h;
        AbstractC5868k.m23674f(runnable, "r");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        AbstractC5868k.m23673e(stackTrace, "currentThread().stackTrace");
        m22874h = AbstractC5637l.m22874h(stackTrace);
        m22827b(m22874h);
        this.f22678a.offer(new RunnableC5630e(runnable, m22874h, new a(runnable)));
        if (this.f22679b == null) {
            m22828d();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        ThreadPoolExecutor threadPoolExecutor;
        AbstractC5868k.m23674f(collection, "tasks");
        threadPoolExecutor = AbstractC5637l.f22714g;
        List invokeAll = threadPoolExecutor.invokeAll(collection);
        AbstractC5868k.m23673e(invokeAll, "threadPoolExecutor.invokeAll(tasks)");
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        ThreadPoolExecutor threadPoolExecutor;
        AbstractC5868k.m23674f(collection, "tasks");
        threadPoolExecutor = AbstractC5637l.f22714g;
        return threadPoolExecutor.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = AbstractC5637l.f22714g;
        return threadPoolExecutor.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = AbstractC5637l.f22714g;
        return threadPoolExecutor.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = AbstractC5637l.f22714g;
        threadPoolExecutor.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = AbstractC5637l.f22714g;
        List<Runnable> shutdownNow = threadPoolExecutor.shutdownNow();
        AbstractC5868k.m23673e(shutdownNow, "threadPoolExecutor.shutdownNow()");
        return shutdownNow;
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        ThreadPoolExecutor threadPoolExecutor;
        AbstractC5868k.m23674f(callable, "task");
        threadPoolExecutor = AbstractC5637l.f22714g;
        Future submit = threadPoolExecutor.submit(callable);
        AbstractC5868k.m23673e(submit, "threadPoolExecutor.submit(task)");
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        ThreadPoolExecutor threadPoolExecutor;
        AbstractC5868k.m23674f(collection, "tasks");
        AbstractC5868k.m23674f(timeUnit, "unit");
        threadPoolExecutor = AbstractC5637l.f22714g;
        List invokeAll = threadPoolExecutor.invokeAll(collection, j10, timeUnit);
        AbstractC5868k.m23673e(invokeAll, "threadPoolExecutor.invokeAll(tasks, timeout, unit)");
        return invokeAll;
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        ThreadPoolExecutor threadPoolExecutor;
        AbstractC5868k.m23674f(collection, "tasks");
        AbstractC5868k.m23674f(timeUnit, "unit");
        threadPoolExecutor = AbstractC5637l.f22714g;
        return threadPoolExecutor.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        ThreadPoolExecutor threadPoolExecutor;
        AbstractC5868k.m23674f(runnable, "task");
        threadPoolExecutor = AbstractC5637l.f22714g;
        Future submit = threadPoolExecutor.submit(runnable, obj);
        AbstractC5868k.m23673e(submit, "threadPoolExecutor.submit(task, result)");
        return submit;
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        ThreadPoolExecutor threadPoolExecutor;
        AbstractC5868k.m23674f(runnable, "task");
        threadPoolExecutor = AbstractC5637l.f22714g;
        Future<?> submit = threadPoolExecutor.submit(runnable);
        AbstractC5868k.m23673e(submit, "threadPoolExecutor.submit(task)");
        return submit;
    }
}
