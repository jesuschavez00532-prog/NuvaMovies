package p028b8;

import com.request.result.MatchPromotion;
import java.util.ArrayList;
import ne.AbstractC5868k;

/* renamed from: b8.d0 */
/* loaded from: classes2.dex */
public final class C1154d0 {

    /* renamed from: a */
    private final MatchPromotion f4548a;

    /* renamed from: b */
    private final ArrayList f4549b;

    /* renamed from: c */
    private final int f4550c;

    /* renamed from: d */
    private final int f4551d;

    public C1154d0(MatchPromotion matchPromotion, ArrayList arrayList, int i10, int i11) {
        AbstractC5868k.m23674f(matchPromotion, "matchPromotion");
        AbstractC5868k.m23674f(arrayList, "matchPromotionTeamList");
        this.f4548a = matchPromotion;
        this.f4549b = arrayList;
        this.f4550c = i10;
        this.f4551d = i11;
    }

    /* renamed from: a */
    public final MatchPromotion m5291a() {
        return this.f4548a;
    }

    /* renamed from: b */
    public final ArrayList m5292b() {
        return this.f4549b;
    }

    /* renamed from: c */
    public final int m5293c() {
        return this.f4550c;
    }

    /* renamed from: d */
    public final int m5294d() {
        return this.f4551d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1154d0)) {
            return false;
        }
        C1154d0 c1154d0 = (C1154d0) obj;
        return AbstractC5868k.m23669a(this.f4548a, c1154d0.f4548a) && AbstractC5868k.m23669a(this.f4549b, c1154d0.f4549b) && this.f4550c == c1154d0.f4550c && this.f4551d == c1154d0.f4551d;
    }

    public int hashCode() {
        return (((((this.f4548a.hashCode() * 31) + this.f4549b.hashCode()) * 31) + this.f4550c) * 31) + this.f4551d;
    }

    public String toString() {
        return "PlayOffInfo(matchPromotion=" + this.f4548a + ", matchPromotionTeamList=" + this.f4549b + ", playOffLayer=" + this.f4550c + ", playOffNum=" + this.f4551d + ')';
    }
}
