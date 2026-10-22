package com.google.firebase.installations;

import com.google.firebase.installations.AbstractC2659g;

/* renamed from: com.google.firebase.installations.a */
/* loaded from: classes.dex */
final class C2653a extends AbstractC2659g {

    /* renamed from: a */
    private final String f10148a;

    /* renamed from: b */
    private final long f10149b;

    /* renamed from: c */
    private final long f10150c;

    /* renamed from: com.google.firebase.installations.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC2659g.a {

        /* renamed from: a */
        private String f10151a;

        /* renamed from: b */
        private Long f10152b;

        /* renamed from: c */
        private Long f10153c;

        @Override // com.google.firebase.installations.AbstractC2659g.a
        /* renamed from: a */
        public AbstractC2659g mo10997a() {
            String str = "";
            if (this.f10151a == null) {
                str = " token";
            }
            if (this.f10152b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f10153c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2653a(this.f10151a, this.f10152b.longValue(), this.f10153c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.AbstractC2659g.a
        /* renamed from: b */
        public AbstractC2659g.a mo10998b(String str) {
            if (str != null) {
                this.f10151a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.AbstractC2659g.a
        /* renamed from: c */
        public AbstractC2659g.a mo10999c(long j10) {
            this.f10153c = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC2659g.a
        /* renamed from: d */
        public AbstractC2659g.a mo11000d(long j10) {
            this.f10152b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // com.google.firebase.installations.AbstractC2659g
    /* renamed from: b */
    public String mo10994b() {
        return this.f10148a;
    }

    @Override // com.google.firebase.installations.AbstractC2659g
    /* renamed from: c */
    public long mo10995c() {
        return this.f10150c;
    }

    @Override // com.google.firebase.installations.AbstractC2659g
    /* renamed from: d */
    public long mo10996d() {
        return this.f10149b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2659g)) {
            return false;
        }
        AbstractC2659g abstractC2659g = (AbstractC2659g) obj;
        if (this.f10148a.equals(abstractC2659g.mo10994b()) && this.f10149b == abstractC2659g.mo10996d() && this.f10150c == abstractC2659g.mo10995c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f10148a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f10149b;
        long j11 = this.f10150c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f10148a + ", tokenExpirationTimestamp=" + this.f10149b + ", tokenCreationTimestamp=" + this.f10150c + "}";
    }

    private C2653a(String str, long j10, long j11) {
        this.f10148a = str;
        this.f10149b = j10;
        this.f10150c = j11;
    }
}
