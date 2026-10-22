package ee;

import com.lzy.okgo.cache.CacheEntity;
import com.umeng.analytics.pro.C3384f;
import ee.InterfaceC4182e;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;

/* renamed from: ee.g */
/* loaded from: classes3.dex */
public interface InterfaceC4184g {

    /* renamed from: ee.g$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ee.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C7846a extends AbstractC5869l implements InterfaceC5664p {

            /* renamed from: a */
            public static final C7846a f18298a = new C7846a();

            C7846a() {
                super(2);
            }

            @Override // me.InterfaceC5664p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC4184g mo2391h(InterfaceC4184g interfaceC4184g, b bVar) {
                C4180c c4180c;
                AbstractC5868k.m23674f(interfaceC4184g, "acc");
                AbstractC5868k.m23674f(bVar, "element");
                InterfaceC4184g minusKey = interfaceC4184g.minusKey(bVar.getKey());
                C4185h c4185h = C4185h.f18299a;
                if (minusKey != c4185h) {
                    InterfaceC4182e.b bVar2 = InterfaceC4182e.f18296d0;
                    InterfaceC4182e interfaceC4182e = (InterfaceC4182e) minusKey.get(bVar2);
                    if (interfaceC4182e == null) {
                        c4180c = new C4180c(minusKey, bVar);
                    } else {
                        InterfaceC4184g minusKey2 = minusKey.minusKey(bVar2);
                        if (minusKey2 == c4185h) {
                            return new C4180c(bVar, interfaceC4182e);
                        }
                        c4180c = new C4180c(new C4180c(minusKey2, bVar), interfaceC4182e);
                    }
                    return c4180c;
                }
                return bVar;
            }
        }

        /* renamed from: a */
        public static InterfaceC4184g m17493a(InterfaceC4184g interfaceC4184g, InterfaceC4184g interfaceC4184g2) {
            AbstractC5868k.m23674f(interfaceC4184g2, C3384f.f14563X);
            if (interfaceC4184g2 != C4185h.f18299a) {
                return (InterfaceC4184g) interfaceC4184g2.fold(interfaceC4184g, C7846a.f18298a);
            }
            return interfaceC4184g;
        }
    }

    /* renamed from: ee.g$b */
    /* loaded from: classes3.dex */
    public interface b extends InterfaceC4184g {

        /* renamed from: ee.g$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            /* renamed from: a */
            public static Object m17495a(b bVar, Object obj, InterfaceC5664p interfaceC5664p) {
                AbstractC5868k.m23674f(interfaceC5664p, "operation");
                return interfaceC5664p.mo2391h(obj, bVar);
            }

            /* renamed from: b */
            public static b m17496b(b bVar, c cVar) {
                AbstractC5868k.m23674f(cVar, CacheEntity.KEY);
                if (AbstractC5868k.m23669a(bVar.getKey(), cVar)) {
                    AbstractC5868k.m23672d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            /* renamed from: c */
            public static InterfaceC4184g m17497c(b bVar, c cVar) {
                AbstractC5868k.m23674f(cVar, CacheEntity.KEY);
                if (AbstractC5868k.m23669a(bVar.getKey(), cVar)) {
                    return C4185h.f18299a;
                }
                return bVar;
            }

            /* renamed from: d */
            public static InterfaceC4184g m17498d(b bVar, InterfaceC4184g interfaceC4184g) {
                AbstractC5868k.m23674f(interfaceC4184g, C3384f.f14563X);
                return a.m17493a(bVar, interfaceC4184g);
            }
        }

        @Override // ee.InterfaceC4184g
        b get(c cVar);

        c getKey();
    }

    /* renamed from: ee.g$c */
    /* loaded from: classes3.dex */
    public interface c {
    }

    Object fold(Object obj, InterfaceC5664p interfaceC5664p);

    b get(c cVar);

    InterfaceC4184g minusKey(c cVar);

    InterfaceC4184g plus(InterfaceC4184g interfaceC4184g);
}
