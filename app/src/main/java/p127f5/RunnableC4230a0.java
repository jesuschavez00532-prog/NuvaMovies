package p127f5;

/* renamed from: f5.a0 */
/* loaded from: classes.dex */
final class RunnableC4230a0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC4245i f18526a;

    /* renamed from: b */
    final /* synthetic */ C4232b0 f18527b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4230a0(C4232b0 c4232b0, AbstractC4245i abstractC4245i) {
        this.f18527b = c4232b0;
        this.f18526a = abstractC4245i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC4239f interfaceC4239f;
        InterfaceC4239f interfaceC4239f2;
        obj = this.f18527b.f18529b;
        synchronized (obj) {
            C4232b0 c4232b0 = this.f18527b;
            interfaceC4239f = c4232b0.f18530c;
            if (interfaceC4239f != null) {
                interfaceC4239f2 = c4232b0.f18530c;
                interfaceC4239f2.onSuccess(this.f18526a.mo17708j());
            }
        }
    }
}
