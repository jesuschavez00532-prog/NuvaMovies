package p007a6;

import android.os.Process;

/* renamed from: a6.c */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0066c implements Runnable {
    /* renamed from: a */
    protected abstract void mo228a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        mo228a();
    }
}
