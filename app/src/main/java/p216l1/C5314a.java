package p216l1;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p109e2.AbstractC4121k;
import p184j1.InterfaceC4975f;
import p216l1.C5329p;

/* renamed from: l1.a */
/* loaded from: classes.dex */
final class C5314a {

    /* renamed from: a */
    private final boolean f21640a;

    /* renamed from: b */
    private final Executor f21641b;

    /* renamed from: c */
    final Map f21642c;

    /* renamed from: d */
    private final ReferenceQueue f21643d;

    /* renamed from: e */
    private C5329p.a f21644e;

    /* renamed from: f */
    private volatile boolean f21645f;

    /* renamed from: l1.a$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: l1.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC7851a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Runnable f21646a;

            RunnableC7851a(Runnable runnable) {
                this.f21646a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f21646a.run();
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC7851a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: l1.a$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5314a.this.m21449b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l1.a$c */
    /* loaded from: classes.dex */
    public static final class c extends WeakReference {

        /* renamed from: a */
        final InterfaceC4975f f21649a;

        /* renamed from: b */
        final boolean f21650b;

        /* renamed from: c */
        InterfaceC5335v f21651c;

        c(InterfaceC4975f interfaceC4975f, C5329p c5329p, ReferenceQueue referenceQueue, boolean z10) {
            super(c5329p, referenceQueue);
            InterfaceC5335v interfaceC5335v;
            this.f21649a = (InterfaceC4975f) AbstractC4121k.m17226d(interfaceC4975f);
            if (c5329p.m21579e() && z10) {
                interfaceC5335v = (InterfaceC5335v) AbstractC4121k.m17226d(c5329p.m21578d());
            } else {
                interfaceC5335v = null;
            }
            this.f21651c = interfaceC5335v;
            this.f21650b = c5329p.m21579e();
        }

        /* renamed from: a */
        void m21454a() {
            this.f21651c = null;
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5314a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m21448a(InterfaceC4975f interfaceC4975f, C5329p c5329p) {
        c cVar = (c) this.f21642c.put(interfaceC4975f, new c(interfaceC4975f, c5329p, this.f21643d, this.f21640a));
        if (cVar != null) {
            cVar.m21454a();
        }
    }

    /* renamed from: b */
    void m21449b() {
        while (!this.f21645f) {
            try {
                m21450c((c) this.f21643d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    void m21450c(c cVar) {
        InterfaceC5335v interfaceC5335v;
        synchronized (this) {
            this.f21642c.remove(cVar.f21649a);
            if (cVar.f21650b && (interfaceC5335v = cVar.f21651c) != null) {
                this.f21644e.mo21541a(cVar.f21649a, new C5329p(interfaceC5335v, true, false, cVar.f21649a, this.f21644e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void m21451d(InterfaceC4975f interfaceC4975f) {
        c cVar = (c) this.f21642c.remove(interfaceC4975f);
        if (cVar != null) {
            cVar.m21454a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public synchronized C5329p m21452e(InterfaceC4975f interfaceC4975f) {
        c cVar = (c) this.f21642c.get(interfaceC4975f);
        if (cVar == null) {
            return null;
        }
        C5329p c5329p = (C5329p) cVar.get();
        if (c5329p == null) {
            m21450c(cVar);
        }
        return c5329p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m21453f(C5329p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f21644e = aVar;
            }
        }
    }

    C5314a(boolean z10, Executor executor) {
        this.f21642c = new HashMap();
        this.f21643d = new ReferenceQueue();
        this.f21640a = z10;
        this.f21641b = executor;
        executor.execute(new b());
    }
}
