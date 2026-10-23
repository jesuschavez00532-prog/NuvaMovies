package ge;

import ee.C4185h;
import ee.InterfaceC4181d;
import ee.InterfaceC4184g;

/* renamed from: ge.j */
/* loaded from: classes3.dex */
public abstract class AbstractC4443j extends AbstractC4434a {
    public AbstractC4443j(InterfaceC4181d interfaceC4181d) {
        super(interfaceC4181d);
        boolean z10 = false;
        if (interfaceC4181d != null) {
            if (interfaceC4181d.mo17487e() == C4185h.f18299a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: e */
    public InterfaceC4184g mo17487e() {
        return C4185h.f18299a;
    }
}
