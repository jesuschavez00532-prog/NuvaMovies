package p123f1;

/* renamed from: f1.h */
/* loaded from: classes.dex */
public final class C4216h {

    /* renamed from: a */
    public static final C4216h f18482a = new C4216h();

    /* renamed from: b */
    private static final String f18483b = "BBVariable";

    /* renamed from: c */
    private static long f18484c;

    private C4216h() {
    }

    /* renamed from: a */
    public final long m17618a() {
        if (f18484c == 0) {
            f18484c = C4217i.f18485a.m17621a();
            long longValue = ((Number) C4213e.f18477b.m17613a().m17610b("server_time", 0L)).longValue();
            if (f18484c < longValue) {
                f18484c = longValue;
            }
        }
        return f18484c;
    }

    /* renamed from: b */
    public final void m17619b(long j10) {
        f18484c = j10;
    }
}
