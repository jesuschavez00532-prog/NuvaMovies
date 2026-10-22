package p225ld;

import java.util.ArrayList;
import ne.AbstractC5868k;

/* renamed from: ld.b */
/* loaded from: classes3.dex */
public final class C5548b {

    /* renamed from: a */
    private final boolean f22487a;

    /* renamed from: b */
    private final ArrayList f22488b;

    public C5548b(boolean z10, ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "recommendList");
        this.f22487a = z10;
        this.f22488b = arrayList;
    }

    /* renamed from: a */
    public final ArrayList m22490a() {
        return this.f22488b;
    }

    /* renamed from: b */
    public final boolean m22491b() {
        return this.f22487a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5548b)) {
            return false;
        }
        C5548b c5548b = (C5548b) obj;
        return this.f22487a == c5548b.f22487a && AbstractC5868k.m23669a(this.f22488b, c5548b.f22488b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f22487a;
        Object r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + this.f22488b.hashCode();
    }

    public String toString() {
        return "ColumnRecommend(isCached=" + this.f22487a + ", recommendList=" + this.f22488b + ')';
    }
}
