package p127f5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p425z4.HandlerC7754a;

/* renamed from: f5.h0 */
/* loaded from: classes.dex */
final class ExecutorC4244h0 implements Executor {

    /* renamed from: a */
    private final Handler f18539a = new HandlerC7754a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f18539a.post(runnable);
    }
}
