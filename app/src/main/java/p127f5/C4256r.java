package p127f5;

import java.util.concurrent.Executor;

/* renamed from: f5.r */
/* loaded from: classes.dex */
final class C4256r implements InterfaceC4238e0 {

    /* renamed from: a */
    private final Executor f18562a;

    /* renamed from: b */
    private final InterfaceC4229a f18563b;

    /* renamed from: c */
    private final C4246i0 f18564c;

    public C4256r(Executor executor, InterfaceC4229a interfaceC4229a, C4246i0 c4246i0) {
        this.f18562a = executor;
        this.f18563b = interfaceC4229a;
        this.f18564c = c4246i0;
    }

    @Override // p127f5.InterfaceC4238e0
    /* renamed from: a */
    public final void mo17693a(AbstractC4245i abstractC4245i) {
        this.f18562a.execute(new RunnableC4255q(this, abstractC4245i));
    }
}
