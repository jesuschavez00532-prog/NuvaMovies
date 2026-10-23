package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.g */
/* loaded from: classes.dex */
final class C1374g extends AbstractC1366a0.e {

    /* renamed from: a */
    private final String f5273a;

    /* renamed from: b */
    private final String f5274b;

    /* renamed from: c */
    private final long f5275c;

    /* renamed from: d */
    private final Long f5276d;

    /* renamed from: e */
    private final boolean f5277e;

    /* renamed from: f */
    private final AbstractC1366a0.e.a f5278f;

    /* renamed from: g */
    private final AbstractC1366a0.e.f f5279g;

    /* renamed from: h */
    private final AbstractC1366a0.e.AbstractC7817e f5280h;

    /* renamed from: i */
    private final AbstractC1366a0.e.c f5281i;

    /* renamed from: j */
    private final C1368b0 f5282j;

    /* renamed from: k */
    private final int f5283k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.g$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.b {

        /* renamed from: a */
        private String f5284a;

        /* renamed from: b */
        private String f5285b;

        /* renamed from: c */
        private Long f5286c;

        /* renamed from: d */
        private Long f5287d;

        /* renamed from: e */
        private Boolean f5288e;

        /* renamed from: f */
        private AbstractC1366a0.e.a f5289f;

        /* renamed from: g */
        private AbstractC1366a0.e.f f5290g;

        /* renamed from: h */
        private AbstractC1366a0.e.AbstractC7817e f5291h;

        /* renamed from: i */
        private AbstractC1366a0.e.c f5292i;

        /* renamed from: j */
        private C1368b0 f5293j;

        /* renamed from: k */
        private Integer f5294k;

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: a */
        public AbstractC1366a0.e mo6254a() {
            String str = "";
            if (this.f5284a == null) {
                str = " generator";
            }
            if (this.f5285b == null) {
                str = str + " identifier";
            }
            if (this.f5286c == null) {
                str = str + " startedAt";
            }
            if (this.f5288e == null) {
                str = str + " crashed";
            }
            if (this.f5289f == null) {
                str = str + " app";
            }
            if (this.f5294k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C1374g(this.f5284a, this.f5285b, this.f5286c.longValue(), this.f5287d, this.f5288e.booleanValue(), this.f5289f, this.f5290g, this.f5291h, this.f5292i, this.f5293j, this.f5294k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: b */
        public AbstractC1366a0.e.b mo6255b(AbstractC1366a0.e.a aVar) {
            if (aVar != null) {
                this.f5289f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: c */
        public AbstractC1366a0.e.b mo6256c(boolean z10) {
            this.f5288e = Boolean.valueOf(z10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: d */
        public AbstractC1366a0.e.b mo6257d(AbstractC1366a0.e.c cVar) {
            this.f5292i = cVar;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: e */
        public AbstractC1366a0.e.b mo6258e(Long l10) {
            this.f5287d = l10;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: f */
        public AbstractC1366a0.e.b mo6259f(C1368b0 c1368b0) {
            this.f5293j = c1368b0;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: g */
        public AbstractC1366a0.e.b mo6260g(String str) {
            if (str != null) {
                this.f5284a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: h */
        public AbstractC1366a0.e.b mo6261h(int i10) {
            this.f5294k = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: i */
        public AbstractC1366a0.e.b mo6262i(String str) {
            if (str != null) {
                this.f5285b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: k */
        public AbstractC1366a0.e.b mo6264k(AbstractC1366a0.e.AbstractC7817e abstractC7817e) {
            this.f5291h = abstractC7817e;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: l */
        public AbstractC1366a0.e.b mo6265l(long j10) {
            this.f5286c = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.b
        /* renamed from: m */
        public AbstractC1366a0.e.b mo6266m(AbstractC1366a0.e.f fVar) {
            this.f5290g = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC1366a0.e eVar) {
            this.f5284a = eVar.mo6228f();
            this.f5285b = eVar.mo6230h();
            this.f5286c = Long.valueOf(eVar.mo6233k());
            this.f5287d = eVar.mo6226d();
            this.f5288e = Boolean.valueOf(eVar.mo6235m());
            this.f5289f = eVar.mo6224b();
            this.f5290g = eVar.mo6234l();
            this.f5291h = eVar.mo6232j();
            this.f5292i = eVar.mo6225c();
            this.f5293j = eVar.mo6227e();
            this.f5294k = Integer.valueOf(eVar.mo6229g());
        }
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: b */
    public AbstractC1366a0.e.a mo6224b() {
        return this.f5278f;
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: c */
    public AbstractC1366a0.e.c mo6225c() {
        return this.f5281i;
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: d */
    public Long mo6226d() {
        return this.f5276d;
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: e */
    public C1368b0 mo6227e() {
        return this.f5282j;
    }

    public boolean equals(Object obj) {
        Long l10;
        AbstractC1366a0.e.f fVar;
        AbstractC1366a0.e.AbstractC7817e abstractC7817e;
        AbstractC1366a0.e.c cVar;
        C1368b0 c1368b0;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e)) {
            return false;
        }
        AbstractC1366a0.e eVar = (AbstractC1366a0.e) obj;
        if (this.f5273a.equals(eVar.mo6228f()) && this.f5274b.equals(eVar.mo6230h()) && this.f5275c == eVar.mo6233k() && ((l10 = this.f5276d) != null ? l10.equals(eVar.mo6226d()) : eVar.mo6226d() == null) && this.f5277e == eVar.mo6235m() && this.f5278f.equals(eVar.mo6224b()) && ((fVar = this.f5279g) != null ? fVar.equals(eVar.mo6234l()) : eVar.mo6234l() == null) && ((abstractC7817e = this.f5280h) != null ? abstractC7817e.equals(eVar.mo6232j()) : eVar.mo6232j() == null) && ((cVar = this.f5281i) != null ? cVar.equals(eVar.mo6225c()) : eVar.mo6225c() == null) && ((c1368b0 = this.f5282j) != null ? c1368b0.equals(eVar.mo6227e()) : eVar.mo6227e() == null) && this.f5283k == eVar.mo6229g()) {
            return true;
        }
        return false;
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: f */
    public String mo6228f() {
        return this.f5273a;
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: g */
    public int mo6229g() {
        return this.f5283k;
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: h */
    public String mo6230h() {
        return this.f5274b;
    }

    public int hashCode() {
        int hashCode;
        int i10 = 0;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.f5273a.hashCode() ^ 1000003) * 1000003) ^ this.f5274b.hashCode()) * 1000003;
        long j10 = this.f5275c;
        int i11 = (hashCode5 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f5276d;
        int i12 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i13 = (i11 ^ hashCode) * 1000003;
        if (this.f5277e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode6 = (((i13 ^ i10) * 1000003) ^ this.f5278f.hashCode()) * 1000003;
        AbstractC1366a0.e.f fVar = this.f5279g;
        if (fVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fVar.hashCode();
        }
        int i14 = (hashCode6 ^ hashCode2) * 1000003;
        AbstractC1366a0.e.AbstractC7817e abstractC7817e = this.f5280h;
        if (abstractC7817e == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = abstractC7817e.hashCode();
        }
        int i15 = (i14 ^ hashCode3) * 1000003;
        AbstractC1366a0.e.c cVar = this.f5281i;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int i16 = (i15 ^ hashCode4) * 1000003;
        C1368b0 c1368b0 = this.f5282j;
        if (c1368b0 != null) {
            i12 = c1368b0.hashCode();
        }
        return ((i16 ^ i12) * 1000003) ^ this.f5283k;
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: j */
    public AbstractC1366a0.e.AbstractC7817e mo6232j() {
        return this.f5280h;
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: k */
    public long mo6233k() {
        return this.f5275c;
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: l */
    public AbstractC1366a0.e.f mo6234l() {
        return this.f5279g;
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: m */
    public boolean mo6235m() {
        return this.f5277e;
    }

    @Override // p038c6.AbstractC1366a0.e
    /* renamed from: n */
    public AbstractC1366a0.e.b mo6236n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f5273a + ", identifier=" + this.f5274b + ", startedAt=" + this.f5275c + ", endedAt=" + this.f5276d + ", crashed=" + this.f5277e + ", app=" + this.f5278f + ", user=" + this.f5279g + ", os=" + this.f5280h + ", device=" + this.f5281i + ", events=" + this.f5282j + ", generatorType=" + this.f5283k + "}";
    }

    private C1374g(String str, String str2, long j10, Long l10, boolean z10, AbstractC1366a0.e.a aVar, AbstractC1366a0.e.f fVar, AbstractC1366a0.e.AbstractC7817e abstractC7817e, AbstractC1366a0.e.c cVar, C1368b0 c1368b0, int i10) {
        this.f5273a = str;
        this.f5274b = str2;
        this.f5275c = j10;
        this.f5276d = l10;
        this.f5277e = z10;
        this.f5278f = aVar;
        this.f5279g = fVar;
        this.f5280h = abstractC7817e;
        this.f5281i = cVar;
        this.f5282j = c1368b0;
        this.f5283k = i10;
    }
}
