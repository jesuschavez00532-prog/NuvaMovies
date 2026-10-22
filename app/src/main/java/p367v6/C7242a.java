package p367v6;

import p367v6.AbstractC7245d;
import p367v6.C7244c;

/* renamed from: v6.a */
/* loaded from: classes.dex */
final class C7242a extends AbstractC7245d {

    /* renamed from: b */
    private final String f27049b;

    /* renamed from: c */
    private final C7244c.a f27050c;

    /* renamed from: d */
    private final String f27051d;

    /* renamed from: e */
    private final String f27052e;

    /* renamed from: f */
    private final long f27053f;

    /* renamed from: g */
    private final long f27054g;

    /* renamed from: h */
    private final String f27055h;

    /* renamed from: v6.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7245d.a {

        /* renamed from: a */
        private String f27056a;

        /* renamed from: b */
        private C7244c.a f27057b;

        /* renamed from: c */
        private String f27058c;

        /* renamed from: d */
        private String f27059d;

        /* renamed from: e */
        private Long f27060e;

        /* renamed from: f */
        private Long f27061f;

        /* renamed from: g */
        private String f27062g;

        @Override // p367v6.AbstractC7245d.a
        /* renamed from: a */
        public AbstractC7245d mo28020a() {
            String str = "";
            if (this.f27057b == null) {
                str = " registrationStatus";
            }
            if (this.f27060e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f27061f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C7242a(this.f27056a, this.f27057b, this.f27058c, this.f27059d, this.f27060e.longValue(), this.f27061f.longValue(), this.f27062g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p367v6.AbstractC7245d.a
        /* renamed from: b */
        public AbstractC7245d.a mo28021b(String str) {
            this.f27058c = str;
            return this;
        }

        @Override // p367v6.AbstractC7245d.a
        /* renamed from: c */
        public AbstractC7245d.a mo28022c(long j10) {
            this.f27060e = Long.valueOf(j10);
            return this;
        }

        @Override // p367v6.AbstractC7245d.a
        /* renamed from: d */
        public AbstractC7245d.a mo28023d(String str) {
            this.f27056a = str;
            return this;
        }

        @Override // p367v6.AbstractC7245d.a
        /* renamed from: e */
        public AbstractC7245d.a mo28024e(String str) {
            this.f27062g = str;
            return this;
        }

        @Override // p367v6.AbstractC7245d.a
        /* renamed from: f */
        public AbstractC7245d.a mo28025f(String str) {
            this.f27059d = str;
            return this;
        }

        @Override // p367v6.AbstractC7245d.a
        /* renamed from: g */
        public AbstractC7245d.a mo28026g(C7244c.a aVar) {
            if (aVar != null) {
                this.f27057b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // p367v6.AbstractC7245d.a
        /* renamed from: h */
        public AbstractC7245d.a mo28027h(long j10) {
            this.f27061f = Long.valueOf(j10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC7245d abstractC7245d) {
            this.f27056a = abstractC7245d.mo28014d();
            this.f27057b = abstractC7245d.mo28017g();
            this.f27058c = abstractC7245d.mo28012b();
            this.f27059d = abstractC7245d.mo28016f();
            this.f27060e = Long.valueOf(abstractC7245d.mo28013c());
            this.f27061f = Long.valueOf(abstractC7245d.mo28018h());
            this.f27062g = abstractC7245d.mo28015e();
        }
    }

    @Override // p367v6.AbstractC7245d
    /* renamed from: b */
    public String mo28012b() {
        return this.f27051d;
    }

    @Override // p367v6.AbstractC7245d
    /* renamed from: c */
    public long mo28013c() {
        return this.f27053f;
    }

    @Override // p367v6.AbstractC7245d
    /* renamed from: d */
    public String mo28014d() {
        return this.f27049b;
    }

    @Override // p367v6.AbstractC7245d
    /* renamed from: e */
    public String mo28015e() {
        return this.f27055h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7245d)) {
            return false;
        }
        AbstractC7245d abstractC7245d = (AbstractC7245d) obj;
        String str3 = this.f27049b;
        if (str3 != null ? str3.equals(abstractC7245d.mo28014d()) : abstractC7245d.mo28014d() == null) {
            if (this.f27050c.equals(abstractC7245d.mo28017g()) && ((str = this.f27051d) != null ? str.equals(abstractC7245d.mo28012b()) : abstractC7245d.mo28012b() == null) && ((str2 = this.f27052e) != null ? str2.equals(abstractC7245d.mo28016f()) : abstractC7245d.mo28016f() == null) && this.f27053f == abstractC7245d.mo28013c() && this.f27054g == abstractC7245d.mo28018h()) {
                String str4 = this.f27055h;
                if (str4 == null) {
                    if (abstractC7245d.mo28015e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC7245d.mo28015e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p367v6.AbstractC7245d
    /* renamed from: f */
    public String mo28016f() {
        return this.f27052e;
    }

    @Override // p367v6.AbstractC7245d
    /* renamed from: g */
    public C7244c.a mo28017g() {
        return this.f27050c;
    }

    @Override // p367v6.AbstractC7245d
    /* renamed from: h */
    public long mo28018h() {
        return this.f27054g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f27049b;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f27050c.hashCode()) * 1000003;
        String str2 = this.f27051d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f27052e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        long j10 = this.f27053f;
        int i13 = (i12 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f27054g;
        int i14 = (i13 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f27055h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i14 ^ i10;
    }

    @Override // p367v6.AbstractC7245d
    /* renamed from: n */
    public AbstractC7245d.a mo28019n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f27049b + ", registrationStatus=" + this.f27050c + ", authToken=" + this.f27051d + ", refreshToken=" + this.f27052e + ", expiresInSecs=" + this.f27053f + ", tokenCreationEpochInSecs=" + this.f27054g + ", fisError=" + this.f27055h + "}";
    }

    private C7242a(String str, C7244c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f27049b = str;
        this.f27050c = aVar;
        this.f27051d = str2;
        this.f27052e = str3;
        this.f27053f = j10;
        this.f27054g = j11;
        this.f27055h = str4;
    }
}
