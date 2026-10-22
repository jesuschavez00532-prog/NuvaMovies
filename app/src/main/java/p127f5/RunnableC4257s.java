package p127f5;

import java.util.concurrent.Executor;

/* renamed from: f5.s */
/* loaded from: classes.dex */
final class RunnableC4257s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC4245i f18565a;

    /* renamed from: b */
    final /* synthetic */ C4258t f18566b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4257s(C4258t c4258t, AbstractC4245i abstractC4245i) {
        this.f18566b = c4258t;
        this.f18565a = abstractC4245i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4246i0 c4246i0;
        C4246i0 c4246i02;
        C4246i0 c4246i03;
        InterfaceC4229a interfaceC4229a;
        try {
            interfaceC4229a = this.f18566b.f18568b;
            AbstractC4245i abstractC4245i = (AbstractC4245i) interfaceC4229a.mo289a(this.f18565a);
            if (abstractC4245i == null) {
                this.f18566b.mo17696u0(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = AbstractC4249k.f18550b;
            abstractC4245i.mo17703e(executor, this.f18566b);
            abstractC4245i.mo17702d(executor, this.f18566b);
            abstractC4245i.mo17699a(executor, this.f18566b);
        } catch (C4241g e10) {
            if (e10.getCause() instanceof Exception) {
                c4246i03 = this.f18566b.f18569c;
                c4246i03.m17719q((Exception) e10.getCause());
            } else {
                c4246i02 = this.f18566b.f18569c;
                c4246i02.m17719q(e10);
            }
        } catch (Exception e11) {
            c4246i0 = this.f18566b.f18569c;
            c4246i0.m17719q(e11);
        }
    }
}
