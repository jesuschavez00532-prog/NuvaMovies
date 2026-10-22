package p100d9;

import ne.AbstractC5868k;

/* renamed from: d9.w */
/* loaded from: classes2.dex */
public final class C4011w {

    /* renamed from: a */
    private final int f17780a;

    /* renamed from: b */
    private final String f17781b;

    /* renamed from: c */
    private final Integer f17782c;

    /* renamed from: d */
    private final Integer f17783d;

    /* renamed from: e */
    private final Integer f17784e;

    public C4011w(int i10, String str, Integer num, Integer num2, Integer num3) {
        AbstractC5868k.m23674f(str, "title");
        this.f17780a = i10;
        this.f17781b = str;
        this.f17782c = num;
        this.f17783d = num2;
        this.f17784e = num3;
    }

    /* renamed from: a */
    public final Integer m16949a() {
        return this.f17784e;
    }

    /* renamed from: b */
    public final Integer m16950b() {
        return this.f17782c;
    }

    /* renamed from: c */
    public final Integer m16951c() {
        return this.f17783d;
    }

    /* renamed from: d */
    public final int m16952d() {
        return this.f17780a;
    }

    /* renamed from: e */
    public final String m16953e() {
        return this.f17781b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4011w)) {
            return false;
        }
        C4011w c4011w = (C4011w) obj;
        return this.f17780a == c4011w.f17780a && AbstractC5868k.m23669a(this.f17781b, c4011w.f17781b) && AbstractC5868k.m23669a(this.f17782c, c4011w.f17782c) && AbstractC5868k.m23669a(this.f17783d, c4011w.f17783d) && AbstractC5868k.m23669a(this.f17784e, c4011w.f17784e);
    }

    public int hashCode() {
        int hashCode = ((this.f17780a * 31) + this.f17781b.hashCode()) * 31;
        Integer num = this.f17782c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17783d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f17784e;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "MenuItem(id=" + this.f17780a + ", title=" + this.f17781b + ", iconNormalRes=" + this.f17782c + ", iconSecondRes=" + this.f17783d + ", iconFocusRes=" + this.f17784e + ")";
    }
}
