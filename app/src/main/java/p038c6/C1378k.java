package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.k */
/* loaded from: classes.dex */
final class C1378k extends AbstractC1366a0.e.d {

    /* renamed from: a */
    private final long f5325a;

    /* renamed from: b */
    private final String f5326b;

    /* renamed from: c */
    private final AbstractC1366a0.e.d.a f5327c;

    /* renamed from: d */
    private final AbstractC1366a0.e.d.c f5328d;

    /* renamed from: e */
    private final AbstractC1366a0.e.d.AbstractC7816d f5329e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.k$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.d.b {

        /* renamed from: a */
        private Long f5330a;

        /* renamed from: b */
        private String f5331b;

        /* renamed from: c */
        private AbstractC1366a0.e.d.a f5332c;

        /* renamed from: d */
        private AbstractC1366a0.e.d.c f5333d;

        /* renamed from: e */
        private AbstractC1366a0.e.d.AbstractC7816d f5334e;

        @Override // p038c6.AbstractC1366a0.e.d.b
        /* renamed from: a */
        public AbstractC1366a0.e.d mo6371a() {
            String str = "";
            if (this.f5330a == null) {
                str = " timestamp";
            }
            if (this.f5331b == null) {
                str = str + " type";
            }
            if (this.f5332c == null) {
                str = str + " app";
            }
            if (this.f5333d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C1378k(this.f5330a.longValue(), this.f5331b, this.f5332c, this.f5333d, this.f5334e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.d.b
        /* renamed from: b */
        public AbstractC1366a0.e.d.b mo6372b(AbstractC1366a0.e.d.a aVar) {
            if (aVar != null) {
                this.f5332c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // p038c6.AbstractC1366a0.e.d.b
        /* renamed from: c */
        public AbstractC1366a0.e.d.b mo6373c(AbstractC1366a0.e.d.c cVar) {
            if (cVar != null) {
                this.f5333d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // p038c6.AbstractC1366a0.e.d.b
        /* renamed from: d */
        public AbstractC1366a0.e.d.b mo6374d(AbstractC1366a0.e.d.AbstractC7816d abstractC7816d) {
            this.f5334e = abstractC7816d;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.b
        /* renamed from: e */
        public AbstractC1366a0.e.d.b mo6375e(long j10) {
            this.f5330a = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.b
        /* renamed from: f */
        public AbstractC1366a0.e.d.b mo6376f(String str) {
            if (str != null) {
                this.f5331b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC1366a0.e.d dVar) {
            this.f5330a = Long.valueOf(dVar.mo6291e());
            this.f5331b = dVar.mo6292f();
            this.f5332c = dVar.mo6288b();
            this.f5333d = dVar.mo6289c();
            this.f5334e = dVar.mo6290d();
        }
    }

    @Override // p038c6.AbstractC1366a0.e.d
    /* renamed from: b */
    public AbstractC1366a0.e.d.a mo6288b() {
        return this.f5327c;
    }

    @Override // p038c6.AbstractC1366a0.e.d
    /* renamed from: c */
    public AbstractC1366a0.e.d.c mo6289c() {
        return this.f5328d;
    }

    @Override // p038c6.AbstractC1366a0.e.d
    /* renamed from: d */
    public AbstractC1366a0.e.d.AbstractC7816d mo6290d() {
        return this.f5329e;
    }

    @Override // p038c6.AbstractC1366a0.e.d
    /* renamed from: e */
    public long mo6291e() {
        return this.f5325a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.d)) {
            return false;
        }
        AbstractC1366a0.e.d dVar = (AbstractC1366a0.e.d) obj;
        if (this.f5325a == dVar.mo6291e() && this.f5326b.equals(dVar.mo6292f()) && this.f5327c.equals(dVar.mo6288b()) && this.f5328d.equals(dVar.mo6289c())) {
            AbstractC1366a0.e.d.AbstractC7816d abstractC7816d = this.f5329e;
            if (abstractC7816d == null) {
                if (dVar.mo6290d() == null) {
                    return true;
                }
            } else if (abstractC7816d.equals(dVar.mo6290d())) {
                return true;
            }
        }
        return false;
    }

    @Override // p038c6.AbstractC1366a0.e.d
    /* renamed from: f */
    public String mo6292f() {
        return this.f5326b;
    }

    @Override // p038c6.AbstractC1366a0.e.d
    /* renamed from: g */
    public AbstractC1366a0.e.d.b mo6293g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        long j10 = this.f5325a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f5326b.hashCode()) * 1000003) ^ this.f5327c.hashCode()) * 1000003) ^ this.f5328d.hashCode()) * 1000003;
        AbstractC1366a0.e.d.AbstractC7816d abstractC7816d = this.f5329e;
        if (abstractC7816d == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC7816d.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "Event{timestamp=" + this.f5325a + ", type=" + this.f5326b + ", app=" + this.f5327c + ", device=" + this.f5328d + ", log=" + this.f5329e + "}";
    }

    private C1378k(long j10, String str, AbstractC1366a0.e.d.a aVar, AbstractC1366a0.e.d.c cVar, AbstractC1366a0.e.d.AbstractC7816d abstractC7816d) {
        this.f5325a = j10;
        this.f5326b = str;
        this.f5327c = aVar;
        this.f5328d = cVar;
        this.f5329e = abstractC7816d;
    }
}
