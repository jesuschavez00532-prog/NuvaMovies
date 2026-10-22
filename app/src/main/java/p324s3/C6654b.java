package p324s3;

import java.util.Map;
import p324s3.AbstractC6661i;

/* renamed from: s3.b */
/* loaded from: classes.dex */
final class C6654b extends AbstractC6661i {

    /* renamed from: a */
    private final String f25530a;

    /* renamed from: b */
    private final Integer f25531b;

    /* renamed from: c */
    private final C6660h f25532c;

    /* renamed from: d */
    private final long f25533d;

    /* renamed from: e */
    private final long f25534e;

    /* renamed from: f */
    private final Map f25535f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s3.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC6661i.a {

        /* renamed from: a */
        private String f25536a;

        /* renamed from: b */
        private Integer f25537b;

        /* renamed from: c */
        private C6660h f25538c;

        /* renamed from: d */
        private Long f25539d;

        /* renamed from: e */
        private Long f25540e;

        /* renamed from: f */
        private Map f25541f;

        @Override // p324s3.AbstractC6661i.a
        /* renamed from: d */
        public AbstractC6661i mo25985d() {
            String str = "";
            if (this.f25536a == null) {
                str = " transportName";
            }
            if (this.f25538c == null) {
                str = str + " encodedPayload";
            }
            if (this.f25539d == null) {
                str = str + " eventMillis";
            }
            if (this.f25540e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f25541f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C6654b(this.f25536a, this.f25537b, this.f25538c, this.f25539d.longValue(), this.f25540e.longValue(), this.f25541f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p324s3.AbstractC6661i.a
        /* renamed from: e */
        protected Map mo25986e() {
            Map map = this.f25541f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p324s3.AbstractC6661i.a
        /* renamed from: f */
        public AbstractC6661i.a mo25987f(Map map) {
            if (map != null) {
                this.f25541f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // p324s3.AbstractC6661i.a
        /* renamed from: g */
        public AbstractC6661i.a mo25988g(Integer num) {
            this.f25537b = num;
            return this;
        }

        @Override // p324s3.AbstractC6661i.a
        /* renamed from: h */
        public AbstractC6661i.a mo25989h(C6660h c6660h) {
            if (c6660h != null) {
                this.f25538c = c6660h;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // p324s3.AbstractC6661i.a
        /* renamed from: i */
        public AbstractC6661i.a mo25990i(long j10) {
            this.f25539d = Long.valueOf(j10);
            return this;
        }

        @Override // p324s3.AbstractC6661i.a
        /* renamed from: j */
        public AbstractC6661i.a mo25991j(String str) {
            if (str != null) {
                this.f25536a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // p324s3.AbstractC6661i.a
        /* renamed from: k */
        public AbstractC6661i.a mo25992k(long j10) {
            this.f25540e = Long.valueOf(j10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p324s3.AbstractC6661i
    /* renamed from: c */
    public Map mo25979c() {
        return this.f25535f;
    }

    @Override // p324s3.AbstractC6661i
    /* renamed from: d */
    public Integer mo25980d() {
        return this.f25531b;
    }

    @Override // p324s3.AbstractC6661i
    /* renamed from: e */
    public C6660h mo25981e() {
        return this.f25532c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6661i)) {
            return false;
        }
        AbstractC6661i abstractC6661i = (AbstractC6661i) obj;
        if (this.f25530a.equals(abstractC6661i.mo25983j()) && ((num = this.f25531b) != null ? num.equals(abstractC6661i.mo25980d()) : abstractC6661i.mo25980d() == null) && this.f25532c.equals(abstractC6661i.mo25981e()) && this.f25533d == abstractC6661i.mo25982f() && this.f25534e == abstractC6661i.mo25984k() && this.f25535f.equals(abstractC6661i.mo25979c())) {
            return true;
        }
        return false;
    }

    @Override // p324s3.AbstractC6661i
    /* renamed from: f */
    public long mo25982f() {
        return this.f25533d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f25530a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f25531b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f25532c.hashCode()) * 1000003;
        long j10 = this.f25533d;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f25534e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f25535f.hashCode();
    }

    @Override // p324s3.AbstractC6661i
    /* renamed from: j */
    public String mo25983j() {
        return this.f25530a;
    }

    @Override // p324s3.AbstractC6661i
    /* renamed from: k */
    public long mo25984k() {
        return this.f25534e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f25530a + ", code=" + this.f25531b + ", encodedPayload=" + this.f25532c + ", eventMillis=" + this.f25533d + ", uptimeMillis=" + this.f25534e + ", autoMetadata=" + this.f25535f + "}";
    }

    private C6654b(String str, Integer num, C6660h c6660h, long j10, long j11, Map map) {
        this.f25530a = str;
        this.f25531b = num;
        this.f25532c = c6660h;
        this.f25533d = j10;
        this.f25534e = j11;
        this.f25535f = map;
    }
}
