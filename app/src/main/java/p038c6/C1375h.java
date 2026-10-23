package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.h */
/* loaded from: classes.dex */
final class C1375h extends AbstractC1366a0.e.a {

    /* renamed from: a */
    private final String f5295a;

    /* renamed from: b */
    private final String f5296b;

    /* renamed from: c */
    private final String f5297c;

    /* renamed from: d */
    private final String f5298d;

    /* renamed from: e */
    private final String f5299e;

    /* renamed from: f */
    private final String f5300f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.h$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.a.AbstractC7804a {

        /* renamed from: a */
        private String f5301a;

        /* renamed from: b */
        private String f5302b;

        /* renamed from: c */
        private String f5303c;

        /* renamed from: d */
        private String f5304d;

        /* renamed from: e */
        private String f5305e;

        /* renamed from: f */
        private String f5306f;

        @Override // p038c6.AbstractC1366a0.e.a.AbstractC7804a
        /* renamed from: a */
        public AbstractC1366a0.e.a mo6247a() {
            String str = "";
            if (this.f5301a == null) {
                str = " identifier";
            }
            if (this.f5302b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C1375h(this.f5301a, this.f5302b, this.f5303c, null, this.f5304d, this.f5305e, this.f5306f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.a.AbstractC7804a
        /* renamed from: b */
        public AbstractC1366a0.e.a.AbstractC7804a mo6248b(String str) {
            this.f5305e = str;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.a.AbstractC7804a
        /* renamed from: c */
        public AbstractC1366a0.e.a.AbstractC7804a mo6249c(String str) {
            this.f5306f = str;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.a.AbstractC7804a
        /* renamed from: d */
        public AbstractC1366a0.e.a.AbstractC7804a mo6250d(String str) {
            this.f5303c = str;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.a.AbstractC7804a
        /* renamed from: e */
        public AbstractC1366a0.e.a.AbstractC7804a mo6251e(String str) {
            if (str != null) {
                this.f5301a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // p038c6.AbstractC1366a0.e.a.AbstractC7804a
        /* renamed from: f */
        public AbstractC1366a0.e.a.AbstractC7804a mo6252f(String str) {
            this.f5304d = str;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.a.AbstractC7804a
        /* renamed from: g */
        public AbstractC1366a0.e.a.AbstractC7804a mo6253g(String str) {
            if (str != null) {
                this.f5302b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // p038c6.AbstractC1366a0.e.a
    /* renamed from: b */
    public String mo6240b() {
        return this.f5299e;
    }

    @Override // p038c6.AbstractC1366a0.e.a
    /* renamed from: c */
    public String mo6241c() {
        return this.f5300f;
    }

    @Override // p038c6.AbstractC1366a0.e.a
    /* renamed from: d */
    public String mo6242d() {
        return this.f5297c;
    }

    @Override // p038c6.AbstractC1366a0.e.a
    /* renamed from: e */
    public String mo6243e() {
        return this.f5295a;
    }

    public boolean equals(Object obj) {
        String str = null;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.a)) {
            return false;
        }
        AbstractC1366a0.e.a aVar = (AbstractC1366a0.e.a) obj;
        if (this.f5295a.equals(aVar.mo6243e()) && this.f5296b.equals(aVar.mo6246h()) && ((str = this.f5297c) != null ? str.equals(aVar.mo6242d()) : aVar.mo6242d() == null)) {
            aVar.mo6245g();
            String str2 = this.f5298d;
            if (str2 != null ? str2.equals(aVar.mo6244f()) : aVar.mo6244f() == null) {
                String str3 = this.f5299e;
                if (str3 != null ? str3.equals(aVar.mo6240b()) : aVar.mo6240b() == null) {
                    String str4 = this.f5300f;
                    if (str4 == null) {
                        if (aVar.mo6241c() == null) {
                            return true;
                        }
                    } else if (str4.equals(aVar.mo6241c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p038c6.AbstractC1366a0.e.a
    /* renamed from: f */
    public String mo6244f() {
        return this.f5298d;
    }

    @Override // p038c6.AbstractC1366a0.e.a
    /* renamed from: g */
    public AbstractC1366a0.e.a.b mo6245g() {
        return null;
    }

    @Override // p038c6.AbstractC1366a0.e.a
    /* renamed from: h */
    public String mo6246h() {
        return this.f5296b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f5295a.hashCode() ^ 1000003) * 1000003) ^ this.f5296b.hashCode()) * 1000003;
        String str = this.f5297c;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (((hashCode4 ^ hashCode) * 1000003) ^ 0) * 1000003;
        String str2 = this.f5298d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.f5299e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str4 = this.f5300f;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 ^ i10;
    }

    public String toString() {
        return "Application{identifier=" + this.f5295a + ", version=" + this.f5296b + ", displayVersion=" + this.f5297c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f5298d + ", developmentPlatform=" + this.f5299e + ", developmentPlatformVersion=" + this.f5300f + "}";
    }

    private C1375h(String str, String str2, String str3, AbstractC1366a0.e.a.b bVar, String str4, String str5, String str6) {
        this.f5295a = str;
        this.f5296b = str2;
        this.f5297c = str3;
        this.f5298d = str4;
        this.f5299e = str5;
        this.f5300f = str6;
    }
}
