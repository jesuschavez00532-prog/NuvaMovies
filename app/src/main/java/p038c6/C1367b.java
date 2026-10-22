package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.b */
/* loaded from: classes.dex */
final class C1367b extends AbstractC1366a0 {

    /* renamed from: b */
    private final String f5228b;

    /* renamed from: c */
    private final String f5229c;

    /* renamed from: d */
    private final int f5230d;

    /* renamed from: e */
    private final String f5231e;

    /* renamed from: f */
    private final String f5232f;

    /* renamed from: g */
    private final String f5233g;

    /* renamed from: h */
    private final AbstractC1366a0.e f5234h;

    /* renamed from: i */
    private final AbstractC1366a0.d f5235i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.b {

        /* renamed from: a */
        private String f5236a;

        /* renamed from: b */
        private String f5237b;

        /* renamed from: c */
        private Integer f5238c;

        /* renamed from: d */
        private String f5239d;

        /* renamed from: e */
        private String f5240e;

        /* renamed from: f */
        private String f5241f;

        /* renamed from: g */
        private AbstractC1366a0.e f5242g;

        /* renamed from: h */
        private AbstractC1366a0.d f5243h;

        @Override // p038c6.AbstractC1366a0.b
        /* renamed from: a */
        public AbstractC1366a0 mo6196a() {
            String str = "";
            if (this.f5236a == null) {
                str = " sdkVersion";
            }
            if (this.f5237b == null) {
                str = str + " gmpAppId";
            }
            if (this.f5238c == null) {
                str = str + " platform";
            }
            if (this.f5239d == null) {
                str = str + " installationUuid";
            }
            if (this.f5240e == null) {
                str = str + " buildVersion";
            }
            if (this.f5241f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C1367b(this.f5236a, this.f5237b, this.f5238c.intValue(), this.f5239d, this.f5240e, this.f5241f, this.f5242g, this.f5243h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.b
        /* renamed from: b */
        public AbstractC1366a0.b mo6197b(String str) {
            if (str != null) {
                this.f5240e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // p038c6.AbstractC1366a0.b
        /* renamed from: c */
        public AbstractC1366a0.b mo6198c(String str) {
            if (str != null) {
                this.f5241f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // p038c6.AbstractC1366a0.b
        /* renamed from: d */
        public AbstractC1366a0.b mo6199d(String str) {
            if (str != null) {
                this.f5237b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // p038c6.AbstractC1366a0.b
        /* renamed from: e */
        public AbstractC1366a0.b mo6200e(String str) {
            if (str != null) {
                this.f5239d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // p038c6.AbstractC1366a0.b
        /* renamed from: f */
        public AbstractC1366a0.b mo6201f(AbstractC1366a0.d dVar) {
            this.f5243h = dVar;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.b
        /* renamed from: g */
        public AbstractC1366a0.b mo6202g(int i10) {
            this.f5238c = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.b
        /* renamed from: h */
        public AbstractC1366a0.b mo6203h(String str) {
            if (str != null) {
                this.f5236a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // p038c6.AbstractC1366a0.b
        /* renamed from: i */
        public AbstractC1366a0.b mo6204i(AbstractC1366a0.e eVar) {
            this.f5242g = eVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC1366a0 abstractC1366a0) {
            this.f5236a = abstractC1366a0.mo6172i();
            this.f5237b = abstractC1366a0.mo6168e();
            this.f5238c = Integer.valueOf(abstractC1366a0.mo6171h());
            this.f5239d = abstractC1366a0.mo6169f();
            this.f5240e = abstractC1366a0.mo6166c();
            this.f5241f = abstractC1366a0.mo6167d();
            this.f5242g = abstractC1366a0.mo6173j();
            this.f5243h = abstractC1366a0.mo6170g();
        }
    }

    @Override // p038c6.AbstractC1366a0
    /* renamed from: c */
    public String mo6166c() {
        return this.f5232f;
    }

    @Override // p038c6.AbstractC1366a0
    /* renamed from: d */
    public String mo6167d() {
        return this.f5233g;
    }

    @Override // p038c6.AbstractC1366a0
    /* renamed from: e */
    public String mo6168e() {
        return this.f5229c;
    }

    public boolean equals(Object obj) {
        AbstractC1366a0.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0)) {
            return false;
        }
        AbstractC1366a0 abstractC1366a0 = (AbstractC1366a0) obj;
        if (this.f5228b.equals(abstractC1366a0.mo6172i()) && this.f5229c.equals(abstractC1366a0.mo6168e()) && this.f5230d == abstractC1366a0.mo6171h() && this.f5231e.equals(abstractC1366a0.mo6169f()) && this.f5232f.equals(abstractC1366a0.mo6166c()) && this.f5233g.equals(abstractC1366a0.mo6167d()) && ((eVar = this.f5234h) != null ? eVar.equals(abstractC1366a0.mo6173j()) : abstractC1366a0.mo6173j() == null)) {
            AbstractC1366a0.d dVar = this.f5235i;
            if (dVar == null) {
                if (abstractC1366a0.mo6170g() == null) {
                    return true;
                }
            } else if (dVar.equals(abstractC1366a0.mo6170g())) {
                return true;
            }
        }
        return false;
    }

    @Override // p038c6.AbstractC1366a0
    /* renamed from: f */
    public String mo6169f() {
        return this.f5231e;
    }

    @Override // p038c6.AbstractC1366a0
    /* renamed from: g */
    public AbstractC1366a0.d mo6170g() {
        return this.f5235i;
    }

    @Override // p038c6.AbstractC1366a0
    /* renamed from: h */
    public int mo6171h() {
        return this.f5230d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((((this.f5228b.hashCode() ^ 1000003) * 1000003) ^ this.f5229c.hashCode()) * 1000003) ^ this.f5230d) * 1000003) ^ this.f5231e.hashCode()) * 1000003) ^ this.f5232f.hashCode()) * 1000003) ^ this.f5233g.hashCode()) * 1000003;
        AbstractC1366a0.e eVar = this.f5234h;
        int i10 = 0;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        AbstractC1366a0.d dVar = this.f5235i;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return i11 ^ i10;
    }

    @Override // p038c6.AbstractC1366a0
    /* renamed from: i */
    public String mo6172i() {
        return this.f5228b;
    }

    @Override // p038c6.AbstractC1366a0
    /* renamed from: j */
    public AbstractC1366a0.e mo6173j() {
        return this.f5234h;
    }

    @Override // p038c6.AbstractC1366a0
    /* renamed from: k */
    protected AbstractC1366a0.b mo6174k() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f5228b + ", gmpAppId=" + this.f5229c + ", platform=" + this.f5230d + ", installationUuid=" + this.f5231e + ", buildVersion=" + this.f5232f + ", displayVersion=" + this.f5233g + ", session=" + this.f5234h + ", ndkPayload=" + this.f5235i + "}";
    }

    private C1367b(String str, String str2, int i10, String str3, String str4, String str5, AbstractC1366a0.e eVar, AbstractC1366a0.d dVar) {
        this.f5228b = str;
        this.f5229c = str2;
        this.f5230d = i10;
        this.f5231e = str3;
        this.f5232f = str4;
        this.f5233g = str5;
        this.f5234h = eVar;
        this.f5235i = dVar;
    }
}
