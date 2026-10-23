package p345u;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p373w.InterfaceC7336a;

/* renamed from: u.g */
/* loaded from: classes.dex */
abstract class AbstractC7006g {

    /* renamed from: u.g$a */
    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {

        /* renamed from: a */
        private String f26361a;

        /* renamed from: b */
        private int f26362b;

        /* renamed from: u.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C7861a extends Thread {

            /* renamed from: a */
            private final int f26363a;

            C7861a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f26363a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f26363a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f26361a = str;
            this.f26362b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C7861a(runnable, this.f26361a, this.f26362b);
        }
    }

    /* renamed from: u.g$b */
    /* loaded from: classes.dex */
    private static class b implements Runnable {

        /* renamed from: a */
        private Callable f26364a;

        /* renamed from: b */
        private InterfaceC7336a f26365b;

        /* renamed from: c */
        private Handler f26366c;

        /* renamed from: u.g$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC7336a f26367a;

            /* renamed from: b */
            final /* synthetic */ Object f26368b;

            a(InterfaceC7336a interfaceC7336a, Object obj) {
                this.f26367a = interfaceC7336a;
                this.f26368b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f26367a.accept(this.f26368b);
            }
        }

        b(Handler handler, Callable callable, InterfaceC7336a interfaceC7336a) {
            this.f26364a = callable;
            this.f26365b = interfaceC7336a;
            this.f26366c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = null;
            try {
                obj = this.f26364a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f26366c.post(new a(this.f26365b, obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ThreadPoolExecutor m27047a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m27048b(Executor executor, Callable callable, InterfaceC7336a interfaceC7336a) {
        executor.execute(new b(AbstractC7001b.m27012a(), callable, interfaceC7336a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Object m27049c(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
