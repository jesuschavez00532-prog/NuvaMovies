package p109e2;

import android.os.SystemClock;

/* renamed from: e2.g */
/* loaded from: classes.dex */
public abstract class AbstractC4117g {

    /* renamed from: a */
    private static final double f18078a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: a */
    public static double m17209a(long j10) {
        double m17210b = m17210b() - j10;
        double d10 = f18078a;
        Double.isNaN(m17210b);
        return m17210b * d10;
    }

    /* renamed from: b */
    public static long m17210b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
