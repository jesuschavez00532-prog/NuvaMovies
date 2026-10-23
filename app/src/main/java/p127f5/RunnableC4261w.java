package p127f5;

/* renamed from: f5.w */
/* loaded from: classes.dex */
final class RunnableC4261w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC4245i f18574a;

    /* renamed from: b */
    final /* synthetic */ C4262x f18575b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4261w(C4262x c4262x, AbstractC4245i abstractC4245i) {
        this.f18575b = c4262x;
        this.f18574a = abstractC4245i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = null;
        InterfaceC4235d interfaceC4235d;
        InterfaceC4235d interfaceC4235d2;
        obj = this.f18575b.f18577b;
        synchronized (obj) {
            C4262x c4262x = this.f18575b;
            interfaceC4235d = c4262x.f18578c;
            if (interfaceC4235d != null) {
                interfaceC4235d2 = c4262x.f18578c;
                interfaceC4235d2.mo488a(this.f18574a);
            }
        }
    }
}
