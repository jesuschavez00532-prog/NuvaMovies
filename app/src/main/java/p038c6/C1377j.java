package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.j */
/* loaded from: classes.dex */
final class C1377j extends AbstractC1366a0.e.c {

    /* renamed from: a */
    private final int f5307a;

    /* renamed from: b */
    private final String f5308b;

    /* renamed from: c */
    private final int f5309c;

    /* renamed from: d */
    private final long f5310d;

    /* renamed from: e */
    private final long f5311e;

    /* renamed from: f */
    private final boolean f5312f;

    /* renamed from: g */
    private final int f5313g;

    /* renamed from: h */
    private final String f5314h;

    /* renamed from: i */
    private final String f5315i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.j$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.c.a {

        /* renamed from: a */
        private Integer f5316a;

        /* renamed from: b */
        private String f5317b;

        /* renamed from: c */
        private Integer f5318c;

        /* renamed from: d */
        private Long f5319d;

        /* renamed from: e */
        private Long f5320e;

        /* renamed from: f */
        private Boolean f5321f;

        /* renamed from: g */
        private Integer f5322g;

        /* renamed from: h */
        private String f5323h;

        /* renamed from: i */
        private String f5324i;

        @Override // p038c6.AbstractC1366a0.e.c.a
        /* renamed from: a */
        public AbstractC1366a0.e.c mo6277a() {
            String str = "";
            if (this.f5316a == null) {
                str = " arch";
            }
            if (this.f5317b == null) {
                str = str + " model";
            }
            if (this.f5318c == null) {
                str = str + " cores";
            }
            if (this.f5319d == null) {
                str = str + " ram";
            }
            if (this.f5320e == null) {
                str = str + " diskSpace";
            }
            if (this.f5321f == null) {
                str = str + " simulator";
            }
            if (this.f5322g == null) {
                str = str + " state";
            }
            if (this.f5323h == null) {
                str = str + " manufacturer";
            }
            if (this.f5324i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C1377j(this.f5316a.intValue(), this.f5317b, this.f5318c.intValue(), this.f5319d.longValue(), this.f5320e.longValue(), this.f5321f.booleanValue(), this.f5322g.intValue(), this.f5323h, this.f5324i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.c.a
        /* renamed from: b */
        public AbstractC1366a0.e.c.a mo6278b(int i10) {
            this.f5316a = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.c.a
        /* renamed from: c */
        public AbstractC1366a0.e.c.a mo6279c(int i10) {
            this.f5318c = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.c.a
        /* renamed from: d */
        public AbstractC1366a0.e.c.a mo6280d(long j10) {
            this.f5320e = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.c.a
        /* renamed from: e */
        public AbstractC1366a0.e.c.a mo6281e(String str) {
            if (str != null) {
                this.f5323h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // p038c6.AbstractC1366a0.e.c.a
        /* renamed from: f */
        public AbstractC1366a0.e.c.a mo6282f(String str) {
            if (str != null) {
                this.f5317b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // p038c6.AbstractC1366a0.e.c.a
        /* renamed from: g */
        public AbstractC1366a0.e.c.a mo6283g(String str) {
            if (str != null) {
                this.f5324i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // p038c6.AbstractC1366a0.e.c.a
        /* renamed from: h */
        public AbstractC1366a0.e.c.a mo6284h(long j10) {
            this.f5319d = Long.valueOf(j10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.c.a
        /* renamed from: i */
        public AbstractC1366a0.e.c.a mo6285i(boolean z10) {
            this.f5321f = Boolean.valueOf(z10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.c.a
        /* renamed from: j */
        public AbstractC1366a0.e.c.a mo6286j(int i10) {
            this.f5322g = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // p038c6.AbstractC1366a0.e.c
    /* renamed from: b */
    public int mo6268b() {
        return this.f5307a;
    }

    @Override // p038c6.AbstractC1366a0.e.c
    /* renamed from: c */
    public int mo6269c() {
        return this.f5309c;
    }

    @Override // p038c6.AbstractC1366a0.e.c
    /* renamed from: d */
    public long mo6270d() {
        return this.f5311e;
    }

    @Override // p038c6.AbstractC1366a0.e.c
    /* renamed from: e */
    public String mo6271e() {
        return this.f5314h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.c)) {
            return false;
        }
        AbstractC1366a0.e.c cVar = (AbstractC1366a0.e.c) obj;
        if (this.f5307a == cVar.mo6268b() && this.f5308b.equals(cVar.mo6272f()) && this.f5309c == cVar.mo6269c() && this.f5310d == cVar.mo6274h() && this.f5311e == cVar.mo6270d() && this.f5312f == cVar.mo6276j() && this.f5313g == cVar.mo6275i() && this.f5314h.equals(cVar.mo6271e()) && this.f5315i.equals(cVar.mo6273g())) {
            return true;
        }
        return false;
    }

    @Override // p038c6.AbstractC1366a0.e.c
    /* renamed from: f */
    public String mo6272f() {
        return this.f5308b;
    }

    @Override // p038c6.AbstractC1366a0.e.c
    /* renamed from: g */
    public String mo6273g() {
        return this.f5315i;
    }

    @Override // p038c6.AbstractC1366a0.e.c
    /* renamed from: h */
    public long mo6274h() {
        return this.f5310d;
    }

    public int hashCode() {
        int i10;
        int hashCode = (((((this.f5307a ^ 1000003) * 1000003) ^ this.f5308b.hashCode()) * 1000003) ^ this.f5309c) * 1000003;
        long j10 = this.f5310d;
        int i11 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f5311e;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f5312f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((i12 ^ i10) * 1000003) ^ this.f5313g) * 1000003) ^ this.f5314h.hashCode()) * 1000003) ^ this.f5315i.hashCode();
    }

    @Override // p038c6.AbstractC1366a0.e.c
    /* renamed from: i */
    public int mo6275i() {
        return this.f5313g;
    }

    @Override // p038c6.AbstractC1366a0.e.c
    /* renamed from: j */
    public boolean mo6276j() {
        return this.f5312f;
    }

    public String toString() {
        return "Device{arch=" + this.f5307a + ", model=" + this.f5308b + ", cores=" + this.f5309c + ", ram=" + this.f5310d + ", diskSpace=" + this.f5311e + ", simulator=" + this.f5312f + ", state=" + this.f5313g + ", manufacturer=" + this.f5314h + ", modelClass=" + this.f5315i + "}";
    }

    private C1377j(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f5307a = i10;
        this.f5308b = str;
        this.f5309c = i11;
        this.f5310d = j10;
        this.f5311e = j11;
        this.f5312f = z10;
        this.f5313g = i12;
        this.f5314h = str2;
        this.f5315i = str3;
    }
}
