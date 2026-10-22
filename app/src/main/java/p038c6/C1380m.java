package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.m */
/* loaded from: classes.dex */
final class C1380m extends AbstractC1366a0.e.d.a.b {

    /* renamed from: a */
    private final C1368b0 f5345a;

    /* renamed from: b */
    private final AbstractC1366a0.e.d.a.b.c f5346b;

    /* renamed from: c */
    private final AbstractC1366a0.a f5347c;

    /* renamed from: d */
    private final AbstractC1366a0.e.d.a.b.AbstractC7810d f5348d;

    /* renamed from: e */
    private final C1368b0 f5349e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.m$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.d.a.b.AbstractC7808b {

        /* renamed from: a */
        private C1368b0 f5350a;

        /* renamed from: b */
        private AbstractC1366a0.e.d.a.b.c f5351b;

        /* renamed from: c */
        private AbstractC1366a0.a f5352c;

        /* renamed from: d */
        private AbstractC1366a0.e.d.a.b.AbstractC7810d f5353d;

        /* renamed from: e */
        private C1368b0 f5354e;

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7808b
        /* renamed from: a */
        public AbstractC1366a0.e.d.a.b mo6325a() {
            String str = "";
            if (this.f5353d == null) {
                str = " signal";
            }
            if (this.f5354e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C1380m(this.f5350a, this.f5351b, this.f5352c, this.f5353d, this.f5354e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7808b
        /* renamed from: b */
        public AbstractC1366a0.e.d.a.b.AbstractC7808b mo6326b(AbstractC1366a0.a aVar) {
            this.f5352c = aVar;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7808b
        /* renamed from: c */
        public AbstractC1366a0.e.d.a.b.AbstractC7808b mo6327c(C1368b0 c1368b0) {
            if (c1368b0 != null) {
                this.f5354e = c1368b0;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7808b
        /* renamed from: d */
        public AbstractC1366a0.e.d.a.b.AbstractC7808b mo6328d(AbstractC1366a0.e.d.a.b.c cVar) {
            this.f5351b = cVar;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7808b
        /* renamed from: e */
        public AbstractC1366a0.e.d.a.b.AbstractC7808b mo6329e(AbstractC1366a0.e.d.a.b.AbstractC7810d abstractC7810d) {
            if (abstractC7810d != null) {
                this.f5353d = abstractC7810d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7808b
        /* renamed from: f */
        public AbstractC1366a0.e.d.a.b.AbstractC7808b mo6330f(C1368b0 c1368b0) {
            this.f5350a = c1368b0;
            return this;
        }
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b
    /* renamed from: b */
    public AbstractC1366a0.a mo6308b() {
        return this.f5347c;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b
    /* renamed from: c */
    public C1368b0 mo6309c() {
        return this.f5349e;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b
    /* renamed from: d */
    public AbstractC1366a0.e.d.a.b.c mo6310d() {
        return this.f5346b;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b
    /* renamed from: e */
    public AbstractC1366a0.e.d.a.b.AbstractC7810d mo6311e() {
        return this.f5348d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.d.a.b)) {
            return false;
        }
        AbstractC1366a0.e.d.a.b bVar = (AbstractC1366a0.e.d.a.b) obj;
        C1368b0 c1368b0 = this.f5345a;
        if (c1368b0 != null ? c1368b0.equals(bVar.mo6312f()) : bVar.mo6312f() == null) {
            AbstractC1366a0.e.d.a.b.c cVar = this.f5346b;
            if (cVar != null ? cVar.equals(bVar.mo6310d()) : bVar.mo6310d() == null) {
                AbstractC1366a0.a aVar = this.f5347c;
                if (aVar != null ? aVar.equals(bVar.mo6308b()) : bVar.mo6308b() == null) {
                    if (this.f5348d.equals(bVar.mo6311e()) && this.f5349e.equals(bVar.mo6309c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b
    /* renamed from: f */
    public C1368b0 mo6312f() {
        return this.f5345a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        C1368b0 c1368b0 = this.f5345a;
        int i10 = 0;
        if (c1368b0 == null) {
            hashCode = 0;
        } else {
            hashCode = c1368b0.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        AbstractC1366a0.e.d.a.b.c cVar = this.f5346b;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        AbstractC1366a0.a aVar = this.f5347c;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return ((((i12 ^ i10) * 1000003) ^ this.f5348d.hashCode()) * 1000003) ^ this.f5349e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f5345a + ", exception=" + this.f5346b + ", appExitInfo=" + this.f5347c + ", signal=" + this.f5348d + ", binaries=" + this.f5349e + "}";
    }

    private C1380m(C1368b0 c1368b0, AbstractC1366a0.e.d.a.b.c cVar, AbstractC1366a0.a aVar, AbstractC1366a0.e.d.a.b.AbstractC7810d abstractC7810d, C1368b0 c1368b02) {
        this.f5345a = c1368b0;
        this.f5346b = cVar;
        this.f5347c = aVar;
        this.f5348d = abstractC7810d;
        this.f5349e = c1368b02;
    }
}
