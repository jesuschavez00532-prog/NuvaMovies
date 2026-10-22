package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.AbstractC5281t;
import kotlinx.coroutines.internal.AbstractC5283v;
import re.AbstractC6578f;

/* renamed from: kotlinx.coroutines.scheduling.l */
/* loaded from: classes3.dex */
public abstract class AbstractC5299l {

    /* renamed from: a */
    public static final long f21564a;

    /* renamed from: b */
    public static final int f21565b;

    /* renamed from: c */
    public static final int f21566c;

    /* renamed from: d */
    public static final int f21567d;

    /* renamed from: e */
    public static final long f21568e;

    /* renamed from: f */
    public static AbstractC5300m f21569f;

    static {
        long m21259e;
        int m21258d;
        int m25673a;
        int m21258d2;
        int m25677e;
        int m21258d3;
        long m21259e2;
        m21259e = AbstractC5283v.m21259e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f21564a = m21259e;
        m21258d = AbstractC5283v.m21258d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        f21565b = m21258d;
        m25673a = AbstractC6578f.m25673a(AbstractC5281t.m21246a(), 2);
        m21258d2 = AbstractC5283v.m21258d("kotlinx.coroutines.scheduler.core.pool.size", m25673a, 1, 0, 8, null);
        f21566c = m21258d2;
        m25677e = AbstractC6578f.m25677e(AbstractC5281t.m21246a() * 128, m21258d2, 2097150);
        m21258d3 = AbstractC5283v.m21258d("kotlinx.coroutines.scheduler.max.pool.size", m25677e, 0, 2097150, 4, null);
        f21567d = m21258d3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m21259e2 = AbstractC5283v.m21259e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f21568e = timeUnit.toNanos(m21259e2);
        f21569f = C5294g.f21558a;
    }
}
