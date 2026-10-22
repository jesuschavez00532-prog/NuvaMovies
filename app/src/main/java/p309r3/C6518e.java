package p309r3;

import p309r3.AbstractC6524k;

/* renamed from: r3.e */
/* loaded from: classes.dex */
final class C6518e extends AbstractC6524k {

    /* renamed from: a */
    private final AbstractC6524k.b f25044a;

    /* renamed from: b */
    private final AbstractC6514a f25045b;

    /* renamed from: r3.e$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC6524k.a {

        /* renamed from: a */
        private AbstractC6524k.b f25046a;

        /* renamed from: b */
        private AbstractC6514a f25047b;

        @Override // p309r3.AbstractC6524k.a
        /* renamed from: a */
        public AbstractC6524k mo25505a() {
            return new C6518e(this.f25046a, this.f25047b);
        }

        @Override // p309r3.AbstractC6524k.a
        /* renamed from: b */
        public AbstractC6524k.a mo25506b(AbstractC6514a abstractC6514a) {
            this.f25047b = abstractC6514a;
            return this;
        }

        @Override // p309r3.AbstractC6524k.a
        /* renamed from: c */
        public AbstractC6524k.a mo25507c(AbstractC6524k.b bVar) {
            this.f25046a = bVar;
            return this;
        }
    }

    @Override // p309r3.AbstractC6524k
    /* renamed from: b */
    public AbstractC6514a mo25503b() {
        return this.f25045b;
    }

    @Override // p309r3.AbstractC6524k
    /* renamed from: c */
    public AbstractC6524k.b mo25504c() {
        return this.f25044a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6524k)) {
            return false;
        }
        AbstractC6524k abstractC6524k = (AbstractC6524k) obj;
        AbstractC6524k.b bVar = this.f25044a;
        if (bVar != null ? bVar.equals(abstractC6524k.mo25504c()) : abstractC6524k.mo25504c() == null) {
            AbstractC6514a abstractC6514a = this.f25045b;
            if (abstractC6514a == null) {
                if (abstractC6524k.mo25503b() == null) {
                    return true;
                }
            } else if (abstractC6514a.equals(abstractC6524k.mo25503b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AbstractC6524k.b bVar = this.f25044a;
        int i10 = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        AbstractC6514a abstractC6514a = this.f25045b;
        if (abstractC6514a != null) {
            i10 = abstractC6514a.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f25044a + ", androidClientInfo=" + this.f25045b + "}";
    }

    private C6518e(AbstractC6524k.b bVar, AbstractC6514a abstractC6514a) {
        this.f25044a = bVar;
        this.f25045b = abstractC6514a;
    }
}
