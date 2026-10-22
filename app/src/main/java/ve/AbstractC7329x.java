package ve;

import ee.AbstractC4178a;
import ee.AbstractC4179b;
import ee.InterfaceC4181d;
import ee.InterfaceC4182e;
import ee.InterfaceC4184g;
import kotlinx.coroutines.internal.C5265d;
import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5869l;

/* renamed from: ve.x */
/* loaded from: classes3.dex */
public abstract class AbstractC7329x extends AbstractC4178a implements InterfaceC4182e {

    /* renamed from: a */
    public static final a f27236a = new a(null);

    /* renamed from: ve.x$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC4179b {

        /* renamed from: ve.x$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C7865a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final C7865a f27237a = new C7865a();

            C7865a() {
                super(1);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC7329x mo542f(InterfaceC4184g.b bVar) {
                if (!(bVar instanceof AbstractC7329x)) {
                    bVar = null;
                }
                return (AbstractC7329x) bVar;
            }
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        private a() {
            super(InterfaceC4182e.f18296d0, C7865a.f27237a);
        }
    }

    public AbstractC7329x() {
        super(InterfaceC4182e.f18296d0);
    }

    @Override // ee.AbstractC4178a, ee.InterfaceC4184g.b, ee.InterfaceC4184g
    public InterfaceC4184g.b get(InterfaceC4184g.c cVar) {
        return InterfaceC4182e.a.m17490a(this, cVar);
    }

    @Override // ee.AbstractC4178a, ee.InterfaceC4184g
    public InterfaceC4184g minusKey(InterfaceC4184g.c cVar) {
        return InterfaceC4182e.a.m17491b(this, cVar);
    }

    @Override // ee.InterfaceC4182e
    /* renamed from: n */
    public final InterfaceC4181d mo17488n(InterfaceC4181d interfaceC4181d) {
        return new C5265d(this, interfaceC4181d);
    }

    @Override // ee.InterfaceC4182e
    /* renamed from: s */
    public void mo17489s(InterfaceC4181d interfaceC4181d) {
        if (interfaceC4181d != null) {
            C7284i m21182l = ((C5265d) interfaceC4181d).m21182l();
            if (m21182l != null) {
                m21182l.m28222r();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
    }

    public String toString() {
        return AbstractC7273e0.m28127a(this) + '@' + AbstractC7273e0.m28128b(this);
    }

    /* renamed from: x */
    public abstract void mo21239x(InterfaceC4184g interfaceC4184g, Runnable runnable);

    /* renamed from: y */
    public boolean mo21240y(InterfaceC4184g interfaceC4184g) {
        return true;
    }
}
