package ve;

import ee.InterfaceC4181d;
import ee.InterfaceC4184g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.AbstractC5266e;
import kotlinx.coroutines.internal.C5279r;
import p136fe.AbstractC4312c;
import p136fe.AbstractC4313d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ve.j0 */
/* loaded from: classes3.dex */
public final class C7288j0 extends C5279r {

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f27188e = AtomicIntegerFieldUpdater.newUpdater(C7288j0.class, "_decision");
    private volatile int _decision;

    public C7288j0(InterfaceC4184g interfaceC4184g, InterfaceC4181d interfaceC4181d) {
        super(interfaceC4184g, interfaceC4181d);
        this._decision = 0;
    }

    /* renamed from: x0 */
    private final boolean m28239x0() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f27188e.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: y0 */
    private final boolean m28240y0() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f27188e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.C5279r, ve.AbstractC7260a
    /* renamed from: q0 */
    protected void mo21244q0(Object obj) {
        InterfaceC4181d m18093b;
        if (!m28239x0()) {
            m18093b = AbstractC4312c.m18093b(this.f21502d);
            AbstractC5266e.m21187c(m18093b, AbstractC7323v.m28303a(obj, this.f21502d), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.C5279r, ve.C7283h1
    /* renamed from: u */
    public void mo21245u(Object obj) {
        mo21244q0(obj);
    }

    /* renamed from: w0 */
    public final Object m28241w0() {
        Object m18094c = null;
        if (m28240y0()) {
            m18094c = AbstractC4313d.m18094c();
            return m18094c;
        }
        Object m28237h = AbstractC7286i1.m28237h(m28172M());
        if (!(m28237h instanceof C7311r)) {
            return m28237h;
        }
        throw ((C7311r) m28237h).f27215a;
    }
}
