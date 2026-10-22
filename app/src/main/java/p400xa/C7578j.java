package p400xa;

/* renamed from: xa.j */
/* loaded from: classes2.dex */
public final class C7578j {

    /* renamed from: a */
    public static final C7578j f27850a = new C7578j();

    /* renamed from: b */
    private static long f27851b;

    private C7578j() {
    }

    /* renamed from: a */
    public final boolean m29087a() {
        if (System.currentTimeMillis() - f27851b < 1000) {
            return true;
        }
        f27851b = System.currentTimeMillis();
        return false;
    }
}
