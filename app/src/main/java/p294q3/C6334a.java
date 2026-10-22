package p294q3;

/* renamed from: q3.a */
/* loaded from: classes.dex */
final class C6334a extends AbstractC6336c {

    /* renamed from: a */
    private final Integer f24678a;

    /* renamed from: b */
    private final Object f24679b;

    /* renamed from: c */
    private final EnumC6337d f24680c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6334a(Integer num, Object obj, EnumC6337d enumC6337d) {
        this.f24678a = num;
        if (obj != null) {
            this.f24679b = obj;
            if (enumC6337d != null) {
                this.f24680c = enumC6337d;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // p294q3.AbstractC6336c
    /* renamed from: a */
    public Integer mo25114a() {
        return this.f24678a;
    }

    @Override // p294q3.AbstractC6336c
    /* renamed from: b */
    public Object mo25115b() {
        return this.f24679b;
    }

    @Override // p294q3.AbstractC6336c
    /* renamed from: c */
    public EnumC6337d mo25116c() {
        return this.f24680c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6336c)) {
            return false;
        }
        AbstractC6336c abstractC6336c = (AbstractC6336c) obj;
        Integer num = this.f24678a;
        if (num != null ? num.equals(abstractC6336c.mo25114a()) : abstractC6336c.mo25114a() == null) {
            if (this.f24679b.equals(abstractC6336c.mo25115b()) && this.f24680c.equals(abstractC6336c.mo25116c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f24678a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f24679b.hashCode()) * 1000003) ^ this.f24680c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f24678a + ", payload=" + this.f24679b + ", priority=" + this.f24680c + "}";
    }
}
