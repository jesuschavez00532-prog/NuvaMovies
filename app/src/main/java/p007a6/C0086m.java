package p007a6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import anet.channel.entity.EventType;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p026b6.C1131c;
import p026b6.C1137i;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p128f6.C4270f;
import p157h6.InterfaceC4557i;
import p174i6.C4897a;
import p174i6.C4899c;
import p337t5.C6913d;
import p395x5.C7503f;
import p395x5.InterfaceC7498a;
import p411y5.InterfaceC7674a;
import p426z5.InterfaceC7755a;
import p426z5.InterfaceC7756b;

/* renamed from: a6.m */
/* loaded from: classes.dex */
public class C0086m {

    /* renamed from: a */
    private final Context f275a;

    /* renamed from: b */
    private final C6913d f276b;

    /* renamed from: c */
    private final C0098s f277c;

    /* renamed from: f */
    private C0088n f280f;

    /* renamed from: g */
    private C0088n f281g;

    /* renamed from: h */
    private boolean f282h;

    /* renamed from: i */
    private C0082k f283i;

    /* renamed from: j */
    private final C0104w f284j;

    /* renamed from: k */
    private final C4270f f285k;

    /* renamed from: l */
    public final InterfaceC7756b f286l;

    /* renamed from: m */
    private final InterfaceC7674a f287m;

    /* renamed from: n */
    private final ExecutorService f288n;

    /* renamed from: o */
    private final C0076h f289o;

    /* renamed from: p */
    private final InterfaceC7498a f290p;

    /* renamed from: e */
    private final long f279e = System.currentTimeMillis();

    /* renamed from: d */
    private final C0065b0 f278d = new C0065b0();

    /* renamed from: a6.m$a */
    /* loaded from: classes.dex */
    class a implements Callable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4557i f291a;

        a(InterfaceC4557i interfaceC4557i) {
            this.f291a = interfaceC4557i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC4245i call() {
            return C0086m.this.m362i(this.f291a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.m$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4557i f293a;

        b(InterfaceC4557i interfaceC4557i) {
            this.f293a = interfaceC4557i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0086m.this.m362i(this.f293a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.m$c */
    /* loaded from: classes.dex */
    public class c implements Callable {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean m386d = C0086m.this.f280f.m386d();
                if (!m386d) {
                    C7503f.m28716f().m28725k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(m386d);
            } catch (Exception e10) {
                C7503f.m28716f().m28720e("Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a6.m$d */
    /* loaded from: classes.dex */
    public class d implements Callable {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(C0086m.this.f283i.m341u());
        }
    }

    public C0086m(C6913d c6913d, C0104w c0104w, InterfaceC7498a interfaceC7498a, C0098s c0098s, InterfaceC7756b interfaceC7756b, InterfaceC7674a interfaceC7674a, C4270f c4270f, ExecutorService executorService) {
        this.f276b = c6913d;
        this.f277c = c0098s;
        this.f275a = c6913d.m26867j();
        this.f284j = c0104w;
        this.f290p = interfaceC7498a;
        this.f286l = interfaceC7756b;
        this.f287m = interfaceC7674a;
        this.f288n = executorService;
        this.f285k = c4270f;
        this.f289o = new C0076h(executorService);
    }

    /* renamed from: d */
    private void m361d() {
        try {
            this.f282h = Boolean.TRUE.equals((Boolean) AbstractC0101t0.m453d(this.f289o.m286h(new d())));
        } catch (Exception unused) {
            this.f282h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public AbstractC4245i m362i(InterfaceC4557i interfaceC4557i) {
        m374q();
        try {
            this.f286l.mo28426a(new InterfaceC7755a() { // from class: a6.l
                @Override // p426z5.InterfaceC7755a
                /* renamed from: a */
                public final void mo356a(String str) {
                    C0086m.this.m371n(str);
                }
            });
            if (!interfaceC4557i.mo18974b().f19601b.f19608a) {
                C7503f.m28716f().m28717b("Collection of crash reports disabled in Crashlytics settings.");
                return AbstractC4250l.m17732d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f283i.m327B(interfaceC4557i)) {
                C7503f.m28716f().m28725k("Previous sessions could not be finalized.");
            }
            return this.f283i.m336S(interfaceC4557i.mo18973a());
        } catch (Exception e10) {
            C7503f.m28716f().m28720e("Crashlytics encountered a problem during asynchronous initialization.", e10);
            return AbstractC4250l.m17732d(e10);
        } finally {
            m373p();
        }
    }

    /* renamed from: k */
    private void m363k(InterfaceC4557i interfaceC4557i) {
        Future<?> submit = this.f288n.submit(new b(interfaceC4557i));
        C7503f.m28716f().m28717b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            C7503f.m28716f().m28720e("Crashlytics was interrupted during initialization.", e10);
        } catch (ExecutionException e11) {
            C7503f.m28716f().m28720e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            C7503f.m28716f().m28720e("Crashlytics timed out during initialization.", e12);
        }
    }

    /* renamed from: l */
    public static String m364l() {
        return "18.2.13";
    }

    /* renamed from: m */
    static boolean m365m(String str, boolean z10) {
        if (!z10) {
            C7503f.m28716f().m28723i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    /* renamed from: e */
    public AbstractC4245i m366e() {
        return this.f283i.m339o();
    }

    /* renamed from: f */
    public AbstractC4245i m367f() {
        return this.f283i.m340t();
    }

    /* renamed from: g */
    public boolean m368g() {
        return this.f282h;
    }

    /* renamed from: h */
    boolean m369h() {
        return this.f280f.m385c();
    }

    /* renamed from: j */
    public AbstractC4245i m370j(InterfaceC4557i interfaceC4557i) {
        return AbstractC0101t0.m454e(this.f288n, new a(interfaceC4557i));
    }

    /* renamed from: n */
    public void m371n(String str) {
        this.f283i.m338W(System.currentTimeMillis() - this.f279e, str);
    }

    /* renamed from: o */
    public void m372o(Throwable th) {
        this.f283i.m337V(Thread.currentThread(), th);
    }

    /* renamed from: p */
    void m373p() {
        this.f289o.m286h(new c());
    }

    /* renamed from: q */
    void m374q() {
        this.f289o.m283b();
        this.f280f.m384a();
        C7503f.m28716f().m28723i("Initialization marker file was created.");
    }

    /* renamed from: r */
    public boolean m375r(C0062a c0062a, InterfaceC4557i interfaceC4557i) {
        if (m365m(c0062a.f185b, AbstractC0074g.m261k(this.f275a, "com.crashlytics.RequireBuildId", true))) {
            String c0072f = new C0072f(this.f284j).toString();
            try {
                this.f281g = new C0088n("crash_marker", this.f285k);
                this.f280f = new C0088n("initialization_marker", this.f285k);
                C1137i c1137i = new C1137i(c0072f, this.f285k, this.f289o);
                C1131c c1131c = new C1131c(this.f285k);
                this.f283i = new C0082k(this.f275a, this.f289o, this.f284j, this.f277c, this.f285k, this.f281g, c0062a, c1137i, c1131c, C0091o0.m417g(this.f275a, this.f284j, this.f285k, c0062a, c1131c, c1137i, new C4897a(EventType.AUTH_FAIL, new C4899c(10)), interfaceC4557i, this.f278d), this.f290p, this.f287m);
                boolean m369h = m369h();
                m361d();
                this.f283i.m343z(c0072f, Thread.getDefaultUncaughtExceptionHandler(), interfaceC4557i);
                if (m369h && AbstractC0074g.m253c(this.f275a)) {
                    C7503f.m28716f().m28717b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    m363k(interfaceC4557i);
                    return false;
                }
                C7503f.m28716f().m28717b("Successfully configured exception handler.");
                return true;
            } catch (Exception e10) {
                C7503f.m28716f().m28720e("Crashlytics was not started due to an exception during initialization", e10);
                this.f283i = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }

    /* renamed from: s */
    public AbstractC4245i m376s() {
        return this.f283i.m333P();
    }

    /* renamed from: t */
    public void m377t(Boolean bool) {
        this.f277c.m445g(bool);
    }

    /* renamed from: u */
    public void m378u(String str, String str2) {
        this.f283i.m334Q(str, str2);
    }

    /* renamed from: v */
    public void m379v(String str) {
        this.f283i.m335R(str);
    }
}
