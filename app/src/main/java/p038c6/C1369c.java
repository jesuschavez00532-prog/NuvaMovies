package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.c */
/* loaded from: classes.dex */
final class C1369c extends AbstractC1366a0.a {

    /* renamed from: a */
    private final int f5245a;

    /* renamed from: b */
    private final String f5246b;

    /* renamed from: c */
    private final int f5247c;

    /* renamed from: d */
    private final int f5248d;

    /* renamed from: e */
    private final long f5249e;

    /* renamed from: f */
    private final long f5250f;

    /* renamed from: g */
    private final long f5251g;

    /* renamed from: h */
    private final String f5252h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.a.AbstractC7803a {

        /* renamed from: a */
        private Integer f5253a;

        /* renamed from: b */
        private String f5254b;

        /* renamed from: c */
        private Integer f5255c;

        /* renamed from: d */
        private Integer f5256d;

        /* renamed from: e */
        private Long f5257e;

        /* renamed from: f */
        private Long f5258f;

        /* renamed from: g */
        private Long f5259g;

        /* renamed from: h */
        private String f5260h;

        @Override // p038c6.AbstractC1366a0.a.AbstractC7803a
        /* renamed from: a */
        public AbstractC1366a0.a mo6187a() {
            String str = "";
            if (this.f5253a == null) {
                str = " pid";
            }
            if (this.f5254b == null) {
                str = str + " processName";
            }
            if (this.f5255c == null) {
                str = str + " reasonCode";
            }
            if (this.f5256d == null) {
                str = str + " importance";
            }
            if (this.f5257e == null) {
                str = str + " pss";
            }
            if (this.f5258f == null) {
                str = str + " rss";
            }
            if (this.f5259g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C1369c(this.f5253a.intValue(), this.f5254b, this.f5255c.intValue(), this.f5256d.intValue(), this.f5257e.longValue(), this.f5258f.longValue(), this.f5259g.longValue(), this.f5260h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.a.AbstractC7803a
        /* renamed from: b */
        public AbstractC1366a0.a.AbstractC7803a mo6188b(int i10) {
            this.f5256d = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.a.AbstractC7803a
        /* renamed from: c */
        public AbstractC1366a0.a.AbstractC7803a mo6189c(int i10) {
            this.f5253a = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.a.AbstractC7803a
        /* renamed from: d */
        public AbstractC1366a0.a.AbstractC7803a mo6190d(String str) {
            if (str != null) {
                this.f5254b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // p038c6.AbstractC1366a0.a.AbstractC7803a
        /* renamed from: e */
        public AbstractC1366a0.a.AbstractC7803a mo6191e(long j10) {
            this.f5257e = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.a.AbstractC7803a
        /* renamed from: f */
        public AbstractC1366a0.a.AbstractC7803a mo6192f(int i10) {
            this.f5255c = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.a.AbstractC7803a
        /* renamed from: g */
        public AbstractC1366a0.a.AbstractC7803a mo6193g(long j10) {
            this.f5258f = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.a.AbstractC7803a
        /* renamed from: h */
        public AbstractC1366a0.a.AbstractC7803a mo6194h(long j10) {
            this.f5259g = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.a.AbstractC7803a
        /* renamed from: i */
        public AbstractC1366a0.a.AbstractC7803a mo6195i(String str) {
            this.f5260h = str;
            return this;
        }
    }

    @Override // p038c6.AbstractC1366a0.a
    /* renamed from: b */
    public int mo6179b() {
        return this.f5248d;
    }

    @Override // p038c6.AbstractC1366a0.a
    /* renamed from: c */
    public int mo6180c() {
        return this.f5245a;
    }

    @Override // p038c6.AbstractC1366a0.a
    /* renamed from: d */
    public String mo6181d() {
        return this.f5246b;
    }

    @Override // p038c6.AbstractC1366a0.a
    /* renamed from: e */
    public long mo6182e() {
        return this.f5249e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.a)) {
            return false;
        }
        AbstractC1366a0.a aVar = (AbstractC1366a0.a) obj;
        if (this.f5245a == aVar.mo6180c() && this.f5246b.equals(aVar.mo6181d()) && this.f5247c == aVar.mo6183f() && this.f5248d == aVar.mo6179b() && this.f5249e == aVar.mo6182e() && this.f5250f == aVar.mo6184g() && this.f5251g == aVar.mo6185h()) {
            String str = this.f5252h;
            if (str == null) {
                if (aVar.mo6186i() == null) {
                    return true;
                }
            } else if (str.equals(aVar.mo6186i())) {
                return true;
            }
        }
        return false;
    }

    @Override // p038c6.AbstractC1366a0.a
    /* renamed from: f */
    public int mo6183f() {
        return this.f5247c;
    }

    @Override // p038c6.AbstractC1366a0.a
    /* renamed from: g */
    public long mo6184g() {
        return this.f5250f;
    }

    @Override // p038c6.AbstractC1366a0.a
    /* renamed from: h */
    public long mo6185h() {
        return this.f5251g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f5245a ^ 1000003) * 1000003) ^ this.f5246b.hashCode()) * 1000003) ^ this.f5247c) * 1000003) ^ this.f5248d) * 1000003;
        long j10 = this.f5249e;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f5250f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f5251g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f5252h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i12 ^ hashCode;
    }

    @Override // p038c6.AbstractC1366a0.a
    /* renamed from: i */
    public String mo6186i() {
        return this.f5252h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f5245a + ", processName=" + this.f5246b + ", reasonCode=" + this.f5247c + ", importance=" + this.f5248d + ", pss=" + this.f5249e + ", rss=" + this.f5250f + ", timestamp=" + this.f5251g + ", traceFile=" + this.f5252h + "}";
    }

    private C1369c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2) {
        this.f5245a = i10;
        this.f5246b = str;
        this.f5247c = i11;
        this.f5248d = i12;
        this.f5249e = j10;
        this.f5250f = j11;
        this.f5251g = j12;
        this.f5252h = str2;
    }
}
