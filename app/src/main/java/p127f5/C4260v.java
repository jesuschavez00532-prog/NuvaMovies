package p127f5;

import java.util.concurrent.Executor;

/* renamed from: f5.v */
/* loaded from: classes.dex */
final class C4260v implements InterfaceC4238e0 {

    /* renamed from: a */
    private final Executor f18571a;

    /* renamed from: b */
    private final Object f18572b = new Object();

    /* renamed from: c */
    private InterfaceC4233c f18573c;

    public C4260v(Executor executor, InterfaceC4233c interfaceC4233c) {
        this.f18571a = executor;
        this.f18573c = interfaceC4233c;
    }

    @Override // p127f5.InterfaceC4238e0
    /* renamed from: a */
    public final void mo17693a(AbstractC4245i abstractC4245i) {
        if (abstractC4245i.mo17710l()) {
            synchronized (this.f18572b) {
                if (this.f18573c == null) {
                    return;
                }
                this.f18571a.execute(new RunnableC4259u(this));
            }
        }
    }
}
