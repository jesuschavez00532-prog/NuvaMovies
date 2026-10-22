package ve;

import me.InterfaceC5660l;
import ne.AbstractC5868k;

/* renamed from: ve.s */
/* loaded from: classes3.dex */
public final class C7314s {

    /* renamed from: a */
    public final Object f27226a;

    /* renamed from: b */
    public final InterfaceC5660l f27227b;

    public C7314s(Object obj, InterfaceC5660l interfaceC5660l) {
        this.f27226a = obj;
        this.f27227b = interfaceC5660l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7314s)) {
            return false;
        }
        C7314s c7314s = (C7314s) obj;
        return AbstractC5868k.m23669a(this.f27226a, c7314s.f27226a) && AbstractC5868k.m23669a(this.f27227b, c7314s.f27227b);
    }

    public int hashCode() {
        Object obj = this.f27226a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        InterfaceC5660l interfaceC5660l = this.f27227b;
        return hashCode + (interfaceC5660l != null ? interfaceC5660l.hashCode() : 0);
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f27226a + ", onCancellation=" + this.f27227b + ")";
    }
}
