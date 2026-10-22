package p295q4;

import android.os.Process;

/* renamed from: q4.b */
/* loaded from: classes.dex */
final class RunnableC6343b implements Runnable {

    /* renamed from: a */
    private final Runnable f24688a;

    public RunnableC6343b(Runnable runnable, int i10) {
        this.f24688a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f24688a.run();
    }
}
