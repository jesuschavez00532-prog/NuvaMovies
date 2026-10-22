package ve;

import ee.C4185h;
import ee.InterfaceC4181d;
import ee.InterfaceC4182e;
import ee.InterfaceC4184g;
import ge.AbstractC4441h;
import kotlinx.coroutines.internal.AbstractC5284w;
import kotlinx.coroutines.internal.C5279r;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import p136fe.AbstractC4313d;
import p404xe.AbstractC7649a;
import p404xe.AbstractC7650b;

/* renamed from: ve.e */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC7272e {
    /* renamed from: a */
    public static final InterfaceC7271d1 m28124a(InterfaceC7261a0 interfaceC7261a0, InterfaceC4184g interfaceC4184g, EnumC7267c0 enumC7267c0, InterfaceC5664p interfaceC5664p) {
        C7307p1 c7307p1;
        InterfaceC4184g m28310c = AbstractC7326w.m28310c(interfaceC7261a0, interfaceC4184g);
        if (enumC7267c0.m28110b()) {
            c7307p1 = new C7289j1(m28310c, interfaceC5664p);
        } else {
            c7307p1 = new C7307p1(m28310c, true);
        }
        c7307p1.m28104v0(enumC7267c0, c7307p1, interfaceC5664p);
        return c7307p1;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC7271d1 m28125b(InterfaceC7261a0 interfaceC7261a0, InterfaceC4184g interfaceC4184g, EnumC7267c0 enumC7267c0, InterfaceC5664p interfaceC5664p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC4184g = C4185h.f18299a;
        }
        if ((i10 & 2) != 0) {
            enumC7267c0 = EnumC7267c0.DEFAULT;
        }
        return AbstractC7269d.m28111a(interfaceC7261a0, interfaceC4184g, enumC7267c0, interfaceC5664p);
    }

    /* renamed from: c */
    public static final Object m28126c(InterfaceC4184g interfaceC4184g, InterfaceC5664p interfaceC5664p, InterfaceC4181d interfaceC4181d) {
        Object m28241w0;
        Object m18094c;
        InterfaceC4184g mo17487e = interfaceC4181d.mo17487e();
        InterfaceC4184g plus = mo17487e.plus(interfaceC4184g);
        AbstractC7331x1.m28312a(plus);
        if (plus == mo17487e) {
            C5279r c5279r = new C5279r(plus, interfaceC4181d);
            m28241w0 = AbstractC7650b.m29436b(c5279r, c5279r, interfaceC5664p);
        } else {
            InterfaceC4182e.b bVar = InterfaceC4182e.f18296d0;
            if (AbstractC5868k.m23669a((InterfaceC4182e) plus.get(bVar), (InterfaceC4182e) mo17487e.get(bVar))) {
                C7325v1 c7325v1 = new C7325v1(plus, interfaceC4181d);
                Object m21262c = AbstractC5284w.m21262c(plus, null);
                try {
                    Object m29436b = AbstractC7650b.m29436b(c7325v1, c7325v1, interfaceC5664p);
                    AbstractC5284w.m21260a(plus, m21262c);
                    m28241w0 = m29436b;
                } catch (Throwable th) {
                    AbstractC5284w.m21260a(plus, m21262c);
                    throw th;
                }
            } else {
                C7288j0 c7288j0 = new C7288j0(plus, interfaceC4181d);
                c7288j0.m28100r0();
                AbstractC7649a.m29434c(interfaceC5664p, c7288j0, c7288j0, null, 4, null);
                m28241w0 = c7288j0.m28241w0();
            }
        }
        m18094c = AbstractC4313d.m18094c();
        if (m28241w0 == m18094c) {
            AbstractC4441h.m18639c(interfaceC4181d);
        }
        return m28241w0;
    }
}
