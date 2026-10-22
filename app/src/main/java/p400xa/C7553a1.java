package p400xa;

import ne.AbstractC5868k;

/* renamed from: xa.a1 */
/* loaded from: classes2.dex */
public final class C7553a1 {

    /* renamed from: a */
    private double f27748a;

    /* renamed from: b */
    private Double f27749b;

    /* renamed from: c */
    private Double f27750c;

    /* renamed from: d */
    private Double f27751d;

    /* renamed from: e */
    private String f27752e;

    /* renamed from: f */
    private String f27753f;

    public C7553a1(double d10, Double d11, Double d12, Double d13, String str, String str2) {
        AbstractC5868k.m23674f(str, "msg");
        AbstractC5868k.m23674f(str2, "pingHost");
        this.f27748a = d10;
        this.f27749b = d11;
        this.f27750c = d12;
        this.f27751d = d13;
        this.f27752e = str;
        this.f27753f = str2;
    }

    /* renamed from: a */
    public final Double m28933a() {
        return this.f27751d;
    }

    /* renamed from: b */
    public final Double m28934b() {
        return this.f27750c;
    }

    /* renamed from: c */
    public final Double m28935c() {
        return this.f27749b;
    }

    /* renamed from: d */
    public final String m28936d() {
        return this.f27752e;
    }

    /* renamed from: e */
    public final String m28937e() {
        return this.f27753f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7553a1)) {
            return false;
        }
        C7553a1 c7553a1 = (C7553a1) obj;
        return Double.compare(this.f27748a, c7553a1.f27748a) == 0 && AbstractC5868k.m23669a(this.f27749b, c7553a1.f27749b) && AbstractC5868k.m23669a(this.f27750c, c7553a1.f27750c) && AbstractC5868k.m23669a(this.f27751d, c7553a1.f27751d) && AbstractC5868k.m23669a(this.f27752e, c7553a1.f27752e) && AbstractC5868k.m23669a(this.f27753f, c7553a1.f27753f);
    }

    /* renamed from: f */
    public final double m28938f() {
        return this.f27748a;
    }

    public int hashCode() {
        int m29374a = AbstractC7622z0.m29374a(this.f27748a) * 31;
        Double d10 = this.f27749b;
        int hashCode = (m29374a + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f27750c;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f27751d;
        return ((((hashCode2 + (d12 != null ? d12.hashCode() : 0)) * 31) + this.f27752e.hashCode()) * 31) + this.f27753f.hashCode();
    }

    public String toString() {
        return "OneUrlTotalPingResult(rateOfSuccess=" + this.f27748a + ", minTimeMs=" + this.f27749b + ", maxTimeMs=" + this.f27750c + ", avgTimeMs=" + this.f27751d + ", msg=" + this.f27752e + ", pingHost=" + this.f27753f + ')';
    }
}
