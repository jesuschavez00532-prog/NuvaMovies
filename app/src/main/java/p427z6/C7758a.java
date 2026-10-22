package p427z6;

import p283p6.InterfaceC6222c;

/* renamed from: z6.a */
/* loaded from: classes.dex */
public final class C7758a {

    /* renamed from: p */
    private static final C7758a f28539p = new a().m29977a();

    /* renamed from: a */
    private final long f28540a;

    /* renamed from: b */
    private final String f28541b;

    /* renamed from: c */
    private final String f28542c;

    /* renamed from: d */
    private final c f28543d;

    /* renamed from: e */
    private final d f28544e;

    /* renamed from: f */
    private final String f28545f;

    /* renamed from: g */
    private final String f28546g;

    /* renamed from: h */
    private final int f28547h;

    /* renamed from: i */
    private final int f28548i;

    /* renamed from: j */
    private final String f28549j;

    /* renamed from: k */
    private final long f28550k;

    /* renamed from: l */
    private final b f28551l;

    /* renamed from: m */
    private final String f28552m;

    /* renamed from: n */
    private final long f28553n;

    /* renamed from: o */
    private final String f28554o;

    /* renamed from: z6.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f28555a = 0;

        /* renamed from: b */
        private String f28556b = "";

        /* renamed from: c */
        private String f28557c = "";

        /* renamed from: d */
        private c f28558d = c.UNKNOWN;

        /* renamed from: e */
        private d f28559e = d.UNKNOWN_OS;

        /* renamed from: f */
        private String f28560f = "";

        /* renamed from: g */
        private String f28561g = "";

        /* renamed from: h */
        private int f28562h = 0;

        /* renamed from: i */
        private int f28563i = 0;

        /* renamed from: j */
        private String f28564j = "";

        /* renamed from: k */
        private long f28565k = 0;

        /* renamed from: l */
        private b f28566l = b.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f28567m = "";

        /* renamed from: n */
        private long f28568n = 0;

        /* renamed from: o */
        private String f28569o = "";

        a() {
        }

        /* renamed from: a */
        public C7758a m29977a() {
            return new C7758a(this.f28555a, this.f28556b, this.f28557c, this.f28558d, this.f28559e, this.f28560f, this.f28561g, this.f28562h, this.f28563i, this.f28564j, this.f28565k, this.f28566l, this.f28567m, this.f28568n, this.f28569o);
        }

        /* renamed from: b */
        public a m29978b(String str) {
            this.f28567m = str;
            return this;
        }

        /* renamed from: c */
        public a m29979c(String str) {
            this.f28561g = str;
            return this;
        }

        /* renamed from: d */
        public a m29980d(String str) {
            this.f28569o = str;
            return this;
        }

        /* renamed from: e */
        public a m29981e(b bVar) {
            this.f28566l = bVar;
            return this;
        }

        /* renamed from: f */
        public a m29982f(String str) {
            this.f28557c = str;
            return this;
        }

        /* renamed from: g */
        public a m29983g(String str) {
            this.f28556b = str;
            return this;
        }

        /* renamed from: h */
        public a m29984h(c cVar) {
            this.f28558d = cVar;
            return this;
        }

        /* renamed from: i */
        public a m29985i(String str) {
            this.f28560f = str;
            return this;
        }

        /* renamed from: j */
        public a m29986j(long j10) {
            this.f28555a = j10;
            return this;
        }

        /* renamed from: k */
        public a m29987k(d dVar) {
            this.f28559e = dVar;
            return this;
        }

        /* renamed from: l */
        public a m29988l(String str) {
            this.f28564j = str;
            return this;
        }

        /* renamed from: m */
        public a m29989m(int i10) {
            this.f28563i = i10;
            return this;
        }
    }

    /* renamed from: z6.a$b */
    /* loaded from: classes.dex */
    public enum b implements InterfaceC6222c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: a */
        private final int f28574a;

        b(int i10) {
            this.f28574a = i10;
        }

        @Override // p283p6.InterfaceC6222c
        /* renamed from: a */
        public int mo24813a() {
            return this.f28574a;
        }
    }

    /* renamed from: z6.a$c */
    /* loaded from: classes.dex */
    public enum c implements InterfaceC6222c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a */
        private final int f28580a;

        c(int i10) {
            this.f28580a = i10;
        }

        @Override // p283p6.InterfaceC6222c
        /* renamed from: a */
        public int mo24813a() {
            return this.f28580a;
        }
    }

    /* renamed from: z6.a$d */
    /* loaded from: classes.dex */
    public enum d implements InterfaceC6222c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: a */
        private final int f28586a;

        d(int i10) {
            this.f28586a = i10;
        }

        @Override // p283p6.InterfaceC6222c
        /* renamed from: a */
        public int mo24813a() {
            return this.f28586a;
        }
    }

    C7758a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f28540a = j10;
        this.f28541b = str;
        this.f28542c = str2;
        this.f28543d = cVar;
        this.f28544e = dVar;
        this.f28545f = str3;
        this.f28546g = str4;
        this.f28547h = i10;
        this.f28548i = i11;
        this.f28549j = str5;
        this.f28550k = j11;
        this.f28551l = bVar;
        this.f28552m = str6;
        this.f28553n = j12;
        this.f28554o = str7;
    }

    /* renamed from: p */
    public static a m29961p() {
        return new a();
    }

    /* renamed from: a */
    public String m29962a() {
        return this.f28552m;
    }

    /* renamed from: b */
    public long m29963b() {
        return this.f28550k;
    }

    /* renamed from: c */
    public long m29964c() {
        return this.f28553n;
    }

    /* renamed from: d */
    public String m29965d() {
        return this.f28546g;
    }

    /* renamed from: e */
    public String m29966e() {
        return this.f28554o;
    }

    /* renamed from: f */
    public b m29967f() {
        return this.f28551l;
    }

    /* renamed from: g */
    public String m29968g() {
        return this.f28542c;
    }

    /* renamed from: h */
    public String m29969h() {
        return this.f28541b;
    }

    /* renamed from: i */
    public c m29970i() {
        return this.f28543d;
    }

    /* renamed from: j */
    public String m29971j() {
        return this.f28545f;
    }

    /* renamed from: k */
    public int m29972k() {
        return this.f28547h;
    }

    /* renamed from: l */
    public long m29973l() {
        return this.f28540a;
    }

    /* renamed from: m */
    public d m29974m() {
        return this.f28544e;
    }

    /* renamed from: n */
    public String m29975n() {
        return this.f28549j;
    }

    /* renamed from: o */
    public int m29976o() {
        return this.f28548i;
    }
}
