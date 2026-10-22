package p127f5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: f5.n */
/* loaded from: classes.dex */
final class C4252n implements InterfaceC4253o {

    /* renamed from: a */
    private final CountDownLatch f18551a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4252n(AbstractC4251m abstractC4251m) {
    }

    /* renamed from: a */
    public final void m17738a() {
        this.f18551a.await();
    }

    @Override // p127f5.InterfaceC4233c
    /* renamed from: b */
    public final void mo17694b() {
        this.f18551a.countDown();
    }

    /* renamed from: c */
    public final boolean m17739c(long j10, TimeUnit timeUnit) {
        return this.f18551a.await(j10, timeUnit);
    }

    @Override // p127f5.InterfaceC4239f
    public final void onSuccess(Object obj) {
        this.f18551a.countDown();
    }

    @Override // p127f5.InterfaceC4237e
    /* renamed from: u0 */
    public final void mo17696u0(Exception exc) {
        this.f18551a.countDown();
    }
}
