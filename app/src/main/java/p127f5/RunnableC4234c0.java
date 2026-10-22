package p127f5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: f5.c0 */
/* loaded from: classes.dex */
final class RunnableC4234c0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC4245i f18531a;

    /* renamed from: b */
    final /* synthetic */ C4236d0 f18532b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4234c0(C4236d0 c4236d0, AbstractC4245i abstractC4245i) {
        this.f18532b = c4236d0;
        this.f18531a = abstractC4245i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4243h interfaceC4243h;
        try {
            interfaceC4243h = this.f18532b.f18534b;
            AbstractC4245i mo346a = interfaceC4243h.mo346a(this.f18531a.mo17708j());
            if (mo346a == null) {
                this.f18532b.mo17696u0(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = AbstractC4249k.f18550b;
            mo346a.mo17703e(executor, this.f18532b);
            mo346a.mo17702d(executor, this.f18532b);
            mo346a.mo17699a(executor, this.f18532b);
        } catch (C4241g e10) {
            if (e10.getCause() instanceof Exception) {
                this.f18532b.mo17696u0((Exception) e10.getCause());
            } else {
                this.f18532b.mo17696u0(e10);
            }
        } catch (CancellationException unused) {
            this.f18532b.mo17694b();
        } catch (Exception e11) {
            this.f18532b.mo17696u0(e11);
        }
    }
}
