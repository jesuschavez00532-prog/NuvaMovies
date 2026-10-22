package p145g6;

import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007a6.AbstractC0092p;
import p007a6.C0065b0;
import p127f5.C4247j;
import p157h6.C4552d;
import p294q3.AbstractC6336c;
import p294q3.InterfaceC6339f;
import p294q3.InterfaceC6341h;
import p395x5.C7503f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g6.d */
/* loaded from: classes.dex */
public final class C4353d {

    /* renamed from: a */
    private final double f18944a;

    /* renamed from: b */
    private final double f18945b;

    /* renamed from: c */
    private final long f18946c;

    /* renamed from: d */
    private final int f18947d;

    /* renamed from: e */
    private final BlockingQueue f18948e;

    /* renamed from: f */
    private final ThreadPoolExecutor f18949f;

    /* renamed from: g */
    private final InterfaceC6339f f18950g;

    /* renamed from: h */
    private final C0065b0 f18951h;

    /* renamed from: i */
    private int f18952i;

    /* renamed from: j */
    private long f18953j;

    /* renamed from: g6.d$b */
    /* loaded from: classes.dex */
    private final class b implements Runnable {

        /* renamed from: a */
        private final AbstractC0092p f18954a;

        /* renamed from: b */
        private final C4247j f18955b;

        @Override // java.lang.Runnable
        public void run() {
            C4353d.this.m18274m(this.f18954a, this.f18955b);
            C4353d.this.f18951h.m227c();
            double m18268f = C4353d.this.m18268f();
            C7503f.m28716f().m28717b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(m18268f / 1000.0d)) + " s for report: " + this.f18954a.mo224d());
            C4353d.m18275n(m18268f);
        }

        private b(AbstractC0092p abstractC0092p, C4247j c4247j) {
            this.f18954a = abstractC0092p;
            this.f18955b = c4247j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4353d(InterfaceC6339f interfaceC6339f, C4552d c4552d, C0065b0 c0065b0) {
        this(c4552d.f19605f, c4552d.f19606g, c4552d.f19607h * 1000, interfaceC6339f, c0065b0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public double m18268f() {
        return Math.min(3600000.0d, (60000.0d / this.f18944a) * Math.pow(this.f18945b, m18269g()));
    }

    /* renamed from: g */
    private int m18269g() {
        int max;
        if (this.f18953j == 0) {
            this.f18953j = m18273l();
        }
        int m18273l = (int) ((m18273l() - this.f18953j) / this.f18946c);
        if (m18271j()) {
            max = Math.min(100, this.f18952i + m18273l);
        } else {
            max = Math.max(0, this.f18952i - m18273l);
        }
        if (this.f18952i != max) {
            this.f18952i = max;
            this.f18953j = m18273l();
        }
        return max;
    }

    /* renamed from: i */
    private boolean m18270i() {
        if (this.f18948e.size() < this.f18947d) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m18271j() {
        if (this.f18948e.size() == this.f18947d) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ void m18272k(C4247j c4247j, AbstractC0092p abstractC0092p, Exception exc) {
        if (exc != null) {
            c4247j.m17727d(exc);
        } else {
            c4247j.m17728e(abstractC0092p);
        }
    }

    /* renamed from: l */
    private long m18273l() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m18274m(final AbstractC0092p abstractC0092p, final C4247j c4247j) {
        C7503f.m28716f().m28717b("Sending report through Google DataTransport: " + abstractC0092p.mo224d());
        this.f18950g.mo25122b(AbstractC6336c.m25120e(abstractC0092p.mo222b()), new InterfaceC6341h() { // from class: g6.c
            @Override // p294q3.InterfaceC6341h
            /* renamed from: a */
            public final void mo18262a(Exception exc) {
                C4353d.m18272k(C4247j.this, abstractC0092p, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static void m18275n(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C4247j m18276h(AbstractC0092p abstractC0092p, boolean z10) {
        synchronized (this.f18948e) {
            C4247j c4247j = new C4247j();
            if (z10) {
                this.f18951h.m226b();
                if (m18270i()) {
                    C7503f.m28716f().m28717b("Enqueueing report: " + abstractC0092p.mo224d());
                    C7503f.m28716f().m28717b("Queue size: " + this.f18948e.size());
                    this.f18949f.execute(new b(abstractC0092p, c4247j));
                    C7503f.m28716f().m28717b("Closing task for report: " + abstractC0092p.mo224d());
                    c4247j.m17728e(abstractC0092p);
                    return c4247j;
                }
                m18269g();
                C7503f.m28716f().m28717b("Dropping report due to queue being full: " + abstractC0092p.mo224d());
                this.f18951h.m225a();
                c4247j.m17728e(abstractC0092p);
                return c4247j;
            }
            m18274m(abstractC0092p, c4247j);
            return c4247j;
        }
    }

    C4353d(double d10, double d11, long j10, InterfaceC6339f interfaceC6339f, C0065b0 c0065b0) {
        this.f18944a = d10;
        this.f18945b = d11;
        this.f18946c = j10;
        this.f18950g = interfaceC6339f;
        this.f18951h = c0065b0;
        int i10 = (int) d10;
        this.f18947d = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f18948e = arrayBlockingQueue;
        this.f18949f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f18952i = 0;
        this.f18953j = 0L;
    }
}
