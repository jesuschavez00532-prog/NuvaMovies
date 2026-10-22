package p245n3;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.AbstractC0272b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: n3.d */
/* loaded from: classes.dex */
public class C5739d extends ThreadPoolExecutor {

    /* renamed from: a */
    private Handler f23042a;

    /* renamed from: b */
    private List f23043b;

    /* renamed from: c */
    private List f23044c;

    /* renamed from: n3.d$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Runnable f23045a;

        a(d dVar, Runnable runnable) {
            this.f23045a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: n3.d$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b(c cVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: n3.d$c */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* renamed from: n3.d$d */
    /* loaded from: classes.dex */
    public interface d {
    }

    public C5739d(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f23042a = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        List list;
        super.afterExecute(runnable, th);
        List list2 = this.f23043b;
        if (list2 != null && list2.size() > 0) {
            Iterator it = this.f23043b.iterator();
            while (it.hasNext()) {
                AbstractC0272b.m941a(it.next());
                this.f23042a.post(new a(null, runnable));
            }
        }
        if (getActiveCount() == 1 && getQueue().size() == 0 && (list = this.f23044c) != null && list.size() > 0) {
            Iterator it2 = this.f23044c.iterator();
            while (it2.hasNext()) {
                AbstractC0272b.m941a(it2.next());
                this.f23042a.post(new b(null));
            }
        }
    }
}
