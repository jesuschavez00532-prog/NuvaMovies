package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.internal.AbstractC5281t;
import kotlinx.coroutines.internal.AbstractC5283v;
import re.AbstractC6578f;
import ve.AbstractC7329x;

/* renamed from: kotlinx.coroutines.scheduling.c */
/* loaded from: classes3.dex */
public final class C5290c extends AbstractC5291d {

    /* renamed from: h */
    private static final AbstractC7329x f21545h;

    /* renamed from: i */
    public static final C5290c f21546i;

    static {
        int m25673a;
        int m21258d;
        C5290c c5290c = new C5290c();
        f21546i = c5290c;
        m25673a = AbstractC6578f.m25673a(64, AbstractC5281t.m21246a());
        m21258d = AbstractC5283v.m21258d("kotlinx.coroutines.io.parallelism", m25673a, 0, 0, 12, null);
        f21545h = new ExecutorC5293f(c5290c, m21258d, "Dispatchers.IO", 1);
    }

    private C5290c() {
        super(0, 0, null, 7, null);
    }

    /* renamed from: B */
    public final AbstractC7329x m21328B() {
        return f21545h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // ve.AbstractC7329x
    public String toString() {
        return "Dispatchers.Default";
    }
}
