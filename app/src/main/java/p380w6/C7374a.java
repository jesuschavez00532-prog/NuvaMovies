package p380w6;

import p380w6.AbstractC7377d;

/* renamed from: w6.a */
/* loaded from: classes.dex */
final class C7374a extends AbstractC7377d {

    /* renamed from: a */
    private final String f27352a;

    /* renamed from: b */
    private final String f27353b;

    /* renamed from: c */
    private final String f27354c;

    /* renamed from: d */
    private final AbstractC7379f f27355d;

    /* renamed from: e */
    private final AbstractC7377d.b f27356e;

    /* renamed from: w6.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7377d.a {

        /* renamed from: a */
        private String f27357a;

        /* renamed from: b */
        private String f27358b;

        /* renamed from: c */
        private String f27359c;

        /* renamed from: d */
        private AbstractC7379f f27360d;

        /* renamed from: e */
        private AbstractC7377d.b f27361e;

        @Override // p380w6.AbstractC7377d.a
        /* renamed from: a */
        public AbstractC7377d mo28447a() {
            return new C7374a(this.f27357a, this.f27358b, this.f27359c, this.f27360d, this.f27361e);
        }

        @Override // p380w6.AbstractC7377d.a
        /* renamed from: b */
        public AbstractC7377d.a mo28448b(AbstractC7379f abstractC7379f) {
            this.f27360d = abstractC7379f;
            return this;
        }

        @Override // p380w6.AbstractC7377d.a
        /* renamed from: c */
        public AbstractC7377d.a mo28449c(String str) {
            this.f27358b = str;
            return this;
        }

        @Override // p380w6.AbstractC7377d.a
        /* renamed from: d */
        public AbstractC7377d.a mo28450d(String str) {
            this.f27359c = str;
            return this;
        }

        @Override // p380w6.AbstractC7377d.a
        /* renamed from: e */
        public AbstractC7377d.a mo28451e(AbstractC7377d.b bVar) {
            this.f27361e = bVar;
            return this;
        }

        @Override // p380w6.AbstractC7377d.a
        /* renamed from: f */
        public AbstractC7377d.a mo28452f(String str) {
            this.f27357a = str;
            return this;
        }
    }

    @Override // p380w6.AbstractC7377d
    /* renamed from: b */
    public AbstractC7379f mo28442b() {
        return this.f27355d;
    }

    @Override // p380w6.AbstractC7377d
    /* renamed from: c */
    public String mo28443c() {
        return this.f27353b;
    }

    @Override // p380w6.AbstractC7377d
    /* renamed from: d */
    public String mo28444d() {
        return this.f27354c;
    }

    @Override // p380w6.AbstractC7377d
    /* renamed from: e */
    public AbstractC7377d.b mo28445e() {
        return this.f27356e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7377d)) {
            return false;
        }
        AbstractC7377d abstractC7377d = (AbstractC7377d) obj;
        String str = this.f27352a;
        if (str != null ? str.equals(abstractC7377d.mo28446f()) : abstractC7377d.mo28446f() == null) {
            String str2 = this.f27353b;
            if (str2 != null ? str2.equals(abstractC7377d.mo28443c()) : abstractC7377d.mo28443c() == null) {
                String str3 = this.f27354c;
                if (str3 != null ? str3.equals(abstractC7377d.mo28444d()) : abstractC7377d.mo28444d() == null) {
                    AbstractC7379f abstractC7379f = this.f27355d;
                    if (abstractC7379f != null ? abstractC7379f.equals(abstractC7377d.mo28442b()) : abstractC7377d.mo28442b() == null) {
                        AbstractC7377d.b bVar = this.f27356e;
                        if (bVar == null) {
                            if (abstractC7377d.mo28445e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(abstractC7377d.mo28445e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p380w6.AbstractC7377d
    /* renamed from: f */
    public String mo28446f() {
        return this.f27352a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f27352a;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f27353b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.f27354c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        AbstractC7379f abstractC7379f = this.f27355d;
        if (abstractC7379f == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC7379f.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        AbstractC7377d.b bVar = this.f27356e;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i14 ^ i10;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f27352a + ", fid=" + this.f27353b + ", refreshToken=" + this.f27354c + ", authToken=" + this.f27355d + ", responseCode=" + this.f27356e + "}";
    }

    private C7374a(String str, String str2, String str3, AbstractC7379f abstractC7379f, AbstractC7377d.b bVar) {
        this.f27352a = str;
        this.f27353b = str2;
        this.f27354c = str3;
        this.f27355d = abstractC7379f;
        this.f27356e = bVar;
    }
}
