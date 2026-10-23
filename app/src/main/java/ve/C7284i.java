package ve;

import be.AbstractC1321q;
import be.C1308d;
import ee.InterfaceC4181d;
import ee.InterfaceC4184g;
import ge.InterfaceC4438e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.C5265d;
import me.InterfaceC5660l;
import p136fe.AbstractC4313d;
import ve.InterfaceC7271d1;

/* renamed from: ve.i */
/* loaded from: classes3.dex */
public class C7284i extends AbstractC7291k0 implements InterfaceC7281h, InterfaceC4438e {

    /* renamed from: f */
    private static final AtomicIntegerFieldUpdater f27177f = AtomicIntegerFieldUpdater.newUpdater(C7284i.class, "_decision");

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater f27178g = AtomicReferenceFieldUpdater.newUpdater(C7284i.class, Object.class, "_state");
    private volatile int _decision;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: d */
    private final InterfaceC4184g f27179d;

    /* renamed from: e */
    private final InterfaceC4181d f27180e;

    public C7284i(InterfaceC4181d interfaceC4181d, int i10) {
        super(i10);
        this.f27180e = interfaceC4181d;
        this.f27179d = interfaceC4181d.mo17487e();
        this._decision = 0;
        this._state = C7263b.f27149a;
        this._parentHandle = null;
    }

    /* renamed from: A */
    private final boolean m28198A() {
        InterfaceC4181d interfaceC4181d = this.f27180e;
        if ((interfaceC4181d instanceof C5265d) && ((C5265d) interfaceC4181d).m21183m(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    private final AbstractC7275f m28199B(InterfaceC5660l interfaceC5660l) {
        if (interfaceC5660l instanceof AbstractC7275f) {
            return (AbstractC7275f) interfaceC5660l;
        }
        return new C7262a1(interfaceC5660l);
    }

    /* renamed from: C */
    private final void m28200C(InterfaceC5660l interfaceC5660l, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC5660l + ", already has " + obj).toString());
    }

    /* renamed from: F */
    private final void m28201F(Object obj, int i10, InterfaceC5660l interfaceC5660l) {
        Object obj2 = null;
        do {
            obj2 = this._state;
            if (obj2 instanceof InterfaceC7301n1) {
            } else {
                if (obj2 instanceof C7290k) {
                    C7290k c7290k = (C7290k) obj2;
                    if (c7290k.m28242c()) {
                        if (interfaceC5660l != null) {
                            m28220n(interfaceC5660l, c7290k.f27215a);
                            return;
                        }
                        return;
                    }
                }
                m28208k(obj);
                throw new C1308d();
            }
        } while (!AbstractC1321q.m5977a(f27178g, this, obj2, m28203H((InterfaceC7301n1) obj2, obj, i10, interfaceC5660l, null)));
        m28212s();
        m28213t(i10);
    }

    /* renamed from: G */
    static /* synthetic */ void m28202G(C7284i c7284i, Object obj, int i10, InterfaceC5660l interfaceC5660l, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                interfaceC5660l = null;
            }
            c7284i.m28201F(obj, i10, interfaceC5660l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: H */
    private final Object m28203H(InterfaceC7301n1 interfaceC7301n1, Object obj, int i10, InterfaceC5660l interfaceC5660l, Object obj2) {
        if (!(obj instanceof C7311r)) {
            if (AbstractC7294l0.m28246b(i10) || obj2 != null) {
                if (interfaceC5660l != null || (interfaceC7301n1 instanceof AbstractC7275f) || obj2 != null) {
                    if (!(interfaceC7301n1 instanceof AbstractC7275f)) {
                        interfaceC7301n1 = null;
                    }
                    return new C7308q(obj, (AbstractC7275f) interfaceC7301n1, interfaceC5660l, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    /* renamed from: I */
    private final void m28204I(InterfaceC7300n0 interfaceC7300n0) {
        this._parentHandle = interfaceC7300n0;
    }

    /* renamed from: J */
    private final void m28205J() {
        InterfaceC7271d1 interfaceC7271d1;
        if (!m28211q() && m28214v() == null && (interfaceC7271d1 = (InterfaceC7271d1) this.f27180e.mo17487e().get(InterfaceC7271d1.f27161f0)) != null) {
            InterfaceC7300n0 m28121d = InterfaceC7271d1.a.m28121d(interfaceC7271d1, true, false, new C7293l(interfaceC7271d1, this), 2, null);
            m28204I(m28121d);
            if (m28227z() && !m28198A()) {
                m28121d.dispose();
                m28204I(C7298m1.f27197a);
            }
        }
    }

    /* renamed from: K */
    private final boolean m28206K() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f27177f.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: L */
    private final boolean m28207L() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f27177f.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: k */
    private final Void m28208k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: l */
    private final void m28209l(InterfaceC5660l interfaceC5660l, Throwable th) {
        try {
            interfaceC5660l.mo542f(th);
        } catch (Throwable th2) {
            AbstractC7334z.m28314a(mo17487e(), new C7320u("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: p */
    private final boolean m28210p(Throwable th) {
        if (!AbstractC7294l0.m28247c(this.f27191c)) {
            return false;
        }
        InterfaceC4181d interfaceC4181d = this.f27180e;
        if (!(interfaceC4181d instanceof C5265d)) {
            interfaceC4181d = null;
        }
        C5265d c5265d = (C5265d) interfaceC4181d;
        if (c5265d == null) {
            return false;
        }
        return c5265d.m21184n(th);
    }

    /* renamed from: q */
    private final boolean m28211q() {
        Throwable m21181k = null;
        boolean m28227z = m28227z();
        if (!AbstractC7294l0.m28247c(this.f27191c)) {
            return m28227z;
        }
        InterfaceC4181d interfaceC4181d = this.f27180e;
        if (!(interfaceC4181d instanceof C5265d)) {
            interfaceC4181d = null;
        }
        C5265d c5265d = (C5265d) interfaceC4181d;
        if (c5265d != null && (m21181k = c5265d.m21181k(this)) != null) {
            if (!m28227z) {
                m28221o(m21181k);
            }
            return true;
        }
        return m28227z;
    }

    /* renamed from: s */
    private final void m28212s() {
        if (!m28198A()) {
            m28222r();
        }
    }

    /* renamed from: t */
    private final void m28213t(int i10) {
        if (m28206K()) {
            return;
        }
        AbstractC7294l0.m28245a(this, i10);
    }

    /* renamed from: v */
    private final InterfaceC7300n0 m28214v() {
        return (InterfaceC7300n0) this._parentHandle;
    }

    /* renamed from: D */
    protected String m28215D() {
        return "CancellableContinuation";
    }

    /* renamed from: E */
    public final void m28216E(Throwable th) {
        if (m28210p(th)) {
            return;
        }
        m28221o(th);
        m28212s();
    }

    @Override // ve.AbstractC7291k0
    /* renamed from: a */
    public void mo21178a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof InterfaceC7301n1)) {
                if (obj2 instanceof C7311r) {
                    return;
                }
                if (obj2 instanceof C7308q) {
                    C7308q c7308q = (C7308q) obj2;
                    if (!c7308q.m28261c()) {
                        if (AbstractC1321q.m5977a(f27178g, this, obj2, C7308q.m28259b(c7308q, null, null, null, null, th, 15, null))) {
                            c7308q.m28262d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (AbstractC1321q.m5977a(f27178g, this, obj2, new C7308q(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // ve.AbstractC7291k0
    /* renamed from: b */
    public final InterfaceC4181d mo21179b() {
        return this.f27180e;
    }

    @Override // ve.AbstractC7291k0
    /* renamed from: c */
    public Throwable mo28217c(Object obj) {
        Throwable mo28217c = super.mo28217c(obj);
        if (mo28217c == null) {
            return null;
        }
        return mo28217c;
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: d */
    public void mo17486d(Object obj) {
        m28202G(this, AbstractC7323v.m28305c(obj, this), this.f27191c, null, 4, null);
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: e */
    public InterfaceC4184g mo17487e() {
        return this.f27179d;
    }

    @Override // ve.AbstractC7291k0
    /* renamed from: f */
    public Object mo28218f(Object obj) {
        if (obj instanceof C7308q) {
            return ((C7308q) obj).f27206a;
        }
        return obj;
    }

    @Override // ve.InterfaceC7281h
    /* renamed from: g */
    public void mo28137g(AbstractC7329x abstractC7329x, Object obj) {
        int i10 = 0;
        InterfaceC4181d interfaceC4181d = this.f27180e;
        AbstractC7329x abstractC7329x2 = null;
        if (!(interfaceC4181d instanceof C5265d)) {
            interfaceC4181d = null;
        }
        C5265d c5265d = (C5265d) interfaceC4181d;
        if (c5265d != null) {
            abstractC7329x2 = c5265d.f21472g;
        }
        if (abstractC7329x2 == abstractC7329x) {
            i10 = 4;
        } else {
            i10 = this.f27191c;
        }
        m28202G(this, obj, i10, null, 4, null);
    }

    @Override // ve.AbstractC7291k0
    /* renamed from: i */
    public Object mo21180i() {
        return m28225x();
    }

    @Override // ve.InterfaceC7281h
    /* renamed from: j */
    public void mo28138j(InterfaceC5660l interfaceC5660l) {
        AbstractC7275f m28199B = m28199B(interfaceC5660l);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C7263b) {
                if (AbstractC1321q.m5977a(f27178g, this, obj, m28199B)) {
                    return;
                }
            } else if (obj instanceof AbstractC7275f) {
                m28200C(interfaceC5660l, obj);
            } else {
                boolean z10 = obj instanceof C7311r;
                if (z10) {
                    if (!((C7311r) obj).m28275b()) {
                        m28200C(interfaceC5660l, obj);
                    }
                    if (obj instanceof C7290k) {
                        Throwable th = null;
                        if (!z10) {
                            obj = null;
                        }
                        C7311r c7311r = (C7311r) obj;
                        if (c7311r != null) {
                            th = c7311r.f27215a;
                        }
                        m28209l(interfaceC5660l, th);
                        return;
                    }
                    return;
                }
                if (obj instanceof C7308q) {
                    C7308q c7308q = (C7308q) obj;
                    if (c7308q.f27207b != null) {
                        m28200C(interfaceC5660l, obj);
                    }
                    if (c7308q.m28261c()) {
                        m28209l(interfaceC5660l, c7308q.f27210e);
                        return;
                    } else {
                        if (AbstractC1321q.m5977a(f27178g, this, obj, C7308q.m28259b(c7308q, null, m28199B, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (AbstractC1321q.m5977a(f27178g, this, obj, new C7308q(obj, m28199B, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void m28219m(AbstractC7275f abstractC7275f, Throwable th) {
        try {
            abstractC7275f.mo28106a(th);
        } catch (Throwable th2) {
            AbstractC7334z.m28314a(mo17487e(), new C7320u("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: n */
    public final void m28220n(InterfaceC5660l interfaceC5660l, Throwable th) {
        try {
            interfaceC5660l.mo542f(th);
        } catch (Throwable th2) {
            AbstractC7334z.m28314a(mo17487e(), new C7320u("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: o */
    public boolean m28221o(Throwable th) {
        Object obj = null;
        boolean z10 = false;
        do {
            obj = this._state;
            if (!(obj instanceof InterfaceC7301n1)) {
                return false;
            }
            z10 = obj instanceof AbstractC7275f;
        } while (!AbstractC1321q.m5977a(f27178g, this, obj, new C7290k(this, th, z10)));
        if (!z10) {
            obj = null;
        }
        AbstractC7275f abstractC7275f = (AbstractC7275f) obj;
        if (abstractC7275f != null) {
            m28219m(abstractC7275f, th);
        }
        m28212s();
        m28213t(this.f27191c);
        return true;
    }

    /* renamed from: r */
    public final void m28222r() {
        InterfaceC7300n0 m28214v = m28214v();
        if (m28214v != null) {
            m28214v.dispose();
        }
        m28204I(C7298m1.f27197a);
    }

    public String toString() {
        return m28215D() + '(' + AbstractC7273e0.m28129c(this.f27180e) + "){" + m28225x() + "}@" + AbstractC7273e0.m28128b(this);
    }

    /* renamed from: u */
    public Throwable m28223u(InterfaceC7271d1 interfaceC7271d1) {
        return interfaceC7271d1.mo28115h();
    }

    /* renamed from: w */
    public final Object m28224w() {
        InterfaceC7271d1 interfaceC7271d1;
        Object m18094c = null;
        m28205J();
        if (m28207L()) {
            m18094c = AbstractC4313d.m18094c();
            return m18094c;
        }
        Object m28225x = m28225x();
        if (!(m28225x instanceof C7311r)) {
            if (AbstractC7294l0.m28246b(this.f27191c) && (interfaceC7271d1 = (InterfaceC7271d1) mo17487e().get(InterfaceC7271d1.f27161f0)) != null && !interfaceC7271d1.mo28096a()) {
                CancellationException mo28115h = interfaceC7271d1.mo28115h();
                mo21178a(m28225x, mo28115h);
                throw mo28115h;
            }
            return mo28218f(m28225x);
        }
        throw ((C7311r) m28225x).f27215a;
    }

    /* renamed from: x */
    public final Object m28225x() {
        return this._state;
    }

    /* renamed from: y */
    public void m28226y() {
        m28205J();
    }

    /* renamed from: z */
    public boolean m28227z() {
        return !(m28225x() instanceof InterfaceC7301n1);
    }
}
