package p380w6;

import p380w6.AbstractC7379f;

/* renamed from: w6.b */
/* loaded from: classes.dex */
final class C7375b extends AbstractC7379f {

    /* renamed from: a */
    private final String f27362a;

    /* renamed from: b */
    private final long f27363b;

    /* renamed from: c */
    private final AbstractC7379f.b f27364c;

    /* renamed from: w6.b$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7379f.a {

        /* renamed from: a */
        private String f27365a;

        /* renamed from: b */
        private Long f27366b;

        /* renamed from: c */
        private AbstractC7379f.b f27367c;

        @Override // p380w6.AbstractC7379f.a
        /* renamed from: a */
        public AbstractC7379f mo28456a() {
            String str = "";
            if (this.f27366b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C7375b(this.f27365a, this.f27366b.longValue(), this.f27367c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p380w6.AbstractC7379f.a
        /* renamed from: b */
        public AbstractC7379f.a mo28457b(AbstractC7379f.b bVar) {
            this.f27367c = bVar;
            return this;
        }

        @Override // p380w6.AbstractC7379f.a
        /* renamed from: c */
        public AbstractC7379f.a mo28458c(String str) {
            this.f27365a = str;
            return this;
        }

        @Override // p380w6.AbstractC7379f.a
        /* renamed from: d */
        public AbstractC7379f.a mo28459d(long j10) {
            this.f27366b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p380w6.AbstractC7379f
    /* renamed from: b */
    public AbstractC7379f.b mo28453b() {
        return this.f27364c;
    }

    @Override // p380w6.AbstractC7379f
    /* renamed from: c */
    public String mo28454c() {
        return this.f27362a;
    }

    @Override // p380w6.AbstractC7379f
    /* renamed from: d */
    public long mo28455d() {
        return this.f27363b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7379f)) {
            return false;
        }
        AbstractC7379f abstractC7379f = (AbstractC7379f) obj;
        String str = this.f27362a;
        if (str != null ? str.equals(abstractC7379f.mo28454c()) : abstractC7379f.mo28454c() == null) {
            if (this.f27363b == abstractC7379f.mo28455d()) {
                AbstractC7379f.b bVar = this.f27364c;
                if (bVar == null) {
                    if (abstractC7379f.mo28453b() == null) {
                        return true;
                    }
                } else if (bVar.equals(abstractC7379f.mo28453b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f27362a;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f27363b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        AbstractC7379f.b bVar = this.f27364c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "TokenResult{token=" + this.f27362a + ", tokenExpirationTimestamp=" + this.f27363b + ", responseCode=" + this.f27364c + "}";
    }

    private C7375b(String str, long j10, AbstractC7379f.b bVar) {
        this.f27362a = str;
        this.f27363b = j10;
        this.f27364c = bVar;
    }
}
