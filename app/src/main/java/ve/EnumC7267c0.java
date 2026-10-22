package ve;

import be.C1317m;
import ee.AbstractC4183f;
import ee.InterfaceC4181d;
import me.InterfaceC5664p;
import p404xe.AbstractC7649a;
import p404xe.AbstractC7650b;

/* renamed from: ve.c0 */
/* loaded from: classes3.dex */
public enum EnumC7267c0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: a */
    public final void m28109a(InterfaceC5664p interfaceC5664p, Object obj, InterfaceC4181d interfaceC4181d) {
        int i10 = AbstractC7264b0.f27151b[ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new C1317m();
                    }
                    return;
                } else {
                    AbstractC7650b.m29435a(interfaceC5664p, obj, interfaceC4181d);
                    return;
                }
            }
            AbstractC4183f.m17492a(interfaceC5664p, obj, interfaceC4181d);
            return;
        }
        AbstractC7649a.m29434c(interfaceC5664p, obj, interfaceC4181d, null, 4, null);
    }

    /* renamed from: b */
    public final boolean m28110b() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }
}
