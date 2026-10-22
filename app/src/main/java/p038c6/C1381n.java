package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.n */
/* loaded from: classes.dex */
final class C1381n extends AbstractC1366a0.e.d.a.b.AbstractC7806a {

    /* renamed from: a */
    private final long f5355a;

    /* renamed from: b */
    private final long f5356b;

    /* renamed from: c */
    private final String f5357c;

    /* renamed from: d */
    private final String f5358d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.n$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.d.a.b.AbstractC7806a.AbstractC7807a {

        /* renamed from: a */
        private Long f5359a;

        /* renamed from: b */
        private Long f5360b;

        /* renamed from: c */
        private String f5361c;

        /* renamed from: d */
        private String f5362d;

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7806a.AbstractC7807a
        /* renamed from: a */
        public AbstractC1366a0.e.d.a.b.AbstractC7806a mo6319a() {
            String str = "";
            if (this.f5359a == null) {
                str = " baseAddress";
            }
            if (this.f5360b == null) {
                str = str + " size";
            }
            if (this.f5361c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C1381n(this.f5359a.longValue(), this.f5360b.longValue(), this.f5361c, this.f5362d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7806a.AbstractC7807a
        /* renamed from: b */
        public AbstractC1366a0.e.d.a.b.AbstractC7806a.AbstractC7807a mo6320b(long j10) {
            this.f5359a = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7806a.AbstractC7807a
        /* renamed from: c */
        public AbstractC1366a0.e.d.a.b.AbstractC7806a.AbstractC7807a mo6321c(String str) {
            if (str != null) {
                this.f5361c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7806a.AbstractC7807a
        /* renamed from: d */
        public AbstractC1366a0.e.d.a.b.AbstractC7806a.AbstractC7807a mo6322d(long j10) {
            this.f5360b = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7806a.AbstractC7807a
        /* renamed from: e */
        public AbstractC1366a0.e.d.a.b.AbstractC7806a.AbstractC7807a mo6323e(String str) {
            this.f5362d = str;
            return this;
        }
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7806a
    /* renamed from: b */
    public long mo6314b() {
        return this.f5355a;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7806a
    /* renamed from: c */
    public String mo6315c() {
        return this.f5357c;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7806a
    /* renamed from: d */
    public long mo6316d() {
        return this.f5356b;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.AbstractC7806a
    /* renamed from: e */
    public String mo6317e() {
        return this.f5358d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.d.a.b.AbstractC7806a)) {
            return false;
        }
        AbstractC1366a0.e.d.a.b.AbstractC7806a abstractC7806a = (AbstractC1366a0.e.d.a.b.AbstractC7806a) obj;
        if (this.f5355a == abstractC7806a.mo6314b() && this.f5356b == abstractC7806a.mo6316d() && this.f5357c.equals(abstractC7806a.mo6315c())) {
            String str = this.f5358d;
            if (str == null) {
                if (abstractC7806a.mo6317e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC7806a.mo6317e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j10 = this.f5355a;
        long j11 = this.f5356b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f5357c.hashCode()) * 1000003;
        String str = this.f5358d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f5355a + ", size=" + this.f5356b + ", name=" + this.f5357c + ", uuid=" + this.f5358d + "}";
    }

    private C1381n(long j10, long j11, String str, String str2) {
        this.f5355a = j10;
        this.f5356b = j11;
        this.f5357c = str;
        this.f5358d = str2;
    }
}
