package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.u */
/* loaded from: classes.dex */
final class C1388u extends AbstractC1366a0.e.AbstractC7817e {

    /* renamed from: a */
    private final int f5409a;

    /* renamed from: b */
    private final String f5410b;

    /* renamed from: c */
    private final String f5411c;

    /* renamed from: d */
    private final boolean f5412d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.u$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.AbstractC7817e.a {

        /* renamed from: a */
        private Integer f5413a;

        /* renamed from: b */
        private String f5414b;

        /* renamed from: c */
        private String f5415c;

        /* renamed from: d */
        private Boolean f5416d;

        @Override // p038c6.AbstractC1366a0.e.AbstractC7817e.a
        /* renamed from: a */
        public AbstractC1366a0.e.AbstractC7817e mo6400a() {
            String str = "";
            if (this.f5413a == null) {
                str = " platform";
            }
            if (this.f5414b == null) {
                str = str + " version";
            }
            if (this.f5415c == null) {
                str = str + " buildVersion";
            }
            if (this.f5416d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C1388u(this.f5413a.intValue(), this.f5414b, this.f5415c, this.f5416d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.AbstractC7817e.a
        /* renamed from: b */
        public AbstractC1366a0.e.AbstractC7817e.a mo6401b(String str) {
            if (str != null) {
                this.f5415c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // p038c6.AbstractC1366a0.e.AbstractC7817e.a
        /* renamed from: c */
        public AbstractC1366a0.e.AbstractC7817e.a mo6402c(boolean z10) {
            this.f5416d = Boolean.valueOf(z10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.AbstractC7817e.a
        /* renamed from: d */
        public AbstractC1366a0.e.AbstractC7817e.a mo6403d(int i10) {
            this.f5413a = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.AbstractC7817e.a
        /* renamed from: e */
        public AbstractC1366a0.e.AbstractC7817e.a mo6404e(String str) {
            if (str != null) {
                this.f5414b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // p038c6.AbstractC1366a0.e.AbstractC7817e
    /* renamed from: b */
    public String mo6396b() {
        return this.f5411c;
    }

    @Override // p038c6.AbstractC1366a0.e.AbstractC7817e
    /* renamed from: c */
    public int mo6397c() {
        return this.f5409a;
    }

    @Override // p038c6.AbstractC1366a0.e.AbstractC7817e
    /* renamed from: d */
    public String mo6398d() {
        return this.f5410b;
    }

    @Override // p038c6.AbstractC1366a0.e.AbstractC7817e
    /* renamed from: e */
    public boolean mo6399e() {
        return this.f5412d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.AbstractC7817e)) {
            return false;
        }
        AbstractC1366a0.e.AbstractC7817e abstractC7817e = (AbstractC1366a0.e.AbstractC7817e) obj;
        if (this.f5409a == abstractC7817e.mo6397c() && this.f5410b.equals(abstractC7817e.mo6398d()) && this.f5411c.equals(abstractC7817e.mo6396b()) && this.f5412d == abstractC7817e.mo6399e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = (((((this.f5409a ^ 1000003) * 1000003) ^ this.f5410b.hashCode()) * 1000003) ^ this.f5411c.hashCode()) * 1000003;
        if (this.f5412d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f5409a + ", version=" + this.f5410b + ", buildVersion=" + this.f5411c + ", jailbroken=" + this.f5412d + "}";
    }

    private C1388u(int i10, String str, String str2, boolean z10) {
        this.f5409a = i10;
        this.f5410b = str;
        this.f5411c = str2;
        this.f5412d = z10;
    }
}
