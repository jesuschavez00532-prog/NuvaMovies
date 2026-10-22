package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.q */
/* loaded from: classes.dex */
final class C1384q extends AbstractC1366a0.e.d.a.b.AbstractC7812e {

    /* renamed from: a */
    private final String f5379a;

    /* renamed from: b */
    private final int f5380b;

    /* renamed from: c */
    private final C1368b0 f5381c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.q$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7813a {

        /* renamed from: a */
        private String f5382a;

        /* renamed from: b */
        private Integer f5383b;

        /* renamed from: c */
        private C1368b0 f5384c;

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7813a
        /* renamed from: a */
        public AbstractC1366a0.e.d.a.b.AbstractC7812e mo6355a() {
            String str = "";
            if (this.f5382a == null) {
                str = " name";
            }
            if (this.f5383b == null) {
                str = str + " importance";
            }
            if (this.f5384c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C1384q(this.f5382a, this.f5383b.intValue(), this.f5384c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7813a
        /* renamed from: b */
        public AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7813a mo6356b(C1368b0 c1368b0) {
            if (c1368b0 != null) {
                this.f5384c = c1368b0;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7813a
        /* renamed from: c */
        public AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7813a mo6357c(int i10) {
            this.f5383b = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7813a
        /* renamed from: d */
        public AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7813a mo6358d(String str) {
            if (str != null) {
                this.f5382a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e
    /* renamed from: b */
    public C1368b0 mo6352b() {
        return this.f5381c;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e
    /* renamed from: c */
    public int mo6353c() {
        return this.f5380b;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e
    /* renamed from: d */
    public String mo6354d() {
        return this.f5379a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.d.a.b.AbstractC7812e)) {
            return false;
        }
        AbstractC1366a0.e.d.a.b.AbstractC7812e abstractC7812e = (AbstractC1366a0.e.d.a.b.AbstractC7812e) obj;
        if (this.f5379a.equals(abstractC7812e.mo6354d()) && this.f5380b == abstractC7812e.mo6353c() && this.f5381c.equals(abstractC7812e.mo6352b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5379a.hashCode() ^ 1000003) * 1000003) ^ this.f5380b) * 1000003) ^ this.f5381c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f5379a + ", importance=" + this.f5380b + ", frames=" + this.f5381c + "}";
    }

    private C1384q(String str, int i10, C1368b0 c1368b0) {
        this.f5379a = str;
        this.f5380b = i10;
        this.f5381c = c1368b0;
    }
}
