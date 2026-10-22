package ee;

import com.lzy.okgo.cache.CacheEntity;
import com.umeng.analytics.pro.C3384f;
import ee.InterfaceC4184g;
import java.io.Serializable;
import me.InterfaceC5664p;
import ne.AbstractC5868k;

/* renamed from: ee.h */
/* loaded from: classes3.dex */
public final class C4185h implements InterfaceC4184g, Serializable {

    /* renamed from: a */
    public static final C4185h f18299a = new C4185h();

    private C4185h() {
    }

    @Override // ee.InterfaceC4184g
    public Object fold(Object obj, InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "operation");
        return obj;
    }

    @Override // ee.InterfaceC4184g
    public InterfaceC4184g.b get(InterfaceC4184g.c cVar) {
        AbstractC5868k.m23674f(cVar, CacheEntity.KEY);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // ee.InterfaceC4184g
    public InterfaceC4184g minusKey(InterfaceC4184g.c cVar) {
        AbstractC5868k.m23674f(cVar, CacheEntity.KEY);
        return this;
    }

    @Override // ee.InterfaceC4184g
    public InterfaceC4184g plus(InterfaceC4184g interfaceC4184g) {
        AbstractC5868k.m23674f(interfaceC4184g, C3384f.f14563X);
        return interfaceC4184g;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
