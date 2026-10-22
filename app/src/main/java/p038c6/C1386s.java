package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.s */
/* loaded from: classes.dex */
final class C1386s extends AbstractC1366a0.e.d.c {

    /* renamed from: a */
    private final Double f5395a;

    /* renamed from: b */
    private final int f5396b;

    /* renamed from: c */
    private final boolean f5397c;

    /* renamed from: d */
    private final int f5398d;

    /* renamed from: e */
    private final long f5399e;

    /* renamed from: f */
    private final long f5400f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.s$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.d.c.a {

        /* renamed from: a */
        private Double f5401a;

        /* renamed from: b */
        private Integer f5402b;

        /* renamed from: c */
        private Boolean f5403c;

        /* renamed from: d */
        private Integer f5404d;

        /* renamed from: e */
        private Long f5405e;

        /* renamed from: f */
        private Long f5406f;

        @Override // p038c6.AbstractC1366a0.e.d.c.a
        /* renamed from: a */
        public AbstractC1366a0.e.d.c mo6384a() {
            String str = "";
            if (this.f5402b == null) {
                str = " batteryVelocity";
            }
            if (this.f5403c == null) {
                str = str + " proximityOn";
            }
            if (this.f5404d == null) {
                str = str + " orientation";
            }
            if (this.f5405e == null) {
                str = str + " ramUsed";
            }
            if (this.f5406f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C1386s(this.f5401a, this.f5402b.intValue(), this.f5403c.booleanValue(), this.f5404d.intValue(), this.f5405e.longValue(), this.f5406f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.d.c.a
        /* renamed from: b */
        public AbstractC1366a0.e.d.c.a mo6385b(Double d10) {
            this.f5401a = d10;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.c.a
        /* renamed from: c */
        public AbstractC1366a0.e.d.c.a mo6386c(int i10) {
            this.f5402b = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.c.a
        /* renamed from: d */
        public AbstractC1366a0.e.d.c.a mo6387d(long j10) {
            this.f5406f = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.c.a
        /* renamed from: e */
        public AbstractC1366a0.e.d.c.a mo6388e(int i10) {
            this.f5404d = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.c.a
        /* renamed from: f */
        public AbstractC1366a0.e.d.c.a mo6389f(boolean z10) {
            this.f5403c = Boolean.valueOf(z10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.c.a
        /* renamed from: g */
        public AbstractC1366a0.e.d.c.a mo6390g(long j10) {
            this.f5405e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p038c6.AbstractC1366a0.e.d.c
    /* renamed from: b */
    public Double mo6378b() {
        return this.f5395a;
    }

    @Override // p038c6.AbstractC1366a0.e.d.c
    /* renamed from: c */
    public int mo6379c() {
        return this.f5396b;
    }

    @Override // p038c6.AbstractC1366a0.e.d.c
    /* renamed from: d */
    public long mo6380d() {
        return this.f5400f;
    }

    @Override // p038c6.AbstractC1366a0.e.d.c
    /* renamed from: e */
    public int mo6381e() {
        return this.f5398d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.d.c)) {
            return false;
        }
        AbstractC1366a0.e.d.c cVar = (AbstractC1366a0.e.d.c) obj;
        Double d10 = this.f5395a;
        if (d10 != null ? d10.equals(cVar.mo6378b()) : cVar.mo6378b() == null) {
            if (this.f5396b == cVar.mo6379c() && this.f5397c == cVar.mo6383g() && this.f5398d == cVar.mo6381e() && this.f5399e == cVar.mo6382f() && this.f5400f == cVar.mo6380d()) {
                return true;
            }
        }
        return false;
    }

    @Override // p038c6.AbstractC1366a0.e.d.c
    /* renamed from: f */
    public long mo6382f() {
        return this.f5399e;
    }

    @Override // p038c6.AbstractC1366a0.e.d.c
    /* renamed from: g */
    public boolean mo6383g() {
        return this.f5397c;
    }

    public int hashCode() {
        int hashCode;
        int i10;
        Double d10 = this.f5395a;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f5396b) * 1000003;
        if (this.f5397c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (((i11 ^ i10) * 1000003) ^ this.f5398d) * 1000003;
        long j10 = this.f5399e;
        long j11 = this.f5400f;
        return ((i12 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f5395a + ", batteryVelocity=" + this.f5396b + ", proximityOn=" + this.f5397c + ", orientation=" + this.f5398d + ", ramUsed=" + this.f5399e + ", diskUsed=" + this.f5400f + "}";
    }

    private C1386s(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f5395a = d10;
        this.f5396b = i10;
        this.f5397c = z10;
        this.f5398d = i11;
        this.f5399e = j10;
        this.f5400f = j11;
    }
}
