package p024b4;

import p024b4.AbstractC1057e;

/* renamed from: b4.a */
/* loaded from: classes.dex */
final class C1049a extends AbstractC1057e {

    /* renamed from: b */
    private final long f4319b;

    /* renamed from: c */
    private final int f4320c;

    /* renamed from: d */
    private final int f4321d;

    /* renamed from: e */
    private final long f4322e;

    /* renamed from: f */
    private final int f4323f;

    /* renamed from: b4.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC1057e.a {

        /* renamed from: a */
        private Long f4324a;

        /* renamed from: b */
        private Integer f4325b;

        /* renamed from: c */
        private Integer f4326c;

        /* renamed from: d */
        private Long f4327d;

        /* renamed from: e */
        private Integer f4328e;

        @Override // p024b4.AbstractC1057e.a
        /* renamed from: a */
        AbstractC1057e mo4907a() {
            String str = "";
            if (this.f4324a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f4325b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f4326c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f4327d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f4328e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C1049a(this.f4324a.longValue(), this.f4325b.intValue(), this.f4326c.intValue(), this.f4327d.longValue(), this.f4328e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p024b4.AbstractC1057e.a
        /* renamed from: b */
        AbstractC1057e.a mo4908b(int i10) {
            this.f4326c = Integer.valueOf(i10);
            return this;
        }

        @Override // p024b4.AbstractC1057e.a
        /* renamed from: c */
        AbstractC1057e.a mo4909c(long j10) {
            this.f4327d = Long.valueOf(j10);
            return this;
        }

        @Override // p024b4.AbstractC1057e.a
        /* renamed from: d */
        AbstractC1057e.a mo4910d(int i10) {
            this.f4325b = Integer.valueOf(i10);
            return this;
        }

        @Override // p024b4.AbstractC1057e.a
        /* renamed from: e */
        AbstractC1057e.a mo4911e(int i10) {
            this.f4328e = Integer.valueOf(i10);
            return this;
        }

        @Override // p024b4.AbstractC1057e.a
        /* renamed from: f */
        AbstractC1057e.a mo4912f(long j10) {
            this.f4324a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p024b4.AbstractC1057e
    /* renamed from: b */
    int mo4902b() {
        return this.f4321d;
    }

    @Override // p024b4.AbstractC1057e
    /* renamed from: c */
    long mo4903c() {
        return this.f4322e;
    }

    @Override // p024b4.AbstractC1057e
    /* renamed from: d */
    int mo4904d() {
        return this.f4320c;
    }

    @Override // p024b4.AbstractC1057e
    /* renamed from: e */
    int mo4905e() {
        return this.f4323f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1057e)) {
            return false;
        }
        AbstractC1057e abstractC1057e = (AbstractC1057e) obj;
        if (this.f4319b == abstractC1057e.mo4906f() && this.f4320c == abstractC1057e.mo4904d() && this.f4321d == abstractC1057e.mo4902b() && this.f4322e == abstractC1057e.mo4903c() && this.f4323f == abstractC1057e.mo4905e()) {
            return true;
        }
        return false;
    }

    @Override // p024b4.AbstractC1057e
    /* renamed from: f */
    long mo4906f() {
        return this.f4319b;
    }

    public int hashCode() {
        long j10 = this.f4319b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f4320c) * 1000003) ^ this.f4321d) * 1000003;
        long j11 = this.f4322e;
        return this.f4323f ^ ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f4319b + ", loadBatchSize=" + this.f4320c + ", criticalSectionEnterTimeoutMs=" + this.f4321d + ", eventCleanUpAge=" + this.f4322e + ", maxBlobByteSizePerRow=" + this.f4323f + "}";
    }

    private C1049a(long j10, int i10, int i11, long j11, int i12) {
        this.f4319b = j10;
        this.f4320c = i10;
        this.f4321d = i11;
        this.f4322e = j11;
        this.f4323f = i12;
    }
}
