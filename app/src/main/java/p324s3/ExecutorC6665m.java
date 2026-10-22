package p324s3;

import java.util.concurrent.Executor;
import p393x3.AbstractC7492a;

/* renamed from: s3.m */
/* loaded from: classes.dex */
class ExecutorC6665m implements Executor {

    /* renamed from: a */
    private final Executor f25576a;

    /* renamed from: s3.m$a */
    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: a */
        private final Runnable f25577a;

        a(Runnable runnable) {
            this.f25577a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f25577a.run();
            } catch (Exception e10) {
                AbstractC7492a.m28690d("Executor", "Background execution failure.", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC6665m(Executor executor) {
        this.f25576a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f25576a.execute(new a(runnable));
    }
}
