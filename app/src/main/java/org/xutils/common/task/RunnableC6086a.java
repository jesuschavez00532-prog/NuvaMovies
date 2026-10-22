package org.xutils.common.task;

/* renamed from: org.xutils.common.task.a */
/* loaded from: classes3.dex */
class RunnableC6086a implements Runnable {

    /* renamed from: a */
    long f24014a;

    /* renamed from: b */
    public final Priority f24015b;

    /* renamed from: c */
    private final Runnable f24016c;

    public RunnableC6086a(Priority priority, Runnable runnable) {
        this.f24015b = priority == null ? Priority.DEFAULT : priority;
        this.f24016c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24016c.run();
    }
}
