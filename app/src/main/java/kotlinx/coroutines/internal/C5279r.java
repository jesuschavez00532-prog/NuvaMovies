package kotlinx.coroutines.internal;

import ee.InterfaceC4181d;
import ee.InterfaceC4184g;
import ge.InterfaceC4438e;
import p136fe.AbstractC4312c;
import ve.AbstractC7260a;
import ve.AbstractC7323v;

/* renamed from: kotlinx.coroutines.internal.r */
/* loaded from: classes3.dex */
public class C5279r extends AbstractC7260a implements InterfaceC4438e {

    /* renamed from: d */
    public final InterfaceC4181d f21502d;

    public C5279r(InterfaceC4184g interfaceC4184g, InterfaceC4181d interfaceC4181d) {
        super(interfaceC4184g, true);
        this.f21502d = interfaceC4181d;
    }

    @Override // ve.C7283h1
    /* renamed from: R */
    protected final boolean mo21243R() {
        return true;
    }

    @Override // ve.AbstractC7260a
    /* renamed from: q0 */
    protected void mo21244q0(Object obj) {
        InterfaceC4181d interfaceC4181d = this.f21502d;
        interfaceC4181d.mo17486d(AbstractC7323v.m28303a(obj, interfaceC4181d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ve.C7283h1
    /* renamed from: u */
    public void mo21245u(Object obj) {
        InterfaceC4181d m18093b;
        m18093b = AbstractC4312c.m18093b(this.f21502d);
        AbstractC5266e.m21187c(m18093b, AbstractC7323v.m28303a(obj, this.f21502d), null, 2, null);
    }
}
