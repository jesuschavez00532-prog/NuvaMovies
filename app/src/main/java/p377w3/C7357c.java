package p377w3;

import p283p6.InterfaceC6222c;

/* renamed from: w3.c */
/* loaded from: classes.dex */
public final class C7357c {

    /* renamed from: c */
    private static final C7357c f27310c = new a().m28403a();

    /* renamed from: a */
    private final long f27311a;

    /* renamed from: b */
    private final b f27312b;

    /* renamed from: w3.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f27313a = 0;

        /* renamed from: b */
        private b f27314b = b.REASON_UNKNOWN;

        a() {
        }

        /* renamed from: a */
        public C7357c m28403a() {
            return new C7357c(this.f27313a, this.f27314b);
        }

        /* renamed from: b */
        public a m28404b(long j10) {
            this.f27313a = j10;
            return this;
        }

        /* renamed from: c */
        public a m28405c(b bVar) {
            this.f27314b = bVar;
            return this;
        }
    }

    /* renamed from: w3.c$b */
    /* loaded from: classes.dex */
    public enum b implements InterfaceC6222c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: a */
        private final int f27323a;

        b(int i10) {
            this.f27323a = i10;
        }

        @Override // p283p6.InterfaceC6222c
        /* renamed from: a */
        public int mo24813a() {
            return this.f27323a;
        }
    }

    C7357c(long j10, b bVar) {
        this.f27311a = j10;
        this.f27312b = bVar;
    }

    /* renamed from: c */
    public static a m28400c() {
        return new a();
    }

    /* renamed from: a */
    public long m28401a() {
        return this.f27311a;
    }

    /* renamed from: b */
    public b m28402b() {
        return this.f27312b;
    }
}
