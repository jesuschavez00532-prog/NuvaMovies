package ve;

import be.AbstractC1306b;
import be.AbstractC1319o;
import be.AbstractC1320p;
import be.C1328x;
import ee.InterfaceC4181d;
import ee.InterfaceC4184g;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.AbstractC5284w;
import kotlinx.coroutines.internal.C5265d;
import kotlinx.coroutines.scheduling.AbstractRunnableC5296i;
import kotlinx.coroutines.scheduling.InterfaceC5297j;
import ne.AbstractC5868k;

/* renamed from: ve.k0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7291k0 extends AbstractRunnableC5296i {

    /* renamed from: c */
    public int f27191c;

    public AbstractC7291k0(int i10) {
        this.f27191c = i10;
    }

    /* renamed from: a */
    public abstract void mo21178a(Object obj, Throwable th);

    /* renamed from: b */
    public abstract InterfaceC4181d mo21179b();

    /* renamed from: c */
    public Throwable mo28217c(Object obj) {
        if (!(obj instanceof C7311r)) {
            obj = null;
        }
        C7311r c7311r = (C7311r) obj;
        if (c7311r == null) {
            return null;
        }
        return c7311r.f27215a;
    }

    /* renamed from: f */
    public Object mo28218f(Object obj) {
        return obj;
    }

    /* renamed from: h */
    public final void m28243h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC1306b.m5958a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC5868k.m23671c(th);
        AbstractC7334z.m28314a(mo21179b().mo17487e(), new C7270d0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: i */
    public abstract Object mo21180i();

    @Override // java.lang.Runnable
    public final void run() {
        Object m5971a = null;
        InterfaceC7271d1 interfaceC7271d1;
        Object m5971a2 = null;
        InterfaceC5297j interfaceC5297j = this.f21562b;
        try {
            InterfaceC4181d mo21179b = mo21179b();
            if (mo21179b != null) {
                C5265d c5265d = (C5265d) mo21179b;
                InterfaceC4181d interfaceC4181d = c5265d.f21473h;
                InterfaceC4184g mo17487e = interfaceC4181d.mo17487e();
                Object mo21180i = mo21180i();
                Object m21262c = AbstractC5284w.m21262c(mo17487e, c5265d.f21471f);
                try {
                    Throwable mo28217c = mo28217c(mo21180i);
                    if (mo28217c == null && AbstractC7294l0.m28246b(this.f27191c)) {
                        interfaceC7271d1 = (InterfaceC7271d1) mo17487e.get(InterfaceC7271d1.f27161f0);
                    } else {
                        interfaceC7271d1 = null;
                    }
                    if (interfaceC7271d1 != null && !interfaceC7271d1.mo28096a()) {
                        CancellationException mo28115h = interfaceC7271d1.mo28115h();
                        mo21178a(mo21180i, mo28115h);
                        AbstractC1319o.a aVar = AbstractC1319o.f4987a;
                        interfaceC4181d.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(mo28115h)));
                    } else if (mo28217c != null) {
                        AbstractC1319o.a aVar2 = AbstractC1319o.f4987a;
                        interfaceC4181d.mo17486d(AbstractC1319o.m5971a(AbstractC1320p.m5975a(mo28217c)));
                    } else {
                        interfaceC4181d.mo17486d(AbstractC1319o.m5971a(mo28218f(mo21180i)));
                    }
                    C1328x c1328x = C1328x.f4998a;
                    try {
                        interfaceC5297j.mo21332d();
                        m5971a2 = AbstractC1319o.m5971a(C1328x.f4998a);
                    } catch (Throwable th) {
                        AbstractC1319o.a aVar3 = AbstractC1319o.f4987a;
                        m5971a2 = AbstractC1319o.m5971a(AbstractC1320p.m5975a(th));
                    }
                    m28243h(null, AbstractC1319o.m5972b(m5971a2));
                    return;
                } finally {
                    AbstractC5284w.m21260a(mo17487e, m21262c);
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T>");
        } catch (Throwable th2) {
            try {
                AbstractC1319o.a aVar4 = AbstractC1319o.f4987a;
                interfaceC5297j.mo21332d();
                m5971a = AbstractC1319o.m5971a(C1328x.f4998a);
            } catch (Throwable th3) {
                AbstractC1319o.a aVar5 = AbstractC1319o.f4987a;
                m5971a = AbstractC1319o.m5971a(AbstractC1320p.m5975a(th3));
            }
            m28243h(th2, AbstractC1319o.m5972b(m5971a));
        }
    }
}
