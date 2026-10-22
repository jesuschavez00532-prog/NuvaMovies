package ve;

import be.AbstractC1319o;
import be.AbstractC1320p;
import be.C1328x;
import ee.InterfaceC4181d;
import ee.InterfaceC4184g;
import kotlinx.coroutines.internal.AbstractC5284w;
import kotlinx.coroutines.internal.C5265d;

/* renamed from: ve.l0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7294l0 {
    /* renamed from: a */
    public static final void m28245a(AbstractC7291k0 abstractC7291k0, int i10) {
        boolean z10;
        InterfaceC4181d mo21179b = abstractC7291k0.mo21179b();
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (mo21179b instanceof C5265d) && m28246b(i10) == m28246b(abstractC7291k0.f27191c)) {
            AbstractC7329x abstractC7329x = ((C5265d) mo21179b).f21472g;
            InterfaceC4184g mo17487e = mo21179b.mo17487e();
            if (abstractC7329x.mo21240y(mo17487e)) {
                abstractC7329x.mo21239x(mo17487e, abstractC7291k0);
                return;
            } else {
                m28249e(abstractC7291k0);
                return;
            }
        }
        m28248d(abstractC7291k0, mo21179b, z10);
    }

    /* renamed from: b */
    public static final boolean m28246b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    /* renamed from: c */
    public static final boolean m28247c(int i10) {
        return i10 == 2;
    }

    /* renamed from: d */
    public static final void m28248d(AbstractC7291k0 abstractC7291k0, InterfaceC4181d interfaceC4181d, boolean z10) {
        Object mo28218f;
        Object mo21180i = abstractC7291k0.mo21180i();
        Throwable mo28217c = abstractC7291k0.mo28217c(mo21180i);
        if (mo28217c != null) {
            AbstractC1319o.a aVar = AbstractC1319o.f4987a;
            mo28218f = AbstractC1320p.m5975a(mo28217c);
        } else {
            AbstractC1319o.a aVar2 = AbstractC1319o.f4987a;
            mo28218f = abstractC7291k0.mo28218f(mo21180i);
        }
        Object m5971a = AbstractC1319o.m5971a(mo28218f);
        if (z10) {
            if (interfaceC4181d != null) {
                C5265d c5265d = (C5265d) interfaceC4181d;
                InterfaceC4184g mo17487e = c5265d.mo17487e();
                Object m21262c = AbstractC5284w.m21262c(mo17487e, c5265d.f21471f);
                try {
                    c5265d.f21473h.mo17486d(m5971a);
                    C1328x c1328x = C1328x.f4998a;
                    return;
                } finally {
                    AbstractC5284w.m21260a(mo17487e, m21262c);
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
        }
        interfaceC4181d.mo17486d(m5971a);
    }

    /* renamed from: e */
    private static final void m28249e(AbstractC7291k0 abstractC7291k0) {
        AbstractC7309q0 m28293a = C7313r1.f27225b.m28293a();
        if (m28293a.m28268F()) {
            m28293a.m28265B(abstractC7291k0);
            return;
        }
        m28293a.m28267D(true);
        try {
            m28248d(abstractC7291k0, abstractC7291k0.mo21179b(), true);
            do {
            } while (m28293a.m28270H());
        } finally {
            try {
            } finally {
            }
        }
    }
}
