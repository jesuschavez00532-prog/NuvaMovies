package p127f5;

import java.util.concurrent.Executor;

/* renamed from: f5.t */
/* loaded from: classes.dex */
final class C4258t implements InterfaceC4239f, InterfaceC4237e, InterfaceC4233c, InterfaceC4238e0 {

    /* renamed from: a */
    private final Executor f18567a;

    /* renamed from: b */
    private final InterfaceC4229a f18568b;

    /* renamed from: c */
    private final C4246i0 f18569c;

    public C4258t(Executor executor, InterfaceC4229a interfaceC4229a, C4246i0 c4246i0) {
        this.f18567a = executor;
        this.f18568b = interfaceC4229a;
        this.f18569c = c4246i0;
    }

    @Override // p127f5.InterfaceC4238e0
    /* renamed from: a */
    public final void mo17693a(AbstractC4245i abstractC4245i) {
        this.f18567a.execute(new RunnableC4257s(this, abstractC4245i));
    }

    @Override // p127f5.InterfaceC4233c
    /* renamed from: b */
    public final void mo17694b() {
        this.f18569c.m17721s();
    }

    @Override // p127f5.InterfaceC4239f
    public final void onSuccess(Object obj) {
        this.f18569c.m17720r(obj);
    }

    @Override // p127f5.InterfaceC4237e
    /* renamed from: u0 */
    public final void mo17696u0(Exception exc) {
        this.f18569c.m17719q(exc);
    }
}
