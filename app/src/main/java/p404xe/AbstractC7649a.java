package p404xe;

import be.AbstractC1319o;
import be.AbstractC1320p;
import be.C1328x;
import ee.InterfaceC4181d;
import kotlinx.coroutines.internal.AbstractC5266e;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import p136fe.AbstractC4312c;

/* renamed from: xe.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7649a {
    /* renamed from: a */
    public static final void m29432a(InterfaceC4181d interfaceC4181d, InterfaceC4181d interfaceC4181d2) {
        InterfaceC4181d m18093b;
        try {
            m18093b = AbstractC4312c.m18093b(interfaceC4181d);
            AbstractC1319o.a aVar = AbstractC1319o.f4987a;
            AbstractC5266e.m21187c(m18093b, AbstractC1319o.m5971a(C1328x.f4998a), null, 2, null);
        } catch (Throwable th) {
            AbstractC1319o.a aVar2 = AbstractC1319o.f4987a;
            interfaceC4181d2.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(th)));
        }
    }

    /* renamed from: b */
    public static final void m29433b(InterfaceC5664p interfaceC5664p, Object obj, InterfaceC4181d interfaceC4181d, InterfaceC5660l interfaceC5660l) {
        InterfaceC4181d m18092a;
        InterfaceC4181d m18093b;
        try {
            m18092a = AbstractC4312c.m18092a(interfaceC5664p, obj, interfaceC4181d);
            m18093b = AbstractC4312c.m18093b(m18092a);
            AbstractC1319o.a aVar = AbstractC1319o.f4987a;
            AbstractC5266e.m21186b(m18093b, AbstractC1319o.m5971a(C1328x.f4998a), interfaceC5660l);
        } catch (Throwable th) {
            AbstractC1319o.a aVar2 = AbstractC1319o.f4987a;
            interfaceC4181d.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(th)));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m29434c(InterfaceC5664p interfaceC5664p, Object obj, InterfaceC4181d interfaceC4181d, InterfaceC5660l interfaceC5660l, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            interfaceC5660l = null;
        }
        m29433b(interfaceC5664p, obj, interfaceC4181d, interfaceC5660l);
    }
}
