package p108e1;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p002a1.InterfaceC0003b;
import p002a1.InterfaceC0004c;
import p123f1.C4209a;
import p348u2.AbstractC7030g;

/* renamed from: e1.d */
/* loaded from: classes.dex */
public final class C4110d implements InterfaceC4107a {

    /* renamed from: a */
    private InterfaceC0004c f18055a;

    /* renamed from: b */
    private long f18056b;

    /* renamed from: c */
    private final ScheduledThreadPoolExecutor f18057c;

    /* renamed from: d */
    private Future f18058d;

    /* renamed from: e */
    private String f18059e;

    /* renamed from: f */
    private long f18060f;

    /* renamed from: e1.d$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC0003b {
        a() {
        }

        @Override // p002a1.InterfaceC0003b
        /* renamed from: a */
        public void mo14a(long j10) {
            if (j10 != C4110d.this.f18056b) {
                C4110d.this.f18056b = j10;
                C4110d.this.f18060f = j10;
                Future future = C4110d.this.f18058d;
                if (future != null) {
                    future.cancel(true);
                }
                C4110d.this.f18058d = null;
                C4110d.this.m17187l();
            }
        }
    }

    public C4110d(InterfaceC0004c interfaceC0004c, long j10) {
        AbstractC5868k.m23674f(interfaceC0004c, "mReporter");
        this.f18055a = interfaceC0004c;
        this.f18056b = j10;
        this.f18057c = AbstractC7030g.m27130d();
        this.f18059e = C4110d.class.getSimpleName();
    }

    /* renamed from: k */
    private final void m17186k() {
        Future future = this.f18058d;
        if (future != null) {
            future.cancel(true);
        }
        this.f18058d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m17187l() {
        this.f18058d = this.f18057c.scheduleAtFixedRate(new AbstractC7030g.f("interval report", new Runnable() { // from class: e1.c
            @Override // java.lang.Runnable
            public final void run() {
                C4110d.m17188m(C4110d.this);
            }
        }, false), this.f18060f, this.f18056b, TimeUnit.MINUTES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m17188m(C4110d c4110d) {
        AbstractC5868k.m23674f(c4110d, "this$0");
        try {
            c4110d.f18055a.mo7a(new a());
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m17189n(C4110d c4110d) {
        AbstractC5868k.m23674f(c4110d, "this$0");
        try {
            InterfaceC0004c.a.m15a(c4110d.f18055a, null, 1, null);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p108e1.InterfaceC4107a
    /* renamed from: a */
    public void mo17176a() {
        this.f18057c.submit(new AbstractC7030g.f("interval report trigger", new Runnable() { // from class: e1.b
            @Override // java.lang.Runnable
            public final void run() {
                C4110d.m17189n(C4110d.this);
            }
        }, false));
    }

    @Override // p108e1.InterfaceC4107a
    /* renamed from: b */
    public void mo17177b() {
        C4209a.f18456a.m17592j(this.f18056b);
        m17186k();
        m17187l();
    }

    public /* synthetic */ C4110d(InterfaceC0004c interfaceC0004c, long j10, int i10, AbstractC5864g abstractC5864g) {
        this(interfaceC0004c, (i10 & 2) != 0 ? 10L : j10);
    }
}
