package p256o1;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o1.a */
/* loaded from: classes.dex */
public final class ExecutorServiceC5901a implements ExecutorService {

    /* renamed from: b */
    private static final long f23477b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    private static volatile int f23478c;

    /* renamed from: a */
    private final ExecutorService f23479a;

    /* renamed from: o1.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final boolean f23480a;

        /* renamed from: b */
        private int f23481b;

        /* renamed from: c */
        private int f23482c;

        /* renamed from: d */
        private ThreadFactory f23483d = new c();

        /* renamed from: e */
        private e f23484e = e.f23498d;

        /* renamed from: f */
        private String f23485f;

        /* renamed from: g */
        private long f23486g;

        b(boolean z10) {
            this.f23480a = z10;
        }

        /* renamed from: a */
        public ExecutorServiceC5901a m23846a() {
            if (!TextUtils.isEmpty(this.f23485f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f23481b, this.f23482c, this.f23486g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f23483d, this.f23485f, this.f23484e, this.f23480a));
                if (this.f23486g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new ExecutorServiceC5901a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f23485f);
        }

        /* renamed from: b */
        public b m23847b(String str) {
            this.f23485f = str;
            return this;
        }

        /* renamed from: c */
        public b m23848c(int i10) {
            this.f23481b = i10;
            this.f23482c = i10;
            return this;
        }
    }

    /* renamed from: o1.a$c */
    /* loaded from: classes.dex */
    private static final class c implements ThreadFactory {

        /* renamed from: o1.a$c$a */
        /* loaded from: classes.dex */
        class a extends Thread {
            a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1.a$d */
    /* loaded from: classes.dex */
    public static final class d implements ThreadFactory {

        /* renamed from: a */
        private final ThreadFactory f23488a;

        /* renamed from: b */
        private final String f23489b;

        /* renamed from: c */
        final e f23490c;

        /* renamed from: d */
        final boolean f23491d;

        /* renamed from: e */
        private final AtomicInteger f23492e = new AtomicInteger();

        /* renamed from: o1.a$d$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Runnable f23493a;

            a(Runnable runnable) {
                this.f23493a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f23491d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f23493a.run();
                } catch (Throwable th) {
                    d.this.f23490c.mo23849a(th);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f23488a = threadFactory;
            this.f23489b = str;
            this.f23490c = eVar;
            this.f23491d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f23488a.newThread(new a(runnable));
            newThread.setName("glide-" + this.f23489b + "-thread-" + this.f23492e.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: o1.a$e */
    /* loaded from: classes.dex */
    public interface e {

        /* renamed from: a */
        public static final e f23495a = new a();

        /* renamed from: b */
        public static final e f23496b;

        /* renamed from: c */
        public static final e f23497c;

        /* renamed from: d */
        public static final e f23498d;

        /* renamed from: o1.a$e$a */
        /* loaded from: classes.dex */
        class a implements e {
            a() {
            }

            @Override // p256o1.ExecutorServiceC5901a.e
            /* renamed from: a */
            public void mo23849a(Throwable th) {
            }
        }

        /* renamed from: o1.a$e$b */
        /* loaded from: classes.dex */
        class b implements e {
            b() {
            }

            @Override // p256o1.ExecutorServiceC5901a.e
            /* renamed from: a */
            public void mo23849a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        /* renamed from: o1.a$e$c */
        /* loaded from: classes.dex */
        class c implements e {
            c() {
            }

            @Override // p256o1.ExecutorServiceC5901a.e
            /* renamed from: a */
            public void mo23849a(Throwable th) {
                if (th == null) {
                } else {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f23496b = bVar;
            f23497c = new c();
            f23498d = bVar;
        }

        /* renamed from: a */
        void mo23849a(Throwable th);
    }

    ExecutorServiceC5901a(ExecutorService executorService) {
        this.f23479a = executorService;
    }

    /* renamed from: a */
    static int m23837a() {
        if (m23838b() >= 4) {
            return 2;
        }
        return 1;
    }

    /* renamed from: b */
    public static int m23838b() {
        if (f23478c == 0) {
            f23478c = Math.min(4, AbstractC5902b.m23850a());
        }
        return f23478c;
    }

    /* renamed from: c */
    public static b m23839c() {
        return new b(true).m23848c(m23837a()).m23847b("animation");
    }

    /* renamed from: d */
    public static ExecutorServiceC5901a m23840d() {
        return m23839c().m23846a();
    }

    /* renamed from: e */
    public static b m23841e() {
        return new b(true).m23848c(1).m23847b("disk-cache");
    }

    /* renamed from: f */
    public static ExecutorServiceC5901a m23842f() {
        return m23841e().m23846a();
    }

    /* renamed from: g */
    public static b m23843g() {
        return new b(false).m23848c(m23838b()).m23847b("source");
    }

    /* renamed from: h */
    public static ExecutorServiceC5901a m23844h() {
        return m23843g().m23846a();
    }

    /* renamed from: i */
    public static ExecutorServiceC5901a m23845i() {
        return new ExecutorServiceC5901a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f23477b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f23498d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f23479a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f23479a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f23479a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f23479a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f23479a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f23479a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f23479a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f23479a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f23479a.submit(runnable);
    }

    public String toString() {
        return this.f23479a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f23479a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f23479a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f23479a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f23479a.submit(callable);
    }
}
