package p404xe;

import be.AbstractC1319o;
import be.AbstractC1320p;
import ee.InterfaceC4181d;
import ee.InterfaceC4184g;
import ge.AbstractC4441h;
import kotlinx.coroutines.internal.AbstractC5284w;
import kotlinx.coroutines.internal.C5279r;
import me.InterfaceC5664p;
import ne.AbstractC5882y;
import p136fe.AbstractC4313d;
import ve.AbstractC7286i1;
import ve.C7311r;

/* renamed from: xe.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7650b {
    /* renamed from: a */
    public static final void m29435a(InterfaceC5664p interfaceC5664p, Object obj, InterfaceC4181d interfaceC4181d) {
        Object m18094c = null;
        InterfaceC4181d m18637a = AbstractC4441h.m18637a(interfaceC4181d);
        try {
            InterfaceC4184g mo17487e = interfaceC4181d.mo17487e();
            Object m21262c = AbstractC5284w.m21262c(mo17487e, null);
            try {
                if (interfaceC5664p != null) {
                    Object mo2391h = ((InterfaceC5664p) AbstractC5882y.m23704d(interfaceC5664p, 2)).mo2391h(obj, m18637a);
                    m18094c = AbstractC4313d.m18094c();
                    if (mo2391h != m18094c) {
                        m18637a.mo17486d(AbstractC1319o.m5971a(mo2391h));
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } finally {
                AbstractC5284w.m21260a(mo17487e, m21262c);
            }
        } catch (Throwable th) {
            AbstractC1319o.a aVar = AbstractC1319o.f4987a;
            m18637a.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(th)));
        }
    }

    /* renamed from: b */
    public static final Object m29436b(C5279r c5279r, Object obj, InterfaceC5664p interfaceC5664p) {
        Object c7311r = null;
        Object m18094c = null;
        Object m18094c2 = null;
        Object m18094c3 = null;
        c5279r.m28100r0();
        try {
        } catch (Throwable th) {
            c7311r = new C7311r(th, false, 2, null);
        }
        if (interfaceC5664p != null) {
            c7311r = ((InterfaceC5664p) AbstractC5882y.m23704d(interfaceC5664p, 2)).mo2391h(obj, c5279r);
            m18094c = AbstractC4313d.m18094c();
            if (c7311r == m18094c) {
                m18094c3 = AbstractC4313d.m18094c();
                return m18094c3;
            }
            Object m28176T = c5279r.m28176T(c7311r);
            if (m28176T == AbstractC7286i1.f27182b) {
                m18094c2 = AbstractC4313d.m18094c();
                return m18094c2;
            }
            if (!(m28176T instanceof C7311r)) {
                return AbstractC7286i1.m28237h(m28176T);
            }
            throw ((C7311r) m28176T).f27215a;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }
}
