package ve;

import be.AbstractC1319o;
import be.AbstractC1320p;
import ee.InterfaceC4181d;
import me.InterfaceC5660l;

/* renamed from: ve.v */
/* loaded from: classes3.dex */
public abstract class AbstractC7323v {
    /* renamed from: a */
    public static final Object m28303a(Object obj, InterfaceC4181d interfaceC4181d) {
        if (obj instanceof C7311r) {
            AbstractC1319o.a aVar = AbstractC1319o.f4987a;
            return AbstractC1319o.m5971a(AbstractC1320p.m5975a(((C7311r) obj).f27215a));
        }
        return AbstractC1319o.m5971a(obj);
    }

    /* renamed from: b */
    public static final Object m28304b(Object obj, InterfaceC5660l interfaceC5660l) {
        Throwable m5972b = AbstractC1319o.m5972b(obj);
        if (m5972b == null) {
            if (interfaceC5660l != null) {
                return new C7314s(obj, interfaceC5660l);
            }
            return obj;
        }
        return new C7311r(m5972b, false, 2, null);
    }

    /* renamed from: c */
    public static final Object m28305c(Object obj, InterfaceC7281h interfaceC7281h) {
        Throwable m5972b = AbstractC1319o.m5972b(obj);
        if (m5972b != null) {
            return new C7311r(m5972b, false, 2, null);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m28306d(Object obj, InterfaceC5660l interfaceC5660l, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            interfaceC5660l = null;
        }
        return m28304b(obj, interfaceC5660l);
    }
}
