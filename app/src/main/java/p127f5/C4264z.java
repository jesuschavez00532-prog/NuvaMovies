package p127f5;

import java.util.concurrent.Executor;

/* renamed from: f5.z */
/* loaded from: classes.dex */
final class C4264z implements InterfaceC4238e0 {

    /* renamed from: a */
    private final Executor f18581a;

    /* renamed from: b */
    private final Object f18582b = new Object();

    /* renamed from: c */
    private InterfaceC4237e f18583c;

    public C4264z(Executor executor, InterfaceC4237e interfaceC4237e) {
        this.f18581a = executor;
        this.f18583c = interfaceC4237e;
    }

    @Override // p127f5.InterfaceC4238e0
    /* renamed from: a */
    public final void mo17693a(AbstractC4245i abstractC4245i) {
        if (!abstractC4245i.mo17712n() && !abstractC4245i.mo17710l()) {
            synchronized (this.f18582b) {
                if (this.f18583c == null) {
                    return;
                }
                this.f18581a.execute(new RunnableC4263y(this, abstractC4245i));
            }
        }
    }
}
