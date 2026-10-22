package ee;

import com.lzy.okgo.cache.CacheEntity;
import ee.InterfaceC4184g;
import ne.AbstractC5868k;

/* renamed from: ee.e */
/* loaded from: classes3.dex */
public interface InterfaceC4182e extends InterfaceC4184g.b {

    /* renamed from: d0 */
    public static final b f18296d0 = b.f18297a;

    /* renamed from: ee.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static InterfaceC4184g.b m17490a(InterfaceC4182e interfaceC4182e, InterfaceC4184g.c cVar) {
            AbstractC5868k.m23674f(cVar, CacheEntity.KEY);
            if (cVar instanceof AbstractC4179b) {
                AbstractC4179b abstractC4179b = (AbstractC4179b) cVar;
                if (!abstractC4179b.m17480a(interfaceC4182e.getKey())) {
                    return null;
                }
                InterfaceC4184g.b m17481b = abstractC4179b.m17481b(interfaceC4182e);
                if (!(m17481b instanceof InterfaceC4184g.b)) {
                    return null;
                }
                return m17481b;
            }
            if (InterfaceC4182e.f18296d0 != cVar) {
                return null;
            }
            AbstractC5868k.m23672d(interfaceC4182e, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return interfaceC4182e;
        }

        /* renamed from: b */
        public static InterfaceC4184g m17491b(InterfaceC4182e interfaceC4182e, InterfaceC4184g.c cVar) {
            AbstractC5868k.m23674f(cVar, CacheEntity.KEY);
            if (cVar instanceof AbstractC4179b) {
                AbstractC4179b abstractC4179b = (AbstractC4179b) cVar;
                if (abstractC4179b.m17480a(interfaceC4182e.getKey()) && abstractC4179b.m17481b(interfaceC4182e) != null) {
                    return C4185h.f18299a;
                }
                return interfaceC4182e;
            }
            if (InterfaceC4182e.f18296d0 == cVar) {
                return C4185h.f18299a;
            }
            return interfaceC4182e;
        }
    }

    /* renamed from: ee.e$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC4184g.c {

        /* renamed from: a */
        static final /* synthetic */ b f18297a = new b();

        private b() {
        }
    }

    /* renamed from: n */
    InterfaceC4181d mo17488n(InterfaceC4181d interfaceC4181d);

    /* renamed from: s */
    void mo17489s(InterfaceC4181d interfaceC4181d);
}
