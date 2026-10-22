package p309r3;

import p309r3.AbstractC6528o;

/* renamed from: r3.i */
/* loaded from: classes.dex */
final class C6522i extends AbstractC6528o {

    /* renamed from: a */
    private final AbstractC6528o.c f25077a;

    /* renamed from: b */
    private final AbstractC6528o.b f25078b;

    /* renamed from: r3.i$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC6528o.a {

        /* renamed from: a */
        private AbstractC6528o.c f25079a;

        /* renamed from: b */
        private AbstractC6528o.b f25080b;

        @Override // p309r3.AbstractC6528o.a
        /* renamed from: a */
        public AbstractC6528o mo25541a() {
            return new C6522i(this.f25079a, this.f25080b);
        }

        @Override // p309r3.AbstractC6528o.a
        /* renamed from: b */
        public AbstractC6528o.a mo25542b(AbstractC6528o.b bVar) {
            this.f25080b = bVar;
            return this;
        }

        @Override // p309r3.AbstractC6528o.a
        /* renamed from: c */
        public AbstractC6528o.a mo25543c(AbstractC6528o.c cVar) {
            this.f25079a = cVar;
            return this;
        }
    }

    @Override // p309r3.AbstractC6528o
    /* renamed from: b */
    public AbstractC6528o.b mo25539b() {
        return this.f25078b;
    }

    @Override // p309r3.AbstractC6528o
    /* renamed from: c */
    public AbstractC6528o.c mo25540c() {
        return this.f25077a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6528o)) {
            return false;
        }
        AbstractC6528o abstractC6528o = (AbstractC6528o) obj;
        AbstractC6528o.c cVar = this.f25077a;
        if (cVar != null ? cVar.equals(abstractC6528o.mo25540c()) : abstractC6528o.mo25540c() == null) {
            AbstractC6528o.b bVar = this.f25078b;
            if (bVar == null) {
                if (abstractC6528o.mo25539b() == null) {
                    return true;
                }
            } else if (bVar.equals(abstractC6528o.mo25539b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        AbstractC6528o.c cVar = this.f25077a;
        int i10 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        AbstractC6528o.b bVar = this.f25078b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f25077a + ", mobileSubtype=" + this.f25078b + "}";
    }

    private C6522i(AbstractC6528o.c cVar, AbstractC6528o.b bVar) {
        this.f25077a = cVar;
        this.f25078b = bVar;
    }
}
