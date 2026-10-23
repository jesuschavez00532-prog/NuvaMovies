package ve;

import ee.InterfaceC4184g;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p359ue.AbstractC7165s;
import re.AbstractC6578f;

/* renamed from: ve.p */
/* loaded from: classes3.dex */
public final class C7305p extends AbstractC7324v0 {

    /* renamed from: c */
    private static final int f27200c;

    /* renamed from: d */
    private static boolean f27201d;

    /* renamed from: e */
    public static final C7305p f27202e = new C7305p();
    private static volatile Executor pool;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ve.p$a */
    /* loaded from: classes3.dex */
    public static final class a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ AtomicInteger f27203a;

        a(AtomicInteger atomicInteger) {
            this.f27203a = atomicInteger;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "CommonPool-worker-" + this.f27203a.incrementAndGet());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ve.p$b */
    /* loaded from: classes3.dex */
    public static final class b implements Runnable {

        /* renamed from: a */
        public static final b f27204a = new b();

        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    static {
        String str;
        int i10 = 0;
        Integer m27716c;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            m27716c = AbstractC7165s.m27716c(str);
            if (m27716c != null && m27716c.intValue() >= 1) {
                i10 = m27716c.intValue();
            } else {
                throw new IllegalStateException(("Expected positive number in kotlinx.coroutines.default.parallelism, but has " + str).toString());
            }
        } else {
            i10 = -1;
        }
        f27200c = i10;
    }

    private C7305p() {
    }

    /* renamed from: A */
    private final ExecutorService m28254A() {
        Class<?> cls;
        ExecutorService executorService;
        Object obj;
        if (System.getSecurityManager() != null) {
            return m28257z();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            if (!f27201d && f27200c < 0) {
                try {
                    Method method = cls.getMethod("commonPool", new Class[0]);
                    if (method != null) {
                        obj = method.invoke(null, new Object[0]);
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof ExecutorService)) {
                        obj = null;
                    }
                    executorService = (ExecutorService) obj;
                } catch (Throwable unused2) {
                    executorService = null;
                }
                if (executorService != null) {
                    if (!f27202e.m28258D(cls, executorService)) {
                        executorService = null;
                    }
                    if (executorService != null) {
                        return executorService;
                    }
                }
            }
            try {
                Object newInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(f27202e.m28256C()));
                if (!(newInstance instanceof ExecutorService)) {
                    newInstance = null;
                }
                executorService2 = (ExecutorService) newInstance;
            } catch (Throwable unused3) {
            }
            if (executorService2 != null) {
                return executorService2;
            }
            return m28257z();
        }
        return m28257z();
    }

    /* renamed from: B */
    private final synchronized Executor m28255B() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = m28254A();
            pool = executor;
        }
        return executor;
    }

    /* renamed from: C */
    private final int m28256C() {
        boolean z10;
        int m25673a;
        Integer valueOf = Integer.valueOf(f27200c);
        if (valueOf.intValue() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            valueOf = null;
        }
        if (valueOf == null) {
            m25673a = AbstractC6578f.m25673a(Runtime.getRuntime().availableProcessors() - 1, 1);
            return m25673a;
        }
        return valueOf.intValue();
    }

    /* renamed from: z */
    private final ExecutorService m28257z() {
        return Executors.newFixedThreadPool(m28256C(), new a(new AtomicInteger()));
    }

    /* renamed from: D */
    public final boolean m28258D(Class cls, ExecutorService executorService) {
        executorService.submit(b.f27204a);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
        }
        if (num == null || num.intValue() < 1) {
            return false;
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // ve.AbstractC7329x
    public String toString() {
        return "CommonPool";
    }

    @Override // ve.AbstractC7329x
    /* renamed from: x */
    public void mo21239x(InterfaceC4184g interfaceC4184g, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = m28255B();
            }
            AbstractC7319t1.m28299a();
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            AbstractC7319t1.m28299a();
            RunnableC7276f0.f27165h.m28285O(runnable);
        }
    }
}
