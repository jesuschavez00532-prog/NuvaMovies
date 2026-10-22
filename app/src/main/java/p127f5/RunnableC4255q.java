package p127f5;

/* renamed from: f5.q */
/* loaded from: classes.dex */
final class RunnableC4255q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC4245i f18560a;

    /* renamed from: b */
    final /* synthetic */ C4256r f18561b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4255q(C4256r c4256r, AbstractC4245i abstractC4245i) {
        this.f18561b = c4256r;
        this.f18560a = abstractC4245i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4246i0 c4246i0;
        C4246i0 c4246i02;
        C4246i0 c4246i03;
        InterfaceC4229a interfaceC4229a;
        C4246i0 c4246i04;
        C4246i0 c4246i05;
        if (this.f18560a.mo17710l()) {
            c4246i05 = this.f18561b.f18564c;
            c4246i05.m17721s();
            return;
        }
        try {
            interfaceC4229a = this.f18561b.f18563b;
            Object mo289a = interfaceC4229a.mo289a(this.f18560a);
            c4246i04 = this.f18561b.f18564c;
            c4246i04.m17720r(mo289a);
        } catch (C4241g e10) {
            if (e10.getCause() instanceof Exception) {
                c4246i03 = this.f18561b.f18564c;
                c4246i03.m17719q((Exception) e10.getCause());
            } else {
                c4246i02 = this.f18561b.f18564c;
                c4246i02.m17719q(e10);
            }
        } catch (Exception e11) {
            c4246i0 = this.f18561b.f18564c;
            c4246i0.m17719q(e11);
        }
    }
}
