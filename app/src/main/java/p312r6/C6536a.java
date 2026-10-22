package p312r6;

import java.util.List;

/* renamed from: r6.a */
/* loaded from: classes.dex */
final class C6536a extends AbstractC6554s {

    /* renamed from: a */
    private final String f25156a;

    /* renamed from: b */
    private final List f25157b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6536a(String str, List list) {
        if (str != null) {
            this.f25156a = str;
            if (list != null) {
                this.f25157b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // p312r6.AbstractC6554s
    /* renamed from: b */
    public List mo25576b() {
        return this.f25157b;
    }

    @Override // p312r6.AbstractC6554s
    /* renamed from: c */
    public String mo25577c() {
        return this.f25156a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6554s)) {
            return false;
        }
        AbstractC6554s abstractC6554s = (AbstractC6554s) obj;
        if (this.f25156a.equals(abstractC6554s.mo25577c()) && this.f25157b.equals(abstractC6554s.mo25576b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f25156a.hashCode() ^ 1000003) * 1000003) ^ this.f25157b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f25156a + ", usedDates=" + this.f25157b + "}";
    }
}
