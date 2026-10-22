package p127f5;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f5.f0 */
/* loaded from: classes.dex */
public final class C4240f0 {

    /* renamed from: a */
    private final Object f18536a = new Object();

    /* renamed from: b */
    private Queue f18537b;

    /* renamed from: c */
    private boolean f18538c;

    /* renamed from: a */
    public final void m17697a(InterfaceC4238e0 interfaceC4238e0) {
        synchronized (this.f18536a) {
            if (this.f18537b == null) {
                this.f18537b = new ArrayDeque();
            }
            this.f18537b.add(interfaceC4238e0);
        }
    }

    /* renamed from: b */
    public final void m17698b(AbstractC4245i abstractC4245i) {
        InterfaceC4238e0 interfaceC4238e0;
        synchronized (this.f18536a) {
            if (this.f18537b != null && !this.f18538c) {
                this.f18538c = true;
                while (true) {
                    synchronized (this.f18536a) {
                        interfaceC4238e0 = (InterfaceC4238e0) this.f18537b.poll();
                        if (interfaceC4238e0 == null) {
                            this.f18538c = false;
                            return;
                        }
                    }
                    interfaceC4238e0.mo17693a(abstractC4245i);
                }
            }
        }
    }
}
