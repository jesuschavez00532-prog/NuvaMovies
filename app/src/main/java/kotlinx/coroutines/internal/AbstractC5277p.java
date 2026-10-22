package kotlinx.coroutines.internal;

import ve.AbstractC7273e0;

/* renamed from: kotlinx.coroutines.internal.p */
/* loaded from: classes3.dex */
public abstract class AbstractC5277p {
    /* renamed from: a */
    public abstract AbstractC5264c mo21172a();

    /* renamed from: b */
    public final boolean m21242b(AbstractC5277p abstractC5277p) {
        AbstractC5264c mo21172a;
        AbstractC5264c mo21172a2 = mo21172a();
        if (mo21172a2 == null || (mo21172a = abstractC5277p.mo21172a()) == null || mo21172a2.m21176f() >= mo21172a.m21176f()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract Object mo21173c(Object obj);

    public String toString() {
        return AbstractC7273e0.m28127a(this) + '@' + AbstractC7273e0.m28128b(this);
    }
}
