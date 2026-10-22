package kotlinx.coroutines.internal;

import be.AbstractC1321q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ne.AbstractC5868k;

/* renamed from: kotlinx.coroutines.internal.j */
/* loaded from: classes3.dex */
public class C5271j {

    /* renamed from: a */
    static final AtomicReferenceFieldUpdater f21480a = AtomicReferenceFieldUpdater.newUpdater(C5271j.class, Object.class, "_next");

    /* renamed from: b */
    static final AtomicReferenceFieldUpdater f21481b = AtomicReferenceFieldUpdater.newUpdater(C5271j.class, Object.class, "_prev");

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f21482c = AtomicReferenceFieldUpdater.newUpdater(C5271j.class, Object.class, "_removedRef");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.j$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends AbstractC5264c {

        /* renamed from: b */
        public C5271j f21483b;

        /* renamed from: c */
        public final C5271j f21484c;

        public a(C5271j c5271j) {
            this.f21484c = c5271j;
        }

        @Override // kotlinx.coroutines.internal.AbstractC5264c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo21174d(C5271j c5271j, Object obj) {
            boolean z10;
            C5271j c5271j2;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c5271j2 = this.f21484c;
            } else {
                c5271j2 = this.f21483b;
            }
            if (c5271j2 != null && AbstractC1321q.m5977a(C5271j.f21480a, c5271j, this, c5271j2) && z10) {
                C5271j c5271j3 = this.f21484c;
                C5271j c5271j4 = this.f21483b;
                AbstractC5868k.m23671c(c5271j4);
                c5271j3.m21201l(c5271j4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (be.AbstractC1321q.m5977a(kotlinx.coroutines.internal.C5271j.f21480a, r3, r2, ((kotlinx.coroutines.internal.C5278q) r4).f21501a) != false) goto L30;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.internal.C5271j m21199j(kotlinx.coroutines.internal.AbstractC5277p r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6._prev
            kotlinx.coroutines.internal.j r0 = (kotlinx.coroutines.internal.C5271j) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r6) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C5271j.f21481b
            boolean r0 = be.AbstractC1321q.m5977a(r1, r6, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r6.mo21195p()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r7) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.AbstractC5277p
            if (r5 == 0) goto L38
            if (r7 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.p r0 = (kotlinx.coroutines.internal.AbstractC5277p) r0
            boolean r0 = r7.m21242b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.p r4 = (kotlinx.coroutines.internal.AbstractC5277p) r4
            r4.mo21173c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C5278q
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.C5271j.f21480a
            kotlinx.coroutines.internal.q r4 = (kotlinx.coroutines.internal.C5278q) r4
            kotlinx.coroutines.internal.j r4 = r4.f21501a
            boolean r2 = be.AbstractC1321q.m5977a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.j r2 = (kotlinx.coroutines.internal.C5271j) r2
            goto L7
        L52:
            if (r4 == 0) goto L59
            kotlinx.coroutines.internal.j r4 = (kotlinx.coroutines.internal.C5271j) r4
            r3 = r2
            r2 = r4
            goto L7
        L59:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
        */
        //  java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
        /*
            r7.<init>(r0)
            goto L62
        L61:
            throw r7
        L62:
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5271j.m21199j(kotlinx.coroutines.internal.p):kotlinx.coroutines.internal.j");
    }

    /* renamed from: k */
    private final C5271j m21200k(C5271j c5271j) {
        while (c5271j.mo21195p()) {
            c5271j = (C5271j) c5271j._prev;
        }
        return c5271j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m21201l(C5271j c5271j) {
        C5271j c5271j2;
        do {
            c5271j2 = (C5271j) c5271j._prev;
            if (m21204m() != c5271j) {
                return;
            }
        } while (!AbstractC1321q.m5977a(f21481b, c5271j, c5271j2, this));
        if (mo21195p()) {
            c5271j.m21199j(null);
        }
    }

    /* renamed from: s */
    private final C5278q m21202s() {
        C5278q c5278q = (C5278q) this._removedRef;
        if (c5278q == null) {
            C5278q c5278q2 = new C5278q(this);
            f21482c.lazySet(this, c5278q2);
            return c5278q2;
        }
        return c5278q;
    }

    /* renamed from: i */
    public final boolean m21203i(C5271j c5271j) {
        f21481b.lazySet(c5271j, this);
        f21480a.lazySet(c5271j, this);
        while (m21204m() == this) {
            if (AbstractC1321q.m5977a(f21480a, this, this, c5271j)) {
                c5271j.m21201l(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final Object m21204m() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC5277p)) {
                return obj;
            }
            ((AbstractC5277p) obj).mo21173c(this);
        }
    }

    /* renamed from: n */
    public final C5271j m21205n() {
        return AbstractC5270i.m21197b(m21204m());
    }

    /* renamed from: o */
    public final C5271j m21206o() {
        C5271j m21199j = m21199j(null);
        if (m21199j == null) {
            return m21200k((C5271j) this._prev);
        }
        return m21199j;
    }

    /* renamed from: p */
    public boolean mo21195p() {
        return m21204m() instanceof C5278q;
    }

    /* renamed from: q */
    public boolean m21207q() {
        if (m21208r() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final C5271j m21208r() {
        Object m21204m;
        C5271j c5271j;
        do {
            m21204m = m21204m();
            if (m21204m instanceof C5278q) {
                return ((C5278q) m21204m).f21501a;
            }
            if (m21204m == this) {
                return (C5271j) m21204m;
            }
            if (m21204m != null) {
                c5271j = (C5271j) m21204m;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!AbstractC1321q.m5977a(f21480a, this, m21204m, c5271j.m21202s()));
        c5271j.m21199j(null);
        return null;
    }

    /* renamed from: t */
    public final int m21209t(C5271j c5271j, C5271j c5271j2, a aVar) {
        f21481b.lazySet(c5271j, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21480a;
        atomicReferenceFieldUpdater.lazySet(c5271j, c5271j2);
        aVar.f21483b = c5271j2;
        if (!AbstractC1321q.m5977a(atomicReferenceFieldUpdater, this, c5271j2, aVar)) {
            return 0;
        }
        if (aVar.mo21173c(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
