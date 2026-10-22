package p008a7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: a7.b */
/* loaded from: classes.dex */
public abstract class AbstractC0109b {

    /* renamed from: a */
    private static final InterfaceC0108a f357a;

    /* renamed from: b */
    private static volatile InterfaceC0108a f358b;

    /* renamed from: a7.b$b */
    /* loaded from: classes.dex */
    private static class b implements InterfaceC0108a {
        private b() {
        }

        @Override // p008a7.InterfaceC0108a
        /* renamed from: a */
        public ExecutorService mo482a(ThreadFactory threadFactory, EnumC0110c enumC0110c) {
            return m484b(1, threadFactory, enumC0110c);
        }

        /* renamed from: b */
        public ExecutorService m484b(int i10, ThreadFactory threadFactory, EnumC0110c enumC0110c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        b bVar = new b();
        f357a = bVar;
        f358b = bVar;
    }

    /* renamed from: a */
    public static InterfaceC0108a m483a() {
        return f358b;
    }
}
