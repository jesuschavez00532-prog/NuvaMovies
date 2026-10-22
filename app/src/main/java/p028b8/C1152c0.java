package p028b8;

import com.request.result.MatchScoreTeam;
import ne.AbstractC5868k;

/* renamed from: b8.c0 */
/* loaded from: classes2.dex */
public final class C1152c0 {

    /* renamed from: a */
    private final int f4536a;

    /* renamed from: b */
    private final int f4537b;

    /* renamed from: c */
    private final String f4538c;

    /* renamed from: d */
    private final MatchScoreTeam f4539d;

    /* renamed from: e */
    private final C1154d0 f4540e;

    public C1152c0(int i10, int i11, String str, MatchScoreTeam matchScoreTeam, C1154d0 c1154d0) {
        AbstractC5868k.m23674f(str, "groupName");
        this.f4536a = i10;
        this.f4537b = i11;
        this.f4538c = str;
        this.f4539d = matchScoreTeam;
        this.f4540e = c1154d0;
    }

    /* renamed from: a */
    public final String m5277a() {
        return this.f4538c;
    }

    /* renamed from: b */
    public final int m5278b() {
        return this.f4537b;
    }

    /* renamed from: c */
    public final C1154d0 m5279c() {
        return this.f4540e;
    }

    /* renamed from: d */
    public final MatchScoreTeam m5280d() {
        return this.f4539d;
    }

    /* renamed from: e */
    public final int m5281e() {
        return this.f4536a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1152c0)) {
            return false;
        }
        C1152c0 c1152c0 = (C1152c0) obj;
        return this.f4536a == c1152c0.f4536a && this.f4537b == c1152c0.f4537b && AbstractC5868k.m23669a(this.f4538c, c1152c0.f4538c) && AbstractC5868k.m23669a(this.f4539d, c1152c0.f4539d) && AbstractC5868k.m23669a(this.f4540e, c1152c0.f4540e);
    }

    public int hashCode() {
        int hashCode = ((((this.f4536a * 31) + this.f4537b) * 31) + this.f4538c.hashCode()) * 31;
        MatchScoreTeam matchScoreTeam = this.f4539d;
        int hashCode2 = (hashCode + (matchScoreTeam == null ? 0 : matchScoreTeam.hashCode())) * 31;
        C1154d0 c1154d0 = this.f4540e;
        return hashCode2 + (c1154d0 != null ? c1154d0.hashCode() : 0);
    }

    public String toString() {
        return "MatchScoreRank(type=" + this.f4536a + ", index=" + this.f4537b + ", groupName=" + this.f4538c + ", scoreTeam=" + this.f4539d + ", promotion=" + this.f4540e + ')';
    }
}
