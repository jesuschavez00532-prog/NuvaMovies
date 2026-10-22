package ve;

import be.C1328x;
import ee.InterfaceC4181d;
import ee.InterfaceC4182e;
import ee.InterfaceC4184g;
import ge.AbstractC4441h;
import p136fe.AbstractC4312c;
import p136fe.AbstractC4313d;

/* renamed from: ve.i0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7285i0 {
    /* renamed from: a */
    public static final Object m28228a(long j10, InterfaceC4181d interfaceC4181d) {
        InterfaceC4181d m18093b;
        Object m18094c;
        if (j10 > 0) {
            m18093b = AbstractC4312c.m18093b(interfaceC4181d);
            C7284i c7284i = new C7284i(m18093b, 1);
            c7284i.m28226y();
            if (j10 < Long.MAX_VALUE) {
                m28229b(c7284i.mo17487e()).mo21238e(j10, c7284i);
            }
            Object m28224w = c7284i.m28224w();
            m18094c = AbstractC4313d.m18094c();
            if (m28224w == m18094c) {
                AbstractC4441h.m18639c(interfaceC4181d);
            }
            return m28224w;
        }
        return C1328x.f4998a;
    }

    /* renamed from: b */
    public static final InterfaceC7282h0 m28229b(InterfaceC4184g interfaceC4184g) {
        InterfaceC4184g.b bVar = interfaceC4184g.get(InterfaceC4182e.f18296d0);
        if (!(bVar instanceof InterfaceC7282h0)) {
            bVar = null;
        }
        InterfaceC7282h0 interfaceC7282h0 = (InterfaceC7282h0) bVar;
        if (interfaceC7282h0 == null) {
            return AbstractC7279g0.m28134a();
        }
        return interfaceC7282h0;
    }
}
