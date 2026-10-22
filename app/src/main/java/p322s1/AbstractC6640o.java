package p322s1;

import p184j1.C4976g;

/* renamed from: s1.o */
/* loaded from: classes.dex */
public abstract class AbstractC6640o {

    /* renamed from: a */
    public static final AbstractC6640o f25469a = new a();

    /* renamed from: b */
    public static final AbstractC6640o f25470b = new b();

    /* renamed from: c */
    public static final AbstractC6640o f25471c = new e();

    /* renamed from: d */
    public static final AbstractC6640o f25472d = new c();

    /* renamed from: e */
    public static final AbstractC6640o f25473e;

    /* renamed from: f */
    public static final AbstractC6640o f25474f;

    /* renamed from: g */
    public static final AbstractC6640o f25475g;

    /* renamed from: h */
    public static final C4976g f25476h;

    /* renamed from: i */
    static final boolean f25477i;

    /* renamed from: s1.o$a */
    /* loaded from: classes.dex */
    private static class a extends AbstractC6640o {
        a() {
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: a */
        public g mo25925a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: b */
        public float mo25926b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* renamed from: s1.o$b */
    /* loaded from: classes.dex */
    private static class b extends AbstractC6640o {
        b() {
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: a */
        public g mo25925a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: b */
        public float mo25926b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            int i14 = 1;
            if (Math.max(1, Integer.highestOneBit(ceil)) >= ceil) {
                i14 = 0;
            }
            return 1.0f / (r2 << i14);
        }
    }

    /* renamed from: s1.o$c */
    /* loaded from: classes.dex */
    private static class c extends AbstractC6640o {
        c() {
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: a */
        public g mo25925a(int i10, int i11, int i12, int i13) {
            if (mo25926b(i10, i11, i12, i13) == 1.0f) {
                return g.QUALITY;
            }
            return AbstractC6640o.f25471c.mo25925a(i10, i11, i12, i13);
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: b */
        public float mo25926b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, AbstractC6640o.f25471c.mo25926b(i10, i11, i12, i13));
        }
    }

    /* renamed from: s1.o$d */
    /* loaded from: classes.dex */
    private static class d extends AbstractC6640o {
        d() {
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: a */
        public g mo25925a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: b */
        public float mo25926b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* renamed from: s1.o$e */
    /* loaded from: classes.dex */
    private static class e extends AbstractC6640o {
        e() {
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: a */
        public g mo25925a(int i10, int i11, int i12, int i13) {
            if (AbstractC6640o.f25477i) {
                return g.QUALITY;
            }
            return g.MEMORY;
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: b */
        public float mo25926b(int i10, int i11, int i12, int i13) {
            if (AbstractC6640o.f25477i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* renamed from: s1.o$f */
    /* loaded from: classes.dex */
    private static class f extends AbstractC6640o {
        f() {
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: a */
        public g mo25925a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // p322s1.AbstractC6640o
        /* renamed from: b */
        public float mo25926b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    /* renamed from: s1.o$g */
    /* loaded from: classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f25473e = dVar;
        f25474f = new f();
        f25475g = dVar;
        f25476h = C4976g.m20320f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f25477i = true;
    }

    /* renamed from: a */
    public abstract g mo25925a(int i10, int i11, int i12, int i13);

    /* renamed from: b */
    public abstract float mo25926b(int i10, int i11, int i12, int i13);
}
