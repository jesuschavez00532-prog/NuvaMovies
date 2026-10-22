package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.p */
/* loaded from: classes.dex */
final class C1383p extends AbstractC1366a0.e.d.a.b.AbstractC7810d {

    /* renamed from: a */
    private final String f5373a;

    /* renamed from: b */
    private final String f5374b;

    /* renamed from: c */
    private final long f5375c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.p$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.d.a.b.AbstractC7810d.AbstractC7811a {

        /* renamed from: a */
        private String f5376a;

        /* renamed from: b */
        private String f5377b;

        /* renamed from: c */
        private Long f5378c;

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7810d.AbstractC7811a
        /* renamed from: a */
        public AbstractC1366a0.e.d.a.b.AbstractC7810d mo6347a() {
            String str = "";
            if (this.f5376a == null) {
                str = " name";
            }
            if (this.f5377b == null) {
                str = str + " code";
            }
            if (this.f5378c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C1383p(this.f5376a, this.f5377b, this.f5378c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7810d.AbstractC7811a
        /* renamed from: b */
        public AbstractC1366a0.e.d.a.b.AbstractC7810d.AbstractC7811a mo6348b(long j10) {
            this.f5378c = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7810d.AbstractC7811a
        /* renamed from: c */
        public AbstractC1366a0.e.d.a.b.AbstractC7810d.AbstractC7811a mo6349c(String str) {
            if (str != null) {
                this.f5377b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7810d.AbstractC7811a
        /* renamed from: d */
        public AbstractC1366a0.e.d.a.b.AbstractC7810d.AbstractC7811a mo6350d(String str) {
            if (str != null) {
                this.f5376a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7810d
    /* renamed from: b */
    public long mo6344b() {
        return this.f5375c;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7810d
    /* renamed from: c */
    public String mo6345c() {
        return this.f5374b;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7810d
    /* renamed from: d */
    public String mo6346d() {
        return this.f5373a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.d.a.b.AbstractC7810d)) {
            return false;
        }
        AbstractC1366a0.e.d.a.b.AbstractC7810d abstractC7810d = (AbstractC1366a0.e.d.a.b.AbstractC7810d) obj;
        if (this.f5373a.equals(abstractC7810d.mo6346d()) && this.f5374b.equals(abstractC7810d.mo6345c()) && this.f5375c == abstractC7810d.mo6344b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f5373a.hashCode() ^ 1000003) * 1000003) ^ this.f5374b.hashCode()) * 1000003;
        long j10 = this.f5375c;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f5373a + ", code=" + this.f5374b + ", address=" + this.f5375c + "}";
    }

    private C1383p(String str, String str2, long j10) {
        this.f5373a = str;
        this.f5374b = str2;
        this.f5375c = j10;
    }
}
