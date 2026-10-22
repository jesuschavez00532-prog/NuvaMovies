package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.r */
/* loaded from: classes.dex */
final class C1385r extends AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b {

    /* renamed from: a */
    private final long f5385a;

    /* renamed from: b */
    private final String f5386b;

    /* renamed from: c */
    private final String f5387c;

    /* renamed from: d */
    private final long f5388d;

    /* renamed from: e */
    private final int f5389e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.r$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a {

        /* renamed from: a */
        private Long f5390a;

        /* renamed from: b */
        private String f5391b;

        /* renamed from: c */
        private String f5392c;

        /* renamed from: d */
        private Long f5393d;

        /* renamed from: e */
        private Integer f5394e;

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a
        /* renamed from: a */
        public AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b mo6365a() {
            String str = "";
            if (this.f5390a == null) {
                str = " pc";
            }
            if (this.f5391b == null) {
                str = str + " symbol";
            }
            if (this.f5393d == null) {
                str = str + " offset";
            }
            if (this.f5394e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C1385r(this.f5390a.longValue(), this.f5391b, this.f5392c, this.f5393d.longValue(), this.f5394e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a
        /* renamed from: b */
        public AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a mo6366b(String str) {
            this.f5392c = str;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a
        /* renamed from: c */
        public AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a mo6367c(int i10) {
            this.f5394e = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a
        /* renamed from: d */
        public AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a mo6368d(long j10) {
            this.f5393d = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a
        /* renamed from: e */
        public AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a mo6369e(long j10) {
            this.f5390a = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a
        /* renamed from: f */
        public AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b.AbstractC7815a mo6370f(String str) {
            if (str != null) {
                this.f5391b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b
    /* renamed from: b */
    public String mo6360b() {
        return this.f5387c;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b
    /* renamed from: c */
    public int mo6361c() {
        return this.f5389e;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b
    /* renamed from: d */
    public long mo6362d() {
        return this.f5388d;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b
    /* renamed from: e */
    public long mo6363e() {
        return this.f5385a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b)) {
            return false;
        }
        AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b abstractC7814b = (AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b) obj;
        if (this.f5385a == abstractC7814b.mo6363e() && this.f5386b.equals(abstractC7814b.mo6364f()) && ((str = this.f5387c) != null ? str.equals(abstractC7814b.mo6360b()) : abstractC7814b.mo6360b() == null) && this.f5388d == abstractC7814b.mo6362d() && this.f5389e == abstractC7814b.mo6361c()) {
            return true;
        }
        return false;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7812e.AbstractC7814b
    /* renamed from: f */
    public String mo6364f() {
        return this.f5386b;
    }

    public int hashCode() {
        int hashCode;
        long j10 = this.f5385a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f5386b.hashCode()) * 1000003;
        String str = this.f5387c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        long j11 = this.f5388d;
        return this.f5389e ^ ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f5385a + ", symbol=" + this.f5386b + ", file=" + this.f5387c + ", offset=" + this.f5388d + ", importance=" + this.f5389e + "}";
    }

    private C1385r(long j10, String str, String str2, long j11, int i10) {
        this.f5385a = j10;
        this.f5386b = str;
        this.f5387c = str2;
        this.f5388d = j11;
        this.f5389e = i10;
    }
}
