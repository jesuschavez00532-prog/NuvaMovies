package p027b7;

/* renamed from: b7.a */
/* loaded from: classes.dex */
final class C1138a extends AbstractC1143f {

    /* renamed from: a */
    private final String f4466a;

    /* renamed from: b */
    private final String f4467b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1138a(String str, String str2) {
        if (str != null) {
            this.f4466a = str;
            if (str2 != null) {
                this.f4467b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // p027b7.AbstractC1143f
    /* renamed from: b */
    public String mo5189b() {
        return this.f4466a;
    }

    @Override // p027b7.AbstractC1143f
    /* renamed from: c */
    public String mo5190c() {
        return this.f4467b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1143f)) {
            return false;
        }
        AbstractC1143f abstractC1143f = (AbstractC1143f) obj;
        if (this.f4466a.equals(abstractC1143f.mo5189b()) && this.f4467b.equals(abstractC1143f.mo5190c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4466a.hashCode() ^ 1000003) * 1000003) ^ this.f4467b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f4466a + ", version=" + this.f4467b + "}";
    }
}
