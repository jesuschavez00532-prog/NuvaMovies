package kotlinx.coroutines.internal;

import ee.InterfaceC4184g;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ve.InterfaceC7310q1;

/* renamed from: kotlinx.coroutines.internal.w */
/* loaded from: classes3.dex */
public abstract class AbstractC5284w {

    /* renamed from: a */
    private static final C5280s f21505a = new C5280s("ZERO");

    /* renamed from: b */
    private static final InterfaceC5664p f21506b = a.f21510a;

    /* renamed from: c */
    private static final InterfaceC5664p f21507c = b.f21511a;

    /* renamed from: d */
    private static final InterfaceC5664p f21508d = d.f21513a;

    /* renamed from: e */
    private static final InterfaceC5664p f21509e = c.f21512a;

    /* renamed from: kotlinx.coroutines.internal.w$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final a f21510a = new a();

        a() {
            super(2);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2391h(Object obj, InterfaceC4184g.b bVar) {
            int i10;
            if (bVar instanceof InterfaceC7310q1) {
                if (!(obj instanceof Integer)) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 1;
                }
                if (i10 != 0) {
                    return Integer.valueOf(i10 + 1);
                }
                return bVar;
            }
            return obj;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.w$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final b f21511a = new b();

        b() {
            super(2);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7310q1 mo2391h(InterfaceC7310q1 interfaceC7310q1, InterfaceC4184g.b bVar) {
            if (interfaceC7310q1 != null) {
                return interfaceC7310q1;
            }
            if (!(bVar instanceof InterfaceC7310q1)) {
                bVar = null;
            }
            return (InterfaceC7310q1) bVar;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.w$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final c f21512a = new c();

        c() {
            super(2);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5287z mo2391h(C5287z c5287z, InterfaceC4184g.b bVar) {
            if (bVar instanceof InterfaceC7310q1) {
                ((InterfaceC7310q1) bVar).m28272c(c5287z.m21285b(), c5287z.m21287d());
            }
            return c5287z;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.w$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final d f21513a = new d();

        d() {
            super(2);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5287z mo2391h(C5287z c5287z, InterfaceC4184g.b bVar) {
            if (bVar instanceof InterfaceC7310q1) {
                c5287z.m21284a(((InterfaceC7310q1) bVar).m28273m(c5287z.m21285b()));
            }
            return c5287z;
        }
    }

    /* renamed from: a */
    public static final void m21260a(InterfaceC4184g interfaceC4184g, Object obj) {
        if (obj == f21505a) {
            return;
        }
        if (obj instanceof C5287z) {
            ((C5287z) obj).m21286c();
            interfaceC4184g.fold(obj, f21509e);
        } else {
            Object fold = interfaceC4184g.fold(null, f21507c);
            if (fold != null) {
                ((InterfaceC7310q1) fold).m28272c(interfaceC4184g, obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    /* renamed from: b */
    public static final Object m21261b(InterfaceC4184g interfaceC4184g) {
        Object fold = interfaceC4184g.fold(0, f21506b);
        AbstractC5868k.m23671c(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m21262c(InterfaceC4184g interfaceC4184g, Object obj) {
        if (obj == null) {
            obj = m21261b(interfaceC4184g);
        }
        if (obj == 0) {
            return f21505a;
        }
        if (obj instanceof Integer) {
            return interfaceC4184g.fold(new C5287z(interfaceC4184g, ((Number) obj).intValue()), f21508d);
        }
        if (obj != null) {
            return ((InterfaceC7310q1) obj).m28273m(interfaceC4184g);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }
}
