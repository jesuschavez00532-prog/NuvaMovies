package p127f5;

import java.util.concurrent.Executor;

/* renamed from: f5.d0 */
/* loaded from: classes.dex */
final class C4236d0 implements InterfaceC4239f, InterfaceC4237e, InterfaceC4233c, InterfaceC4238e0 {

    /* renamed from: a */
    private final Executor f18533a;

    /* renamed from: b */
    private final InterfaceC4243h f18534b;

    /* renamed from: c */
    private final C4246i0 f18535c;

    public C4236d0(Executor executor, InterfaceC4243h interfaceC4243h, C4246i0 c4246i0) {
        this.f18533a = executor;
        this.f18534b = interfaceC4243h;
        this.f18535c = c4246i0;
    }

    @Override // p127f5.InterfaceC4238e0
    /* renamed from: a */
    public final void mo17693a(AbstractC4245i abstractC4245i) {
        this.f18533a.execute(new RunnableC4234c0(this, abstractC4245i));
    }

    @Override // p127f5.InterfaceC4233c
    /* renamed from: b */
    public final void mo17694b() {
        this.f18535c.m17721s();
    }

    @Override // p127f5.InterfaceC4239f
    public final void onSuccess(Object obj) {
        this.f18535c.m17720r(obj);
    }

    @Override // p127f5.InterfaceC4237e
    /* renamed from: u0 */
    public final void mo17696u0(Exception exc) {
        this.f18535c.m17719q(exc);
    }
}
