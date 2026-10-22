package p219l4;

/* renamed from: l4.o */
/* loaded from: classes.dex */
public final class C5394o {

    /* renamed from: b */
    private static C5394o f22023b;

    /* renamed from: c */
    private static final C5397p f22024c = new C5397p(0, false, false, 0, 0);

    /* renamed from: a */
    private C5397p f22025a;

    private C5394o() {
    }

    /* renamed from: b */
    public static synchronized C5394o m21792b() {
        C5394o c5394o;
        synchronized (C5394o.class) {
            if (f22023b == null) {
                f22023b = new C5394o();
            }
            c5394o = f22023b;
        }
        return c5394o;
    }

    /* renamed from: a */
    public C5397p m21793a() {
        return this.f22025a;
    }

    /* renamed from: c */
    public final synchronized void m21794c(C5397p c5397p) {
        if (c5397p == null) {
            this.f22025a = f22024c;
            return;
        }
        C5397p c5397p2 = this.f22025a;
        if (c5397p2 != null && c5397p2.m21801n() >= c5397p.m21801n()) {
            return;
        }
        this.f22025a = c5397p;
    }
}
