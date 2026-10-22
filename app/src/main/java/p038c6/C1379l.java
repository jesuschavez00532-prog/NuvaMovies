package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.l */
/* loaded from: classes.dex */
final class C1379l extends AbstractC1366a0.e.d.a {

    /* renamed from: a */
    private final AbstractC1366a0.e.d.a.b f5335a;

    /* renamed from: b */
    private final C1368b0 f5336b;

    /* renamed from: c */
    private final C1368b0 f5337c;

    /* renamed from: d */
    private final Boolean f5338d;

    /* renamed from: e */
    private final int f5339e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.l$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.d.a.AbstractC7805a {

        /* renamed from: a */
        private AbstractC1366a0.e.d.a.b f5340a;

        /* renamed from: b */
        private C1368b0 f5341b;

        /* renamed from: c */
        private C1368b0 f5342c;

        /* renamed from: d */
        private Boolean f5343d;

        /* renamed from: e */
        private Integer f5344e;

        @Override // p038c6.AbstractC1366a0.e.d.a.AbstractC7805a
        /* renamed from: a */
        public AbstractC1366a0.e.d.a mo6301a() {
            String str = "";
            if (this.f5340a == null) {
                str = " execution";
            }
            if (this.f5344e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C1379l(this.f5340a, this.f5341b, this.f5342c, this.f5343d, this.f5344e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.AbstractC7805a
        /* renamed from: b */
        public AbstractC1366a0.e.d.a.AbstractC7805a mo6302b(Boolean bool) {
            this.f5343d = bool;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.AbstractC7805a
        /* renamed from: c */
        public AbstractC1366a0.e.d.a.AbstractC7805a mo6303c(C1368b0 c1368b0) {
            this.f5341b = c1368b0;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.AbstractC7805a
        /* renamed from: d */
        public AbstractC1366a0.e.d.a.AbstractC7805a mo6304d(AbstractC1366a0.e.d.a.b bVar) {
            if (bVar != null) {
                this.f5340a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.AbstractC7805a
        /* renamed from: e */
        public AbstractC1366a0.e.d.a.AbstractC7805a mo6305e(C1368b0 c1368b0) {
            this.f5342c = c1368b0;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.AbstractC7805a
        /* renamed from: f */
        public AbstractC1366a0.e.d.a.AbstractC7805a mo6306f(int i10) {
            this.f5344e = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC1366a0.e.d.a aVar) {
            this.f5340a = aVar.mo6297d();
            this.f5341b = aVar.mo6296c();
            this.f5342c = aVar.mo6298e();
            this.f5343d = aVar.mo6295b();
            this.f5344e = Integer.valueOf(aVar.mo6299f());
        }
    }

    @Override // p038c6.AbstractC1366a0.e.d.a
    /* renamed from: b */
    public Boolean mo6295b() {
        return this.f5338d;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a
    /* renamed from: c */
    public C1368b0 mo6296c() {
        return this.f5336b;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a
    /* renamed from: d */
    public AbstractC1366a0.e.d.a.b mo6297d() {
        return this.f5335a;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a
    /* renamed from: e */
    public C1368b0 mo6298e() {
        return this.f5337c;
    }

    public boolean equals(Object obj) {
        C1368b0 c1368b0;
        C1368b0 c1368b02;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.d.a)) {
            return false;
        }
        AbstractC1366a0.e.d.a aVar = (AbstractC1366a0.e.d.a) obj;
        if (this.f5335a.equals(aVar.mo6297d()) && ((c1368b0 = this.f5336b) != null ? c1368b0.equals(aVar.mo6296c()) : aVar.mo6296c() == null) && ((c1368b02 = this.f5337c) != null ? c1368b02.equals(aVar.mo6298e()) : aVar.mo6298e() == null) && ((bool = this.f5338d) != null ? bool.equals(aVar.mo6295b()) : aVar.mo6295b() == null) && this.f5339e == aVar.mo6299f()) {
            return true;
        }
        return false;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a
    /* renamed from: f */
    public int mo6299f() {
        return this.f5339e;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a
    /* renamed from: g */
    public AbstractC1366a0.e.d.a.AbstractC7805a mo6300g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.f5335a.hashCode() ^ 1000003) * 1000003;
        C1368b0 c1368b0 = this.f5336b;
        int i10 = 0;
        if (c1368b0 == null) {
            hashCode = 0;
        } else {
            hashCode = c1368b0.hashCode();
        }
        int i11 = (hashCode3 ^ hashCode) * 1000003;
        C1368b0 c1368b02 = this.f5337c;
        if (c1368b02 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c1368b02.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        Boolean bool = this.f5338d;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return ((i12 ^ i10) * 1000003) ^ this.f5339e;
    }

    public String toString() {
        return "Application{execution=" + this.f5335a + ", customAttributes=" + this.f5336b + ", internalKeys=" + this.f5337c + ", background=" + this.f5338d + ", uiOrientation=" + this.f5339e + "}";
    }

    private C1379l(AbstractC1366a0.e.d.a.b bVar, C1368b0 c1368b0, C1368b0 c1368b02, Boolean bool, int i10) {
        this.f5335a = bVar;
        this.f5336b = c1368b0;
        this.f5337c = c1368b02;
        this.f5338d = bool;
        this.f5339e = i10;
    }
}
