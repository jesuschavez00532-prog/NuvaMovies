package be;

import java.io.Serializable;
import ne.AbstractC5868k;

/* renamed from: be.n */
/* loaded from: classes3.dex */
public final class C1318n implements Serializable {

    /* renamed from: a */
    private final Object f4985a;

    /* renamed from: b */
    private final Object f4986b;

    public C1318n(Object obj, Object obj2) {
        this.f4985a = obj;
        this.f4986b = obj2;
    }

    /* renamed from: a */
    public final Object m5967a() {
        return this.f4985a;
    }

    /* renamed from: b */
    public final Object m5968b() {
        return this.f4986b;
    }

    /* renamed from: c */
    public final Object m5969c() {
        return this.f4985a;
    }

    /* renamed from: d */
    public final Object m5970d() {
        return this.f4986b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1318n)) {
            return false;
        }
        C1318n c1318n = (C1318n) obj;
        return AbstractC5868k.m23669a(this.f4985a, c1318n.f4985a) && AbstractC5868k.m23669a(this.f4986b, c1318n.f4986b);
    }

    public int hashCode() {
        Object obj = this.f4985a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4986b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f4985a + ", " + this.f4986b + ')';
    }
}
