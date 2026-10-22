package p100d9;

import ne.AbstractC5868k;

/* renamed from: d9.k0 */
/* loaded from: classes2.dex */
public final class C3989k0 {

    /* renamed from: a */
    private String f17713a;

    /* renamed from: b */
    private String f17714b;

    /* renamed from: c */
    private int f17715c;

    public C3989k0(String str, String str2, int i10) {
        AbstractC5868k.m23674f(str, "label");
        AbstractC5868k.m23674f(str2, "description");
        this.f17713a = str;
        this.f17714b = str2;
        this.f17715c = i10;
    }

    /* renamed from: a */
    public final String m16877a() {
        return this.f17714b;
    }

    /* renamed from: b */
    public final String m16878b() {
        return this.f17713a;
    }

    /* renamed from: c */
    public final int m16879c() {
        return this.f17715c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3989k0)) {
            return false;
        }
        C3989k0 c3989k0 = (C3989k0) obj;
        return AbstractC5868k.m23669a(this.f17713a, c3989k0.f17713a) && AbstractC5868k.m23669a(this.f17714b, c3989k0.f17714b) && this.f17715c == c3989k0.f17715c;
    }

    public int hashCode() {
        return (((this.f17713a.hashCode() * 31) + this.f17714b.hashCode()) * 31) + this.f17715c;
    }

    public String toString() {
        return "PackageLabelBean(label=" + this.f17713a + ", description=" + this.f17714b + ", labelSequence=" + this.f17715c + ")";
    }
}
