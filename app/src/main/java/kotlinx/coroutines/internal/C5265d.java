package kotlinx.coroutines.internal;

import be.AbstractC1321q;
import be.C1328x;
import ee.InterfaceC4181d;
import ee.InterfaceC4184g;
import ge.InterfaceC4438e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ne.AbstractC5868k;
import ve.AbstractC7273e0;
import ve.AbstractC7291k0;
import ve.AbstractC7309q0;
import ve.AbstractC7323v;
import ve.AbstractC7329x;
import ve.C7284i;
import ve.C7313r1;
import ve.C7314s;
import ve.InterfaceC7281h;

/* renamed from: kotlinx.coroutines.internal.d */
/* loaded from: classes3.dex */
public final class C5265d extends AbstractC7291k0 implements InterfaceC4438e, InterfaceC4181d {

    /* renamed from: i */
    private static final AtomicReferenceFieldUpdater f21468i = AtomicReferenceFieldUpdater.newUpdater(C5265d.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d */
    public Object f21469d;

    /* renamed from: e */
    private final InterfaceC4438e f21470e;

    /* renamed from: f */
    public final Object f21471f;

    /* renamed from: g */
    public final AbstractC7329x f21472g;

    /* renamed from: h */
    public final InterfaceC4181d f21473h;

    public C5265d(AbstractC7329x abstractC7329x, InterfaceC4181d interfaceC4181d) {
        super(-1);
        this.f21472g = abstractC7329x;
        this.f21473h = interfaceC4181d;
        this.f21469d = AbstractC5266e.m21185a();
        this.f21470e = (InterfaceC4438e) (interfaceC4181d instanceof InterfaceC4438e ? interfaceC4181d : null);
        this.f21471f = AbstractC5284w.m21261b(mo17487e());
        this._reusableCancellableContinuation = null;
    }

    @Override // ve.AbstractC7291k0
    /* renamed from: a */
    public void mo21178a(Object obj, Throwable th) {
        if (obj instanceof C7314s) {
            ((C7314s) obj).f27227b.mo542f(th);
        }
    }

    @Override // ve.AbstractC7291k0
    /* renamed from: b */
    public InterfaceC4181d mo21179b() {
        return this;
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: d */
    public void mo17486d(Object obj) {
        InterfaceC4184g mo17487e = this.f21473h.mo17487e();
        Object m28306d = AbstractC7323v.m28306d(obj, null, 1, null);
        if (this.f21472g.mo21240y(mo17487e)) {
            this.f21469d = m28306d;
            this.f27191c = 0;
            this.f21472g.mo21239x(mo17487e, this);
            return;
        }
        AbstractC7309q0 m28293a = C7313r1.f27225b.m28293a();
        if (m28293a.m28268F()) {
            this.f21469d = m28306d;
            this.f27191c = 0;
            m28293a.m28265B(this);
            return;
        }
        m28293a.m28267D(true);
        try {
            InterfaceC4184g mo17487e2 = mo17487e();
            Object m21262c = AbstractC5284w.m21262c(mo17487e2, this.f21471f);
            try {
                this.f21473h.mo17486d(obj);
                C1328x c1328x = C1328x.f4998a;
                do {
                } while (m28293a.m28270H());
            } finally {
                AbstractC5284w.m21260a(mo17487e2, m21262c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: e */
    public InterfaceC4184g mo17487e() {
        return this.f21473h.mo17487e();
    }

    @Override // ve.AbstractC7291k0
    /* renamed from: i */
    public Object mo21180i() {
        Object obj = this.f21469d;
        this.f21469d = AbstractC5266e.m21185a();
        return obj;
    }

    /* renamed from: k */
    public final Throwable m21181k(InterfaceC7281h interfaceC7281h) {
        C5280s c5280s;
        do {
            Object obj = this._reusableCancellableContinuation;
            c5280s = AbstractC5266e.f21475b;
            if (obj != c5280s) {
                if (obj == null) {
                    return null;
                }
                if (obj instanceof Throwable) {
                    if (AbstractC1321q.m5977a(f21468i, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC1321q.m5977a(f21468i, this, c5280s, interfaceC7281h));
        return null;
    }

    /* renamed from: l */
    public final C7284i m21182l() {
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof C7284i)) {
            obj = null;
        }
        return (C7284i) obj;
    }

    /* renamed from: m */
    public final boolean m21183m(C7284i c7284i) {
        Object obj = this._reusableCancellableContinuation;
        if (obj == null) {
            return false;
        }
        if ((obj instanceof C7284i) && obj != c7284i) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final boolean m21184n(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C5280s c5280s = AbstractC5266e.f21475b;
            if (AbstractC5868k.m23669a(obj, c5280s)) {
                if (AbstractC1321q.m5977a(f21468i, this, c5280s, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC1321q.m5977a(f21468i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f21472g + ", " + AbstractC7273e0.m28129c(this.f21473h) + ']';
    }
}
