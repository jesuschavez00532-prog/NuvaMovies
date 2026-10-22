package p167i;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i.c */
/* loaded from: classes.dex */
public class C4838c extends AbstractC4839d {

    /* renamed from: a */
    private final Object f20318a = new Object();

    /* renamed from: b */
    private final ExecutorService f20319b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c */
    private volatile Handler f20320c;

    /* renamed from: i.c$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f20321a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f20321a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m19919d(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p167i.AbstractC4839d
    /* renamed from: a */
    public void mo19915a(Runnable runnable) {
        this.f20319b.execute(runnable);
    }

    @Override // p167i.AbstractC4839d
    /* renamed from: b */
    public boolean mo19916b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @Override // p167i.AbstractC4839d
    /* renamed from: c */
    public void mo19917c(Runnable runnable) {
        if (this.f20320c == null) {
            synchronized (this.f20318a) {
                if (this.f20320c == null) {
                    this.f20320c = m19919d(Looper.getMainLooper());
                }
            }
        }
        this.f20320c.post(runnable);
    }
}
