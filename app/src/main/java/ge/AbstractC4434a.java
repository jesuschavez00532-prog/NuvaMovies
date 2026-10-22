package ge;

import be.AbstractC1319o;
import be.AbstractC1320p;
import ee.InterfaceC4181d;
import java.io.Serializable;
import ne.AbstractC5868k;
import p136fe.AbstractC4313d;

/* renamed from: ge.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4434a implements InterfaceC4181d, InterfaceC4438e, Serializable {

    /* renamed from: a */
    private final InterfaceC4181d f19251a;

    public AbstractC4434a(InterfaceC4181d interfaceC4181d) {
        this.f19251a = interfaceC4181d;
    }

    /* renamed from: a */
    public InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
        AbstractC5868k.m23674f(interfaceC4181d, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: d */
    public final void mo17486d(Object obj) {
        Object mo2392l;
        Object m18094c;
        InterfaceC4181d interfaceC4181d = this;
        while (true) {
            AbstractC4441h.m18638b(interfaceC4181d);
            AbstractC4434a abstractC4434a = (AbstractC4434a) interfaceC4181d;
            InterfaceC4181d interfaceC4181d2 = abstractC4434a.f19251a;
            AbstractC5868k.m23671c(interfaceC4181d2);
            try {
                mo2392l = abstractC4434a.mo2392l(obj);
                m18094c = AbstractC4313d.m18094c();
            } catch (Throwable th) {
                AbstractC1319o.a aVar = AbstractC1319o.f4987a;
                obj = AbstractC1319o.m5971a(AbstractC1320p.m5975a(th));
            }
            if (mo2392l == m18094c) {
                return;
            }
            obj = AbstractC1319o.m5971a(mo2392l);
            abstractC4434a.mo18625m();
            if (interfaceC4181d2 instanceof AbstractC4434a) {
                interfaceC4181d = interfaceC4181d2;
            } else {
                interfaceC4181d2.mo17486d(obj);
                return;
            }
        }
    }

    /* renamed from: i */
    public final InterfaceC4181d m18623i() {
        return this.f19251a;
    }

    /* renamed from: k */
    public StackTraceElement m18624k() {
        return AbstractC4440g.m18636d(this);
    }

    /* renamed from: l */
    protected abstract Object mo2392l(Object obj);

    /* renamed from: m */
    protected void mo18625m() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object m18624k = m18624k();
        if (m18624k == null) {
            m18624k = getClass().getName();
        }
        sb2.append(m18624k);
        return sb2.toString();
    }
}
