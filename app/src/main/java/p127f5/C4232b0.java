package p127f5;

import java.util.concurrent.Executor;

/* renamed from: f5.b0 */
/* loaded from: classes.dex */
final class C4232b0 implements InterfaceC4238e0 {

    /* renamed from: a */
    private final Executor f18528a;

    /* renamed from: b */
    private final Object f18529b = new Object();

    /* renamed from: c */
    private InterfaceC4239f f18530c;

    public C4232b0(Executor executor, InterfaceC4239f interfaceC4239f) {
        this.f18528a = executor;
        this.f18530c = interfaceC4239f;
    }

    @Override // p127f5.InterfaceC4238e0
    /* renamed from: a */
    public final void mo17693a(AbstractC4245i abstractC4245i) {
        if (abstractC4245i.mo17712n()) {
            synchronized (this.f18529b) {
                if (this.f18530c == null) {
                    return;
                }
                this.f18528a.execute(new RunnableC4230a0(this, abstractC4245i));
            }
        }
    }
}
