package kotlinx.coroutines.internal;

import be.AbstractC1319o;
import be.AbstractC1320p;
import be.C1328x;
import ee.InterfaceC4181d;
import ee.InterfaceC4184g;
import java.util.concurrent.CancellationException;
import me.InterfaceC5660l;
import ve.AbstractC7309q0;
import ve.AbstractC7323v;
import ve.C7313r1;
import ve.InterfaceC7271d1;

/* renamed from: kotlinx.coroutines.internal.e */
/* loaded from: classes3.dex */
public abstract class AbstractC5266e {

    /* renamed from: a */
    private static final C5280s f21474a = new C5280s("UNDEFINED");

    /* renamed from: b */
    public static final C5280s f21475b = new C5280s("REUSABLE_CLAIMED");

    /* renamed from: a */
    public static final /* synthetic */ C5280s m21185a() {
        return f21474a;
    }

    /* renamed from: b */
    public static final void m21186b(InterfaceC4181d interfaceC4181d, Object obj, InterfaceC5660l interfaceC5660l) {
        boolean z10;
        if (interfaceC4181d instanceof C5265d) {
            C5265d c5265d = (C5265d) interfaceC4181d;
            Object m28304b = AbstractC7323v.m28304b(obj, interfaceC5660l);
            if (c5265d.f21472g.mo21240y(c5265d.mo17487e())) {
                c5265d.f21469d = m28304b;
                c5265d.f27191c = 1;
                c5265d.f21472g.mo21239x(c5265d.mo17487e(), c5265d);
                return;
            }
            AbstractC7309q0 m28293a = C7313r1.f27225b.m28293a();
            if (m28293a.m28268F()) {
                c5265d.f21469d = m28304b;
                c5265d.f27191c = 1;
                m28293a.m28265B(c5265d);
                return;
            }
            m28293a.m28267D(true);
            try {
                InterfaceC7271d1 interfaceC7271d1 = (InterfaceC7271d1) c5265d.mo17487e().get(InterfaceC7271d1.f27161f0);
                if (interfaceC7271d1 != null && !interfaceC7271d1.mo28096a()) {
                    CancellationException mo28115h = interfaceC7271d1.mo28115h();
                    c5265d.mo21178a(m28304b, mo28115h);
                    AbstractC1319o.a aVar = AbstractC1319o.f4987a;
                    c5265d.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(mo28115h)));
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    InterfaceC4184g mo17487e = c5265d.mo17487e();
                    Object m21262c = AbstractC5284w.m21262c(mo17487e, c5265d.f21471f);
                    try {
                        c5265d.f21473h.mo17486d(obj);
                        C1328x c1328x = C1328x.f4998a;
                        AbstractC5284w.m21260a(mo17487e, m21262c);
                    } catch (Throwable th) {
                        AbstractC5284w.m21260a(mo17487e, m21262c);
                        throw th;
                    }
                }
                do {
                } while (m28293a.m28270H());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC4181d.mo17486d(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m21187c(InterfaceC4181d interfaceC4181d, Object obj, InterfaceC5660l interfaceC5660l, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC5660l = null;
        }
        m21186b(interfaceC4181d, obj, interfaceC5660l);
    }
}
