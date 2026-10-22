package p250n8;

import ne.AbstractC5868k;

/* renamed from: n8.b */
/* loaded from: classes2.dex */
public final class C5766b {

    /* renamed from: a */
    private final int f23099a;

    /* renamed from: b */
    private final int f23100b;

    /* renamed from: c */
    private final String f23101c;

    /* renamed from: d */
    private final boolean f23102d;

    public C5766b(int i10, int i11, String str, boolean z10) {
        AbstractC5868k.m23674f(str, "statName");
        this.f23099a = i10;
        this.f23100b = i11;
        this.f23101c = str;
        this.f23102d = z10;
    }

    /* renamed from: a */
    public final int m23228a() {
        return this.f23100b;
    }

    /* renamed from: b */
    public final String m23229b() {
        return this.f23101c;
    }

    /* renamed from: c */
    public final int m23230c() {
        return this.f23099a;
    }

    /* renamed from: d */
    public final boolean m23231d() {
        return this.f23102d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5766b)) {
            return false;
        }
        C5766b c5766b = (C5766b) obj;
        return this.f23099a == c5766b.f23099a && this.f23100b == c5766b.f23100b && AbstractC5868k.m23669a(this.f23101c, c5766b.f23101c) && this.f23102d == c5766b.f23102d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f23099a * 31) + this.f23100b) * 31) + this.f23101c.hashCode()) * 31;
        boolean z10 = this.f23102d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "PercentStat(visitScore=" + this.f23099a + ", homeScore=" + this.f23100b + ", statName=" + this.f23101c + ", isPercent=" + this.f23102d + ')';
    }
}
