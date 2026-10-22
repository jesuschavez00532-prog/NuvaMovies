package p380w6;

import com.google.firebase.installations.C2661i;
import java.util.concurrent.TimeUnit;

/* renamed from: w6.e */
/* loaded from: classes.dex */
class C7378e {

    /* renamed from: d */
    private static final long f27376d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f27377e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final C2661i f27378a = C2661i.m11036c();

    /* renamed from: b */
    private long f27379b;

    /* renamed from: c */
    private int f27380c;

    /* renamed from: a */
    private synchronized long m28480a(int i10) {
        if (!m28481c(i10)) {
            return f27376d;
        }
        double pow = Math.pow(2.0d, this.f27380c);
        double m11042e = this.f27378a.m11042e();
        Double.isNaN(m11042e);
        return (long) Math.min(pow + m11042e, f27377e);
    }

    /* renamed from: c */
    private static boolean m28481c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    /* renamed from: d */
    private static boolean m28482d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    /* renamed from: e */
    private synchronized void m28483e() {
        this.f27380c = 0;
    }

    /* renamed from: b */
    public synchronized boolean m28484b() {
        boolean z10;
        if (this.f27380c != 0) {
            if (this.f27378a.m11040a() <= this.f27379b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    /* renamed from: f */
    public synchronized void m28485f(int i10) {
        if (m28482d(i10)) {
            m28483e();
            return;
        }
        this.f27380c++;
        this.f27379b = this.f27378a.m11040a() + m28480a(i10);
    }
}
