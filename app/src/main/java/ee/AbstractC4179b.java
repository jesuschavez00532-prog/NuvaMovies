package ee;

import com.lzy.okgo.cache.CacheEntity;
import ee.InterfaceC4184g;
import me.InterfaceC5660l;
import ne.AbstractC5868k;

/* renamed from: ee.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4179b implements InterfaceC4184g.c {

    /* renamed from: a */
    private final InterfaceC5660l f18291a;

    /* renamed from: b */
    private final InterfaceC4184g.c f18292b;

    public AbstractC4179b(InterfaceC4184g.c cVar, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(cVar, "baseKey");
        AbstractC5868k.m23674f(interfaceC5660l, "safeCast");
        this.f18291a = interfaceC5660l;
        this.f18292b = cVar instanceof AbstractC4179b ? ((AbstractC4179b) cVar).f18292b : cVar;
    }

    /* renamed from: a */
    public final boolean m17480a(InterfaceC4184g.c cVar) {
        AbstractC5868k.m23674f(cVar, CacheEntity.KEY);
        if (cVar != this && this.f18292b != cVar) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final InterfaceC4184g.b m17481b(InterfaceC4184g.b bVar) {
        AbstractC5868k.m23674f(bVar, "element");
        return (InterfaceC4184g.b) this.f18291a.mo542f(bVar);
    }
}
