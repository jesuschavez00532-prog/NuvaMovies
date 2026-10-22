package p127f5;

/* renamed from: f5.u */
/* loaded from: classes.dex */
final class RunnableC4259u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4260v f18570a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4259u(C4260v c4260v) {
        this.f18570a = c4260v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC4233c interfaceC4233c;
        InterfaceC4233c interfaceC4233c2;
        obj = this.f18570a.f18572b;
        synchronized (obj) {
            C4260v c4260v = this.f18570a;
            interfaceC4233c = c4260v.f18573c;
            if (interfaceC4233c != null) {
                interfaceC4233c2 = c4260v.f18573c;
                interfaceC4233c2.mo17694b();
            }
        }
    }
}
