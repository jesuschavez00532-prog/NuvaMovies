package p007a6;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p395x5.C7503f;

/* renamed from: a6.u */
/* loaded from: classes.dex */
public abstract class AbstractC0102u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.u$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f337a;

        /* renamed from: b */
        final /* synthetic */ AtomicLong f338b;

        /* renamed from: a6.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C7793a extends AbstractRunnableC0066c {

            /* renamed from: a */
            final /* synthetic */ Runnable f339a;

            C7793a(Runnable runnable) {
                this.f339a = runnable;
            }

            @Override // p007a6.AbstractRunnableC0066c
            /* renamed from: a */
            public void mo228a() {
                this.f339a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f337a = str;
            this.f338b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C7793a(runnable));
            newThread.setName(this.f337a + this.f338b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.u$b */
    /* loaded from: classes.dex */
    public class b extends AbstractRunnableC0066c {

        /* renamed from: a */
        final /* synthetic */ String f341a;

        /* renamed from: b */
        final /* synthetic */ ExecutorService f342b;

        /* renamed from: c */
        final /* synthetic */ long f343c;

        /* renamed from: d */
        final /* synthetic */ TimeUnit f344d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f341a = str;
            this.f342b = executorService;
            this.f343c = j10;
            this.f344d = timeUnit;
        }

        @Override // p007a6.AbstractRunnableC0066c
        /* renamed from: a */
        public void mo228a() {
            try {
                C7503f.m28716f().m28717b("Executing shutdown hook for " + this.f341a);
                this.f342b.shutdown();
                if (!this.f342b.awaitTermination(this.f343c, this.f344d)) {
                    C7503f.m28716f().m28717b(this.f341a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f342b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C7503f.m28716f().m28717b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f341a));
                this.f342b.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    private static void m461a(String str, ExecutorService executorService) {
        m462b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    private static void m462b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m463c(String str) {
        ExecutorService m465e = m465e(m464d(str), new ThreadPoolExecutor.DiscardPolicy());
        m461a(str, m465e);
        return m465e;
    }

    /* renamed from: d */
    public static ThreadFactory m464d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    /* renamed from: e */
    private static ExecutorService m465e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
