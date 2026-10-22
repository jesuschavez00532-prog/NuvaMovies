package ve;

import be.AbstractC1306b;
import be.AbstractC1321q;
import be.C1328x;
import ee.InterfaceC4184g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.AbstractC5270i;
import kotlinx.coroutines.internal.AbstractC5277p;
import kotlinx.coroutines.internal.C5271j;
import kotlinx.coroutines.internal.C5280s;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ve.InterfaceC7271d1;

/* renamed from: ve.h1 */
/* loaded from: classes3.dex */
public class C7283h1 implements InterfaceC7271d1, InterfaceC7302o, InterfaceC7304o1 {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f27168a = AtomicReferenceFieldUpdater.newUpdater(C7283h1.class, Object.class, "_state");
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ve.h1$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC7280g1 {

        /* renamed from: e */
        private final C7283h1 f27169e;

        /* renamed from: f */
        private final b f27170f;

        /* renamed from: g */
        private final C7299n f27171g;

        /* renamed from: h */
        private final Object f27172h;

        public a(C7283h1 c7283h1, b bVar, C7299n c7299n, Object obj) {
            super(c7299n.f27198e);
            this.f27169e = c7283h1;
            this.f27170f = bVar;
            this.f27171g = c7299n;
            this.f27172h = obj;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            mo28107u((Throwable) obj);
            return C1328x.f4998a;
        }

        @Override // ve.AbstractC7317t
        /* renamed from: u */
        public void mo28107u(Throwable th) {
            this.f27169e.m28140C(this.f27170f, this.f27171g, this.f27172h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ve.h1$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC7333y0 {
        private volatile Object _exceptionsHolder = null;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: a */
        private final C7295l1 f27173a;

        public b(C7295l1 c7295l1, boolean z10, Throwable th) {
            this.f27173a = c7295l1;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: c */
        private final ArrayList m28186c() {
            return new ArrayList(4);
        }

        /* renamed from: d */
        private final Object m28187d() {
            return this._exceptionsHolder;
        }

        /* renamed from: l */
        private final void m28188l(Object obj) {
            this._exceptionsHolder = obj;
        }

        @Override // ve.InterfaceC7333y0
        /* renamed from: a */
        public boolean mo28135a() {
            if (m28190f() == null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void m28189b(Throwable th) {
            Throwable m28190f = m28190f();
            if (m28190f == null) {
                m28196m(th);
                return;
            }
            if (th == m28190f) {
                return;
            }
            Object m28187d = m28187d();
            if (m28187d == null) {
                m28188l(th);
                return;
            }
            if (m28187d instanceof Throwable) {
                if (th == m28187d) {
                    return;
                }
                ArrayList m28186c = m28186c();
                m28186c.add(m28187d);
                m28186c.add(th);
                C1328x c1328x = C1328x.f4998a;
                m28188l(m28186c);
                return;
            }
            if (m28187d instanceof ArrayList) {
                ((ArrayList) m28187d).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + m28187d).toString());
        }

        @Override // ve.InterfaceC7333y0
        /* renamed from: e */
        public C7295l1 mo28136e() {
            return this.f27173a;
        }

        /* renamed from: f */
        public final Throwable m28190f() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: g */
        public final boolean m28191g() {
            if (m28190f() != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: h */
        public final boolean m28192h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean m28193i() {
            C5280s c5280s;
            Object m28187d = m28187d();
            c5280s = AbstractC7286i1.f27185e;
            if (m28187d == c5280s) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final List m28194j(Throwable th) {
            ArrayList arrayList;
            C5280s c5280s;
            Object m28187d = m28187d();
            if (m28187d == null) {
                arrayList = m28186c();
            } else if (m28187d instanceof Throwable) {
                ArrayList m28186c = m28186c();
                m28186c.add(m28187d);
                arrayList = m28186c;
            } else if (m28187d instanceof ArrayList) {
                arrayList = (ArrayList) m28187d;
            } else {
                throw new IllegalStateException(("State is " + m28187d).toString());
            }
            Throwable m28190f = m28190f();
            if (m28190f != null) {
                arrayList.add(0, m28190f);
            }
            if (th != null && (!AbstractC5868k.m23669a(th, m28190f))) {
                arrayList.add(th);
            }
            c5280s = AbstractC7286i1.f27185e;
            m28188l(c5280s);
            return arrayList;
        }

        /* renamed from: k */
        public final void m28195k(boolean z10) {
            this._isCompleting = z10 ? 1 : 0;
        }

        /* renamed from: m */
        public final void m28196m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + m28191g() + ", completing=" + m28192h() + ", rootCause=" + m28190f() + ", exceptions=" + m28187d() + ", list=" + mo28136e() + ']';
        }
    }

    /* renamed from: ve.h1$c */
    /* loaded from: classes3.dex */
    public static final class c extends C5271j.a {

        /* renamed from: d */
        final /* synthetic */ C5271j f27174d;

        /* renamed from: e */
        final /* synthetic */ C7283h1 f27175e;

        /* renamed from: f */
        final /* synthetic */ Object f27176f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C5271j c5271j, C5271j c5271j2, C7283h1 c7283h1, Object obj) {
            super(c5271j2);
            this.f27174d = c5271j;
            this.f27175e = c7283h1;
            this.f27176f = obj;
        }

        @Override // kotlinx.coroutines.internal.AbstractC5264c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object mo21177g(C5271j c5271j) {
            boolean z10;
            if (this.f27175e.m28172M() == this.f27176f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return null;
            }
            return AbstractC5270i.m21196a();
        }
    }

    public C7283h1(boolean z10) {
        this._state = z10 ? AbstractC7286i1.f27187g : AbstractC7286i1.f27186f;
        this._parentHandle = null;
    }

    /* renamed from: B */
    private final void m28139B(InterfaceC7333y0 interfaceC7333y0, Object obj) {
        InterfaceC7296m m28171L = m28171L();
        if (m28171L != null) {
            m28171L.dispose();
            m28180f0(C7298m1.f27197a);
        }
        Throwable th = null;
        if (!(obj instanceof C7311r)) {
            obj = null;
        }
        C7311r c7311r = (C7311r) obj;
        if (c7311r != null) {
            th = c7311r.f27215a;
        }
        if (interfaceC7333y0 instanceof AbstractC7280g1) {
            try {
                ((AbstractC7280g1) interfaceC7333y0).mo28107u(th);
                return;
            } catch (Throwable th2) {
                mo28094O(new C7320u("Exception in completion handler " + interfaceC7333y0 + " for " + this, th2));
                return;
            }
        }
        C7295l1 mo28136e = interfaceC7333y0.mo28136e();
        if (mo28136e != null) {
            m28151Y(mo28136e, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m28140C(b bVar, C7299n c7299n, Object obj) {
        C7299n m28149W = m28149W(c7299n);
        if (m28149W != null && m28165p0(bVar, m28149W, obj)) {
            return;
        }
        mo21245u(m28142E(bVar, obj));
    }

    /* renamed from: D */
    private final Throwable m28141D(Object obj) {
        boolean z10;
        if (obj != null) {
            z10 = obj instanceof Throwable;
        } else {
            z10 = true;
        }
        if (z10) {
            if (obj != null) {
                return (Throwable) obj;
            }
            return new C7274e1(mo28105z(), null, this);
        }
        if (obj != null) {
            return ((InterfaceC7304o1) obj).mo28183q();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* renamed from: E */
    private final Object m28142E(b bVar, Object obj) {
        Object obj2;
        Throwable th;
        boolean m28191g;
        Throwable m28145H;
        if (!(obj instanceof C7311r)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C7311r c7311r = (C7311r) obj2;
        if (c7311r != null) {
            th = c7311r.f27215a;
        } else {
            th = null;
        }
        synchronized (bVar) {
            m28191g = bVar.m28191g();
            List m28194j = bVar.m28194j(th);
            m28145H = m28145H(bVar, m28194j);
            if (m28145H != null) {
                m28164p(m28145H, m28194j);
            }
        }
        boolean z10 = false;
        if (m28145H != null && m28145H != th) {
            obj = new C7311r(m28145H, false, 2, null);
        }
        if (m28145H != null) {
            if (m28167y(m28145H) || mo28173N(m28145H)) {
                z10 = true;
            }
            if (z10) {
                if (obj != null) {
                    ((C7311r) obj).m28275b();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        if (!m28191g) {
            m28177Z(m28145H);
        }
        mo28097a0(obj);
        AbstractC1321q.m5977a(f27168a, this, bVar, AbstractC7286i1.m28236g(obj));
        m28139B(bVar, obj);
        return obj;
    }

    /* renamed from: F */
    private final C7299n m28143F(InterfaceC7333y0 interfaceC7333y0) {
        InterfaceC7333y0 interfaceC7333y02;
        if (!(interfaceC7333y0 instanceof C7299n)) {
            interfaceC7333y02 = null;
        } else {
            interfaceC7333y02 = interfaceC7333y0;
        }
        C7299n c7299n = (C7299n) interfaceC7333y02;
        if (c7299n != null) {
            return c7299n;
        }
        C7295l1 mo28136e = interfaceC7333y0.mo28136e();
        if (mo28136e == null) {
            return null;
        }
        return m28149W(mo28136e);
    }

    /* renamed from: G */
    private final Throwable m28144G(Object obj) {
        if (!(obj instanceof C7311r)) {
            obj = null;
        }
        C7311r c7311r = (C7311r) obj;
        if (c7311r == null) {
            return null;
        }
        return c7311r.f27215a;
    }

    /* renamed from: H */
    private final Throwable m28145H(b bVar, List list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (!bVar.m28191g()) {
                return null;
            }
            return new C7274e1(mo28105z(), null, this);
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        return (Throwable) list.get(0);
    }

    /* renamed from: K */
    private final C7295l1 m28146K(InterfaceC7333y0 interfaceC7333y0) {
        C7295l1 mo28136e = interfaceC7333y0.mo28136e();
        if (mo28136e == null) {
            if (interfaceC7333y0 instanceof C7306p0) {
                return new C7295l1();
            }
            if (interfaceC7333y0 instanceof AbstractC7280g1) {
                m28153d0((AbstractC7280g1) interfaceC7333y0);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC7333y0).toString());
        }
        return mo28136e;
    }

    /* renamed from: S */
    private final Object m28147S(Object obj) {
        C5280s c5280s;
        C5280s c5280s2;
        C5280s c5280s3;
        C5280s c5280s4;
        C5280s c5280s5;
        C5280s c5280s6;
        Throwable th = null;
        Throwable th2 = null;
        while (true) {
            Object m28172M = m28172M();
            if (m28172M instanceof b) {
                synchronized (m28172M) {
                    if (((b) m28172M).m28193i()) {
                        c5280s2 = AbstractC7286i1.f27184d;
                        return c5280s2;
                    }
                    boolean m28191g = ((b) m28172M).m28191g();
                    if (obj != null || !m28191g) {
                        if (th2 == null) {
                            th2 = m28141D(obj);
                        }
                        ((b) m28172M).m28189b(th2);
                    }
                    Throwable m28190f = ((b) m28172M).m28190f();
                    if (!m28191g) {
                        th = m28190f;
                    }
                    if (th != null) {
                        m28150X(((b) m28172M).mo28136e(), th);
                    }
                    c5280s = AbstractC7286i1.f27181a;
                    return c5280s;
                }
            }
            if (!(m28172M instanceof InterfaceC7333y0)) {
                c5280s3 = AbstractC7286i1.f27184d;
                return c5280s3;
            }
            if (th2 == null) {
                th2 = m28141D(obj);
            }
            InterfaceC7333y0 interfaceC7333y0 = (InterfaceC7333y0) m28172M;
            if (interfaceC7333y0.mo28135a()) {
                if (m28160m0(interfaceC7333y0, th2)) {
                    c5280s4 = AbstractC7286i1.f27181a;
                    return c5280s4;
                }
            } else {
                Object m28161n0 = m28161n0(m28172M, new C7311r(th2, false, 2, null));
                c5280s5 = AbstractC7286i1.f27181a;
                if (m28161n0 != c5280s5) {
                    c5280s6 = AbstractC7286i1.f27183c;
                    if (m28161n0 != c5280s6) {
                        return m28161n0;
                    }
                } else {
                    throw new IllegalStateException(("Cannot happen in " + m28172M).toString());
                }
            }
        }
    }

    /* renamed from: U */
    private final AbstractC7280g1 m28148U(InterfaceC5660l interfaceC5660l, boolean z10) {
        InterfaceC5660l interfaceC5660l2 = null;
        if (z10) {
            if (interfaceC5660l instanceof AbstractC7277f1) {
                interfaceC5660l2 = interfaceC5660l;
            }
            AbstractC7277f1 abstractC7277f1 = (AbstractC7277f1) interfaceC5660l2;
            if (abstractC7277f1 == null) {
                return new C7265b1(this, interfaceC5660l);
            }
            return abstractC7277f1;
        }
        if (interfaceC5660l instanceof AbstractC7280g1) {
            interfaceC5660l2 = interfaceC5660l;
        }
        AbstractC7280g1 abstractC7280g1 = (AbstractC7280g1) interfaceC5660l2;
        if (abstractC7280g1 == null) {
            return new C7268c1(this, interfaceC5660l);
        }
        return abstractC7280g1;
    }

    /* renamed from: W */
    private final C7299n m28149W(C5271j c5271j) {
        while (c5271j.mo21195p()) {
            c5271j = c5271j.m21206o();
        }
        while (true) {
            c5271j = c5271j.m21205n();
            if (!c5271j.mo21195p()) {
                if (c5271j instanceof C7299n) {
                    return (C7299n) c5271j;
                }
                if (c5271j instanceof C7295l1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: X */
    private final void m28150X(C7295l1 c7295l1, Throwable th) {
        m28177Z(th);
        Object m21204m = c7295l1.m21204m();
        if (m21204m != null) {
            C7320u c7320u = null;
            for (C5271j c5271j = (C5271j) m21204m; !AbstractC5868k.m23669a(c5271j, c7295l1); c5271j = c5271j.m21205n()) {
                if (c5271j instanceof AbstractC7277f1) {
                    AbstractC7280g1 abstractC7280g1 = (AbstractC7280g1) c5271j;
                    try {
                        abstractC7280g1.mo28107u(th);
                    } catch (Throwable th2) {
                        if (c7320u != null) {
                            AbstractC1306b.m5958a(c7320u, th2);
                        } else {
                            c7320u = new C7320u("Exception in completion handler " + abstractC7280g1 + " for " + this, th2);
                            C1328x c1328x = C1328x.f4998a;
                        }
                    }
                }
            }
            if (c7320u != null) {
                mo28094O(c7320u);
            }
            m28167y(th);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: Y */
    private final void m28151Y(C7295l1 c7295l1, Throwable th) {
        Object m21204m = c7295l1.m21204m();
        if (m21204m != null) {
            C7320u c7320u = null;
            for (C5271j c5271j = (C5271j) m21204m; !AbstractC5868k.m23669a(c5271j, c7295l1); c5271j = c5271j.m21205n()) {
                if (c5271j instanceof AbstractC7280g1) {
                    AbstractC7280g1 abstractC7280g1 = (AbstractC7280g1) c5271j;
                    try {
                        abstractC7280g1.mo28107u(th);
                    } catch (Throwable th2) {
                        if (c7320u != null) {
                            AbstractC1306b.m5958a(c7320u, th2);
                        } else {
                            c7320u = new C7320u("Exception in completion handler " + abstractC7280g1 + " for " + this, th2);
                            C1328x c1328x = C1328x.f4998a;
                        }
                    }
                }
            }
            if (c7320u != null) {
                mo28094O(c7320u);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ve.x0] */
    /* renamed from: c0 */
    private final void m28152c0(C7306p0 c7306p0) {
        C7295l1 c7295l1 = new C7295l1();
        if (!c7306p0.mo28135a()) {
            c7295l1 = new C7330x0(c7295l1);
        }
        AbstractC1321q.m5977a(f27168a, this, c7306p0, c7295l1);
    }

    /* renamed from: d0 */
    private final void m28153d0(AbstractC7280g1 abstractC7280g1) {
        abstractC7280g1.m21203i(new C7295l1());
        AbstractC1321q.m5977a(f27168a, this, abstractC7280g1, abstractC7280g1.m21205n());
    }

    /* renamed from: g0 */
    private final int m28154g0(Object obj) {
        C7306p0 c7306p0;
        if (obj instanceof C7306p0) {
            if (((C7306p0) obj).mo28135a()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f27168a;
            c7306p0 = AbstractC7286i1.f27187g;
            if (!AbstractC1321q.m5977a(atomicReferenceFieldUpdater, this, obj, c7306p0)) {
                return -1;
            }
            mo28098b0();
            return 1;
        }
        if (!(obj instanceof C7330x0)) {
            return 0;
        }
        if (!AbstractC1321q.m5977a(f27168a, this, obj, ((C7330x0) obj).mo28136e())) {
            return -1;
        }
        mo28098b0();
        return 1;
    }

    /* renamed from: h0 */
    private final String m28155h0(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.m28191g()) {
                return "Cancelling";
            }
            if (!bVar.m28192h()) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof InterfaceC7333y0) {
            if (((InterfaceC7333y0) obj).mo28135a()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof C7311r) {
            return "Cancelled";
        }
        return "Completed";
    }

    /* renamed from: j0 */
    public static /* synthetic */ CancellationException m28156j0(C7283h1 c7283h1, Throwable th, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return c7283h1.m28181i0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: l0 */
    private final boolean m28159l0(InterfaceC7333y0 interfaceC7333y0, Object obj) {
        if (!AbstractC1321q.m5977a(f27168a, this, interfaceC7333y0, AbstractC7286i1.m28236g(obj))) {
            return false;
        }
        m28177Z(null);
        mo28097a0(obj);
        m28139B(interfaceC7333y0, obj);
        return true;
    }

    /* renamed from: m0 */
    private final boolean m28160m0(InterfaceC7333y0 interfaceC7333y0, Throwable th) {
        C7295l1 m28146K = m28146K(interfaceC7333y0);
        if (m28146K == null) {
            return false;
        }
        if (!AbstractC1321q.m5977a(f27168a, this, interfaceC7333y0, new b(m28146K, false, th))) {
            return false;
        }
        m28150X(m28146K, th);
        return true;
    }

    /* renamed from: n0 */
    private final Object m28161n0(Object obj, Object obj2) {
        C5280s c5280s;
        C5280s c5280s2;
        if (!(obj instanceof InterfaceC7333y0)) {
            c5280s2 = AbstractC7286i1.f27181a;
            return c5280s2;
        }
        if (((obj instanceof C7306p0) || (obj instanceof AbstractC7280g1)) && !(obj instanceof C7299n) && !(obj2 instanceof C7311r)) {
            if (!m28159l0((InterfaceC7333y0) obj, obj2)) {
                c5280s = AbstractC7286i1.f27183c;
                return c5280s;
            }
            return obj2;
        }
        return m28163o0((InterfaceC7333y0) obj, obj2);
    }

    /* renamed from: o */
    private final boolean m28162o(Object obj, C7295l1 c7295l1, AbstractC7280g1 abstractC7280g1) {
        int m21209t;
        c cVar = new c(abstractC7280g1, abstractC7280g1, this, obj);
        do {
            m21209t = c7295l1.m21206o().m21209t(abstractC7280g1, c7295l1, cVar);
            if (m21209t == 1) {
                return true;
            }
        } while (m21209t != 2);
        return false;
    }

    /* renamed from: o0 */
    private final Object m28163o0(InterfaceC7333y0 interfaceC7333y0, Object obj) {
        C5280s c5280s;
        InterfaceC7333y0 interfaceC7333y02;
        Object obj2;
        C5280s c5280s2;
        C5280s c5280s3;
        C7295l1 m28146K = m28146K(interfaceC7333y0);
        if (m28146K == null) {
            c5280s = AbstractC7286i1.f27183c;
            return c5280s;
        }
        Throwable th = null;
        if (!(interfaceC7333y0 instanceof b)) {
            interfaceC7333y02 = null;
        } else {
            interfaceC7333y02 = interfaceC7333y0;
        }
        b bVar = (b) interfaceC7333y02;
        if (bVar == null) {
            bVar = new b(m28146K, false, null);
        }
        synchronized (bVar) {
            if (bVar.m28192h()) {
                c5280s3 = AbstractC7286i1.f27181a;
                return c5280s3;
            }
            bVar.m28195k(true);
            if (bVar != interfaceC7333y0 && !AbstractC1321q.m5977a(f27168a, this, interfaceC7333y0, bVar)) {
                c5280s2 = AbstractC7286i1.f27183c;
                return c5280s2;
            }
            boolean m28191g = bVar.m28191g();
            if (!(obj instanceof C7311r)) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            C7311r c7311r = (C7311r) obj2;
            if (c7311r != null) {
                bVar.m28189b(c7311r.f27215a);
            }
            Throwable m28190f = bVar.m28190f();
            if (true ^ m28191g) {
                th = m28190f;
            }
            C1328x c1328x = C1328x.f4998a;
            if (th != null) {
                m28150X(m28146K, th);
            }
            C7299n m28143F = m28143F(interfaceC7333y0);
            if (m28143F != null && m28165p0(bVar, m28143F, obj)) {
                return AbstractC7286i1.f27182b;
            }
            return m28142E(bVar, obj);
        }
    }

    /* renamed from: p */
    private final void m28164p(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                AbstractC1306b.m5958a(th, th2);
            }
        }
    }

    /* renamed from: p0 */
    private final boolean m28165p0(b bVar, C7299n c7299n, Object obj) {
        while (InterfaceC7271d1.a.m28121d(c7299n.f27198e, false, false, new a(this, bVar, c7299n, obj), 1, null) == C7298m1.f27197a) {
            c7299n = m28149W(c7299n);
            if (c7299n == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    private final Object m28166x(Object obj) {
        C5280s c5280s;
        Object m28161n0;
        C5280s c5280s2;
        do {
            Object m28172M = m28172M();
            if (!(m28172M instanceof InterfaceC7333y0) || ((m28172M instanceof b) && ((b) m28172M).m28192h())) {
                c5280s = AbstractC7286i1.f27181a;
                return c5280s;
            }
            m28161n0 = m28161n0(m28172M, new C7311r(m28141D(obj), false, 2, null));
            c5280s2 = AbstractC7286i1.f27183c;
        } while (m28161n0 == c5280s2);
        return m28161n0;
    }

    /* renamed from: y */
    private final boolean m28167y(Throwable th) {
        if (mo21243R()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        InterfaceC7296m m28171L = m28171L();
        if (m28171L != null && m28171L != C7298m1.f27197a) {
            if (m28171L.mo28250d(th) || z10) {
                return true;
            }
            return false;
        }
        return z10;
    }

    /* renamed from: A */
    public boolean m28168A(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (m28184v(th) && m28169I()) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public boolean m28169I() {
        return true;
    }

    /* renamed from: J */
    public boolean m28170J() {
        return false;
    }

    /* renamed from: L */
    public final InterfaceC7296m m28171L() {
        return (InterfaceC7296m) this._parentHandle;
    }

    /* renamed from: M */
    public final Object m28172M() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC5277p)) {
                return obj;
            }
            ((AbstractC5277p) obj).mo21173c(this);
        }
    }

    /* renamed from: N */
    protected boolean mo28173N(Throwable th) {
        return false;
    }

    /* renamed from: O */
    public void mo28094O(Throwable th) {
        throw th;
    }

    /* renamed from: P */
    public final void m28174P(InterfaceC7271d1 interfaceC7271d1) {
        if (interfaceC7271d1 == null) {
            m28180f0(C7298m1.f27197a);
            return;
        }
        interfaceC7271d1.start();
        InterfaceC7296m mo28114f = interfaceC7271d1.mo28114f(this);
        m28180f0(mo28114f);
        if (m28175Q()) {
            mo28114f.dispose();
            m28180f0(C7298m1.f27197a);
        }
    }

    /* renamed from: Q */
    public final boolean m28175Q() {
        return !(m28172M() instanceof InterfaceC7333y0);
    }

    /* renamed from: R */
    protected boolean mo21243R() {
        return false;
    }

    /* renamed from: T */
    public final Object m28176T(Object obj) {
        Object m28161n0;
        C5280s c5280s;
        C5280s c5280s2;
        do {
            m28161n0 = m28161n0(m28172M(), obj);
            c5280s = AbstractC7286i1.f27181a;
            if (m28161n0 != c5280s) {
                c5280s2 = AbstractC7286i1.f27183c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m28144G(obj));
            }
        } while (m28161n0 == c5280s2);
        return m28161n0;
    }

    /* renamed from: V */
    public String mo28095V() {
        return AbstractC7273e0.m28127a(this);
    }

    /* renamed from: Z */
    protected void m28177Z(Throwable th) {
    }

    @Override // ve.InterfaceC7271d1
    /* renamed from: a */
    public boolean mo28096a() {
        Object m28172M = m28172M();
        if ((m28172M instanceof InterfaceC7333y0) && ((InterfaceC7333y0) m28172M).mo28135a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    protected void mo28097a0(Object obj) {
    }

    @Override // ve.InterfaceC7302o
    /* renamed from: b */
    public final void mo28178b(InterfaceC7304o1 interfaceC7304o1) {
        m28184v(interfaceC7304o1);
    }

    /* renamed from: b0 */
    public void mo28098b0() {
    }

    /* renamed from: e0 */
    public final void m28179e0(AbstractC7280g1 abstractC7280g1) {
        Object m28172M;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C7306p0 c7306p0;
        do {
            m28172M = m28172M();
            if (m28172M instanceof AbstractC7280g1) {
                if (m28172M != abstractC7280g1) {
                    return;
                }
                atomicReferenceFieldUpdater = f27168a;
                c7306p0 = AbstractC7286i1.f27187g;
            } else {
                if ((m28172M instanceof InterfaceC7333y0) && ((InterfaceC7333y0) m28172M).mo28136e() != null) {
                    abstractC7280g1.m21207q();
                    return;
                }
                return;
            }
        } while (!AbstractC1321q.m5977a(atomicReferenceFieldUpdater, this, m28172M, c7306p0));
    }

    @Override // ve.InterfaceC7271d1
    /* renamed from: f */
    public final InterfaceC7296m mo28114f(InterfaceC7302o interfaceC7302o) {
        InterfaceC7300n0 m28121d = InterfaceC7271d1.a.m28121d(this, true, false, new C7299n(this, interfaceC7302o), 2, null);
        if (m28121d != null) {
            return (InterfaceC7296m) m28121d;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    /* renamed from: f0 */
    public final void m28180f0(InterfaceC7296m interfaceC7296m) {
        this._parentHandle = interfaceC7296m;
    }

    @Override // ee.InterfaceC4184g
    public Object fold(Object obj, InterfaceC5664p interfaceC5664p) {
        return InterfaceC7271d1.a.m28119b(this, obj, interfaceC5664p);
    }

    @Override // ee.InterfaceC4184g.b, ee.InterfaceC4184g
    public InterfaceC4184g.b get(InterfaceC4184g.c cVar) {
        return InterfaceC7271d1.a.m28120c(this, cVar);
    }

    @Override // ee.InterfaceC4184g.b
    public final InterfaceC4184g.c getKey() {
        return InterfaceC7271d1.f27161f0;
    }

    @Override // ve.InterfaceC7271d1
    /* renamed from: h */
    public final CancellationException mo28115h() {
        Object m28172M = m28172M();
        if (m28172M instanceof b) {
            Throwable m28190f = ((b) m28172M).m28190f();
            if (m28190f != null) {
                CancellationException m28181i0 = m28181i0(m28190f, AbstractC7273e0.m28127a(this) + " is cancelling");
                if (m28181i0 != null) {
                    return m28181i0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(m28172M instanceof InterfaceC7333y0)) {
            if (m28172M instanceof C7311r) {
                return m28156j0(this, ((C7311r) m28172M).f27215a, null, 1, null);
            }
            return new C7274e1(AbstractC7273e0.m28127a(this) + " has completed normally", null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* renamed from: i0 */
    protected final CancellationException m28181i0(Throwable th, String str) {
        Throwable th2;
        if (!(th instanceof CancellationException)) {
            th2 = null;
        } else {
            th2 = th;
        }
        CancellationException cancellationException = (CancellationException) th2;
        if (cancellationException == null) {
            if (str == null) {
                str = mo28105z();
            }
            cancellationException = new C7274e1(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: k0 */
    public final String m28182k0() {
        return mo28095V() + '{' + m28155h0(m28172M()) + '}';
    }

    @Override // ee.InterfaceC4184g
    public InterfaceC4184g minusKey(InterfaceC4184g.c cVar) {
        return InterfaceC7271d1.a.m28122e(this, cVar);
    }

    @Override // ee.InterfaceC4184g
    public InterfaceC4184g plus(InterfaceC4184g interfaceC4184g) {
        return InterfaceC7271d1.a.m28123f(this, interfaceC4184g);
    }

    @Override // ve.InterfaceC7304o1
    /* renamed from: q */
    public CancellationException mo28183q() {
        Throwable th;
        Object m28172M = m28172M();
        Throwable th2 = null;
        if (m28172M instanceof b) {
            th = ((b) m28172M).m28190f();
        } else if (m28172M instanceof C7311r) {
            th = ((C7311r) m28172M).f27215a;
        } else if (!(m28172M instanceof InterfaceC7333y0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + m28172M).toString());
        }
        if (th instanceof CancellationException) {
            th2 = th;
        }
        CancellationException cancellationException = (CancellationException) th2;
        if (cancellationException == null) {
            return new C7274e1("Parent job is " + m28155h0(m28172M), th, this);
        }
        return cancellationException;
    }

    @Override // ve.InterfaceC7271d1
    /* renamed from: r */
    public final InterfaceC7300n0 mo28116r(boolean z10, boolean z11, InterfaceC5660l interfaceC5660l) {
        Throwable th;
        Throwable th2 = null;
        AbstractC7280g1 abstractC7280g1 = null;
        while (true) {
            Object m28172M = m28172M();
            if (m28172M instanceof C7306p0) {
                C7306p0 c7306p0 = (C7306p0) m28172M;
                if (c7306p0.mo28135a()) {
                    if (abstractC7280g1 == null) {
                        abstractC7280g1 = m28148U(interfaceC5660l, z10);
                    }
                    if (AbstractC1321q.m5977a(f27168a, this, m28172M, abstractC7280g1)) {
                        return abstractC7280g1;
                    }
                } else {
                    m28152c0(c7306p0);
                }
            } else if (m28172M instanceof InterfaceC7333y0) {
                C7295l1 mo28136e = ((InterfaceC7333y0) m28172M).mo28136e();
                if (mo28136e == null) {
                    if (m28172M != null) {
                        m28153d0((AbstractC7280g1) m28172M);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                    }
                } else {
                    InterfaceC7300n0 interfaceC7300n0 = C7298m1.f27197a;
                    if (z10 && (m28172M instanceof b)) {
                        synchronized (m28172M) {
                            th = ((b) m28172M).m28190f();
                            if (th == null || ((interfaceC5660l instanceof C7299n) && !((b) m28172M).m28192h())) {
                                if (abstractC7280g1 == null) {
                                    abstractC7280g1 = m28148U(interfaceC5660l, z10);
                                }
                                if (m28162o(m28172M, mo28136e, abstractC7280g1)) {
                                    if (th == null) {
                                        return abstractC7280g1;
                                    }
                                    interfaceC7300n0 = abstractC7280g1;
                                }
                            }
                            C1328x c1328x = C1328x.f4998a;
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z11) {
                            interfaceC5660l.mo542f(th);
                        }
                        return interfaceC7300n0;
                    }
                    if (abstractC7280g1 == null) {
                        abstractC7280g1 = m28148U(interfaceC5660l, z10);
                    }
                    if (m28162o(m28172M, mo28136e, abstractC7280g1)) {
                        return abstractC7280g1;
                    }
                }
            } else {
                if (z11) {
                    if (!(m28172M instanceof C7311r)) {
                        m28172M = null;
                    }
                    C7311r c7311r = (C7311r) m28172M;
                    if (c7311r != null) {
                        th2 = c7311r.f27215a;
                    }
                    interfaceC5660l.mo542f(th2);
                }
                return C7298m1.f27197a;
            }
        }
    }

    @Override // ve.InterfaceC7271d1
    public final boolean start() {
        int m28154g0;
        do {
            m28154g0 = m28154g0(m28172M());
            if (m28154g0 == 0) {
                return false;
            }
        } while (m28154g0 != 1);
        return true;
    }

    @Override // ve.InterfaceC7271d1
    /* renamed from: t */
    public void mo28117t(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C7274e1(mo28105z(), null, this);
        }
        m28185w(cancellationException);
    }

    public String toString() {
        return m28182k0() + '@' + AbstractC7273e0.m28128b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public void mo21245u(Object obj) {
    }

    /* renamed from: v */
    public final boolean m28184v(Object obj) {
        Object obj2;
        C5280s c5280s;
        C5280s c5280s2;
        C5280s c5280s3;
        obj2 = AbstractC7286i1.f27181a;
        if (!m28170J() || (obj2 = m28166x(obj)) != AbstractC7286i1.f27182b) {
            c5280s = AbstractC7286i1.f27181a;
            if (obj2 == c5280s) {
                obj2 = m28147S(obj);
            }
            c5280s2 = AbstractC7286i1.f27181a;
            if (obj2 != c5280s2 && obj2 != AbstractC7286i1.f27182b) {
                c5280s3 = AbstractC7286i1.f27184d;
                if (obj2 == c5280s3) {
                    return false;
                }
                mo21245u(obj2);
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: w */
    public void m28185w(Throwable th) {
        m28184v(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public String mo28105z() {
        return "Job was cancelled";
    }
}
