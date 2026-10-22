package ve;

import be.AbstractC1319o;
import be.AbstractC1320p;
import ee.InterfaceC4181d;
import kotlinx.coroutines.internal.C5265d;

/* renamed from: ve.e0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7273e0 {
    /* renamed from: a */
    public static final String m28127a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m28128b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m28129c(InterfaceC4181d interfaceC4181d) {
        Object m5971a;
        if (interfaceC4181d instanceof C5265d) {
            return interfaceC4181d.toString();
        }
        try {
            AbstractC1319o.a aVar = AbstractC1319o.f4987a;
            m5971a = AbstractC1319o.m5971a(interfaceC4181d + '@' + m28128b(interfaceC4181d));
        } catch (Throwable th) {
            AbstractC1319o.a aVar2 = AbstractC1319o.f4987a;
            m5971a = AbstractC1319o.m5971a(AbstractC1320p.m5975a(th));
        }
        if (AbstractC1319o.m5972b(m5971a) != null) {
            m5971a = interfaceC4181d.getClass().getName() + '@' + m28128b(interfaceC4181d);
        }
        return (String) m5971a;
    }
}
