package ee;

import com.lzy.okgo.cache.CacheEntity;
import ee.InterfaceC4184g;
import me.InterfaceC5664p;
import ne.AbstractC5868k;

/* renamed from: ee.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4178a implements InterfaceC4184g.b {
    private final InterfaceC4184g.c key;

    public AbstractC4178a(InterfaceC4184g.c cVar) {
        AbstractC5868k.m23674f(cVar, CacheEntity.KEY);
        this.key = cVar;
    }

    @Override // ee.InterfaceC4184g
    public <R> R fold(R r10, InterfaceC5664p interfaceC5664p) {
        return (R) InterfaceC4184g.b.a.m17495a(this, r10, interfaceC5664p);
    }

    @Override // ee.InterfaceC4184g.b, ee.InterfaceC4184g
    public <E extends InterfaceC4184g.b> E get(InterfaceC4184g.c cVar) {
        return (E) InterfaceC4184g.b.a.m17496b(this, cVar);
    }

    @Override // ee.InterfaceC4184g.b
    public InterfaceC4184g.c getKey() {
        return this.key;
    }

    @Override // ee.InterfaceC4184g
    public InterfaceC4184g minusKey(InterfaceC4184g.c cVar) {
        return InterfaceC4184g.b.a.m17497c(this, cVar);
    }

    @Override // ee.InterfaceC4184g
    public InterfaceC4184g plus(InterfaceC4184g interfaceC4184g) {
        return InterfaceC4184g.b.a.m17498d(this, interfaceC4184g);
    }
}
