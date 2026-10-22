package ve;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import re.AbstractC6578f;

/* renamed from: ve.f0 */
/* loaded from: classes3.dex */
public final class RunnableC7276f0 extends AbstractC7312r0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: g */
    private static final long f27164g;

    /* renamed from: h */
    public static final RunnableC7276f0 f27165h;

    static {
        Long l10;
        RunnableC7276f0 runnableC7276f0 = new RunnableC7276f0();
        f27165h = runnableC7276f0;
        AbstractC7309q0.m28264E(runnableC7276f0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f27164g = timeUnit.toNanos(l10.longValue());
    }

    private RunnableC7276f0() {
    }

    /* renamed from: Z */
    private final synchronized void m28130Z() {
        if (!m28132b0()) {
            return;
        }
        debugStatus = 3;
        m28288U();
        notifyAll();
    }

    /* renamed from: a0 */
    private final synchronized Thread m28131a0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: b0 */
    private final boolean m28132b0() {
        int i10 = debugStatus;
        if (i10 != 2 && i10 != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: c0 */
    private final synchronized boolean m28133c0() {
        if (m28132b0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // ve.AbstractC7315s0
    /* renamed from: I */
    protected Thread mo28108I() {
        Thread thread = _thread;
        if (thread == null) {
            return m28131a0();
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m28286R;
        C7313r1.f27225b.m28295c(this);
        AbstractC7319t1.m28299a();
        try {
            if (!m28133c0()) {
                if (!m28286R) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long m28287S = m28287S();
                if (m28287S == Long.MAX_VALUE) {
                    AbstractC7319t1.m28299a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f27164g + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 > 0) {
                        m28287S = AbstractC6578f.m25676d(m28287S, j11);
                    } else {
                        _thread = null;
                        m28130Z();
                        AbstractC7319t1.m28299a();
                        if (!m28286R()) {
                            mo28108I();
                            return;
                        }
                        return;
                    }
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (m28287S > 0) {
                    if (m28132b0()) {
                        _thread = null;
                        m28130Z();
                        AbstractC7319t1.m28299a();
                        if (!m28286R()) {
                            mo28108I();
                            return;
                        }
                        return;
                    }
                    AbstractC7319t1.m28299a();
                    LockSupport.parkNanos(this, m28287S);
                }
            }
        } finally {
            _thread = null;
            m28130Z();
            AbstractC7319t1.m28299a();
            if (!m28286R()) {
                mo28108I();
            }
        }
    }
}
