package ve;

/* renamed from: ve.r1 */
/* loaded from: classes3.dex */
public final class C7313r1 {

    /* renamed from: b */
    public static final C7313r1 f27225b = new C7313r1();

    /* renamed from: a */
    private static final ThreadLocal f27224a = new ThreadLocal();

    private C7313r1() {
    }

    /* renamed from: a */
    public final AbstractC7309q0 m28293a() {
        ThreadLocal threadLocal = f27224a;
        AbstractC7309q0 abstractC7309q0 = (AbstractC7309q0) threadLocal.get();
        if (abstractC7309q0 == null) {
            AbstractC7309q0 m28298a = AbstractC7318t0.m28298a();
            threadLocal.set(m28298a);
            return m28298a;
        }
        return abstractC7309q0;
    }

    /* renamed from: b */
    public final void m28294b() {
        f27224a.set(null);
    }

    /* renamed from: c */
    public final void m28295c(AbstractC7309q0 abstractC7309q0) {
        f27224a.set(abstractC7309q0);
    }
}
