package ad;

import ne.AbstractC5868k;

/* renamed from: ad.d */
/* loaded from: classes.dex */
public final class C0232d {

    /* renamed from: a */
    public static final C0232d f631a = new C0232d();

    /* renamed from: b */
    private static int f632b = 2;

    /* renamed from: c */
    private static int f633c = 1;

    /* renamed from: d */
    private static boolean f634d;

    /* renamed from: ad.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: b */
        boolean mo823b();

        /* renamed from: c */
        int mo824c();

        /* renamed from: f */
        int mo825f();
    }

    private C0232d() {
    }

    /* renamed from: a */
    public final int m819a() {
        return f632b;
    }

    /* renamed from: b */
    public final int m820b() {
        return f633c;
    }

    /* renamed from: c */
    public final void m821c(a aVar) {
        AbstractC5868k.m23674f(aVar, "config");
        f632b = aVar.mo825f();
        f633c = aVar.mo824c();
        f634d = aVar.mo823b();
    }

    /* renamed from: d */
    public final boolean m822d() {
        return f634d;
    }
}
