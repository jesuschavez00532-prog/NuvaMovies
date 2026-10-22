package ve;

import me.InterfaceC5660l;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: ve.q */
/* loaded from: classes3.dex */
final class C7308q {

    /* renamed from: a */
    public final Object f27206a;

    /* renamed from: b */
    public final AbstractC7275f f27207b;

    /* renamed from: c */
    public final InterfaceC5660l f27208c;

    /* renamed from: d */
    public final Object f27209d;

    /* renamed from: e */
    public final Throwable f27210e;

    public C7308q(Object obj, AbstractC7275f abstractC7275f, InterfaceC5660l interfaceC5660l, Object obj2, Throwable th) {
        this.f27206a = obj;
        this.f27207b = abstractC7275f;
        this.f27208c = interfaceC5660l;
        this.f27209d = obj2;
        this.f27210e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C7308q m28259b(C7308q c7308q, Object obj, AbstractC7275f abstractC7275f, InterfaceC5660l interfaceC5660l, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = c7308q.f27206a;
        }
        if ((i10 & 2) != 0) {
            abstractC7275f = c7308q.f27207b;
        }
        AbstractC7275f abstractC7275f2 = abstractC7275f;
        if ((i10 & 4) != 0) {
            interfaceC5660l = c7308q.f27208c;
        }
        InterfaceC5660l interfaceC5660l2 = interfaceC5660l;
        if ((i10 & 8) != 0) {
            obj2 = c7308q.f27209d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = c7308q.f27210e;
        }
        return c7308q.m28260a(obj, abstractC7275f2, interfaceC5660l2, obj4, th);
    }

    /* renamed from: a */
    public final C7308q m28260a(Object obj, AbstractC7275f abstractC7275f, InterfaceC5660l interfaceC5660l, Object obj2, Throwable th) {
        return new C7308q(obj, abstractC7275f, interfaceC5660l, obj2, th);
    }

    /* renamed from: c */
    public final boolean m28261c() {
        if (this.f27210e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m28262d(C7284i c7284i, Throwable th) {
        AbstractC7275f abstractC7275f = this.f27207b;
        if (abstractC7275f != null) {
            c7284i.m28219m(abstractC7275f, th);
        }
        InterfaceC5660l interfaceC5660l = this.f27208c;
        if (interfaceC5660l != null) {
            c7284i.m28220n(interfaceC5660l, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7308q)) {
            return false;
        }
        C7308q c7308q = (C7308q) obj;
        return AbstractC5868k.m23669a(this.f27206a, c7308q.f27206a) && AbstractC5868k.m23669a(this.f27207b, c7308q.f27207b) && AbstractC5868k.m23669a(this.f27208c, c7308q.f27208c) && AbstractC5868k.m23669a(this.f27209d, c7308q.f27209d) && AbstractC5868k.m23669a(this.f27210e, c7308q.f27210e);
    }

    public int hashCode() {
        Object obj = this.f27206a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        AbstractC7275f abstractC7275f = this.f27207b;
        int hashCode2 = (hashCode + (abstractC7275f != null ? abstractC7275f.hashCode() : 0)) * 31;
        InterfaceC5660l interfaceC5660l = this.f27208c;
        int hashCode3 = (hashCode2 + (interfaceC5660l != null ? interfaceC5660l.hashCode() : 0)) * 31;
        Object obj2 = this.f27209d;
        int hashCode4 = (hashCode3 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Throwable th = this.f27210e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f27206a + ", cancelHandler=" + this.f27207b + ", onCancellation=" + this.f27208c + ", idempotentResume=" + this.f27209d + ", cancelCause=" + this.f27210e + ")";
    }

    public /* synthetic */ C7308q(Object obj, AbstractC7275f abstractC7275f, InterfaceC5660l interfaceC5660l, Object obj2, Throwable th, int i10, AbstractC5864g abstractC5864g) {
        this(obj, (i10 & 2) != 0 ? null : abstractC7275f, (i10 & 4) != 0 ? null : interfaceC5660l, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
