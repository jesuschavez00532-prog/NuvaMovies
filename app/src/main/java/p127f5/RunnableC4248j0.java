package p127f5;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f5.j0 */
/* loaded from: classes.dex */
public final class RunnableC4248j0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4246i0 f18547a;

    /* renamed from: b */
    final /* synthetic */ Callable f18548b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4248j0(C4246i0 c4246i0, Callable callable) {
        this.f18547a = c4246i0;
        this.f18548b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f18547a.m17720r(this.f18548b.call());
        } catch (Exception e10) {
            this.f18547a.m17719q(e10);
        } catch (Throwable th) {
            this.f18547a.m17719q(new RuntimeException(th));
        }
    }
}
