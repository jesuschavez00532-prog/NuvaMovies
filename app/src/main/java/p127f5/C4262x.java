package p127f5;

import java.util.concurrent.Executor;

/* renamed from: f5.x */
/* loaded from: classes.dex */
final class C4262x implements InterfaceC4238e0 {

    /* renamed from: a */
    private final Executor f18576a;

    /* renamed from: b */
    private final Object f18577b = new Object();

    /* renamed from: c */
    private InterfaceC4235d f18578c;

    public C4262x(Executor executor, InterfaceC4235d interfaceC4235d) {
        this.f18576a = executor;
        this.f18578c = interfaceC4235d;
    }

    @Override // p127f5.InterfaceC4238e0
    /* renamed from: a */
    public final void mo17693a(AbstractC4245i abstractC4245i) {
        synchronized (this.f18577b) {
            if (this.f18578c == null) {
                return;
            }
            this.f18576a.execute(new RunnableC4261w(this, abstractC4245i));
        }
    }
}
