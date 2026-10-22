package p335t3;

/* renamed from: t3.g */
/* loaded from: classes.dex */
public abstract class AbstractC6899g {

    /* renamed from: t3.g$a */
    /* loaded from: classes.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC6899g m26829a() {
        return new C6894b(a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC6899g m26830d() {
        return new C6894b(a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC6899g m26831e(long j10) {
        return new C6894b(a.OK, j10);
    }

    /* renamed from: f */
    public static AbstractC6899g m26832f() {
        return new C6894b(a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo26821b();

    /* renamed from: c */
    public abstract a mo26822c();
}
