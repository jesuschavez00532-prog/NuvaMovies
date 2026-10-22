package org.xutils.common.task;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Executor;
import org.xutils.C6127x;
import org.xutils.common.Callback;
import org.xutils.common.task.AbsTask;
import org.xutils.common.util.LogUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.xutils.common.task.b */
/* loaded from: classes3.dex */
public class C6087b extends AbsTask {

    /* renamed from: f */
    static final c f24017f = new c((a) null);

    /* renamed from: g */
    static final PriorityExecutor f24018g = new PriorityExecutor(true);

    /* renamed from: a */
    private final AbsTask f24019a;

    /* renamed from: b */
    private final Executor f24020b;

    /* renamed from: c */
    private final Handler f24021c;

    /* renamed from: d */
    private volatile boolean f24022d;

    /* renamed from: e */
    private volatile boolean f24023e;

    /* renamed from: org.xutils.common.task.b$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                } finally {
                    C6087b.this.onFinished();
                }
            } catch (Callback.CancelledException e10) {
                C6087b.this.onCancelled(e10);
                return;
            } catch (Throwable th) {
                C6087b.this.onError(th, false);
                return;
            }
            if (!C6087b.this.f24022d && !C6087b.this.isCancelled()) {
                C6087b.this.onStarted();
                if (!C6087b.this.isCancelled()) {
                    C6087b.this.f24019a.setResult(C6087b.this.f24019a.doBackground());
                    C6087b c6087b = C6087b.this;
                    c6087b.setResult(c6087b.f24019a.getResult());
                    if (!C6087b.this.isCancelled()) {
                        C6087b c6087b2 = C6087b.this;
                        c6087b2.onSuccess(c6087b2.f24019a.getResult());
                        return;
                    }
                    throw new Callback.CancelledException("");
                }
                throw new Callback.CancelledException("");
            }
            throw new Callback.CancelledException("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.xutils.common.task.b$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        final C6087b f24025a;

        /* renamed from: b */
        final Object[] f24026b;

        public b(C6087b c6087b, Object... objArr) {
            this.f24025a = c6087b;
            this.f24026b = objArr;
        }
    }

    /* renamed from: org.xutils.common.task.b$c */
    /* loaded from: classes3.dex */
    static final class c extends Handler {
        /* synthetic */ c(Looper looper, a aVar) {
            this(looper);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0021. Please report as an issue. */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object[] objArr;
            Object obj = message.obj;
            if (obj != null) {
                C6087b c6087b = null;
                if (obj instanceof C6087b) {
                    c6087b = (C6087b) obj;
                    objArr = null;
                } else if (obj instanceof b) {
                    b bVar = (b) obj;
                    c6087b = bVar.f24025a;
                    objArr = bVar.f24026b;
                } else {
                    objArr = null;
                }
                if (c6087b != null) {
                    try {
                        switch (message.what) {
                            case 1000000001:
                                c6087b.f24019a.onWaiting();
                                return;
                            case 1000000002:
                                c6087b.f24019a.onStarted();
                                return;
                            case 1000000003:
                                c6087b.f24019a.onSuccess(c6087b.getResult());
                                return;
                            case 1000000004:
                                Throwable th = (Throwable) objArr[0];
                                LogUtil.m24374d(th.getMessage(), th);
                                c6087b.f24019a.onError(th, false);
                                return;
                            case 1000000005:
                                c6087b.f24019a.onUpdate(message.arg1, objArr);
                                return;
                            case 1000000006:
                                if (!c6087b.f24022d) {
                                    c6087b.f24022d = true;
                                    c6087b.f24019a.onCancelled((Callback.CancelledException) objArr[0]);
                                    return;
                                }
                                return;
                            case 1000000007:
                                if (!c6087b.f24023e) {
                                    c6087b.f24023e = true;
                                    c6087b.f24019a.onFinished();
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    } catch (Throwable th2) {
                        c6087b.setState(AbsTask.State.ERROR);
                        if (message.what != 1000000004) {
                            c6087b.f24019a.onError(th2, true);
                            return;
                        } else if (!C6127x.isDebug()) {
                            return;
                        } else {
                            throw new RuntimeException(th2);
                        }
                    }
                }
                throw new RuntimeException("msg.obj not instanceof TaskProxy");
            }
            throw new IllegalArgumentException("msg must not be null");
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        private c() {
            super(Looper.getMainLooper());
        }

        private c(Looper looper) {
            super(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6087b(AbsTask absTask) {
        super(absTask);
        this.f24022d = false;
        this.f24023e = false;
        this.f24019a = absTask;
        absTask.setTaskProxy(this);
        a aVar = null;
        setTaskProxy(null);
        Looper customLooper = absTask.customLooper();
        if (customLooper != null) {
            this.f24021c = new c(customLooper, aVar);
        } else {
            this.f24021c = f24017f;
        }
        Executor executor = absTask.getExecutor();
        this.f24020b = executor == null ? f24018g : executor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public final Object doBackground() {
        onWaiting();
        this.f24020b.execute(new RunnableC6086a(this.f24019a.getPriority(), new a()));
        return null;
    }

    @Override // org.xutils.common.task.AbsTask
    public final Executor getExecutor() {
        return this.f24020b;
    }

    @Override // org.xutils.common.task.AbsTask
    public final Priority getPriority() {
        return this.f24019a.getPriority();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public void onCancelled(Callback.CancelledException cancelledException) {
        setState(AbsTask.State.CANCELLED);
        this.f24021c.obtainMessage(1000000006, new b(this, cancelledException)).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public void onError(Throwable th, boolean z10) {
        setState(AbsTask.State.ERROR);
        this.f24021c.obtainMessage(1000000004, new b(this, th)).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public void onFinished() {
        this.f24021c.obtainMessage(1000000007, this).sendToTarget();
    }

    @Override // org.xutils.common.task.AbsTask
    protected void onStarted() {
        setState(AbsTask.State.STARTED);
        this.f24021c.obtainMessage(1000000002, this).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public void onSuccess(Object obj) {
        setState(AbsTask.State.SUCCESS);
        this.f24021c.obtainMessage(1000000003, this).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public void onUpdate(int i10, Object... objArr) {
        this.f24021c.obtainMessage(1000000005, i10, i10, new b(this, objArr)).sendToTarget();
    }

    @Override // org.xutils.common.task.AbsTask
    protected void onWaiting() {
        setState(AbsTask.State.WAITING);
        this.f24021c.obtainMessage(1000000001, this).sendToTarget();
    }

    @Override // org.xutils.common.task.AbsTask
    final void setState(AbsTask.State state) {
        super.setState(state);
        this.f24019a.setState(state);
    }
}
