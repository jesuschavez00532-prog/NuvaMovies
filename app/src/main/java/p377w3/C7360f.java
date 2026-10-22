package p377w3;

/* renamed from: w3.f */
/* loaded from: classes.dex */
public final class C7360f {

    /* renamed from: c */
    private static final C7360f f27334c = new a().m28421a();

    /* renamed from: a */
    private final long f27335a;

    /* renamed from: b */
    private final long f27336b;

    /* renamed from: w3.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f27337a = 0;

        /* renamed from: b */
        private long f27338b = 0;

        a() {
        }

        /* renamed from: a */
        public C7360f m28421a() {
            return new C7360f(this.f27337a, this.f27338b);
        }

        /* renamed from: b */
        public a m28422b(long j10) {
            this.f27338b = j10;
            return this;
        }

        /* renamed from: c */
        public a m28423c(long j10) {
            this.f27337a = j10;
            return this;
        }
    }

    C7360f(long j10, long j11) {
        this.f27335a = j10;
        this.f27336b = j11;
    }

    /* renamed from: c */
    public static a m28418c() {
        return new a();
    }

    /* renamed from: a */
    public long m28419a() {
        return this.f27336b;
    }

    /* renamed from: b */
    public long m28420b() {
        return this.f27335a;
    }
}
