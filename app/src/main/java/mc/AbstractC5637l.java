package mc;

import android.os.Handler;
import android.os.Looper;
import be.C1328x;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;

/* renamed from: mc.l */
/* loaded from: classes.dex */
public abstract class AbstractC5637l {

    /* renamed from: a */
    private static final int f22708a;

    /* renamed from: b */
    private static final int f22709b;

    /* renamed from: c */
    private static final int f22710c;

    /* renamed from: d */
    private static final int f22711d;

    /* renamed from: e */
    private static ExecutorService f22712e;

    /* renamed from: f */
    private static final Handler f22713f;

    /* renamed from: g */
    private static ThreadPoolExecutor f22714g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mc.l$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        final /* synthetic */ Exception f22715a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Exception exc) {
            super(0);
            this.f22715a = exc;
        }

        /* renamed from: a */
        public final void m22876a() {
            this.f22715a.printStackTrace();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22876a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: mc.l$b */
    /* loaded from: classes3.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f22716a = new AtomicInteger(1);

        /* renamed from: b */
        final /* synthetic */ String f22717b;

        b(String str) {
            this.f22717b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            AbstractC5868k.m23674f(runnable, "r");
            return new Thread(runnable, this.f22717b + " #" + this.f22716a.getAndIncrement());
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f22708a = availableProcessors;
        int max = Math.max(3, Math.min(availableProcessors - 1, 6));
        f22709b = max;
        f22710c = availableProcessors * 4;
        f22711d = availableProcessors * 8;
        f22712e = new ExecutorServiceC5626a();
        f22713f = new Handler(Looper.getMainLooper());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, Integer.MAX_VALUE, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(10), m22875i("TheRouterLibThread"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f22714g = threadPoolExecutor;
    }

    /* renamed from: f */
    public static final void m22872f(Runnable runnable) {
        AbstractC5868k.m23674f(runnable, "command");
        try {
            f22712e.execute(runnable);
        } catch (Exception e10) {
            AbstractC5635j.m22861c("TheRouterThreadPool", "rejected execute runnable", new a(e10));
        }
    }

    /* renamed from: g */
    public static final boolean m22873g(Runnable runnable) {
        AbstractC5868k.m23674f(runnable, "command");
        if (AbstractC5868k.m23669a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            runnable.run();
            return true;
        }
        return f22713f.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final String m22874h(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        String sb3 = sb2.toString();
        AbstractC5868k.m23673e(sb3, "str.toString()");
        return sb3;
    }

    /* renamed from: i */
    public static final ThreadFactory m22875i(String str) {
        AbstractC5868k.m23674f(str, "threadName");
        return new b(str);
    }
}
