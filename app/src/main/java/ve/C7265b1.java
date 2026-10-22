package ve;

import be.C1328x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import me.InterfaceC5660l;

/* renamed from: ve.b1 */
/* loaded from: classes3.dex */
final class C7265b1 extends AbstractC7277f1 {

    /* renamed from: f */
    private static final AtomicIntegerFieldUpdater f27152f = AtomicIntegerFieldUpdater.newUpdater(C7265b1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e */
    private final InterfaceC5660l f27153e;

    public C7265b1(InterfaceC7271d1 interfaceC7271d1, InterfaceC5660l interfaceC5660l) {
        super(interfaceC7271d1);
        this.f27153e = interfaceC5660l;
        this._invoked = 0;
    }

    @Override // me.InterfaceC5660l
    /* renamed from: f */
    public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
        mo28107u((Throwable) obj);
        return C1328x.f4998a;
    }

    @Override // ve.AbstractC7317t
    /* renamed from: u */
    public void mo28107u(Throwable th) {
        if (f27152f.compareAndSet(this, 0, 1)) {
            this.f27153e.mo542f(th);
        }
    }
}
