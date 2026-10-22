package p348u2;

import android.os.Process;
import android.text.TextUtils;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p231m2.AbstractC5584b;

/* renamed from: u2.g */
/* loaded from: classes.dex */
public abstract class AbstractC7030g {

    /* renamed from: u2.g$b */
    /* loaded from: classes.dex */
    private static final class b {

        /* renamed from: a */
        static final ScheduledThreadPoolExecutor f26400a = new c(2, 32, 100, TimeUnit.MILLISECONDS, new d("base-cpu"));
    }

    /* renamed from: u2.g$c */
    /* loaded from: classes.dex */
    private static final class c extends ScheduledThreadPoolExecutor {
        public c(int i10, int i11, long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            super(i10, threadFactory);
            setMaximumPoolSize(i11);
            setKeepAliveTime(j10, timeUnit);
        }
    }

    /* renamed from: u2.g$d */
    /* loaded from: classes.dex */
    private static final class d extends AtomicLong implements ThreadFactory {

        /* renamed from: a */
        final String f26401a;

        /* renamed from: b */
        final int f26402b;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f26401a + '-' + incrementAndGet());
            thread.setPriority(this.f26402b);
            thread.setDaemon(true);
            return thread;
        }

        private d(String str) {
            this(str, 5);
        }

        private d(String str, int i10) {
            this.f26401a = str;
            this.f26402b = i10;
        }
    }

    /* renamed from: u2.g$e */
    /* loaded from: classes.dex */
    private static final class e {

        /* renamed from: a */
        static final ScheduledThreadPoolExecutor f26403a = new c(4, 512, 1, TimeUnit.SECONDS, new d("base-io"));
    }

    /* renamed from: u2.g$f */
    /* loaded from: classes.dex */
    public static final class f implements Runnable {

        /* renamed from: a */
        private final int f26404a;

        /* renamed from: b */
        private final String f26405b;

        /* renamed from: c */
        private final Runnable f26406c;

        public f(String str, Runnable runnable, boolean z10) {
            this(str, runnable, z10 ? -2 : 10);
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(this.f26404a);
            if (this.f26406c != null) {
                if (!TextUtils.isEmpty(this.f26405b)) {
                    Thread.currentThread().setName(this.f26405b);
                }
                try {
                    this.f26406c.run();
                } catch (Exception e10) {
                    AbstractC5584b.m22679a(e10, "thread pool manager");
                }
            }
        }

        public f(String str, Runnable runnable, int i10) {
            this.f26404a = i10;
            this.f26405b = str;
            this.f26406c = runnable;
        }
    }

    /* renamed from: a */
    private static Runnable m27127a(String str, Runnable runnable, boolean z10) {
        return new f(str, runnable, z10);
    }

    /* renamed from: b */
    public static void m27128b(String str, Runnable runnable, boolean z10) {
        b.f26400a.execute(m27127a(str, runnable, z10));
    }

    /* renamed from: c */
    public static void m27129c(String str, Runnable runnable, boolean z10) {
        e.f26403a.execute(m27127a(str, runnable, z10));
    }

    /* renamed from: d */
    public static ScheduledThreadPoolExecutor m27130d() {
        return e.f26403a;
    }
}
