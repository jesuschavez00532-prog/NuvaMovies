package org.xutils.common.task;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;
import org.xutils.C6127x;
import org.xutils.common.Callback;
import org.xutils.common.TaskController;
import org.xutils.common.util.LogUtil;

/* loaded from: classes3.dex */
public final class TaskControllerImpl implements TaskController {
    private static volatile TaskController instance;

    /* renamed from: org.xutils.common.task.TaskControllerImpl$a */
    /* loaded from: classes3.dex */
    class RunnableC6083a implements Runnable {

        /* renamed from: a */
        private final int f23996a;

        /* renamed from: b */
        private final AtomicInteger f23997b = new AtomicInteger(0);

        /* renamed from: c */
        final /* synthetic */ AbsTask[] f23998c;

        /* renamed from: d */
        final /* synthetic */ Callback.GroupCallback f23999d;

        RunnableC6083a(AbsTask[] absTaskArr, Callback.GroupCallback groupCallback) {
            this.f23998c = absTaskArr;
            this.f23999d = groupCallback;
            this.f23996a = absTaskArr.length;
        }

        @Override // java.lang.Runnable
        public void run() {
            Callback.GroupCallback groupCallback;
            if (this.f23997b.incrementAndGet() == this.f23996a && (groupCallback = this.f23999d) != null) {
                try {
                    groupCallback.onAllFinished();
                } catch (Throwable th) {
                    try {
                        this.f23999d.onError(null, th, true);
                    } catch (Throwable th2) {
                        LogUtil.m24376e(th2.getMessage(), th2);
                    }
                }
            }
        }
    }

    /* renamed from: org.xutils.common.task.TaskControllerImpl$b */
    /* loaded from: classes3.dex */
    class C6084b extends C6087b {

        /* renamed from: h */
        final /* synthetic */ Callback.GroupCallback f24001h;

        /* renamed from: i */
        final /* synthetic */ AbsTask f24002i;

        /* renamed from: j */
        final /* synthetic */ Runnable f24003j;

        /* renamed from: org.xutils.common.task.TaskControllerImpl$b$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C6084b c6084b = C6084b.this;
                Callback.GroupCallback groupCallback = c6084b.f24001h;
                if (groupCallback != null) {
                    try {
                        groupCallback.onSuccess(c6084b.f24002i);
                    } catch (Throwable th) {
                        try {
                            C6084b c6084b2 = C6084b.this;
                            c6084b2.f24001h.onError(c6084b2.f24002i, th, true);
                        } catch (Throwable th2) {
                            LogUtil.m24376e(th2.getMessage(), th2);
                        }
                    }
                }
            }
        }

        /* renamed from: org.xutils.common.task.TaskControllerImpl$b$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Callback.CancelledException f24006a;

            b(Callback.CancelledException cancelledException) {
                this.f24006a = cancelledException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C6084b c6084b = C6084b.this;
                Callback.GroupCallback groupCallback = c6084b.f24001h;
                if (groupCallback != null) {
                    try {
                        groupCallback.onCancelled(c6084b.f24002i, this.f24006a);
                    } catch (Throwable th) {
                        try {
                            C6084b c6084b2 = C6084b.this;
                            c6084b2.f24001h.onError(c6084b2.f24002i, th, true);
                        } catch (Throwable th2) {
                            LogUtil.m24376e(th2.getMessage(), th2);
                        }
                    }
                }
            }
        }

        /* renamed from: org.xutils.common.task.TaskControllerImpl$b$c */
        /* loaded from: classes3.dex */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Throwable f24008a;

            /* renamed from: b */
            final /* synthetic */ boolean f24009b;

            c(Throwable th, boolean z10) {
                this.f24008a = th;
                this.f24009b = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                C6084b c6084b = C6084b.this;
                Callback.GroupCallback groupCallback = c6084b.f24001h;
                if (groupCallback != null) {
                    try {
                        groupCallback.onError(c6084b.f24002i, this.f24008a, this.f24009b);
                    } catch (Throwable th) {
                        LogUtil.m24376e(th.getMessage(), th);
                    }
                }
            }
        }

        /* renamed from: org.xutils.common.task.TaskControllerImpl$b$d */
        /* loaded from: classes3.dex */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C6084b c6084b = C6084b.this;
                    Callback.GroupCallback groupCallback = c6084b.f24001h;
                    if (groupCallback != null) {
                        groupCallback.onFinished(c6084b.f24002i);
                    }
                } finally {
                    try {
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6084b(AbsTask absTask, Callback.GroupCallback groupCallback, AbsTask absTask2, Runnable runnable) {
            super(absTask);
            this.f24001h = groupCallback;
            this.f24002i = absTask2;
            this.f24003j = runnable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.xutils.common.task.C6087b, org.xutils.common.task.AbsTask
        public void onCancelled(Callback.CancelledException cancelledException) {
            super.onCancelled(cancelledException);
            TaskControllerImpl.this.post(new b(cancelledException));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.xutils.common.task.C6087b, org.xutils.common.task.AbsTask
        public void onError(Throwable th, boolean z10) {
            super.onError(th, z10);
            TaskControllerImpl.this.post(new c(th, z10));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.xutils.common.task.C6087b, org.xutils.common.task.AbsTask
        public void onFinished() {
            super.onFinished();
            TaskControllerImpl.this.post(new d());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.xutils.common.task.C6087b, org.xutils.common.task.AbsTask
        public void onSuccess(Object obj) {
            super.onSuccess(obj);
            TaskControllerImpl.this.post(new a());
        }
    }

    /* renamed from: org.xutils.common.task.TaskControllerImpl$c */
    /* loaded from: classes3.dex */
    class C6085c implements Callback.Cancelable {

        /* renamed from: a */
        final /* synthetic */ AbsTask[] f24012a;

        C6085c(AbsTask[] absTaskArr) {
            this.f24012a = absTaskArr;
        }

        @Override // org.xutils.common.Callback.Cancelable
        public void cancel() {
            for (AbsTask absTask : this.f24012a) {
                absTask.cancel();
            }
        }

        @Override // org.xutils.common.Callback.Cancelable
        public boolean isCancelled() {
            boolean z10 = true;
            for (AbsTask absTask : this.f24012a) {
                if (!absTask.isCancelled()) {
                    z10 = false;
                }
            }
            return z10;
        }
    }

    private TaskControllerImpl() {
    }

    public static void registerInstance() {
        if (instance == null) {
            synchronized (TaskController.class) {
                if (instance == null) {
                    instance = new TaskControllerImpl();
                }
            }
        }
        C6127x.Ext.setTaskController(instance);
    }

    @Override // org.xutils.common.TaskController
    public void autoPost(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            C6087b.f24017f.post(runnable);
        }
    }

    @Override // org.xutils.common.TaskController
    public void post(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        C6087b.f24017f.post(runnable);
    }

    @Override // org.xutils.common.TaskController
    public void postDelayed(Runnable runnable, long j10) {
        if (runnable == null) {
            return;
        }
        C6087b.f24017f.postDelayed(runnable, j10);
    }

    @Override // org.xutils.common.TaskController
    public void removeCallbacks(Runnable runnable) {
        C6087b.f24017f.removeCallbacks(runnable);
    }

    @Override // org.xutils.common.TaskController
    public void run(Runnable runnable) {
        PriorityExecutor priorityExecutor = C6087b.f24018g;
        if (!priorityExecutor.isBusy()) {
            priorityExecutor.execute(runnable);
        } else {
            new Thread(runnable).start();
        }
    }

    @Override // org.xutils.common.TaskController
    public <T> AbsTask<T> start(AbsTask<T> absTask) {
        C6087b c6087b;
        if (absTask instanceof C6087b) {
            c6087b = (C6087b) absTask;
        } else {
            c6087b = new C6087b(absTask);
        }
        try {
            c6087b.doBackground();
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
        return c6087b;
    }

    @Override // org.xutils.common.TaskController
    public <T> T startSync(AbsTask<T> absTask) {
        T t10 = null;
        try {
            try {
                absTask.onWaiting();
                absTask.onStarted();
                t10 = absTask.doBackground();
                absTask.onSuccess(t10);
            } finally {
                absTask.onFinished();
            }
        } catch (Callback.CancelledException e10) {
            absTask.onCancelled(e10);
        } catch (Throwable th) {
            absTask.onError(th, false);
            throw th;
        }
        return t10;
    }

    @Override // org.xutils.common.TaskController
    public <T extends AbsTask<?>> Callback.Cancelable startTasks(Callback.GroupCallback<T> groupCallback, T... tArr) {
        if (tArr != null) {
            RunnableC6083a runnableC6083a = new RunnableC6083a(tArr, groupCallback);
            for (T t10 : tArr) {
                start(new C6084b(t10, groupCallback, t10, runnableC6083a));
            }
            return new C6085c(tArr);
        }
        throw new IllegalArgumentException("task must not be null");
    }
}
