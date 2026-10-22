package p127f5;

import p219l4.AbstractC5391n;

/* renamed from: f5.y */
/* loaded from: classes.dex */
final class RunnableC4263y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC4245i f18579a;

    /* renamed from: b */
    final /* synthetic */ C4264z f18580b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4263y(C4264z c4264z, AbstractC4245i abstractC4245i) {
        this.f18580b = c4264z;
        this.f18579a = abstractC4245i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC4237e interfaceC4237e;
        InterfaceC4237e interfaceC4237e2;
        obj = this.f18580b.f18582b;
        synchronized (obj) {
            C4264z c4264z = this.f18580b;
            interfaceC4237e = c4264z.f18583c;
            if (interfaceC4237e != null) {
                interfaceC4237e2 = c4264z.f18583c;
                interfaceC4237e2.mo17696u0((Exception) AbstractC5391n.m21783i(this.f18579a.mo17707i()));
            }
        }
    }
}
